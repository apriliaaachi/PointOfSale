package com.zyra.pointofsale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Zyra on 28/02/2018.
 */

public class Employee_adapter extends BaseAdapter {

    private Context mContext;
    private int mProfil;
    private String mNama;
    private String mId;
    private  String mCabang;


    public Employee_adapter(Context context, int image_id, String nama, String id, String cabang) {
        mContext = context;
        mProfil = image_id;
        mNama = nama;
        mId = id;
        mCabang = cabang;
    }

    @Override
    public int getCount() {
        return 10;
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
        ImageView Pofil;
        TextView nama;
        TextView id;
        TextView cabang;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row_employee, viewGroup, false);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.Pofil = (ImageView) convertView.findViewById(R.id.employee_gambar);
            viewHolder.nama = (TextView) convertView.findViewById(R.id.employee_nama);
            viewHolder.id = (TextView) convertView.findViewById(R.id.employee_id);
            viewHolder.cabang = (TextView) convertView.findViewById(R.id.employee_cabang);
            convertView.setTag(viewHolder);
        }
        final ViewHolder holder = (ViewHolder) convertView.getTag();

        holder.Pofil.setImageResource(R.drawable.kumis);
        holder.nama.setText("Pak Kumis");
        holder.id.setText("085212345678");
        holder.cabang.setText("Cabang Usaha");


        return convertView;
    }


}
