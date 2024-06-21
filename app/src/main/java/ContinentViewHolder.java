import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemContinentBinding;

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Continent continent) {
        binding.tvContinent.setText(continent.getNameContinent());
        Glide.with(binding.imgContinent).load(continent.getImgContinent()).into(binding.imgContinent);

    }
}