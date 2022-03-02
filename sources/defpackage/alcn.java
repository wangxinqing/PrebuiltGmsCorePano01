package defpackage;

import android.database.DataSetObserver;

/* renamed from: alcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alcn extends DataSetObserver {
    final /* synthetic */ alcp a;

    public alcn(alcp alcp) {
        this.a = alcp;
    }

    public final void onChanged() {
        alcp alcp = this.a;
        alcp.e = alcp.f;
        alcp.f = alcp.a.getCount();
    }

    public final void onInvalidated() {
        alcp alcp = this.a;
        alcp.f = 0;
        alcp.e = 0;
    }
}
