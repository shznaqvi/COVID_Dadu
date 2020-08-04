package edu.aku.hassannaqvi.covid_dadu.ui.other

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.validatorcrawler.aliazaz.Validator
import edu.aku.hassannaqvi.covid_dadu.CONSTANTS.Companion.FSTATUS_END_FLAG
import edu.aku.hassannaqvi.covid_dadu.R
import edu.aku.hassannaqvi.covid_dadu.core.MainApp.appInfo
import edu.aku.hassannaqvi.covid_dadu.core.MainApp.form
import edu.aku.hassannaqvi.covid_dadu.databinding.ActivityEndingBinding
import java.text.SimpleDateFormat
import java.util.*

class EndingActivity : AppCompatActivity() {
    lateinit var bi: ActivityEndingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_ending)
        bi.callback = this

        val check = intent.getBooleanExtra("complete", false)
        if (check) {
            bi.a0601.isEnabled = true
            bi.a0602.isEnabled = false
            bi.a0603.isEnabled = false
            bi.a0604.isEnabled = false
            bi.a0605.isEnabled = false
            bi.a0606.isEnabled = false
            bi.a0607.isEnabled = false
            bi.a0696.isEnabled = false
        } else {
            val bool = intent.getIntExtra(FSTATUS_END_FLAG, 0)
            bi.a0601.isEnabled = false
            bi.a0602.isEnabled = bool == 1
            bi.a0603.isEnabled = bool == 1
            bi.a0604.isEnabled = bool == 1
            bi.a0605.isEnabled = bool == 1
            bi.a0606.isEnabled = bool == 1
            bi.a0607.isEnabled = bool == 2
            bi.a0696.isEnabled = bool == 2
        }
    }

    fun BtnEnd() {
        if (!formValidation()) return
        saveDraft()
        if (updateDB()) {
            finish()
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            Toast.makeText(this, "Error in updating db!!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun saveDraft() {
        val statusValue = if (bi.a0601.isChecked) "1" else if (bi.a0602.isChecked) "2" else if (bi.a0603.isChecked) "3" else if (bi.a0604.isChecked) "4" else if (bi.a0605.isChecked) "5" else if (bi.a0606.isChecked) "6" else if (bi.a0607.isChecked) "96" else "0"
        form.istatus = statusValue
        form.istatus96x = bi.a0696x.text.toString()
        form.endingdatetime = SimpleDateFormat("dd-MM-yy HH:mm").format(Date().time)
    }


    private fun updateDB(): Boolean {
        val db = appInfo.dbHelper
        val updcount = db.updateEnding()
        return if (updcount == 1) {
            true
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show()
            false
        }
    }

    private fun formValidation(): Boolean {
        return Validator.emptyCheckingContainer(this, bi.fldGrpEnd)
    }

    override fun onBackPressed() {
        Toast.makeText(applicationContext, "You Can't go back", Toast.LENGTH_LONG).show()
    }
}