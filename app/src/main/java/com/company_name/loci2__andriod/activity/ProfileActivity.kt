/*
*  ProfileActivity.kt
*  Loci2  Andriod
*
*  Created by Kaya.
*  Copyright © 2018 Mpulse Media. All rights reserved.
*/

package com.company_name.loci2__andriod.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class ProfileActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, ProfileActivity::class.java)
		}
	}
	
	private lateinit var rectangle251Button: Button
	private lateinit var rectangle251TwoButton: Button
	private lateinit var rectangle251ThreeButton: Button
	private lateinit var textViewTextView: TextView
	private lateinit var textViewTwoTextView: TextView
	private lateinit var textViewThreeTextView: TextView
	private lateinit var infoButton: Button
	private lateinit var ellipse101Button: Button
	private lateinit var ellipse102Button: Button
	private lateinit var ellipse103Button: Button
	private lateinit var buttonButton: Button
	private lateinit var buttonTwoButton: Button
	private lateinit var ellipse101TwoButton: Button
	private lateinit var ellipse102TwoButton: Button
	private lateinit var ellipse103TwoButton: Button
	private lateinit var buttonThreeButton: Button
	private lateinit var buttonFourButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.profile_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Rectangle 251 component
		rectangle251Button = this.findViewById(R.id.rectangle251_button)
		rectangle251Button.setOnClickListener({ view ->
			this.onRectangle251Pressed()
		})
		
		// Configure Rectangle 251 component
		rectangle251TwoButton = this.findViewById(R.id.rectangle251_two_button)
		rectangle251TwoButton.setOnClickListener({ view ->
			this.onRectangle251TwoPressed()
		})
		
		// Configure Rectangle 251 component
		rectangle251ThreeButton = this.findViewById(R.id.rectangle251_three_button)
		rectangle251ThreeButton.setOnClickListener({ view ->
			this.onRectangle251ThreePressed()
		})
		
		// Configure 140 component
		textViewTextView = this.findViewById(R.id.text_view_text_view)
		
		// Configure 140 component
		textViewTwoTextView = this.findViewById(R.id.text_view_two_text_view)
		
		// Configure 140 component
		textViewThreeTextView = this.findViewById(R.id.text_view_three_text_view)
		
		// Configure Info component
		infoButton = this.findViewById(R.id.info_button)
		infoButton.setOnClickListener({ view ->
			this.onInfoPressed()
		})
		
		// Configure Ellipse 101 component
		ellipse101Button = this.findViewById(R.id.ellipse101_button)
		ellipse101Button.setOnClickListener({ view ->
			this.onEllipse101Pressed()
		})
		
		// Configure Ellipse 102 component
		ellipse102Button = this.findViewById(R.id.ellipse102_button)
		ellipse102Button.setOnClickListener({ view ->
			this.onEllipse102Pressed()
		})
		
		// Configure Ellipse 103 component
		ellipse103Button = this.findViewById(R.id.ellipse103_button)
		ellipse103Button.setOnClickListener({ view ->
			this.onEllipse103Pressed()
		})
		
		// Configure button component
		buttonButton = this.findViewById(R.id.button_button)
		buttonButton.setOnClickListener({ view ->
			this.onButtonPressed()
		})
		
		// Configure button component
		buttonTwoButton = this.findViewById(R.id.button_two_button)
		buttonTwoButton.setOnClickListener({ view ->
			this.onButtonTwoPressed()
		})
		
		// Configure Ellipse 101 component
		ellipse101TwoButton = this.findViewById(R.id.ellipse101_two_button)
		ellipse101TwoButton.setOnClickListener({ view ->
			this.onEllipse101Pressed()
		})
		
		// Configure Ellipse 102 component
		ellipse102TwoButton = this.findViewById(R.id.ellipse102_two_button)
		ellipse102TwoButton.setOnClickListener({ view ->
			this.onEllipse102Pressed()
		})
		
		// Configure Ellipse 103 component
		ellipse103TwoButton = this.findViewById(R.id.ellipse103_two_button)
		ellipse103TwoButton.setOnClickListener({ view ->
			this.onEllipse103Pressed()
		})
		
		// Configure button component
		buttonThreeButton = this.findViewById(R.id.button_three_button)
		buttonThreeButton.setOnClickListener({ view ->
			this.onButtonPressed()
		})
		
		// Configure button component
		buttonFourButton = this.findViewById(R.id.button_four_button)
		buttonFourButton.setOnClickListener({ view ->
			this.onButtonTwoPressed()
		})
	}
	
	fun onRectangle251Pressed() {
	
		this.startCreateAGameActivity()
	}
	
	fun onRectangle251TwoPressed() {
	
		this.startJoinAGameActivity()
	}
	
	fun onRectangle251ThreePressed() {
	
		this.startMyGamesActivity()
	}
	
	fun onInfoPressed() {
	
	}
	
	fun onEllipse101Pressed() {
	
	}
	
	fun onEllipse102Pressed() {
	
	}
	
	fun onEllipse103Pressed() {
	
	}
	
	fun onButtonPressed() {
	
	}
	
	fun onButtonTwoPressed() {
	
		this.startPlayerDetailsActivity()
	}
	
	fun onEllipse101Pressed() {
	
	}
	
	fun onEllipse102Pressed() {
	
	}
	
	fun onEllipse103Pressed() {
	
	}
	
	fun onButtonPressed() {
	
	}
	
	fun onButtonTwoPressed() {
	
	}
	
	private fun startJoinAGameActivity() {
	
		this.startActivity(JoinAGameActivity.newIntent(this))
	}
	
	private fun startPlayerDetailsActivity() {
	
		this.startActivity(PlayerDetailsActivity.newIntent(this))
	}
	
	private fun startCreateAGameActivity() {
	
		this.startActivity(CreateAGameActivity.newIntent(this))
	}
	
	private fun startMyGamesActivity() {
	
		this.startActivity(MyGamesActivity.newIntent(this))
	}
}
