/*
*  JoinAGameActivity.kt
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
import android.support.v7.widget.SearchView
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R
import com.google.android.gms.maps.MapView


class JoinAGameActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, JoinAGameActivity::class.java)
		}
	}
	
	private lateinit var rectangle132Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.join_agame_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Rectangle 132 component
		rectangle132Button = this.findViewById(R.id.rectangle132_button)
		rectangle132Button.setOnClickListener({ view ->
			this.onRectangle132Pressed()
		})
	}
	
	fun onRectangle132Pressed() {
	
	}
}
