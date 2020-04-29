/*
*  PlayerDetailsActivity.kt
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


class PlayerDetailsActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, PlayerDetailsActivity::class.java)
		}
	}
	
	private lateinit var group8Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.player_details_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Group 8 component
		group8Button = this.findViewById(R.id.group8_button)
		group8Button.setOnClickListener({ view ->
			this.onGroup8Pressed()
		})
	}
	
	fun onGroup8Pressed() {
	
		this.startProfileActivity()
	}
	
	private fun startProfileActivity() {
	
		this.startActivity(ProfileActivity.newIntent(this))
	}
}
