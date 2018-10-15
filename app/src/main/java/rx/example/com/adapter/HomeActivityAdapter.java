package rx.example.com.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import rx.example.com.R;

public class HomeActivityAdapter extends BaseAdapter {

    private List<Map<String, String>> maps;
    private Context context;

    public HomeActivityAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Map<String, String>> list) {
        this.maps = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (maps == null) {
            return 0;
        } else {
            return maps.size();
        }
    }

    @Override
    public Object getItem(int position) {
        return maps.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHelad vh = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.home_listitem_xml, null, false);
            vh = new ViewHelad();
            vh.home_item_image1 = convertView.findViewById(R.id.home_item_image1);

            vh.home_item_text1 = convertView.findViewById(R.id.home_item_text1);

            convertView.setTag(vh);
        } else {
            vh = (ViewHelad) convertView.getTag();
        }
        Map<String, String> map = maps.get(position);
//        vh.home_item_image1.setImageResource(Integer.parseInt(map.get("image1")));

        vh.home_item_text1.setText(map.get("text1"));

        return convertView;
    }


    class ViewHelad {
        TextView home_item_text1;

        ImageView home_item_image1;

    }
}
