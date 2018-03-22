package id.sch.smktelkom_mlg.learn.recyclerview3.adapter;


import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview3.R;
import id.sch.smktelkom_mlg.learn.recyclerview3.model.Hotel2;




/**
 * Created by Mokleters on 31/10/2016.
 */


public class HotelAdapter2 extends RecyclerView.Adapter<HotelAdapter2.ViewHolder> {

    ArrayList<Hotel2> hotelList;
    IHotelAdapter mIHotelAdapter;


    public HotelAdapter2(Context context, ArrayList<Hotel2> hotelList) {
        this.hotelList = hotelList;
        mIHotelAdapter = (IHotelAdapter) context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list2, parent, false);
        ViewHolder vh = new ViewHolder(V);
        return vh;


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel2 hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul2);
        holder.tvDeskripsi.setText(hotel.deskripsi2);
        holder.ivFoto.setImageURI(Uri.parse(hotel.foto2));




    }

    @Override
    public int getItemCount() {
        if (hotelList != null)
            return hotelList.size();
        return 0;
    }

    public interface IHotelAdapter {
        void doClick(int pos);

        void doFav(int pos);

        void doShare(int pos);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;
        ImageButton ibFav;
        ImageButton ibShare;



        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
            ibFav = (ImageButton) itemView.findViewById(R.id.buttonFavorite);
            ibShare = (ImageButton) itemView.findViewById(R.id.buttonShare);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIHotelAdapter.doClick(getAdapterPosition());
                }
            });

            ibFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIHotelAdapter.doFav(getAdapterPosition());
                }
            });
            ibShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIHotelAdapter.doShare(getAdapterPosition());
                }
            });



        }
    }


}