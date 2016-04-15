package ua.lpnu.testshop;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Vector;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {
    ViewGroup m_my_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_my_list = (ViewGroup) findViewById(R.id.list);

        LayoutInflater l = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        Vector<String> strings = new Vector<String>();

        strings.add("Requirements for the Ukrainian currency transfers decreased");
        strings.add("The end of the dream of Europe");
        strings.add("How take photograph people who are asleep.");


        for (String s : strings) {
            View item = l.inflate(R.layout.list_item, null);
            ((TextView) item.findViewById(R.id.itemtext)).setText(s);
            m_my_list.addView(item);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
