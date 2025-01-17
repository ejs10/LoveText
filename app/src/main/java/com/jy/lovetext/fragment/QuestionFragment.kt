package com.jy.lovetext.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.jy.lovetext.R



/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment : Fragment(),View.OnClickListener {

    lateinit var navController: NavController



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_next = view.findViewById<ImageView>(R.id.btn_next)

        navController = Navigation.findNavController(view)

        btn_next.setOnClickListener(this)


    }



    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_next->{
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }
}