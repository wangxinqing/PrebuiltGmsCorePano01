package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;

/* renamed from: pvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvc implements AdapterView.OnItemClickListener {
    final /* synthetic */ pvi a;

    public pvc(pvi pvi) {
        this.a = pvi;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        puz puz = this.a.a;
        if (puz != null && i >= 0 && i < puz.getCount()) {
            pux a2 = this.a.a.getItem(i);
            pvi pvi = this.a;
            puv puv = new puv();
            Bundle bundle = new Bundle();
            bundle.putString("indexableName", a2.a);
            bundle.putString("indexableUrl", a2.b);
            bundle.putLong("createdTimestamp", a2.c);
            bundle.putLong("accessedTimestamp", a2.d);
            bundle.putString("packageName", a2.e);
            bundle.putString("corpusName", a2.f);
            bundle.putString("indexableType", a2.g);
            puv.setArguments(bundle);
            pvi.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, puv, "indexableInfoFragment").addToBackStack((String) null).commit();
        }
    }
}
