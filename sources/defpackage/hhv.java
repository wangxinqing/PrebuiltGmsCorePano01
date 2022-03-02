package defpackage;

import android.os.Bundle;

/* renamed from: hhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hhv extends ihb {
    final /* synthetic */ Bundle a;
    final /* synthetic */ hhy b;

    public hhv(hhy hhy, Bundle bundle) {
        this.b = hhy;
        this.a = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        hjx hjx = (hjx) ((hjr) ibf).x();
        hjz hjz = new hjz(this.b.a, acwd);
        int i = this.b.b;
        Bundle bundle = this.a;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        hjx.a((hju) hjz, i, bundle);
    }
}
