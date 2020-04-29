/*
*  Messaging2Activity.kt
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
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class Messaging2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Messaging2Activity::class.java)
		}
	}
	
	private lateinit var symbol144Button: ImageButton
	private lateinit var symbol92Button: ImageButton
	private lateinit var arrowButton: ImageButton
	private lateinit var union1Button: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.messaging2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Symbol 14 – 4 component
		symbol144Button = this.findViewById(R.id.symbol144_button)
		symbol144Button.setOnClickListener({ view ->
			this.onSymbol144Pressed()
		})
		
		// Configure Symbol 9 – 2 component
		symbol92Button = this.findViewById(R.id.symbol92_button)
		symbol92Button.setOnClickListener({ view ->
			this.onSymbol92Pressed()
		})
		
		// Configure arrow component
		arrowButton = this.findViewById(R.id.arrow_button)
		arrowButton.setOnClickListener({ view ->
			this.onArrowPressed()
		})
		
		// Configure Union 1 component
		union1Button = this.findViewById(R.id.union1_button)
		union1Button.setOnClickListener({ view ->
			this.onUnion1Pressed()
		})
	}
	
	fun onSymbol144Pressed() {
	
	}
	
	fun onSymbol92Pressed() {
	
	}
	
	fun onArrowPressed() {
	
	}
	
	fun onUnion1Pressed() {
	
	}
}
