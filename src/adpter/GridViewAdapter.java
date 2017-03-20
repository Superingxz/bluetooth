package adpter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {

	  private Context context;  
      
      public GridViewAdapter(Context context) {  
          this.context = context;  
      }  
        
      int count = 4;  

      @Override  
      public int getCount() {  
          return count;  
      }  

      @Override  
      public Object getItem(int position) {  
          return position;  
      }  

      @Override  
      public long getItemId(int position) {  
          return position;  
      }  

      @Override  
      public View getView(int position, View convertView, ViewGroup parent) {  
          TextView result = new TextView(context);  
          result.setText("Item "+position);  
          result.setTextColor(Color.BLACK);  
          result.setTextSize(24);
          result.setLayoutParams(new AbsListView.LayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)));  
          result.setGravity(Gravity.CENTER);  
          result.setBackgroundColor(Color.WHITE); //…Ë÷√±≥æ∞—’…´  
          return result;  
      }  
        
  }  
