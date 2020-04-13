package com.example.indydesk;

import android.content.Intent;
import android.content.res.TypedArray;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class TiwariUncle extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MenuAdapter menuAdapter;
    private List<Rowitem> rowitemList;
    private FirebaseAuth mAuth;
    String[] foodnames;
    TypedArray pics;
    String[] price;
    int desertNumber;
    Rowitem item;
    LinearLayout lv;
    RecyclerView.LayoutManager linearLayoutManager;
    TextView textView,checkout,prices;
    int tot,dt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiwari_uncle);
        textView=findViewById(R.id.total);
        checkout=findViewById(R.id.checkout);
       // tot=desertNumber=0;
//        prices=findViewById(R.id.price);
        lv=findViewById(R.id.checkme);
        recyclerView=findViewById(R.id.my_recycler_view);
        mAuth= FirebaseAuth.getInstance();
        linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        Intent intent = getIntent();
        String value = intent.getStringExtra("Button1");
        if(value.equals("1")){
            foodnames = getResources().getStringArray(R.array.Member_names);

            pics = getResources().obtainTypedArray(R.array.profile_pics);

            price = getResources().getStringArray(R.array.statues);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }
        else if(value.equals("2")){
            foodnames = getResources().getStringArray(R.array.Member_names_tapri);

            pics = getResources().obtainTypedArray(R.array.profile_pics_tapri);

            price = getResources().getStringArray(R.array.statues_tapri);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }
        else if(value.equals("3")){
            foodnames = getResources().getStringArray(R.array.Member_names_amul);

            pics = getResources().obtainTypedArray(R.array.profile_pics_amul);

            price = getResources().getStringArray(R.array.statues_amul);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }
        else if(value.equals("4")){
            foodnames = getResources().getStringArray(R.array.Member_names_chinese);

            pics = getResources().obtainTypedArray(R.array.profile_pics_chinese);

            price = getResources().getStringArray(R.array.statues_chinese);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }
        else if(value.equals("5")){
            foodnames = getResources().getStringArray(R.array.Member_names_snacks);

            pics = getResources().obtainTypedArray(R.array.profile_pics_snacks);

            price = getResources().getStringArray(R.array.statues_snacks);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }
        else if(value.equals("6")){
            foodnames = getResources().getStringArray(R.array.Member_names_wafers);
            pics = getResources().obtainTypedArray(R.array.profile_pics_wafers);
            price = getResources().getStringArray(R.array.statues_wafers);
            rowitemList=new ArrayList<>();
            for (int i = 0; i < foodnames.length; i++) {
                item = new Rowitem(pics.getResourceId(i, -1),foodnames[i], price[i]);
                rowitemList.add(item);
            }
            menuAdapter=new MenuAdapter(getApplicationContext(),rowitemList);
            recyclerView.setAdapter(menuAdapter);
        }

    }
    public void Decrement(View view) {

        LinearLayout parentRow = (LinearLayout) view.getParent();
        prices=((LinearLayout)parentRow.getParent()).findViewById(R.id.price);
        TextView quantityView = (TextView) parentRow.findViewById(R.id.num);
        String quantityString = quantityView.getText().toString();
        desertNumber = Integer.parseInt(quantityString);
        desertNumber -= 1;
        if(desertNumber>=0){
            String pp=prices.getText().toString();
            System.out.println(pp);
            int ppp=Integer.parseInt(pp);
            System.out.println(ppp+" "+tot+" "+desertNumber);
            tot=tot-ppp;
            System.out.println(tot);
            lv.setVisibility(View.VISIBLE);
            textView.setText("Total Rs."+tot);
        }

        if (desertNumber < 0) {
            desertNumber = 0;
            Toast.makeText(TiwariUncle.this, "Can not be less than 0",
                    Toast.LENGTH_SHORT).show();}
        quantityView.setText(String.valueOf(desertNumber));
    }
    public void Increment(View view) {

        LinearLayout parentRow = (LinearLayout) view.getParent();
        prices=((LinearLayout)parentRow.getParent()).findViewById(R.id.price);
        TextView quantityView = (TextView) parentRow.findViewById(R.id.num);
        String quantityString = quantityView.getText().toString();
        desertNumber = Integer.parseInt(quantityString);
        desertNumber += 1;
        dt=desertNumber;
        if(desertNumber>=1){
            String pp=prices.getText().toString();
            System.out.println(pp);
            int ppp=Integer.parseInt(pp);
            System.out.println(ppp+" "+tot+" "+desertNumber);
            tot=tot+ppp;
            System.out.println(tot);
            lv.setVisibility(View.VISIBLE);
            textView.setText("Total Rs."+tot);
            //CheckOutMe(view);
        }
        quantityView.setText(String.valueOf(dt));
    }


}
