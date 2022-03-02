package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.EventLog;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.gcm.GcmChimeraService;
import com.google.android.gms.gcm.GcmSenderChimeraProxy;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: nvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvh implements nut {
    private int A;
    private int B;
    private final ntw C;
    private final nsm D;
    private final nvc E;
    private final nuj F;
    private final nsb G;
    private final nys H;
    private final long I;
    private int J;
    private String K;
    public final nvi a;
    public final nur b;
    public final Object c = new Object();
    public volatile boolean d = false;
    protected final List e = new ArrayList();
    public boolean f = false;
    protected long g;
    public final List h = new ArrayList();
    public int i;
    public int j;
    public int k;
    protected long l;
    public int m;
    public int n;
    public final Context o;
    public final nts p;
    public final HeartbeatChimeraAlarm q;
    public final nrj r;
    public final nva s;
    public final acrz t;
    public volatile njy u;
    protected int v = 0;
    private Socket w;
    private long x;
    private Thread y;
    private long z;

    public nvh(Context context, nur nur, nts nts, HeartbeatChimeraAlarm heartbeatChimeraAlarm, nva nva, nrj nrj, ntw ntw, nsm nsm, nvc nvc, nuj nuj, nsb nsb, nys nys) {
        HeartbeatChimeraAlarm heartbeatChimeraAlarm2 = heartbeatChimeraAlarm;
        nva nva2 = nva;
        nrj nrj2 = nrj;
        nvc nvc2 = nvc;
        nvi nvi = new nvi(new nuv());
        this.a = nvi;
        this.b = nur;
        this.p = nts;
        nvi.a("mtalk.google.com");
        this.a.a(-1);
        acrz acrz = new acrz(context, 1, "GCM_READ", (String) null, "com.google.android.gms");
        this.t = acrz;
        acrz.a(false);
        this.q = heartbeatChimeraAlarm2;
        heartbeatChimeraAlarm2.b = this;
        this.s = nva2;
        nva2.m = this;
        this.r = nrj2;
        nrj2.p = this;
        this.C = ntw;
        this.e.addAll(this.p.c());
        this.D = nsm;
        this.o = context;
        this.E = nvc2;
        nvc2.a((nut) this);
        this.F = nuj;
        this.G = nsb;
        this.H = nys;
        this.I = System.currentTimeMillis();
    }

    private static void a(amnp amnp, String str, long j2) {
        a(amnp, str, Long.toString(j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r4.f = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            boolean r1 = r4.d     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            nvi r1 = r4.a     // Catch:{ all -> 0x0028 }
            r2 = 1
            r1.f = r2     // Catch:{ all -> 0x0028 }
            r1 = 0
            r4.d = r1     // Catch:{ all -> 0x0028 }
            java.lang.Thread r2 = r4.y     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0022
            nvi r3 = r4.a     // Catch:{ all -> 0x0028 }
            r3.d = r2     // Catch:{ all -> 0x0028 }
            nvi r2 = r4.a     // Catch:{ all -> 0x0028 }
            java.net.Socket r3 = r4.w     // Catch:{ all -> 0x0028 }
            r2.b = r3     // Catch:{ all -> 0x0028 }
            r2 = 0
            r4.y = r2     // Catch:{ all -> 0x0028 }
            r4.w = r2     // Catch:{ all -> 0x0028 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            r4.f = r1
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvh.k():void");
    }

    private final long l() {
        long j2 = this.g;
        if (j2 <= 0 || j2 <= this.x) {
            return -1;
        }
        return System.currentTimeMillis() - this.g;
    }

    public final void a(boolean z2) {
        this.a.k = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r13.g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0.close();
        r13.b = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.nvi r13, int r14) {
        /*
            r12 = this;
            nuv r0 = r13.a
            int r0 = r0.b
            r1 = -1
            if (r0 == r1) goto L_0x0167
            boolean r0 = r12.f
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0019
            r12.v = r14
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r12.g
            long r4 = r4 - r6
            long r4 = r4 / r2
            r12.l = r4
        L_0x0019:
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            boolean r4 = r13.f     // Catch:{ all -> 0x0164 }
            if (r4 == 0) goto L_0x0162
            r4 = 0
            r13.f = r4     // Catch:{ all -> 0x0164 }
            monitor-exit(r0)     // Catch:{ all -> 0x0164 }
            r13.g = r4
            java.net.Socket r0 = r13.b     // Catch:{ IOException -> 0x0032 }
            if (r0 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            r0.close()     // Catch:{ IOException -> 0x0032 }
            r0 = 0
            r13.b = r0     // Catch:{ IOException -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            long r5 = java.lang.System.currentTimeMillis()
            r12.x = r5
            java.util.List r5 = r12.h
            monitor-enter(r5)
            java.util.List r0 = r12.h     // Catch:{ all -> 0x015f }
            r0.clear()     // Catch:{ all -> 0x015f }
            monitor-exit(r5)     // Catch:{ all -> 0x015f }
            java.lang.Thread r0 = r13.d
            if (r0 == 0) goto L_0x0063
            java.lang.Thread r0 = r13.d
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.BlockingQueue r0 = r13.o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.BlockingQueue r0 = r13.o
            amna r5 = defpackage.amna.a
            aucd r5 = r5.o()
            ammz r5 = (defpackage.ammz) r5
            r0.add(r5)
        L_0x0063:
            java.lang.Thread r0 = r13.e
            if (r0 == 0) goto L_0x0087
            java.lang.Thread r0 = r13.e
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L_0x0087
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r5 = r13.e
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0087
            java.lang.Thread r0 = r13.e
            r0.interrupt()
            java.lang.Thread r0 = r13.e     // Catch:{ InterruptedException -> 0x0086 }
            r0.join(r2)     // Catch:{ InterruptedException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r0 = move-exception
        L_0x0087:
            boolean r0 = r12.f
            if (r0 != 0) goto L_0x008c
            goto L_0x0095
        L_0x008c:
            long r5 = r12.z
            long r7 = r12.e()
            long r5 = r5 + r7
            r12.z = r5
        L_0x0095:
            boolean r0 = r12.f
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r5 = r12.q
            r5.f()
            r5.c()
            nul r6 = r5.h
            r7 = 2
            if (r6 == 0) goto L_0x00bd
            boolean r8 = r5.a((defpackage.nul) r6)
            if (r8 == 0) goto L_0x00bd
            boolean r5 = r5.j
            if (r5 == 0) goto L_0x00af
            goto L_0x00bd
        L_0x00af:
            r5 = 6
            if (r14 == r5) goto L_0x00ba
            r5 = 21
            if (r14 == r5) goto L_0x00ba
            r5 = 28
            if (r14 != r5) goto L_0x00bd
        L_0x00ba:
            r6.a(r7)
        L_0x00bd:
            ammy r5 = defpackage.ammy.k
            aucd r5 = r5.o()
            int r6 = r13.c
            boolean r8 = r5.c
            if (r8 == 0) goto L_0x00ce
            r5.c()
            r5.c = r4
        L_0x00ce:
            aucj r8 = r5.b
            ammy r8 = (defpackage.ammy) r8
            int r9 = r8.a
            r9 = r9 | 4
            r8.a = r9
            r8.d = r6
            int r6 = r12.J
            r9 = r9 | 8
            r8.a = r9
            r8.e = r6
            long r10 = r13.h
            r6 = r9 | 16
            r8.a = r6
            r8.f = r10
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r12.I
            long r8 = r8 - r10
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x00f6
            goto L_0x00fb
        L_0x00f6:
            r5.c()
            r5.c = r4
        L_0x00fb:
            aucj r4 = r5.b
            ammy r4 = (defpackage.ammy) r4
            int r6 = r4.a
            r6 = r6 | 32
            r4.a = r6
            r4.g = r8
            r6 = r6 | 64
            r4.a = r6
            r4.h = r14
            if (r0 == 0) goto L_0x0122
            r7 = 3
            r4.b = r7
            r6 = r6 | 1
            r4.a = r6
            long r7 = r12.g
            long r9 = r12.I
            r6 = r6 | 128(0x80, float:1.794E-43)
            r4.a = r6
            long r7 = r7 - r9
            r4.i = r7
            goto L_0x0128
        L_0x0122:
            r4.b = r7
            r6 = r6 | 1
            r4.a = r6
        L_0x0128:
            nuj r4 = r12.F
            r4.a((defpackage.aucd) r5)
            int r4 = r13.c
            r13.c = r1
            nvc r13 = r12.E
            r13.a()
            nva r13 = r12.s
            r13.a((int) r14, (boolean) r0)
            long r0 = r12.e()
            r5 = 0
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x014d
            nsb r13 = r12.G
            long r0 = r0 / r2
            int r1 = (int) r0
            defpackage.nuo.a(r13, r14, r4, r1)
            goto L_0x0152
        L_0x014d:
            nsb r13 = r12.G
            defpackage.nuo.a(r13, r14, r4)
        L_0x0152:
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "com.google.android.gcm.DISCONNECTED"
            r13.<init>(r14)
            android.content.Context r14 = r12.o
            r14.sendBroadcast(r13)
            return
        L_0x015f:
            r13 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x015f }
            throw r13
        L_0x0162:
            monitor-exit(r0)     // Catch:{ all -> 0x0164 }
            return
        L_0x0164:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0164 }
            throw r13
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvh.b(nvi, int):void");
    }

    public final String c() {
        WifiInfo connectionInfo;
        StringBuilder sb = new StringBuilder();
        sb.append("Server: ");
        nvi nvi = this.a;
        if (!nvi.g || nvi.b == null) {
            if (nvi.f) {
                sb.append("Connecting");
            } else {
                sb.append("Not connected");
            }
            sb.append("\nHost: ");
            sb.append(this.a.a.a);
            sb.append("\nPort: ");
            sb.append(this.a.a.b);
            long j2 = this.g;
            if (j2 > 0) {
                long j3 = this.l;
                sb.append("\nTime disconnected: ");
                sb.append(DateUtils.formatElapsedTime((System.currentTimeMillis() - (j2 + (j3 * 1000))) / 1000));
            } else {
                sb.append("\nNo previous connection");
            }
            if (this.v != 0) {
                sb.append("\nLast close code: ");
                int i2 = this.v;
                String a2 = auic.a(i2);
                if (i2 != 0) {
                    sb.append(a2);
                } else {
                    throw null;
                }
            }
        } else {
            sb.append("Connected\nHost: ");
            sb.append(this.a.b.getInetAddress());
            sb.append("\nPort: ");
            sb.append(this.a.b.getPort());
            sb.append("\nTime connected: ");
            sb.append(DateUtils.formatElapsedTime(l() / 1000));
            if (this.a.c == 1 && (connectionInfo = ((WifiManager) this.o.getApplicationContext().getSystemService("wifi")).getConnectionInfo()) != null) {
                sb.append("\nSignalLevel: ");
                sb.append(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 5));
                sb.append(" / 4");
            }
        }
        return sb.toString();
    }

    public final boolean d() {
        return this.a.g || this.f;
    }

    public final long e() {
        if (!this.f) {
            return -1;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1;
        }
        long j3 = this.x;
        if (j2 <= j3) {
            return j3 - j2;
        }
        return -1;
    }

    public final InetAddress f() {
        Socket socket = this.a.b;
        if (socket != null) {
            return socket.getInetAddress();
        }
        return null;
    }

    public final boolean g() {
        return this.a.k;
    }

    public final boolean h() {
        return this.a.l;
    }

    public final /* bridge */ /* synthetic */ nvi i() {
        return this.a;
    }

    public final void j() {
        this.t.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        nvi nvi = this.a;
        if (nvi.g && nvi.b != null) {
            sb.append("connected=");
            sb.append(this.a.b.getInetAddress());
            sb.append(",port=");
            sb.append(this.a.b.getPort());
        } else if (nvi.f) {
            sb.append("connecting=");
            sb.append(this.a.a.a);
            sb.append(":");
            sb.append(this.a.a.b);
        } else {
            sb.append("pending=");
            sb.append(new Date(this.x));
            sb.append(",host=");
            sb.append(this.a.a.a);
            sb.append(":");
            sb.append(this.a.a.b);
        }
        sb.append("\nstreamId=");
        sb.append(this.a.q);
        sb.append("/");
        sb.append(this.a.r);
        int i2 = this.i;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(",connects=");
        sb2.append(i2);
        sb.append(sb2.toString());
        int i3 = this.j;
        StringBuilder sb3 = new StringBuilder(28);
        sb3.append(",connectAttempts=");
        sb3.append(i3);
        sb.append(sb3.toString());
        int i4 = this.k;
        StringBuilder sb4 = new StringBuilder(25);
        sb4.append(",failedLogins=");
        sb4.append(i4);
        sb.append(sb4.toString());
        long j2 = this.l;
        StringBuilder sb5 = new StringBuilder(45);
        sb5.append(",lastConnectionDurationS=");
        sb5.append(j2);
        sb.append(sb5.toString());
        int i5 = this.v;
        if (i5 != 0) {
            String a2 = auic.a(i5);
            sb.append(a2.length() == 0 ? new String(",lastConnectionErrorCode=") : ",lastConnectionErrorCode=".concat(a2));
        }
        int i6 = this.m;
        int i7 = this.A;
        StringBuilder sb6 = new StringBuilder(32);
        sb6.append(",packets=");
        sb6.append(i6);
        sb6.append("/");
        sb6.append(i7);
        sb.append(sb6.toString());
        int i8 = this.n;
        int i9 = this.B;
        StringBuilder sb7 = new StringBuilder(30);
        sb7.append(",bytes=");
        sb7.append(i8);
        sb7.append("/");
        sb7.append(i9);
        sb.append(sb7.toString());
        nvi nvi2 = this.a;
        if (!nvi2.g || nvi2.b == null) {
            String formatElapsedTime = DateUtils.formatElapsedTime((System.currentTimeMillis() - this.x) / 1000);
            String formatElapsedTime2 = DateUtils.formatElapsedTime(this.z / 1000);
            StringBuilder sb8 = new StringBuilder(String.valueOf(formatElapsedTime).length() + 17 + String.valueOf(formatElapsedTime2).length());
            sb8.append("\ndisconnectTime=");
            sb8.append(formatElapsedTime);
            sb8.append("/");
            sb8.append(formatElapsedTime2);
            sb.append(sb8.toString());
            String valueOf = String.valueOf(new Date(this.x));
            StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb9.append("\nlostConnection=");
            sb9.append(valueOf);
            sb.append(sb9.toString());
        } else {
            String formatElapsedTime3 = DateUtils.formatElapsedTime(l() / 1000);
            String formatElapsedTime4 = DateUtils.formatElapsedTime(this.z / 1000);
            StringBuilder sb10 = new StringBuilder(String.valueOf(formatElapsedTime3).length() + 14 + String.valueOf(formatElapsedTime4).length());
            sb10.append("\nconnectTime=");
            sb10.append(formatElapsedTime3);
            sb10.append("/");
            sb10.append(formatElapsedTime4);
            sb.append(sb10.toString());
        }
        return sb.toString();
    }

    private static void a(amnp amnp, String str, String str2) {
        aucd o2 = amnv.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        amnv amnv = (amnv) o2.b;
        str.getClass();
        int i2 = amnv.a | 1;
        amnv.a = i2;
        amnv.b = str;
        str2.getClass();
        amnv.a = i2 | 2;
        amnv.c = str2;
        if (amnp.c) {
            amnp.c();
            amnp.c = false;
        }
        amns amns = (amns) amnp.b;
        amnv amnv2 = (amnv) o2.i();
        amns amns2 = amns.z;
        amnv2.getClass();
        if (!amns.h.a()) {
            amns.h = aucj.a(amns.h);
        }
        amns.h.add(amnv2);
    }

    protected static final void a(nvi nvi) {
        amnl amnl = (amnl) amnn.g.o();
        if (amnl.c) {
            amnl.c();
            amnl.c = false;
        }
        amnn amnn = (amnn) amnl.b;
        amnn.b = 1;
        int i2 = amnn.a | 2;
        amnn.a = i2;
        "".getClass();
        amnn.a = i2 | 4;
        amnn.c = "";
        aucd o2 = amne.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        amne amne = (amne) o2.b;
        int i3 = 1 | amne.a;
        amne.a = i3;
        amne.b = 13;
        "".getClass();
        amne.a = i3 | 2;
        amne.c = "";
        if (amnl.c) {
            amnl.c();
            amnl.c = false;
        }
        amnn amnn2 = (amnn) amnl.b;
        amne amne2 = (amne) o2.i();
        amne2.getClass();
        amnn2.d = amne2;
        amnn2.a |= 64;
        a(nvi, (audw) amnl);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = r0.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.nvi r1, int r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0025
            boolean r3 = r0.d
            if (r3 == 0) goto L_0x0025
            java.lang.Object r3 = r0.c
            monitor-enter(r3)
            boolean r1 = r0.d     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0020
            r1 = 0
            r0.d = r1     // Catch:{ all -> 0x0022 }
            r1 = 0
            r0.y = r1     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            java.net.Socket r2 = r0.w
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r2 = move-exception
        L_0x001d:
            r0.w = r1
        L_0x001f:
            return
        L_0x0020:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r1
        L_0x0025:
            r0.b(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvh.a(nvi, int, boolean):void");
    }

    private final synchronized void a(nvi nvi, aubk aubk, audw audw) {
        boolean z2 = audw instanceof amnb;
        ArrayList arrayList = null;
        String str = z2 ? ((amnc) ((amnb) audw).b).h : null;
        nvi.r++;
        if (!amrk.a(str)) {
            nus nus = new nus(nvi.r, str);
            synchronized (nvi.m) {
                nvi.m.add(nus);
            }
        }
        synchronized (this.e) {
            if (this.e.size() > 0) {
                arrayList = new ArrayList(this.e);
                this.e.clear();
            }
        }
        synchronized (nvi.n) {
            if (arrayList != null) {
                nvi.n.put(Integer.valueOf(nvi.r), arrayList);
            }
        }
        synchronized (nvi.m) {
            int i2 = nvi.q;
            if (i2 > nvi.p) {
                if (audw instanceof amnl) {
                    amnl amnl = (amnl) audw;
                    if (amnl.c) {
                        amnl.c();
                        amnl.c = false;
                    }
                    amnn amnn = (amnn) amnl.b;
                    amnn amnn2 = amnn.g;
                    amnn.a |= 512;
                    amnn.e = i2;
                } else if (audw instanceof amni) {
                    amni amni = (amni) audw;
                    if (amni.c) {
                        amni.c();
                        amni.c = false;
                    }
                    amnj amnj = (amnj) amni.b;
                    amnj amnj2 = amnj.e;
                    amnj.a |= 2;
                    amnj.b = i2;
                } else if (audw instanceof amnf) {
                    amnf amnf = (amnf) audw;
                    if (amnf.c) {
                        amnf.c();
                        amnf.c = false;
                    }
                    amng amng = (amng) amnf.b;
                    amng amng2 = amng.e;
                    amng.a |= 2;
                    amng.b = i2;
                } else if (z2) {
                    amnb amnb = (amnb) audw;
                    if (amnb.c) {
                        amnb.c();
                        amnb.c = false;
                    }
                    amnc amnc = (amnc) amnb.b;
                    amnc amnc2 = amnc.r;
                    amnc.a |= 512;
                    amnc.i = i2;
                }
                nvi.p = nvi.q;
            }
        }
        long j2 = !ntu.a(this.o) ? 0 : 8;
        if (audw instanceof amnl) {
            amnl amnl2 = (amnl) audw;
            if (amnl2.c) {
                amnl2.c();
                amnl2.c = false;
            }
            amnn amnn3 = (amnn) amnl2.b;
            amnn amnn4 = amnn.g;
            amnn3.a |= 2048;
            amnn3.f = j2;
        } else if (audw instanceof amnp) {
            amnp amnp = (amnp) audw;
            if (amnp.c) {
                amnp.c();
                amnp.c = false;
            }
            amns amns = (amns) amnp.b;
            amns amns2 = amns.z;
            amns.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            amns.o = j2;
        } else if (audw instanceof amni) {
            amni amni2 = (amni) audw;
            if (amni2.c) {
                amni2.c();
                amni2.c = false;
            }
            amnj amnj3 = (amnj) amni2.b;
            amnj amnj4 = amnj.e;
            amnj3.a |= 4;
            amnj3.c = j2;
        } else if (audw instanceof amnf) {
            amnf amnf2 = (amnf) audw;
            if (amnf2.c) {
                amnf2.c();
                amnf2.c = false;
            }
            amng amng3 = (amng) amnf2.b;
            amng amng4 = amng.e;
            amng3.a |= 4;
            amng3.c = j2;
        } else if (z2) {
            amnb amnb2 = (amnb) audw;
            if (amnb2.c) {
                amnb2.c();
                amnb2.c = false;
            }
            amnc amnc3 = (amnc) amnb2.b;
            amnc amnc4 = amnc.r;
            amnc3.a |= 262144;
            amnc3.n = j2;
        }
        if (z2) {
            amnb amnb3 = (amnb) audw;
            if ((((amnc) amnb3.b).a & 4) == 0) {
                if (amnb3.c) {
                    amnb3.c();
                    amnb3.c = false;
                }
                amnc amnc5 = (amnc) amnb3.b;
                amnc amnc6 = amnc.r;
                "".getClass();
                amnc5.a |= 4;
                amnc5.c = "";
            }
            if ((((amnc) amnb3.b).a & 16) == 0) {
                if (amnb3.c) {
                    amnb3.c();
                    amnb3.c = false;
                }
                amnc amnc7 = (amnc) amnb3.b;
                amnc amnc8 = amnc.r;
                "".getClass();
                amnc7.a |= 16;
                amnc7.e = "";
            }
        }
        audx i3 = audw.i();
        byte a2 = nuu.a(i3);
        int p2 = i3.p();
        aubk.b(a2);
        aubk.d(p2);
        i3.a(aubk);
        aubk.c();
        this.B += p2;
        this.A++;
        nuo.a(audw);
        if (z2) {
            GcmSenderChimeraProxy.a();
        }
        if (!aekv.a(this.o) && !this.s.e()) {
            Context context = this.o;
            if (qxt.a()) {
                qxt.a(context, nxn.CLOUD_MESSAGE_SENT);
            } else {
                aaaz.b();
            }
        }
        HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.q;
        heartbeatChimeraAlarm.l = SystemClock.elapsedRealtime();
        if (axlf.a.a().i() && heartbeatChimeraAlarm.b.h() && !heartbeatChimeraAlarm.b.g()) {
            heartbeatChimeraAlarm.e.a(heartbeatChimeraAlarm.a());
        }
        nuo.a(true, nuu.a(i3), i3, nvi.q, nvi.r);
    }

    public final void b(nvi nvi, boolean z2, nux nux) {
        Thread thread = new Thread(new nvf(this, nvi, z2, nux), "GCMWriter");
        if (z2) {
            this.y = thread;
        } else {
            nvi.d = thread;
        }
        thread.start();
    }

    public final boolean b() {
        return this.a.f && this.a.g;
    }

    public static final void a(nvi nvi, audw audw) {
        synchronized (nvi.o) {
            nvi.o.add(audw);
        }
    }

    public final void a(int i2) {
        new Thread(new nvg(this, i2)).start();
    }

    /* access modifiers changed from: protected */
    public final void a(amnt amnt) {
        String str;
        amnt amnt2 = amnt;
        amnd amnd = amnt2.a;
        if (amnd == null) {
            amnd = amnd.c;
        }
        int i2 = amnd.a;
        if (i2 != 0) {
            GcmChimeraService.a("Login error %d %s", Integer.valueOf(i2), amnd.b);
            this.s.a(4, false);
            return;
        }
        this.F.a();
        HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.q;
        amnh amnh = amnt2.d;
        if (amnh == null) {
            amnh = amnh.b;
        }
        heartbeatChimeraAlarm.g = Math.max(0, amnh.a);
        synchronized (heartbeatChimeraAlarm) {
            heartbeatChimeraAlarm.f = 0;
            heartbeatChimeraAlarm.d();
        }
        int i3 = (int) (heartbeatChimeraAlarm.e.c / 1000);
        int h2 = heartbeatChimeraAlarm.c.h();
        nvh nvh = (nvh) heartbeatChimeraAlarm.b;
        InetAddress f2 = nvh.f();
        if (f2 != null) {
            String hostAddress = f2.getHostAddress();
            if (f2 instanceof Inet6Address) {
                int i4 = nvh.a.a.b;
                StringBuilder sb = new StringBuilder(String.valueOf(hostAddress).length() + 14);
                sb.append('[');
                sb.append(hostAddress);
                sb.append("]:");
                sb.append(i4);
                str = sb.toString();
            } else {
                int i5 = nvh.a.a.b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(hostAddress).length() + 12);
                sb2.append(hostAddress);
                sb2.append(':');
                sb2.append(i5);
                str = sb2.toString();
            }
        } else {
            str = null;
        }
        EventLog.writeEvent(204004, new Object[]{Integer.valueOf((h2 << 16) + i3), str});
        nva nva = this.s;
        nva.d();
        nva.i();
        nva.c(true);
        if (nva.e.b()) {
            NetworkInfo networkInfo = nva.b.getNetworkInfo(nva.h());
            nuy nuy = nva.e;
            nuy.a(false);
            nuy.b(networkInfo);
        }
        aucx aucx = amnt2.b;
        int size = aucx.size();
        for (int i6 = 0; i6 < size; i6++) {
            amnv amnv = (amnv) aucx.get(i6);
            String str2 = amnv.b;
            String str3 = amnv.c;
            if ("appid".equals(str2)) {
                nsm nsm = this.D;
                String[] split = str3.split(":");
                if (split.length < 2) {
                    Log.w("GCM", "Invalid appId");
                } else {
                    String str4 = split[0];
                    String str5 = split[1];
                    if (!str4.equals(nsm.b) || !str5.equals(nsm.c)) {
                        Log.i("GCM", "Got new GCM ID/token");
                        SharedPreferences.Editor edit = nsm.a.getSharedPreferences("GcmId", 0).edit();
                        edit.putString("gcmappid", str3);
                        edit.commit();
                        nsm.b = split[0];
                        nsm.c = split[1];
                        Context context = nsm.a;
                        StringBuilder sb3 = new StringBuilder(28);
                        sb3.append("Sending IID SYNC to all apps");
                        Log.w("GCM", sb3.toString());
                        Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
                        intent.putExtra("from", "google.com/iid");
                        intent.putExtra("CMD", "SYNC");
                        List<Object> b2 = nqw.b();
                        int i7 = Build.VERSION.SDK_INT;
                        if (b2.isEmpty()) {
                            for (Intent sendOrderedBroadcast : ntf.a(intent, context.getPackageManager().queryBroadcastReceivers(intent, 0))) {
                                context.sendOrderedBroadcast(sendOrderedBroadcast, (String) null);
                            }
                        } else {
                            for (Object a2 : b2) {
                                int a3 = nqw.a(a2);
                                for (Intent a4 : ntf.a(intent, nqw.a(intent, a3, 0))) {
                                    nqw.a(context, a3, a4, (String) null, (BroadcastReceiver) null, (Handler) null);
                                    a3 = a3;
                                }
                            }
                        }
                    }
                }
            } else if ("cookie".equals(str2)) {
                this.K = str3;
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        nuo.a(this.G, this.a.c);
        this.o.sendBroadcast(new Intent("com.google.android.gcm.CONNECTED"));
        nrj nrj = this.r;
        nrj.g.a(nrj.f);
    }

    public final void a(Context context) {
        this.u = new njy(context, (Class) getClass(), 16, "GcmClient");
    }

    public final void a(audw audw) {
        a(this.a, audw);
        acws.a((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        a(r3.a, r4);
        b(r3.a, false, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nuv r4, defpackage.nux r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            nvi r1 = r3.a     // Catch:{ all -> 0x002c }
            boolean r1 = r1.f     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            boolean r1 = r3.d     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0025
            nvi r1 = r3.a     // Catch:{ all -> 0x002c }
            r2 = 1
            r1.f = r2     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x0018
            nvi r1 = r3.a     // Catch:{ all -> 0x002c }
            r1.a = r4     // Catch:{ all -> 0x002c }
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            nvi r0 = r3.a
            r3.a((defpackage.nvi) r0, (defpackage.nuv) r4)
            nvi r4 = r3.a
            r0 = 0
            r3.b(r4, r0, r5)
            return
        L_0x0025:
            r3.k()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvh.a(nuv, nux):void");
    }

    public final void a(nvi nvi, int i2) {
        if (i2 != -1) {
            ArrayList arrayList = new ArrayList();
            synchronized (nvi.m) {
                Iterator it = nvi.m.iterator();
                while (it.hasNext()) {
                    nus nus = (nus) it.next();
                    if (i2 < nus.a) {
                        break;
                    }
                    if (!amrk.a(nus.b)) {
                        arrayList.add(nus.b);
                    }
                    it.remove();
                }
            }
            a(nvi, (List) arrayList);
            ArrayList arrayList2 = new ArrayList();
            synchronized (nvi.n) {
                Iterator it2 = nvi.n.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (((Integer) entry.getKey()).intValue() > i2) {
                        break;
                    }
                    arrayList2.addAll((Collection) entry.getValue());
                    it2.remove();
                }
            }
            if (!arrayList2.isEmpty()) {
                this.p.a("s2dRmqIds", (List) arrayList2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nvi nvi, List list) {
        this.p.a((ntr) new nvd(this, list));
        int a2 = this.p.a(list);
        int I2 = (int) axlc.a.a().I();
        if (I2 > 0 && a2 >= I2) {
            a(nvi);
        }
        this.s.c(true);
    }

    public final void a(nvi nvi, nuv nuv) {
        nvi.h = System.currentTimeMillis() - this.I;
        if (nuv == null) {
            nvi.c = this.s.h();
            nuv nuv2 = nvi.a;
            this.J = nuv2.b;
            nuv2.c = this.s.c.b();
            return;
        }
        this.J = nuv.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06de, code lost:
        a(r2, 10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06e3, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x06dd A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:5:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nvi r21, boolean r22, defpackage.nux r23) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "gms-20.12.16-000"
            r6 = 0
            if (r3 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r1.f = r6
        L_0x0010:
            int r7 = r1.j
            r8 = 1
            int r7 = r7 + r8
            r1.j = r7
            if (r4 != 0) goto L_0x0021
            nva r11 = r1.s     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            int r11 = r11.h()     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r2.c = r11     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            goto L_0x0023
        L_0x0021:
            r2.c = r6     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x0023:
            nur r11 = r1.b     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            nuv r12 = r2.a     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.lang.String r13 = r12.a     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            int r12 = r12.b     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.net.InetAddress[] r14 = java.net.InetAddress.getAllByName(r13)     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            int r15 = r14.length     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r15 == 0) goto L_0x06d5
            r15 = r14[r6]     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x003f, Exception -> 0x06dd }
            r9.<init>(r15, r12)     // Catch:{ IOException -> 0x003f, Exception -> 0x06dd }
            nuq r4 = r11.a(r9, r13, r4)     // Catch:{ IOException -> 0x003f, Exception -> 0x06dd }
            goto L_0x0072
        L_0x003f:
            r0 = move-exception
            r9 = r0
            boolean r10 = r15 instanceof java.net.Inet4Address     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x0043:
            int r6 = r14.length     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r8 >= r6) goto L_0x06d4
            r6 = r14[r8]     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r10 != 0) goto L_0x0056
            boolean r7 = r6 instanceof java.net.Inet4Address     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r7 == 0) goto L_0x004f
        L_0x004e:
            goto L_0x005b
        L_0x004f:
            r6 = 0
            r16 = 1
            r17 = 2
            goto L_0x06d0
        L_0x0056:
            boolean r7 = r6 instanceof java.net.Inet6Address     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r7 == 0) goto L_0x06cb
            goto L_0x004e
        L_0x005b:
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r7 = 0
            r8[r7] = r15     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r7 = 1
            r8[r7] = r6     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.lang.String r7 = "Failed to connect to %s, trying %s"
            com.google.android.gms.gcm.GcmChimeraService.a(r7, r8)     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.net.InetSocketAddress r7 = new java.net.InetSocketAddress     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r7.<init>(r6, r12)     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            nuq r4 = r11.a(r7, r13, r4)     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x0072:
            boolean r6 = r4.b     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r2.l = r6     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            if (r3 == 0) goto L_0x007d
            javax.net.ssl.SSLSocket r4 = r4.a     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r1.w = r4     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            goto L_0x0081
        L_0x007d:
            javax.net.ssl.SSLSocket r4 = r4.a     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            r2.b = r4     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x0081:
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L_0x00b0
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            nvi r4 = r1.a
            java.lang.Thread r4 = r4.d
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ad
            nvi r3 = r1.a
            r4 = 27
            r1.b(r3, r4)
            nvi r3 = r1.a
            java.lang.Thread r3 = r3.d
            boolean r3 = r3.isAlive()
            if (r3 == 0) goto L_0x00ad
            nvi r3 = r1.a     // Catch:{ InterruptedException -> 0x00ac }
            java.lang.Thread r3 = r3.d     // Catch:{ InterruptedException -> 0x00ac }
            r3.join(r6)     // Catch:{ InterruptedException -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            r20.k()
        L_0x00b0:
            java.util.concurrent.BlockingQueue r3 = r2.o
            r3.clear()
            java.net.Socket r4 = r2.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aubk r4 = defpackage.aubk.a((java.io.OutputStream) r4)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.net.Socket r8 = r2.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.io.InputStream r8 = r8.getInputStream()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aubc r8 = defpackage.aubc.a((java.io.InputStream) r8)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r9 = 39
            r4.g((int) r9)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r9 = 0
            r2.p = r9     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 1
            r2.q = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r2.r = r9     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.ArrayList r9 = r2.m     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.ArrayList r10 = r2.m     // Catch:{ all -> 0x06b4 }
            r10.clear()     // Catch:{ all -> 0x06b4 }
            monitor-exit(r9)     // Catch:{ all -> 0x06b4 }
            java.util.Map r9 = r2.n     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            monitor-enter(r9)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.Map r10 = r2.n     // Catch:{ all -> 0x06b0 }
            java.util.Collection r10 = r10.values()     // Catch:{ all -> 0x06b0 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x06b0 }
        L_0x00ec:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x06b0 }
            if (r11 == 0) goto L_0x00fe
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x06b0 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x06b0 }
            java.util.List r12 = r1.e     // Catch:{ all -> 0x06b0 }
            r12.addAll(r11)     // Catch:{ all -> 0x06b0 }
            goto L_0x00ec
        L_0x00fe:
            java.util.Map r10 = r2.n     // Catch:{ all -> 0x06b0 }
            r10.clear()     // Catch:{ all -> 0x06b0 }
            monitor-exit(r9)     // Catch:{ all -> 0x06b0 }
            amns r9 = defpackage.amns.z     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucd r9 = r9.o()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amnp r9 = (defpackage.amnp) r9     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = ""
            boolean r11 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r11 != 0) goto L_0x0113
            goto L_0x0119
        L_0x0113:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 0
            r9.c = r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0119:
            aucj r11 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r11 = (defpackage.amns) r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r12 = r11.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 1
            r12 = r12 | r13
            r11.a = r12     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11.b = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = "mcs.android.com"
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 2
            r12 = r12 | r13
            r11.a = r12     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            android.content.Context r10 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r10 = defpackage.aekv.a(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 0
            r12 = 4
            if (r10 != 0) goto L_0x0203
            nsm r10 = r1.D     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = r10.b()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            nsm r13 = r1.D     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r13 = r13.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 == 0) goto L_0x01c3
            boolean r14 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r14 != 0) goto L_0x0150
            goto L_0x0156
        L_0x0150:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14 = 0
            r9.c = r14     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0156:
            aucj r14 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r14 = (defpackage.amns) r14     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r15 = r14.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r15 = r15 | 8
            r14.a = r15     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14.e = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r14 = "android-"
            long r18 = java.lang.Long.parseLong(r10)     // Catch:{ Exception -> 0x019e }
            java.lang.String r15 = java.lang.Long.toHexString(r18)     // Catch:{ Exception -> 0x019e }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x019e }
            int r18 = r15.length()     // Catch:{ Exception -> 0x019e }
            if (r18 != 0) goto L_0x017f
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x019e }
            r15.<init>(r14)     // Catch:{ Exception -> 0x019e }
            goto L_0x0183
        L_0x017f:
            java.lang.String r15 = r14.concat(r15)     // Catch:{ Exception -> 0x019e }
        L_0x0183:
            boolean r14 = r9.c     // Catch:{ Exception -> 0x019e }
            if (r14 != 0) goto L_0x0188
            goto L_0x018e
        L_0x0188:
            r9.c()     // Catch:{ Exception -> 0x019e }
            r14 = 0
            r9.c = r14     // Catch:{ Exception -> 0x019e }
        L_0x018e:
            aucj r14 = r9.b     // Catch:{ Exception -> 0x019e }
            amns r14 = (defpackage.amns) r14     // Catch:{ Exception -> 0x019e }
            r15.getClass()     // Catch:{ Exception -> 0x019e }
            int r3 = r14.a     // Catch:{ Exception -> 0x019e }
            r3 = r3 | 32
            r14.a = r3     // Catch:{ Exception -> 0x019e }
            r14.g = r15     // Catch:{ Exception -> 0x019e }
            goto L_0x019f
        L_0x019e:
            r0 = move-exception
        L_0x019f:
            boolean r3 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x01a4
            goto L_0x01aa
        L_0x01a4:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = 0
            r9.c = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x01aa:
            aucj r3 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r3 = (defpackage.amns) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r14 = r3.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14 = r14 | r12
            r3.a = r14     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.d = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 16
            r14 = r14 | r10
            r3.a = r14     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.f = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            goto L_0x01f5
        L_0x01c3:
            java.lang.String r3 = ""
            boolean r10 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
            r9.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x01d0:
            aucj r10 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r10 = (defpackage.amns) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r13 = r10.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = r13 | r12
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.d = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = ""
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = r13 | 32
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.g = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = ""
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14 = 16
            r13 = r13 | r14
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.f = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x01f5:
            aucj r3 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r3 = (defpackage.amns) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 2
            r3.m = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r3.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | 2048(0x800, float:2.87E-42)
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            goto L_0x026c
        L_0x0203:
            boolean r3 = defpackage.axkn.e()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            defpackage.iva.a((boolean) r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = ""
            boolean r10 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x0211
            goto L_0x0217
        L_0x0211:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
            r9.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0217:
            aucj r10 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r10 = (defpackage.amns) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r13 = r10.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = r13 | 8
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.e = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = ""
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = r13 | r12
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.d = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            android.content.Context r3 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r10 = defpackage.aekv.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 == 0) goto L_0x0249
            boolean r10 = defpackage.axkn.e()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 == 0) goto L_0x0249
            android.content.SharedPreferences r3 = defpackage.nvu.c(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = "gcm_local_directboot_token"
            java.lang.String r3 = r3.getString(r10, r11)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            goto L_0x024a
        L_0x0249:
            r3 = r11
        L_0x024a:
            boolean r10 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x024f
            goto L_0x0255
        L_0x024f:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
            r9.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0255:
            aucj r10 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r10 = (defpackage.amns) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r13 = r10.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14 = 16
            r13 = r13 | r14
            r10.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.f = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = 3
            r10.m = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = r13 | 2048(0x800, float:2.87E-42)
            r10.a = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x026c:
            aucj r3 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r3 = (defpackage.amns) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r3.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 1
            r3.l = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | 512(0x200, float:7.175E-43)
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 1
            r3.k = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r1.v     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 == 0) goto L_0x028b
            java.lang.String r10 = "ERR"
            long r13 = (long) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r10, (long) r13)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x028b:
            long r13 = r1.l     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r18 = 0
            int r3 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x0298
            java.lang.String r3 = "CT"
            a((defpackage.amnp) r9, (java.lang.String) r3, (long) r13)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0298:
            int r3 = r1.k     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 > 0) goto L_0x029d
            goto L_0x02a3
        L_0x029d:
            java.lang.String r10 = "CONERR"
            long r13 = (long) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r10, (long) r13)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x02a3:
            java.lang.String r3 = "CONOK"
            int r10 = r1.i     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r13 = (long) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r3, (long) r13)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.List r3 = r1.e     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x02b1:
            boolean r10 = r3.hasNext()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x067c
            nts r3 = r1.p     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x02c1
            goto L_0x02c7
        L_0x02c1:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = 0
            r9.c = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x02c7:
            aucj r3 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r3 = (defpackage.amns) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r3.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 1
            r10 = r10 | r13
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.b = r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r5 = r2.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.n = r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            android.content.Context r3 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = defpackage.aekv.b(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x02e7
            goto L_0x0307
        L_0x02e7:
            android.content.Context r3 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = defpackage.nsm.a((android.content.Context) r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r5 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r5 != 0) goto L_0x02f2
            goto L_0x02f8
        L_0x02f2:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5 = 0
            r9.c = r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x02f8:
            aucj r5 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r5 = (defpackage.amns) r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r5.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r5.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.p = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0307:
            nuv r3 = r2.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r3.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = defpackage.nup.a(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r5 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r5 != 0) goto L_0x0314
            goto L_0x031a
        L_0x0314:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5 = 0
            r9.c = r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x031a:
            aucj r5 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r5 = (defpackage.amns) r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r5.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r13
            r5.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.s = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x032a
            goto L_0x0339
        L_0x032a:
            nuv r3 = r2.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r3.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r13 = r3 + -1
            if (r3 == 0) goto L_0x067a
            r5.v = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r10
            r5.a = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0339:
            axlc r3 = defpackage.axlc.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            axld r3 = r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = r3.ag()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x0346
            goto L_0x036c
        L_0x0346:
            java.util.Random r3 = new java.util.Random     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.<init>()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r3.nextInt()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r5 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r5 != 0) goto L_0x0354
            goto L_0x035a
        L_0x0354:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5 = 0
            r9.c = r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x035a:
            aucj r5 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r5 = (defpackage.amns) r5     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r5.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r11
            r5.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.u = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            nvc r5 = r1.E     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.a((int) r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x036c:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 19
            r5.<init>(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = "android-"
            r5.append(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5.append(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = "os_ver"
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r3, (java.lang.String) r5)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r2.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r5 = -1
            if (r3 != 0) goto L_0x040b
            android.content.Context r3 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = "phone"
            java.lang.Object r3 = r3.getSystemService(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r3.getNetworkType()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            switch(r3) {
                case 1: goto L_0x03a2;
                case 2: goto L_0x03a2;
                case 3: goto L_0x03a0;
                case 4: goto L_0x03a2;
                case 5: goto L_0x03a0;
                case 6: goto L_0x03a0;
                case 7: goto L_0x03a2;
                case 8: goto L_0x03a0;
                case 9: goto L_0x03a0;
                case 10: goto L_0x03a0;
                case 11: goto L_0x03a2;
                case 12: goto L_0x03a0;
                case 13: goto L_0x039e;
                case 14: goto L_0x03a0;
                case 15: goto L_0x03a0;
                case 16: goto L_0x03a2;
                case 17: goto L_0x03a0;
                case 18: goto L_0x039e;
                default: goto L_0x039c;
            }     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x039c:
            r3 = 1
            goto L_0x03a3
        L_0x039e:
            r3 = 4
            goto L_0x03a3
        L_0x03a0:
            r3 = 3
            goto L_0x03a3
        L_0x03a2:
            r3 = 2
        L_0x03a3:
            r10 = 1
            if (r3 != r10) goto L_0x03a7
            goto L_0x03c0
        L_0x03a7:
            boolean r10 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x03ac
            goto L_0x03b2
        L_0x03ac:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
            r9.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x03b2:
            aucj r10 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r10 = (defpackage.amns) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r3 + r5
            r10.x = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = r10.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r11
            r10.a = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x03c0:
            axll r3 = defpackage.axll.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            axlm r3 = r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 == 0) goto L_0x040b
            android.content.Context r3 = r1.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = "phone"
            java.lang.Object r3 = r3.getSystemService(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r3 = r3.getNetworkOperator()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 == 0) goto L_0x040b
            int r10 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x03f9 }
            boolean r11 = r9.c     // Catch:{ NumberFormatException -> 0x03f9 }
            if (r11 != 0) goto L_0x03e5
            goto L_0x03eb
        L_0x03e5:
            r9.c()     // Catch:{ NumberFormatException -> 0x03f9 }
            r11 = 0
            r9.c = r11     // Catch:{ NumberFormatException -> 0x03f9 }
        L_0x03eb:
            aucj r11 = r9.b     // Catch:{ NumberFormatException -> 0x03f9 }
            amns r11 = (defpackage.amns) r11     // Catch:{ NumberFormatException -> 0x03f9 }
            int r13 = r11.a     // Catch:{ NumberFormatException -> 0x03f9 }
            r14 = 2097152(0x200000, float:2.938736E-39)
            r13 = r13 | r14
            r11.a = r13     // Catch:{ NumberFormatException -> 0x03f9 }
            r11.w = r10     // Catch:{ NumberFormatException -> 0x03f9 }
            goto L_0x040b
        L_0x03f9:
            r0 = move-exception
            java.lang.String r10 = "Unable to parse MCC-MNC code: "
            int r11 = r3.length()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r11 != 0) goto L_0x0408
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            goto L_0x040b
        L_0x0408:
            r10.concat(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x040b:
            boolean r3 = defpackage.axlc.f()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 == 0) goto L_0x043b
            nys r3 = r1.H     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.List r3 = r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r10 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 != 0) goto L_0x041c
            goto L_0x0422
        L_0x041c:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
            r9.c = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0422:
            aucj r10 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r10 = (defpackage.amns) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucx r11 = r10.y     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r11 = r11.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r11 != 0) goto L_0x0436
            aucx r11 = r10.y     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.y = r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0436:
            aucx r10 = r10.y     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x043b:
            ntw r3 = r1.C     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 == 0) goto L_0x0460
            ou r3 = new ou     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.<init>()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            ntw r10 = r1.C     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.a(r3, r5)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 0
        L_0x044a:
            int r11 = r3.h     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r10 >= r11) goto L_0x0460
            java.lang.Object r11 = r3.b((int) r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.Object r13 = r3.c(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r11, (java.lang.String) r13)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r10 + 1
            goto L_0x044a
        L_0x0460:
            nva r3 = r1.s     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r10 = r3.q     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x0477
            java.lang.String r3 = "networkOn"
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            nva r13 = r1.s     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r13 = r13.q     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r10 = r10 - r13
            long r10 = r10 / r6
            a((defpackage.amnp) r9, (java.lang.String) r3, (long) r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0477:
            nva r3 = r1.s     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r10 = r3.r     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x048e
            java.lang.String r3 = "networkOff"
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            nva r13 = r1.s     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r13 = r13.r     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r10 = r10 - r13
            long r10 = r10 / r6
            a((defpackage.amnp) r9, (java.lang.String) r3, (long) r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x048e:
            nva r3 = r1.s     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = r3.g()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x04a0
            java.lang.String r3 = "networkAvailability"
            r6 = 0
            java.lang.String r7 = java.lang.Boolean.toString(r6)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            a((defpackage.amnp) r9, (java.lang.String) r3, (java.lang.String) r7)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x04a0:
            long r6 = r1.I     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r3 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x04a7
            goto L_0x04ad
        L_0x04a7:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3 = 0
            r9.c = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x04ad:
            aucj r3 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r3 = (defpackage.amns) r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r3.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 65536(0x10000, float:9.18355E-41)
            r10 = r10 | r11
            r3.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.q = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r6 = defpackage.axlc.l()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r3 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x0500
            nuj r3 = r1.F     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.a((defpackage.amnp) r9)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            ammy r3 = defpackage.ammy.k     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r6 = r3.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r6 != 0) goto L_0x04d2
            goto L_0x04d8
        L_0x04d2:
            r3.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6 = 0
            r3.c = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x04d8:
            aucj r6 = r3.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            ammy r6 = (defpackage.ammy) r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r7 = 3
            r6.b = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r7 = r6.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 1
            r7 = r7 | r10
            r6.a = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r2.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r7 = r7 | r12
            r6.a = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6.d = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r10 = r1.J     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r7 = r7 | 8
            r6.a = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6.e = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r10 = r2.h     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 16
            r7 = r7 | r13
            r6.a = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6.f = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r9.a(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0500:
            java.lang.String r3 = r1.K     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r3 != 0) goto L_0x0505
            goto L_0x050a
        L_0x0505:
            java.lang.String r6 = "cookie"
            a((defpackage.amnp) r9, (java.lang.String) r6, (java.lang.String) r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x050a:
            nts r3 = r1.p     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            anfc r6 = r3.d     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.Map r3 = r3.e     // Catch:{ all -> 0x0676 }
            ou r3 = (defpackage.ou) r3     // Catch:{ all -> 0x0676 }
            int r3 = r3.h     // Catch:{ all -> 0x0676 }
            monitor-exit(r6)     // Catch:{ all -> 0x0676 }
            if (r3 > 0) goto L_0x051d
            r3 = 1
            goto L_0x051e
        L_0x051d:
            r3 = 0
        L_0x051e:
            boolean r6 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r6 != 0) goto L_0x0523
            goto L_0x0529
        L_0x0523:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6 = 0
            r9.c = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0529:
            aucj r6 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r6 = (defpackage.amns) r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r7 = r6.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = 262144(0x40000, float:3.67342E-40)
            r7 = r7 | r10
            r6.a = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6.t = r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r3 = r1.q     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            long r6 = r3.b()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r7 = (int) r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amnk r6 = defpackage.amnk.f     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = ""
            boolean r11 = r6.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r11 != 0) goto L_0x054a
            goto L_0x0550
        L_0x054a:
            r6.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 0
            r6.c = r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0550:
            aucj r11 = r6.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amnk r11 = (defpackage.amnk) r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r13 = r11.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r16 = 1
            r13 = r13 | 1
            r11.a = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11.b = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r17 = 2
            r10 = r13 | 2
            r11.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 0
            r11.c = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10 = r10 | r12
            r11.a = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11.d = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r10 = r3.g()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r11 = r6.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r11 != 0) goto L_0x0578
            goto L_0x057e
        L_0x0578:
            r6.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11 = 0
            r6.c = r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x057e:
            aucj r11 = r6.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amnk r11 = (defpackage.amnk) r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r12 = r11.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r12 = r12 | 8
            r11.a = r12     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r11.e = r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.i = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r7 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r7 != 0) goto L_0x0591
            goto L_0x0597
        L_0x0591:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r7 = 0
            r9.c = r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0597:
            aucj r7 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r7 = (defpackage.amns) r7     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucj r6 = r6.i()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amnk r6 = (defpackage.amnk) r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r7.j = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            int r6 = r7.a     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6 = r6 | 256(0x100, float:3.59E-43)
            r7.a = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r6 = 0
            r3.j = r6     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            nut r3 = r3.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r3.a((boolean) r6)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.concurrent.BlockingQueue r3 = r2.o     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.util.concurrent.BlockingQueue r6 = r2.o     // Catch:{ all -> 0x0672 }
            r6.clear()     // Catch:{ all -> 0x0672 }
            r1.a((defpackage.audw) r9)     // Catch:{ all -> 0x0672 }
            monitor-exit(r3)     // Catch:{ all -> 0x0672 }
            java.lang.Thread r3 = new java.lang.Thread
            nve r6 = new nve
            r6.<init>(r1, r2, r8)
            java.lang.String r7 = "GCMReader"
            r3.<init>(r6, r7)
            r3.start()
            r2.e = r3
        L_0x05d1:
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x0671
            java.util.concurrent.BlockingQueue r3 = r2.o     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            java.lang.Object r3 = r3.take()     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            audw r3 = (defpackage.audw) r3     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            njy r6 = r1.u     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            java.lang.String r7 = "writeMessage"
            amky r6 = defpackage.njy.a((defpackage.njy) r6, (java.lang.String) r7)     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            boolean r7 = r3 instanceof defpackage.amnp     // Catch:{ all -> 0x0648 }
            if (r7 != 0) goto L_0x0627
            boolean r7 = r2.i     // Catch:{ all -> 0x0648 }
            if (r7 != 0) goto L_0x05ee
            goto L_0x062a
        L_0x05ee:
            r7 = 0
            r2.i = r7     // Catch:{ all -> 0x0648 }
            amnj r7 = defpackage.amnj.e     // Catch:{ all -> 0x0648 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x0648 }
            amni r7 = (defpackage.amni) r7     // Catch:{ all -> 0x0648 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r8 = r1.q     // Catch:{ all -> 0x0648 }
            int r8 = r8.e()     // Catch:{ all -> 0x0648 }
            if (r8 != r5) goto L_0x0602
            goto L_0x061e
        L_0x0602:
            boolean r9 = r7.c     // Catch:{ all -> 0x0648 }
            if (r9 != 0) goto L_0x0607
            goto L_0x060d
        L_0x0607:
            r7.c()     // Catch:{ all -> 0x0648 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x0648 }
        L_0x060d:
            aucj r9 = r7.b     // Catch:{ all -> 0x0648 }
            amnj r9 = (defpackage.amnj) r9     // Catch:{ all -> 0x0648 }
            int r10 = r9.a     // Catch:{ all -> 0x0648 }
            r11 = 16
            r10 = r10 | r11
            r9.a = r10     // Catch:{ all -> 0x0648 }
            r9.d = r8     // Catch:{ all -> 0x0648 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r9 = r1.q     // Catch:{ all -> 0x0648 }
            r9.i = r8     // Catch:{ all -> 0x0648 }
        L_0x061e:
            r1.a((defpackage.nvi) r2, (defpackage.aubk) r4, (defpackage.audw) r7)     // Catch:{ all -> 0x0648 }
            com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm r7 = r1.q     // Catch:{ all -> 0x0648 }
            r7.f()     // Catch:{ all -> 0x0648 }
            goto L_0x062a
        L_0x0627:
            r7 = 0
            r2.i = r7     // Catch:{ all -> 0x0648 }
        L_0x062a:
            boolean r7 = r3 instanceof defpackage.amni     // Catch:{ all -> 0x0648 }
            if (r7 != 0) goto L_0x0645
            boolean r7 = r3 instanceof defpackage.ammz     // Catch:{ all -> 0x0648 }
            if (r7 != 0) goto L_0x063f
            boolean r7 = r2.f     // Catch:{ all -> 0x0648 }
            if (r7 == 0) goto L_0x0639
            r1.a((defpackage.nvi) r2, (defpackage.aubk) r4, (defpackage.audw) r3)     // Catch:{ all -> 0x0648 }
        L_0x0639:
            if (r6 == 0) goto L_0x05d1
        L_0x063b:
            r6.close()     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            goto L_0x05d1
        L_0x063f:
            if (r6 == 0) goto L_0x0671
            r6.close()     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
            return
        L_0x0645:
            if (r6 == 0) goto L_0x05d1
            goto L_0x063b
        L_0x0648:
            r0 = move-exception
            r3 = r0
            if (r6 == 0) goto L_0x0655
            r6.close()     // Catch:{ all -> 0x0650 }
            goto L_0x0655
        L_0x0650:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
        L_0x0655:
            throw r3     // Catch:{ InterruptedException -> 0x0668, IOException -> 0x065d, Exception -> 0x0656 }
        L_0x0656:
            r0 = move-exception
            r3 = 10
            r1.b(r2, r3)
            return
        L_0x065d:
            r0 = move-exception
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x0671
            r3 = 21
            r1.b(r2, r3)
            return
        L_0x0668:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            return
        L_0x0671:
            return
        L_0x0672:
            r0 = move-exception
            r4 = r0
            monitor-exit(r3)     // Catch:{ all -> 0x0672 }
            throw r4     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0676:
            r0 = move-exception
            r3 = r0
            monitor-exit(r6)     // Catch:{ all -> 0x0676 }
            throw r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x067a:
            throw r11     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x067c:
            r16 = 1
            r17 = 2
            java.lang.Object r10 = r3.next()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r13 = r9.c     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r13 != 0) goto L_0x068c
            r13 = 0
            goto L_0x0692
        L_0x068c:
            r9.c()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r13 = 0
            r9.c = r13     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x0692:
            aucj r14 = r9.b     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            amns r14 = (defpackage.amns) r14     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r10.getClass()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucx r15 = r14.i     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            boolean r15 = r15.a()     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            if (r15 != 0) goto L_0x06a9
            aucx r15 = r14.i     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            aucx r15 = defpackage.aucj.a((defpackage.aucx) r15)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14.i = r15     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x06a9:
            aucx r14 = r14.i     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            r14.add(r10)     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
            goto L_0x02b1
        L_0x06b0:
            r0 = move-exception
            r3 = r0
            monitor-exit(r9)     // Catch:{ all -> 0x06b0 }
            throw r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x06b4:
            r0 = move-exception
            r3 = r0
            monitor-exit(r9)     // Catch:{ all -> 0x06b4 }
            throw r3     // Catch:{ IOException -> 0x06bf, Exception -> 0x06b8 }
        L_0x06b8:
            r0 = move-exception
            r3 = 10
            r1.b(r2, r3)
            return
        L_0x06bf:
            r0 = move-exception
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x06ca
            r3 = 21
            r1.b(r2, r3)
            return
        L_0x06ca:
            return
        L_0x06cb:
            r6 = 0
            r16 = 1
            r17 = 2
        L_0x06d0:
            int r8 = r8 + 1
            goto L_0x0043
        L_0x06d4:
            throw r9     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x06d5:
            java.net.UnknownHostException r4 = new java.net.UnknownHostException     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            java.lang.String r5 = "No addresses for host"
            r4.<init>(r5)     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
            throw r4     // Catch:{ UnknownHostException -> 0x070e, NoRouteToHostException -> 0x0707, PortUnreachableException -> 0x0700, SocketTimeoutException -> 0x06f9, ConnectException -> 0x06f2, SSLException -> 0x06eb, IOException -> 0x06e4, Exception -> 0x06dd }
        L_0x06dd:
            r0 = move-exception
            r4 = 10
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x06e4:
            r0 = move-exception
            r4 = 16
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x06eb:
            r0 = move-exception
            r4 = 26
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x06f2:
            r0 = move-exception
            r4 = 25
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x06f9:
            r0 = move-exception
            r4 = 24
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x0700:
            r0 = move-exception
            r4 = 23
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x0707:
            r0 = move-exception
            r4 = 22
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        L_0x070e:
            r0 = move-exception
            r4 = 3
            r1.a((defpackage.nvi) r2, (int) r4, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvh.a(nvi, boolean, nux):void");
    }

    public final boolean a() {
        return this.a.f;
    }
}
