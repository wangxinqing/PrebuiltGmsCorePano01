package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;

/* renamed from: ady  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ady implements View.OnFocusChangeListener {
    final /* synthetic */ SearchView a;

    public ady(SearchView searchView) {
        this.a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
