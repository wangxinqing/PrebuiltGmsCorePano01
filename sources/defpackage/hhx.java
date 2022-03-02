package defpackage;

import android.os.Bundle;

/* renamed from: hhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhx extends ihb {
    final /* synthetic */ audx a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ hhy c;

    public hhx(hhy hhy, audx audx, Bundle bundle) {
        this.c = hhy;
        this.a = audx;
        this.b = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("entity", this.a.k());
        hjx hjx = (hjx) ((hjr) ibf).x();
        hka hka = new hka(acwd);
        int i = this.c.b;
        Bundle bundle2 = this.b;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        hjx.b((ifu) hka, i, bundle, bundle2);
    }
}
