package nz.ac.uclive.vjj14.spendshamer


import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ExpenseAdapter.OnExpenseListener {

    private val expenses = arrayOf<Expense>(
            Expense("$15.29", "14/02/2021", "Uber"),
            Expense("$14.81", "14/02/2021", "Uber"),
            Expense("$43.29", "15/02/2021", "UberEats"),
            Expense("$22.57", "17/02/2021", "Uber"),
            Expense("$24.92", "17/02/2021", "Uber"),
            Expense("$13.96", "23/02/2021", "Uber")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_list_vertical)
        val expenseAdapter = ExpenseAdapter(expenses, this)
        val recyclerView: RecyclerView = findViewById(R.id.expenses_recycler_view)
        recyclerView.adapter = expenseAdapter
    }

    override fun onExpenseClick(position: Int) {
        val options = arrayOf("Details", "Edit", "Delete")
        val builder = AlertDialog.Builder(this)
        val toast = Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT)
        toast.show()
    }
}