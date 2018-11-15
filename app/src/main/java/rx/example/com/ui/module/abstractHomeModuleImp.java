package rx.example.com.ui.module;

import org.json.JSONObject;

import java.util.List;

/**
 * @author hc
 * @data 2017/08/02
 */
public abstract class abstractHomeModuleImp {

    public interface OnHomeListViewData<T> {
        /**
         * 成功返回数据集
         *
         * @param success
         */
        void onSuccess(List<T> success);

        /**
         * 失败返回数据集
         *
         * @param error
         */
        void onError(String error);
    }

}
