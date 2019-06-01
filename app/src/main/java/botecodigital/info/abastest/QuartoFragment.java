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

public class QuartoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.quarto_fragment, container, false);

        TextView tv = view.findViewById(R.id.text4);
        tv.setText("Você está na quarta aba");

        return view;
    }

}
