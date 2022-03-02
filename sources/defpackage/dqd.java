package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;

/* renamed from: dqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqd extends Fragment {
    public dqk a;
    public TextView b;
    private RecyclerView c;

    /* access modifiers changed from: package-private */
    public final void a() {
        getLoaderManager().restartLoader(0, (Bundle) null, this.a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new dqk(getActivity(), jed.c(System.currentTimeMillis()).longValue());
        getLoaderManager().initLoader(0, (Bundle) null, this.a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.common_detailed_network_usage_breakage, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.network_time_range_text);
        Spinner spinner = (Spinner) inflate.findViewById(R.id.network_time_range_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367048, new String[]{"Today", "Last 7 days", "Last 30 days"});
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new dqc(this));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.network_usage_recycler_view);
        this.c = recyclerView;
        dqk dqk = this.a;
        WeakReference weakReference = dqk.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        dqk.g = new WeakReference(recyclerView);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new abk());
        recyclerView.setAdapter(dqk);
        return inflate;
    }
}
