package nz.ac.uclive.vjj14.spendshamer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_list_vertical.view.*


class ListFragmentVertical : Fragment() {


//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//
//        val view = inflater.inflate(R.layout.fragment_list_vertical, container, false)
//
//        view.buttonListToGraph
//        view.findViewById<Button>(R.id.buttonListToGraph).setOnClickListener{
//            Navigation.createNavigateOnClickListener(R.id.action_listFragmentVertical_to_graphFragmentVertical, null)
//        }
//        return view
//    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)



        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonListToGraph)!!.setOnClickListener{
            val toast = Toast.makeText(activity, "Hello", Toast.LENGTH_SHORT)
            toast.show()
            Navigation.createNavigateOnClickListener(R.id.action_listFragmentVertical_to_graphFragmentVertical, null)
        }
//        view.buttonListToGraph.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.action_listFragmentVertical_to_graphFragmentVertical) }
    }


}