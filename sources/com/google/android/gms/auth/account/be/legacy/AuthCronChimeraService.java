package com.google.android.gms.auth.account.be.legacy;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthCronChimeraService extends qwf {
    public static final iwd a = new iwd("GLSService", "[AuthCronService]");
    private static final iwd b = ehv.a("AuthCronChimeraService");

    public final int a(qxz qxz) {
        String str = qxz.a;
        if ("buffered_logs_update".equals(str)) {
            Context applicationContext = getApplicationContext();
            aljy a2 = aljy.a(getApplicationContext());
            aljz aljz = new aljz(getApplicationContext(), "ANDROID_AUTH");
            String a3 = goj.a(applicationContext);
            b.b("Uploading buffered logs to clearcut", new Object[0]);
            aljz.a(a3);
            a2.a(a3);
            return 0;
        } else if ("auth_droidguard_recurring_run".equals(str)) {
            try {
                return ((Integer) jfm.b(9).b(new eln(this)).get((long) ent.J(), TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                return 1;
            }
        } else {
            b.d("Unknown tag %s", str);
            return 2;
        }
    }

    public final void aH() {
        elo.a.c(this);
    }

    public final void a(long j, int i) {
        if (((double) new Random().nextFloat()) < ent.I()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 18;
            anon.a |= 1;
            aucd o2 = anop.d.o();
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anop anop = (anop) o2.b;
            int i2 = anop.a | 2;
            anop.a = i2;
            anop.c = elapsedRealtime;
            anop.b = i - 1;
            anop.a = i2 | 1;
            anop anop2 = (anop) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon2 = (anon) o.b;
            anop2.getClass();
            anon2.p = anop2;
            anon2.a |= 1048576;
            new hol(this, "ANDROID_AUTH", (String) null).a(((anon) o.i()).k()).b();
        }
    }
}
