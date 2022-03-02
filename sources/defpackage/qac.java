package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: qac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qac {
    public static final qab a = new qab(new Intent("com.google.android.gsf.notouch.LAUNCH_AUTH_UI").setPackage("com.google.android.gsf.notouch"), amrq.ALWAYS_TRUE);
    private static final qab d = new qab(new Intent("com.google.android.gms.auth.account.authenticator.tv.service.START").setPackage("com.google.android.gms"), pzz.a);
    private static final qab e = new qab(new Intent("com.google.android.gms.auth.account.authenticator.WearableAuthDelegateService.AUTH_UI").setPackage("com.google.android.gms"), qaa.a);
    private static final qab f;
    private static final amzy g;
    public final Context b;
    public final Intent c;

    static {
        qab qab = new qab(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateService"), amrq.ALWAYS_TRUE);
        f = qab;
        g = amzy.a(d, a, e, qab);
    }

    public qac(Context context) {
        this.b = context;
        anhk i = g.listIterator();
        while (i.hasNext()) {
            amri a2 = ((qab) i.next()).a(context);
            if (a2.a()) {
                this.c = (Intent) a2.b();
                return;
            }
        }
        throw new IllegalStateException("Unable to get the service intent for auth UI delegate.");
    }
}
