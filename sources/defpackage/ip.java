package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: ip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ip implements AdapterView.OnItemClickListener {
    final /* synthetic */ iq a;

    public ip(iq iqVar) {
        this.a = iqVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.onListItemClick((ListView) adapterView, view, i, j);
    }
}
