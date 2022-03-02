package com.google.android.gms.drive.api.operations;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UninstallPackageIntentOperation extends hed {
    private static final ith a = new ith("UninstallPackageIntentO", "");

    public UninstallPackageIntentOperation() {
        super(false);
    }

    /* access modifiers changed from: protected */
    public final void d(String str) {
        kkb kkb;
        Context applicationContext = getApplicationContext();
        if (!jhg.g(applicationContext, str)) {
            try {
                jzk.b(applicationContext);
                lsm a2 = lsm.a();
                kkf kkf = a2.d;
                kkb = ((kjp) kkf).a;
                kkb.b();
                ((kjp) kkf).a.a(kli.a, klh.PACKAGE_NAME.j.b(str));
                ((kjr) kkf).g();
                kkb.f();
                kjr.c.a("Uninstalled %s", str);
                kkb.d();
                a2.p.a();
            } catch (InterruptedException e) {
                a.c("UninstallPackageIntentO", String.format("Interrupted while uninstalling %s", new Object[]{str}), e);
            } catch (Throwable th) {
                kkb.d();
                throw th;
            }
        } else {
            a.b("UninstallPackageIntentO", "Package still installed %s", str);
        }
    }
}
