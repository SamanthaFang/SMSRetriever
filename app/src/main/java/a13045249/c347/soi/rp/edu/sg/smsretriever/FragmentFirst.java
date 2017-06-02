package a13045249.c347.soi.rp.edu.sg.smsretriever;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {
    Button btnRetrieveSMS;
    EditText etNumber;
    TextView tvFrag1;

    public FragmentFirst() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = (TextView) view.findViewById(R.id.tvFrag1);
        etNumber = (EditText) view.findViewById(R.id.etNumber);
        btnRetrieveSMS = (Button) view.findViewById(R.id.btnRetrieveSMS);

        btnRetrieveSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data";
                tvFrag1.setText(data);
            }
        });

        return view;


    }

}
