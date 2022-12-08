package com.example.quizz_v1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizz_v1.databinding.FragmentInfomationBinding;

public class Infomation extends Fragment {

   FragmentInfomationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentInfomationBinding.inflate(inflater, container, false);
        String info = ("<h1>Nhóm phát triển:</h1><ul><li>Lâm Thiên Phong</li><li>Vũ Huy Tùng</li></ul>"+
                        "<h2>Thông tin liên hệ:</h2><ul><li>20021567@vnu.edu.vn</li><li>20021598@vnu.edu.nv</li></ul>");
        binding.textInfo.setText(android.text.Html.fromHtml(info));
        return binding.getRoot();
    }
}