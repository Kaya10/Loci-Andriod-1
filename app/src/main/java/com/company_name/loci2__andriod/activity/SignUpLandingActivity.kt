/*
*  SignUpLandingActivity.kt
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


class SignUpLandingActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SignUpLandingActivity::class.java)
		}
	}
	
	private lateinit var group2777Button: Button
	private lateinit var group2778Button: Button
	private lateinit var group2779Button: Button
	private lateinit var group2780Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.sign_up_landing_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Group 2777 component
		group2777Button = this.findViewById(R.id.group2777_button)
		group2777Button.setOnClickListener({ view ->
			this.onGroup2777Pressed()
		})
		
		// Configure Group 2778 component
		group2778Button = this.findViewById(R.id.group2778_button)
		group2778Button.setOnClickListener({ view ->
			this.onGroup2778Pressed()
		})
		
		// Configure Group 2779 component
		group2779Button = this.findViewById(R.id.group2779_button)
		group2779Button.setOnClickListener({ view ->
			this.onGroup2779Pressed()
		})
		
		// Configure Group 2780 component
		group2780Button = this.findViewById(R.id.group2780_button)
		group2780Button.setOnClickListener({ view ->
			this.onGroup2780Pressed()
		})
	}
	
	fun onGroup2777Pressed() {
	
		this.startSIgnIn1Activity()
	}
	
	fun onGroup2778Pressed() {
	
	}
	
	fun onGroup2779Pressed() {
	
	}
	
	fun onGroup2780Pressed() {
	
	}
	
	private fun startSIgnIn1Activity() {
	
		this.startActivity(SIgnIn1Activity.newIntent(this))
	}
}
