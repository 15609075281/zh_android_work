package rx.example.com.ui.presenter;

import android.util.Log;

import java.util.List;

import rx.example.com.ui.Entity.HomeEntity;
import rx.example.com.ui.module.HomeModule;
import rx.example.com.ui.module.abstractHomeModuleImp;
import rx.example.com.ui.view.HomeView;

/**
 * @author hc
 * @data 2017/08/02
 */
public class HomePresenter {

    public static class SingleToHolder {
        private static final HomePresenter ourInstance = new HomePresenter();
    }

    public static HomePresenter getInstance() {
        return SingleToHolder.ourInstance;
    }

    private HomePresenter() {
    }

    private HomeView homeView;
    private HomeModule homeModule;

    public void find(HomeView homeView) {
        this.homeView = homeView;
        homeModule = HomeModule.getInstance();
    }

    public void getDataList() {
        Log.e("1111","11111");
        homeView.openProgress();
        homeModule.getAll(new abstractHomeModuleImp.OnHomeListViewData<HomeEntity>() {
            @Override
            public void onSuccess(List<HomeEntity> success) {
                homeView.closingProgress();
                homeView.setListData(success);
            }

            @Override
            public void onError(String error) {
                homeView.closingProgress();

            }
        });
    }


}
