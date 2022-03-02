package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;
import com.google.android.gms.search.administration.CorpusConfigParcelable;

/* renamed from: pvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvj implements AdapterView.OnItemClickListener {
    final /* synthetic */ pvt a;

    public pvj(pvt pvt) {
        this.a = pvt;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pui pui = this.a.b;
        if (pui != null && i >= 0 && i < pui.getCount()) {
            pug a2 = this.a.b.getItem(i);
            pvt pvt = this.a;
            pvi pvi = new pvi();
            CorpusConfigParcelable corpusConfigParcelable = a2.a;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", corpusConfigParcelable.a);
            bundle.putString("corpusName", corpusConfigParcelable.b);
            bundle.putString("indexableType", pue.a(corpusConfigParcelable.c));
            pvi.setArguments(bundle);
            pvt.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.debug_container, pvi, "indexablesFragment").addToBackStack((String) null).commit();
        }
    }
}
