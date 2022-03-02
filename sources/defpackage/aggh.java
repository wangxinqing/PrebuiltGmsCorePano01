package defpackage;

import android.app.Application;

/* renamed from: aggh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aggh implements amsv {
    private final Application a;

    public aggh(Application application) {
        this.a = application;
    }

    public final Object a() {
        return this.a.getSharedPreferences("primes", 0);
    }
}
