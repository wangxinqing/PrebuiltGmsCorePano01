package defpackage;

import android.content.Context;

/* renamed from: agye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agye extends agya {
    private final icc a;
    private final hol b;

    public agye(Context context, String str) {
        ibz ibz = new ibz(context);
        ibz.a(hol.a);
        if (str != null) {
            ibz.a(str);
        }
        icc b2 = ibz.b();
        this.a = b2;
        b2.a((ica) new agyd());
        this.a.a(agyb.a);
        this.a.e();
        this.b = new hol(context, 44, "", str, "", false, hsm.a(context), new htc(context));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.g();
    }

    /* access modifiers changed from: protected */
    public final void a(alzn alzn) {
        this.b.a(alzn.k()).b().a(agyc.a);
    }
}
