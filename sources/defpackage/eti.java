package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: eti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class eti extends ihb {
    protected acwd b;

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a((Exception) new etm(status));
    }

    /* access modifiers changed from: protected */
    public abstract void a(eua eua);

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        this.b = acwd;
        a((eua) ((etx) ibf).x());
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj) {
        this.b.a(obj);
    }
}
