/*
*  ResetPasswordActivity.kt
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


class ResetPasswordActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, ResetPasswordActivity::class.java)
		}
	}
	
	private lateinit var group2692Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.reset_password_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Group 2692 component
		group2692Button = this.findViewById(R.id.group2692_button)
		group2692Button.setOnClickListener({ view ->
			this.onGroup2692Pressed()
		})
	}
	
	fun onGroup2692Pressed() {
	
		this.startDashboardActivity()
	}
	
	private fun startDashboardActivity() {
	
		this.startActivity(DashboardActivity.newIntent(this))
	}
}
