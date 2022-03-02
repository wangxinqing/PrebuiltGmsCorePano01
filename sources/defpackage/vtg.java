package defpackage;

import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;

/* renamed from: vtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vtg implements igp {
    private final int a;

    public vtg(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        int i = this.a;
        int i2 = vts.a;
        wap wap = new wap();
        wap.a.a = i;
        ifu b = vts.b((acwd) obj2);
        SetDataUsageParams setDataUsageParams = wap.a;
        setDataUsageParams.b = b;
        ((vyk) ((waz) obj).x()).a(setDataUsageParams);
    }
}
