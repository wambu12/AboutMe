package com.example.aboutme

import android.content.Context
import android.content.Context.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        binding.myName=myName

       // val button:Button=findViewById<Button>(R.id.done_button)



       binding.doneButton .setOnClickListener {

            addNickname(it)

        }


    }

    private fun addNickname(view: View) {

       // val editText =findViewById<EditText>(R.id.nickname_edit)
      //  val nicknameTextView=findViewById<EditText>(R.id.nickname_text)

     binding.apply {
      //  nicknameText .text=nicknameEdit.text

         myName?.nickname = nicknameEdit.text.toString()


         invalidateAll()

        nicknameEdit.visibility=View.GONE
        view.visibility=View.GONE


        nicknameText.visibility=View.VISIBLE



     }
        // Hide the keyboard.
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
















    }
}