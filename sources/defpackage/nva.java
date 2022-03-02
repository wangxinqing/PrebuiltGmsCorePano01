package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import com.google.android.gms.gcm.connection.ReconnectManager$ReconnectBroadcastReceiver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: nva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nva {
    private long A;
    private final jiq B;
    private long C;
    private final Random D;
    private ConnectivityManager.NetworkCallback E;
    public final Context a;
    public final ConnectivityManager b;
    public final nup c;
    public final ReconnectManager$ReconnectBroadcastReceiver d;
    public final nuy e;
    public boolean f;
    NetworkInfo.State g = NetworkInfo.State.UNKNOWN;
    int h;
    NetworkInfo.State i = NetworkInfo.State.UNKNOWN;
    int j;
    public boolean k;
    boolean l = true;
    public nut m;
    public List n;
    public List o;
    public long p;
    public long q;
    public long r;
    public final nuw s;
    private final nuk t;
    private long u;
    private boolean v = false;
    private long w;
    private long x;
    private final Object y = new Object();
    private long z;

    public nva(Context context, jiq jiq, nuk nuk, Random random) {
        nqw.a(context);
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.t = nuk;
        this.D = random;
        this.b = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.d = new ReconnectManager$ReconnectBroadcastReceiver(this);
        this.B = jiq;
        this.s = new nuw(this.a);
        this.e = new nuy(this.a, this.s, this.t, random);
        this.c = new nup(this.b);
    }

    public static final List a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : amsk.a(',').a((CharSequence) str)) {
            String[] split = str2.split(":");
            if (split.length != 2) {
                String valueOf = String.valueOf(str2);
                Log.e("GCM", valueOf.length() == 0 ? new String("Invalid GcmClient endpoint: ") : "Invalid GcmClient endpoint: ".concat(valueOf));
            } else {
                try {
                    Integer.parseInt(split[1]);
                    arrayList.add(split);
                } catch (NumberFormatException e2) {
                    String valueOf2 = String.valueOf(str2);
                    Log.e("GCM", valueOf2.length() == 0 ? new String("Invalid GcmClient endpoint: ") : "Invalid GcmClient endpoint: ".concat(valueOf2));
                }
            }
        }
        return arrayList;
    }

    private final synchronized void j() {
        this.E = new nuz(this);
    }

    public final void b() {
        a(false);
    }

    public final void c() {
        boolean z2;
        if (axlc.i() >= 0) {
            NetworkInfo networkInfo = this.b.getNetworkInfo(h());
            ContentResolver contentResolver = this.a.getContentResolver();
            int i2 = Build.VERSION.SDK_INT;
            boolean z3 = false;
            if (Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.z > 0) {
                z3 = true;
            }
            if (z2 != z3) {
                b(z2);
            }
            if (!z2 || (networkInfo != null && networkInfo.isConnected())) {
                this.e.a(networkInfo);
            }
        }
    }

    public final void d() {
        synchronized (this) {
            if (axlc.a.a().b()) {
                this.f = false;
                this.e.b.d();
            }
        }
    }

    public final boolean e() {
        return this.h == 1 && this.c.b() == 4;
    }

    public final void f() {
        this.u = 0;
    }

    public final boolean g() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int h() {
        if (!e()) {
            return this.h;
        }
        return 0;
    }

    public final void i() {
        this.e.b.b.c();
    }

    public final void b(boolean z2) {
        StringBuilder sb = new StringBuilder(47);
        sb.append("handleAirplaneModeChanged: airplaneModeOn=");
        sb.append(z2);
        sb.toString();
        if (z2) {
            this.z = SystemClock.elapsedRealtime();
            this.A = 0;
            if (this.i == NetworkInfo.State.DISCONNECTED) {
                d();
                return;
            }
            return;
        }
        this.z = 0;
        this.A = SystemClock.elapsedRealtime();
    }

    public final synchronized void a() {
        NetworkRequest networkRequest;
        j();
        if (!axlc.a.a().al()) {
            networkRequest = new NetworkRequest.Builder().build();
        } else {
            networkRequest = new NetworkRequest.Builder().removeCapability(15).removeCapability(14).build();
        }
        this.s.a(networkRequest, this.E);
    }

    public final void c(boolean z2) {
        int i2;
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.reportNetworkConnectivity((Network) null, z2);
        } else if (this.l) {
            if (!z2) {
                i2 = 0;
            } else {
                i2 = 100;
            }
            synchronized (this.y) {
                ConnectivityManager connectivityManager = this.b;
                int h2 = h();
                try {
                    connectivityManager.getClass().getMethod("reportInetCondition", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(connectivityManager, new Object[]{Integer.valueOf(h2), Integer.valueOf(i2)});
                } catch (Exception e2) {
                    Log.e("GCM", "reportInetCondition not supported");
                    this.l = false;
                }
            }
        }
    }

    public final void a(int i2, boolean z2) {
        if (i2 == 27) {
            return;
        }
        if ((!z2 || this.m.e() < axlc.p()) && ((i2 != 4 || axlc.a.a().y()) && !this.c.a() && ((axlc.a.a().z() && this.h == 1) || (axkw.a.a().c() && nqw.e(this.h))))) {
            a(true);
            return;
        }
        c(false);
        if (i2 == 28 || i2 == 6 || i2 == 29) {
            a(false);
            return;
        }
        c();
        i();
    }

    public final void a(Network network, int i2) {
        NetworkInfo networkInfo = this.b.getNetworkInfo(network);
        if (i2 == 1) {
            a(networkInfo, true);
        } else {
            a(networkInfo, false);
        }
    }

    public final void a(NetworkInfo.State state, int i2) {
        String valueOf = String.valueOf(state);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("setInternalNetworkState: type=");
        sb.append(i2);
        sb.append(", state=");
        sb.append(valueOf);
        sb.toString();
        this.v = state == NetworkInfo.State.SUSPENDED;
        this.g = state;
        this.h = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0291  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.net.NetworkInfo r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            android.net.ConnectivityManager r0 = r1.b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r2 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0020
            long r4 = r1.p
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1.p = r4
            goto L_0x0036
        L_0x0020:
            long r4 = r1.p
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            long r4 = r1.C
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.p
            long r6 = r6 - r8
            long r4 = r4 + r6
            r1.C = r4
            r4 = -1
            r1.p = r4
        L_0x0036:
            if (r19 != 0) goto L_0x0039
            goto L_0x0046
        L_0x0039:
            if (r18 == 0) goto L_0x0046
            nrr r0 = defpackage.nrr.a()
            nyn r0 = r0.e()
            r0.a()
        L_0x0046:
            long r4 = defpackage.axlc.i()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x02e1
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1.w = r4
            r0 = -1
            if (r18 != 0) goto L_0x0065
            java.lang.String r4 = "GCM"
            java.lang.String r5 = "Connection event without network info, shouldn't happen !"
            android.util.Log.w(r4, r5)
            r1.j = r0
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.DISCONNECTED
            r1.i = r4
            goto L_0x0071
        L_0x0065:
            int r4 = r18.getType()
            r1.j = r4
            android.net.NetworkInfo$State r4 = r18.getState()
            r1.i = r4
        L_0x0071:
            android.net.ConnectivityManager r4 = r1.b
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0095
            boolean r7 = r4.isConnected()
            if (r7 != 0) goto L_0x0088
            java.lang.String r7 = "GCM"
            java.lang.String r8 = "ACTIVE NETWORK NOT CONNECTED"
            android.util.Log.w(r7, r8)
        L_0x0088:
            r1.k = r5
            int r7 = r4.getType()
            long r8 = java.lang.System.currentTimeMillis()
            r1.q = r8
            goto L_0x009e
        L_0x0095:
            r1.k = r6
            long r7 = java.lang.System.currentTimeMillis()
            r1.r = r7
            r7 = -1
        L_0x009e:
            int r8 = r1.j
            if (r8 != r5) goto L_0x00b8
            android.net.NetworkInfo$State r8 = r1.i
            android.net.NetworkInfo$State r9 = android.net.NetworkInfo.State.DISCONNECTED
            if (r8 == r9) goto L_0x00b2
            android.net.NetworkInfo$State r8 = r1.i
            android.net.NetworkInfo$State r9 = android.net.NetworkInfo.State.CONNECTED
            if (r8 == r9) goto L_0x00af
            goto L_0x00b8
        L_0x00af:
            r1.x = r2
            goto L_0x00b8
        L_0x00b2:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r1.x = r8
        L_0x00b8:
            boolean r8 = r1.k
            r9 = 20000(0x4e20, double:9.8813E-320)
            if (r8 == 0) goto L_0x029a
            android.net.NetworkInfo$State r8 = r4.getState()
            nut r11 = r1.m
            boolean r11 = r11.a()
            nut r12 = r1.m
            boolean r12 = r12.b()
            r13 = 2
            if (r11 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            if (r12 == 0) goto L_0x0162
        L_0x00d4:
            nut r14 = r1.m
            nvh r14 = (defpackage.nvh) r14
            boolean r14 = r14.d
            if (r14 != 0) goto L_0x0162
            nut r14 = r1.m
            nvh r14 = (defpackage.nvh) r14
            nvi r14 = r14.a
            int r14 = r14.c
            if (r14 == r0) goto L_0x013a
            if (r14 == r7) goto L_0x013a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r0[r6] = r2
            java.lang.String r2 = "Endpoint network %d != active one: starting parallel connection"
            com.google.android.gms.gcm.GcmChimeraService.a(r2, r0)
            r1.a((android.net.NetworkInfo.State) r8, (int) r7)
            nut r0 = r1.m
            r2 = r0
            nvh r2 = (defpackage.nvh) r2
            java.lang.Object r15 = r2.c
            monitor-enter(r15)
            r3 = r0
            nvh r3 = (defpackage.nvh) r3     // Catch:{ all -> 0x0137 }
            boolean r3 = r3.d     // Catch:{ all -> 0x0137 }
            if (r3 != 0) goto L_0x0128
            r3 = r0
            nvh r3 = (defpackage.nvh) r3     // Catch:{ all -> 0x0137 }
            nvi r3 = r3.a     // Catch:{ all -> 0x0137 }
            boolean r3 = r3.f     // Catch:{ all -> 0x0137 }
            r7 = 0
            if (r3 != 0) goto L_0x0118
            nvh r0 = (defpackage.nvh) r0     // Catch:{ all -> 0x0137 }
            r0.a((defpackage.nuv) r7, (defpackage.nux) r7)     // Catch:{ all -> 0x0137 }
            monitor-exit(r15)     // Catch:{ all -> 0x0137 }
            goto L_0x0129
        L_0x0118:
            nvh r0 = (defpackage.nvh) r0     // Catch:{ all -> 0x0137 }
            r0.d = r5     // Catch:{ all -> 0x0137 }
            monitor-exit(r15)     // Catch:{ all -> 0x0137 }
            nvi r0 = r2.a
            r2.a((defpackage.nvi) r0, (defpackage.nuv) r7)
            nvi r0 = r2.a
            r2.b(r0, r5, r7)
            goto L_0x0129
        L_0x0128:
            monitor-exit(r15)     // Catch:{ all -> 0x0137 }
        L_0x0129:
            nuy r0 = r1.e
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0161
            nuy r0 = r1.e
            r0.a(r4, r6)
            return
        L_0x0137:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            if (r7 != 0) goto L_0x0162
            if (r14 != 0) goto L_0x0162
            boolean r0 = r17.e()
            if (r0 == 0) goto L_0x0162
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = "Active network is now cellular, but already on cellular fallback."
            com.google.android.gms.gcm.GcmChimeraService.a(r2, r0)
            r1.a((android.net.NetworkInfo.State) r8, (int) r6)
            nup r0 = r1.c
            r0.b(r13)
            nuy r0 = r1.e
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0161
            nuy r0 = r1.e
            r0.a(r4, r6)
            return
        L_0x0161:
            return
        L_0x0162:
            if (r12 != 0) goto L_0x0165
            goto L_0x0169
        L_0x0165:
            r1.c(r5)
        L_0x0169:
            android.net.NetworkInfo$State r0 = r1.g
            if (r8 == r0) goto L_0x016e
            goto L_0x019e
        L_0x016e:
            int r14 = r1.h
            if (r7 != r14) goto L_0x019e
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 94
            r3.<init>(r2)
            java.lang.String r2 = "### networkStateChanged: active and curr network type/state are the same("
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = "/"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "), ignore"
            r3.append(r0)
            r3.toString()
            return
        L_0x019e:
            int r14 = r1.h
            r1.a((android.net.NetworkInfo.State) r8, (int) r7)
            r8 = r14
            long r13 = r1.x
            long r2 = r1.A
            if (r7 == r5) goto L_0x01c7
            r15 = 7
            if (r7 == r15) goto L_0x01c7
            r15 = 9
            if (r7 == r15) goto L_0x01c7
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r13 = r15 - r13
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c7
            long r15 = r15 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r7 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x01c5
            r2 = 0
            goto L_0x01c8
        L_0x01c5:
            r2 = 1
            goto L_0x01c8
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            boolean r3 = r1.v
            r7 = 3
            if (r12 == 0) goto L_0x01cf
            goto L_0x0252
        L_0x01cf:
            if (r2 == 0) goto L_0x0252
            if (r3 != 0) goto L_0x0252
            long r2 = r1.u
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0213
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r1.u
            long r2 = r2 - r8
            axlc r0 = defpackage.axlc.a
            axld r0 = r0.a()
            long r8 = r0.Y()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0213
            long r8 = r1.u
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r10 = 111(0x6f, float:1.56E-43)
            r0.<init>(r10)
            java.lang.String r10 = "networkStateChanged: mLastMobileNetworkOutageTs="
            r0.append(r10)
            r0.append(r8)
            java.lang.String r8 = ", diff="
            r0.append(r8)
            r0.append(r2)
            java.lang.String r2 = ", use long delay"
            r0.append(r2)
            r0.toString()
            r0 = 1
            goto L_0x0214
        L_0x0213:
            r0 = 0
        L_0x0214:
            nuy r2 = r1.e
            r2.a((boolean) r0)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            int r3 = r1.h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r6] = r3
            if (r0 != 0) goto L_0x0228
            java.lang.String r3 = ""
            goto L_0x022a
        L_0x0228:
            java.lang.String r3 = "Long"
        L_0x022a:
            r2[r5] = r3
            nuy r3 = r1.e
            long r5 = r3.a()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 2
            r2[r5] = r3
            java.lang.String r3 = "Network event while disconnected / throttling %d %s %d"
            com.google.android.gms.gcm.GcmChimeraService.a(r3, r2)
            nuy r2 = r1.e
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x024e
            nuy r2 = r1.e
            r2.a(r4, r0)
        L_0x024e:
            r17.c()
            goto L_0x0296
        L_0x0252:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2[r6] = r8
            if (r12 != 0) goto L_0x0260
            java.lang.String r8 = ""
            goto L_0x0262
        L_0x0260:
            java.lang.String r8 = "connected"
        L_0x0262:
            r2[r5] = r8
            r8 = 2
            r2[r8] = r0
            if (r3 != 0) goto L_0x026c
            java.lang.String r0 = ""
            goto L_0x026e
        L_0x026c:
            java.lang.String r0 = "suspended"
        L_0x026e:
            r2[r7] = r0
            java.lang.String r0 = "Reconnect on network change %d %s %s %s"
            com.google.android.gms.gcm.GcmChimeraService.a(r0, r2)
            if (r12 == 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            if (r11 == 0) goto L_0x027f
        L_0x027a:
            nut r0 = r1.m
            r0.a((int) r5)
        L_0x027f:
            r1.a((boolean) r6)
            nuy r0 = r1.e
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0291
            nuy r0 = r1.e
            r0.a(r4, r6)
            goto L_0x0296
        L_0x0291:
            nuy r0 = r1.e
            r0.a((boolean) r6)
        L_0x0296:
            r17.f()
            return
        L_0x029a:
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED
            r1.a((android.net.NetworkInfo.State) r2, (int) r0)
            long r2 = r1.u
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x02c4
            android.net.NetworkInfo$State r0 = r1.i
            android.net.NetworkInfo$State r2 = android.net.NetworkInfo.State.DISCONNECTED
            if (r0 != r2) goto L_0x02be
            long r2 = r1.z
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02be
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r7 = r1.z
            long r2 = r2 - r7
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x02c4
        L_0x02be:
            long r2 = java.lang.System.currentTimeMillis()
            r1.u = r2
        L_0x02c4:
            nut r0 = r1.m
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x02d9
            nut r0 = r1.m
            r0.a((int) r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = "Disconnect on network down"
            com.google.android.gms.gcm.GcmChimeraService.a(r2, r0)
            return
        L_0x02d9:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = "Network down, already disconnected"
            com.google.android.gms.gcm.GcmChimeraService.a(r2, r0)
            return
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nva.a(android.net.NetworkInfo, boolean):void");
    }

    public final void a(PrintWriter printWriter) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = this.e.b.a() - elapsedRealtime;
        String str2 = "";
        if (this.e.b.c()) {
            String formatElapsedTime = DateUtils.formatElapsedTime(a2 / 1000);
            String valueOf = String.valueOf(this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(formatElapsedTime).length() + 46 + String.valueOf(valueOf).length());
            sb.append("ReconnectManager: next reconnect attempt in ");
            sb.append(formatElapsedTime);
            sb.append("s ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        } else {
            String str3 = !this.m.b() ? str2 : "Connected";
            String str4 = (this.m.a() && !this.m.b()) ? "Connecting" : str2;
            StringBuilder sb2 = new StringBuilder(str3.length() + 21 + str4.length());
            sb2.append("ReconnectManager OFF ");
            sb2.append(str3);
            sb2.append(str4);
            printWriter.println(sb2.toString());
        }
        int i2 = this.j;
        String valueOf2 = String.valueOf(this.i);
        String formatElapsedTime2 = DateUtils.formatElapsedTime((elapsedRealtime - this.w) / 1000);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 58 + String.valueOf(formatElapsedTime2).length());
        sb3.append("Last network state notification: ");
        sb3.append(i2);
        sb3.append("/");
        sb3.append(valueOf2);
        sb3.append(", time: ");
        sb3.append(formatElapsedTime2);
        sb3.append("s ago");
        printWriter.println(sb3.toString());
        int i3 = this.h;
        StringBuilder sb4 = new StringBuilder(32);
        sb4.append("active network type: ");
        sb4.append(i3);
        printWriter.println(sb4.toString());
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == this.h)) {
            printWriter.println("Type missmatch between polled and callback:");
            int type = activeNetworkInfo.getType();
            StringBuilder sb5 = new StringBuilder(41);
            sb5.append("active network type (polled): ");
            sb5.append(type);
            printWriter.println(sb5.toString());
            String valueOf3 = String.valueOf(this.g);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 31);
            sb6.append("active network state (polled): ");
            sb6.append(valueOf3);
            printWriter.println(sb6.toString());
        }
        if (this.p > 0) {
            String formatElapsedTime3 = DateUtils.formatElapsedTime((SystemClock.elapsedRealtime() - this.p) / 1000);
            String formatElapsedTime4 = DateUtils.formatElapsedTime(this.C / 1000);
            StringBuilder sb7 = new StringBuilder(String.valueOf(formatElapsedTime3).length() + 12 + String.valueOf(formatElapsedTime4).length());
            sb7.append("Connected: ");
            sb7.append(formatElapsedTime3);
            sb7.append("/");
            sb7.append(formatElapsedTime4);
            printWriter.println(sb7.toString());
        } else {
            String valueOf4 = String.valueOf(DateUtils.formatElapsedTime(this.C / 1000));
            printWriter.println(valueOf4.length() == 0 ? new String("Disconnected, connected time: ") : "Disconnected, connected time: ".concat(valueOf4));
        }
        String str5 = "OFF";
        String str6 = !g() ? str5 : "ON";
        if (this.k) {
            str5 = "ON";
        }
        if (!this.v) {
            str = str2;
        } else {
            str = " NetworkSuspended";
        }
        if (!this.l) {
            str2 = " NoNetworkStatusIcon";
        }
        StringBuilder sb8 = new StringBuilder(str6.length() + 41 + str5.length() + str.length() + str2.length());
        sb8.append("Network status: ");
        sb8.append(str6);
        sb8.append(" Previous Network status:");
        sb8.append(str5);
        sb8.append(str);
        sb8.append(str2);
        printWriter.println(sb8.toString());
    }

    public final void a(boolean z2) {
        nuv nuv;
        String str;
        int i2;
        if (!nqw.c()) {
            return;
        }
        if (axlc.i() < 0 || ((nvh) this.m).a.a() == -1) {
            this.m.a(11);
        } else if (!this.m.b() && !this.m.a()) {
            int a2 = this.c.a(z2, this.h);
            nux nux = null;
            if (a2 == 4) {
                int i3 = Build.VERSION.SDK_INT;
                Network[] allNetworks = this.b.getAllNetworks();
                int length = allNetworks.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Network network = allNetworks[i4];
                    NetworkInfo networkInfo = this.b.getNetworkInfo(network);
                    if (networkInfo != null && networkInfo.getType() == 0 && networkInfo.isAvailable()) {
                        nux = new nux(network);
                        break;
                    }
                    i4++;
                }
                if (nux == null) {
                    a2 = 3;
                }
            }
            if (a2 - 1 != 2) {
                nuv = new nuv(axlc.r(), (int) axlc.s(), a2);
            } else {
                List list = this.h == 1 ? this.n : this.o;
                if (!list.isEmpty()) {
                    String[] strArr = (String[]) list.get(this.D.nextInt(list.size()));
                    str = strArr[0];
                    i2 = Integer.parseInt(strArr[1]);
                } else {
                    str = axlc.r();
                    i2 = 443;
                }
                nuv = new nuv(str, i2, 3);
            }
            this.c.b(a2);
            this.e.b.b.a(nuy.a);
            this.m.a(nuv, nux);
        }
    }
}
