package org.kashiyatra.kashiyatra18.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import org.kashiyatra.kashiyatra18.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RulesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RulesFragment extends Fragment {

    private static final String ARG_EVENT_POSITION = "event_position", ARG_SUBEVENT_POSITION = "subevent_position";
    private int mEventPosition;
    private int mSubeventPosition;

    public RulesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param eventPosition Event Position.
     * @param subeventPosition Subevent Postion
     * @return A new instance of fragment RulesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RulesFragment newInstance(int eventPosition, int subeventPosition) {
        RulesFragment fragment = new RulesFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_EVENT_POSITION, eventPosition);
        args.putInt(ARG_SUBEVENT_POSITION, subeventPosition);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mEventPosition = getArguments().getInt(ARG_EVENT_POSITION);
            mSubeventPosition = getArguments().getInt(ARG_SUBEVENT_POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_rules, container, false);
        WebView rulesTextView = rootView.findViewById(R.id.rules_text_view);

        String rules;
        switch (mEventPosition) {
            case 0:
                rules = getResources().getStringArray(R.array.bandish_subevent_rules)[mSubeventPosition];
                break;
            case 1:
                rules = getResources().getStringArray(R.array.enquizta_subevent_rules)[mSubeventPosition];
                break;
            case 2:
                rules = getResources().getStringArray(R.array.mirage_subevent_rules)[mSubeventPosition];
                break;
            case 3:
                rules = getResources().getStringArray(R.array.samwaad_subevent_rules)[mSubeventPosition];
                break;
            case 4:
                rules = getResources().getStringArray(R.array.abhinay_subevent_rules)[mSubeventPosition];
                break;
            case 5:
                rules = getResources().getStringArray(R.array.toolika_subevent_rules)[mSubeventPosition];
                break;
            case 6:
                rules = getResources().getStringArray(R.array.natraj_subevent_rules)[mSubeventPosition];
                break;
            case 7:
                rules = getResources().getStringArray(R.array.crosswindz_subevent_rules)[mSubeventPosition];
                break;
            default:
                rules = getResources().getStringArray(R.array.bandish_subevent_rules)[mSubeventPosition];
                break;
        }
        rulesTextView.loadData(rules, "text/html", "utf-8");
        return rootView;
    }

}
