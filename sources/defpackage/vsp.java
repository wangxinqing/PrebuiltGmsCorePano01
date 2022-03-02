package defpackage;

import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

/* renamed from: vsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vsp implements igp {
    private final wbb a;
    private final int b;

    public vsp(wbb wbb, int i) {
        this.a = wbb;
        this.b = i;
    }

    public final void a(Object obj, Object obj2) {
        wbb wbb = this.a;
        int i = this.b;
        int i2 = vts.a;
        wae wae = new wae();
        RegisterReceiveSurfaceParams registerReceiveSurfaceParams = wae.a;
        registerReceiveSurfaceParams.a = wbb;
        registerReceiveSurfaceParams.b = i;
        ifu b2 = vts.b((acwd) obj2);
        RegisterReceiveSurfaceParams registerReceiveSurfaceParams2 = wae.a;
        registerReceiveSurfaceParams2.c = b2;
        ((vyk) ((waz) obj).x()).a(registerReceiveSurfaceParams2);
    }
}
