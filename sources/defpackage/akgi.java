package defpackage;

import android.database.DataSetObserver;
import com.google.android.pano.widget.ScrollAdapterView;

/* renamed from: akgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgi extends DataSetObserver {
    final /* synthetic */ ScrollAdapterView a;

    public akgi(ScrollAdapterView scrollAdapterView) {
        this.a = scrollAdapterView;
    }

    public final void onChanged() {
        ScrollAdapterView scrollAdapterView = this.a;
        int i = ScrollAdapterView.A;
        scrollAdapterView.d();
    }

    public final void onInvalidated() {
        ScrollAdapterView scrollAdapterView = this.a;
        int i = ScrollAdapterView.A;
        scrollAdapterView.d();
    }
}
