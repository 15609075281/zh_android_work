package rx.example.com.db;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * class
 *
 * @author hc
 * @date 2018/09/11
 */
public class Shapre {

    public static void setType(Context context, String type) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("splash", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("type", type);
        editor.commit();
    }

    public static String getType(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("splash", Context.MODE_PRIVATE);
        return sharedPreferences.getString("type", "");
    }

}
