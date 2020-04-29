/*
*  JoinAGame2Activity.kt
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
import com.google.android.gms.maps.MapView


class JoinAGame2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, JoinAGame2Activity::class.java)
		}
	}
	
	private lateinit var search1Button: ImageButton
	private lateinit var arrowSmallDown1Button: ImageButton
	private lateinit var resetFiltersButton: Button
	private lateinit var applyFiltersButton: Button
	private lateinit var iconAwesomeHomeButton: ImageButton
	private lateinit var iconIonicMdFootbaButton: ImageButton
	private lateinit var iconMaterialMessagButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.join_agame2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Search – 1 component
		search1Button = this.findViewById(R.id.search1_button)
		search1Button.setOnClickListener({ view ->
			this.onSearch1Pressed()
		})
		
		// Configure Arrow Small Down – 1 component
		arrowSmallDown1Button = this.findViewById(R.id.arrow_small_down1_button)
		arrowSmallDown1Button.setOnClickListener({ view ->
			this.onArrowSmallDown1Pressed()
		})
		
		// Configure Reset Filters component
		resetFiltersButton = this.findViewById(R.id.reset_filters_button)
		resetFiltersButton.setOnClickListener({ view ->
			this.onResetFiltersPressed()
		})
		
		// Configure Apply Filters component
		applyFiltersButton = this.findViewById(R.id.apply_filters_button)
		applyFiltersButton.setOnClickListener({ view ->
			this.onApplyFiltersPressed()
		})
		
		// Configure Icon awesome-home component
		iconAwesomeHomeButton = this.findViewById(R.id.icon_awesome_home_button)
		iconAwesomeHomeButton.setOnClickListener({ view ->
			this.onIconAwesomeHomePressed()
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
	
	fun onSearch1Pressed() {
	
	}
	
	fun onArrowSmallDown1Pressed() {
	
	}
	
	fun onResetFiltersPressed() {
	
	}
	
	fun onApplyFiltersPressed() {
	
	}
	
	fun onIconAwesomeHomePressed() {
	
		this.startDashboardActivity()
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
	
	private fun startDashboardActivity() {
	
		this.startActivity(DashboardActivity.newIntent(this))
	}
	
	private fun startMyGamesActivity() {
	
		this.startActivity(MyGamesActivity.newIntent(this))
	}
}
