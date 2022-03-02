package defpackage;

import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

/* renamed from: vsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsn implements igp {
    private final wbb a;
    private final vxi b;
    private final int c;

    public vsn(wbb wbb, vxi vxi, int i) {
        this.a = wbb;
        this.b = vxi;
        this.c = i;
    }

    public final void a(Object obj, Object obj2) {
        wbb wbb = this.a;
        vxi vxi = this.b;
        int i = this.c;
        int i2 = vts.a;
        wag wag = new wag();
        RegisterSendSurfaceParams registerSendSurfaceParams = wag.a;
        registerSendSurfaceParams.a = wbb;
        registerSendSurfaceParams.b = vxi;
        registerSendSurfaceParams.c = i;
        ifu b2 = vts.b((acwd) obj2);
        RegisterSendSurfaceParams registerSendSurfaceParams2 = wag.a;
        registerSendSurfaceParams2.d = b2;
        ((vyk) ((waz) obj).x()).a(registerSendSurfaceParams2);
    }
}
