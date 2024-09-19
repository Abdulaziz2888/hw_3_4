package com.example.myapplication.country;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.myapplication.databinding.FragmentCountryBinding;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<CountryModel> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        assert getArguments() != null;
        String argument = getArguments().getString("Continent");
        assert argument != null;
        loadData(argument);
        binding.rvCountry.setAdapter(countryAdapter);
    }

    public void loadData(String argument) {
        switch (argument) {
            case "Europa":
                countryList.add(new CountryModel("France", "https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png", "Paris"));
                countryList.add(new CountryModel("Italy", "https://upload.wikimedia.org/wikipedia/commons/e/e4/Flag_of_Italy_%281946%E2%80%932003%29.png", "Rome"));
                countryList.add(new CountryModel("Germany", "https://upload.wikimedia.org/wikipedia/commons/3/3d/Flag_of_germany_800_480.png", "Berlin"));
                countryList.add(new CountryModel("Poland", "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poland_flag_300.png", "Warsaw"));
                countryList.add(new CountryModel("United Kingdom", "https://upload.wikimedia.org/wikipedia/commons/4/42/Flag_of_the_United_Kingdom.png", "London"));
                break;
            case "Africa":
                countryList.add(new CountryModel("Nigeria", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png", "Abuja"));
                countryList.add(new CountryModel("Egypt", "https://upload.wikimedia.org/wikipedia/commons/1/10/Egypt_flag_300.png", "Cairo"));
                countryList.add(new CountryModel("Kenya", "https://upload.wikimedia.org/wikipedia/commons/9/98/Flag_of_Kenya.png", "Nairobi"));
                countryList.add(new CountryModel("Algeria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeF_SNbNZlD3n4sqm051v2F87KhAB_TDaUbNiJ4TClMw&s", "Algiers"));
                countryList.add(new CountryModel("Sudan", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Sudan.png", "Khartoum"));
                break;
            case "Asia":
                countryList.add(new CountryModel("India", "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1280px-Flag_of_India.svg.png", "New Delhi"));
                countryList.add(new CountryModel("Pakistan", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Pakistan.png/1024px-Flag_of_Pakistan.png", "Islamabad"));
                countryList.add(new CountryModel("Japan", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/2560px-Flag_of_Japan.svg.png", "Tokyo"));
                countryList.add(new CountryModel("Iran", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Iran_flag_300.png", "Teheran"));
                countryList.add(new CountryModel("Saudi Arabia", "https://upload.wikimedia.org/wikipedia/commons/2/23/Flag_of_Saudi_Arabia.png", "Riyadh"));
                break;
            case "North America":
                countryList.add(new CountryModel("USA", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_the_United_States.png/1280px-Flag_of_the_United_States.png", "Washington"));
                countryList.add(new CountryModel("Mexico", "https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png", "Mexico City"));
                countryList.add(new CountryModel("Canada", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Flag_of_Canada.png/1200px-Flag_of_Canada.png", "Ottawa"));
                countryList.add(new CountryModel("Jamaica", "https://upload.wikimedia.org/wikipedia/commons/b/b4/Flag_of_Jamaica.png", "Kingston"));
                countryList.add(new CountryModel("Cuba", "https://upload.wikimedia.org/wikipedia/commons/9/92/Flag_of_Cuba.png", "Havana"));
                break;
            case "South America":
                countryList.add(new CountryModel("Brazil", "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/2560px-Flag_of_Brazil.svg.png", "Brasília"));
                countryList.add(new CountryModel("Colombia", "https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png", "Bogotá"));
                countryList.add(new CountryModel("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/1280px-Flag_of_Argentina.svg.png", "Buenos Aires"));
                countryList.add(new CountryModel("Peru", "https://upload.wikimedia.org/wikipedia/commons/2/2d/Flag_of_Peru.png", "Lima"));
                countryList.add(new CountryModel("Ecuador", "https://upload.wikimedia.org/wikipedia/commons/9/96/Flag_of_Ecuador.png", "Quito"));
                break;
        }
    }
}
