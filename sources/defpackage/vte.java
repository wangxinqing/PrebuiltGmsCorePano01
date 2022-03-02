package defpackage;

import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;

/* renamed from: vte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vte implements igp {
    private final boolean a;

    public vte(boolean z) {
        this.a = z;
    }

    public final void a(Object obj, Object obj2) {
        boolean z = this.a;
        int i = vts.a;
        wat wat = new wat();
        wat.a.a = z;
        ifu b = vts.b((acwd) obj2);
        SetEnabledParams setEnabledParams = wat.a;
        setEnabledParams.b = b;
        ((vyk) ((waz) obj).x()).a(setEnabledParams);
    }
}
