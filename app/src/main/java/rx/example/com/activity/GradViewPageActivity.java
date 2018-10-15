package rx.example.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import rx.example.com.adapter.GradViewPageAdapter;
import rx.example.com.R;
import rx.example.com.db.Shapre;

/**
 * class
 *
 * @author hc
 * @date 2018/09/11
 */
public class GradViewPageActivity extends AppCompatActivity {

    private ViewPager viewPager;
    List<View> linearLayouts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Shapre.setType(getApplicationContext(), "1");
        setContentView(R.layout.gradviewpageactivity_xml);

        viewPager = findViewById(R.id.viewPage);
        data();
        GradViewPageAdapter adapter = new GradViewPageAdapter(linearLayouts);
        viewPager.setAdapter(adapter);
    }

    private void data() {
        linearLayouts = new ArrayList<>();
        View linearLayout = LayoutInflater.from(getApplicationContext()).inflate(R.layout.oneitem_xml, null);
        View linearLayout1 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.twoitem_xml, null);
        View linearLayout2 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.thereitem_xml, null);
        TextView textView3 = linearLayout2.findViewById(R.id.text3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GradViewPageActivity.this, HomeActivity.class));
                finish();
            }
        });
        linearLayouts.add(linearLayout);
        linearLayouts.add(linearLayout1);
        linearLayouts.add(linearLayout2);
    }

}
