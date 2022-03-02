package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import com.google.android.gms.instantapps.internal.RoutingOptions;
import com.google.android.gms.instantapps.service.InstantAppsChimeraService;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: qlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlb extends qga implements jbh {
    private static final qfn a = new qfn("InstantAppsServiceImpl");
    private static final String[] b = new String[0];
    private final InstantAppsChimeraService c;
    private final GetServiceRequest d;
    private final jiq e;
    private final qex f;
    private final qlc g;
    private final qlg h;
    private final SharedPreferences i;
    private final SharedPreferences j;
    private final qkm k;
    private final qiz l;
    private final qlx m;
    private final qks n;
    private final qja o;
    private final qjt p;
    private final qhj q;
    private final jbf r = jbf.a();
    private final qfl s;
    private final qld t;
    private final int u;

    public qlb(InstantAppsChimeraService instantAppsChimeraService, GetServiceRequest getServiceRequest) {
        this.c = instantAppsChimeraService;
        this.d = getServiceRequest;
        qfq a2 = qfq.a(instantAppsChimeraService);
        this.e = a2.b;
        this.f = a2.k;
        this.g = a2.c;
        this.h = a2.d;
        this.i = a2.e;
        this.j = a2.f;
        this.k = a2.i;
        this.l = a2.l;
        this.m = a2.m;
        this.n = a2.j;
        this.o = a2.n;
        this.p = a2.g;
        this.q = a2.h;
        this.s = a2.o;
        this.t = a2.r;
        this.u = qfe.a();
    }

    private final void b() {
        if (!f()) {
            throw new SecurityException("Access denied");
        }
    }

    private final void c() {
        if (!e() && !f()) {
            throw new SecurityException("Access denied");
        }
    }

    private final boolean e() {
        return this.s.a(Binder.getCallingUid());
    }

    private final boolean f() {
        return this.s.b(Binder.getCallingUid());
    }

    private static final void g() {
        if (jkr.e()) {
            throw new SecurityException("Not supposed to run on Android O.");
        }
    }

    private final void a() {
        if (!jhg.b() && !e() && !f() && !hya.a((Context) this.c).b(this.d.d)) {
            throw new SecurityException("Access denied");
        }
    }

    private final void b(qfy qfy, Intent intent, RoutingOptions routingOptions) {
        Intent intent2 = intent;
        RoutingOptions routingOptions2 = routingOptions;
        c();
        if (this.t.a()) {
            if (intent2.hasExtra("com.google.android.gms.instantapps.packageNameOverride")) {
                routingOptions2.b = intent2.getStringExtra("com.google.android.gms.instantapps.packageNameOverride");
            }
            if (!axuy.a.a().m()) {
                routingOptions2.c = intent2.getBooleanExtra("com.google.android.gms.instantapps.disableOptInCheck", routingOptions2.c);
                routingOptions2.d = intent2.getBooleanExtra("com.google.android.gms.instantapps.disableHoldbackCheck", routingOptions2.d);
                routingOptions2.e = intent2.getBooleanExtra("com.google.android.gms.instantapps.disableBrowserPreferenceCheck", routingOptions2.e);
            }
            if (intent2.hasExtra("com.google.android.gms.instantapps.disablePopulatingRoutes")) {
                routingOptions2.g = intent2.getBooleanExtra("com.google.android.gms.instantapps.disablePopulatingRoutes", routingOptions2.g);
            }
            this.r.a(this.c, new qky(qfy, intent, this.k, this.n, this.g, this.h, this.i, this.u, routingOptions));
            return;
        }
        qfy qfy2 = qfy;
        qfy.a(Status.c, (InstantAppPreLaunchInfo) null);
    }

    private final void d() {
        if (!jhg.b() && !e() && !f()) {
            throw new SecurityException("Access denied");
        }
    }

    public final void c(ifu ifu) {
        b();
        ifu.a(Status.f);
    }

    public final void e(ifu ifu) {
        ifu.a(new Status(17));
    }

    public final void e(qfy qfy) {
        if (axug.b()) {
            qfy.b(Status.f, false);
            return;
        }
        qfy.b(Status.a, this.j.getBoolean("IS_AIA_ENABLED", false));
    }

    public final void c(ifu ifu, String str) {
        qev a2 = this.f.a();
        new Object[1][0] = str;
        a();
        this.h.a(str);
        try {
            this.p.b();
            this.l.a();
        } catch (IOException e2) {
            a.a(e2, "Error wiping domain filter", new Object[0]);
        }
        this.o.a();
        a2.a("InstantAppsService.rejectOptIn");
        ifu.a(Status.a);
    }

    public final void d(ifu ifu) {
        b();
        ifu.a(Status.f);
    }

    public final void a(ifu ifu) {
        c();
        this.o.a();
        ifu.a(Status.a);
    }

    public final void d(ifu ifu, String str) {
        WriteBatch create;
        c();
        try {
            qhj qhj = this.q;
            qiz qiz = ((qhk) qhj).a;
            qiz.b();
            new File(qiz.d, str).delete();
            create = WriteBatch.create();
            create.delete(qiz.l(str));
            create.delete(qiz.k(str));
            create.delete(qiz.e(str));
            create.delete(qiz.m(str));
            create.delete(qiz.j(str));
            create.delete(qiz.n(str));
            qiz.c.a(create);
            create.close();
            Integer a2 = ((qhk) qhj).b.a(str);
            if (a2 != null) {
                ((qhk) qhj).b.a(a2.intValue());
            }
            ifu.a(Status.a);
            return;
        } catch (IOException e2) {
            a.a(e2, "deleteData", new Object[0]);
            ifu.a(new Status(8, e2.getMessage()));
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(ifu ifu, int i2) {
        c();
        this.o.a(i2);
        ifu.a(Status.a);
    }

    public final void a(ifu ifu, int i2, String str) {
        c();
        this.o.a(i2, str);
        try {
            qiz qiz = this.l;
            qiz.b();
            aucd o2 = qis.d.o();
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bytes = String.valueOf(str).concat("-ls").getBytes(qfb.b);
            byte[] a2 = qiz.c.a(bytes);
            if (a2 != null) {
                if (a2.length > 0) {
                    o2.b(a2, aubs.b());
                }
            }
            if (((qis) o2.b).a == 0) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((qis) o2.b).a = currentTimeMillis;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            qis qis = (qis) o2.b;
            qis.b = currentTimeMillis;
            qis.c++;
            qiz.c.a(bytes, ((qis) o2.i()).k());
        } catch (IOException e2) {
            a.a(e2, "Unable to persist launch of app, continuing", new Object[0]);
        }
        ifu.a(Status.a);
    }

    public final void c(qfy qfy) {
        a();
        int c2 = this.p.c();
        long d2 = this.p.d();
        Account[] d3 = this.g.d();
        qfy.a(Status.a, new DiagnosticInfo(c2, d2, this.h.a(), this.g.a(), d3));
    }

    public final void c(qfy qfy, String str) {
        if (!this.t.a()) {
            qfy.a(Status.c, (LaunchData) null);
            return;
        }
        this.r.a(this.c, new qkx(this.f, qfy, this.n, this.g, str, this.k, this.d.d, this.u, this.l));
    }

    public final void b(ifu ifu) {
        a();
        this.r.a(new qjy(this.p, ifu, avwm.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER));
    }

    public final void d(qfy qfy) {
        if (axug.b()) {
            qfy.a(Status.f, false);
            return;
        }
        qfy.a(Status.a, this.j.contains("IS_AIA_ENABLED"));
    }

    public final void b(ifu ifu, String str) {
        qev a2 = this.f.a();
        new Object[1][0] = str;
        a();
        qlg qlg = this.h;
        qlg.a.a(str);
        int a3 = qlg.a();
        if (a3 != 1) {
            qlg.b.edit().putInt("optInState", 1).putInt("optInLanguageVersion", 0).remove("optInNextPromptSecondsSinceEpoch").remove("optInOneMoreChance").remove("optInLastDeclineMillisSinceEpoch").remove("optInNumDeclines").apply();
        }
        qlg.a(qlg.a.a(), a3, 1);
        this.p.b(avwm.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN);
        a2.a("InstantAppsService.optIn");
        ifu.a(Status.a);
    }

    public final void a(ifu ifu, PackageInfo packageInfo) {
        d();
        g();
        this.r.a(this.c, new qly(this.m, ifu, packageInfo));
    }

    public final void b(ifu ifu, String str, String str2, String str3) {
        c();
        this.o.b(str3, new ComponentName(str, str2));
        ifu.a(Status.a);
    }

    public final void a(ifu ifu, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        d();
        g();
        this.r.a(this.c, new qma(this.m, ifu, packageInfo, parcelFileDescriptor));
    }

    public final void a(ifu ifu, String str) {
        qev a2 = this.f.a();
        new Object[1][0] = str;
        a();
        qlg qlg = this.h;
        new Object[1][0] = str;
        int i2 = qlg.b.getInt("optInNumDeclines", 0) + 1;
        if (((long) i2) < axuy.e()) {
            qlg.b.edit().putInt("optInNumDeclines", i2).putLong("optInLastDeclineMillisSinceEpoch", System.currentTimeMillis()).apply();
        } else {
            qlg.a(str);
        }
        a2.a("InstantAppsService.declineOptIn");
        ifu.a(Status.a);
    }

    public final void b(ifu ifu, boolean z) {
        b();
        if (axug.b()) {
            ifu.a(Status.f);
            return;
        }
        this.j.edit().putBoolean("IS_AIA_ENABLED", z).apply();
        ifu.a(Status.a);
    }

    public final void b(qfy qfy) {
        g();
        this.r.a(this.c, new qlz(this.m, qfy, this.d.d));
    }

    public final void b(qfy qfy, String str) {
        String[] strArr;
        c();
        try {
            qit a2 = this.l.a(str);
            try {
                qhb b2 = ((qhk) this.q).a.b(str);
                if (b2 != null) {
                    strArr = qlr.b(b2.a);
                } else {
                    strArr = null;
                }
                if (strArr == null) {
                    strArr = b;
                }
                if (a2 != null) {
                    qfy.a(Status.a, new Permissions((String[]) a2.a.toArray(new String[0]), (String[]) a2.b.toArray(new String[0]), (String[]) a2.c.toArray(new String[0]), strArr));
                    return;
                }
                Status status = Status.a;
                String[] strArr2 = b;
                qfy.a(status, new Permissions(strArr2, strArr2, strArr2, strArr));
            } catch (IOException e2) {
                a.a(e2, "getPermissionsForPackage", new Object[0]);
                qfy.a(new Status(8, e2.getMessage()), (Permissions) null);
            }
        } catch (IOException e3) {
            a.a(e3, "getPermissionsForPackage", new Object[0]);
            qfy.a(new Status(8, e3.getMessage()), (Permissions) null);
        }
    }

    public final synchronized void a(ifu ifu, String str, String str2, int i2) {
        c();
        try {
            this.l.a(str, str2, i2);
            ifu.a(Status.a);
        } catch (IOException e2) {
            a.a(e2, "setPackagePermission", new Object[0]);
            ifu.a(new Status(8, e2.getMessage()));
        }
    }

    public final void a(ifu ifu, String str, String str2, String str3) {
        c();
        this.o.a(str3, new ComponentName(str, str2));
        ifu.a(Status.a);
    }

    public final void a(ifu ifu, String str, boolean z) {
        c();
        try {
            if (str.contains(":")) {
                qiz qiz = this.l;
                String str2 = str.split(":")[0];
                String[] split = str.split(":");
                aucd o2 = qim.d.o();
                aucd o3 = qil.b.o();
                aucd o4 = qip.b.o();
                long parseLong = Long.parseLong(split[1]);
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                ((qip) o4.b).a = parseLong;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                qip qip = (qip) o4.i();
                qip.getClass();
                ((qil) o3.b).a = qip;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                qil qil = (qil) o3.i();
                qil.getClass();
                ((qim) o2.b).b = qil;
                aucd o5 = qin.b.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                ((qin) o5.b).a = true;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                qin qin = (qin) o5.i();
                qin.getClass();
                ((qim) o2.b).a = qin;
                qiz.a(str2, (qim) o2.i());
            } else {
                qiz qiz2 = this.l;
                aucd o6 = qin.b.o();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                ((qin) o6.b).a = true;
                qin qin2 = (qin) o6.i();
                aucd o7 = qil.b.o();
                if (z) {
                    aucd o8 = qip.b.o();
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    ((qip) o8.b).a = Long.MAX_VALUE;
                    qip qip2 = (qip) o8.i();
                    if (o7.c) {
                        o7.c();
                        o7.c = false;
                    }
                    qip2.getClass();
                    ((qil) o7.b).a = qip2;
                }
                aucd o9 = qim.d.o();
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                qim qim = (qim) o9.b;
                qin2.getClass();
                qim.a = qin2;
                qil qil2 = (qil) o7.i();
                qil2.getClass();
                qim.b = qil2;
                qiz2.a(str, (qim) o9.i());
            }
            ifu.a(Status.a);
        } catch (IOException e2) {
            a.a(e2, "setUserPrefersBrowser", new Object[0]);
            ifu.a(new Status(8, e2.getMessage()));
        }
    }

    public final void a(ifu ifu, String str, byte[] bArr) {
        d();
        if (bArr != null) {
            try {
                aubs b2 = aubs.b();
                this.l.a(str, (qim) aucj.a((aucj) qim.d, bArr, b2));
                ifu.a(Status.a);
            } catch (IOException e2) {
                a.a(e2, "setAppOverrides", new Object[0]);
                ifu.a(new Status(8, e2.getMessage()));
            }
        } else {
            throw new IllegalArgumentException("appOverridesUpdateProtoBytes cannot be null.");
        }
    }

    public final void a(ifu ifu, boolean z) {
        c();
        try {
            this.p.b();
            this.l.a();
            this.h.b.edit().clear().apply();
            this.g.a.edit().clear().apply();
            if (z) {
                this.p.b(avwm.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA);
            }
            this.o.a();
            ifu.a(Status.a);
        } catch (IOException e2) {
            a.a(e2, "deleteAllData", new Object[0]);
            ifu.a(new Status(8, e2.getMessage()));
        }
    }

    public final void a(qfy qfy) {
        a();
        Account a2 = this.g.a();
        qfy.a(Status.a, OptInInfo.a(this.h.a(), a2 != null ? a2.name : null, this.g.d()));
    }

    @Deprecated
    public final void a(qfy qfy, Intent intent) {
        boolean z;
        RoutingOptions routingOptions = new RoutingOptions();
        if (this.u == 0) {
            z = true;
        } else {
            z = false;
        }
        routingOptions.a = z;
        b(qfy, intent, routingOptions);
    }

    public final void a(qfy qfy, Intent intent, RoutingOptions routingOptions) {
        b(qfy, intent, routingOptions);
    }

    public final void a(qfy qfy, String str) {
        BitmapTeleporter bitmapTeleporter;
        c();
        Bitmap g2 = this.l.g(str);
        if (g2 != null) {
            bitmapTeleporter = new BitmapTeleporter(g2);
            bitmapTeleporter.a(this.c.getCacheDir());
        } else {
            bitmapTeleporter = null;
        }
        qfy.a(Status.a, bitmapTeleporter);
    }

    public final void a(qfy qfy, String str, String str2) {
        c();
        if (this.q.a(str, str2)) {
            qfy.a(0);
        } else {
            qfy.a(-1);
        }
    }

    public final void a(qfy qfy, String str, byte[] bArr) {
        Status status;
        PackageInfo packageInfo;
        IOException e2;
        c();
        try {
            qiz qiz = this.l;
            qiz.b();
            qiz.c.a(qiz.l(str), bArr);
            packageInfo = this.q.b(str, 20685);
            try {
                status = Status.a;
            } catch (IOException e3) {
                e2 = e3;
            }
        } catch (IOException e4) {
            e2 = e4;
            packageInfo = null;
            a.a(e2, "setApplicationManifest", new Object[0]);
            status = Status.c;
            qfy.a(status, packageInfo);
        }
        qfy.a(status, packageInfo);
    }

    public final void a(qfy qfy, List list, boolean z) {
        if (axuy.a.a().v()) {
            c();
        }
        this.r.a(this.c, new qkz(qfy, this.l, list, z));
    }
}
