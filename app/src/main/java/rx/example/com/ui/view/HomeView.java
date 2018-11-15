package rx.example.com.ui.view;

import java.util.List;

/**
 * @author hc
 * @data 2017/08/02
 */
public interface HomeView {

    /**
     * 启动进度条
     */
    void openProgress();

    /**
     * 关闭进度条
     */
    void closingProgress();

    /**
     * 填充list列表数据
     */
    void setListData(List listData);
}
