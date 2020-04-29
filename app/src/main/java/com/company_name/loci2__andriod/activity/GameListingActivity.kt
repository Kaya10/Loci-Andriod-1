/*
*  GameListingActivity.kt
*  Loci2  Andriod
*
*  Created by Kaya.
*  Copyright © 2018 Mpulse Media. All rights reserved.
*/

package com.company_name.loci2__andriod.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class GameListingActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, GameListingActivity::class.java)
		}
	}
	
	private lateinit var windsailTextView: TextView
	private lateinit var path2043Button: Button
	private lateinit var path2044Button: Button
	private lateinit var path2045Button: Button
	private lateinit var path2046Button: ImageButton
	private lateinit var iconAwesomeHomeButton: ImageButton
	private lateinit var iconAwesomeSearchButton: ImageButton
	private lateinit var iconIonicMdFootbaButton: ImageButton
	private lateinit var iconMaterialMessagButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.game_listing_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure WindSail component
		windsailTextView = this.findViewById(R.id.windsail_text_view)
		val windsailTextViewText = SpannableString(this.getString(R.string.game_listing_activity_windsail_text_view_text))
		windsailTextViewText.setSpan(ForegroundColorSpan(Color.parseColor("#8D4DE5")), 4, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
		windsailTextView.text = windsailTextViewText
		
		// Configure Path 2043 component
		path2043Button = this.findViewById(R.id.path2043_button)
		path2043Button.setOnClickListener({ view ->
			this.onPath2043Pressed()
		})
		
		// Configure Path 2044 component
		path2044Button = this.findViewById(R.id.path2044_button)
		path2044Button.setOnClickListener({ view ->
			this.onPath2044Pressed()
		})
		
		// Configure Path 2045 component
		path2045Button = this.findViewById(R.id.path2045_button)
		path2045Button.setOnClickListener({ view ->
			this.onPath2045Pressed()
		})
		
		// Configure Path 2046 component
		path2046Button = this.findViewById(R.id.path2046_button)
		path2046Button.setOnClickListener({ view ->
			this.onPath2046Pressed()
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
	
	fun onPath2043Pressed() {
	
	}
	
	fun onPath2044Pressed() {
	
	}
	
	fun onPath2045Pressed() {
	
	}
	
	fun onPath2046Pressed() {
	
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
	
	private fun startMyGamesActivity() {
	
		this.startActivity(MyGamesActivity.newIntent(this))
	}
	
	private fun startDashboardActivity() {
	
		this.startActivity(DashboardActivity.newIntent(this))
	}
	
	private fun startJoinAGameActivity() {
	
		this.startActivity(JoinAGameActivity.newIntent(this))
	}
}
