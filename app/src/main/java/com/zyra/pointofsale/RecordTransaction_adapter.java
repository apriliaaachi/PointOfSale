package com.zyra.pointofsale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Zyra on 06/03/2018.
 */

public class RecordTransaction_adapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;

    public RecordTransaction_adapter(Context m) {
        mContext = m;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        TextView Price;
        TextView IdTransaction;
        ImageButton right;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.list_row_record, viewGroup, false);

            ViewHolder holder = new ViewHolder();
            holder.Price = (TextView) convertView.findViewById(R.id.harga_recorded);
            holder.IdTransaction = (TextView) convertView.findViewById(R.id.id);
            holder.right = (ImageButton) convertView.findViewById(R.id.imageButton2);

            convertView.setTag(holder);
        }
        final ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.Price.setText("Rp 900.000");
        holder.IdTransaction.setText("Id Transaksi");
        holder.right.setImageResource(R.drawable.ic_chevron_right_black_24dp);



        return convertView;

    }
}
