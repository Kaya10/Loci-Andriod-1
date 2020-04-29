/*
*  SignIn2Activity.kt
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
import android.widget.LinearLayout
import android.widget.TextView
import com.company_name.loci2__andriod.R


class SignIn2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SignIn2Activity::class.java)
		}
	}
	
	private lateinit var group2690Button: Button
	private lateinit var forgotPasswordButton: Button
	private lateinit var loginWithButton: LinearLayout
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.sign_in2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Group 2690 component
		group2690Button = this.findViewById(R.id.group2690_button)
		group2690Button.setOnClickListener({ view ->
			this.onGroup2690Pressed()
		})
		
		// Configure FORGOT PASSWORD component
		forgotPasswordButton = this.findViewById(R.id.forgot_password_button)
		forgotPasswordButton.setOnClickListener({ view ->
			this.onFORGOTPASSWORDPressed()
		})
		
		// Configure login with component
		loginWithButton = this.findViewById(R.id.login_with_button)
		loginWithButton.setOnClickListener({ view ->
			this.onLoginWithPressed()
		})
	}
	
	fun onGroup2690Pressed() {
	
		this.startRequestActivity()
	}
	
	fun onFORGOTPASSWORDPressed() {
	
		this.startResetPasswordActivity()
	}
	
	fun onLoginWithPressed() {
	
	}
	
	private fun startRequestActivity() {
	
		this.startActivity(RequestActivity.newIntent(this))
	}
	
	private fun startResetPasswordActivity() {
	
		this.startActivity(ResetPasswordActivity.newIntent(this))
	}
}
