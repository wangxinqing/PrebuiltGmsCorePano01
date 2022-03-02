package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: tlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tlh {
    public static final Charset a = Charset.forName("UTF-8");
    private static final tfw l = new tfw(true);
    private final IBinder.DeathRecipient A;
    private long B;
    private Strategy C;
    private DiscoveryOptions D;
    private AdvertisingOptions E;
    private final Map F;
    public final String b;
    public final Context c;
    public final String d;
    public final boolean e;
    public final tkx f;
    public final Map g;
    public final tlj h;
    public final aoru i;
    public final aoru j;
    public final aoru k;
    private oq m;
    private oq n;
    private final Map o;
    private final Map p;
    private final Map q;
    private final Map r;
    private final int s;
    private final ixk t;
    private final AppOpsManager u;
    private AppOpsManager.OnOpChangedListener v;
    private boolean w;
    private final Set x;
    private final Map y;
    private final Map z;

    public tlh(Context context, String str, String str2, Long l2, tlj tlj, tgj tgj, IBinder.DeathRecipient deathRecipient) {
        tkx tkx = new tkx(tgj, str, str2);
        AppOpsManager appOpsManager = jkr.h() ? (AppOpsManager) context.getSystemService(AppOpsManager.class) : null;
        this.o = new nz();
        this.p = new nz();
        this.q = new nz();
        this.r = new nz();
        this.w = true;
        this.x = new ob();
        this.y = new nz();
        this.g = new nz();
        this.z = new nz();
        this.B = -1;
        this.F = new nz();
        this.i = tid.b();
        this.j = tid.b();
        this.k = tid.b();
        this.c = context;
        this.d = str;
        this.s = Binder.getCallingUid();
        String a2 = jhg.a(this.c, this.d, "com.google.android.gms.nearby.connection.SERVICE_ID");
        this.b = a2 == null ? "" : a2;
        Context context2 = this.c;
        String str3 = this.d;
        ClientContext clientContext = new ClientContext();
        clientContext.e = str3;
        clientContext.b = jhg.i(context2, str3);
        this.t = ixk.a(context2, clientContext);
        this.e = jhg.b();
        this.h = tlj;
        this.f = tkx;
        this.A = deathRecipient;
        this.u = appOpsManager;
        if (l2 != null) {
            this.B = l2.longValue();
        }
        if (this.e && str2 == null) {
            ((anih) ((anih) tky.a.c()).a("tlh", "<init>", 344, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("As a zero party connections client, you should be using Nearby.getConnectionsClient(context, options) to set a zero party identifier");
        }
        if (!this.e && str2 != null) {
            throw new IllegalArgumentException("You are not allowed to set a zero party identifier if you are not a zero party connections client");
        }
    }

    private final synchronized String[] A() {
        return (String[]) this.x.toArray(new String[0]);
    }

    public static int a(asoe asoe) {
        asoe asoe2 = asoe.UNKNOWN_MEDIUM;
        switch (asoe.ordinal()) {
            case 2:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
                return 3;
            case 4:
            case 7:
                return 1;
            default:
                return 0;
        }
    }

    private static final String a(int i2) {
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "FAR" : "CLOSE" : "VERY_CLOSE";
    }

    private static String b(String[] strArr) {
        StringBuilder sb = new StringBuilder("[ ");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(String.format("%s ", new Object[]{strArr[i2]}));
        }
        sb.append("]");
        return sb.toString();
    }

    private final boolean c(String str, int i2) {
        tle tle = (tle) this.r.get(str);
        return (tle == null || (tle.a & i2) == 0) ? false : true;
    }

    private final void d(String str, int i2) {
        tle tle = (tle) this.r.get(str);
        if (tle != null) {
            tle.a = i2 | tle.a;
        }
    }

    private final boolean x() {
        if (!jkr.h() || this.u.noteProxyOpNoThrow("android:fine_location", this.d, this.s) == 0) {
            return true;
        }
        return false;
    }

    private final void y() {
        if (jkr.h() && this.v == null) {
            tld tld = new tld(this);
            this.v = tld;
            this.u.startWatchingMode("android:fine_location", this.d, 1, tld);
            ((anih) ((anih) tky.a.d()).a("tlh", "y", 529, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Listening to visibility changes for client %d", b());
        }
    }

    private final void z() {
        AppOpsManager.OnOpChangedListener onOpChangedListener = this.v;
        if (onOpChangedListener != null) {
            this.u.stopWatchingMode(onOpChangedListener);
            this.v = null;
            ((anih) ((anih) tky.a.d()).a("tlh", "z", 562, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No longer listening to visibility changes for client %d", b());
        }
    }

    public final synchronized void a(Strategy strategy) {
        this.C = strategy;
    }

    public final synchronized long b() {
        return this.B;
    }

    public final synchronized Strategy d() {
        return this.C;
    }

    public final synchronized void e() {
        if (x()) {
            Iterator it = new ob(this.y.values()).iterator();
            while (it.hasNext()) {
                tlg tlg = (tlg) it.next();
                b(tlg.a(), tlg.b(), tlg.c(), tlg.d());
            }
            this.y.clear();
        }
    }

    public final synchronized void f() {
        v();
        w();
        for (ugh b2 : this.o.values()) {
            b((IInterface) b2);
        }
        this.o.clear();
        this.q.clear();
        this.r.clear();
        this.F.clear();
        this.p.clear();
        this.C = null;
        this.E = null;
        this.D = null;
        this.g.clear();
        this.h.b(c());
    }

    public final synchronized boolean g() {
        return this.m != null;
    }

    public final synchronized String h() {
        return g() ? (String) this.m.a : null;
    }

    public final synchronized ugh i() {
        oq oqVar;
        oqVar = this.m;
        return oqVar != null ? (ugh) oqVar.b : null;
    }

    public final synchronized AdvertisingOptions j() {
        return this.E;
    }

    public final synchronized void k(String str) {
        if (h(str)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "k", 1363, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The remote endpoint %s cannot reject the connection because it has already responded.", (Object) str);
            return;
        }
        d(str, 8);
        this.f.e(str);
    }

    public final synchronized boolean k() {
        return this.n != null;
    }

    public final synchronized String l() {
        return k() ? (String) this.n.a : null;
    }

    public final synchronized DiscoveryOptions m() {
        return this.D;
    }

    public final synchronized List n(String str) {
        tle tle = (tle) this.r.get(str);
        if (tle != null) {
            return tle.c;
        }
        return amzy.h();
    }

    public final synchronized void o(String str) {
        this.F.remove(str);
    }

    public final synchronized void p(String str) {
        if (!this.p.containsKey(str)) {
            this.p.put(str, new tfw());
        }
    }

    public final synchronized tfw q(String str) {
        tfw tfw;
        tfw = (tfw) this.p.get(str);
        if (tfw == null) {
            tfw = l;
        }
        return tfw;
    }

    public final synchronized void r(String str) {
        tfw tfw = (tfw) this.p.remove(str);
        if (tfw != null) {
            tfw.a();
        }
    }

    public final synchronized int s() {
        int i2;
        i2 = 0;
        for (tle tle : this.r.values()) {
            if (tle.a == 16 && !tle.b) {
                i2++;
            }
        }
        return i2;
    }

    public final synchronized int t() {
        int i2;
        i2 = 0;
        for (tle tle : this.r.values()) {
            if (tle.a == 16 && tle.b) {
                i2++;
            }
        }
        return i2;
    }

    public final synchronized void u() {
        for (tfw tfw : this.p.values()) {
            if (!tfw.b()) {
                tfw.a();
            }
        }
        this.p.clear();
    }

    public final synchronized void v() {
        if (g()) {
            b((IInterface) this.m.b);
            this.m = null;
            this.f.a();
        }
    }

    public final synchronized void w() {
        if (k()) {
            b((IInterface) this.n.b);
            this.x.clear();
            this.y.clear();
            this.z.clear();
            this.n = null;
            this.f.b();
            AppOpsManager.OnOpChangedListener onOpChangedListener = this.v;
            if (onOpChangedListener != null) {
                this.u.stopWatchingMode(onOpChangedListener);
                this.v = null;
                ((anih) ((anih) tky.a.d()).a("tlh", "z", 562, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No longer listening to visibility changes for client %d", b());
            }
        }
    }

    public final synchronized String c() {
        StringBuilder sb;
        String a2 = ths.a();
        long j2 = this.B;
        sb = new StringBuilder(String.valueOf(a2).length() + 20);
        sb.append(a2);
        sb.append(j2);
        return jhy.d(jhg.a(sb.toString(), "SHA-256")).substring(0, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean g(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            boolean r1 = r2.c(r3, r0)     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0012
            r1 = 2
            boolean r3 = r2.c(r3, r1)     // Catch:{ all -> 0x0014 }
            if (r3 != 0) goto L_0x0012
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.g(java.lang.String):boolean");
    }

    public final synchronized void i(String str) {
        if (g(str)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "i", 1331, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The local endpoint cannot reject the connection to remote endpoint %s because it has already responded.", (Object) str);
            return;
        }
        d(str, 2);
        this.f.f(str);
    }

    public final synchronized void j(String str) {
        if (h(str)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "j", 1347, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The remote endpoint %s cannot accept the connection because it has already responded.", (Object) str);
            return;
        }
        d(str, 4);
        this.f.c(str);
    }

    public final synchronized boolean m(String str) {
        return c(str, 2) || c(str, 8);
    }

    public final synchronized String[] o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.r.entrySet()) {
            String str = (String) entry.getKey();
            if (((tle) entry.getValue()).a == 16) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final synchronized String[] q() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : p()) {
            if (g(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final void a(IInterface iInterface) {
        try {
            iInterface.asBinder().linkToDeath(this.A, 0);
        } catch (RemoteException e2) {
            this.A.binderDied();
            this.w = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.r     // Catch:{ all -> 0x001f }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x001f }
            tle r4 = (defpackage.tle) r4     // Catch:{ all -> 0x001f }
            r0 = 0
            if (r4 == 0) goto L_0x001d
            com.google.android.gms.nearby.connection.Strategy r1 = com.google.android.gms.nearby.connection.Strategy.c     // Catch:{ all -> 0x001f }
            com.google.android.gms.nearby.connection.Strategy r2 = r3.C     // Catch:{ all -> 0x001f }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            boolean r4 = r4.d     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x001d
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001d:
            monitor-exit(r3)
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.d(java.lang.String):boolean");
    }

    public final synchronized boolean h(String str) {
        return c(str, 4) || c(str, 8);
    }

    public final synchronized boolean l(String str) {
        return c(str, 1) && c(str, 4);
    }

    public final synchronized byte[] n() {
        return aymi.w() ? this.h.a(c()) : null;
    }

    public final synchronized String[] p() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.r.entrySet()) {
            String str = (String) entry.getKey();
            if (((tle) entry.getValue()).a != 16) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final synchronized String[] r() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : p()) {
            if (h(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final void b(IInterface iInterface) {
        try {
            iInterface.asBinder().unlinkToDeath(this.A, 0);
        } catch (NoSuchElementException e2) {
        }
    }

    private final void a(RemoteException remoteException, String str) {
        anih anih = (anih) tky.a.b();
        anih.a((Throwable) remoteException);
        ((anih) anih.a("tlh", "a", 1526, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Exception invoking client callback %s", (Object) str);
        if (remoteException instanceof DeadObjectException) {
            this.w = false;
            ((anih) ((anih) tky.a.d()).a("tlh", "a", 1530, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeadObjectException for client %d, will not attempt to deliver future callbacks.", this.B);
        }
    }

    private final void b(String str, String str2, byte[] bArr, asoe asoe) {
        if (!a(str2)) {
            return;
        }
        if (this.x.add(str)) {
            if (this.w) {
                try {
                    uhx uhx = new uhx();
                    uhx.a.a = str;
                    uhx.a(str2);
                    String str3 = new String(bArr, a);
                    OnEndpointFoundParams onEndpointFoundParams = uhx.a;
                    onEndpointFoundParams.c = str3;
                    onEndpointFoundParams.e = bArr;
                    ((ugq) this.n.b).a(onEndpointFoundParams);
                } catch (RemoteException e2) {
                    a(e2, "onEndpointFound");
                }
            }
            this.f.a(str2, asoe);
            ((anih) ((anih) tky.a.d()).a("tlh", "b", 874, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) reporting onEndpointFound(%s)", b(), (Object) str);
            return;
        }
        ((anih) ((anih) tky.a.d()).a("tlh", "b", 877, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) ignoring onEndpointFound(%s) because we've already reported it", b(), (Object) str);
    }

    public final synchronized byte[] c(String str) {
        return (byte[]) this.g.get(str);
    }

    public final synchronized boolean f(String str) {
        tle tle;
        tle = (tle) this.r.get(str);
        return (tle == null || tle.a == 16) ? false : true;
    }

    public final synchronized boolean e(String str) {
        tle tle;
        tle = (tle) this.r.get(str);
        return tle != null && tle.a == 16;
    }

    public final int a(String... strArr) {
        if (!tlb.a(this.c, this.d, this.e)) {
            for (String str : strArr) {
                if (!arze.a(this.t, str)) {
                    ((anih) ((anih) tky.a.c()).a("tlh", "a", 580, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Missing permission: %s does not have required permission %s", (Object) this.d, (Object) str);
                    if ("android.permission.BLUETOOTH".equals(str)) {
                        return 8030;
                    }
                    if ("android.permission.BLUETOOTH_ADMIN".equals(str)) {
                        return 8031;
                    }
                    if ("android.permission.ACCESS_WIFI_STATE".equals(str)) {
                        return 8032;
                    }
                    if ("android.permission.CHANGE_WIFI_STATE".equals(str)) {
                        return 8033;
                    }
                    if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                        return 8034;
                    }
                    if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
                        return 8036;
                    }
                    ((anih) ((anih) tky.a.b()).a("tlb", "a", 116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Need to add corresponding status code for missing permission %s", (Object) str);
                    return 8;
                }
            }
        }
        return 0;
    }

    public final synchronized ConnectionOptions b(String str) {
        return (ConnectionOptions) this.F.get(str);
    }

    public final synchronized void a() {
        tid.a(this.i, "PayloadManager.streamPayloadExecutor");
        tid.a(this.j, "PayloadManager.filePayloadExecutor");
        tid.a(this.k, "PayloadManager.bytesPayloadExecutor");
        this.f.c();
    }

    public final synchronized void b(String str, int i2) {
        String str2;
        if (this.o.containsKey(str)) {
            ugh ugh = (ugh) this.o.get(str);
            if (this.w) {
                try {
                    OnBandwidthChangedParams onBandwidthChangedParams = new uhj().a;
                    onBandwidthChangedParams.a = str;
                    onBandwidthChangedParams.b = i2;
                    ugh.a(onBandwidthChangedParams);
                } catch (RemoteException e2) {
                    a(e2, "onBandwidthChanged");
                }
            }
            anih anih = (anih) ((anih) tky.a.d()).a("tlh", "b", 1126, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            Long valueOf = Long.valueOf(b());
            if (i2 != 1) {
                str2 = i2 != 2 ? i2 != 3 ? "UNKNOWN" : "HIGH" : "MEDIUM";
            } else {
                str2 = "LOW";
            }
            anih.a("ClientProxy(%d) reporting onBandwidthChanged(%s, %s)", (Object) valueOf, (Object) str, (Object) str2);
        }
    }

    public final synchronized void a(long j2) {
        if (j2 == -1) {
            if (j2 != this.B) {
                this.h.b(c());
                this.B = j2;
            }
        }
    }

    public final synchronized void a(PrintWriter printWriter) {
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.connection.service.framework.ClientProxy"}));
        printWriter.write(String.format(Locale.US, "  Client ID: %d\n", new Object[]{Long.valueOf(b())}));
        printWriter.write(String.format("  Package Name: %s\n", new Object[]{this.f.a}));
        printWriter.write(String.format("  Local Endpoint ID: %s\n", new Object[]{c()}));
        printWriter.write(String.format("  Current Strategy: %s\n", new Object[]{d()}));
        printWriter.write(String.format("  Advertising Service ID: %s\n", new Object[]{h()}));
        printWriter.write(String.format("  Discovery Service ID: %s\n", new Object[]{l()}));
        printWriter.write(String.format("  Discovered Endpoint IDs: %s\n", new Object[]{b(A())}));
        printWriter.write(String.format("  Pending Connected Endpoint IDs: %s\n", new Object[]{b(p())}));
        printWriter.write(String.format("  Locally Accepted Endpoint IDs: %s\n", new Object[]{b(q())}));
        printWriter.write(String.format("  Remotely Accepted Endpoint IDs: %s\n", new Object[]{b(r())}));
        printWriter.write(String.format("  Connected Endpoint IDs: %s\n", new Object[]{b(o())}));
        printWriter.flush();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str, String str2) {
        if (!this.d.equals(str2)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "b", 517, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring irrelevant visibility change for package %s", (Object) str2);
        } else {
            e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r2, defpackage.asoe r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.F     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0044 }
            com.google.android.gms.nearby.connection.ConnectionOptions r2 = (com.google.android.gms.nearby.connection.ConnectionOptions) r2     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0012
            tin r2 = new tin     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.nearby.connection.ConnectionOptions r2 = r2.a     // Catch:{ all -> 0x0044 }
        L_0x0012:
            boolean r0 = r2.a     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x003c
            asoe r0 = defpackage.asoe.UNKNOWN_MEDIUM     // Catch:{ all -> 0x0044 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0044 }
            switch(r3) {
                case 0: goto L_0x003a;
                case 1: goto L_0x003a;
                case 2: goto L_0x0037;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                case 5: goto L_0x002e;
                case 6: goto L_0x002b;
                case 7: goto L_0x0028;
                case 8: goto L_0x0025;
                case 9: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r2 = 1
        L_0x0020:
            monitor-exit(r1)
            return r2
        L_0x0022:
            boolean r2 = r2.j     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x0025:
            boolean r2 = r2.h     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x0028:
            boolean r2 = r2.e     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x002b:
            boolean r2 = r2.f     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x002e:
            boolean r2 = r2.d     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x0031:
            boolean r2 = r2.c     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x0034:
            boolean r2 = r2.g     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x0037:
            boolean r2 = r2.b     // Catch:{ all -> 0x0044 }
            goto L_0x0020
        L_0x003a:
            r2 = 0
            goto L_0x0020
        L_0x003c:
            asoe r2 = defpackage.asoe.BLE     // Catch:{ all -> 0x0044 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)
            return r2
        L_0x0044:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x0048
        L_0x0047:
            throw r2
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.b(java.lang.String, asoe):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.w     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "a"
            java.lang.String r2 = "tlh"
            boolean r3 = r5.x()     // Catch:{ all -> 0x00d9 }
            if (r3 != 0) goto L_0x002c
            jjg r7 = defpackage.tky.a     // Catch:{ all -> 0x00d9 }
            anie r7 = r7.d()     // Catch:{ all -> 0x00d9 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00d9 }
            r3 = 943(0x3af, float:1.321E-42)
            anie r7 = r7.a((java.lang.String) r2, (java.lang.String) r1, (int) r3, (java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "ClientProxy(%d) ignores onEndpointDistanceChanged(%s) because the client does not have location permission currently."
            long r1 = r5.b()     // Catch:{ all -> 0x00d9 }
            r7.a((java.lang.String) r0, (long) r1, (java.lang.Object) r6)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r5)
            return
        L_0x002c:
            java.util.Set r3 = r5.x     // Catch:{ all -> 0x00d9 }
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x00d9 }
            if (r3 != 0) goto L_0x0057
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x00d9 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d9 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d9 }
            r4 = 951(0x3b7, float:1.333E-42)
            anie r0 = r3.a((java.lang.String) r2, (java.lang.String) r1, (int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "ClientProxy(%d) ignoring onEndpointDistanceChanged(%s, %s), because this endpoint hasn't been reported as discovered"
            long r2 = r5.b()     // Catch:{ all -> 0x00d9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d9 }
            java.lang.String r7 = a((int) r7)     // Catch:{ all -> 0x00d9 }
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r5)
            return
        L_0x0057:
            java.util.Map r3 = r5.z     // Catch:{ all -> 0x00d9 }
            boolean r3 = r3.containsKey(r6)     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x0091
            java.util.Map r3 = r5.z     // Catch:{ all -> 0x00d9 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00d9 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00d9 }
            if (r7 == r3) goto L_0x006e
            goto L_0x0091
        L_0x006e:
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x00d9 }
            anie r3 = r3.d()     // Catch:{ all -> 0x00d9 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x00d9 }
            r4 = 960(0x3c0, float:1.345E-42)
            anie r0 = r3.a((java.lang.String) r2, (java.lang.String) r1, (int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "ClientProxy(%d) ignoring onEndpointDistanceChanged(%s, %s), because this distance has already been reported"
            long r2 = r5.b()     // Catch:{ all -> 0x00d9 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d9 }
            java.lang.String r7 = a((int) r7)     // Catch:{ all -> 0x00d9 }
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x00d9 }
        L_0x008f:
            monitor-exit(r5)
            return
        L_0x0091:
            java.util.Map r3 = r5.z     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00d9 }
            r3.put(r6, r4)     // Catch:{ all -> 0x00d9 }
            oq r3 = r5.n     // Catch:{ RemoteException -> 0x00d1 }
            java.lang.Object r3 = r3.b     // Catch:{ RemoteException -> 0x00d1 }
            ugq r3 = (defpackage.ugq) r3     // Catch:{ RemoteException -> 0x00d1 }
            uhv r4 = new uhv     // Catch:{ RemoteException -> 0x00d1 }
            r4.<init>()     // Catch:{ RemoteException -> 0x00d1 }
            com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams r4 = r4.a     // Catch:{ RemoteException -> 0x00d1 }
            r4.a = r6     // Catch:{ RemoteException -> 0x00d1 }
            r4.b = r7     // Catch:{ RemoteException -> 0x00d1 }
            r3.a((com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams) r4)     // Catch:{ RemoteException -> 0x00d1 }
            jjg r3 = defpackage.tky.a     // Catch:{ RemoteException -> 0x00d1 }
            anie r3 = r3.d()     // Catch:{ RemoteException -> 0x00d1 }
            anih r3 = (defpackage.anih) r3     // Catch:{ RemoteException -> 0x00d1 }
            r4 = 975(0x3cf, float:1.366E-42)
            anie r0 = r3.a((java.lang.String) r2, (java.lang.String) r1, (int) r4, (java.lang.String) r0)     // Catch:{ RemoteException -> 0x00d1 }
            anih r0 = (defpackage.anih) r0     // Catch:{ RemoteException -> 0x00d1 }
            java.lang.String r1 = "ClientProxy(%d) reporting onEndpointDistanceChanged(%s, %s)"
            long r2 = r5.b()     // Catch:{ RemoteException -> 0x00d1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ RemoteException -> 0x00d1 }
            java.lang.String r7 = a((int) r7)     // Catch:{ RemoteException -> 0x00d1 }
            r0.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ RemoteException -> 0x00d1 }
            monitor-exit(r5)
            return
        L_0x00d1:
            r6 = move-exception
            java.lang.String r7 = "onEndpointDistanceChanged"
            r5.a((android.os.RemoteException) r6, (java.lang.String) r7)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r5)
            return
        L_0x00d9:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.a(java.lang.String, int):void");
    }

    public final synchronized void a(String str, int i2, byte[] bArr) {
        if (f(str)) {
            ugh ugh = (ugh) this.o.get(str);
            if (this.w) {
                try {
                    OnConnectionResultParams onConnectionResultParams = new uhr().a;
                    onConnectionResultParams.a = str;
                    onConnectionResultParams.b = i2;
                    onConnectionResultParams.c = bArr;
                    ugh.a(onConnectionResultParams);
                } catch (RemoteException e2) {
                    a(e2, "onConnectionResult");
                }
            }
            if (i2 == 0) {
                tle tle = (tle) this.r.get(str);
                if (tle != null) {
                    tle.a = 16;
                }
            } else {
                a(str, false);
            }
            ((anih) ((anih) tky.a.d()).a("tlh", "a", 1095, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) reporting onConnectionResult(%s, %s)", (Object) Long.valueOf(b()), (Object) str, (Object) tit.g(i2));
            return;
        }
        ((anih) ((anih) tky.a.d()).a("tlh", "a", 1099, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) ignoring onConnectionResult(%s, %s) because this client has no pending connections to the endpoint", (Object) Long.valueOf(b()), (Object) str, (Object) tit.g(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r7, android.bluetooth.BluetoothDevice r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.a((java.lang.String) r7)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0062
            boolean r0 = r6.w     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "a"
            java.lang.String r2 = "tlh"
            boolean r3 = r6.x()     // Catch:{ all -> 0x006c }
            if (r3 != 0) goto L_0x0032
            jjg r7 = defpackage.tky.a     // Catch:{ all -> 0x006c }
            anie r7 = r7.d()     // Catch:{ all -> 0x006c }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x006c }
            r3 = 891(0x37b, float:1.249E-42)
            anie r7 = r7.a((java.lang.String) r2, (java.lang.String) r1, (int) r3, (java.lang.String) r0)     // Catch:{ all -> 0x006c }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "ClientProxy(%d) ignoring onEndpointFound(%s) because the client does not have location permission."
            long r1 = r6.b()     // Catch:{ all -> 0x006c }
            r7.a((java.lang.String) r0, (long) r1, (java.lang.Object) r8)     // Catch:{ all -> 0x006c }
            monitor-exit(r6)
            return
        L_0x0032:
            oq r3 = r6.n     // Catch:{ RemoteException -> 0x0064 }
            java.lang.Object r3 = r3.b     // Catch:{ RemoteException -> 0x0064 }
            ugq r3 = (defpackage.ugq) r3     // Catch:{ RemoteException -> 0x0064 }
            uhx r4 = new uhx     // Catch:{ RemoteException -> 0x0064 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams r5 = r4.a     // Catch:{ RemoteException -> 0x0064 }
            r5.d = r8     // Catch:{ RemoteException -> 0x0064 }
            r4.a(r7)     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams r7 = r4.a     // Catch:{ RemoteException -> 0x0064 }
            r3.a((com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams) r7)     // Catch:{ RemoteException -> 0x0064 }
            jjg r7 = defpackage.tky.a     // Catch:{ RemoteException -> 0x0064 }
            anie r7 = r7.d()     // Catch:{ RemoteException -> 0x0064 }
            anih r7 = (defpackage.anih) r7     // Catch:{ RemoteException -> 0x0064 }
            r3 = 904(0x388, float:1.267E-42)
            anie r7 = r7.a((java.lang.String) r2, (java.lang.String) r1, (int) r3, (java.lang.String) r0)     // Catch:{ RemoteException -> 0x0064 }
            anih r7 = (defpackage.anih) r7     // Catch:{ RemoteException -> 0x0064 }
            java.lang.String r0 = "ClientProxy(%d) reporting onEndpointFound(%s)"
            long r1 = r6.b()     // Catch:{ RemoteException -> 0x0064 }
            r7.a((java.lang.String) r0, (long) r1, (java.lang.Object) r8)     // Catch:{ RemoteException -> 0x0064 }
        L_0x0062:
            monitor-exit(r6)
            return
        L_0x0064:
            r7 = move-exception
            java.lang.String r8 = "onEndpointFound"
            r6.a((android.os.RemoteException) r7, (java.lang.String) r8)     // Catch:{ all -> 0x006c }
            monitor-exit(r6)
            return
        L_0x006c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.a(java.lang.String, android.bluetooth.BluetoothDevice):void");
    }

    public final synchronized void a(String str, asoe asoe) {
        b(str, a(asoe));
    }

    public final synchronized void a(String str, ConnectionOptions connectionOptions) {
        this.F.put(str, connectionOptions);
    }

    public final synchronized void a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        String str2;
        String str3;
        if (e(str)) {
            ugx ugx = (ugx) this.q.get(str);
            if (this.w) {
                try {
                    OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = new uid().a;
                    onPayloadTransferUpdateParams.a = str;
                    onPayloadTransferUpdateParams.b = payloadTransferUpdate;
                    ugx.a(onPayloadTransferUpdateParams);
                } catch (RemoteException e2) {
                    a(e2, "onPayloadTransferUpdate");
                }
            }
            anih anih = (anih) ((anih) tky.a.d()).a("tlh", "a", 1455, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            Long valueOf = Long.valueOf(b());
            Long valueOf2 = Long.valueOf(payloadTransferUpdate.a);
            int i2 = payloadTransferUpdate.b;
            if (i2 == 1) {
                str3 = "SUCCESS";
            } else if (i2 == 2) {
                str3 = "FAILURE";
            } else if (i2 == 3) {
                str3 = "IN_PROGRESS";
            } else if (i2 != 4) {
                str2 = "UNKNOWN";
                anih.a("ClientProxy(%d) reporting onPayloadTransferUpdate(%s, %s, %s)", valueOf, str, valueOf2, str2);
            } else {
                str3 = "CANCELED";
            }
            str2 = str3;
            anih.a("ClientProxy(%d) reporting onPayloadTransferUpdate(%s, %s, %s)", valueOf, str, valueOf2, str2);
        }
    }

    public final synchronized void a(String str, Strategy strategy, ugh ugh, List list, AdvertisingOptions advertisingOptions) {
        this.E = advertisingOptions;
        if (g()) {
            b((IInterface) this.m.b);
        }
        a((IInterface) ugh);
        this.m = new oq(str, ugh);
        this.f.a(strategy, list);
    }

    public final synchronized void a(String str, Strategy strategy, ugq ugq, List list, DiscoveryOptions discoveryOptions) {
        this.D = discoveryOptions;
        if (k()) {
            b((IInterface) this.n.b);
        }
        a((IInterface) ugq);
        this.n = new oq(str, ugq);
        this.f.b(strategy, list);
        if (jkr.h() && this.v == null) {
            tld tld = new tld(this);
            this.v = tld;
            this.u.startWatchingMode("android:fine_location", this.d, 1, tld);
            ((anih) ((anih) tky.a.d()).a("tlh", "y", 529, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Listening to visibility changes for client %d", b());
        }
    }

    public final synchronized void a(String str, ParcelablePayload parcelablePayload) {
        if (e(str)) {
            ugx ugx = (ugx) this.q.get(str);
            if (this.w) {
                try {
                    OnPayloadReceivedParams onPayloadReceivedParams = new uib().a;
                    onPayloadReceivedParams.a = str;
                    onPayloadReceivedParams.b = parcelablePayload;
                    ugx.a(onPayloadReceivedParams);
                } catch (RemoteException e2) {
                    a(e2, "onPayloadReceived");
                }
            }
            ((anih) ((anih) tky.a.d()).a("tlh", "a", 1433, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) reporting onPayloadReceived(%s, %s)", (Object) Long.valueOf(b()), (Object) str, (Object) Long.valueOf(parcelablePayload.a));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r5 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x0070
            java.util.Map r5 = r4.y     // Catch:{ all -> 0x0072 }
            r5.remove(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r0 = "a"
            java.lang.String r1 = "tlh"
            java.util.Set r2 = r4.x     // Catch:{ all -> 0x0072 }
            boolean r2 = r2.remove(r6)     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0057
            java.util.Map r2 = r4.z     // Catch:{ all -> 0x0072 }
            r2.remove(r6)     // Catch:{ all -> 0x0072 }
            boolean r2 = r4.w     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x003c
            oq r2 = r4.n     // Catch:{ RemoteException -> 0x0036 }
            java.lang.Object r2 = r2.b     // Catch:{ RemoteException -> 0x0036 }
            ugq r2 = (defpackage.ugq) r2     // Catch:{ RemoteException -> 0x0036 }
            uhz r3 = new uhz     // Catch:{ RemoteException -> 0x0036 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0036 }
            com.google.android.gms.nearby.internal.connection.OnEndpointLostParams r3 = r3.a     // Catch:{ RemoteException -> 0x0036 }
            r3.a = r6     // Catch:{ RemoteException -> 0x0036 }
            r2.a((com.google.android.gms.nearby.internal.connection.OnEndpointLostParams) r3)     // Catch:{ RemoteException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            r2 = move-exception
            java.lang.String r3 = "onEndpointLost"
            r4.a((android.os.RemoteException) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0072 }
        L_0x003c:
            jjg r2 = defpackage.tky.a     // Catch:{ all -> 0x0072 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0072 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0072 }
            r3 = 926(0x39e, float:1.298E-42)
            anie r5 = r2.a((java.lang.String) r1, (java.lang.String) r0, (int) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "ClientProxy(%d) reporting onEndpointLost(%s)"
            long r1 = r4.b()     // Catch:{ all -> 0x0072 }
            r5.a((java.lang.String) r0, (long) r1, (java.lang.Object) r6)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return
        L_0x0057:
            jjg r2 = defpackage.tky.a     // Catch:{ all -> 0x0072 }
            anie r2 = r2.d()     // Catch:{ all -> 0x0072 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0072 }
            r3 = 929(0x3a1, float:1.302E-42)
            anie r5 = r2.a((java.lang.String) r1, (java.lang.String) r0, (int) r3, (java.lang.String) r5)     // Catch:{ all -> 0x0072 }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "ClientProxy(%d) ignoring onEndpointLost(%s) because we haven't reported it"
            long r1 = r4.b()     // Catch:{ all -> 0x0072 }
            r5.a((java.lang.String) r0, (long) r1, (java.lang.Object) r6)     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r4)
            return
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r6, java.lang.String r7, byte[] r8, defpackage.asoe r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.a((java.lang.String) r7)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r5.x()     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00c5
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x00ca }
            anie r0 = r0.d()     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "tlh"
            java.lang.String r2 = "a"
            r3 = 835(0x343, float:1.17E-42)
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00ca }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "ClientProxy(%d) delaying onEndpointFound(%s) because the client does not have location permission currently."
            long r2 = r5.b()     // Catch:{ all -> 0x00ca }
            r0.a((java.lang.String) r1, (long) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x00ca }
            java.util.Map r0 = r5.y     // Catch:{ all -> 0x00ca }
            tlf r1 = new tlf     // Catch:{ all -> 0x00ca }
            r1.<init>()     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x00bd
            r1.a = r6     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x00b5
            r1.b = r7     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x00ad
            r1.c = r8     // Catch:{ all -> 0x00ca }
            if (r9 == 0) goto L_0x00a5
            r1.d = r9     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = ""
            java.lang.String r8 = r1.a     // Catch:{ all -> 0x00ca }
            if (r8 != 0) goto L_0x004b
            java.lang.String r7 = " endpointId"
        L_0x004b:
            java.lang.String r8 = r1.b     // Catch:{ all -> 0x00ca }
            if (r8 != 0) goto L_0x0055
            java.lang.String r8 = " serviceId"
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x00ca }
        L_0x0055:
            byte[] r8 = r1.c     // Catch:{ all -> 0x00ca }
            if (r8 != 0) goto L_0x0063
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = " endpointInfo"
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x00ca }
        L_0x0063:
            asoe r8 = r1.d     // Catch:{ all -> 0x00ca }
            if (r8 != 0) goto L_0x0071
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = " medium"
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x00ca }
        L_0x0071:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x00ca }
            if (r8 != 0) goto L_0x0093
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = "Missing required properties:"
            int r9 = r7.length()     // Catch:{ all -> 0x00ca }
            if (r9 != 0) goto L_0x008b
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x00ca }
            r7.<init>(r8)     // Catch:{ all -> 0x00ca }
            goto L_0x008f
        L_0x008b:
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x00ca }
        L_0x008f:
            r6.<init>(r7)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x0093:
            tlc r7 = new tlc     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r1.a     // Catch:{ all -> 0x00ca }
            java.lang.String r9 = r1.b     // Catch:{ all -> 0x00ca }
            byte[] r2 = r1.c     // Catch:{ all -> 0x00ca }
            asoe r1 = r1.d     // Catch:{ all -> 0x00ca }
            r7.<init>(r8, r9, r2, r1)     // Catch:{ all -> 0x00ca }
            r0.put(r6, r7)     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x00a5:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "Null medium"
            r6.<init>(r7)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00ad:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "Null endpointInfo"
            r6.<init>(r7)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00b5:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "Null serviceId"
            r6.<init>(r7)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00bd:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = "Null endpointId"
            r6.<init>(r7)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00c5:
            r5.b(r6, r7, r8, r9)     // Catch:{ all -> 0x00ca }
        L_0x00c8:
            monitor-exit(r5)
            return
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.a(java.lang.String, java.lang.String, byte[], asoe):void");
    }

    public final synchronized void a(String str, ugx ugx) {
        if (g(str)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "a", 1314, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The local endpoint cannot accept the connection to remote endpoint %s because it has already responded.", (Object) str);
            return;
        }
        d(str, 1);
        this.q.put(str, ugx);
        this.f.d(str);
    }

    public final synchronized void a(String str, boolean z2) {
        this.r.remove(str);
        this.q.remove(str);
        o(str);
        tfw tfw = (tfw) this.p.remove(str);
        if (tfw != null) {
            tfw.a();
        }
        ugh ugh = (ugh) this.o.remove(str);
        if (ugh != null) {
            if (z2 && this.w) {
                try {
                    OnDisconnectedParams onDisconnectedParams = new uht().a;
                    onDisconnectedParams.a = str;
                    ugh.a(onDisconnectedParams);
                } catch (RemoteException e2) {
                    a(e2, "onDisconnected");
                }
            }
            b((IInterface) ugh);
        }
    }

    public final synchronized void a(String str, byte[] bArr) {
        if (aymi.w()) {
            this.g.put(str, bArr);
            jjg jjg = tky.a;
        }
    }

    public final synchronized void a(String str, byte[] bArr, byte[] bArr2, String str2, byte[] bArr3, boolean z2, boolean z3, List list, ugh ugh, boolean z4) {
        this.r.put(str, new tle(z2, list, z4));
        a((IInterface) ugh);
        this.o.put(str, ugh);
        if (this.w) {
            try {
                uhl uhl = new uhl();
                uhl.a.a = str;
                String str3 = new String(bArr, a);
                OnConnectionInitiatedParams onConnectionInitiatedParams = uhl.a;
                onConnectionInitiatedParams.b = str3;
                onConnectionInitiatedParams.g = bArr;
                onConnectionInitiatedParams.c = str2;
                onConnectionInitiatedParams.f = bArr3;
                onConnectionInitiatedParams.d = z2;
                onConnectionInitiatedParams.h = z3;
                onConnectionInitiatedParams.e = bArr2;
                ((ugh) this.o.get(str)).a(onConnectionInitiatedParams);
            } catch (RemoteException e2) {
                a(e2, "onConnectionInitiated");
            }
            if (z2) {
                p(str);
                this.f.b(str);
            } else {
                this.f.a(str);
            }
            ((anih) ((anih) tky.a.d()).a("tlh", "a", 1059, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ClientProxy(%d) reporting onConnectionInitiated(%s, %s)", (Object) Long.valueOf(b()), (Object) str, (Object) tky.a(bArr));
        }
    }

    public final synchronized boolean a(String str) {
        return k() && str.equals(this.n.a);
    }
}
