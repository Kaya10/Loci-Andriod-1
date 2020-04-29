/*
*  CreateAGame2Activity.kt
*  Loci2  Andriod
*
*  Created by Kaya.
*  Copyright © 2018 Mpulse Media. All rights reserved.
*/

package com.company_name.loci2__andriod.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class CreateAGame2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, CreateAGame2Activity::class.java)
		}
	}
	
	private lateinit var windsailTextView: TextView
	private lateinit var path2056Button: Button
	private lateinit var ellipse389Button: Button
	private lateinit var ellipse390Button: Button
	private lateinit var rectangle2361Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.create_agame2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure WindSail component
		windsailTextView = this.findViewById(R.id.windsail_text_view)
		val windsailTextViewText = SpannableString(this.getString(R.string.create_agame2_activity_windsail_text_view_text))
		windsailTextViewText.setSpan(ForegroundColorSpan(Color.parseColor("#7E8CAA")), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
		windsailTextView.text = windsailTextViewText
		
		// Configure Path 2056 component
		path2056Button = this.findViewById(R.id.path2056_button)
		path2056Button.setOnClickListener({ view ->
			this.onPath2056Pressed()
		})
		
		// Configure Ellipse 389 component
		ellipse389Button = this.findViewById(R.id.ellipse389_button)
		ellipse389Button.setOnClickListener({ view ->
			this.onEllipse389Pressed()
		})
		
		// Configure Ellipse 390 component
		ellipse390Button = this.findViewById(R.id.ellipse390_button)
		ellipse390Button.setOnClickListener({ view ->
			this.onEllipse390Pressed()
		})
		
		// Configure Rectangle 2361 component
		rectangle2361Button = this.findViewById(R.id.rectangle2361_button)
		rectangle2361Button.setOnClickListener({ view ->
			this.onRectangle2361Pressed()
		})
	}
	
	fun onPath2056Pressed() {
	
	}
	
	fun onEllipse389Pressed() {
	
	}
	
	fun onEllipse390Pressed() {
	
	}
	
	fun onRectangle2361Pressed() {
	
		this.startUpcomingGamesActivity()
	}
	
	private fun startUpcomingGamesActivity() {
	
		this.startActivity(UpcomingGamesActivity.newIntent(this))
	}
}
