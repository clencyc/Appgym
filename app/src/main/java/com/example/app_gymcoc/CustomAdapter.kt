package com.example.app_gymcoc

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class CustomAdapter(var context: Context, var data:ArrayList<Users>): BaseAdapter() {
    private class ViewHolder(row: View?) {
        var Email: TextView
        var Password: TextView
        var ConfirmPass: TextView

        init {
            this.Email = row?.findViewById(R.id.emailEdt) as TextView
            this.Password = row?.findViewById(R.id.passEdT) as TextView
            this.ConfirmPass = row?.findViewById(R.id.confirmPassEdt) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.users_layout, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item: Users = getItem(position) as Users
        viewHolder.Email.text = item.email
        viewHolder.Password.text = item.password
        viewHolder.ConfirmPass.text = item.confirmpass
        return view as View
    }

    override fun getItem(position: Int): Any {
        return data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}