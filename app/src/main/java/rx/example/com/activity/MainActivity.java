package rx.example.com.activity;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import rx.example.com.activity.fragment.FourFragment;
import rx.example.com.adapter.MainViewPageAdapter;
import rx.example.com.activity.fragment.OneFragment;
import rx.example.com.R;
import rx.example.com.activity.fragment.ThereFragment;
import rx.example.com.activity.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
        data();
        MainViewPageAdapter mainViewPageAdapter = new MainViewPageAdapter(list, getSupportFragmentManager());
        viewPager.setAdapter(mainViewPageAdapter);
        viewPager.setOnPageChangeListener(pageChangeListener);
    }

    private void find() {
        viewPager = findViewById(R.id.mainViewPage);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t1.setOnClickListener(listener);
        t2.setOnClickListener(listener);
        t3.setOnClickListener(listener);
        t4.setOnClickListener(listener);
        setColor();
        t1.setBackgroundColor(Color.parseColor("#000000"));
        t1.setTextColor(Color.parseColor("#ffffff"));
        viewPager.setCurrentItem(0);

    }

    public void data() {
        list = new ArrayList<>();
        list.add(new OneFragment());
        list.add(new TwoFragment());
        list.add(new ThereFragment());
        list.add(new FourFragment());
    }

    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setColor();
            switch (v.getId()) {
                case R.id.t1:
                    t1.setBackgroundColor(Color.parseColor("#000000"));
                    t1.setTextColor(Color.parseColor("#ffffff"));
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.t2:
                    t2.setBackgroundColor(Color.parseColor("#000000"));
                    t2.setTextColor(Color.parseColor("#ffffff"));
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.t3:
                    t3.setBackgroundColor(Color.parseColor("#000000"));
                    t3.setTextColor(Color.parseColor("#ffffff"));
                    viewPager.setCurrentItem(2);
                    break;
                case R.id.t4:
                    t4.setBackgroundColor(Color.parseColor("#000000"));
                    t4.setTextColor(Color.parseColor("#ffffff"));
                    viewPager.setCurrentItem(3);
                    break;

                default:
            }
        }
    };

    private void setColor() {
        t1.setBackgroundColor(Color.parseColor("#ffffff"));
        t2.setBackgroundColor(Color.parseColor("#ffffff"));
        t3.setBackgroundColor(Color.parseColor("#ffffff"));
        t4.setBackgroundColor(Color.parseColor("#ffffff"));
        t1.setTextColor(Color.parseColor("#000000"));
        t2.setTextColor(Color.parseColor("#000000"));
        t3.setTextColor(Color.parseColor("#000000"));
        t4.setTextColor(Color.parseColor("#000000"));
    }


    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {
            Log.e("onPageScrolled", i + "");
        }

        @Override
        public void onPageSelected(int i) {
            Log.e("onPageSelected", i + "");
            switchGet(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {
            Log.e("sss", i + "");
        }
    };

    private void switchGet(int i) {
        setColor();
        switch (i) {
            case 0:
                t1.setBackgroundColor(Color.parseColor("#000000"));
                t1.setTextColor(Color.parseColor("#ffffff"));
                break;
            case 1:
                t2.setBackgroundColor(Color.parseColor("#000000"));
                t2.setTextColor(Color.parseColor("#ffffff"));
                break;
            case 2:
                t3.setBackgroundColor(Color.parseColor("#000000"));
                t3.setTextColor(Color.parseColor("#ffffff"));
                break;
            case 3:
                t4.setBackgroundColor(Color.parseColor("#000000"));
                t4.setTextColor(Color.parseColor("#ffffff"));
                break;

            default:
        }
    }


}
