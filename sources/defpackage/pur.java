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

/* renamed from: pur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pur extends Fragment {
    public pum a;
    private List b;
    private ListView c;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.generic_list_fragment, viewGroup, false);
        this.c = (ListView) inflate.findViewById(R.id.generic_list_view);
        this.b = new ArrayList();
        pum pum = new pum(getActivity(), this.b);
        this.a = pum;
        this.c.setAdapter(pum);
        this.c.setEmptyView(inflate.findViewById(R.id.no_items_message));
        ((TextView) inflate.findViewById(R.id.no_items_message)).setText(R.string.no_errors);
        this.c.setOnItemClickListener(new puq(this));
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        getActivity().setTitle((int) R.string.errors_title);
        String string = getArguments().getString("callType");
        String string2 = getContext().getString(getArguments().getInt("errorCode"));
        sg aE = ((bjs) getActivity()).aE();
        if (aE != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(": ");
            sb.append(string2);
            aE.b((CharSequence) sb.toString());
        }
        this.b.clear();
        this.b.addAll(getArguments().getParcelableArrayList("errors"));
        this.a.notifyDataSetChanged();
    }
}
