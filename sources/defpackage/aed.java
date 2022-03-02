package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: aed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aed implements AdapterView.OnItemClickListener {
    final /* synthetic */ SearchView a;

    public aed(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.e(i);
    }
}
