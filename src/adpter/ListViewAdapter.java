package adpter;

import java.util.List;
import java.util.zip.Inflater;

import org.yuc.bluetooth.R;
import org.yuc.bluetooth.WorkBean;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	private Context context;
	private List<WorkBean> list; 
	private LayoutInflater inflater;
	
	public ListViewAdapter(Context context, List<WorkBean> list) {
		super();
		this.context = context;
		this.list = list;
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder voHolder = null;
		if (convertView == null) {
			voHolder = new ViewHolder();
			convertView = inflater.inflate(R.layout.item, parent,false);
			voHolder.title = (TextView) convertView.findViewById(R.id.title);
			voHolder.content = (TextView) convertView.findViewById(R.id.content);
			convertView.setTag(voHolder);
		}else {
			voHolder = (ViewHolder) convertView.getTag();
		}
		if (list!=null&&list.size()>0) {
			voHolder.title.setText(list.get(position).getTitle()+":  ");
			voHolder.content.setText(" "+list.get(position).getContent());
		}
		return convertView;
	}
	
	class ViewHolder{
		TextView title;
		TextView content;
	}
	
}
