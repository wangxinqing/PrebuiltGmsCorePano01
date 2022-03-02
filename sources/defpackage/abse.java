package defpackage;

import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: abse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abse implements Runnable {
    private final absf a;

    public abse(absf absf) {
        this.a = absf;
    }

    public final void run() {
        acah acah = this.a.b;
        acah.d.b();
        try {
            acag.a(acah.b, acah.h);
        } catch (InvalidConfigException e) {
            acah.a.a((Throwable) e);
        }
    }
}
