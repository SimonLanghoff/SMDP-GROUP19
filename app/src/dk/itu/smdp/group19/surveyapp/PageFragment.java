package dk.itu.smdp.group19.surveyapp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class PageFragment extends Fragment {
	LinearLayout layout;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false);
    }
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		LinearLayout ll = (LinearLayout) getActivity().findViewById(R.id.pageFragmentRoot);
		if(ll != null) {
			ll.addView(layout);
		}
	}
	
	public PageFragment() {
		
	}
	
	public void setLayout(LinearLayout layout) {
		this.layout = layout;
	}
	
	public LinearLayout getLayout() {
		return layout;
	}
}
