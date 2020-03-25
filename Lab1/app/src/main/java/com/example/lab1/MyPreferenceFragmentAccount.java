package com.example.lab1;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyPreferenceFragmentAccount extends PreferenceFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragment_preference_account);
    }
}