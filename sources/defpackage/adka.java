package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adka {
    public static final adjz a;
    public static final adjz b = d.a("battery_threshold", (Long) 40L, ayoz.c);
    public static final adjz c = d.a("min_battery_threshold", (Long) 20L, ayoz.v);
    private static final adjy d;

    static {
        adjy adjy = new adjy("config.flag.");
        d = adjy;
        a = adjy.a("maintenance_window", "", ayoz.u);
    }

    public static int c(Context context) {
        if (adjw.b(context)) {
            return ((Long) c.a()).intValue();
        }
        return ((Long) b.a()).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if ((r4 + defpackage.aypa.a.e().f()) < r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (defpackage.adjw.b(r9) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (defpackage.adjw.b(r9) == false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.adjv a(android.content.Context r9, com.google.android.gms.update.SystemUpdateStatus r10) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.n
            adkf r4 = defpackage.adkf.a(r9, r4)
            int r5 = r4.a
            r6 = 4
            if (r5 != r6) goto L_0x0015
            goto L_0x00f8
        L_0x0015:
            r6 = 3
            if (r5 == r6) goto L_0x00f8
            adkg r5 = a()
            com.google.android.gms.update.ActivityStatus r6 = r10.r
            boolean r6 = r6.b
            if (r6 != 0) goto L_0x0040
            com.google.android.gms.update.InstallationOptions r6 = r10.h
            boolean r6 = r6.b
            if (r6 != 0) goto L_0x0040
            boolean r6 = r5.a((long) r0)
            if (r6 != 0) goto L_0x0040
            int r6 = r4.a
            r7 = 1
            if (r6 != r7) goto L_0x0034
            goto L_0x0040
        L_0x0034:
            adjv r9 = new adjv
            r10 = 531(0x213, float:7.44E-43)
            long r0 = r5.b(r0)
            r9.<init>(r10, r0)
            return r9
        L_0x0040:
            int r5 = defpackage.adjw.c(r9)
            int r6 = c(r9)
            if (r5 < r6) goto L_0x00ec
            com.google.android.gms.update.ActivityStatus r5 = r10.r
            boolean r5 = r5.b
            if (r5 != 0) goto L_0x00cc
            int r4 = r4.a
            if (r4 != 0) goto L_0x00cc
            com.google.android.gms.update.InstallationOptions r4 = r10.h
            boolean r4 = r4.a
            if (r4 != 0) goto L_0x00cc
            long r4 = r10.n
            long r0 = r0 - r4
            aypa r4 = defpackage.aypa.a
            aypb r4 = r4.a()
            long r4 = r4.i()
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0089
            boolean r4 = defpackage.adjw.a(r9)
            if (r4 != 0) goto L_0x0089
            long r4 = r10.p
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x007a
            goto L_0x00ba
        L_0x007a:
            aypa r6 = defpackage.aypa.a
            aypb r6 = r6.a()
            long r6 = r6.f()
            long r4 = r4 + r6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x00ba
        L_0x0089:
            aypa r2 = defpackage.aypa.a
            aypb r2 = r2.a()
            long r2 = r2.e()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x009d
            boolean r2 = defpackage.adjw.b(r9)
            if (r2 == 0) goto L_0x00ba
        L_0x009d:
            aypa r2 = defpackage.aypa.a
            aypb r2 = r2.a()
            long r2 = r2.g()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00cc
            int r0 = defpackage.adjw.c(r9)
            r1 = 80
            if (r0 >= r1) goto L_0x00cc
            boolean r9 = defpackage.adjw.b(r9)
            if (r9 == 0) goto L_0x00ba
            goto L_0x00cc
        L_0x00ba:
            adjv r9 = new adjv
            r10 = 1043(0x413, float:1.462E-42)
            aypa r0 = defpackage.aypa.a
            aypb r0 = r0.a()
            long r0 = r0.h()
            r9.<init>(r10, r0)
            return r9
        L_0x00cc:
            boolean r9 = r10.l
            if (r9 == 0) goto L_0x00e2
            adjv r9 = new adjv
            r10 = 787(0x313, float:1.103E-42)
            aypa r0 = defpackage.aypa.a
            aypb r0 = r0.a()
            long r0 = r0.l()
            r9.<init>(r10, r0)
            return r9
        L_0x00e2:
            adjv r9 = new adjv
            r10 = 273(0x111, float:3.83E-43)
            r0 = 0
            r9.<init>(r10, r0)
            return r9
        L_0x00ec:
            adjv r9 = new adjv
            r10 = 275(0x113, float:3.85E-43)
            long r0 = defpackage.aypa.d()
            r9.<init>(r10, r0)
            return r9
        L_0x00f8:
            adjv r9 = new adjv
            r10 = 1299(0x513, float:1.82E-42)
            long r0 = r4.b
            r9.<init>(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adka.a(android.content.Context, com.google.android.gms.update.SystemUpdateStatus):adjv");
    }

    public static adjv b(Context context, SystemUpdateStatus systemUpdateStatus) {
        long currentTimeMillis = System.currentTimeMillis();
        adkf a2 = adkf.a(context, systemUpdateStatus.n);
        int i = a2.a;
        if (i == 4 || i == 3) {
            return new adjv(1552, a2.b);
        }
        if (adjw.c(context) < c(context)) {
            return new adjv(1040, aypa.d());
        }
        adkg a3 = a();
        if (!systemUpdateStatus.r.b && !a3.a(currentTimeMillis) && !systemUpdateStatus.h.b && a2.a != 1) {
            return new adjv(1296, a3.b(currentTimeMillis));
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (((Long) adki.e.a()).longValue() != adki.b.longValue() || !aypa.a.a().a() || !anax.a((Object) 2, (Object) 1).contains(Integer.valueOf(telephonyManager.getCallState()))) {
            return new adjv(784, 0);
        }
        return new adjv(1041, aypa.a.a().m());
    }

    public static boolean b(Context context) {
        return aypm.a.a().a() && context.getPackageManager().hasSystemFeature("android.hardware.reboot_escrow") && !adjw.f(context);
    }

    public static adkg a() {
        adkg a2 = adkg.a((String) a.a());
        return !a2.a() ? adkg.b : a2;
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (b(context)) {
            return true;
        }
        if (adjw.f(context)) {
            return false;
        }
        if (aypm.a.a().c() && !adjw.g(context)) {
            return true;
        }
        return amsk.a(',').a().c(aypa.a.a().d()).contains(jli.a("ro.crypto.state", ""));
    }
}
