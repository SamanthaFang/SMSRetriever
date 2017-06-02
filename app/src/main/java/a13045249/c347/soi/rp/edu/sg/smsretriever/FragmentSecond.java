package a13045249.c347.soi.rp.edu.sg.smsretriever;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static a13045249.c347.soi.rp.edu.sg.smsretriever.R.id.tvFrag1;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {

    Button btnRetrieveSMS;
    TextView tvFrag2;
    EditText etwords;


    public FragmentSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        tvFrag2 = (TextView) view.findViewById(R.id.tvFrag2);
        btnRetrieveSMS = (Button) view.findViewById(R.id.btnRetrieveSMS);
        etwords = (EditText) view.findViewById(R.id.etwords);

        btnRetrieveSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag2.getText().toString() + "\n" + "New Data";
                tvFrag2.setText(data);
            }
        });

        return view;
        }

    }


