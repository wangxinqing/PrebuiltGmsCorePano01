package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: oyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyz {
    public static final anaf a;
    public final String b;
    public final oza c;
    public final prp d;
    public final Object e = new Object();
    public final Set f = new HashSet();
    public String g;

    static {
        anab anab = new anab();
        anab.a("internal.3p:MusicPlaylist", "internal.3p:MusicRecording");
        anab.a("internal.3p:MusicGroup", "internal.3p:MusicRecording");
        anab.a("internal.3p:MusicAlbum", "internal.3p:MusicRecording");
        a = anab.a();
    }

    public oyz(String str, oza oza) {
        iva.a((Object) str);
        this.b = str;
        iva.a((Object) oza);
        this.c = oza;
        this.d = oza.a;
    }

    static Intent a(String str, GlobalSearchApplication globalSearchApplication) {
        Intent intent = new Intent(str);
        Parcel obtain = Parcel.obtain();
        try {
            dsv.a(globalSearchApplication, obtain, 0);
            intent.putExtra("App", obtain.marshall());
            return intent;
        } finally {
            obtain.recycle();
        }
    }

    public static final String a(int i) {
        return i != 1 ? i != 2 ? "App unknown" : "Has different fingerprint" : "App not allowed";
    }

    private final void b(ozv ozv) {
        if (ozv.c() != null) {
            prp prp = this.d;
            GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) ozv.c();
            int a2 = ozv.a();
            long b2 = ozv.b();
            String str = globalSearchApplicationInfo.a;
            synchronized (prp.g) {
                out d2 = prp.d(str);
                aucd aucd = (aucd) d2.c(5);
                aucd.a((aucj) d2);
                otl a3 = plc.a(globalSearchApplicationInfo);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out out = (out) aucd.b;
                out out2 = out.n;
                a3.getClass();
                out.d = a3;
                int i = out.a | 4;
                out.a = i;
                int i2 = i | 8;
                out.a = i2;
                out.e = a2;
                out.a = i2 | 64;
                out.h = b2;
                prp.a(str, (out) aucd.i());
            }
            return;
        }
        prp prp2 = this.d;
        String str2 = this.b;
        synchronized (prp2.g) {
            out c2 = prp2.c(str2);
            if (c2 != null) {
                aucd aucd2 = (aucd) c2.c(5);
                aucd2.a((aucj) c2);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                out out3 = (out) aucd2.b;
                out3.d = null;
                int i3 = out3.a & -5;
                out3.a = i3;
                int i4 = i3 & -9;
                out3.a = i4;
                out3.e = 0;
                out3.a = i4 & -65;
                out3.h = 0;
                prp2.a(str2, (out) aucd2.i());
            }
        }
    }

    private final boolean r() {
        return hya.a(this.c.b).b(this.b);
    }

    public final boolean c() {
        return this.d.h(this.b);
    }

    public final void d() {
        prp prp = this.d;
        String str = this.b;
        synchronized (prp.g) {
            out d2 = prp.d(str);
            aucd aucd = (aucd) d2.c(5);
            aucd.a((aucj) d2);
            if (!((out) aucd.b).g) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out.b((out) aucd.b);
                prp.a(str, (out) aucd.i());
            }
        }
    }

    public final boolean e() {
        boolean z;
        prp prp = this.d;
        String str = this.b;
        synchronized (prp.g) {
            out c2 = prp.c(str);
            z = false;
            if (c2 != null && c2.g) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final Map f() {
        ozs a2 = this.c.e.a.a();
        HashMap hashMap = new HashMap();
        synchronized (((ozq) a2).a()) {
            for (pao pao : a()) {
                ota ota = (ota) ((ozq) a2).f.get(pao);
                if (ota != null) {
                    otg otg = ota.c;
                    if (otg == null) {
                        otg = otg.h;
                    }
                    int a3 = otf.a(otg.c);
                    if (a3 != 0) {
                        if (a3 != 1) {
                        }
                    }
                    osz osz = ota.b;
                    if (osz == null) {
                        osz = osz.s;
                    }
                    String str = osz.c;
                    osz osz2 = ota.b;
                    if (osz2 == null) {
                        osz2 = osz.s;
                    }
                    hashMap.put(str, ozq.g(osz2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final ozv g() {
        ozv ozv;
        synchronized (this.d.g) {
            ozv = new ozv(this.d.i(this.b), this.d.j(this.b), this.d.k(this.b));
        }
        return ozv;
    }

    public final Set h() {
        Set i;
        synchronized (this.d.g) {
            i = this.d.i();
        }
        return i;
    }

    public final boolean i() {
        String e2 = this.d.e(this.b);
        if (e2 != null) {
            return !e2.endsWith("-3p");
        }
        return r();
    }

    public final String j() {
        try {
            PackageInfo packageInfo = this.c.c.getPackageInfo(this.b, 64);
            if (hya.a(this.c.b).a(packageInfo)) {
                String valueOf = String.valueOf(Long.toString(packageInfo.firstInstallTime));
                return valueOf.length() == 0 ? new String("install-time-") : "install-time-".concat(valueOf);
            }
            String l = Long.toString(packageInfo.firstInstallTime);
            StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 16);
            sb.append("install-time-");
            sb.append(l);
            sb.append("-3p");
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public final void k() {
        synchronized (this.d.g) {
            oso.a("Unregistering package %s", (Object) this.b);
            prp prp = this.d;
            String str = this.b;
            synchronized (prp.g) {
                out c2 = prp.c(str);
                if (c2 != null) {
                    aucd aucd = (aucd) c2.c(5);
                    aucd.a((aucj) c2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    out out = (out) aucd.b;
                    out.a &= -2;
                    out.b = out.n.b;
                    prp.a(str, (out) aucd.i());
                }
            }
            prp prp2 = this.d;
            String str2 = this.b;
            synchronized (prp2.g) {
                out d2 = prp2.d(str2);
                aucd aucd2 = (aucd) d2.c(5);
                aucd2.a((aucj) d2);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                out out2 = (out) aucd2.b;
                out out3 = out.n;
                out2.a &= -33;
                out2.g = false;
                prp2.a(str2, (out) aucd2.i());
            }
            this.d.g(this.b);
            prp prp3 = this.d;
            String str3 = this.b;
            synchronized (prp3.g) {
                out d3 = prp3.d(str3);
                aucd aucd3 = (aucd) d3.c(5);
                aucd3.a((aucj) d3);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                out out4 = (out) aucd3.b;
                out4.a &= -129;
                out4.i = 0;
                prp3.a(str3, (out) aucd3.i());
            }
            this.d.o(this.b);
            prp prp4 = this.d;
            String str4 = this.b;
            synchronized (prp4.g) {
                out d4 = prp4.d(str4);
                aucd aucd4 = (aucd) d4.c(5);
                aucd4.a((aucj) d4);
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                out out5 = (out) aucd4.b;
                out5.a &= -2049;
                out5.m = 0;
                prp4.a(str4, (out) aucd4.i());
            }
        }
    }

    public final Resources l() {
        try {
            if (!"com.google.android.gms".equals(this.b)) {
                return this.c.c.getResourcesForApplication(this.b);
            }
            return this.c.b.getResources();
        } catch (PackageManager.NameNotFoundException e2) {
            String str = this.b;
            oso.b(str.length() == 0 ? new String("Failed to get resources for client ") : "Failed to get resources for client ".concat(str));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        oq b2 = this.c.b(this.b);
        if (((Integer) b2.a).intValue() == 0 || TextUtils.isEmpty((CharSequence) b2.b)) {
            this.d.o(this.b);
            return;
        }
        prp prp = this.d;
        String str = this.b;
        int intValue = ((Integer) b2.a).intValue();
        String str2 = (String) b2.b;
        synchronized (prp.g) {
            out d2 = prp.d(str);
            aucd aucd = (aucd) d2.c(5);
            aucd.a((aucj) d2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            out out = (out) aucd.b;
            out out2 = out.n;
            int i = out.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            out.a = i;
            out.j = intValue;
            str2.getClass();
            out.a = i | 512;
            out.k = str2;
            prp.a(str, (out) aucd.i());
        }
    }

    /* access modifiers changed from: protected */
    public final void n() {
        String p = p();
        if (p == null) {
            this.d.g(this.b);
        } else {
            prp prp = this.d;
            String str = this.b;
            synchronized (prp.g) {
                out d2 = prp.d(str);
                aucd aucd = (aucd) d2.c(5);
                aucd.a((aucj) d2);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out out = (out) aucd.b;
                out out2 = out.n;
                p.getClass();
                out.a |= 16;
                out.f = p;
                prp.a(str, (out) aucd.i());
            }
        }
        m();
    }

    public final boolean o() {
        String f2 = this.d.f(this.b);
        return f2 == null || !TextUtils.equals(p(), f2);
    }

    /* access modifiers changed from: protected */
    public final String p() {
        try {
            PackageInfo packageInfo = this.c.c.getPackageInfo(this.b, 0);
            if (!((Boolean) pba.ax.c()).booleanValue()) {
                long j = packageInfo.lastUpdateTime;
                StringBuilder sb = new StringBuilder(32);
                sb.append("last-update-");
                sb.append(j);
                return sb.toString();
            }
            long j2 = packageInfo.lastUpdateTime;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("last-update-");
            sb2.append(j2);
            sb2.append("-version-3");
            return sb2.toString();
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public final boolean q() {
        boolean z;
        prp prp = this.d;
        String str = this.b;
        synchronized (prp.g) {
            out c2 = prp.c(str);
            z = false;
            if (c2 != null && c2.l) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + str.length());
        sb.append(simpleName);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.e) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(this.f));
        }
        return unmodifiableSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r0 = r9.c.b();
        r1 = new java.lang.StringBuilder(16);
        r1.append("gsaSigned= ");
        r1.append(r0);
        defpackage.oso.a(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if (r0 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        defpackage.oso.c("Not sending global search app notification. Search app not installed or not signed properly.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r0 = new java.util.ArrayList(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r10.isEmpty() != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        if (r10.hasNext() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r1 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r10.next();
        r0.add(a("com.google.android.gms.icing.GlobalSearchAppRegistered3", new com.google.android.gms.appdatasearch.GlobalSearchApplication(r1, a(r1.b), f())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        r10 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
        r10.setPackage("com.google.android.googlequicksearchbox");
        r10.putExtra("AppPackageName", r9.b);
        r0.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r10 = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        if (r2 >= r10) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        r1 = (android.content.Intent) r0.get(r2);
        r1.setPackage("com.google.android.googlequicksearchbox");
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 16);
        r6.append("Sending intent: ");
        r6.append(r4);
        defpackage.oso.a(r6.toString());
        r9.c.b.sendBroadcast(r1);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Set r10) {
        /*
            r9 = this;
            int r0 = r10.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "setGlobalSearchInfoForGmsCore gsaiSet of size:%d"
            defpackage.oso.a((java.lang.String) r1, (java.lang.Object) r0)
            prp r0 = r9.d
            java.lang.Object r0 = r0.g
            monitor-enter(r0)
            prp r1 = r9.d     // Catch:{ all -> 0x0160 }
            java.util.Set r1 = r1.i()     // Catch:{ all -> 0x0160 }
            boolean r1 = defpackage.ius.a(r1, r10)     // Catch:{ all -> 0x0160 }
            if (r1 != 0) goto L_0x0159
            java.lang.String r1 = "setGlobalSearchInfoForGmsCore gsai changed"
            defpackage.oso.a(r1)     // Catch:{ all -> 0x0160 }
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x0160 }
            r2 = 0
            if (r1 != 0) goto L_0x009d
            prp r1 = r9.d     // Catch:{ all -> 0x0160 }
            java.lang.Object r3 = r1.g     // Catch:{ all -> 0x0160 }
            monitor-enter(r3)     // Catch:{ all -> 0x0160 }
            ous r4 = defpackage.ous.d     // Catch:{ all -> 0x009a }
            aucd r4 = r4.o()     // Catch:{ all -> 0x009a }
            java.util.Iterator r5 = r10.iterator()     // Catch:{ all -> 0x009a }
        L_0x0039:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x009a }
            if (r6 != 0) goto L_0x004c
            aucj r4 = r4.i()     // Catch:{ all -> 0x009a }
            ous r4 = (defpackage.ous) r4     // Catch:{ all -> 0x009a }
            r1.a((defpackage.ous) r4)     // Catch:{ all -> 0x009a }
            r1.d = r4     // Catch:{ all -> 0x009a }
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            goto L_0x00a9
        L_0x004c:
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x009a }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r6 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r6     // Catch:{ all -> 0x009a }
            otl r6 = defpackage.plc.a((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r6)     // Catch:{ all -> 0x009a }
            boolean r7 = r4.c     // Catch:{ all -> 0x009a }
            if (r7 != 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            r4.c()     // Catch:{ all -> 0x009a }
            r4.c = r2     // Catch:{ all -> 0x009a }
        L_0x0060:
            aucj r7 = r4.b     // Catch:{ all -> 0x009a }
            ous r7 = (defpackage.ous) r7     // Catch:{ all -> 0x009a }
            r6.getClass()     // Catch:{ all -> 0x009a }
            aucx r8 = r7.a     // Catch:{ all -> 0x009a }
            boolean r8 = r8.a()     // Catch:{ all -> 0x009a }
            if (r8 != 0) goto L_0x0077
            aucx r8 = r7.a     // Catch:{ all -> 0x009a }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ all -> 0x009a }
            r7.a = r8     // Catch:{ all -> 0x009a }
        L_0x0077:
            aucx r7 = r7.a     // Catch:{ all -> 0x009a }
            r7.add(r6)     // Catch:{ all -> 0x009a }
            otn r6 = defpackage.otn.UNSET     // Catch:{ all -> 0x009a }
            boolean r7 = r4.c     // Catch:{ all -> 0x009a }
            if (r7 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r4.c()     // Catch:{ all -> 0x009a }
            r4.c = r2     // Catch:{ all -> 0x009a }
        L_0x0088:
            aucj r7 = r4.b     // Catch:{ all -> 0x009a }
            ous r7 = (defpackage.ous) r7     // Catch:{ all -> 0x009a }
            r6.getClass()     // Catch:{ all -> 0x009a }
            r7.a()     // Catch:{ all -> 0x009a }
            aucs r7 = r7.b     // Catch:{ all -> 0x009a }
            int r6 = r6.d     // Catch:{ all -> 0x009a }
            r7.d(r6)     // Catch:{ all -> 0x009a }
            goto L_0x0039
        L_0x009a:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            throw r10     // Catch:{ all -> 0x0160 }
        L_0x009d:
            prp r1 = r9.d     // Catch:{ all -> 0x0160 }
            java.lang.Object r3 = r1.g     // Catch:{ all -> 0x0160 }
            monitor-enter(r3)     // Catch:{ all -> 0x0160 }
            r4 = 0
            r1.a((defpackage.ous) r4)     // Catch:{ all -> 0x0156 }
            r1.d = r4     // Catch:{ all -> 0x0156 }
            monitor-exit(r3)     // Catch:{ all -> 0x0156 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            oza r0 = r9.c
            boolean r0 = r0.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            r1.<init>(r3)
            java.lang.String r4 = "gsaSigned= "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            defpackage.oso.a(r1)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r10 = "Not sending global search app notification. Search app not installed or not signed properly."
            defpackage.oso.c(r10)
            return
        L_0x00ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L_0x0103
            java.util.Iterator r10 = r10.iterator()
        L_0x00de:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0119
            java.lang.Object r1 = r10.next()
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r1 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r1
            java.lang.String r4 = r1.b
            boolean r4 = r9.a((java.lang.String) r4)
            com.google.android.gms.appdatasearch.GlobalSearchApplication r5 = new com.google.android.gms.appdatasearch.GlobalSearchApplication
            java.util.Map r6 = r9.f()
            r5.<init>((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r1, (boolean) r4, (java.util.Map) r6)
            java.lang.String r1 = "com.google.android.gms.icing.GlobalSearchAppRegistered3"
            android.content.Intent r1 = a((java.lang.String) r1, (com.google.android.gms.appdatasearch.GlobalSearchApplication) r5)
            r0.add(r1)
            goto L_0x00de
        L_0x0103:
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.icing.GlobalSearchableAppUnRegistered"
            r10.<init>(r1)
            java.lang.String r1 = "com.google.android.googlequicksearchbox"
            r10.setPackage(r1)
            java.lang.String r1 = r9.b
            java.lang.String r4 = "AppPackageName"
            r10.putExtra(r4, r1)
            r0.add(r10)
        L_0x0119:
            int r10 = r0.size()
        L_0x011d:
            if (r2 >= r10) goto L_0x0155
            java.lang.Object r1 = r0.get(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            r1.setPackage(r4)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + r3
            r6.<init>(r5)
            java.lang.String r5 = "Sending intent: "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            defpackage.oso.a(r4)
            oza r4 = r9.c
            android.content.Context r4 = r4.b
            r4.sendBroadcast(r1)
            int r2 = r2 + 1
            goto L_0x011d
        L_0x0155:
            return
        L_0x0156:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0156 }
            throw r10     // Catch:{ all -> 0x0160 }
        L_0x0159:
            java.lang.String r10 = "setGlobalSearchInfoForGmsCore gsai unchanged"
            defpackage.oso.a(r10)     // Catch:{ all -> 0x0160 }
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            return
        L_0x0160:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0160 }
            goto L_0x0164
        L_0x0163:
            throw r10
        L_0x0164:
            goto L_0x0163
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyz.a(java.util.Set):void");
    }

    public final int b() {
        int size;
        synchronized (this.e) {
            size = this.f.size();
        }
        return size;
    }

    public final int b(boolean z) {
        synchronized (this.d.g) {
            String e2 = this.d.e(this.b);
            String j = j();
            if (j == null) {
                return 3;
            }
            if (TextUtils.isEmpty(e2)) {
                if (z) {
                    if (!r()) {
                        return 1;
                    }
                }
                prp prp = this.d;
                String str = this.b;
                synchronized (prp.g) {
                    out d2 = prp.d(str);
                    aucd aucd = (aucd) d2.c(5);
                    aucd.a((aucj) d2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    out out = (out) aucd.b;
                    out out2 = out.n;
                    j.getClass();
                    out.a = 1 | out.a;
                    out.b = j;
                    prp.a(str, (out) aucd.i());
                }
            } else if (!TextUtils.equals(e2, j)) {
                return 2;
            }
            return 0;
        }
    }

    public final void b(String str) {
        synchronized (this.e) {
            this.g = str;
        }
    }

    public final boolean b(pao pao) {
        boolean contains;
        synchronized (this.e) {
            contains = this.f.contains(pao);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        r8 = new java.util.ArrayList(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (r2.c() == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        r0 = a(r7.c.a());
        r3 = new com.google.android.gms.appdatasearch.GlobalSearchApplication((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r2.c(), r0, f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0098, code lost:
        if (r0 == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009a, code lost:
        r0 = r3.a;
        r2 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchAppRegistered");
        r2.putExtra("AppInfo", r0);
        r8.add(r2);
        r8.add(a("com.google.android.gms.icing.GlobalSearchAppRegistered2", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b4, code lost:
        r8.add(a("com.google.android.gms.icing.GlobalSearchAppRegistered3", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bf, code lost:
        r0 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
        r0.putExtra("AppPackageName", r7.b);
        r8.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d0, code lost:
        r0 = r7.c.b();
        r2 = new java.lang.StringBuilder(16);
        r2.append("gsaSigned= ");
        r2.append(r0);
        defpackage.oso.a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ec, code lost:
        if (r0 == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r0 = r8.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f2, code lost:
        if (r1 >= r0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f4, code lost:
        r2 = (android.content.Intent) r8.get(r1);
        r2.setPackage("com.google.android.googlequicksearchbox");
        r4 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 16);
        r6.append("Sending intent: ");
        r6.append(r4);
        defpackage.oso.a(r6.toString());
        r7.c.b.sendBroadcast(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x012b, code lost:
        defpackage.oso.c("Not sending global search app notification. Search app not installed or not signed properly.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0131, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ozv r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.c()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r7.b
            java.lang.Object r3 = r8.c()
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r3 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r3
            java.lang.String r3 = r3.a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x001a
            r2 = 0
            goto L_0x001b
        L_0x001a:
        L_0x001b:
            defpackage.iva.b((boolean) r2)
            java.lang.String r0 = "setGlobalSearchInfo"
            defpackage.oso.a(r0)
            prp r0 = r7.d
            java.lang.Object r0 = r0.g
            monitor-enter(r0)
            ozv r2 = new ozv     // Catch:{ all -> 0x0187 }
            prp r3 = r7.d     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r3 = r3.i(r4)     // Catch:{ all -> 0x0187 }
            prp r4 = r7.d     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r7.b     // Catch:{ all -> 0x0187 }
            int r4 = r4.j(r5)     // Catch:{ all -> 0x0187 }
            prp r5 = r7.d     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = r7.b     // Catch:{ all -> 0x0187 }
            long r5 = r5.k(r6)     // Catch:{ all -> 0x0187 }
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x0187 }
            boolean r3 = r2.a((defpackage.ozv) r8)     // Catch:{ all -> 0x0187 }
            if (r3 == 0) goto L_0x014d
            java.lang.Object r3 = r2.c()     // Catch:{ all -> 0x0187 }
            java.lang.Object r4 = r8.c()     // Catch:{ all -> 0x0187 }
            boolean r3 = defpackage.ius.a(r3, r4)     // Catch:{ all -> 0x0187 }
            if (r3 != 0) goto L_0x0132
            java.lang.String r3 = "setGlobalSearchInfo info changed for %s"
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x0187 }
            defpackage.oso.a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x0187 }
            java.lang.Object r3 = r8.c()     // Catch:{ all -> 0x0187 }
            int r4 = r8.a()     // Catch:{ all -> 0x0187 }
            long r5 = r8.b()     // Catch:{ all -> 0x0187 }
            r2.a((java.lang.Object) r3, (int) r4, (long) r5)     // Catch:{ all -> 0x0187 }
            r7.b((defpackage.ozv) r2)     // Catch:{ all -> 0x0187 }
            monitor-exit(r0)     // Catch:{ all -> 0x0187 }
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 2
            r8.<init>(r0)
            java.lang.Object r0 = r2.c()
            if (r0 == 0) goto L_0x00bf
            oza r0 = r7.c
            boolean r0 = r0.a()
            boolean r0 = r7.a((boolean) r0)
            com.google.android.gms.appdatasearch.GlobalSearchApplication r3 = new com.google.android.gms.appdatasearch.GlobalSearchApplication
            java.lang.Object r2 = r2.c()
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r2 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r2
            java.util.Map r4 = r7.f()
            r3.<init>((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r2, (boolean) r0, (java.util.Map) r4)
            if (r0 == 0) goto L_0x00b4
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r0 = r3.a
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "com.google.android.gms.icing.GlobalSearchAppRegistered"
            r2.<init>(r4)
            java.lang.String r4 = "AppInfo"
            r2.putExtra(r4, r0)
            r8.add(r2)
            java.lang.String r0 = "com.google.android.gms.icing.GlobalSearchAppRegistered2"
            android.content.Intent r0 = a((java.lang.String) r0, (com.google.android.gms.appdatasearch.GlobalSearchApplication) r3)
            r8.add(r0)
        L_0x00b4:
            java.lang.String r0 = "com.google.android.gms.icing.GlobalSearchAppRegistered3"
            android.content.Intent r0 = a((java.lang.String) r0, (com.google.android.gms.appdatasearch.GlobalSearchApplication) r3)
            r8.add(r0)
            goto L_0x00d0
        L_0x00bf:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.gms.icing.GlobalSearchableAppUnRegistered"
            r0.<init>(r2)
            java.lang.String r2 = r7.b
            java.lang.String r3 = "AppPackageName"
            r0.putExtra(r3, r2)
            r8.add(r0)
        L_0x00d0:
            oza r0 = r7.c
            boolean r0 = r0.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            r2.<init>(r3)
            java.lang.String r4 = "gsaSigned= "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            defpackage.oso.a(r2)
            if (r0 == 0) goto L_0x012b
            int r0 = r8.size()
        L_0x00f2:
            if (r1 >= r0) goto L_0x012a
            java.lang.Object r2 = r8.get(r1)
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            r2.setPackage(r4)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + r3
            r6.<init>(r5)
            java.lang.String r5 = "Sending intent: "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            defpackage.oso.a(r4)
            oza r4 = r7.c
            android.content.Context r4 = r4.b
            r4.sendBroadcast(r2)
            int r1 = r1 + 1
            goto L_0x00f2
        L_0x012a:
            return
        L_0x012b:
            java.lang.String r8 = "Not sending global search app notification. Search app not installed or not signed properly."
            defpackage.oso.c(r8)
            return
        L_0x0132:
            java.lang.String r1 = "setGlobalSearchInfo info unchanged for %s; updating timestamp to %d"
            java.lang.String r3 = r7.b     // Catch:{ all -> 0x0187 }
            long r4 = r8.b()     // Catch:{ all -> 0x0187 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0187 }
            defpackage.oso.a((java.lang.String) r1, (java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x0187 }
            long r3 = r8.b()     // Catch:{ all -> 0x0187 }
            r2.a((long) r3)     // Catch:{ all -> 0x0187 }
            r7.b((defpackage.ozv) r2)     // Catch:{ all -> 0x0187 }
            monitor-exit(r0)     // Catch:{ all -> 0x0187 }
            return
        L_0x014d:
            pau r1 = new pau     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.d()     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.d()     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0187 }
            int r3 = r3.length()     // Catch:{ all -> 0x0187 }
            int r3 = r3 + 53
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0187 }
            int r4 = r4.length()     // Catch:{ all -> 0x0187 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r4.<init>(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "GlobalSearchApplicationInfo: cannot "
            r4.append(r3)     // Catch:{ all -> 0x0187 }
            r4.append(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = " when previously "
            r4.append(r8)     // Catch:{ all -> 0x0187 }
            r4.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0187 }
            r1.<init>(r8)     // Catch:{ all -> 0x0187 }
            throw r1     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x018b
        L_0x018a:
            throw r8
        L_0x018b:
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyz.a(ozv):void");
    }

    public final void a(pao pao) {
        synchronized (this.e) {
            this.f.remove(pao);
        }
    }

    public final boolean a(long j) {
        boolean z;
        prp prp = this.d;
        String str = this.b;
        synchronized (prp.g) {
            out c2 = prp.c(str);
            if (c2 != null) {
                z = (c2.a & 4) != 0;
            } else {
                z = false;
            }
        }
        if (z) {
            return true;
        }
        try {
            ApplicationInfo applicationInfo = this.c.c.getApplicationInfo(this.b, 0);
            try {
                a(ozv.a(new GlobalSearchApplicationInfo(this.b, (String) null, applicationInfo.labelRes, 0, applicationInfo.icon, (String) null, (String) null, (String) null), j));
            } catch (pau e2) {
                oso.e("Implicit gsai conflict with explicit for %s", (Object) this.b);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            oso.e("Could not find app %s", (Object) this.b);
            return false;
        }
    }

    public final boolean a(String str) {
        return this.d.m(str) != otn.DISABLED;
    }

    public final boolean a(String str, boolean z) {
        if (!"com.google.android.gms".equals(this.b)) {
            return a(z);
        }
        if (a.containsKey(str)) {
            str = (String) a.get(str);
        }
        return a(str);
    }

    public final boolean a(boolean z) {
        otn l = this.d.l(this.b);
        return (z || i()) ? l != otn.DISABLED : l == otn.ENABLED;
    }
}
