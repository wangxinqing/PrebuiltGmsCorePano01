package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: hhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhs extends ihb {
    final /* synthetic */ List a;
    final /* synthetic */ Bundle b;

    public hhs(List list, Bundle bundle) {
        this.a = list;
        this.b = bundle;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        hjx hjx = (hjx) ((hjr) ibf).x();
        hjz hjz = new hjz((auef) auum.b.c(7), acwd);
        List list = this.a;
        Bundle bundle = this.b;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        hjx.a((hju) hjz, list, bundle);
    }
}
