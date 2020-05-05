package com.example.behoctoanlop1

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login.setOnClickListener {
            login()
        }
    }

    private fun login(){
        if(input_email.text.toString().equals(Util.ACCOUNT) && input_password.text.toString().equals(Util.PASS_WORD)) {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login success")
            builder.setPositiveButton("Ok",
                DialogInterface.OnClickListener { dialog, id -> goHome() })
            builder.create().show()
        } else {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login faild")
            builder.setNegativeButton("Ok",
                DialogInterface.OnClickListener { dialog, id -> goHome()
                    //dialog.cancel()
                })
            builder.create().show()
        }
    }

    private fun goHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}
