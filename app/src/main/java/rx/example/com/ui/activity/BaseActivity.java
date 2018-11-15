package rx.example.com.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author hc
 * @data 2017/08/02
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(inti());
        find();
    }

    /**
     * @return context
     */
    public Context getInstance() {
        return this;
    }

    /**
     * 初始化view
     *
     * @return layoutID
     */
    public abstract int inti();

    public void find() {
        findViews();
        setListener();
        intiData();
        setting();
    }

    /**
     * 初始加载
     */
    public abstract void findViews();

    /**
     * 初始绑定监听
     */
    public abstract void setListener();

    /**
     * 初始化数据
     */
    public abstract void intiData();

    /**
     * 初始填充
     */
    public abstract void setting();


}
