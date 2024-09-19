package com.example.myapplication.continent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.country.CountryFragment;
import com.example.myapplication.databinding.FragmentContinentBinding;
import com.example.myapplication.interfaces.OnItemClick;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnItemClick {
    private FragmentContinentBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add("Europa");
        continentList.add("Africa");
        continentList.add("Asia");
        continentList.add("North America");
        continentList.add("South America");
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        String continent = continentList.get(position);
        bundle.putString("Continent", continent);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,
                countryFragment).addToBackStack(null).commit();
    }
}
