package rx.example.com.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * class
 *
 * @author hc
 * @date 2018/09/11
 */
public class MainViewPageAdapter extends FragmentPagerAdapter {

    List<Fragment> list;

    public MainViewPageAdapter(List<Fragment> list, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }


}
