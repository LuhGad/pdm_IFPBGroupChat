package com.example.luciana.ifpbgroupchat;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Luciana on 08/08/2016.
 */
public class ContactsAdapter extends BaseAdapter {

    private Pessoas loggedUser;
    private Context context;

    public ContactsAdapter(Context context, Pessoas loggedUser){
        this.loggedUser = loggedUser;

        this.context = context;
    }


    @Override
    public int getCount() {
        return loggedUser.getPessoas().size();
    }

    @Override
    public Object getItem(int position) {
        return loggedUser.getPessoas().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        //gerando gridView
        gridView = new View(context);
        gridView = inflater.inflate(R.layout.layout_pessoas, null);
        Pessoas u = (Pessoas) getItem(position);

        //setando nome do contato
        TextView textView = (TextView) gridView.findViewById(R.id.contacts_username);
        textView.setText(getItem(position).toString());

        //setando icone do contato
        TextView textView2 = (TextView) gridView.findViewById(R.id.contacts_username);
        GradientDrawable ld = (GradientDrawable)textView2.getBackground();
     //   ld.setColor(context.getResources().getColor(u.getColor()));


//        textView2.setText(u.getAbrev());

        //setando ultima mensagem do chat
        TextView textView3 = (TextView) gridView.findViewById(R.id.contacts_lastMessage);
//        textView3.setText(loggedUser.getLastMessage(u));


        return gridView;
    }



}