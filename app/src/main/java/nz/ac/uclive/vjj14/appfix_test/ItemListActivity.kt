package nz.ac.uclive.vjj14.appfix_test

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

import nz.ac.uclive.vjj14.appfix_test.dummy.DummyContent

/**
 * An activity representing a list of Pings. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a [ItemDetailActivity] representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
class ItemListActivity : AppCompatActivity(), ExpenseAdapter.OnExpenseListener {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private var twoPane: Boolean = false

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
        setContentView(R.layout.activity_item_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.title = title


        val addExpenseFAB = findViewById<FloatingActionButton>(R.id.addExpense_FAB)
        addExpenseFAB.setOnClickListener {
            val gotoExpenseMaker = Intent(this, SettingsActivity::class.java)
            gotoExpenseMaker.putExtra("expenses", expenses)
            startActivity(gotoExpenseMaker)
        }

        if (findViewById<NestedScrollView>(R.id.item_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            twoPane = true
        }
        val expenseAdapter = ExpenseAdapter(expenses, this)
        val recyclerView: RecyclerView = findViewById(R.id.item_list)
        recyclerView.adapter = expenseAdapter
//        setupRecyclerView(findViewById(R.id.item_list))
    }

    override fun onExpenseClick(position: Int) {
        val options = arrayOf("Edit", "Delete")
        val builder = AlertDialog.Builder(this)
        val toast = Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT)
        toast.show()
    }

}