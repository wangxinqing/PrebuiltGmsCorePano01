package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* renamed from: uoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uoz {
    public final uru a;
    private final Context b;
    private final WifiManager c;
    private final ConnectivityManager d;
    private final thc e;
    private final Map f = new nz();
    private final Map g = new nz();
    private final Map h = new nz();
    private final Map i = new nz();
    private final Map j = new nz();
    private final aoru k = tid.b();
    private final uwg l;

    public uoz(Context context, uru uru) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = uru;
        this.c = (WifiManager) applicationContext.getSystemService("wifi");
        this.d = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.e = new thc(this.b);
        this.l = new uwg(this.b, this.c);
    }

    public static void a(WifiManager wifiManager, InetAddress inetAddress, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (wifiManager.isTdlsSupported()) {
            wifiManager.setTdlsEnabled(inetAddress, z);
        }
    }

    public static boolean c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                if (networkInterfaces.nextElement().supportsMulticast()) {
                    return true;
                }
            }
            return false;
        } catch (SocketException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("uoz", "c", 717, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to query networks for multicast support.");
            return false;
        }
    }

    public static String h(String str) {
        return String.format("_%s._tcp.local", new Object[]{i(str)});
    }

    private static String i(String str) {
        return jjp.d(ulu.a(str.getBytes(), 6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r2.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            aymi r0 = defpackage.aymi.a
            aymj r0 = r0.a()
            boolean r0 = r0.aL()
            if (r0 == 0) goto L_0x0032
            android.content.Context r0 = r2.b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.wifi"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x0032
            android.net.wifi.WifiManager r0 = r2.c
            if (r0 == 0) goto L_0x0032
            android.net.ConnectivityManager r0 = r2.d
            if (r0 == 0) goto L_0x0032
            boolean r0 = a((android.net.ConnectivityManager) r0)
            if (r0 == 0) goto L_0x0032
            uwg r0 = r2.l
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0032
            r0 = 1
            return r0
        L_0x0032:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoz.b():boolean");
    }

    public final synchronized void d(String str) {
        if (!e(str)) {
            ((anih) ((anih) ulh.a.d()).a("uoz", "d", 409, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop LAN advertising because we're not currently advertising.");
            return;
        }
        this.a.c((urq) this.h.remove(str));
        ((anih) ((anih) ulh.a.d()).a("uoz", "d", 414, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped Wifi LAN advertising.");
    }

    public final synchronized boolean e(String str) {
        return this.h.containsKey(str);
    }

    public final synchronized void f(String str) {
        if (g(str)) {
            this.a.c((urq) this.i.remove(str));
            this.j.remove(str);
            ((anih) ((anih) ulh.a.d()).a("uoz", "f", 593, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped Wifi LAN discovery.");
        }
    }

    public final synchronized boolean g(String str) {
        return this.i.containsKey(str);
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        int i2 = Build.VERSION.SDK_INT;
        for (Network networkInfo : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(networkInfo);
            if (networkInfo2 != null && networkInfo2.getType() == 1 && networkInfo2.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized uwh a(NsdServiceInfo nsdServiceInfo, tfw tfw) {
        if (nsdServiceInfo == null) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 635, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to remote Wifi device because serviceInfo is null.");
            return null;
        }
        return a(nsdServiceInfo.getHost(), nsdServiceInfo.getPort(), tfw);
    }

    public final synchronized uou c(String str) {
        return (uou) this.g.get(str);
    }

    public final synchronized uwh a(InetAddress inetAddress, int i2, tfw tfw) {
        if (inetAddress == null) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 647, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to remote Wifi device because ipAddress is null.");
            return null;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("uoz", "a", 652, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to remote Wifi device %s because Wifi LAN is not available.", (Object) inetAddress);
            return null;
        } else {
            uot uot = new uot(this.c, inetAddress, i2, tfw);
            if (urt.SUCCESS != this.a.b(uot)) {
                this.l.a();
                ((anih) ((anih) ulh.a.c()).a("uoz", "a", 662, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create client Wifi socket because we failed to register the MediumOperation.");
                return null;
            }
            uwh uwh = uot.c;
            uwh.a(new uoi(this, uot));
            return uwh;
        }
    }

    public final synchronized boolean b(String str) {
        return this.f.containsKey(str);
    }

    public final synchronized void a() {
        tid.a(this.k, "WifiLan.singleThreadOffloader");
        Iterator it = new ob((Collection) this.i.keySet()).iterator();
        while (it.hasNext()) {
            f((String) it.next());
        }
        Iterator it2 = new ob((Collection) this.h.keySet()).iterator();
        while (it2.hasNext()) {
            d((String) it2.next());
        }
        Iterator it3 = new ob((Collection) this.f.keySet()).iterator();
        while (it3.hasNext()) {
            a((String) it3.next());
        }
    }

    public final void a(Runnable runnable) {
        this.k.execute(runnable);
    }

    public final synchronized void a(String str) {
        anih anih;
        String str2;
        if (!b(str)) {
            ((anih) ((anih) ulh.a.d()).a("uoz", "a", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting Wifi connections because it was never started.");
            return;
        }
        try {
            ((ServerSocket) this.f.remove(str)).close();
            this.g.remove(str);
            anih = (anih) ((anih) ulh.a.d()).a("uoz", "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            str2 = "Stopped listening for incoming Wifi Lan connections.";
        } catch (IOException e2) {
            try {
                anih anih2 = (anih) ulh.a.b();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("uoz", "a", 345, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close existing Wifi server socket.");
                this.g.remove(str);
                anih = (anih) ((anih) ulh.a.d()).a("uoz", "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                str2 = "Stopped listening for incoming Wifi Lan connections.";
            } catch (Throwable th) {
                this.g.remove(str);
                ((anih) ((anih) ulh.a.d()).a("uoz", "a", 350, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped listening for incoming Wifi Lan connections.");
                throw th;
            }
        }
        anih.a(str2);
    }

    public final synchronized void a(String str, MdnsServiceInfo mdnsServiceInfo, tow tow) {
        String h2 = h(str);
        String str2 = mdnsServiceInfo.a;
        if (str2 == null) {
            ((anih) ((anih) ulh.a.c()).a("uoz", "a", 482, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi LAN discovered service with null service name. Ignoring.");
            return;
        }
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str2);
        nsdServiceInfo.setServiceType(h2);
        nsdServiceInfo.setPort(mdnsServiceInfo.d);
        for (Map.Entry entry : Collections.unmodifiableMap(mdnsServiceInfo.h).entrySet()) {
            nsdServiceInfo.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        String str3 = mdnsServiceInfo.e;
        if (str3 == null) {
            String str4 = mdnsServiceInfo.f;
            if (str4 != null) {
                try {
                    nsdServiceInfo.setHost(InetAddress.getByName(str4));
                } catch (UnknownHostException e2) {
                    anih anih = (anih) ulh.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("uoz", "a", 505, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discovered %s over Wifi LAN, but with no attached ip address", (Object) str2);
                    return;
                }
            } else {
                ((anih) ((anih) ulh.a.d()).a("uoz", "a", 510, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discovered %s over Wifi LAN, but with no attached ip address", (Object) str2);
                return;
            }
        } else {
            try {
                nsdServiceInfo.setHost(InetAddress.getByName(str3));
            } catch (UnknownHostException e3) {
                anih anih2 = (anih) ulh.a.c();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("uoz", "a", 497, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discovered %s over Wifi LAN, but with no attached ip address", (Object) str2);
                return;
            }
        }
        if (nsdServiceInfo.getServiceType().contains(h2)) {
            if (e(str)) {
                if (((uor) this.h.get(str)).a.getServiceName().equals(nsdServiceInfo.getServiceName())) {
                    ((anih) ((anih) ulh.a.d()).a("uoz", "a", 524, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi LAN discovered service %s, but that's us. Ignoring.", (Object) str2);
                    return;
                }
            }
            ((anih) ((anih) ulh.a.d()).a("uoz", "a", 529, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Found service %s on Wifi LAN.", (Object) str2);
            uov uov = (uov) this.j.get(str);
            if (uov == null) {
                ((anih) ((anih) ulh.a.c()).a("uoz", "a", 532, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi LAN discovered service %s but service tracker does not exist. Ignoring.", (Object) str2);
                return;
            }
            this.l.b();
            uov.a.put(str2, nsdServiceInfo);
            tpy tpy = tow.a;
            tpy.d.a((Runnable) new tpw(tpy, nsdServiceInfo));
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uoz", "a", 516, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi LAN discovered service %s with service type %s, but was looking for services with service type %s.", (Object) str2, (Object) nsdServiceInfo.getServiceType(), (Object) h2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r6, java.lang.String r7, defpackage.tow r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 == 0) goto L_0x006c
            java.util.Map r0 = r5.j     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x006e }
            uov r6 = (defpackage.uov) r6     // Catch:{ all -> 0x006e }
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r1 = "a"
            java.lang.String r2 = "uoz"
            if (r6 != 0) goto L_0x002a
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x006e }
            anie r6 = r6.d()     // Catch:{ all -> 0x006e }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x006e }
            r8 = 554(0x22a, float:7.76E-43)
            anie r6 = r6.a((java.lang.String) r2, (java.lang.String) r1, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x006e }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x006e }
            java.lang.String r8 = "Ignoring Wifi LAN lost event for service %s because we're no longer scanning."
            r6.a((java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ all -> 0x006e }
            monitor-exit(r5)
            return
        L_0x002a:
            java.util.Map r6 = r6.a     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r6.remove(r7)     // Catch:{ all -> 0x006e }
            android.net.nsd.NsdServiceInfo r6 = (android.net.nsd.NsdServiceInfo) r6     // Catch:{ all -> 0x006e }
            if (r6 == 0) goto L_0x0057
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x006e }
            anie r3 = r3.d()     // Catch:{ all -> 0x006e }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x006e }
            r4 = 567(0x237, float:7.95E-43)
            anie r0 = r3.a((java.lang.String) r2, (java.lang.String) r1, (int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x006e }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "Lost service %s on Wifi LAN."
            r0.a((java.lang.String) r1, (java.lang.Object) r7)     // Catch:{ all -> 0x006e }
            tpy r7 = r8.a     // Catch:{ all -> 0x006e }
            tql r8 = r7.d     // Catch:{ all -> 0x006e }
            tpx r0 = new tpx     // Catch:{ all -> 0x006e }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x006e }
            r8.a((java.lang.Runnable) r0)     // Catch:{ all -> 0x006e }
            monitor-exit(r5)
            return
        L_0x0057:
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x006e }
            anie r6 = r6.d()     // Catch:{ all -> 0x006e }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x006e }
            r8 = 562(0x232, float:7.88E-43)
            anie r6 = r6.a((java.lang.String) r2, (java.lang.String) r1, (int) r8, (java.lang.String) r0)     // Catch:{ all -> 0x006e }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x006e }
            java.lang.String r8 = "Wifi LAN lost %s but it was never reported as found."
            r6.a((java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r5)
            return
        L_0x006e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoz.a(java.lang.String, java.lang.String, tow):void");
    }

    public final void a(InetAddress inetAddress, boolean z) {
        a(this.c, inetAddress, z);
    }

    public final synchronized void a(urq urq) {
        this.a.c(urq);
    }

    public final synchronized boolean a(String str, NsdServiceInfo nsdServiceInfo) {
        if (str == null || nsdServiceInfo == null) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 365, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to advertise over the local area network because a null serviceId and/or serviceName was passed in.");
            return false;
        } else if (e(str)) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 372, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to advertise over the local area network because we're already advertising.");
            return false;
        } else if (b(str)) {
            nsdServiceInfo.setServiceType(String.format("_%s._tcp", new Object[]{i(str)}));
            nsdServiceInfo.setPort(((ServerSocket) this.f.get(str)).getLocalPort());
            uor uor = new uor(this.b, this.d, this.e, nsdServiceInfo);
            if (urt.FAILURE == this.a.b(uor)) {
                jjg jjg = ulh.a;
                return false;
            }
            this.h.put(str, uor);
            ((anih) ((anih) ulh.a.d()).a("uoz", "a", 401, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully advertised %s on serviceID %s over Wifi LAN.", (Object) nsdServiceInfo.getServiceName(), (Object) str);
            return true;
        } else {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 378, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't advertise over the local area network because we're not accepting connections.");
            return false;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0153=Splitter:B:64:0x0153, B:46:0x00fa=Splitter:B:46:0x00fa} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r12, defpackage.top r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "uoz"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r3 = 0
            if (r12 != 0) goto L_0x000c
            goto L_0x0153
        L_0x000c:
            if (r13 == 0) goto L_0x0153
            boolean r4 = r11.b(r12)     // Catch:{ all -> 0x016a }
            if (r4 == 0) goto L_0x002b
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r12 = r12.b()     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            r13 = 225(0xe1, float:3.15E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Refusing to start accepting Wifi connections because another Wifi server is already in-progress."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
            monitor-exit(r11)
            return r3
        L_0x002b:
            boolean r4 = r11.b()     // Catch:{ all -> 0x016a }
            if (r4 != 0) goto L_0x0048
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r12 = r12.d()     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            r13 = 233(0xe9, float:3.27E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Can't start accepting Wifi connections because Wifi LAN is not available."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
            monitor-exit(r11)
            return r3
        L_0x0048:
            defpackage.ulu.a()     // Catch:{ all -> 0x016a }
            java.net.ServerSocket r9 = new java.net.ServerSocket     // Catch:{ IOException -> 0x0135 }
            r9.<init>()     // Catch:{ IOException -> 0x0135 }
            android.net.wifi.WifiManager r4 = r11.c     // Catch:{ IOException -> 0x0135 }
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ IOException -> 0x0135 }
            int r4 = r4.getIpAddress()     // Catch:{ IOException -> 0x0135 }
            if (r4 != 0) goto L_0x009f
            java.util.Enumeration r4 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ IOException -> 0x0135 }
            java.util.ArrayList r4 = java.util.Collections.list(r4)     // Catch:{ IOException -> 0x0135 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0135 }
        L_0x0068:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x0135 }
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x0135 }
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch:{ IOException -> 0x0135 }
            java.util.Enumeration r5 = r5.getInetAddresses()     // Catch:{ IOException -> 0x0135 }
            java.util.ArrayList r5 = java.util.Collections.list(r5)     // Catch:{ IOException -> 0x0135 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0135 }
        L_0x0080:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0135 }
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0135 }
            java.net.InetAddress r6 = (java.net.InetAddress) r6     // Catch:{ IOException -> 0x0135 }
            boolean r7 = r6.isLoopbackAddress()     // Catch:{ IOException -> 0x0135 }
            if (r7 != 0) goto L_0x0080
            boolean r7 = r6 instanceof java.net.Inet4Address     // Catch:{ IOException -> 0x0135 }
            if (r7 == 0) goto L_0x0080
            goto L_0x00a4
        L_0x0097:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ IOException -> 0x0135 }
            java.lang.String r13 = "Failed to find my own IPv4 address."
            r12.<init>(r13)     // Catch:{ IOException -> 0x0135 }
            throw r12     // Catch:{ IOException -> 0x0135 }
        L_0x009f:
            java.net.InetAddress r4 = defpackage.ulu.c(r4)     // Catch:{ IOException -> 0x0135 }
            r6 = r4
        L_0x00a4:
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0135 }
            r4.<init>(r6, r3)     // Catch:{ IOException -> 0x0135 }
            r9.bind(r4)     // Catch:{ IOException -> 0x0135 }
            java.net.InetAddress r4 = r9.getInetAddress()     // Catch:{ all -> 0x016a }
            if (r4 == 0) goto L_0x00fa
            java.net.InetAddress r4 = r9.getInetAddress()     // Catch:{ all -> 0x016a }
            boolean r4 = r4.isLoopbackAddress()     // Catch:{ all -> 0x016a }
            if (r4 == 0) goto L_0x00bd
            goto L_0x00fa
        L_0x00bd:
            uon r10 = new uon     // Catch:{ all -> 0x016a }
            r5 = 9
            r3 = r10
            r4 = r11
            r7 = r9
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x016a }
            r10.start()     // Catch:{ all -> 0x016a }
            java.util.Map r13 = r11.f     // Catch:{ all -> 0x016a }
            r13.put(r12, r9)     // Catch:{ all -> 0x016a }
            java.util.Map r13 = r11.g     // Catch:{ all -> 0x016a }
            java.net.InetAddress r3 = r9.getInetAddress()     // Catch:{ all -> 0x016a }
            int r4 = r9.getLocalPort()     // Catch:{ all -> 0x016a }
            ujd r5 = new ujd     // Catch:{ all -> 0x016a }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x016a }
            r13.put(r12, r5)     // Catch:{ all -> 0x016a }
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r12 = r12.d()     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            r13 = 318(0x13e, float:4.46E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Successfully started listening for incoming Wifi Lan connections."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
            r12 = 1
            monitor-exit(r11)
            return r12
        L_0x00fa:
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r12 = r12.b()     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            r13 = 256(0x100, float:3.59E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            if (r6 == 0) goto L_0x010f
            java.lang.String r13 = "the IP address is a loopback address. (The Server Socket's security manager has denied access to the real IP address.)"
            goto L_0x0111
        L_0x010f:
            java.lang.String r13 = "the IP address is unknown (the socket is not bound)."
        L_0x0111:
            java.lang.String r4 = "Unable to start accepting Wifi connections because %s"
            r12.a((java.lang.String) r4, (java.lang.Object) r13)     // Catch:{ all -> 0x016a }
            r9.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x0133
        L_0x011a:
            r12 = move-exception
            jjg r13 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r13 = r13.b()     // Catch:{ all -> 0x016a }
            anih r13 = (defpackage.anih) r13     // Catch:{ all -> 0x016a }
            r13.a((java.lang.Throwable) r12)     // Catch:{ all -> 0x016a }
            r12 = 265(0x109, float:3.71E-43)
            anie r12 = r13.a((java.lang.String) r0, (java.lang.String) r1, (int) r12, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Failed to close Wifi server socket."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
        L_0x0133:
            monitor-exit(r11)
            return r3
        L_0x0135:
            r12 = move-exception
            jjg r13 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r13 = r13.b()     // Catch:{ all -> 0x016a }
            anih r13 = (defpackage.anih) r13     // Catch:{ all -> 0x016a }
            r13.a((java.lang.Throwable) r12)     // Catch:{ all -> 0x016a }
            r12 = 249(0xf9, float:3.49E-43)
            anie r12 = r13.a((java.lang.String) r0, (java.lang.String) r1, (int) r12, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Failed to start accepting Wifi connections over LAN."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
            defpackage.ulu.b()     // Catch:{ all -> 0x016a }
            monitor-exit(r11)
            return r3
        L_0x0153:
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x016a }
            anie r12 = r12.b()     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            r13 = 218(0xda, float:3.05E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r1, (int) r13, (java.lang.String) r2)     // Catch:{ all -> 0x016a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x016a }
            java.lang.String r13 = "Refusing to start accepting Wifi connections because serviceId and/or acceptedConnectionCallback is null."
            r12.a((java.lang.String) r13)     // Catch:{ all -> 0x016a }
            monitor-exit(r11)
            return r3
        L_0x016a:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x016e
        L_0x016d:
            throw r12
        L_0x016e:
            goto L_0x016d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uoz.a(java.lang.String, top):boolean");
    }

    public final synchronized boolean a(String str, tow tow) {
        if (str == null || tow == null) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 424, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to discover over the local area network because serviceId or discoveredServiceCallback was null.");
            return false;
        } else if (g(str)) {
            ((anih) ((anih) ulh.a.b()).a("uoz", "a", 431, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to discover over the local area network because we're already discovering.");
            return false;
        } else {
            uoy uoy = new uoy(this.b, this.d, new uow(this, str, tow), str);
            if (urt.FAILURE == this.a.b(uoy)) {
                jjg jjg = ulh.a;
                return false;
            }
            this.i.put(str, uoy);
            this.j.put(str, new uov());
            return true;
        }
    }
}
