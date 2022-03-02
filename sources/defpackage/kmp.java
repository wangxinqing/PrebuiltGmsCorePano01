package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: kmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmp {
    public final kmy a;
    public Map b;
    public kmh c;
    public final lgs d;
    public final Executor e;
    private final kqg f;
    private final kkm g;

    public kmp(kqg kqg, lgs lgs, kkm kkm, Executor executor, kmh kmh, kmy kmy) {
        boolean z;
        this.f = kqg;
        this.d = lgs;
        this.g = kkm;
        this.e = executor;
        this.c = kmh;
        this.a = kmy;
        if (kmy.ae == kmh.m) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
    }

    private final void a(kmu kmu) {
        this.d.a((kqi) kmu);
    }

    private final void ar() {
        if (this.b == null) {
            this.b = krl.a(this.d.c());
        }
    }

    private final Long c(UserMetadata userMetadata) {
        if (userMetadata != null) {
            return Long.valueOf(this.g.a.a(userMetadata));
        }
        return null;
    }

    public final boolean A() {
        return this.a.E;
    }

    public final boolean B() {
        return this.a.T;
    }

    public final Date C() {
        return this.a.M;
    }

    public final Date D() {
        return this.a.c;
    }

    public final Date E() {
        return this.a.L;
    }

    public final Date F() {
        return this.a.e;
    }

    public final Date G() {
        return this.a.b;
    }

    public final String H() {
        return this.a.R;
    }

    public final String I() {
        return this.a.C;
    }

    public final boolean J() {
        return this.a.h != null;
    }

    public final void K() {
        this.a.c();
        kmy kmy = this.a;
        if (kmy.h == null) {
            kmy.E = true;
        }
        o(false);
    }

    public final void L() {
        if (this.a.d()) {
            kmy kmy = this.a;
            if (kmy.E && kmy.h == null) {
                return;
            }
        }
        if (!this.a.d()) {
            this.a.c();
        }
        kmy kmy2 = this.a;
        kmy2.h = null;
        kmy2.E = true;
        o(true);
    }

    public final void M() {
        kmy kmy = this.a;
        kmy.f = null;
        if (kmy.h == null) {
            kmy.E = false;
        }
    }

    public final boolean N() {
        return !A() || !O() || J();
    }

    public final boolean O() {
        return this.a.d();
    }

    public final String P() {
        return this.a.P;
    }

    public final boolean Q() {
        return this.a.H;
    }

    public final boolean R() {
        return this.a.G;
    }

    public final amzy S() {
        return this.a.N;
    }

    public final String T() {
        return this.a.n;
    }

    public final boolean U() {
        return this.a.ac;
    }

    public final Long V() {
        return Long.valueOf(this.a.ah);
    }

    public final boolean W() {
        return this.a.V;
    }

    public final String X() {
        return this.a.z;
    }

    public final boolean Y() {
        return this.a.ad;
    }

    public final String Z() {
        return this.a.Q;
    }

    public final void a(long j) {
        this.a.af = j;
    }

    public final void a(amzy amzy) {
        this.a.N = amzy;
    }

    public final void a(Date date) {
        this.a.M = date;
    }

    public final void a(boolean z) {
        this.a.T = z;
    }

    public final kpd aa() {
        return this.a.O;
    }

    public final boolean ab() {
        return this.c.b == null;
    }

    public final long ac() {
        return this.c.a;
    }

    public final boolean ad() {
        return this.a.W;
    }

    public final long ae() {
        return this.a.K;
    }

    public final boolean af() {
        return this.a.I;
    }

    public final boolean ag() {
        return this.a.F;
    }

    public final knl ah() {
        if (ag()) {
            return this.d.a();
        }
        return null;
    }

    public final boolean ai() {
        return this.a.b();
    }

    public final Set aj() {
        ob obVar = new ob();
        if (this.a.Z) {
            obVar.add(DriveSpace.a);
        }
        if (this.a.b()) {
            obVar.add(DriveSpace.b);
        }
        if (this.a.aa) {
            obVar.add(DriveSpace.c);
        }
        return obVar;
    }

    public final List ak() {
        return this.d.d();
    }

    public final long al() {
        return this.a.ag;
    }

    public final boolean am() {
        if (q() == null || (p() == null && !ius.a(l(), o()))) {
            return false;
        }
        return true;
    }

    public final void an() {
        n(false);
    }

    public final void ao() {
        this.d.b(this.a);
    }

    public final void ap() {
        lgs lgs = this.d;
        for (kpu b2 : lgs.a.d(lgs.b)) {
            this.d.b(b2);
        }
    }

    public final void aq() {
        this.a.al = true;
    }

    public final kkx b() {
        return this.d.b;
    }

    public final void b(Long l) {
        this.a.i = l;
    }

    public final void b(Date date) {
        this.a.c = date;
    }

    public final void b(boolean z) {
        this.a.H = z;
    }

    public final void c(long j) {
        this.a.ah = j;
    }

    public final void c(Long l) {
        this.a.g = l;
    }

    public final void c(String str) {
        this.a.q = str;
    }

    public final void c(String str, String str2) {
        kmy kmy = this.a;
        kmy.ai = str;
        kmy.u = str2;
    }

    public final void c(Date date) {
        this.a.L = date;
    }

    public final void c(boolean z) {
        this.a.G = z;
    }

    public final void d(String str) {
        this.a.D = str;
    }

    public final void d(Date date) {
        this.a.e = date;
    }

    public final void d(boolean z) {
        this.a.ac = z;
    }

    public final void e(String str) {
        this.a.x = str;
    }

    public final void e(Date date) {
        this.a.b = date;
    }

    public final void e(boolean z) {
        this.a.ab = z;
    }

    public final void f() {
        m(false);
    }

    public final void f(String str) {
        this.a.y = str;
    }

    public final void f(Date date) {
        this.a.d = date;
    }

    public final void f(boolean z) {
        this.a.ad = z;
    }

    public final DriveId g() {
        String str;
        String i = i();
        if (i == null || !i.startsWith("appdata")) {
            str = i;
        } else {
            str = null;
        }
        return new DriveId(str, this.a.ae, this.f.g(), w() ? 1 : 0);
    }

    public final void g(boolean z) {
        this.a.W = z;
    }

    public final long h() {
        return this.a.ae;
    }

    public final void h(String str) {
        this.a.n = str;
    }

    public final void h(boolean z) {
        this.a.I = z;
    }

    public final String i() {
        return this.c.b;
    }

    public final void i(String str) {
        this.a.w = str;
    }

    public final void j(String str) {
        this.a.b(str);
    }

    public final void k(boolean z) {
        this.a.Z = z;
    }

    public final String l() {
        return this.a.r;
    }

    public final void l(boolean z) {
        this.a.aa = z;
    }

    public final void m() {
        kmy kmy = this.a;
        kmy.s = null;
        kmy.t = null;
    }

    public final String n() {
        return this.a.s;
    }

    public final String o() {
        return this.a.t;
    }

    public final Long p() {
        return this.a.i;
    }

    public final String q() {
        return this.a.ai;
    }

    public final String r() {
        return this.a.u;
    }

    public final long s() {
        return this.a.af;
    }

    public final Long t() {
        return this.a.g;
    }

    public final String toString() {
        return String.format(Locale.US, "Entry for %s", new Object[]{this.a});
    }

    public final String u() {
        return this.a.q;
    }

    public final kpy v() {
        return this.a.S;
    }

    public final boolean w() {
        return this.a.e();
    }

    public final boolean x() {
        return this.a.ao;
    }

    public final long y() {
        return this.a.aj;
    }

    public final String z() {
        return this.a.x;
    }

    private final void a(boolean z, boolean z2) {
        this.d.a((Runnable) new kmn(this, z, z2));
    }

    public final void b(UserMetadata userMetadata) {
        this.a.j = c(userMetadata);
    }

    public final void d(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void j(boolean z) {
        iva.a(this.a.ao, (Object) "The entry must already be persisted");
        this.a.F = z;
    }

    public final boolean k() {
        return "writer".equals(this.a.Q);
    }

    public final void m(boolean z) {
        a(false, z);
    }

    public final void n(boolean z) {
        a(true, z);
    }

    public final void o(boolean z) {
        kmy kmy = this.a;
        if (kmy.E && kmy.d() && this.a.h == null) {
            this.d.a((Runnable) new kmo(this, z));
        }
    }

    public final UserMetadata a(Long l) {
        kqc kqc;
        if (l != null) {
            kqc = this.g.a.a(l.longValue());
        } else {
            kqc = null;
        }
        if (kqc != null) {
            return new UserMetadata(kqc.a, kqc.b, kqc.c, kqc.d, kqc.e);
        }
        return null;
    }

    public final void i(boolean z) {
        if (!z) {
            kmy kmy = this.a;
            kmy.I = false;
            kmy.l = Long.valueOf(System.currentTimeMillis());
            return;
        }
        kmy kmy2 = this.a;
        if (kmy2.l != null) {
            kmy2.l = null;
            kmy2.I = true;
        }
    }

    public final boolean j() {
        return "owner".equals(this.a.Q);
    }

    public final void b(String str) {
        iva.a((Object) str);
        iva.a(ab());
        this.c.b = str;
    }

    public final boolean e() {
        if (this.a.e() || this.a.R.startsWith("application/vnd.google-apps") || !v().b() || !this.a.W) {
            return false;
        }
        return true;
    }

    public final void g(String str) {
        this.a.a(str);
    }

    public final void b(String str, String str2) {
        kmy kmy = this.a;
        iva.a((Object) str);
        kmy.s = str;
        kmy kmy2 = this.a;
        iva.a((Object) str2);
        kmy2.t = str2;
    }

    public final boolean d() {
        kmy kmy = this.a;
        String str = kmy.Q;
        return !kmy.b() && (str == null || str.equals("owner"));
    }

    public final List a(String str, boolean z) {
        boolean z2;
        ar();
        ArrayList arrayList = new ArrayList();
        for (krl krl : this.b.values()) {
            boolean z3 = false;
            if (str == null || krl.f() == null || ius.a(krl.f(), str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || krl.e() != null) {
                z3 = true;
            }
            if (z2 && z3) {
                arrayList.add(krl);
            }
        }
        return arrayList;
    }

    public final boolean b(long j) {
        Long l = this.a.h;
        if (l == null || l.longValue() != j) {
            return false;
        }
        kmy kmy = this.a;
        kmy.h = null;
        kmy.E = O();
        o(false);
        return true;
    }

    public final knc a() {
        long j = this.a.ae;
        if (j >= 0) {
            return knc.a(j);
        }
        return null;
    }

    public final boolean c() {
        return this.d.b();
    }

    public final krl a(String str, String str2) {
        ar();
        String a2 = krl.a(str, str2);
        if (this.b.containsKey(a2)) {
            return (krl) this.b.get(a2);
        }
        lgs lgs = this.d;
        krl a3 = lgs.a.a(lgs.b, str, str2);
        this.b.put(a2, a3);
        return a3;
    }

    public final void a(UserMetadata userMetadata) {
        this.a.k = c(userMetadata);
    }

    public final void a(Permission permission) {
        int b2;
        Permission permission2 = permission;
        kqg kqg = this.f;
        long h = h();
        int i = kmu.l;
        int a2 = lrz.a(permission);
        kmu kmu = null;
        if (!(a2 == -1 || (b2 = lrz.b(permission)) == -1)) {
            kmu = new kmu(kqg, h, permission2.e, lrz.c(permission), permission2.f, b2, permission2.g, a2, (Long) null, (Long) null, permission2.k, (Boolean) null, (Long) null);
        }
        if (kmu != null) {
            a(kmu);
        }
    }

    public final void a(String str) {
        this.a.P = lso.a(str);
    }

    public final void a(String str, int i, int i2, boolean z, long j) {
        boolean z2;
        if (i2 != -100) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2);
        kqg kqg = this.f;
        long h = h();
        Long valueOf = Long.valueOf(j);
        a(new kmu(kqg, h, (String) null, str, (String) null, i, (String) null, i2, -100L, valueOf, z, false, valueOf));
    }

    public final void a(kpd kpd) {
        this.a.a(kpd);
    }

    public final void a(kpy kpy) {
        this.a.a(kpy);
    }

    public final void a(boolean z, long j) {
        kmy kmy = this.a;
        kmy.E = z;
        kmy.h = Long.valueOf(j);
    }

    public final boolean a(khq khq) {
        lgs lgs = this.d;
        return lgs.a.a(khq, lgs.b);
    }
}
