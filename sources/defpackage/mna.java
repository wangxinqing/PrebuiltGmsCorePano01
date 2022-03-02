package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mna extends Fragment implements mfz {
    public mmz a;
    public int b;
    public String c;
    private View d;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = getArguments().getInt("desiredRole");
        this.c = getArguments().getString("memberId");
        Toolbar toolbar = (Toolbar) this.d.findViewById(R.id.fm_toolbar);
        if (toolbar != null) {
            mfo.a(this.d, toolbar.p);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.a = (mmz) mfy.a(mmz.class, getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fm_fragment_v2_management_content, viewGroup, false);
        this.d = inflate;
        inflate.findViewById(R.id.fm_management_content_screen).setVisibility(0);
        this.d.findViewById(R.id.fm_management_loading_screen).setVisibility(8);
        PageData pageData = (PageData) getArguments().getParcelable("pageData");
        String string = getArguments().getString("accountName");
        if (pageData.a.containsKey(28)) {
            mgj.a((Toolbar) this.d.findViewById(R.id.fm_toolbar), (String) pageData.a.get(28), getActivity());
        }
        if (pageData.a.containsKey(3)) {
            mgh.a((TextView) this.d.findViewById(R.id.fm_management_body_text), (String) pageData.a.get(3), new mgb(pageData, this, string));
        }
        Button button = (Button) this.d.findViewById(R.id.fm_management_action_button);
        if (pageData.a.containsKey(4)) {
            button.setText((CharSequence) pageData.a.get(4));
        }
        button.setOnClickListener(new mmx(this));
        Button button2 = (Button) this.d.findViewById(R.id.fm_management_cancel_button);
        if (pageData.a.containsKey(5)) {
            button2.setText((CharSequence) pageData.a.get(5));
        }
        button2.setOnClickListener(new mmy(this));
        return this.d;
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
