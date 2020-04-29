/*
*  CreateAGameActivity.kt
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


class CreateAGameActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, CreateAGameActivity::class.java)
		}
	}
	
	private lateinit var rectangle133Button: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.create_agame_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Rectangle 133 component
		rectangle133Button = this.findViewById(R.id.rectangle133_button)
		rectangle133Button.setOnClickListener({ view ->
			this.onRectangle133Pressed()
		})
	}
	
	fun onRectangle133Pressed() {
	
		this.startGameCreatedActivity()
	}
	
	private fun startGameCreatedActivity() {
	
		this.startActivity(GameCreatedActivity.newIntent(this))
	}
}
