package com.example.tubes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.tubes.R.layout.tshirt_view_adapter;

public class TshirtViewAdapter extends BaseAdapter {

    private Context context;
    private List<Tshirt> result;

    public TshirtViewAdapter(Context context, List<Tshirt> result){
        this.context = context;
        this.result = result;
    }


    @Override
    public int getCount() {
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Tshirt tshirt;

        tshirt = result.get(position);

        if (convertView == null){
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(tshirt_view_adapter,null);
        }

        final TextView namaItem = (TextView)convertView.findViewById(R.id.viewNamaItem);
        final TextView detail = (TextView)convertView.findViewById(R.id.viewDetail);
        final TextView ukuran = (TextView)convertView.findViewById(R.id.viewUkuran);
        final TextView harga = (TextView)convertView.findViewById(R.id.viewHarga);
        final ImageView fotoItem = (ImageView)convertView.findViewById(R.id.viewFotoItem);

        namaItem.setText(tshirt.getNamaItem());
        detail.setText(tshirt.getDetail());
        ukuran.setText(tshirt.getUkuran());
        harga.setText(tshirt.getHarga());
        Picasso.with(context).load(tshirt.getFotoItem()).into(fotoItem);
        return convertView;
    }
}
