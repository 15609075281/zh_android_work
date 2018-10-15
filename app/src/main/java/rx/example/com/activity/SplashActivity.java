package rx.example.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import rx.example.com.R;
import rx.example.com.db.Shapre;

/**
 * class
 *
 * @author hc
 * @date 2018/09/11
 * 开始运行
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity_xml);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String type = Shapre.getType(getApplicationContext());
        if (type == null) {
            startActivity(new Intent(SplashActivity.this, GradViewPageActivity.class));
        } else {
            if (type.equals("1")) {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
            } else {
                startActivity(new Intent(SplashActivity.this, GradViewPageActivity.class));
            }
        }
    }
}
