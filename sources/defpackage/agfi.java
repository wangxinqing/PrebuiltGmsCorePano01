package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: agfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agfi implements agho, agcv, agkv {
    public static final anhq a = anhq.a("agfi");
    private static final long h = TimeUnit.HOURS.toMillis(12);
    public final agks b;
    public final Application c;
    public final SharedPreferences d;
    public final boolean e;
    public final int f;
    public final amzy g;
    private final bapu i;
    private final agcz j;
    private final agnf k = agnf.a();

    public agfi(agkt agkt, Application application, bapu bapu, amri amri, SharedPreferences sharedPreferences) {
        this.b = agkt.a((Executor) aoqm.a, this.k);
        this.c = application;
        this.i = bapu;
        amri c2 = ((aghl) amri.b()).c();
        if (c2.a()) {
            this.e = ((aggr) c2.b()).a();
            this.f = ((aggr) c2.b()).b();
            this.g = ((aggr) c2.b()).c();
        } else {
            this.e = false;
            this.f = -1;
            this.g = amzy.h();
        }
        this.d = sharedPreferences;
        this.j = agcz.a(application);
    }

    static boolean a(SharedPreferences sharedPreferences) {
        long j2 = h;
        agzj.c();
        long j3 = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j3) {
            boolean commit = sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit();
            j3 = -1;
        }
        return j3 != -1 && elapsedRealtime <= j3 + j2;
    }

    public final void b() {
    }

    public final void c() {
        this.j.b(this);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        amzy amzy;
        File file;
        PackageStats packageStats = PackageStatsCapture.getPackageStats(this.c);
        if (packageStats == null) {
            ((anhn) ((anhn) a.c()).a("agfi", "d", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PackageStats capture failed.");
            return;
        }
        aucd o = basu.s.o();
        amrl.a((Object) packageStats);
        basm basm = (basm) baso.k.o();
        long j2 = packageStats.cacheSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso = (baso) basm.b;
        baso.a |= 1;
        baso.b = j2;
        long j3 = packageStats.codeSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso2 = (baso) basm.b;
        baso2.a |= 2;
        baso2.c = j3;
        long j4 = packageStats.dataSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso3 = (baso) basm.b;
        baso3.a |= 4;
        baso3.d = j4;
        long j5 = packageStats.externalCacheSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso4 = (baso) basm.b;
        baso4.a |= 8;
        baso4.e = j5;
        long j6 = packageStats.externalCodeSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso5 = (baso) basm.b;
        baso5.a |= 16;
        baso5.f = j6;
        long j7 = packageStats.externalDataSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso6 = (baso) basm.b;
        baso6.a |= 32;
        baso6.g = j7;
        long j8 = packageStats.externalMediaSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso7 = (baso) basm.b;
        baso7.a |= 64;
        baso7.h = j8;
        long j9 = packageStats.externalObbSize;
        if (basm.c) {
            basm.c();
            basm.c = false;
        }
        baso baso8 = (baso) basm.b;
        baso8.a |= 128;
        baso8.i = j9;
        baso baso9 = (baso) basm.i();
        aucd aucd = (aucd) baso9.c(5);
        aucd.a((aucj) baso9);
        basm basm2 = (basm) aucd;
        if (this.e) {
            if (basm2.c) {
                basm2.c();
                basm2.c = false;
            }
            ((baso) basm2.b).j = aucj.s();
            Application application = this.c;
            int i2 = this.f;
            amzy amzy2 = this.g;
            agzj.c();
            ArrayList arrayList = new ArrayList();
            try {
                file = new File(application.getPackageManager().getApplicationInfo(application.getPackageName(), 0).dataDir);
            } catch (PackageManager.NameNotFoundException e2) {
                try {
                    ((anhn) ((anhn) agjk.a.c()).a("agjk", "a", 193, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use package manager getting data directory from context instead.");
                    File filesDir = application.getFilesDir();
                    if (filesDir != null) {
                        file = filesDir.getParentFile();
                    } else {
                        file = null;
                    }
                } catch (Exception e3) {
                    anhn anhn = (anhn) agjk.a.c();
                    anhn.a((Throwable) e3);
                    ((anhn) anhn.a("agjk", "a", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve DirStats.");
                    amzy = amzy.h();
                }
            }
            if (file == null) {
                amzy = amzy.h();
            } else {
                agjk.a(file, arrayList, i2, amzy2);
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
        this.b.a((basu) o.i());
        boolean commit = this.d.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        ((aorv) this.i.a()).a(new agfh(this));
    }

    public final void b(Activity activity) {
        this.j.b(this);
        e();
    }

    public final void a() {
        this.j.a((agcy) this);
    }
}
