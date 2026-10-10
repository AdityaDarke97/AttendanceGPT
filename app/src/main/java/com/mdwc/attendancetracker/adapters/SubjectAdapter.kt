package com.mdwc.attendancetracker.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mdwc.attendancetracker.databinding.SubjectsCardBinding
import com.mdwc.attendancetracker.models.Subject

class SubjectAdapter(private var subjects: List<Subject>) :
    RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {

    inner class SubjectViewHolder(val binding: SubjectsCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val binding = SubjectsCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subject = subjects[position]

        holder.binding.idx.text = (position + 1).toString()
        holder.binding.subName.text = subject.name
        holder.binding.percentage.text = "0%"
    }

    override fun getItemCount() = subjects.size

    fun updateData(newSubjects: List<Subject>) {
        this.subjects = newSubjects
        notifyDataSetChanged()
    }
}