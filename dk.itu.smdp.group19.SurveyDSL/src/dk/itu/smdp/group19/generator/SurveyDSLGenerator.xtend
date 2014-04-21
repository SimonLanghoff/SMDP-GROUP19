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

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyDSLGenerator implements IGenerator {
	def static compileToXml(Survey it) {
		'''
			<Survey name="«it.title»">
				<pages>
					«FOR page : pages»
						<«page.eClass.name» name="«page.title»" description="«page.text»">
						«IF page.eClass.name == QuestionPage.simpleName» 
							«val questionPage = page as QuestionPage»
							«FOR question : questionPage.questions»
							<«question.eClass.name» name="«question.text»"/>
								«IF question.eClass.name == SingleChoiceQuestion.simpleName»
									«val singleQuestion = question as SingleChoiceQuestion»
									
									«FOR answer : singleQuestion.answers»
										<«answer.eClass.name» name="«answer.name»" text="«answer.text»"/>
									«ENDFOR»
								«ENDIF»
								«IF question.eClass.name == MultiChoiceQuestion.simpleName»
									«val multiQuestion = question as MultiChoiceQuestion»
									«FOR answer : multiQuestion.answers»
										<«answer.eClass.name» name="«answer.name»" text="«answer.text»"/>
									«ENDFOR»
									
								«ENDIF»
								«IF question.eClass.name == FreetextQuestion.simpleName»
									«val freeQuestion = question as FreetextQuestion»
									<«freeQuestion.answers.eClass.name» name="«freeQuestion.answers.name»" text="«freeQuestion.answers.text»"/>
								«ENDIF»
							«ENDFOR» 
						«ENDIF»
						</«page.eClass.name»>
					«ENDFOR»
				</pages>
			</Survey>
		'''
	}
	
	def static compileToTex(Survey it) {
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
				
				«IF page.eClass.name == QuestionPage.simpleName» 
					«val questionPage = page as QuestionPage»
					«FOR question : questionPage.questions»
					«question.text»
						«IF question.eClass.name == SingleChoiceQuestion.simpleName»
							(select one)
							\begin{itemize}
							«val singleQuestion = question as SingleChoiceQuestion»
							«FOR answer : singleQuestion.answers»
								\item[$\bigcirc$] «answer.text»
								«IF answer.eClass.name == FreetextAnswer.simpleName»
									\\
									\fbox{
										\begin{minipage}{5in}
											\hfill \vspace{1in}
										\end{minipage}
									}
								«ENDIF»
							«ENDFOR»
							\end{itemize}
							
						«ENDIF»
						«IF question.eClass.name == MultiChoiceQuestion.simpleName»
							(select one or several)
							\begin{itemize}
							«val multiQuestion = question as MultiChoiceQuestion»
							«FOR answer : multiQuestion.answers»
								\item[$\bigcirc$] «answer.text»
							«ENDFOR»
							\end{itemize}
							
						«ENDIF»
						«IF question.eClass.name == FreetextQuestion.simpleName»
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
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(Survey)) {
			fsa.generateFile("surveys/" + e.title.toString() + ".xml", e.compileToXml)
			fsa.generateFile("surveys/" + e.title.toString() + ".tex", e.compileToTex)
		}
	}
}
