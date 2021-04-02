package nz.ac.uclive.vjj14.spendshamer

class Expense (val cost: String,
               val date: String,
               val source: String){
    override fun toString() = date + "        " + source + "        " + cost
}