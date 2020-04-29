/*
*  GameCreatedActivity.kt
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
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class GameCreatedActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, GameCreatedActivity::class.java)
		}
	}
	
	private lateinit var rectangle132Button: Button
	private lateinit var buttonButton: Button
	private lateinit var iconAwesomeHomeButton: ImageButton
	private lateinit var iconAwesomeSearchButton: ImageButton
	private lateinit var iconIonicMdFootbaButton: ImageButton
	private lateinit var iconMaterialMessagButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.game_created_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Rectangle 132 component
		rectangle132Button = this.findViewById(R.id.rectangle132_button)
		rectangle132Button.setOnClickListener({ view ->
			this.onRectangle132Pressed()
		})
		
		// Configure Button component
		buttonButton = this.findViewById(R.id.button_button)
		buttonButton.setOnClickListener({ view ->
			this.onButtonPressed()
		})
		
		// Configure Icon awesome-home component
		iconAwesomeHomeButton = this.findViewById(R.id.icon_awesome_home_button)
		iconAwesomeHomeButton.setOnClickListener({ view ->
			this.onIconAwesomeHomePressed()
		})
		
		// Configure Icon awesome-search component
		iconAwesomeSearchButton = this.findViewById(R.id.icon_awesome_search_button)
		iconAwesomeSearchButton.setOnClickListener({ view ->
			this.onIconAwesomeSearchPressed()
		})
		
		// Configure Icon ionic-md-footba component
		iconIonicMdFootbaButton = this.findViewById(R.id.icon_ionic_md_footba_button)
		iconIonicMdFootbaButton.setOnClickListener({ view ->
			this.onIconIonicMdFootbaPressed()
		})
		
		// Configure Icon material-messag component
		iconMaterialMessagButton = this.findViewById(R.id.icon_material_messag_button)
		iconMaterialMessagButton.setOnClickListener({ view ->
			this.onIconMaterialMessagPressed()
		})
	}
	
	fun onRectangle132Pressed() {
	
		this.startDashboardActivity()
	}
	
	fun onButtonPressed() {
	
	}
	
	fun onIconAwesomeHomePressed() {
	
		this.startDashboardActivity()
	}
	
	fun onIconAwesomeSearchPressed() {
	
		this.startJoinAGameActivity()
	}
	
	fun onIconIonicMdFootbaPressed() {
	
		this.startMyGamesActivity()
	}
	
	fun onIconMaterialMessagPressed() {
	
		this.startMessagesActivity()
	}
	
	private fun startMessagesActivity() {
	
		this.startActivity(MessagesActivity.newIntent(this))
	}
	
	private fun startJoinAGameActivity() {
	
		this.startActivity(JoinAGameActivity.newIntent(this))
	}
	
	private fun startDashboardActivity() {
	
		this.startActivity(DashboardActivity.newIntent(this))
	}
	
	private fun startMyGamesActivity() {
	
		this.startActivity(MyGamesActivity.newIntent(this))
	}
}
