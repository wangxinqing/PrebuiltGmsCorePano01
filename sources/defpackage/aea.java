package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* renamed from: aea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aea implements View.OnClickListener {
    final /* synthetic */ SearchView a;

    public aea(SearchView searchView) {
        this.a = searchView;
    }

    public void onClick(View view) {
        SearchView searchView = this.a;
        if (view == searchView.c) {
            searchView.l();
        } else if (view == searchView.e) {
            searchView.k();
        } else if (view == searchView.d) {
            searchView.j();
        } else if (view == searchView.i) {
            searchView.m();
        } else if (view == searchView.a) {
            searchView.n();
        }
    }
}
