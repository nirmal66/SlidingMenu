package com.example.allslidingmenu;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends SlidingFragmentActivity {

	private SlidingUpPanelLayout mLayout;
	TextView first, second,firstLeft,secondLeft,firstRight,secondRight;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setBehindContentView(R.layout.left);

		// Declaring Left and right SlidingMenu
		final SlidingMenu slidingMenu = getSlidingMenu();
		slidingMenu.setSecondaryMenu(R.layout.right);
		slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
		int height = (int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 100, getResources()
						.getDisplayMetrics());
		slidingMenu.setBehindOffset(height);

		// For perfect SlidingUpLayout
		mLayout = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
		mLayout.setOverlayed(true);

		// You can write your own code here.
		first = (TextView) findViewById(R.id.first_tv);
		second = (TextView) findViewById(R.id.second_tv);
		firstLeft= (TextView) findViewById(R.id.first_tv_left);
		secondLeft= (TextView) findViewById(R.id.second_tv_left);
		firstRight= (TextView) findViewById(R.id.first_tv_right);
		secondRight= (TextView) findViewById(R.id.second_tv_right);

		first.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "first",
						Toast.LENGTH_LONG).show();
			}
		});

		second.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "second",
						Toast.LENGTH_LONG).show();
			}
		});
		
		firstLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "firstLeft",
						Toast.LENGTH_LONG).show();
			}
		});

		secondLeft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "secondLeft",
						Toast.LENGTH_LONG).show();
			}
		});
		
		firstRight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "firstRight",
						Toast.LENGTH_LONG).show();
			}
		});

		secondRight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "secondRight",
						Toast.LENGTH_LONG).show();
			}
		});
	}
}
