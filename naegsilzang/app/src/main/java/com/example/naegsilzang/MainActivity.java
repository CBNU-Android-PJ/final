package com.example.naegsilzang;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ListView list;
    public EditText search_name;
    public ImageButton search_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        search_name= findViewById(R.id.editSearch);
        list = (ListView) findViewById(R.id.list1);


        ArrayList<String> menu_name=new ArrayList<>();
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        menu_name = databaseAccess.viewmenu();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, menu_name);
        list.setAdapter(adapter); //adapter를 list에 set. >> ListView와 Adapter 연결
        adapter.notifyDataSetChanged();
        databaseAccess.close();



        //리스트의 아이템 클릭시 작동
        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //기능 구현

                //아래는 예시
                //Intent intent = new Intent(getApplicationContext(), ListClicked.class);

                *//* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 *//*
                //intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                //intent.putExtra("info", data.get(position).getInfo());
                //intent.putExtra("phone", data.get(position).getPhone());
                //startActivity(intent);
            }
        });*/






}
}





