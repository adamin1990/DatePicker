package com.lt.adamin.datepicker.month;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.lt.adamin.datepicker.R;


/*
 * Created by Alireza Afkar - 24/10/14
 */

@SuppressLint("ValidFragment")
public class MonthFragement extends Fragment {
	int month;

	public MonthFragement(int month) {
		this.month = month;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		return inflater.inflate(R.layout.days_layout, null);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		GridView gridView = (GridView) view.findViewById(R.id.grid_view);
		gridView.setSelector(getResources().getDrawable(R.drawable.transparent));
		gridView.setAdapter(new MonthAdapter(getActivity(), month));
		super.onViewCreated(view, savedInstanceState);
	}
}