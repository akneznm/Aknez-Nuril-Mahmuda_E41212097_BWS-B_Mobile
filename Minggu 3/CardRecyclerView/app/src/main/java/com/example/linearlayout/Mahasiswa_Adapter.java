package com.example.linearlayout;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mahasiswa_Adapter extends RecyclerView.Adapter<Mahasiswa_Adapter.MahasiswaViewHolder> {
    private ArrayList<Mahasiswa> dataList;
    public Mahasiswa_Adapter(ArrayList<Mahasiswa> dataList){
        this.dataList = dataList;
    }
    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
}
