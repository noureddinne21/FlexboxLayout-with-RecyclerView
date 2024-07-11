package com.nouroeddinne.flexboxlayoutwithrecyclerview;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterItems extends RecyclerView.Adapter<AdapterItems.AdapterItemViewHolder> {

    private List<String> items;

    public AdapterItems(List<String> items) {
        this.items = items;
    }

    @Override
    public AdapterItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new AdapterItemViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(AdapterItemViewHolder holder, int position) {
        holder.tvItem.setText(items.get(position));
        holder.tvItem.setTextColor(Color.parseColor("#ffffff"));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addNewItem(String itemName) {
        items.add(itemName);
        notifyItemInserted(items.size() - 1); // Notify adapter about the new item inserted
    }

    public class AdapterItemViewHolder extends RecyclerView.ViewHolder {

        private TextView tvItem;

        public AdapterItemViewHolder(View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.textView_item);
        }
    }
}












































