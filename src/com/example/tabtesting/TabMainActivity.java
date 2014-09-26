package com.example.tabtesting;

import android.annotation.TargetApi;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;



@SuppressWarnings("deprecation")
public class TabMainActivity extends TabActivity implements OnTabChangeListener {
	TabHost tabHost;
	TabWidget tabWidget;
	Intent intent;
	TabSpec spec;
	public static final int NUMBERS_OF_TAB=5;

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);

		Display display = getWindowManager().getDefaultDisplay();
		int screenWidth = display.getWidth();
		int screenHeight = display.getHeight();

		tabHost = getTabHost();

	//	tabHost.getTabWidget().setBackgroundResource(R.drawable.tab_bg_p);

		tabHost.getTabWidget().setDividerDrawable(R.color.White);

		tabHost.getTabWidget().setShowDividers(TabWidget.SHOW_DIVIDER_MIDDLE);

		Intent intentContact = new Intent().setClass(this, Tab1Activity.class);
		TabSpec tabSpecContact = tabHost.newTabSpec("Contact")
				.setIndicator("Contact")

				.setContent(intentContact);

		View view1 = LayoutInflater.from(this).inflate(R.layout.tab_icon,
				tabHost.getTabWidget(), false);

		LinearLayout ll1 = (LinearLayout) view1
				.findViewById(R.id.layout_tabsLayout);

		LinearLayout.LayoutParams llp1 = new LinearLayout.LayoutParams(
				screenWidth / NUMBERS_OF_TAB, LayoutParams.MATCH_PARENT);
		ll1.setLayoutParams(llp1);

		ImageView imgtabF1 = (ImageView) view1.findViewById(R.id.img_icon);
		imgtabF1.setBackgroundResource(R.drawable.contact_selector);

		tabSpecContact.setIndicator(view1);

		Intent intentModelDetails = new Intent().setClass(this,
				Tab2Activity.class);
		TabSpec tabSpecModelDetails = tabHost.newTabSpec("Model")
				.setIndicator("Model")

				.setContent(intentModelDetails);



		View view2 = LayoutInflater.from(this).inflate(R.layout.tab_icon2,
				tabHost.getTabWidget(), false);
		
		LinearLayout ll2 = (LinearLayout) view2
				.findViewById(R.id.layout_tabsLayout);

		LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(
				screenWidth / NUMBERS_OF_TAB, LayoutParams.MATCH_PARENT);
		ll2.setLayoutParams(llp2);

		ImageView imgtabF2 = (ImageView) view2.findViewById(R.id.img_icon);
		imgtabF2.setBackgroundResource(R.drawable.model_selector);

		tabSpecModelDetails.setIndicator(view2);

		Intent intentHome = new Intent().setClass(this, Tab3Activity.class);
		TabSpec tabSpecHome = tabHost.newTabSpec("Home").setIndicator("Home")

		.setContent(intentHome);

		View view3 = LayoutInflater.from(this).inflate(R.layout.tab_icon3,
				tabHost.getTabWidget(), false);
		
		LinearLayout ll3 = (LinearLayout) view3
				.findViewById(R.id.layout_tabsLayout);

		LinearLayout.LayoutParams llp3 = new LinearLayout.LayoutParams(
				screenWidth / NUMBERS_OF_TAB, LayoutParams.MATCH_PARENT);
		ll3.setLayoutParams(llp3);

		ImageView imgtabF3 = (ImageView) view3.findViewById(R.id.img_icon);
		imgtabF3.setBackgroundResource(R.drawable.home_selector);

		tabSpecHome.setIndicator(view3);

		Intent intentLocation = new Intent().setClass(this, Tab4Activity.class);
		TabSpec tabSpecLocation = tabHost.newTabSpec("Location")
				.setIndicator("Location")

				.setContent(intentLocation);

		View view4 = LayoutInflater.from(this).inflate(R.layout.tab_icon4,
				tabHost.getTabWidget(), false);
		
		LinearLayout ll4 = (LinearLayout) view4
				.findViewById(R.id.layout_tabsLayout);

		LinearLayout.LayoutParams llp4 = new LinearLayout.LayoutParams(
				screenWidth / NUMBERS_OF_TAB, LayoutParams.MATCH_PARENT);
		ll4.setLayoutParams(llp4);

		ImageView imgtabF4 = (ImageView) view4.findViewById(R.id.img_icon);
		imgtabF4.setBackgroundResource(R.drawable.location_selector);

		tabSpecLocation.setIndicator(view4);

		Intent intentServiceSchedule = new Intent().setClass(this,
				Tab5Activity.class);
		TabSpec tabSpecServiceSchedule = tabHost.newTabSpec("Location")
				.setIndicator("Location")

				.setContent(intentServiceSchedule);

		View view5 = LayoutInflater.from(this).inflate(R.layout.tab_icon5,
				tabHost.getTabWidget(), false);
		
		
		LinearLayout ll5 = (LinearLayout) view5
				.findViewById(R.id.layout_tabsLayout);

		LinearLayout.LayoutParams llp5 = new LinearLayout.LayoutParams(
				screenWidth / NUMBERS_OF_TAB, LayoutParams.MATCH_PARENT);
		ll5.setLayoutParams(llp5);

		ImageView imgtabF5 = (ImageView) view5.findViewById(R.id.img_icon);
		imgtabF5.setBackgroundResource(R.drawable.schedule_details_selector);

		tabSpecServiceSchedule.setIndicator(view5);

		tabHost.addTab(tabSpecContact);
		tabHost.addTab(tabSpecLocation);
		tabHost.addTab(tabSpecHome);
		tabHost.addTab(tabSpecModelDetails);
		tabHost.addTab(tabSpecServiceSchedule);

		// set Windows tab as default (zero based)
		tabHost.setCurrentTab(2);

		tabHost.setOnTabChangedListener(this);

	}

	@Override
	public void onTabChanged(String arg0) {
		// TODO Auto-generated method stub

		if (arg0.contentEquals("Home")) {

		} else if (arg0.contentEquals("Contact")) {

		} else if (arg0.contentEquals("Location")) {

		} else {

		}

	}
}
