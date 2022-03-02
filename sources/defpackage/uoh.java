package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uoh {
    public final Context a;
    public final upb b;
    public final WifiManager c;
    public final ConnectivityManager d;
    public final WifiP2pManager e;
    public final uru f;
    public unu g;
    public ServerSocket h;
    public urq i;
    public urq j;
    public urq k;
    public final aoru l = tid.b();
    private unt m;
    private final AtomicBoolean n = new AtomicBoolean();

    public uoh(Context context, upb upb, uru uru) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = upb;
        this.c = (WifiManager) applicationContext.getSystemService("wifi");
        this.d = (ConnectivityManager) this.a.getSystemService("connectivity");
        this.e = (WifiP2pManager) this.a.getSystemService("wifip2p");
        this.f = uru;
    }

    public static WifiConfiguration a(String str, String str2, boolean z) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = str;
        wifiConfiguration.preSharedKey = str2;
        wifiConfiguration.allowedAuthAlgorithms.set(0);
        if (z) {
            wifiConfiguration.allowedKeyManagement.set(1);
        } else if (jkr.g()) {
            wifiConfiguration.allowedKeyManagement.set(4);
        } else {
            wifiConfiguration.allowedKeyManagement.set(1);
        }
        return wifiConfiguration;
    }

    static String b(String str) {
        return c(str) ? str.substring(1, str.length() - 1) : str;
    }

    static boolean c(String str) {
        if (str.length() >= 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return true;
        }
        return false;
    }

    private final void k() {
        urq urq = this.j;
        if (urq != null) {
            this.f.c(urq);
            this.j = null;
            if (!this.b.a()) {
                ((anih) ((anih) ulh.a.c()).a("uoh", "k", 422, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to turn Wifi back on after stopping the Wifi Soft AP hotspot.");
            }
        }
    }

    private final void l() {
        if (this.k == null) {
            return;
        }
        if (!d()) {
            ((anih) ((anih) ulh.a.d()).a("uoh", "l", 479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop Wifi Direct hotspot because Wifi Direct is not supported.");
            return;
        }
        this.f.c(this.k);
        this.k = null;
    }

    private final boolean m() {
        if (!p()) {
            ((anih) ((anih) ulh.a.d()).a("uoh", "m", 497, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Local only hotspot is not supported.");
            return false;
        }
        ((anih) ((anih) ulh.a.d()).a("uoh", "m", 501, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to start a local only hotspot.");
        if ((aymi.y() || !jkr.h()) && !this.b.b()) {
            ((anih) ((anih) ulh.a.c()).a("uoh", "m", 510, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up.");
            return false;
        }
        aosh f2 = aosh.f();
        unv unv = new unv(this.c, f2, new unm(this, f2));
        if (urt.SUCCESS != this.f.b(unv)) {
            this.b.a();
            ((anih) ((anih) ulh.a.c()).a("uoh", "m", 549, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start the Local only hotspot because registration failed.");
            return false;
        }
        this.i = unv;
        this.g = unv.a;
        return true;
    }

    private final void n() {
        urq urq = this.i;
        if (urq != null) {
            this.f.c(urq);
            this.i = null;
            if (!this.b.a()) {
                ((anih) ((anih) ulh.a.c()).a("uoh", "n", 572, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to turn Wifi back on after stopping the local only Wifi hotspot.");
            }
        }
    }

    private final boolean o() {
        return this.m != null;
    }

    private static final boolean p() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final synchronized boolean b() {
        return this.g != null;
    }

    public final synchronized unu c() {
        return this.g;
    }

    public final boolean d() {
        int i2 = Build.VERSION.SDK_INT;
        return this.a.getPackageManager().hasSystemFeature("android.hardware.wifi.direct") && this.e != null;
    }

    public final void e() {
        j();
        synchronized (this) {
            if (b()) {
                if (this.k != null) {
                    if (!d()) {
                        ((anih) ((anih) ulh.a.d()).a("uoh", "l", 479, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop Wifi Direct hotspot because Wifi Direct is not supported.");
                    } else {
                        this.f.c(this.k);
                        this.k = null;
                    }
                }
                urq urq = this.i;
                if (urq != null) {
                    this.f.c(urq);
                    this.i = null;
                    if (!this.b.a()) {
                        ((anih) ((anih) ulh.a.c()).a("uoh", "n", 572, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to turn Wifi back on after stopping the local only Wifi hotspot.");
                    }
                }
                urq urq2 = this.j;
                if (urq2 != null) {
                    this.f.c(urq2);
                    this.j = null;
                    if (!this.b.a()) {
                        ((anih) ((anih) ulh.a.c()).a("uoh", "k", 422, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to turn Wifi back on after stopping the Wifi Soft AP hotspot.");
                    }
                }
                jjg jjg = ulh.a;
                String str = this.g.a;
                this.g = null;
                return;
            }
            ((anih) ((anih) ulh.a.d()).a("uoh", "e", 582, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop the Wifi hotspot because it was never turned on.");
        }
    }

    public final boolean f() {
        return this.h != null;
    }

    public final void g() {
        j();
        synchronized (this) {
            if (!f()) {
                ((anih) ((anih) ulh.a.d()).a("uoh", "g", 741, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting Wifi connections because it was never started.");
                return;
            }
            try {
                this.h.close();
                this.h = null;
                ulu.b();
                jjg jjg = ulh.a;
            } catch (IOException e2) {
                try {
                    anih anih = (anih) ulh.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("uoh", "g", 758, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close existing Wifi server socket.");
                    this.h = null;
                    ulu.b();
                } catch (Throwable th) {
                    this.h = null;
                    ulu.b();
                    jjg jjg2 = ulh.a;
                    throw th;
                }
            }
        }
    }

    public final void h() {
        j();
        synchronized (this) {
            if (!o()) {
                ((anih) ((anih) ulh.a.d()).a("uoh", "h", 921, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot disconnect from the Wifi hotspot when it was never connected.");
                return;
            }
            this.f.c(this.m);
            this.m = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        ((anih) ((anih) ulh.a.b()).a("uoh", "i", 455, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi Direct channel has disconnected.");
        e();
    }

    public final void j() {
        this.n.set(true);
        jjg jjg = ulh.a;
    }

    static String a(String str) {
        if (c(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r2 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress a(android.net.wifi.WifiManager r8) {
        /*
            android.net.wifi.WifiInfo r8 = r8.getConnectionInfo()
            int r8 = r8.getIpAddress()
            if (r8 == 0) goto L_0x000f
            java.net.InetAddress r8 = defpackage.ulu.c(r8)
            return r8
        L_0x000f:
            java.util.Enumeration r8 = java.net.NetworkInterface.getNetworkInterfaces()
            java.util.ArrayList r8 = java.util.Collections.list(r8)
            int r0 = r8.size()
            r1 = 0
            r2 = 0
        L_0x001d:
            if (r2 >= r0) goto L_0x004d
            java.lang.Object r3 = r8.get(r2)
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3
            java.util.Enumeration r3 = r3.getInetAddresses()
            java.util.ArrayList r3 = java.util.Collections.list(r3)
            int r4 = r3.size()
            r5 = 0
        L_0x0032:
            int r6 = r2 + 1
            if (r5 >= r4) goto L_0x004b
            java.lang.Object r6 = r3.get(r5)
            java.net.InetAddress r6 = (java.net.InetAddress) r6
            boolean r7 = r6.isLoopbackAddress()
            if (r7 == 0) goto L_0x0043
        L_0x0042:
            goto L_0x0048
        L_0x0043:
            boolean r7 = r6 instanceof java.net.Inet4Address
            if (r7 == 0) goto L_0x0042
            return r6
        L_0x0048:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004b:
            r2 = r6
            goto L_0x001d
        L_0x004d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Failed to find my own IPv4 address."
            r8.<init>(r0)
            goto L_0x0056
        L_0x0055:
            throw r8
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoh.a(android.net.wifi.WifiManager):java.net.InetAddress");
    }

    public static void a(WifiManager wifiManager, String str) {
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration next : configuredNetworks) {
                if (a(next.SSID, str)) {
                    wifiManager.removeNetwork(next.networkId);
                    wifiManager.saveConfiguration();
                    jjg jjg = ulh.a;
                    return;
                }
            }
            ((anih) ((anih) ulh.a.d()).a("uoh", "a", 905, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to forget SSID %s. Unable to find it in the list of configured Wifi networks.", (Object) str);
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uoh", "a", 910, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to forget SSID %s because wifiManager.getConfiguredNetworks() returned null.", (Object) str);
    }

    public static boolean a(String str, String str2) {
        return b(str).equals(b(str2));
    }

    private final boolean a(tfw tfw) {
        if (!this.b.b()) {
            ((anih) ((anih) ulh.a.c()).a("uoh", "a", 389, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a Wifi AP because we failed to turn Wifi off before starting it up.");
            return false;
        }
        uoa uoa = new uoa(this.a, this.c, this.d, tfw);
        if (urt.SUCCESS != this.f.b(uoa)) {
            this.b.a();
            ((anih) ((anih) ulh.a.c()).a("uoh", "a", 400, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start a Soft AP Wifi Hotspot because registration failed.");
            return false;
        }
        this.g = uoa.b;
        this.j = uoa;
        return true;
    }

    private final boolean a(boolean z) {
        if (!d()) {
            ((anih) ((anih) ulh.a.d()).a("uoh", "a", 443, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi Direct is not supported.");
            return false;
        }
        ((anih) ((anih) ulh.a.d()).a("uoh", "a", 447, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to start a wifi direct hotspot.");
        uog uog = new uog(this.a, this.e, new unf(this), this.c, z);
        if (this.f.b(uog) != urt.SUCCESS) {
            ((anih) ((anih) ulh.a.c()).a("uoh", "a", 463, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start Wifi Direct hotspot because registration failed");
            return false;
        }
        this.g = uog.b;
        this.k = uog;
        return true;
    }

    public final synchronized uwf a(String str, String str2, String str3, int i2, tfw tfw) {
        String str4 = str;
        int i3 = i2;
        synchronized (this) {
            if (str4 == null || str2 == null) {
                ((anih) ((anih) ulh.a.b()).a("uoh", "a", 782, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to Wifi hotspot because at least one of ssid or password is null.");
                return null;
            }
            this.n.set(false);
            if (o()) {
                ((anih) ((anih) ulh.a.b()).a("uoh", "a", 794, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to Wifi hotspot (%s, %d) because we're already connected to another one.", (Object) str4, i3);
                return null;
            } else if (!a()) {
                ((anih) ((anih) ulh.a.d()).a("uoh", "a", 802, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to Wifi hotspot (%s, %d) because WifiHotspot is not available.", (Object) str4, i3);
                return null;
            } else {
                if (b()) {
                    unu unu = this.g;
                    String str5 = unu.a;
                    Integer valueOf = Integer.valueOf(unu.e);
                    ((anih) ((anih) ulh.a.d()).a("uoh", "a", 816, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to stop own Wifi hotspot (%s, %d) before trying to connect to another hotspot (%s, %d).", str5, valueOf, str, Integer.valueOf(i2));
                    g();
                    e();
                }
                tfw.a(new ung(this));
                unt unt = r2;
                unt unt2 = new unt(this.a, this.c, this.d, this.n, str, str2, i2, str3);
                unh unh = new unh(this, unt, str4, i3);
                arzi arzi = new arzi((Runnable) new uni(this));
                arzi.a = this.n;
                if (urt.SUCCESS != ((urt) arzk.a((Callable) unh, "ConnectToHotspot", arzi.a()))) {
                    ((anih) ((anih) ulh.a.c()).a("uoh", "a", 858, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create client WifiHotspot socket because we failed to register the MediumOperation.");
                    return null;
                }
                uwf uwf = unt.c;
                uwf.a(new unj(this, unt));
                jjg jjg = ulh.a;
                this.m = unt;
                return uwf;
            }
        }
    }

    public final void a(Runnable runnable) {
        this.l.execute(runnable);
    }

    public final synchronized void a(urq urq) {
        this.f.c(urq);
        ulu.b();
    }

    public final boolean a() {
        return aymi.a.a().aK() && this.a.getPackageManager().hasSystemFeature("android.hardware.wifi") && this.c != null && this.d != null;
    }

    public final boolean a(too too) {
        if (too == null) {
            ((anih) ((anih) ulh.a.b()).a("uoh", "a", 601, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting Wifi connections because acceptedConnectionCallback is null.");
            return false;
        }
        j();
        synchronized (this) {
            if (f()) {
                ((anih) ((anih) ulh.a.b()).a("uoh", "a", 611, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting Wifi connections because another Wifi server is already in-progress.");
                return false;
            } else if (!b()) {
                ((anih) ((anih) ulh.a.b()).a("uoh", "a", 619, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting Wifi connections without hosting a hotspot.");
                return false;
            } else if (!a()) {
                ((anih) ((anih) ulh.a.d()).a("uoh", "a", 624, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting Wifi connections because WifiHotspot is not available.");
                return false;
            } else {
                try {
                    ulu.a();
                    ServerSocket serverSocket = new ServerSocket();
                    serverSocket.bind(new InetSocketAddress(this.g.c, 0));
                    this.g.e = serverSocket.getLocalPort();
                    new unp(this, 9, serverSocket, too).start();
                    this.h = serverSocket;
                    jjg jjg = ulh.a;
                    String str = this.g.a;
                    return true;
                } catch (IOException e2) {
                    anih anih = (anih) ulh.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("uoh", "a", 645, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting Wifi connections.");
                    return false;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r18, defpackage.tfw r19) {
        /*
            r17 = this;
            r1 = r17
            r17.j()
            monitor-enter(r17)
            boolean r0 = r17.b()     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "uoh"
            r5 = 0
            if (r0 == 0) goto L_0x0030
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r6 = 307(0x133, float:4.3E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r6, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Refusing to start a Wifi hotspot because we're already hosting a Wifi hotspot with SSID %s."
            unu r3 = r17.c()     // Catch:{ all -> 0x0274 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0274 }
            r0.a((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r5
        L_0x0030:
            boolean r0 = r17.a()     // Catch:{ all -> 0x0274 }
            if (r0 != 0) goto L_0x004d
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r6 = 315(0x13b, float:4.41E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r6, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Failed to start a Wifi hotspot because WifiHotspot is not available."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r5
        L_0x004d:
            aymi r0 = defpackage.aymi.a     // Catch:{ all -> 0x0274 }
            aymj r0 = r0.a()     // Catch:{ all -> 0x0274 }
            boolean r0 = r0.aP()     // Catch:{ all -> 0x0274 }
            r6 = 1
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "uoh"
            java.lang.String r7 = "a"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r9 = r17.d()     // Catch:{ all -> 0x0274 }
            if (r9 == 0) goto L_0x00cb
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.d()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 447(0x1bf, float:6.26E-43)
            anie r9 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            java.lang.String r10 = "Attempting to start a wifi direct hotspot."
            r9.a((java.lang.String) r10)     // Catch:{ all -> 0x0274 }
            unf r14 = new unf     // Catch:{ all -> 0x0274 }
            r14.<init>(r1)     // Catch:{ all -> 0x0274 }
            uog r9 = new uog     // Catch:{ all -> 0x0274 }
            android.content.Context r12 = r1.a     // Catch:{ all -> 0x0274 }
            android.net.wifi.p2p.WifiP2pManager r13 = r1.e     // Catch:{ all -> 0x0274 }
            android.net.wifi.WifiManager r15 = r1.c     // Catch:{ all -> 0x0274 }
            r11 = r9
            r16 = r18
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0274 }
            uru r10 = r1.f     // Catch:{ all -> 0x0274 }
            urt r10 = r10.b(r9)     // Catch:{ all -> 0x0274 }
            urt r11 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0274 }
            if (r10 == r11) goto L_0x00ae
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.c()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 463(0x1cf, float:6.49E-43)
            anie r0 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Unable to start Wifi Direct hotspot because registration failed"
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
            goto L_0x00e0
        L_0x00ae:
            unu r0 = r9.b     // Catch:{ all -> 0x0274 }
            r1.g = r0     // Catch:{ all -> 0x0274 }
            r1.k = r9     // Catch:{ all -> 0x0274 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r5 = 321(0x141, float:4.5E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Successfully started a Wifi Direct hotspot"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r6
        L_0x00cb:
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.d()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 443(0x1bb, float:6.21E-43)
            anie r0 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Wifi Direct is not supported."
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
        L_0x00e0:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r7 = 324(0x144, float:4.54E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Failed to start a Wifi Direct hotspot"
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
        L_0x00f5:
            aymi r0 = defpackage.aymi.a     // Catch:{ all -> 0x0274 }
            aymj r0 = r0.a()     // Catch:{ all -> 0x0274 }
            boolean r0 = r0.aO()     // Catch:{ all -> 0x0274 }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "uoh"
            java.lang.String r7 = "m"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r9 = p()     // Catch:{ all -> 0x0274 }
            if (r9 == 0) goto L_0x01a0
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.d()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 501(0x1f5, float:7.02E-43)
            anie r9 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            java.lang.String r10 = "Attempting to start a local only hotspot."
            r9.a((java.lang.String) r10)     // Catch:{ all -> 0x0274 }
            boolean r9 = defpackage.aymi.y()     // Catch:{ all -> 0x0274 }
            if (r9 == 0) goto L_0x0129
        L_0x0128:
            goto L_0x0130
        L_0x0129:
            boolean r9 = defpackage.jkr.h()     // Catch:{ all -> 0x0274 }
            if (r9 != 0) goto L_0x014e
            goto L_0x0128
        L_0x0130:
            upb r9 = r1.b     // Catch:{ all -> 0x0274 }
            boolean r9 = r9.b()     // Catch:{ all -> 0x0274 }
            if (r9 != 0) goto L_0x014e
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.c()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 510(0x1fe, float:7.15E-43)
            anie r0 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Failed to start a local-only hotspot because we failed to turn Wifi off before starting it up."
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
            goto L_0x01b5
        L_0x014e:
            aosh r9 = defpackage.aosh.f()     // Catch:{ all -> 0x0274 }
            unm r10 = new unm     // Catch:{ all -> 0x0274 }
            r10.<init>(r1, r9)     // Catch:{ all -> 0x0274 }
            unv r11 = new unv     // Catch:{ all -> 0x0274 }
            android.net.wifi.WifiManager r12 = r1.c     // Catch:{ all -> 0x0274 }
            r11.<init>(r12, r9, r10)     // Catch:{ all -> 0x0274 }
            urt r9 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0274 }
            uru r10 = r1.f     // Catch:{ all -> 0x0274 }
            urt r10 = r10.b(r11)     // Catch:{ all -> 0x0274 }
            if (r9 == r10) goto L_0x0183
            upb r9 = r1.b     // Catch:{ all -> 0x0274 }
            r9.a()     // Catch:{ all -> 0x0274 }
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.c()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 549(0x225, float:7.7E-43)
            anie r0 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Unable to start the Local only hotspot because registration failed."
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
            goto L_0x01b5
        L_0x0183:
            r1.i = r11     // Catch:{ all -> 0x0274 }
            unu r0 = r11.a     // Catch:{ all -> 0x0274 }
            r1.g = r0     // Catch:{ all -> 0x0274 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r5 = 330(0x14a, float:4.62E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Successfully started a local only hotspot"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r6
        L_0x01a0:
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r9 = r9.d()     // Catch:{ all -> 0x0274 }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x0274 }
            r10 = 497(0x1f1, float:6.96E-43)
            anie r0 = r9.a((java.lang.String) r0, (java.lang.String) r7, (int) r10, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Local only hotspot is not supported."
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
        L_0x01b5:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r7 = 333(0x14d, float:4.67E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r7, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r7 = "Failed to start a local only hotspot"
            r0.a((java.lang.String) r7)     // Catch:{ all -> 0x0274 }
        L_0x01ca:
            aymi r0 = defpackage.aymi.a     // Catch:{ all -> 0x0274 }
            aymj r0 = r0.a()     // Catch:{ all -> 0x0274 }
            boolean r0 = r0.aQ()     // Catch:{ all -> 0x0274 }
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = "uoh"
            java.lang.String r7 = "a"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            upb r9 = r1.b     // Catch:{ all -> 0x0274 }
            boolean r9 = r9.b()     // Catch:{ all -> 0x0274 }
            if (r9 != 0) goto L_0x01fa
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r6 = r6.c()     // Catch:{ all -> 0x0274 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0274 }
            r9 = 389(0x185, float:5.45E-43)
            anie r0 = r6.a((java.lang.String) r0, (java.lang.String) r7, (int) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r6 = "Failed to start a Wifi AP because we failed to turn Wifi off before starting it up."
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x0274 }
            goto L_0x0248
        L_0x01fa:
            uoa r9 = new uoa     // Catch:{ all -> 0x0274 }
            android.content.Context r10 = r1.a     // Catch:{ all -> 0x0274 }
            android.net.wifi.WifiManager r11 = r1.c     // Catch:{ all -> 0x0274 }
            android.net.ConnectivityManager r12 = r1.d     // Catch:{ all -> 0x0274 }
            r13 = r19
            r9.<init>(r10, r11, r12, r13)     // Catch:{ all -> 0x0274 }
            urt r10 = defpackage.urt.SUCCESS     // Catch:{ all -> 0x0274 }
            uru r11 = r1.f     // Catch:{ all -> 0x0274 }
            urt r11 = r11.b(r9)     // Catch:{ all -> 0x0274 }
            if (r10 != r11) goto L_0x022e
            unu r0 = r9.b     // Catch:{ all -> 0x0274 }
            r1.g = r0     // Catch:{ all -> 0x0274 }
            r1.j = r9     // Catch:{ all -> 0x0274 }
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r5 = 339(0x153, float:4.75E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r5, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Successfully started a Wifi SoftAP hotspot"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r6
        L_0x022e:
            upb r6 = r1.b     // Catch:{ all -> 0x0274 }
            r6.a()     // Catch:{ all -> 0x0274 }
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r6 = r6.c()     // Catch:{ all -> 0x0274 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0274 }
            r9 = 400(0x190, float:5.6E-43)
            anie r0 = r6.a((java.lang.String) r0, (java.lang.String) r7, (int) r9, (java.lang.String) r8)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r6 = "Unable to start a Soft AP Wifi Hotspot because registration failed."
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x0274 }
        L_0x0248:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.d()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r6 = 342(0x156, float:4.79E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r6, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r6 = "Failed to start a Wifi SoftAP hotspot"
            r0.a((java.lang.String) r6)     // Catch:{ all -> 0x0274 }
        L_0x025d:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x0274 }
            anie r0 = r0.b()     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            r6 = 346(0x15a, float:4.85E-43)
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r6, (java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0274 }
            java.lang.String r2 = "Failed to start a Wifi hotspot"
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x0274 }
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            return r5
        L_0x0274:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0274 }
            goto L_0x0278
        L_0x0277:
            throw r0
        L_0x0278:
            goto L_0x0277
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoh.a(boolean, tfw):boolean");
    }
}
