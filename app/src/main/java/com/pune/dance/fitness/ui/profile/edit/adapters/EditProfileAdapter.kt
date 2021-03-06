package com.pune.dance.fitness.ui.profile.edit.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.pune.dance.fitness.ui.profile.edit.fragments.EditNameFragment
import com.pune.dance.fitness.ui.profile.edit.fragments.EditProfileDoneFragment

class EditProfileAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> EditNameFragment()
            1 -> EditProfileDoneFragment()
            else -> Fragment()
        }
    }
}