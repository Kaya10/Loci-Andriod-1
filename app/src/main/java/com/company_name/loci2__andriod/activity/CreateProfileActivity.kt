/*
*  CreateProfileActivity.kt
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
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class CreateProfileActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, CreateProfileActivity::class.java)
		}
	}
	
	private lateinit var byContinuingIconTextView: TextView
	private lateinit var group2770Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.create_profile_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure By continuing, I con component
		byContinuingIconTextView = this.findViewById(R.id.by_continuing_icon_text_view)
		
		// Configure Group 2770 component
		group2770Button = this.findViewById(R.id.group2770_button)
		group2770Button.setOnClickListener({ view ->
			this.onGroup2770Pressed()
		})
	}
	
	fun onGroup2770Pressed() {
	
		this.startWelcomeActivity()
	}
	
	private fun startWelcomeActivity() {
	
		this.startActivity(WelcomeActivity.newIntent(this))
	}
}
