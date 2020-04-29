/*
*  OpeningActivity.kt
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
import com.company_name.loci2__andriod.R


class OpeningActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, OpeningActivity::class.java)
		}
	}
	
	private lateinit var group2777Button: Button
	private lateinit var loginButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.opening_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Group 2777 component
		group2777Button = this.findViewById(R.id.group2777_button)
		group2777Button.setOnClickListener({ view ->
			this.onGroup2777Pressed()
		})
		
		// Configure Login component
		loginButton = this.findViewById(R.id.login_button)
		loginButton.setOnClickListener({ view ->
			this.onLoginPressed()
		})
	}
	
	fun onGroup2777Pressed() {
	
		this.startSIgnIn1Activity()
	}
	
	fun onLoginPressed() {
	
		this.startSignUpLandingActivity()
	}
	
	private fun startSIgnIn1Activity() {
	
		this.startActivity(SIgnIn1Activity.newIntent(this))
	}
	
	private fun startSignUpLandingActivity() {
	
		this.startActivity(SignUpLandingActivity.newIntent(this))
	}
}
