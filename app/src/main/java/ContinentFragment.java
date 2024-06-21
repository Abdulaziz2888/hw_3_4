import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnItemClick {
    public FragmentContinentBinding binding;
    private ArrayList<Continent> continentList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList,this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new Continent("Eurasia","https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/BlankMap-Eurasia.svg/800px-BlankMap-Eurasia.svg.png"));
        continentList.add(new Continent("Africa","https://images.vexels.com/media/users/3/130675/isolated/preview/75103978ea193d795fbcb2ede829c0ff-green-africa-continental-map.png"));
        continentList.add(new Continent("Australia","https://illustoon.com/photo/830.png"));
        continentList.add(new Continent("South America","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/South_America.svg/1200px-South_America.svg.png"));
        continentList.add(new Continent("North America","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/North_America.svg/1200px-North_America.svg.png"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("keyForPosition", String.valueOf(position));
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,countryFragment).addToBackStack(null).commit();

    }
}
