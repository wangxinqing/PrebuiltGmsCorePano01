package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CleanSharedSecretChimeraService extends qwf {
    private static final Executor a = jfm.b(10);
    private static final jje b = aboj.a;

    public static void a(Context context) {
        long g = azkf.a.a().g();
        long seconds = TimeUnit.HOURS.toSeconds(12);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        qxf.k = "cleanWorkProfile";
        qxf.a(g, seconds + g);
        qxf.b(1);
        qxf.n = true;
        ((qwq) b.a(context)).a((qxx) qxf.b());
    }

    public static void b(Context context) {
        long M = azlf.a.a().M();
        long seconds = TimeUnit.HOURS.toSeconds(1);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        qxf.k = "cleanSharedSecret";
        qxf.b(1);
        qxf.a(M, seconds + M);
        qxf.n = true;
        ((qwq) b.a(context)).a((qxx) qxf.b());
    }

    public static void c(Context context) {
        long a2 = azki.a.a().a();
        long seconds = TimeUnit.HOURS.toSeconds(12);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.smartdevice.d2d.CleanSharedSecretService";
        qxf.k = "cleanEsimActivation";
        qxf.a(a2, seconds + a2);
        qxf.b(1);
        qxf.n = true;
        ((qwq) b.a(context)).a((qxx) qxf.b());
    }

    public final void aH() {
        a.execute(new abog(this));
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        abna a2 = abpo.a(this);
        if ("cleanSharedSecret".equals(str)) {
            aceb aceb = new aceb(this);
            long j = aceb.a.getLong("session", 0);
            aceb.a.edit().remove("sharedSecret").remove("session").apply();
            acad acad = aceb.b;
            acad.a(3);
            acad.a(j);
            acad.a();
        }
        if ("cleanWorkProfile".equals(str) && b()) {
            new abzy(this, new qvr(Looper.getMainLooper())).a.edit().clear().apply();
            ((ahgz) a2.b.a()).b(new Object[0]);
        }
        if ("cleanEsimActivation".equals(str)) {
            new abpg(this).a.edit().clear().apply();
        }
        return 0;
    }

    public static boolean b() {
        int i = Build.VERSION.SDK_INT;
        return azkf.a.a().e();
    }
}
