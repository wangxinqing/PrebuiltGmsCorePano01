package defpackage;

import android.database.DataSetObserver;

/* renamed from: abo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abo extends DataSetObserver {
    final /* synthetic */ abs a;

    public abo(abs abs) {
        this.a = abs;
    }

    public final void onChanged() {
        if (this.a.e()) {
            this.a.ar();
        }
    }

    public final void onInvalidated() {
        this.a.d();
    }
}
