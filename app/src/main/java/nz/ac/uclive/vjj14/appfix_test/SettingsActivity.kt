package nz.ac.uclive.vjj14.appfix_test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat

class SettingsActivity : AppCompatActivity() {

    val newExpenseCostView: TextView = findViewById(R.id.input_cost)
    val newExpenseSourceView: TextView = findViewById(R.id.input_source)
    val newExpenseDateView: TextView = findViewById(R.id.input_date)

    val newExpenseCost: String = newExpenseCostView.toString()
    val newExpenseSource: String = newExpenseSourceView.toString()
    val newExpenseDate: String = newExpenseDateView.toString()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expense_maker)

        val thing = intent.get

        findViewById<Button>(R.id.button_addExpense).setOnClickListener {
            val newExpense = Expense(newExpenseCost, newExpenseDate, newExpenseSource)
        }
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }




}