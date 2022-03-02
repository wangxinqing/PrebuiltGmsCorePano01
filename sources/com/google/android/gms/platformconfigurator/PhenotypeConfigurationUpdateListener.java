package com.google.android.gms.platformconfigurator;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeConfigurationUpdateListener extends IntentOperation {
    static long a = 0;
    static long b = 0;
    static boolean c = false;
    private static final jjg d = jjg.a(iyc.PLATFORM_CONFIGURATOR);
    private static final long e = TimeUnit.MINUTES.toMillis(15);
    private static int f = 0;
    private static Set g;
    private static Set h;

    private final void a() {
        b();
        yki b2 = yke.b((Context) this);
        synchronized (yki.a) {
            if (ykg.a()) {
                boolean z = true;
                for (String d2 : azdd.g().a) {
                    z = b2.d(d2) && z;
                }
            }
            b2.d((String) null);
        }
        if (azdd.d()) {
            yki b3 = yke.b((Context) this);
            synchronized (yki.a) {
                b3.a();
                if (ykg.a()) {
                    boolean z2 = true;
                    for (String b4 : azdd.b().a) {
                        z2 = b3.b(b4) && z2;
                    }
                }
                b3.b((String) null);
            }
        }
        c = true;
    }

    private final void b() {
        Intent className = new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver");
        acwa g2 = yke.a((Context) this).g("TRON");
        try {
            acws.a(g2, 2000, TimeUnit.MILLISECONDS);
            className.putExtra("com.google.android.gms.tron.extra.serializedExpTokens", ivy.a((ExperimentTokens) g2.d()));
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
        }
        sendBroadcast(className);
    }

    private final void c() {
        if (b < SystemClock.elapsedRealtime()) {
            d();
        }
    }

    private final void d() {
        boolean z;
        boolean z2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean a2 = yke.a("com.google.android.gms.settings.platform", this);
        hashSet2.add("com.google.android.gms.settings.platform");
        if (azdd.d()) {
            a2 = !yke.a("com.google.android.gms.settings.platform.boot", this) ? false : a2;
            hashSet.add("com.google.android.gms.settings.platform.boot");
        }
        if (ykg.a()) {
            if (ykg.b()) {
                synchronized (ykk.a) {
                    if (ykk.b == null) {
                        ykk.b = new ykk(jfm.a(10), new ykl(getApplicationContext()));
                    }
                }
            }
            aucx aucx = (azdd.e() ? azdd.j() : azdd.g()).a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                String str = (String) aucx.get(i);
                String a3 = yke.a(str);
                if (!yke.a(a3, yke.b(str), this)) {
                    z2 = false;
                } else {
                    z2 = a2;
                }
                hashSet2.add(a3);
            }
            if (azdd.d()) {
                aucx aucx2 = (azdd.e() ? azdd.i() : azdd.b()).a;
                int size2 = aucx2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) aucx2.get(i2);
                    String a4 = yke.a(str2);
                    if (!yke.a(a4, yke.b(str2), this)) {
                        z = false;
                    } else {
                        z = a2;
                    }
                    hashSet.add(a4);
                }
            }
        }
        if (a2) {
            b = SystemClock.elapsedRealtime() + 3600000;
        }
        if (azdd.h()) {
            h = Collections.unmodifiableSet(hashSet);
            g = Collections.unmodifiableSet(hashSet2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r10) {
        /*
            r9 = this;
            boolean r0 = defpackage.ykh.a()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r10.getAction()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -1
            switch(r1) {
                case -544318258: goto L_0x004b;
                case 438946629: goto L_0x0041;
                case 798292259: goto L_0x0037;
                case 832939294: goto L_0x002d;
                case 2019499159: goto L_0x0023;
                case 2069809336: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0055
        L_0x0019:
            java.lang.String r1 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0023:
            java.lang.String r1 = "com.google.android.gms.phenotype.UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 3
            goto L_0x0056
        L_0x002d:
            java.lang.String r1 = "com.google.android.gms.platformconfigurator.RETRY_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 5
            goto L_0x0056
        L_0x0037:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 0
            goto L_0x0056
        L_0x0041:
            java.lang.String r1 = "com.google.android.gms.chimera.container.CONTAINER_UPDATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 2
            goto L_0x0056
        L_0x004b:
            java.lang.String r1 = "com.google.android.gms.phenotype.COMMITTED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            r0 = 4
            goto L_0x0056
        L_0x0055:
            r0 = -1
        L_0x0056:
            if (r0 == 0) goto L_0x00cd
            if (r0 == r7) goto L_0x00c9
            if (r0 == r6) goto L_0x00c9
            java.lang.String r1 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            if (r0 == r5) goto L_0x008e
            if (r0 == r4) goto L_0x007e
            if (r0 == r3) goto L_0x0068
            r10.getAction()
            return
        L_0x0068:
            boolean r0 = defpackage.azdd.h()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r10.getStringExtra(r1)
            java.lang.String r1 = "com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY"
            int r10 = r10.getIntExtra(r1, r8)
            if (r10 == r8) goto L_0x008d
            r9.a(r0, r10)
            return
        L_0x007e:
            java.lang.String r10 = r10.getStringExtra(r1)
            java.lang.String r0 = "com.google.android.gms.platformconfigurator"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x008d
            r9.d()
        L_0x008d:
            return
        L_0x008e:
            r9.c()
            boolean r0 = defpackage.azdd.h()
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "com.google.android.gms.phenotype.URGENT"
            boolean r10 = r10.hasExtra(r0)
            if (r10 != 0) goto L_0x00ab
            long r0 = a
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            return
        L_0x00ab:
            r9.a()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 + r2
            a = r0
            return
        L_0x00b9:
            boolean r0 = c
            if (r0 == 0) goto L_0x00c5
            java.lang.String r10 = r10.getStringExtra(r1)
            r9.a(r10, r2)
            return
        L_0x00c5:
            r9.a()
            return
        L_0x00c9:
            r9.c()
            return
        L_0x00cd:
            r9.c()
            r9.a()
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener.onHandleIntent(android.content.Intent):void");
    }

    private final void c(String str, int i) {
        if (i < 5) {
            Intent startIntent = IntentOperation.getStartIntent((Context) this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i);
            int i2 = f;
            f = i2 + 1;
            new jbs(this).a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, e, PendingIntent.getService(this, i2, startIntent, 134217728), (String) null);
            return;
        }
        ((anih) ((anih) d.c()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i);
    }

    private final void b(String str, int i) {
        boolean z;
        Set set;
        if ("com.google.android.gms.settings.platform".equals(str)) {
            z = yke.b((Context) this).c((String) null);
        } else if ("com.google.android.gms.settings.platform.boot".equals(str)) {
            z = yke.b((Context) this).a((String) null);
        } else if (str != null && str.startsWith("com.google.android.platform")) {
            String replace = str.replace("com.google.android.platform.", "");
            Set set2 = g;
            if (set2 != null && set2.contains(str)) {
                z = yke.b((Context) this).c(replace);
            } else if (azdd.d() && (set = h) != null && set.contains(str)) {
                z = yke.b((Context) this).a(replace);
            } else {
                ((anih) ((anih) d.c()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Update for unknown DeviceConfig package %s", (Object) str);
                return;
            }
        } else {
            return;
        }
        if (!z) {
            ((anih) ((anih) d.d()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to propagate package %s, retryCount %d", (Object) str, i);
            int i2 = i + 1;
            if (i2 >= 5) {
                ((anih) ((anih) d.c()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i2);
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent((Context) this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
            int i3 = f;
            f = i3 + 1;
            new jbs(this).a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, e, PendingIntent.getService(this, i3, startIntent, 134217728), (String) null);
        }
    }

    private final void a(String str, int i) {
        boolean z;
        try {
            if ("com.google.android.gms.settings.platform".equals(str)) {
                z = yke.b((Context) this).c((String) null);
            } else if ("com.google.android.gms.settings.platform.boot".equals(str)) {
                z = yke.b((Context) this).a((String) null);
            } else if (str != null && str.startsWith("com.google.android.platform")) {
                String replace = str.replace("com.google.android.platform.", "");
                if (g == null || !g.contains(str)) {
                    if (azdd.d()) {
                        if (h != null && h.contains(str)) {
                            z = yke.b((Context) this).a(replace);
                        }
                    }
                    ((anih) ((anih) d.c()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Update for unknown DeviceConfig package %s", (Object) str);
                    return;
                }
                z = yke.b((Context) this).c(replace);
            } else {
                return;
            }
            if (!z) {
                ((anih) ((anih) d.d()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "b", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to propagate package %s, retryCount %d", (Object) str, i);
                int i2 = i + 1;
                if (i2 < 5) {
                    Intent startIntent = IntentOperation.getStartIntent((Context) this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
                    startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
                    startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
                    int i3 = f;
                    f = i3 + 1;
                    new jbs(this).a("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, e, PendingIntent.getService(this, i3, startIntent, 134217728), (String) null);
                    return;
                }
                ((anih) ((anih) d.c()).a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "c", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Retried propagating for %s %d times without succeeding. Giving up.", (Object) str, i2);
            }
        } catch (ykf e2) {
            anih anih = (anih) d.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write config for %s. It is banned, not retrying.", (Object) str);
        }
    }
}
