package rx.example.com.ui.activity;

import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import rx.example.com.R;
import rx.example.com.adapter.HomeActivityAdapter;
import rx.example.com.ui.Entity.HomeEntity;
import rx.example.com.ui.presenter.HomePresenter;
import rx.example.com.ui.view.HomeView;

/**
 * @author hc
 */
public class HomeActivity extends BaseActivity implements HomeView {

    private ImageView homeHead;
    private ImageView homeSearch;
    private GridView homeListView;
    private HomeActivityAdapter activityAdapter;
    private HomePresenter homePresenter;

    @Override
    public int inti() {
        return R.layout.homeactivity_xml;
    }

    @Override
    public void findViews() {
        homePresenter = HomePresenter.getInstance();
        homePresenter.find(this);
        homeHead = findViewById(R.id.homeHead);
        homeSearch = findViewById(R.id.homeSearch);
        homeListView = findViewById(R.id.homeListView);
    }

    @Override
    public void setListener() {
        homeHead.setOnClickListener(listener);
        homeSearch.setOnClickListener(listener);
    }

    @Override
    public void intiData() {

    }

    @Override
    public void setting() {
        homePresenter.getDataList();
    }


    android.view.View.OnClickListener listener = new android.view.View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.homeHead:
                    Toast.makeText(getInstance(), "检查账号是否存在！！！", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.homeSearch:
                    Toast.makeText(getInstance(), "没有搜索列表！！！", Toast.LENGTH_SHORT).show();
                    break;
                default:
            }
        }
    };


    @Override
    public void openProgress() {

    }

    @Override
    public void closingProgress() {

    }

    @Override
    public void setListData(List listData) {
        activityAdapter = new HomeActivityAdapter(getInstance());
        activityAdapter.setData(listData);

        homeListView.setAdapter(activityAdapter);
        homeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HomeEntity adapter = (HomeEntity) parent.getAdapter().getItem(position);
                Log.e("position", adapter.toString() + "");
            }
        });
    }
}
