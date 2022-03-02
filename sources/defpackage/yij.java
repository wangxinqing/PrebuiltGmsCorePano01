package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yij {
    protected static final long a = TimeUnit.MINUTES.toSeconds(30);
    protected static final long b = TimeUnit.DAYS.toSeconds(7);
    private static final jjg c = jjg.a(iyc.PHENOTYPE);

    private static final Bundle a(int i) {
        return a(i, (String) null);
    }

    protected static void b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SchedulerPrefs", 0);
        long j = sharedPreferences.getLong("scheduledPeriodSec", -1);
        long i = azaf.i();
        if (j != i) {
            long k = ayzv.a.a().k();
            long j2 = a;
            if (i < j2) {
                i = j2;
            } else {
                long j3 = b;
                if (i > j3) {
                    i = j3;
                }
            }
            ((anih) ((anih) c.d()).a("yij", "b", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling a periodic sync task every %d seconds, with flex of %d seconds", i, k);
            qxi qxi = new qxi();
            qxi.a = i;
            qxi.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            qxi.b(1);
            qxi.n = true;
            qxi.b = k;
            qxi.b(0, 0);
            qxi.a(0, 0);
            qxi.a(false);
            qxi.k = "PhenotypePeriodicSync";
            qxi.s = a(2);
            if (azaf.f()) {
                qxi.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
            }
            qwq.a(context).a((qxx) qxi.b());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("scheduledPeriodSec", i);
            edit.apply();
        }
    }

    protected static void c(Context context) {
        long a2 = azaf.a.a().a();
        long j = a;
        if (a2 < j) {
            a2 = j;
        }
        ((anih) ((anih) c.d()).a("yij", "c", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling adaptive one off task with window [%d, %d] in seconds", a2, b);
        qxf qxf = new qxf();
        qxf.a(a2, b);
        qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        qxf.k = "PhenotypeAdaptiveSync";
        qxf.s = a(3);
        qxf.n = true;
        qxf.b(1);
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        if (azaf.f()) {
            qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
        }
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void d(Context context) {
        long i = azaf.i();
        qxf qxf = new qxf();
        qxf.a(i / 2, i);
        qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        qxf.n = true;
        qxf.b(0);
        qxf.k = "PhenotypePeriodicSync";
        qxf.s = a(2);
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        if (azaf.f()) {
            qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
        }
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void e(Context context) {
        long q = ayzv.a.a().q();
        a(context, q, q + q, "PhenotypeSyncAfterRetry", 12, (String) null);
    }

    private static final Bundle a(int i, String str) {
        Bundle bundle = new Bundle(1);
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("fetchReason", i2);
            if (str != null) {
                bundle.putString("fetchPackage", str);
            }
            return bundle;
        }
        throw null;
    }

    public static void a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("SchedulerPrefs", 0).edit();
        edit.clear();
        edit.apply();
        int nextInt = new Random().nextInt(14340) + 60;
        ((anih) ((anih) c.d()).a("yij", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cancel all previously scheduled polling");
        qwq.a(context).a("com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator");
        ((anih) ((anih) c.d()).a("yij", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling Phenotype for first execution %d seconds from now (%d)", nextInt, System.currentTimeMillis());
        qxf qxf = new qxf();
        qxf.a((long) (nextInt - 5), (long) (nextInt + 5));
        qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        qxf.n = true;
        qxf.k = "PhenotypePeriodicSync";
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        qxf.s = a(2);
        if (azaf.f()) {
            qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
        }
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void b(Context context, int i) {
        long j = (long) i;
        if (j < ayzv.h()) {
            i = (int) ayzv.h();
        } else if (j > ayzv.g()) {
            i = (int) ayzv.g();
        }
        ((anih) ((anih) c.d()).a("yij", "b", 263, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handling Retry-After: scheduling Phenotype for one-off execution %d from now", i);
        qxf qxf = new qxf();
        qxf.a((long) i, (long) (i + 60));
        qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        qxf.b(1);
        qxf.n = true;
        qxf.k = "PhenotypeRetryAfter";
        qxf.s = a(11);
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        if (azaf.f()) {
            qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
        }
        qwq.a(context).a((qxx) qxf.b());
    }

    protected static void a(Context context, int i) {
        ((anih) ((anih) c.d()).a("yij", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cancel all previously scheduled polling");
        qwq.a(context).a("com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator");
        ((anih) ((anih) c.d()).a("yij", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling Phenotype for first execution %d seconds from now (%d)", i, System.currentTimeMillis());
        qxf qxf = new qxf();
        qxf.a((long) (i - 5), (long) (i + 5));
        qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        qxf.n = true;
        qxf.k = "PhenotypePeriodicSync";
        qxf.b(0, 0);
        qxf.a(0, 0);
        qxf.a(false);
        qxf.s = a(2);
        if (azaf.f()) {
            qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
        }
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void a(Context context, int i, String str) {
        a(context, 1, 2, "PhenotypeSyncImmediately", i, str);
    }

    private static void a(Context context, long j, long j2, String str, int i, String str2) {
        anih anih = (anih) ((anih) c.d()).a("yij", "a", 321, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        int i2 = i - 1;
        if (i != 0) {
            anih.a("Scheduling Phenotype for a %s(%d, %s) one off with window [%d, %d] in seconds", str, Integer.valueOf(i2), str2, Long.valueOf(j), Long.valueOf(j2));
            qxf qxf = new qxf();
            qxf.a(j, j2);
            qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            qxf.k = str;
            qxf.n = true;
            qxf.b(1);
            qxf.b(0, 0);
            qxf.a(0, 0);
            qxf.a(false);
            qxf.s = a(i, str2);
            if (azaf.f()) {
                qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
            }
            qwq.a(context).a((qxx) qxf.b());
            return;
        }
        throw null;
    }

    public static void a(Context context, String str, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SchedulerPrefs", 0);
        long j = sharedPreferences.getLong("scheduledPeriodSec", -1);
        long i2 = azaf.i();
        if (j != i2) {
            long k = ayzv.a.a().k();
            long j2 = a;
            if (i2 < j2) {
                i2 = j2;
            } else {
                long j3 = b;
                if (i2 > j3) {
                    i2 = j3;
                }
            }
            ((anih) ((anih) c.d()).a("yij", "b", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling a periodic sync task every %d seconds, with flex of %d seconds", i2, k);
            qxi qxi = new qxi();
            qxi.a = i2;
            qxi.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            qxi.b(1);
            qxi.n = true;
            qxi.b = k;
            qxi.b(0, 0);
            qxi.a(0, 0);
            qxi.a(false);
            qxi.k = "PhenotypePeriodicSync";
            qxi.s = a(2);
            if (azaf.f()) {
                qxi.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
            }
            qwq.a(context).a((qxx) qxi.b());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("scheduledPeriodSec", i2);
            edit.apply();
        }
        if ("PhenotypeAdaptiveSync".equals(str) || i == 0) {
            long a2 = azaf.a.a().a();
            long j4 = a;
            if (a2 < j4) {
                a2 = j4;
            }
            ((anih) ((anih) c.d()).a("yij", "c", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scheduling adaptive one off task with window [%d, %d] in seconds", a2, b);
            qxf qxf = new qxf();
            qxf.a(a2, b);
            qxf.i = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            qxf.k = "PhenotypeAdaptiveSync";
            qxf.s = a(3);
            qxf.n = true;
            qxf.b(1);
            qxf.b(0, 0);
            qxf.a(0, 0);
            qxf.a(false);
            if (azaf.f()) {
                qxf.a((Set) anax.a((Object) qxx.a(yiu.e().a)));
            }
            qwq.a(context).a((qxx) qxf.b());
        }
    }
}
