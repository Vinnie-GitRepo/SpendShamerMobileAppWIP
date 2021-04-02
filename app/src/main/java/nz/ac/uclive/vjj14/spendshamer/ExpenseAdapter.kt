package nz.ac.uclive.vjj14.spendshamer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(private val expenses: Array<Expense>, private val onExpenseListener: OnExpenseListener)
    : RecyclerView.Adapter<ExpenseAdapter.ExpenseViewHolder>() {
    class  ExpenseViewHolder(itemView: View, private val onExpenseListener: OnExpenseListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val textViewDate: TextView
        val textViewSource: TextView
        val textViewCost: TextView
        init {
            textViewDate = itemView.findViewById(R.id.expense_date_text)
            textViewSource = itemView.findViewById(R.id.expense_source_text)
            textViewCost = itemView.findViewById(R.id.expense_cost_text)
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            onExpenseListener.onExpenseClick(adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.expense_item, parent, false)
        return ExpenseViewHolder(view, onExpenseListener)
    }

    override fun onBindViewHolder(viewHolder: ExpenseViewHolder, position: Int) {
        viewHolder.textViewDate.text = expenses[position].date
        viewHolder.textViewSource.text = expenses[position].source
        viewHolder.textViewCost.text = expenses[position].cost
    }

    override fun getItemCount() = expenses.size

    interface OnExpenseListener {
        fun onExpenseClick(position: Int)
    }
}