/*
*  SignUpActivity.kt
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
import android.widget.ScrollView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class SignUpActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SignUpActivity::class.java)
		}
	}
	
	private lateinit var loginButton: Button
	private lateinit var byCreatingAnAccouTextView: TextView
	private lateinit var socialMediaButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.sign_up_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Login component
		loginButton = this.findViewById(R.id.login_button)
		loginButton.setOnClickListener({ view ->
			this.onLoginPressed()
		})
		
		// Configure By creating an accou component
		byCreatingAnAccouTextView = this.findViewById(R.id.by_creating_an_accou_text_view)
		
		// Configure social media component
		socialMediaButton = this.findViewById(R.id.social_media_button)
		socialMediaButton.setOnClickListener({ view ->
			this.onSocialMediaPressed()
		})
	}
	
	fun onLoginPressed() {
	
		this.startCreateProfileActivity()
	}
	
	fun onSocialMediaPressed() {
	
	}
	
	private fun startCreateProfileActivity() {
	
		this.startActivity(CreateProfileActivity.newIntent(this))
	}
}
