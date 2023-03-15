package com.example.thutoapp.core.android
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thutoapp.R
import com.example.thutoapp.core.model.User



class UserAdapter (private val users: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list__user_layout_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bindItems(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.user_name) as TextView
            val textViewRole = itemView.findViewById(R.id.user_role) as TextView
            textViewName.text = user.name
            textViewRole.text = user.roleName

        }
    }
}

