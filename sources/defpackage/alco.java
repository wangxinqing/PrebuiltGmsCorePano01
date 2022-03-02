package defpackage;

import android.database.DataSetObserver;

/* renamed from: alco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alco extends DataSetObserver {
    final /* synthetic */ aci a;

    public alco(aci aci) {
        this.a = aci;
    }

    public final void onChanged() {
        this.a.a();
    }

    public final void onInvalidated() {
        this.a.a();
    }
}
