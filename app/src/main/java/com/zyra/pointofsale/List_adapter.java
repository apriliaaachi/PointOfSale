package com.zyra.pointofsale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Zyra on 13/02/2018.
 */

public class List_adapter extends BaseAdapter {

    private  Context mContext;
    private LayoutInflater mInflater;
    private int mImageView;
    private String mName;
    private String mDesc;
    private  String mPrice;



    public List_adapter(Context context, int ImageIds , String item_name, String item_desc, String item_price){
        mContext = context;
        mImageView = ImageIds;
        mName = item_name;
        mDesc = item_desc;
        mPrice = item_price;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    static class ViewHolder{
        ImageView gambar_item;
        TextView nama_item;
        TextView desc;
        TextView harga;
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
            convertView = mInflater.inflate(R.layout.list_row_main, viewGroup, false);

            final ViewHolder holder = new ViewHolder();
            holder.gambar_item = (ImageView) convertView.findViewById(R.id.gambar_barang);
            holder.nama_item = (TextView) convertView.findViewById(R.id.nama_barang);
            holder.desc = (TextView) convertView.findViewById(R.id.desc);
            holder.harga = (TextView) convertView.findViewById(R.id.harga);

            convertView.setTag(holder);
        }

        final ViewHolder holder = (ViewHolder) convertView.getTag();

        holder.gambar_item.setImageResource(mImageView);
        holder.nama_item.setText(mName);
        holder.desc.setText(mDesc);
        holder.harga.setText(mPrice);

        return convertView;
    }
}
