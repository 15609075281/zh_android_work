package rx.example.com.ui.module;

import java.util.ArrayList;
import java.util.List;
import rx.example.com.ui.Entity.HomeEntity;

/**
 * @author hc
 * @data 2017/08/02
 */
public class HomeModule extends abstractHomeModuleImp {
    public static class SingleToHolder {
        private static final HomeModule ourInstance = new HomeModule();
    }

    public static HomeModule getInstance() {
        return SingleToHolder.ourInstance;
    }

    private HomeModule() {
    }

    public void getAll(OnHomeListViewData<HomeEntity> homeListViewData) {
        List<HomeEntity> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            HomeEntity homeEntity = new HomeEntity();
            homeEntity.setName("测试" + i + "号");
            homeEntity.setImageUrl("//www.baidu.com/img/bd_logo1.png");
            list.add(homeEntity);
        }
        if (list.size() > 0) {
            homeListViewData.onSuccess(list);
        } else {
            homeListViewData.onError("网络错误");
        }
    }

}
