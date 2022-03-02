package defpackage;

import android.content.Context;

/* renamed from: yri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yri extends ybp implements icm {
    boolean a;

    public yri(Context context, String str, String str2, String str3, String str4) {
        super(context, str, str2, str3, str4, 1);
    }

    /* access modifiers changed from: protected */
    public final void a(icc icc) {
        if (!this.a) {
            this.a = true;
            ibq ibq = wlt.a;
            xdr.a(icc, this.i, this.j, 0, false);
        }
        ibq ibq2 = wlt.a;
        xco.a(icc, this.i, this.j).a((icm) this);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        this.a = false;
        super.onForceLoad();
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        xaa xaa;
        wla wla = (wla) icl;
        xfh b = wla.b();
        if (!wla.aO().c()) {
            a(wla.aO(), (ilh) b);
            return;
        }
        if (b == null || b.a() != 1) {
            xaa = null;
        } else {
            xaa = b.a(0);
        }
        if (xaa == null) {
            a(ybp.h, (ilh) null);
            b.c();
            return;
        }
        a(wla.aO(), (ilh) b);
    }
}
