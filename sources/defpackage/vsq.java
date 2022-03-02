package defpackage;

import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

/* renamed from: vsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsq implements igp {
    private final wbb a;

    public vsq(wbb wbb) {
        this.a = wbb;
    }

    public final void a(Object obj, Object obj2) {
        wbb wbb = this.a;
        int i = vts.a;
        wbg wbg = new wbg();
        wbg.a(wbb);
        ifu c = vts.c((acwd) obj2);
        UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams = wbg.a;
        unregisterReceiveSurfaceParams.b = c;
        ((vyk) ((waz) obj).x()).a(unregisterReceiveSurfaceParams);
        wbb.a();
    }
}
