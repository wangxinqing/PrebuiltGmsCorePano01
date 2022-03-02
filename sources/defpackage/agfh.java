package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: agfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agfh implements Runnable {
    private final agfi a;

    public agfh(agfi agfi) {
        this.a = agfi;
    }

    public final void run() {
        amzy amzy;
        File file;
        agfi agfi = this.a;
        if (!agfi.a(agfi.d)) {
            PackageStats packageStats = PackageStatsCapture.getPackageStats(agfi.c);
            if (packageStats == null) {
                ((anhn) ((anhn) agfi.a.c()).a("agfi", "d", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PackageStats capture failed.");
                return;
            }
            aucd o = basu.s.o();
            amrl.a((Object) packageStats);
            basm basm = (basm) baso.k.o();
            long j = packageStats.cacheSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso = (baso) basm.b;
            baso.a |= 1;
            baso.b = j;
            long j2 = packageStats.codeSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso2 = (baso) basm.b;
            baso2.a |= 2;
            baso2.c = j2;
            long j3 = packageStats.dataSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso3 = (baso) basm.b;
            baso3.a |= 4;
            baso3.d = j3;
            long j4 = packageStats.externalCacheSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso4 = (baso) basm.b;
            baso4.a |= 8;
            baso4.e = j4;
            long j5 = packageStats.externalCodeSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso5 = (baso) basm.b;
            baso5.a |= 16;
            baso5.f = j5;
            long j6 = packageStats.externalDataSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso6 = (baso) basm.b;
            baso6.a |= 32;
            baso6.g = j6;
            long j7 = packageStats.externalMediaSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso7 = (baso) basm.b;
            baso7.a |= 64;
            baso7.h = j7;
            long j8 = packageStats.externalObbSize;
            if (basm.c) {
                basm.c();
                basm.c = false;
            }
            baso baso8 = (baso) basm.b;
            baso8.a |= 128;
            baso8.i = j8;
            baso baso9 = (baso) basm.i();
            aucd aucd = (aucd) baso9.c(5);
            aucd.a((aucj) baso9);
            basm basm2 = (basm) aucd;
            if (agfi.e) {
                if (basm2.c) {
                    basm2.c();
                    basm2.c = false;
                }
                ((baso) basm2.b).j = aucj.s();
                Application application = agfi.c;
                int i = agfi.f;
                amzy amzy2 = agfi.g;
                agzj.c();
                ArrayList arrayList = new ArrayList();
                try {
                    file = new File(application.getPackageManager().getApplicationInfo(application.getPackageName(), 0).dataDir);
                } catch (PackageManager.NameNotFoundException e) {
                    try {
                        ((anhn) ((anhn) agjk.a.c()).a("agjk", "a", 193, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use package manager getting data directory from context instead.");
                        File filesDir = application.getFilesDir();
                        if (filesDir != null) {
                            file = filesDir.getParentFile();
                        } else {
                            file = null;
                        }
                    } catch (Exception e2) {
                        anhn anhn = (anhn) agjk.a.c();
                        anhn.a((Throwable) e2);
                        ((anhn) anhn.a("agjk", "a", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve DirStats.");
                        amzy = amzy.h();
                    }
                }
                if (file == null) {
                    amzy = amzy.h();
                } else {
                    agjk.a(file, arrayList, i, amzy2);
                    amzy = amzy.a((Collection) arrayList);
                }
                basm2.a(amzy);
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            basu basu = (basu) o.b;
            baso baso10 = (baso) basm2.i();
            baso10.getClass();
            basu.i = baso10;
            basu.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            agfi.b.a((basu) o.i());
            if (agfi.d.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
            }
        }
    }
}
