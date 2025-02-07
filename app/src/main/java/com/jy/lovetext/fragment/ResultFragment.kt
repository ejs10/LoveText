package com.jy.lovetext.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.jy.lovetext.R



/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index")?:-1
        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn_home = view.findViewById<ImageView>(R.id.btn_home)


        navController = Navigation.findNavController(view)

        setResult(option, view)

        btn_home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    private fun setResult(option: Int, view: View) {

        val tv_main = view.findViewById<TextView>(R.id.btn_main)
        val tv_sub = view.findViewById<TextView>(R.id.btn_sub)


        when(option){
            1 -> {
                tv_main.text = "You are a QUITTER!"
                tv_sub.text = "You can let the person easily."
            }
            2 -> {
                tv_main.text = "You should focus on yourself"
                tv_sub.text = "You become really clingy to your ex."

            }
            3 -> {
                tv_main.text = "You should take it easy"
                tv_sub.text = "You can do crazy things no matter what it takes."

            }
            4 -> {
                tv_main.text = "You are pretty mature."
                tv_sub.text = "You can easily accept the break-up."

            }
        }

    }





}