package defpackage;

import android.database.Cursor;
import android.support.v7.widget.SearchView;

/* renamed from: adx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adx implements Runnable {
    final /* synthetic */ SearchView a;

    public adx(SearchView searchView) {
        this.a = searchView;
    }

    public final void run() {
        ahu ahu = this.a.q;
        if (ahu instanceof aeo) {
            ahu.a((Cursor) null);
        }
    }
}
