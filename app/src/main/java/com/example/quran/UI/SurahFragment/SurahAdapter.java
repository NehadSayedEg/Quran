package com.example.quran.UI.SurahFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quran.Database.Data.SurahEntry;
import com.example.quran.POJO.Surah;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.quran.R;

import java.util.ArrayList;

    public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahViewHolder> {
        private Context mContext;
        private ArrayList<SurahEntry> surahList;
       // private ArrayList<Ayah> ayahList;



        public SurahAdapter(Context mContext, ArrayList<SurahEntry> surahList ) {
            this.mContext = mContext;
            this.surahList = surahList;
        }

        @NonNull
        @Override
        public SurahAdapter.SurahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          // View view = LayoutInflater.from(mContext).inflate(R.layout.surah_item, parent,false);
        //  SurahViewHolder holder = new SurahViewHolder(view);
          return new SurahViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.surah_item, parent, false));
           // return holder;

        }

        @Override
        public void onBindViewHolder(@NonNull SurahViewHolder holder, int position ) {


            holder.surahArabicName.setText(surahList.get(position).getName());
            holder.surahEnglishcName.setText(surahList.get(position).getEnglishName());

            String surahNumber  = Integer.toString(surahList.get(position).getNumber());
            holder.surahNumber.setText(surahNumber);

//        for (int i = 0; i < ayahList.size(); i++) {
//
//            String sajda = ayahList.get(position).getSajda().toString();
//
//
//            if (sajda.equals("true")) {
//                Glide
//                        .with(holder..getContext())
//                        .load(R.drawable.maka)
//                        .centerCrop()
//                        .placeholder(R.drawable.maka)
//                        .into(holder.surahtype);

            //        }
            //     }


            //  holder.surahNumber.setText(surahList.get(position).getNumber());



            for (int i = 0; i < surahList.size(); i++) {
                String surahType = surahList.get(position).getRevelationType();



                if (surahType.equals("Meccan")) {

                    Glide
                            .with(holder.surahtype.getContext())
                          //  .with((mContext))
                            .load(R.drawable.maka)
                            .centerCrop()
                            .placeholder(R.drawable.maka)
                            .into(holder.surahtype);


                }
                if (surahType.equals("Medinan")) {
                    Glide
                            .with(holder.surahtype.getContext())
                           //.with((mContext))
                            .load(R.drawable.madyna)
                            .centerCrop()
                            .placeholder(R.drawable.madyna)
                            .into(holder.surahtype);

                }
            }

        }
        @Override
        public int getItemCount() {
            if (surahList != null) {

                return surahList.size();
            }

            return 0;

            //  return surahList.size();
        }


        public class SurahViewHolder extends RecyclerView.ViewHolder {
            TextView surahArabicName;
            TextView surahEnglishcName;
            TextView surahNumber;
            ImageView surahtype;

            public SurahViewHolder(@NonNull View itemView) {
                super(itemView);
                surahArabicName = itemView.findViewById(R.id.surahArabicName);
                surahEnglishcName = itemView.findViewById(R.id.surahEnglishName);
                surahNumber = itemView.findViewById(R.id.surahNO);
                surahtype = itemView.findViewById(R.id.surahType);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            SurahEntry clickedDataItem = surahList.get(pos);

                        }
                    }
                });

            }
        }

    }




