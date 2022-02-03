package com.example.favslistapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCategoryNumber;
    private TextView getTxtCategoryName;

    public CategoryViewHolder(@NonNull View view) {
        super(view);
        txtCategoryNumber = view.findViewById(R.id.category_number_textView);
        getTxtCategoryName = view.findViewById(R.id.category_name_textView);
    }

    public TextView getTxtCategoryNumber() {
        return txtCategoryNumber;
    }

    public TextView getGetTxtCategoryName() {
        return getTxtCategoryName;
    }
}
