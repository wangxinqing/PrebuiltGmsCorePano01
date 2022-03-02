package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;

/* renamed from: nov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nov {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static Long d = 0L;
    public static boolean e = true;
    public static Long f = 0L;
    public static Long g = 0L;
    public static boolean h = true;
    public static Long i = 0L;
    public static Long j = 0L;
    public static boolean k = true;
    public static boolean l = true;
    public static Long m = 0L;

    public static void a(Context context) {
        d = Long.valueOf(axja.c());
        e = axja.d();
        f = Long.valueOf(axja.b());
        Long l2 = d;
        new Object[1][0] = l2;
        a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL", a, l2.longValue(), e, f.longValue(), (Bundle) null);
    }

    public static void b(Context context) {
        if (axjg.e()) {
            g = Long.valueOf(axjg.d());
            h = axjg.f();
            i = Long.valueOf(axjg.b());
            Long l2 = g;
            new Object[1][0] = l2;
            a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GPTGLS", b, l2.longValue(), h, i.longValue(), (Bundle) null);
        }
    }

    public static void c(Context context) {
        if (axjj.b()) {
            j = Long.valueOf(axjj.d());
            k = axjj.e();
            l = axjj.f();
            m = Long.valueOf(axjj.c());
            new Object[1][0] = j;
            npe npe = new npe(context);
            HashSet<bhs> hashSet = new HashSet<>();
            hashSet.add(new npi(npe.b, (nnt) null).a());
            for (bhs bhs : bhs.values()) {
                if (npe.a.getBoolean(Integer.toString(bhs.f), false)) {
                    hashSet.add(bhs);
                }
            }
            for (bhs bhs2 : hashSet) {
                Bundle bundle = new Bundle();
                bundle.putInt("PDTAKey", bhs2.f);
                a(context, "com.google.android.gms.gass.chimera.SchedulePeriodicTasksService", "GPDT", c, j.longValue(), k, m.longValue(), bundle);
            }
        }
    }

    private static void a(Context context, String str, String str2, boolean z, long j2, boolean z2, long j3, Bundle bundle) {
        qwq a2 = qwq.a(context);
        if (a2 == null) {
            Log.e("PeriodicTasksManager", "Failed to get a GmsTaskScheduler instance.");
            return;
        }
        if (z) {
            StringBuilder sb = new StringBuilder(str.length() + 32 + str2.length());
            sb.append("Cancel the existing ");
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(" task first");
            sb.toString();
            a2.a(str2, str);
        }
        qxi qxi = new qxi();
        qxi.i = str;
        qxi.a(0);
        qxi.a(z2 ? 1 : 0, z2);
        qxi.a = j2;
        qxi.b = j3;
        qxi.b(1);
        qxi.k = str2;
        qxi.n = false;
        qxk qxk = new qxk();
        qxk.a = 0;
        qxk.b = (int) axjj.a.a().e();
        qxk.c = (int) axjj.a.a().f();
        qxi.r = qxk.a();
        if (bundle != null) {
            qxi.s = bundle;
        }
        a2.a((qxx) qxi.b());
    }
}
