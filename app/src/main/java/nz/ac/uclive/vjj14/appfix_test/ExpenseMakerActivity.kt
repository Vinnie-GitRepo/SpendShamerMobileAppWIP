package nz.ac.uclive.vjj14.appfix_test

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

/**
 * MOVED TO THE SettingsActivity FILE, as this wasn't working well with the navigation
 */
class ExpenseMakerActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.expense_maker)
    }


}