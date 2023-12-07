package com.example.tripwith

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Gravity
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MyPageEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page_edit)

        val editBtn: TextView = findViewById(R.id.editButton)

        editBtn.setOnClickListener {
            showCustomDialogBox()
        }

        val backBtn: ImageView = findViewById(R.id.backBtn)

        backBtn.setOnClickListener {
            val intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

    }

    private fun showCustomDialogBox() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.layout_edit_dialog)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val selectImg : LinearLayout = dialog.findViewById(R.id.selectImg)
        val deleteImg : LinearLayout = dialog.findViewById(R.id.deleteImg)
        val appbar : MaterialToolbar = findViewById(R.id.topAppBar2)

        selectImg.setOnClickListener {
            //
        }
        deleteImg.setOnClickListener {
            val profileImage : ImageView = findViewById(R.id.profileImage)
            val originalProfile = R.drawable.originalprofile
            profileImage.setImageResource(originalProfile)
            dialog.dismiss()
        }

        val window = dialog.window
        val layoutParams = window?.attributes

        layoutParams?.dimAmount = 0f
        window?.attributes = layoutParams

        val wlp = window?.attributes

        val density = resources.displayMetrics.density
        val xPixel = 30 * density
        val yPixel = 405 * density

        val location = IntArray(2)
        appbar.getLocationOnScreen(location)

        wlp?.gravity = Gravity.TOP or Gravity.RIGHT
        wlp?.x = xPixel.toInt()
        wlp?.y = location[1] + yPixel.toInt()
        window?.attributes = wlp

        dialog.show()
    }


}
