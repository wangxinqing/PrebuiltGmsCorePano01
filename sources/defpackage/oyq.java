package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: oyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyq {
    public final hol a;
    private final Random b;
    private final Context c;
    private final int d;
    private final iby e;

    public oyq(Context context) {
        Random random = new Random();
        hol hol = new hol(context, "ICING", (String) null);
        iby b2 = adrz.b(context);
        this.c = context;
        this.b = random;
        this.a = hol;
        this.e = b2;
        this.d = a(context);
    }

    public static int a(int i) {
        return ((i + 9) / 10) * 10;
    }

    private final hoi b(int i, aucd aucd, long j) {
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji = (aoji) aucd.b;
        aoji aoji2 = aoji.R;
        aoji.a |= 524288;
        aoji.s = j;
        aucd o = aojh.c.o();
        boolean a2 = oyo.a(this.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojh aojh = (aojh) o.b;
        aojh.a |= 1;
        aojh.b = a2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji3 = (aoji) aucd.b;
        aojh aojh2 = (aojh) o.i();
        aojh2.getClass();
        aoji3.E = aojh2;
        aoji3.b |= 64;
        aucd o2 = aoiu.d.o();
        int i2 = this.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoiu aoiu = (aoiu) o2.b;
        aoiu.a |= 1;
        aoiu.b = i2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji4 = (aoji) aucd.b;
        aoiu aoiu2 = (aoiu) o2.i();
        aoiu2.getClass();
        aoji4.L = aoiu2;
        aoji4.b |= 131072;
        hoi a3 = this.a.a((audx) aucd.i());
        a3.b(aolk.a(i));
        return a3;
    }

    public static int a(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.icing")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (Exception e2) {
            oso.b("Failed to set icing module version: %s", (Object) e2);
            return -1;
        }
    }

    public final void a(int i, aojd aojd) {
        long c2 = axrp.c();
        if (a(c2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aojd.getClass();
            aoji.i = aojd;
            aoji.a |= 64;
            a(i, o, c2);
        }
    }

    public final void b(int i) {
        long c2 = axrp.c();
        if (a(c2)) {
            a(i, aoji.R.o(), c2);
        }
    }

    public final void a(int i, aucd aucd, long j) {
        b(i, aucd, j).b();
    }

    public final boolean b() {
        return a(axrp.e());
    }

    public final void a(antj antj) {
        long f = axrp.a.a().f();
        if (a(f)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            antj.getClass();
            aoji.A = antj;
            aoji.a |= 536870912;
            a(5003, o, f);
        }
    }

    public final void a(aoiz aoiz) {
        long e2 = axrp.a.a().e();
        if (a(e2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aoiz.getClass();
            aoji.w = aoiz;
            aoji.a |= 33554432;
            hoi b2 = b(14003, o, e2);
            b2.a(1);
            b2.b();
        }
    }

    public final void a(aojk aojk) {
        aucd o = aoji.R.o();
        long e2 = axrp.e();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoji aoji = (aoji) o.b;
        int i = aoji.a | 524288;
        aoji.a = i;
        aoji.s = e2;
        aojk.getClass();
        aoji.e = aojk;
        aoji.a = i | 4;
        a("qstats", o);
    }

    public final void a(aojr aojr) {
        long i = axrp.a.a().i();
        if (a(i)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aojr.getClass();
            aoji.m = aojr;
            aoji.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            a(5002, o, i);
        }
    }

    public final void a(aokt aokt) {
        long m = axrp.a.a().m();
        if (a(m)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokt.getClass();
            aoji.p = aokt;
            aoji.a |= 65536;
            a(2006, o, m);
        }
    }

    public final void a(aolb aolb) {
        long d2 = axrp.d();
        if (a(d2)) {
            aucd aucd = (aucd) aolb.c(5);
            aucd.a((aucj) aolb);
            int a2 = a(aolb.b);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aolb aolb2 = (aolb) aucd.b;
            aolb aolb3 = aolb.g;
            aolb2.a |= 1;
            aolb2.b = a2;
            int a3 = a(aolb.c);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aolb aolb4 = (aolb) aucd.b;
            aolb4.a |= 2;
            aolb4.c = a3;
            int a4 = a(aolb.d);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aolb aolb5 = (aolb) aucd.b;
            aolb5.a |= 4;
            aolb5.d = a4;
            int a5 = a(aolb.e);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aolb aolb6 = (aolb) aucd.b;
            aolb6.a |= 8;
            aolb6.e = a5;
            aolb aolb7 = (aolb) aucd.i();
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aolb7.getClass();
            aoji.k = aolb7;
            aoji.a |= 512;
            a(2002, o, d2);
        }
    }

    public final void a(aolt aolt, int i) {
        a(aolt, i, axrp.a.a().s());
    }

    public final void a(aolt aolt, int i, long j) {
        oso.d("Timing: %s = %dms", aolt, Integer.valueOf(i));
        if (a(j)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aoji.a |= 524288;
            aoji.s = j;
            aucd o2 = aojm.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojm aojm = (aojm) o2.b;
            aojm.b = aolt.a();
            aojm.a |= 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojm aojm2 = (aojm) o2.b;
            aojm2.a |= 2;
            aojm2.c = i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji2 = (aoji) o.b;
            aojm aojm3 = (aojm) o2.i();
            aojm3.getClass();
            aoji2.f = aojm3;
            aoji2.a |= 8;
            a("tstats", o);
        }
    }

    public final void a(String str) {
        long c2 = axrp.c();
        if (a(c2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aoji.a |= 524288;
            aoji.s = c2;
            aucd o2 = aojj.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojj aojj = (aojj) o2.b;
            str.getClass();
            aojj.a |= 1;
            aojj.b = str;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji2 = (aoji) o.b;
            aojj aojj2 = (aojj) o2.i();
            aojj2.getClass();
            aoji2.c = aojj2;
            aoji2.a |= 1;
            a("error", o);
        }
    }

    public final void a(String str, int i, aolv aolv, aolx aolx, int i2, Set set) {
        long a2 = axrp.a.a().a();
        if (a(a2)) {
            aucd o = aojn.i.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojn aojn = (aojn) o.b;
            str.getClass();
            int i3 = aojn.a | 1;
            aojn.a = i3;
            aojn.b = str;
            aojn.a = i3 | 32;
            aojn.g = i;
            aojn.c = aolv.a();
            aojn.a |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojn aojn2 = (aojn) o.b;
            aojn2.d = aolx.a();
            aojn2.a |= 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojn aojn3 = (aojn) o.b;
            aojn3.a |= 16;
            aojn3.f = i2;
            if (pba.l() && set != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojn aojn4 = (aojn) o.b;
                if (!aojn4.h.a()) {
                    aojn4.h = aucj.a(aojn4.h);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    aojn4.h.d(((aonm) it.next()).a());
                }
            }
            try {
                int i4 = this.c.getPackageManager().getPackageInfo(str, 0).versionCode;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aojn aojn5 = (aojn) o.b;
                aojn5.a |= 8;
                aojn5.e = i4;
            } catch (PackageManager.NameNotFoundException e2) {
                oso.b("PackageInfo not found for package: %s", (Object) str);
            }
            aucd o2 = aoji.R.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoji aoji = (aoji) o2.b;
            aoji.a |= 524288;
            aoji.s = a2;
            aucd o3 = aojo.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aojo aojo = (aojo) o3.b;
            aojn aojn6 = (aojn) o.i();
            aojn6.getClass();
            aojo.b = aojn6;
            aojo.a |= 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoji aoji2 = (aoji) o2.b;
            aojo aojo2 = (aojo) o3.i();
            aojo2.getClass();
            aoji2.h = aojo2;
            aoji2.a |= 32;
            a("iapistats", o2);
        }
    }

    public final void a(String str, aomb aomb, aolz aolz) {
        long c2 = axrp.a.a().c();
        if (a(c2)) {
            aucd o = aojo.d.o();
            aucd o2 = aojp.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojp aojp = (aojp) o2.b;
            str.getClass();
            aojp.a |= 1;
            aojp.b = str;
            aojp.c = aomb.a();
            aojp.a |= 2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojp aojp2 = (aojp) o2.b;
            aojp2.d = aolz.a();
            aojp2.a |= 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojo aojo = (aojo) o.b;
            aojp aojp3 = (aojp) o2.i();
            aojp3.getClass();
            aojo.c = aojp3;
            aojo.a |= 2;
            aojo aojo2 = (aojo) o.i();
            aucd o3 = aoji.R.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aoji aoji = (aoji) o3.b;
            int i = aoji.a | 524288;
            aoji.a = i;
            aoji.s = c2;
            aojo2.getClass();
            aoji.h = aojo2;
            aoji.a = i | 32;
            a("iapistats", o3);
        }
    }

    @Deprecated
    public final void a(String str, aucd aucd) {
        aucd o = aojh.c.o();
        boolean a2 = oyo.a(this.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojh aojh = (aojh) o.b;
        aojh.a |= 1;
        aojh.b = a2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji = (aoji) aucd.b;
        aojh aojh2 = (aojh) o.i();
        aoji aoji2 = aoji.R;
        aojh2.getClass();
        aoji.E = aojh2;
        aoji.b |= 64;
        aucd o2 = aoiu.d.o();
        int i = this.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoiu aoiu = (aoiu) o2.b;
        aoiu.a |= 1;
        aoiu.b = i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji3 = (aoji) aucd.b;
        aoiu aoiu2 = (aoiu) o2.i();
        aoiu2.getClass();
        aoji3.L = aoiu2;
        aoji3.b |= 131072;
        hoi a3 = this.a.a((audx) aucd.i());
        a3.b(str);
        a3.b();
    }

    public final boolean a() {
        if (!a(axrp.c())) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            if (((ick) acws.a(this.e.o(), 500, TimeUnit.MILLISECONDS)).p()) {
                return true;
            }
            oso.c("Skipping storage state: opt-out");
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return false;
        }
    }

    public final boolean a(long j) {
        if (j <= 0) {
            if (j < 0) {
                oso.b("Bad sample interval: %d", (Object) Long.valueOf(j));
            }
            return false;
        } else if (j <= 2147483647L) {
            return this.b.nextInt((int) j) == 0;
        } else {
            oso.b("Bad sample interval: %d", (Object) Long.valueOf(j));
            return false;
        }
    }
}
