package com.google.android.gms.common.stats;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StatsUploadChimeraService extends qwf {
    private static final Map a = new nz();

    static {
        a((jdd) new jbu());
        a((jdd) new jby());
        a((jdd) new jdr());
        a((jdd) new jcn());
        a((jdd) new jcp());
        a((jdd) new jcq());
    }

    static void a(jdd jdd) {
        a.put(jdd.a(), jdd);
    }

    public static void b() {
        if (awym.b()) {
            c();
        }
    }

    private static void c() {
        for (jdd jdd : a.values()) {
            long c = jdd.c();
            if (c == 0 || !jdd.b()) {
                b(jdd);
            } else {
                String a2 = jdd.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 50);
                sb.append("Scheduling ");
                sb.append(a2);
                sb.append(" upload every ");
                sb.append(c);
                sb.append(" secs");
                Log.i("StatsUploadService", sb.toString());
                qxi qxi = new qxi();
                qxi.i = "com.google.android.gms.common.stats.StatsUploadService";
                qxi.b(2, 2);
                qxi.a(1, 1);
                qxi.a(false);
                qxi.n = true;
                qxi.k = jdd.a();
                if (axcc.d()) {
                    double h = axbn.h();
                    double d = (double) c;
                    Double.isNaN(d);
                    qxi.a(c, (long) (h * d), qxr.a);
                } else {
                    qxi.a = c;
                    qxi.b = 600;
                }
                qwq.a((Context) ihs.b()).a((qxx) qxi.b());
            }
        }
    }

    public final void aH() {
        if (!awym.b()) {
            c();
        }
    }

    static void b(jdd jdd) {
        String a2 = jdd.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 19);
        sb.append("Turn off ");
        sb.append(a2);
        sb.append(" uploading");
        Log.i("StatsUploadService", sb.toString());
        qwq.a((Context) ihs.b()).a(jdd.a(), "com.google.android.gms.common.stats.StatsUploadService");
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        jdd jdd = (jdd) a.get(str);
        if (jdd == null) {
            String valueOf = String.valueOf(str);
            Log.w("StatsUploadService", valueOf.length() == 0 ? new String("Could not find StatsUploadTask: ") : "Could not find StatsUploadTask: ".concat(valueOf));
            return 2;
        } else if (!jdd.b()) {
            b(jdd);
            return 0;
        } else {
            jdd.a(getApplication());
            return 0;
        }
    }
}
