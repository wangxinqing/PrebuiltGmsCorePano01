package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwn extends Fragment {
    public pwg a;
    private List b;
    private ListView c;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_list_fragment, viewGroup, false);
        this.c = (ListView) inflate.findViewById(R.id.generic_list_view);
        this.b = new ArrayList();
        pwg pwg = new pwg(getActivity(), this.b);
        this.a = pwg;
        this.c.setAdapter(pwg);
        this.c.setEmptyView(inflate.findViewById(R.id.no_items_message));
        ((TextView) inflate.findViewById(R.id.no_items_message)).setText(getActivity().getString(R.string.no_user_actions, new Object[]{"User Actions"}));
        this.c.setOnItemClickListener(new pwm(this));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((CharSequence) "User Actions");
        String string = getArguments().getString("actionType");
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            aE.b((CharSequence) string);
        }
        this.b.clear();
        this.b.addAll(getArguments().getParcelableArrayList("userActions"));
        this.a.notifyDataSetChanged();
    }
}
