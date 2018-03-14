package com.zyra.pointofsale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Zyra on 13/02/2018.
 */

public class List_adapter2 extends BaseAdapter {
    private  Context mContext;
    private LayoutInflater mInflater;
    private int mImage;
    private String mName;
    private String mPrice1;
    private  String mPrice2;
    private  String mCount;
    public List_adapter2(Context context, int ImageId, String item_count , String item_name, String item_desc, String item_price){
        mContext = context;
        mImage = ImageId;
        mName = item_name;
        mPrice1 = item_desc;
        mPrice2 = item_price;
        mCount = item_count;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    static class ViewHolder{
        ImageView gambar_item;
        TextView nama_item;
        TextView harga_item1;
        TextView harga_item2;
        TextView count_item;
        ImageButton remove;
        ImageButton add;
    }
    @Override
    public int getCount() {
        return 12;
    }
    @Override
    public Object getItem(int i) {
        return i;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_row_barang, viewGroup, false);
            final ViewHolder holder = new ViewHolder();
            holder.gambar_item = (ImageView) convertView.findViewById(R.id.gambar_barang);
            holder.nama_item = (TextView) convertView.findViewById(R.id.nama_barang);
            holder.harga_item1= (TextView) convertView.findViewById(R.id.harga1);
            holder.harga_item2 = (TextView) convertView.findViewById(R.id.harga2);
            holder.count_item = (TextView) convertView.findViewById(R.id.jumlah);
            holder.remove = (ImageButton) convertView.findViewById(R.id.kurang);
            holder.add = (ImageButton) convertView.findViewById(R.id.tambah);
            convertView.setTag(holder);

        }

        final ViewHolder holder = (ViewHolder) convertView.getTag();

        holder.gambar_item.setImageResource(R.drawable.bread);
        holder.nama_item.setText(mName);
        holder.harga_item1.setText("Rp 100.000");
        holder.harga_item2.setText("Rp 200.000");
        holder.count_item.setText(mCount);
        holder.remove.setImageResource(R.drawable.remove);
        holder.add.setImageResource(R.drawable.add);



        return convertView;
    }
}
