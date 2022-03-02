package defpackage;

import android.os.Parcel;

/* renamed from: gto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gto implements igp {
    static final igp a = new gto();

    private gto() {
    }

    public final void a(Object obj, Object obj2) {
        gup k = ((gui) obj).k();
        Parcel a2 = k.a(3, k.aQ());
        boolean a3 = bhx.a(a2);
        a2.recycle();
        ((acwd) obj2).a((Object) Boolean.valueOf(a3));
    }
}
