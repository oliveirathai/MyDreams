package botecodigital.info.abastest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rodrigo on 26/01/18.
 */

public class SetimoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.setimo_fragment, container, false);

        TextView tv = view.findViewById(R.id.text7);
        tv.setText("Você está na setima aba");

        return view;
    }

}
