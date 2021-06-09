package com.capstone.saba.ui.notebook.fragment.todo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.capstone.saba.MyApplication
import com.capstone.saba.data.source.remote.RemoteDataSource
import com.capstone.saba.databinding.FragmentEditTodoBinding
import com.capstone.saba.vm.ViewModelFactory
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import javax.inject.Inject

class EditTodoFragment : Fragment() {

    private var _binding: FragmentEditTodoBinding? = null
    private val binding get() = _binding!!

    companion object {
        val TAG = RemoteDataSource::class.java.simpleName
    }

    @Inject
    lateinit var factory: ViewModelFactory

    private val userViewModel: ToDoViewModel by viewModels { factory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MyApplication).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentEditTodoBinding.inflate(inflater, container, false)
    val view = binding.root

    return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userViewModel.getUser().observe(viewLifecycleOwner, { data ->

            val db = Firebase.firestore



            binding.btnDeleteTodo.setOnClickListener {


                db.collection("users").document("DC").collection("todo").
                    .delete()
                    .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully deleted!") }
                    .addOnFailureListener { e -> Log.w(TAG, "Error deleting document", e) }
            }



        })



    }

}