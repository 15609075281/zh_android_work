package rx.example.com.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.example.com.R;
import rx.example.com.adapter.HomeActivityAdapter;

public class HomeActivity extends AppCompatActivity {

    private ImageView home_head;
    private ImageView home_search;
    private GridView homeListView;
    private HomeActivityAdapter activityAdapter;
    private List<Map<String, String>> list;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity_xml);
        context = this;
        find();
        data();
        setListView();

    }

    private void find() {
        home_head = findViewById(R.id.home_head);
        home_search = findViewById(R.id.home_search);
        homeListView = findViewById(R.id.homeListView);
    }

    private void data() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("image1", String.valueOf(R.drawable.s16));
            map.put("image2", String.valueOf(R.drawable.s16));
            map.put("image3", String.valueOf(R.drawable.s16));
            map.put("text1", "我是第" + i + "个");
            map.put("text2", "我是第" + i + "个");
            map.put("text3", "我是第" + i + "个");
            list.add(map);
        }
    }

    private void setListView() {
        activityAdapter = new HomeActivityAdapter(context);
        activityAdapter.setData(list);
        homeListView.setAdapter(activityAdapter);
        homeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

}
