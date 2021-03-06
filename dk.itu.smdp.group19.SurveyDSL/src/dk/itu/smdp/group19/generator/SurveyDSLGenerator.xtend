/*
 * generated by Xtext
 */
package dk.itu.smdp.group19.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import surveymodel.Survey
import surveymodel.Page
import surveymodel.Question
import surveymodel.DescriptionPage
import surveymodel.QuestionPage
import surveymodel.SingleChoiceQuestion
import surveymodel.MultiChoiceQuestion
import surveymodel.FreetextQuestion
import surveymodel.impl.QuestionPageImpl
import surveymodel.FreetextAnswer
import surveymodel.Dependency
import surveymodel.Not
import surveymodel.And
import surveymodel.Or
import surveymodel.AnswerRef
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.TreeIterator
import java.util.ArrayList
import surveymodel.Answer
import java.util.List
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyDSLGenerator implements IGenerator {
	def static compileToXml(Survey it) {
		'''
			<Survey name="«title»">
				<pages>
					«FOR page : pages»
						<«page.eClass.name» name="«page.title»" text="«page.text»">
						«IF page instanceof QuestionPage» 
							«val questionPage = page as QuestionPage»
							«FOR question : questionPage.questions»
								<«question.eClass.name» name="«question.text»" optional="«question.optional»">
								«IF question instanceof SingleChoiceQuestion»
									«val singleQuestion = question as SingleChoiceQuestion»
									«FOR answer : singleQuestion.answers»
										<«answer.eClass.name» name="«answer.name»" text="«answer.text»"/>
									«ENDFOR»
								«ELSEIF question instanceof MultiChoiceQuestion»
									«val multiQuestion = question as MultiChoiceQuestion»
									«FOR answer : multiQuestion.answers»
										<«answer.eClass.name» name="«answer.name»" text="«answer.text»"/>
									«ENDFOR»
								«ELSEIF question instanceof FreetextQuestion»
									«val freeQuestion = question as FreetextQuestion»
									<«freeQuestion.answers.eClass.name» name="«freeQuestion.answers.name»" text="«freeQuestion.answers.text»"/>
								«ENDIF»
								
								«IF question.requires != null»
									<Requires>
									«compileDependencyToXml(question.requires)»
									</Requires>
								«ENDIF»
								</«question.eClass.name»>
							«ENDFOR»
						«ENDIF»
						</«page.eClass.name»>
					«ENDFOR»
				</pages>
			</Survey>
		'''
	}
	
	def static String compileDependencyToXml(Dependency it) {
		if (it == null)
			return ""
		
		'''
			«IF it instanceof Not»
				«val not = it as Not»
				<Not>
				«compileDependencyToXml(not.dependency)»
				</Not>
			«ELSEIF it instanceof And»
				«val and = it as And»
				<And>
				«compileDependencyToXml(and.lhs)»
				«compileDependencyToXml(and.rhs)»
				</And>
			«ELSEIF it instanceof Or»
				«val or = it as Or»
				<Or>
				«compileDependencyToXml(or.lhs)»
				«compileDependencyToXml(or.rhs)»
				</Or>
			«ELSEIF it instanceof AnswerRef»
				«val ref = it as AnswerRef»
				<AnswerRef name="«ref.refers.name»" />
			«ENDIF»
		'''
	}
	
	def static compileToTex(Survey it) {
		// collect all questions in the survey, for use later
		val qList = new ArrayList<Question>()
		for(p : pages) {
			if (p instanceof QuestionPage) {
				val qp = p as QuestionPage
				for(q : qp.questions) {
					qList.add(q);
				}
			}
		}
		
		'''
			\documentclass[a4paper,final]{article}
			
			\usepackage{a4wide}
			\usepackage[english]{babel}
			\usepackage[utf8]{inputenc}
			\usepackage[T1]{fontenc}
			\usepackage{newtxtext,newtxmath}
			\usepackage{fancyhdr}
			
			\parindent = 0pt
			\setlength{\headheight}{15pt}
			\pagestyle{fancy}
			\chead{«it.title»}
			
			\begin{document}
			
			«FOR page : pages»
				\newpage
				\section*{«page.title»}
				«page.text»
				
				\vspace{15pt}
				
				«IF page instanceof QuestionPage»
					«val questionPage = page as QuestionPage»
					«FOR question : questionPage.questions»
						«question.text»
						«IF question.optional»
							(optional)
						«ENDIF»
						«IF question.requires != null»
							(to answer this question, you must have answered «question.requires.compileDependencyToTex(qList)»)
						«ENDIF»
							«IF question instanceof SingleChoiceQuestion»
							(select one)
							\begin{itemize}
							«val singleQuestion = question as SingleChoiceQuestion»
							«FOR answer : singleQuestion.answers»
								\item[$\bigcirc$] «answer.text»
								«IF answer instanceof FreetextAnswer»
									\\
									\fbox{
										\begin{minipage}{5in}
											\hfill \vspace{1in}
										\end{minipage}
									}
								«ENDIF»
							«ENDFOR»
							\end{itemize}
							
						«ELSEIF question instanceof MultiChoiceQuestion»
							(select all that apply)
							\begin{itemize}
							«val multiQuestion = question as MultiChoiceQuestion»
							«FOR answer : multiQuestion.answers»
								\item[$\bigcirc$] «answer.text»
								«IF answer instanceof FreetextAnswer»
									\\
									\fbox{
										\begin{minipage}{5in}
											\hfill \vspace{1in}
										\end{minipage}
									}
								«ENDIF»
							«ENDFOR»
							\end{itemize}
							
						«ELSEIF question instanceof FreetextQuestion»
							«val freeQuestion = question as FreetextQuestion»
							\begin{itemize}
							\item[$\bigcirc$] «freeQuestion.answers.text»\\
							\fbox{
								\begin{minipage}{5in}
									\hfill \vspace{3in}
								\end{minipage}
							}
							\end{itemize}
							
						«ENDIF»
						\vspace{15pt}
						
					«ENDFOR»
				«ENDIF»
			«ENDFOR»
			
			\end{document}
		'''
	}
	
	def static String compileDependencyToTex(Dependency it, List<Question> questions) {
		if (it == null)
			return ""
		
		'''
			«IF it instanceof Not»
				«val not = it as Not»
				not «not.dependency.compileDependencyToTex(questions)»
			«ELSEIF it instanceof And»
				«val and = it as And»
				«and.lhs.compileDependencyToTex(questions)» and «and.rhs.compileDependencyToTex(questions)»
			«ELSEIF it instanceof Or»
				«val or = it as Or»
				«or.lhs.compileDependencyToTex(questions)» or «or.rhs.compileDependencyToTex(questions)»
			«ELSEIF it instanceof AnswerRef»
				«val ref = it as AnswerRef»
				«ref.refers.text» in question ``«getContainingQuestion(ref.refers, questions).text»''
			«ENDIF»
		'''
	}
	
	def static getContainingQuestion(Answer it, List<Question> questions) {
		for(q : questions) {
			if(q instanceof SingleChoiceQuestion) {
				val sq = q as SingleChoiceQuestion
				if (sq.answers.contains(it)) {
					return sq
				}
			}
			else if(q instanceof MultiChoiceQuestion) {
				val mq = q as MultiChoiceQuestion
				if (mq.answers.contains(it)) {
					return mq
				}
			}
			else {
				val fq = q as FreetextQuestion
				if (fq.answers == it) {
					return fq
				}
			}
		}
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(Survey)) {
			fsa.generateFile("surveys/" + e.title.toString() + ".xml", e.compileToXml)
			
			val texFile = "surveys/" + e.title.toString + ".tex"
			fsa.generateFile(texFile, e.compileToTex)
			Runtime.runtime.exec("pdflatex " + texFile) // TODO: maybe this is not the correct path in relation to pdftex
		}
	}
}
