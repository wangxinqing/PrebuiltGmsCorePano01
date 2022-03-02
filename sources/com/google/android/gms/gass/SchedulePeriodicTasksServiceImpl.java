package com.google.android.gms.gass;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.settings.e;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulePeriodicTasksServiceImpl extends qwf {
    public static void a(Context context) {
        aucd o = npy.f.o();
        String c = e.a((Context) ihs.b()).c();
        if (!TextUtils.isEmpty(c)) {
            auay a = auay.a(c.getBytes());
            if (o.c) {
                o.c();
                o.c = false;
            }
            npy npy = (npy) o.b;
            a.getClass();
            npy.a |= 1;
            npy.b = a;
        } else {
            auay a2 = auay.a(new byte[16]);
            if (o.c) {
                o.c();
                o.c = false;
            }
            npy npy2 = (npy) o.b;
            a2.getClass();
            npy2.a |= 1;
            npy2.b = a2;
        }
        npy npy3 = (npy) o.b;
        int i = npy3.a | 2;
        npy3.a = i;
        npy3.c = 201216073;
        npy3.a = i | 4;
        npy3.d = 1;
        long longValue = nol.a().longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        npy npy4 = (npy) o.b;
        npy4.a |= 8;
        npy4.e = longValue;
        nol.a(context, nol.a(3, ((npy) o.i()).k()));
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        if ("GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL".equals(str)) {
            a((Context) this);
            return 0;
        }
        if ("GPTGLS".equals(str)) {
            if (axjg.e()) {
                nol.a((Context) this, nol.a(4, (byte[]) null));
                return 0;
            }
        } else if ("GPDT".equals(str) && axjj.b()) {
            nqf a = nol.a(5, (byte[]) null);
            bhs a2 = bhs.a(qxz.b.getInt("PDTAKey", -1));
            if (a2 == null) {
                return 2;
            }
            noa a3 = noa.a(this);
            nox nox = new nox(new npa(jfm.b(9), ihs.b().getRequestQueue(), a3), new mbd(), a3, a2);
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Gass program download task scheduled for architecture:");
            sb.append(valueOf);
            sb.toString();
            return nox.a(this, a);
        }
        return 2;
    }
}
