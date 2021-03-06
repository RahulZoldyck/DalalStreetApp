package org.pragyan.dalalstreet17;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Portfolio extends Fragment {

    ListView listView;

    ArrayList<String> stock_details;

    TextView money,stock,total;
    int money_cash,money_stock,money_total,stock_github,stock_apple,stock_yahoo,stock_hdfc,stock_lg,stock_sony,stock_infosys;
    int github_value,apple_value,yahoo_value,hdfc_value,lg_value,sony_value,infosys_value;

    public Portfolio() {
        // Required empty public constructor
        money_cash=1000; //hardcoded

        stock_github=3; //hardcoded
        stock_apple=5; //hardcoded
        stock_yahoo=7; //hardcoded
        stock_hdfc=9; //hardcoded
        stock_lg=12; //hardcoded
        stock_sony=15; //hardcoded
        stock_infosys=20; //hardcoded

        github_value=50; //hardcoded
        apple_value=40; //hardcoded
        yahoo_value=30; //hardcoded
        hdfc_value=60; //hardcoded
        lg_value=70; //hardcoded
        sony_value=45; //hardcoded
        infosys_value=55; //hardcoded


        money_stock=(stock_github*github_value)+(stock_apple*apple_value)+(stock_yahoo*yahoo_value)+(stock_hdfc*hdfc_value)+(stock_lg*lg_value)+(stock_sony*sony_value)+(stock_infosys*infosys_value);
        money_total=money_stock+money_cash;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_portfolio, container, false);

        getActivity().setTitle("Portfolio");

        money=(TextView)rootView.findViewById(R.id.money);
        stock=(TextView)rootView.findViewById(R.id.stock_wealth);
        total=(TextView)rootView.findViewById(R.id.total);


        money.setText("Money available : "+money_cash);
        stock.setText("Wealth through stocks : "+money_stock);
        total.setText("Total wealth : "+money_total);


        listView=(ListView)rootView.findViewById(R.id.stock_details_listview);
        stock_details=new ArrayList<String>();
        stock_details.add("Github : "+stock_github+" ("+github_value+" per stock)");
        stock_details.add("Apple : "+stock_apple+" ("+apple_value+" per stock)");
        stock_details.add("Yahoo : "+stock_yahoo+" ("+yahoo_value+" per stock)");
        stock_details.add("HDFC : "+stock_hdfc+" ("+hdfc_value+" per stock)");
        stock_details.add("LG : "+stock_lg+" ("+lg_value+" per stock)");
        stock_details.add("Sony : "+stock_sony+" ("+sony_value+" per stock)");
        stock_details.add("Infosys : "+stock_infosys+" ("+infosys_value+" per stock)");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,stock_details);
        listView.setAdapter(arrayAdapter);





        return rootView;
    }

}
