package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import com.android.volley.RequestQueue;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: atgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgp implements atgq {
    public static final String a = atgp.class.getSimpleName();
    private static final long p = TimeUnit.SECONDS.toMillis(15);
    private static final long q = TimeUnit.SECONDS.toMillis(2);
    private static final long r = TimeUnit.SECONDS.toMillis(30);
    private boolean A;
    private int B;
    public final atgm b;
    public Long c = null;
    public final CopyOnWriteArrayList d;
    public boolean e;
    public final SharedPreferences f;
    private final Random g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final RequestQueue l;
    private final ThreadFactory m;
    private final atfv n;
    private avxj o;
    private final boolean s;
    private ArrayList t;
    private boolean u;
    private volatile int v = 0;
    private boolean w;
    private long x;
    private long y = Long.MIN_VALUE;
    private volatile int z = 0;

    public atgp(String str, String str2, String str3, String str4, avxj avxj, SharedPreferences sharedPreferences, RequestQueue requestQueue, atfv atfv, Random random, ThreadFactory threadFactory) {
        atfy.a(str, "serverAddress");
        this.h = str;
        atfy.a(str2, "platformID");
        this.i = str2;
        atfy.a(str3, "softwareVersion");
        this.j = str3;
        atfy.a(str4, "distributionChannel");
        this.k = str4;
        atfy.a(avxj, "ClientPropertiesRequestProto");
        this.o = avxj;
        atfy.a(sharedPreferences, "SharedPreferences");
        this.f = sharedPreferences;
        atfy.a(requestQueue, "RequestQueue");
        this.l = requestQueue;
        atfy.a(atfv, "AndroidClock");
        this.n = atfv;
        atfy.a(random, "Random");
        this.g = random;
        atfy.a(threadFactory, "ThreadFactory");
        this.m = threadFactory;
        synchronized (this) {
            this.d = new CopyOnWriteArrayList();
            this.t = new ArrayList();
            this.u = false;
            this.e = false;
            this.s = true;
            this.x = 0;
            this.w = false;
            this.A = false;
            this.B = -1;
            this.b = new atgm(this);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7 A[SYNTHETIC, Splitter:B:29:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ff A[Catch:{ all -> 0x02da }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0277  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.atgq a(android.content.Context r17, java.lang.String r18, java.lang.String r19, com.android.volley.RequestQueue r20, java.lang.String r21, boolean r22) {
        /*
            r1 = r17
            r2 = r21
            java.lang.String r0 = "value"
            java.lang.String r3 = "Context"
            defpackage.atfy.a(r1, r3)
            atgc r3 = defpackage.atgc.a
            java.lang.String r4 = "debug.mapview.gmmserver"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.a(r4, r5)
            java.lang.String r4 = "http"
            boolean r4 = r3.startsWith(r4)
            r5 = 1
            if (r4 == 0) goto L_0x0081
            android.net.Uri r4 = android.net.Uri.parse(r3)
            java.lang.String r4 = r4.getHost()
            java.lang.String r6 = ".google.com"
            boolean r6 = r4.endsWith(r6)
            if (r6 != 0) goto L_0x0036
            java.lang.String r6 = "localhost"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0081
        L_0x0036:
            java.lang.String r4 = a
            r6 = 4
            boolean r4 = defpackage.atfx.a(r4, r6)
            java.lang.String r6 = "Hitting custom GMM server: "
            if (r4 == 0) goto L_0x005a
            java.lang.String r4 = a
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x0053
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            goto L_0x0057
        L_0x0053:
            java.lang.String r7 = r6.concat(r7)
        L_0x0057:
            android.util.Log.i(r4, r7)
        L_0x005a:
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            if (r4 != r7) goto L_0x0080
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0074
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
            goto L_0x0078
        L_0x0074:
            java.lang.String r4 = r6.concat(r4)
        L_0x0078:
            android.widget.Toast r4 = android.widget.Toast.makeText(r1, r4, r5)
            r4.show()
            goto L_0x0083
        L_0x0080:
            goto L_0x0083
        L_0x0081:
            java.lang.String r3 = "https://clients4.google.com/glm/mmap"
        L_0x0083:
            java.lang.String r4 = "/api"
            boolean r6 = r3.endsWith(r4)
            if (r6 != 0) goto L_0x0095
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r4)
            r7 = r3
            goto L_0x0096
        L_0x0095:
            r7 = r3
        L_0x0096:
            java.lang.String r3 = defpackage.athb.a
            java.lang.String r3 = "context"
            defpackage.atfy.a(r1, r3)
            atga r4 = defpackage.atga.a
            android.os.StrictMode$ThreadPolicy r4 = r4.a()
            java.lang.String r6 = "maps_client_id"
            r8 = 3
            r9 = 0
            r10 = 0
            android.content.ContentResolver r11 = r17.getContentResolver()     // Catch:{ all -> 0x00f5 }
            java.lang.String r12 = "content://com.google.settings/partner"
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x00f5 }
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ all -> 0x00f5 }
            r13[r10] = r0     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r15 = 21
            r14.<init>(r15)     // Catch:{ all -> 0x00f5 }
            java.lang.String r15 = "name='"
            r14.append(r15)     // Catch:{ all -> 0x00f5 }
            r14.append(r6)     // Catch:{ all -> 0x00f5 }
            java.lang.String r15 = "'"
            r14.append(r15)     // Catch:{ all -> 0x00f5 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x00f5 }
            r15 = 0
            r16 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00e8
            boolean r12 = r11.moveToFirst()     // Catch:{ all -> 0x00e6 }
            if (r12 == 0) goto L_0x00e8
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            goto L_0x00f7
        L_0x00e8:
            r0 = r9
        L_0x00e9:
            if (r11 != 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00ec:
            r11.close()
        L_0x00ef:
            atga r6 = defpackage.atga.a
            r6.a(r4)
            goto L_0x0131
        L_0x00f5:
            r0 = move-exception
            r11 = r9
        L_0x00f7:
            java.lang.String r12 = defpackage.athb.a     // Catch:{ all -> 0x02da }
            boolean r12 = defpackage.atfx.a(r12, r8)     // Catch:{ all -> 0x02da }
            if (r12 == 0) goto L_0x0125
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02da }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02da }
            int r12 = r12.length()     // Catch:{ all -> 0x02da }
            int r12 = r12 + 59
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x02da }
            r13.<init>(r12)     // Catch:{ all -> 0x02da }
            java.lang.String r12 = "Error getting distribution channel for key "
            r13.append(r12)     // Catch:{ all -> 0x02da }
            r13.append(r6)     // Catch:{ all -> 0x02da }
            java.lang.String r6 = ": "
            r13.append(r6)     // Catch:{ all -> 0x02da }
            r13.append(r0)     // Catch:{ all -> 0x02da }
            r13.toString()     // Catch:{ all -> 0x02da }
        L_0x0125:
            if (r11 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r11.close()
        L_0x012b:
            atga r0 = defpackage.atga.a
            r0.a(r4)
            r0 = r9
        L_0x0131:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            if (r0 == 0) goto L_0x0143
            int r6 = r0.length()
            if (r6 != 0) goto L_0x013f
            goto L_0x0143
        L_0x013f:
            r4.append(r0)
            goto L_0x0149
        L_0x0143:
            java.lang.String r0 = "Web"
            r4.append(r0)
        L_0x0149:
            java.lang.String r0 = r4.toString()
            atga r4 = defpackage.atga.a
            android.os.StrictMode$ThreadPolicy r4 = r4.b()
            java.lang.String r6 = "com.google.maps.api.android.lib6.drd.PREFERENCES_FILE"
            android.content.SharedPreferences r12 = r1.getSharedPreferences(r6, r10)     // Catch:{ all -> 0x02d3 }
            atga r6 = defpackage.atga.a
            r6.a(r4)
            int r4 = defpackage.atgr.b
            defpackage.atfy.a(r1, r3)
            java.lang.String r6 = "applicationName"
            defpackage.atfy.a(r2, r6)
            avxj r6 = defpackage.avxj.q
            aucd r6 = r6.o()
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r6.c()
            r6.c = r10
        L_0x0178:
            aucj r11 = r6.b
            avxj r11 = (defpackage.avxj) r11
            r21.getClass()
            int r13 = r11.a
            r13 = r13 | 256(0x100, float:3.59E-43)
            r11.a = r13
            r11.g = r2
            int r2 = r11.b
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r11.b = r2
            r2 = r22
            r11.p = r2
            java.lang.String r2 = android.os.Build.VERSION.SDK
            boolean r11 = r6.c
            if (r11 != 0) goto L_0x0198
            goto L_0x019d
        L_0x0198:
            r6.c()
            r6.c = r10
        L_0x019d:
            aucj r11 = r6.b
            avxj r11 = (defpackage.avxj) r11
            r2.getClass()
            int r13 = r11.a
            r14 = 4194304(0x400000, float:5.877472E-39)
            r13 = r13 | r14
            r11.a = r13
            r11.k = r2
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r13
            r11.a = r2
            r11.l = r10
            r2 = r2 | 64
            r11.a = r2
            r11.f = r5
            java.lang.String r13 = "SYSTEM"
            r13.getClass()
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r11.a = r2
            r11.h = r13
            java.lang.String r13 = "6.18.0"
            r13.getClass()
            int r14 = r11.b
            r14 = r14 | 8
            r11.b = r14
            r11.n = r13
            r13 = 200(0xc8, float:2.8E-43)
            r14 = 262144(0x40000, float:3.67342E-40)
            if (r4 > r13) goto L_0x01de
            r11.j = r5
            r2 = r2 | r14
            r11.a = r2
            goto L_0x01e3
        L_0x01de:
            r11.j = r8
            r2 = r2 | r14
            r11.a = r2
        L_0x01e3:
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0211
            java.lang.String r2 = r2.getSimCountryIso()
            boolean r4 = defpackage.atgb.a(r2)
            if (r4 != 0) goto L_0x0211
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x01fd
            goto L_0x0202
        L_0x01fd:
            r6.c()
            r6.c = r10
        L_0x0202:
            aucj r4 = r6.b
            avxj r4 = (defpackage.avxj) r4
            r2.getClass()
            int r11 = r4.a
            r11 = r11 | 8
            r4.a = r11
            r4.e = r2
        L_0x0211:
            defpackage.atfy.a(r1, r3)
            android.content.ContentResolver r2 = r17.getContentResolver()
            java.lang.String r3 = "context.getContentResolver()"
            defpackage.atfy.a(r2, r3)
            java.lang.String r3 = defpackage.athb.b
            if (r3 != 0) goto L_0x0270
            jnh r1 = defpackage.jni.b(r17)
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x026e
            java.lang.String r1 = "logging_id2"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r2, r1)
            atga r4 = defpackage.atga.a
            android.os.StrictMode$ThreadPolicy r4 = r4.a()
            if (r3 == 0) goto L_0x023b
            goto L_0x0241
        L_0x023b:
            java.lang.String r1 = defpackage.aeed.a(r2, r1)     // Catch:{ all -> 0x0266 }
            r3 = r1
        L_0x0241:
            atga r1 = defpackage.atga.a
            r1.a(r4)
            java.lang.String r1 = defpackage.athb.a
            boolean r1 = defpackage.atfx.a(r1, r8)
            if (r1 == 0) goto L_0x0263
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = "getAndroidLoggingId2() => "
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0260
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x0263
        L_0x0260:
            r2.concat(r1)
        L_0x0263:
            defpackage.athb.b = r3
            goto L_0x0271
        L_0x0266:
            r0 = move-exception
            r1 = r0
            atga r0 = defpackage.atga.a
            r0.a(r4)
            throw r1
        L_0x026e:
            r3 = r9
            goto L_0x0271
        L_0x0270:
        L_0x0271:
            boolean r1 = defpackage.atgb.a(r3)
            if (r1 != 0) goto L_0x0290
            boolean r1 = r6.c
            if (r1 != 0) goto L_0x027c
            goto L_0x0281
        L_0x027c:
            r6.c()
            r6.c = r10
        L_0x0281:
            aucj r1 = r6.b
            avxj r1 = (defpackage.avxj) r1
            r3.getClass()
            int r2 = r1.a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r1.a = r2
            r1.i = r3
        L_0x0290:
            boolean r1 = defpackage.atgb.a(r9)
            if (r1 == 0) goto L_0x02bc
            aucj r1 = r6.i()
            r11 = r1
            avxj r11 = (defpackage.avxj) r11
            atgp r1 = new atgp
            atfv r14 = defpackage.atfv.a
            java.util.Random r15 = new java.util.Random
            r15.<init>()
            atgd r2 = new atgd
            java.lang.String r3 = "androidmapsapi-DataRequestDispatcher"
            r2.<init>(r3)
            r6 = r1
            r8 = r18
            r9 = r19
            r10 = r0
            r13 = r20
            r16 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x02bc:
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x02c1
            goto L_0x02c6
        L_0x02c1:
            r6.c()
            r6.c = r10
        L_0x02c6:
            aucj r0 = r6.b
            avxj r0 = (defpackage.avxj) r0
            int r1 = r0.b
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r0.b = r1
            r0.o = r5
            throw r9
        L_0x02d3:
            r0 = move-exception
            atga r1 = defpackage.atga.a
            r1.a(r4)
            throw r0
        L_0x02da:
            r0 = move-exception
            if (r11 != 0) goto L_0x02de
            goto L_0x02e1
        L_0x02de:
            r11.close()
        L_0x02e1:
            atga r1 = defpackage.atga.a
            r1.a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgp.a(android.content.Context, java.lang.String, java.lang.String, com.android.volley.RequestQueue, java.lang.String, boolean):atgq");
    }

    private final synchronized void s() {
        this.y = Long.MIN_VALUE;
        this.w = false;
        this.x = 0;
        this.B = -1;
    }

    public final synchronized void a() {
        this.z++;
    }

    public final synchronized void b() {
        this.z--;
    }

    public final void c() {
        atgt atgt;
        if (f()) {
            synchronized (this) {
                if (this.t.isEmpty() || !this.u) {
                    atgt = null;
                } else {
                    ArrayList arrayList = this.t;
                    this.t = new ArrayList();
                    this.u = false;
                    atgt = new atgt(this, arrayList, atgr.f, this.l, this.h, this.i, this.j, this.k, this.m);
                }
            }
            if (atgt != null) {
                atgt.b.a();
                atgt.d.newThread(atgt).start();
            }
        }
    }

    public final void d() {
        q();
        if (e()) {
            c();
        }
    }

    public final synchronized boolean e() {
        return this.u;
    }

    public final synchronized boolean f() {
        boolean z2;
        z2 = true;
        if (!g() || this.z >= 10 || (!this.A && this.z != 0)) {
            z2 = false;
        }
        return z2;
    }

    public final synchronized boolean g() {
        return this.e;
    }

    public final synchronized void h() {
        this.e = false;
    }

    public final synchronized boolean i() {
        return this.s;
    }

    public final synchronized long j() {
        return this.B != 4 ? this.x : this.x + 800 + (this.g.nextLong() % this.x);
    }

    public final synchronized void k() {
        this.A = true;
        s();
    }

    public final synchronized long l() {
        Long l2 = this.c;
        if (l2 == null) {
            long j2 = this.f.getLong("SessionID", 0);
            if (j2 == 0) {
                if (atfx.a(a, 4)) {
                    Log.i(a, "No GMM Server cookie cached. Initiating new request.");
                }
                a((atgo) new atha(this));
            } else if (atfx.a(a, 4)) {
                String str = a;
                String valueOf = String.valueOf(Long.toHexString(j2));
                Log.i(str, valueOf.length() == 0 ? new String("GMM Server cookie (cached): ") : "GMM Server cookie (cached): ".concat(valueOf));
            }
            Long valueOf2 = Long.valueOf(j2);
            this.c = valueOf2;
            return valueOf2.longValue();
        }
        return l2.longValue();
    }

    public final synchronized String m() {
        avxj avxj = this.o;
        if ((avxj.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return null;
        }
        return avxj.g;
    }

    public final synchronized String n() {
        avxj avxj = this.o;
        if ((avxj.b & 4) == 0) {
            return null;
        }
        return avxj.m;
    }

    public final synchronized avxj o() {
        return this.o;
    }

    public final synchronized void p() {
        String str;
        String str2 = null;
        if ((this.o.a & 1) == 0) {
            str = this.f.getString("Cohort", (String) null);
        } else {
            str = null;
        }
        if ((this.o.a & 2) == 0) {
            str2 = this.f.getString("LegalCountry", (String) null);
        }
        if (str != null || str2 != null) {
            avxj avxj = this.o;
            aucd aucd = (aucd) avxj.c(5);
            aucd.a((aucj) avxj);
            if (str != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avxj avxj2 = (avxj) aucd.b;
                avxj avxj3 = avxj.q;
                str.getClass();
                avxj2.a |= 1;
                avxj2.c = str;
            }
            if (str2 != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avxj avxj4 = (avxj) aucd.b;
                avxj avxj5 = avxj.q;
                str2.getClass();
                avxj4.a |= 2;
                avxj4.d = str2;
            }
            this.o = (avxj) aucd.i();
        }
    }

    public final synchronized void q() {
    }

    public final void r() {
        boolean z2;
        synchronized (this) {
            z2 = true;
            if (!this.w) {
                if (atfx.a(a, 6)) {
                    Log.e(a, "In Error Mode");
                }
                this.w = true;
                this.y = Long.MIN_VALUE;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                atgg atgg = (atgg) it.next();
            }
        }
    }

    public final void b(atgo atgo) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((atgg) it.next()).a(atgo);
        }
    }

    private static void a(SharedPreferences sharedPreferences, String str, String str2) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        StrictMode.ThreadPolicy b2 = atga.a.b();
        try {
            edit.commit();
        } finally {
            atga.a.a(b2);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(int r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = a     // Catch:{ all -> 0x009c }
            r1 = 6
            boolean r0 = defpackage.atfx.a(r0, r1)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = a     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r2 = 18
            r1.<init>(r2)     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "Error #"
            r1.append(r2)     // Catch:{ all -> 0x009c }
            r1.append(r8)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009c }
            android.util.Log.e(r0, r1, r9)     // Catch:{ all -> 0x009c }
        L_0x0022:
            monitor-enter(r7)     // Catch:{ all -> 0x009c }
            r7.B = r8     // Catch:{ all -> 0x0099 }
            r0 = 200(0xc8, double:9.9E-322)
            r9 = 4
            r2 = 0
            if (r8 == r9) goto L_0x0071
            boolean r8 = r7.w     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0053
            long r8 = r7.x     // Catch:{ all -> 0x0099 }
            long r0 = q     // Catch:{ all -> 0x0099 }
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0043
            long r8 = r7.x     // Catch:{ all -> 0x0099 }
            r0 = 5
            long r8 = r8 * r0
            r0 = 4
            long r8 = r8 / r0
            r7.x = r8     // Catch:{ all -> 0x0099 }
            goto L_0x0047
        L_0x0043:
            long r8 = q     // Catch:{ all -> 0x0099 }
            r7.x = r8     // Catch:{ all -> 0x0099 }
        L_0x0047:
            long r0 = r     // Catch:{ all -> 0x0099 }
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0052
            long r8 = r     // Catch:{ all -> 0x0099 }
            r7.x = r8     // Catch:{ all -> 0x0099 }
            goto L_0x0091
        L_0x0052:
            goto L_0x0091
        L_0x0053:
            r7.x = r0     // Catch:{ all -> 0x0099 }
            long r8 = r7.y     // Catch:{ all -> 0x0099 }
            r0 = -9223372036854775808
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x006a
            long r0 = p     // Catch:{ all -> 0x0099 }
            long r8 = r8 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0099 }
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x0091
            r2 = 1
            goto L_0x0091
        L_0x006a:
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0099 }
            r7.y = r8     // Catch:{ all -> 0x0099 }
            goto L_0x0091
        L_0x0071:
            long r3 = r7.x     // Catch:{ all -> 0x0099 }
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            boolean r8 = r7.w     // Catch:{ all -> 0x0099 }
            if (r8 != 0) goto L_0x008a
            long r8 = r     // Catch:{ all -> 0x0099 }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            long r8 = r7.x     // Catch:{ all -> 0x0099 }
            long r8 = r8 + r8
            r7.x = r8     // Catch:{ all -> 0x0099 }
            goto L_0x0091
        L_0x008a:
            r7.s()     // Catch:{ all -> 0x0099 }
            r7.B = r9     // Catch:{ all -> 0x0099 }
            r7.x = r0     // Catch:{ all -> 0x0099 }
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0097
            r7.r()     // Catch:{ all -> 0x009c }
        L_0x0097:
            monitor-exit(r7)
            return
        L_0x0099:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0099 }
            throw r8     // Catch:{ all -> 0x009c }
        L_0x009c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgp.a(int, java.lang.Throwable):void");
    }

    public final void a(atgo atgo) {
        atgo.g();
        if (atfx.a(a, 3)) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Add Data Request: ");
            sb.append(atgo.a());
            sb.toString();
        }
        synchronized (this) {
            if (atgo.b()) {
                this.u = true;
            }
            this.t.add(atgo);
        }
        if (atgo.b()) {
            q();
            c();
        }
    }

    public final synchronized void a(avxk avxk) {
        String str;
        atfy.a(avxk, "ClientPropertiesResponseProto");
        int i2 = avxk.a;
        String str2 = null;
        if ((i2 & 1) != 0) {
            str = avxk.b;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = avxk.c;
        }
        if (str != null || str2 != null) {
            avxj avxj = this.o;
            aucd aucd = (aucd) avxj.c(5);
            aucd.a((aucj) avxj);
            if (str != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avxj avxj2 = (avxj) aucd.b;
                avxj avxj3 = avxj.q;
                str.getClass();
                avxj2.a |= 1;
                avxj2.c = str;
                a(this.f, "Cohort", str);
            }
            if (str2 != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avxj avxj4 = (avxj) aucd.b;
                avxj avxj5 = avxj.q;
                str2.getClass();
                avxj4.a |= 2;
                avxj4.d = str2;
                a(this.f, "LegalCountry", str2);
            }
            this.o = (avxj) aucd.i();
        }
    }
}
