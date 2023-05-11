package com.example.calccal;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class weeksAdapter extends RecyclerView.Adapter<weeksAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<weeks> weeks;

    weeksAdapter(Context context, List<weeks> weeks) {
        this.weeks = weeks;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public weeksAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull weeksAdapter.ViewHolder holder, int position) {

        weeks week = weeks.get(position);
        holder.name.setText(week.getName());

    }

    @Override
    public int getItemCount() {
        return weeks.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name_txt);

        }
    }
}
