package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: nhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhf {
    public static final Status a = new Status(13, "Not found");
    static final Status b = new Status(8, "Too many concurrent requests");
    public static final Status c = new Status(13, "Unavailable");
    public static final Status d = new Status(23518, "Insufficient Disk Space");
    public final Object e = new Object();
    public final Map f = new HashMap();
    public final ngm g;
    public final ngo h;
    public long i = 0;
    public nhn j;
    public nhn k;
    private final ngy l;
    private final Executor m;
    private final nhd n;
    private final nge o;

    public nhf(ngm ngm, ngo ngo, ngy ngy, Executor executor, nhd nhd, nhn nhn, nge nge) {
        iva.a((Object) ngm, (Object) "disk");
        this.g = ngm;
        iva.a((Object) ngo, (Object) "downloader");
        this.h = ngo;
        iva.a((Object) ngy, (Object) "clearcutWrapper");
        this.l = ngy;
        iva.a((Object) executor, (Object) "executor");
        this.m = executor;
        iva.a((Object) nhd, (Object) "pendingResolverProvider");
        this.n = nhd;
        this.k = nhn;
        this.o = nge;
    }

    private static final apxl a(String str, nhl nhl) {
        apxl apxl = (apxl) apxn.f.o();
        if (apxl.c) {
            apxl.c();
            apxl.c = false;
        }
        apxn apxn = (apxn) apxl.b;
        apxn.b = 1;
        int i2 = 1 | apxn.a;
        apxn.a = i2;
        str.getClass();
        int i3 = i2 | 2;
        apxn.a = i3;
        apxn.c = str;
        int i4 = nhl.d;
        apxn.a = i3 | 4;
        apxn.e = i4;
        return apxl;
    }

    private final void a(int i2, FontMatchSpec fontMatchSpec, int i3, String str, nhl nhl) {
        a(Integer.valueOf(i2), fontMatchSpec, 4, Integer.valueOf(i3), str, nhl);
    }

    private final void a(FontMatchSpec fontMatchSpec, String str, aosh aosh, nhl nhl, File file) {
        ngz.c("FontsServer", "fetch %s for %s SUCCESS, local cache hit %s", fontMatchSpec, str, file);
        aosh.b((Object) FontFetchResult.a(nhc.a(nhl.b, nhl.c), file));
        a((Integer) null, fontMatchSpec, 0, 0, str, nhl);
        ngm ngm = this.g;
        ngm.e.execute(new ngi(ngm, fontMatchSpec));
    }

    private final void a(Integer num, FontMatchSpec fontMatchSpec, int i2, Integer num2, String str, nhl nhl) {
        apxl a2 = a(str, nhl);
        aucd o2 = apxp.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        apxp apxp = (apxp) o2.b;
        apxp.d = i2 - 1;
        apxp.a |= 4;
        if (num != null) {
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            apxp apxp2 = (apxp) o2.b;
            apxp2.a |= 16;
            apxp2.f = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            apxp apxp3 = (apxp) o2.b;
            apxp3.a |= 8;
            apxp3.e = intValue2;
        }
        aucd o3 = apxk.d.o();
        apxq a3 = ngy.a(fontMatchSpec);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apxk apxk = (apxk) o3.b;
        a3.getClass();
        apxk.b = a3;
        apxk.a |= 1;
        apxk apxk2 = (apxk) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        apxp apxp4 = (apxp) o2.b;
        apxk2.getClass();
        apxp4.b = apxk2;
        apxp4.a |= 1;
        a2.a(o2);
        this.l.a((apxn) a2.i());
    }

    private final void a(Integer num, FontMatchSpec fontMatchSpec, long j2, int i2, String str, nhl nhl) {
        apxl a2 = a(str, nhl);
        aucd o2 = apxp.g.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        apxp apxp = (apxp) o2.b;
        apxp.d = 1;
        int i3 = apxp.a | 4;
        apxp.a = i3;
        int i4 = i3 | 2;
        apxp.a = i4;
        apxp.c = j2;
        apxp.a = i4 | 8;
        apxp.e = i2;
        if (num != null) {
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            apxp apxp2 = (apxp) o2.b;
            apxp2.a |= 16;
            apxp2.f = intValue;
        }
        aucd o3 = apxk.d.o();
        int i5 = nhl.b.c;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apxk apxk = (apxk) o3.b;
        apxk.a |= 2;
        apxk.c = i5;
        apxq a3 = ngy.a(fontMatchSpec);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apxk apxk2 = (apxk) o3.b;
        a3.getClass();
        apxk2.b = a3;
        apxk2.a |= 1;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        apxp apxp3 = (apxp) o2.b;
        apxk apxk3 = (apxk) o3.i();
        apxk3.getClass();
        apxp3.b = apxk3;
        apxp3.a |= 1;
        a2.a(o2);
        this.l.a((apxn) a2.i());
    }

    public final aorr a(FontMatchSpec fontMatchSpec, String str) {
        nhn nhn;
        nhl nhl;
        iva.a((Object) fontMatchSpec, (Object) "spec");
        iva.a((Object) str, (Object) "requestingPackage");
        aosh f2 = aosh.f();
        if (this.k != null && this.o != null && fontMatchSpec.b.startsWith("Google Sans") && fontMatchSpec.e == 0.0f) {
            nhl nhl2 = nhl.a;
            nhl a2 = this.k.a(fontMatchSpec);
            if (a2.a()) {
                ngz.c("FontsServer", "fetch %s for %s resolved using bundled fonts", fontMatchSpec, str);
                nhl = a2;
            } else {
                nhl = nhl2;
            }
            if (!nhl.a()) {
                ngz.c("FontsServer", "Could not resolve %s from bundled assets", fontMatchSpec);
                f2.b((Object) FontFetchResult.a(c));
            } else {
                File a3 = this.g.a(nhl.b, nhl.c, true);
                if (a3 == null) {
                    ngm ngm = this.g;
                    nfw nfw = nhl.c.a;
                    if (nfw == null) {
                        nfw = nfw.e;
                    }
                    if (!ngm.b(nfw.c)) {
                        ngz.c("FontsServer", "Insufficient space on disk to extract %s", fontMatchSpec);
                        f2.b((Object) FontFetchResult.a(d));
                    } else {
                        synchronized (this.e) {
                            nhc nhc = (nhc) this.f.get(fontMatchSpec);
                            if (nhc != null) {
                                if (nhc.a(f2)) {
                                    ngz.c("FontsServer", "fetch %s for %s deduplicated", fontMatchSpec, str);
                                    nhc.a();
                                }
                            }
                            ngz.c("FontsServer", "fetch %s for %s will extract", fontMatchSpec, str);
                            nhc nhc2 = new nhc(this, fontMatchSpec, nhl, f2, str, this.i);
                            this.f.put(fontMatchSpec, nhc2);
                            Executor executor = this.m;
                            nge nge = this.o;
                            ngm ngm2 = this.g;
                            if (nhc2.g != 0) {
                                executor.execute(new nhb(nhc2, nge, ngm2));
                            }
                        }
                    }
                } else {
                    a(fontMatchSpec, str, f2, nhl, a3);
                }
            }
            return f2;
        }
        synchronized (this.e) {
            nhn = this.j;
        }
        if (nhn == null) {
            this.n.a().a(new nhe(this, fontMatchSpec, str, f2), this.m);
        } else {
            a(nhn, fontMatchSpec, str, f2);
        }
        return f2;
    }

    public final void a(nhc nhc) {
        String str;
        int i2;
        synchronized (this.e) {
            Object remove = this.f.remove(nhc.c);
            Object[] objArr = new Object[5];
            objArr[0] = nhc.c;
            if (remove != null) {
                str = " NOT";
            } else {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = nhc.c();
            objArr[3] = Long.valueOf(nhc.b());
            objArr[4] = Integer.valueOf(this.f.size());
            ngz.c("FontsServer", "Forget %s; was%s in flight. Final status %s, latency %d. %d in flight", objArr);
        }
        FontMatchSpec fontMatchSpec = nhc.c;
        Status c2 = nhc.c();
        long b2 = nhc.b();
        synchronized (nhc.b) {
            i2 = nhc.f;
        }
        String str2 = nhc.e;
        nhl nhl = nhc.d;
        if (c2.c()) {
            a(Integer.valueOf(c2.i), fontMatchSpec, b2, i2, str2, nhl);
            return;
        }
        a(c2.i, fontMatchSpec, i2, str2, nhl);
    }

    public final void a(nhn nhn) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (nhn != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        ngz.c("FontsServer", "setResolver. Null? %s", objArr);
        synchronized (this.e) {
            this.j = nhn;
        }
    }

    public final void a(nhn nhn, FontMatchSpec fontMatchSpec, String str, aosh aosh) {
        nhl nhl = nhl.a;
        if (nhn != null) {
            nhl a2 = nhn.a(fontMatchSpec);
            if (a2.a()) {
                File a3 = this.g.a(a2.b, a2.c, true);
                if (a3 != null) {
                    a(fontMatchSpec, str, aosh, a2, a3);
                    return;
                }
                if (axiu.a.a().b()) {
                    ngm ngm = this.g;
                    nfw nfw = a2.c.a;
                    if (nfw == null) {
                        nfw = nfw.e;
                    }
                    if (!ngm.b(nfw.c)) {
                        ngz.c("FontsServer", "Insufficient space on disk to download %s", fontMatchSpec);
                        aosh.b((Object) FontFetchResult.a(d));
                        a(d.i, fontMatchSpec, 0, str, a2);
                        return;
                    }
                }
                synchronized (this.e) {
                    nhc nhc = (nhc) this.f.get(fontMatchSpec);
                    if (nhc != null) {
                        if (nhc.a(aosh)) {
                            ngz.c("FontsServer", "fetch %s for %s deduplicated", fontMatchSpec, str);
                            nhc.a();
                            return;
                        }
                    }
                    if (this.f.size() <= 16) {
                        ngz.c("FontsServer", "fetch %s for %s will download", fontMatchSpec, str);
                        nhc nhc2 = new nhc(this, fontMatchSpec, a2, aosh, str);
                        this.f.put(fontMatchSpec, nhc2);
                        nhc2.a(this.g, this.h);
                        return;
                    }
                    ngz.c("FontsServer", "fetch %s for %s rejected, TOO_BUSY", fontMatchSpec, str);
                    aosh.b((Object) FontFetchResult.a(b));
                    a((Integer) null, fontMatchSpec, 5, (Integer) null, str, a2);
                    return;
                }
            }
            ngz.c("FontsServer", "fetch %s for %s resolved NOT_FOUND", fontMatchSpec, str);
            aosh.b((Object) FontFetchResult.a(a));
            a((Integer) null, fontMatchSpec, 3, (Integer) null, str, a2);
            return;
        }
        ngz.a("FontsServer", "No resolver, short-circuit %s for %s to failure", fontMatchSpec, str);
        aosh.b((Object) FontFetchResult.a(c));
        a(c.i, fontMatchSpec, 0, str, nhl);
    }
}
