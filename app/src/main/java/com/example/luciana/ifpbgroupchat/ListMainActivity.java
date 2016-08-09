package com.example.luciana.ifpbgroupchat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luciana on 21/07/2016.
 */
public class ListMainActivity extends AppCompatActivity {
   private Pessoas p;
    private Context context;

    public ListMainActivity(){

}

    public ListMainActivity(Pessoas p, Context context){
        this.p = p;
        this.context = context;
    }



    public int getQuantidade()
    {

        return p.getPessoas().size();
    }

    public Object getItem(int position)
    {

        return p.getPessoas().get(position);
    }

    public long getItemId(int position) {

        return 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        gridView = new View(context);
        gridView = inflater.inflate(R.layout.activity_lista, null);
        Pessoas pessoas = (Pessoas) getItem(position);

        TextView textView = (TextView) gridView.findViewById(R.id.contacts_username);
        textView.setText(getItem(position).toString());


        return gridView;
    }
}
