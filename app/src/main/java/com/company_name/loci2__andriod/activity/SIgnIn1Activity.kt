/*
*  SIgnIn1Activity.kt
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


class SIgnIn1Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SIgnIn1Activity::class.java)
		}
	}
	
	private lateinit var forgotEmailPassworButton: Button
	private lateinit var group2773Button: Button
	private lateinit var byCreatingAnAccouTextView: TextView
	private lateinit var socialMediaButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.sign_in1_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Forgot email/passwor component
		forgotEmailPassworButton = this.findViewById(R.id.forgot_email_passwor_button)
		forgotEmailPassworButton.setOnClickListener({ view ->
			this.onForgotEmailPassworPressed()
		})
		
		// Configure Group 2773 component
		group2773Button = this.findViewById(R.id.group2773_button)
		group2773Button.setOnClickListener({ view ->
			this.onGroup2773Pressed()
		})
		
		// Configure By creating an accou component
		byCreatingAnAccouTextView = this.findViewById(R.id.by_creating_an_accou_text_view)
		
		// Configure social media component
		socialMediaButton = this.findViewById(R.id.social_media_button)
		socialMediaButton.setOnClickListener({ view ->
			this.onSocialMediaPressed()
		})
	}
	
	fun onForgotEmailPassworPressed() {
	
		this.startResetPasswordActivity()
	}
	
	fun onGroup2773Pressed() {
	
		this.startWelcomeActivity()
	}
	
	fun onSocialMediaPressed() {
	
	}
	
	private fun startWelcomeActivity() {
	
		this.startActivity(WelcomeActivity.newIntent(this))
	}
	
	private fun startResetPasswordActivity() {
	
		this.startActivity(ResetPasswordActivity.newIntent(this))
	}
}
