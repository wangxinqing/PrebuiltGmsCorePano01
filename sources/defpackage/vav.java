package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;

/* renamed from: vav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vav {
    public final auyt a;
    public final auyt b;
    public auyt c;
    public auyt d;
    public auyt e;
    public auyt f;
    public final ArrayList g;
    private final Context h;
    private final SharedPreferences i;
    private final Object j = new Object();
    private String k;

    public vav(Context context) {
        jjg jjg = tgc.a;
        this.h = context;
        this.a = arwe.b();
        this.i = context.getSharedPreferences("copresence_configuration", 0);
        this.b = arwe.a();
        this.c = a("server");
        this.d = a("overrides");
        this.e = c();
        this.g = new ArrayList();
        b();
    }

    public static auyt a(auyt auyt, auyt auyt2, String str) {
        iva.a((Object) auyt2);
        jjg jjg = tgc.a;
        try {
            aucd aucd = (aucd) auyt.c(5);
            aucd.a((aucj) auyt);
            aucf aucf = (aucf) aucd;
            aucf.b(auyt2.k(), aubs.c());
            return (auyt) aucf.i();
        } catch (auda e2) {
            ((anih) ((anih) tgc.a.b()).a("vav", "a", 168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s update %s config error: %s", (Object) "ConfigurationManager: ", (Object) str, (Object) e2.getMessage());
            return null;
        }
    }

    private final auyt b(String str) {
        auyt b2 = arwe.b();
        a(str, b2);
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.b(defpackage.jhy.c(r0), defpackage.aubs.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.tgc.a.b()).a("vav", "c", 339, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s error reading gservices overrides configuration: %s", (java.lang.Object) "ConfigurationManager: ", (java.lang.Object) r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0.isEmpty() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r1 = defpackage.arwe.b();
        r2 = (defpackage.aucd) r1.c(5);
        r2.a((defpackage.aucj) r1);
        r2 = (defpackage.aucf) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.auyt c() {
        /*
            r7 = this;
            aync r0 = defpackage.aync.a
            aynd r0 = r0.a()
            java.lang.String r0 = r0.i()
            java.lang.Object r1 = r7.j
            monitor-enter(r1)
            java.lang.String r2 = r7.k     // Catch:{ all -> 0x006b }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0068
            r7.k = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0065
            auyt r1 = defpackage.arwe.b()
            r2 = 5
            java.lang.Object r2 = r1.c(r2)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r1)
            aucf r2 = (defpackage.aucf) r2
            byte[] r0 = defpackage.jhy.c((java.lang.String) r0)     // Catch:{ auda -> 0x003c, IllegalArgumentException -> 0x003a }
            aubs r1 = defpackage.aubs.c()     // Catch:{ auda -> 0x003c, IllegalArgumentException -> 0x003a }
            r2.b(r0, r1)     // Catch:{ auda -> 0x003c, IllegalArgumentException -> 0x003a }
            goto L_0x005e
        L_0x003a:
            r0 = move-exception
            goto L_0x003d
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            jjg r1 = defpackage.tgc.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r3 = 339(0x153, float:4.75E-43)
            java.lang.String r4 = "vav"
            java.lang.String r5 = "c"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r4, (java.lang.String) r5, (int) r3, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "%s error reading gservices overrides configuration: %s"
            java.lang.String r4 = "ConfigurationManager: "
            r1.a((java.lang.String) r3, (java.lang.Object) r4, (java.lang.Object) r0)
        L_0x005e:
            aucj r0 = r2.i()
            auyt r0 = (defpackage.auyt) r0
            return r0
        L_0x0065:
            auyt r0 = r7.a
            return r0
        L_0x0068:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            r0 = 0
            return r0
        L_0x006b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vav.c():auyt");
    }

    public final void d() {
        ased ased = (ased) thl.b(this.h, ased.class);
        if (ased != null) {
            aucf aucf = (aucf) asgm.d.o();
            auyt auyt = this.f;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asgm asgm = (asgm) aucf.b;
            auyt.getClass();
            asgm.c = auyt;
            int i2 = asgm.a | 2;
            asgm.a = i2;
            asgm.b = 1;
            asgm.a = i2 | 1;
            ased.a((asgm) aucf.i());
        }
    }

    public final long e() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.r;
    }

    public final boolean f() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.c;
    }

    public final boolean g() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.d;
    }

    public final boolean h() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.p;
    }

    public final boolean i() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.q;
    }

    public final boolean j() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.f;
    }

    public final boolean k() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.h;
    }

    public final long l() {
        auyy auyy = this.f.d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        return auyy.k;
    }

    public final auyn m() {
        auyn auyn = this.f.h;
        return auyn == null ? auyn.j : auyn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010a A[LOOP:0: B:30:0x0108->B:31:0x010a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            auyt r0 = defpackage.arwe.b()
            r1 = 5
            java.lang.Object r2 = r0.c(r1)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r0)
            aucf r2 = (defpackage.aucf) r2
            auyt r0 = r8.b     // Catch:{ auda -> 0x0047 }
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x0047 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x0047 }
            r2.b(r0, r3)     // Catch:{ auda -> 0x0047 }
            auyt r0 = r8.c     // Catch:{ auda -> 0x0045 }
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x0045 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x0045 }
            r2.b(r0, r3)     // Catch:{ auda -> 0x0045 }
            auyt r0 = r8.e     // Catch:{ auda -> 0x0045 }
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x0045 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x0045 }
            r2.b(r0, r3)     // Catch:{ auda -> 0x0045 }
            auyt r0 = r8.d     // Catch:{ auda -> 0x0045 }
            byte[] r0 = r0.k()     // Catch:{ auda -> 0x0045 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ auda -> 0x0045 }
            r2.b(r0, r3)     // Catch:{ auda -> 0x0045 }
            goto L_0x0069
        L_0x0045:
            r0 = move-exception
            goto L_0x0048
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            jjg r3 = defpackage.tgc.a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r4 = 273(0x111, float:3.83E-43)
            java.lang.String r5 = "vav"
            java.lang.String r6 = "b"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r3 = r3.a((java.lang.String) r5, (java.lang.String) r6, (int) r4, (java.lang.String) r7)
            anih r3 = (defpackage.anih) r3
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "%s merging configuration error: %s"
            java.lang.String r5 = "ConfigurationManager: "
            r3.a((java.lang.String) r4, (java.lang.Object) r5, (java.lang.Object) r0)
        L_0x0069:
            boolean r0 = defpackage.aync.e()
            r3 = 0
            if (r0 == 0) goto L_0x00f7
            aucj r0 = r2.b
            auyt r0 = (defpackage.auyt) r0
            auyn r0 = r0.h
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            auyn r0 = defpackage.auyn.j
        L_0x007b:
            auyl r0 = r0.f
            if (r0 != 0) goto L_0x0081
            auyl r0 = defpackage.auyl.f
        L_0x0081:
            java.lang.Object r4 = r0.c(r1)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r0)
            boolean r0 = r4.c
            if (r0 == 0) goto L_0x0094
            r4.c()
            r4.c = r3
        L_0x0094:
            aucj r0 = r4.b
            auyl r0 = (defpackage.auyl) r0
            int r5 = r0.a
            r5 = r5 | 8
            r0.a = r5
            r0.d = r3
            aucj r0 = r4.i()
            auyl r0 = (defpackage.auyl) r0
            aucj r4 = r2.b
            auyt r4 = (defpackage.auyt) r4
            auyn r4 = r4.h
            if (r4 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            auyn r4 = defpackage.auyn.j
        L_0x00b1:
            java.lang.Object r1 = r4.c(r1)
            aucd r1 = (defpackage.aucd) r1
            r1.a((defpackage.aucj) r4)
            aucf r1 = (defpackage.aucf) r1
            boolean r4 = r1.c
            if (r4 != 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            r1.c()
            r1.c = r3
        L_0x00c7:
            aucj r4 = r1.b
            auyn r4 = (defpackage.auyn) r4
            r0.getClass()
            r4.f = r0
            int r0 = r4.a
            r0 = r0 | 32
            r4.a = r0
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x00db
            goto L_0x00e0
        L_0x00db:
            r2.c()
            r2.c = r3
        L_0x00e0:
            aucj r0 = r2.b
            auyt r0 = (defpackage.auyt) r0
            aucj r1 = r1.i()
            auyn r1 = (defpackage.auyn) r1
            auyt r4 = defpackage.auyt.p
            r1.getClass()
            r0.h = r1
            int r1 = r0.a
            r1 = r1 | 64
            r0.a = r1
        L_0x00f7:
            aucj r0 = r2.i()
            auyt r0 = (defpackage.auyt) r0
            r8.f = r0
            r8.d()
            java.util.ArrayList r0 = r8.g
            int r1 = r0.size()
        L_0x0108:
            if (r3 >= r1) goto L_0x0118
            java.lang.Object r2 = r0.get(r3)
            vba r2 = (defpackage.vba) r2
            vbb r2 = r2.a
            r2.d()
            int r3 = r3 + 1
            goto L_0x0108
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vav.b():void");
    }

    private final auyt a(String str) {
        SharedPreferences sharedPreferences = this.i;
        String str2 = null;
        if (sharedPreferences != null) {
            str2 = sharedPreferences.getString(str, (String) null);
        }
        if (str2 == null) {
            return arwe.b();
        }
        try {
            byte[] c2 = jhy.c(str2);
            auyt b2 = arwe.b();
            aucd aucd = (aucd) b2.c(5);
            aucd.a((aucj) b2);
            aucf aucf = (aucf) aucd;
            aucf.b(c2, aubs.c());
            return (auyt) aucf.i();
        } catch (auda e2) {
            return a(str, str2);
        } catch (IllegalArgumentException e3) {
            return a(str, str2);
        }
    }

    private final auyt a(String str, String str2) {
        try {
            byte[] a2 = jhy.a(str2);
            auyt b2 = arwe.b();
            aucd aucd = (aucd) b2.c(5);
            aucd.a((aucj) b2);
            aucf aucf = (aucf) aucd;
            aucf.b(a2, aubs.c());
            return (auyt) aucf.i();
        } catch (auda e2) {
            ((anih) ((anih) tgc.a.b()).a("vav", "a", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s reading stored configuration error: %s", (Object) "ConfigurationManager: ", (Object) e2.getMessage());
            return b(str);
        } catch (IllegalArgumentException e3) {
            ((anih) ((anih) tgc.a.b()).a("vav", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s reading stored configuration error: %s", (Object) "ConfigurationManager: ", (Object) e3.getMessage());
            return b(str);
        }
    }

    private static auzb a(int i2, String str) {
        auza auza = (auza) auzb.d.o();
        if (auza.c) {
            auza.c();
            auza.c = false;
        }
        auzb auzb = (auzb) auza.b;
        int i3 = auzb.a | 1;
        auzb.a = i3;
        auzb.b = i2;
        str.getClass();
        auzb.a = i3 | 2;
        auzb.c = str;
        return (auzb) auza.i();
    }

    public final auzb a(avch avch) {
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 1) {
            auyq auyq = this.f.k;
            if (auyq == null) {
                auyq = auyq.g;
            }
            auzb auzb = auyq.b;
            if (auzb == null) {
                auzb = auzb.d;
            }
            int i2 = auzb.b;
            auyq auyq2 = this.f.k;
            if (auyq2 == null) {
                auyq2 = auyq.g;
            }
            auzb auzb2 = auyq2.b;
            if (auzb2 == null) {
                auzb2 = auzb.d;
            }
            return a(i2, auzb2.c);
        } else if (ordinal == 2) {
            auyq auyq3 = this.f.k;
            if (auyq3 == null) {
                auyq3 = auyq.g;
            }
            auzb auzb3 = auyq3.c;
            if (auzb3 == null) {
                auzb3 = auzb.d;
            }
            int i3 = auzb3.b;
            auyq auyq4 = this.f.k;
            if (auyq4 == null) {
                auyq4 = auyq.g;
            }
            auzb auzb4 = auyq4.c;
            if (auzb4 == null) {
                auzb4 = auzb.d;
            }
            return a(i3, auzb4.c);
        } else if (ordinal == 3) {
            auyq auyq5 = this.f.k;
            if (auyq5 == null) {
                auyq5 = auyq.g;
            }
            auzb auzb5 = auyq5.d;
            if (auzb5 == null) {
                auzb5 = auzb.d;
            }
            int i4 = auzb5.b;
            auyq auyq6 = this.f.k;
            if (auyq6 == null) {
                auyq6 = auyq.g;
            }
            auzb auzb6 = auyq6.d;
            if (auzb6 == null) {
                auzb6 = auzb.d;
            }
            return a(i4, auzb6.c);
        } else if (ordinal != 8) {
            ((anih) ((anih) tgc.a.b()).a("vav", "a", 309, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ConfigurationManager: TokenParams config missing for medium: %s", (Object) vgu.a(avch));
            return a(8, "GCS");
        } else {
            auyq auyq7 = this.f.k;
            if (auyq7 == null) {
                auyq7 = auyq.g;
            }
            auzb auzb7 = auyq7.f;
            if (auzb7 == null) {
                auzb7 = auzb.d;
            }
            int i5 = auzb7.b;
            auyq auyq8 = this.f.k;
            if (auyq8 == null) {
                auyq8 = auyq.g;
            }
            auzb auzb8 = auyq8.f;
            if (auzb8 == null) {
                auzb8 = auzb.d;
            }
            return a(i5, auzb8.c);
        }
    }

    public final void a() {
        this.d = b("overrides");
        b();
        ased ased = (ased) thl.b(this.h, ased.class);
        if (ased != null) {
            aucf aucf = (aucf) asgm.d.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asgm asgm = (asgm) aucf.b;
            asgm.b = 3;
            asgm.a |= 1;
            ased.a((asgm) aucf.i());
        }
    }

    public final void a(auyt auyt) {
        auyt a2 = a(this.d, auyt, "overrides");
        this.d = a2;
        a("overrides", a2);
        b();
    }

    public final void a(String str, auyt auyt) {
        String d2 = jhy.d(auyt.k());
        SharedPreferences sharedPreferences = this.i;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, d2);
            edit.apply();
            b();
        }
    }
}
