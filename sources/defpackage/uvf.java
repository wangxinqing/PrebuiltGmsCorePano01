package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.WifiAwareManager;
import android.net.wifi.aware.WifiAwareNetworkSpecifier;
import android.os.Build;
import com.android.volley.toolbox.ImageRequest;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: uvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uvf {
    public final ConnectivityManager a;
    public final uuy b;
    public final uts c;
    public final Map d = new nz();
    public final Map e = new nz();
    public final Map f = new nz();
    private final Context g;
    private final aoru h = tid.b();
    private final WifiAwareManager i;
    private final uvp j;
    private final uru k;
    private final Map l = new nz();
    private final Map m = new nz();
    private final Map n = new nz();
    private final Map o = new nz();

    public uvf(Context context, uts uts, uvp uvp, uru uru) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.c = uts;
        this.j = uvp;
        this.k = uru;
        this.a = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 26) {
            this.i = (WifiAwareManager) this.g.getSystemService("wifiaware");
        } else {
            ((anih) ((anih) ulh.a.d()).a("uvf", "<init>", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve WifiAwareManager, WiFi Aware is unsupported.");
            this.i = null;
        }
        this.b = new uuy(this.i, this.g);
        uts.a((Runnable) new uuj(this));
    }

    private final int a(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        try {
            return aoog.a((byte[]) list.get(0));
        } catch (IllegalArgumentException e2) {
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvf", "a", 478, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse version from match filter %s", (Object) ulu.a((byte[]) list.get(0)));
            return 0;
        }
    }

    private final boolean c(uvy uvy) {
        return this.d.containsKey(uvy);
    }

    public static String f(String str) {
        return jhy.d(str.getBytes()).replace('_', '.');
    }

    public final synchronized void b(String str) {
        if (!a(str)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "b", 340, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop WiFi Aware publishing because it was never started.");
        } else {
            this.k.c((urq) this.l.remove(str));
        }
    }

    public final synchronized void d(String str) {
        if (!c(str)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "d", 500, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop WiFi Aware subscribing because it was never started.");
        } else {
            this.k.c((urq) this.m.remove(str));
        }
    }

    public final byte[] d() {
        return this.b.c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        ((anih) ((anih) ulh.a.d()).a("uvf", "e", 254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("All DiscoverySessions are closed. Closing WifiAwareSession.");
        this.b.b();
    }

    public final synchronized void c() {
        this.c.c();
        this.c.b();
    }

    public final synchronized void e(String str) {
        this.c.b(str);
        this.c.a(str);
    }

    public final synchronized void b(uvy uvy) {
        if (!c(uvy)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "b", 816, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't disconnect from %s because we are not connected to that peer.", (Object) uvy);
            return;
        }
        try {
            this.a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.d.get(uvy));
        } catch (IllegalArgumentException e2) {
        }
        this.c.d(uvy.c);
        ServerSocket serverSocket = (ServerSocket) this.o.remove(uvy);
        if (serverSocket != null) {
            ulu.a(serverSocket, "WifiAwareImpl", "listeningSocket");
            ulu.b();
        }
        this.d.remove(uvy);
        this.e.remove(uvy);
        this.f.remove(uvy);
        ((anih) ((anih) ulh.a.d()).a("uvf", "b", 838, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disconnected from WiFi Aware network with %s.", (Object) uvy);
    }

    public final synchronized boolean c(String str) {
        return this.m.containsKey(str);
    }

    private final int a(uvy uvy, uue uue, tfw tfw) {
        ulu.a();
        Callable callable = uul.a;
        arzi arzi = new arzi(aymi.S());
        arzi.a = tfw.c();
        ServerSocket serverSocket = (ServerSocket) arzk.a(callable, "BindWifiAwareServerSocket", arzi.a());
        if (serverSocket == null) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 631, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to host WiFi Aware server socket.");
            return 0;
        }
        ((anih) ((anih) ulh.a.d()).a("uvf", "a", 635, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully hosted WiFi Aware server socket.");
        new uut(this, 9, serverSocket, uvy, uue).start();
        this.o.put(uvy, serverSocket);
        return serverSocket.getLocalPort();
    }

    public final boolean b() {
        return aymi.a.a().aI() && jkr.g() && this.g.getPackageManager().hasSystemFeature("android.hardware.wifi.aware") && this.a != null && this.i != null;
    }

    private final NetworkSpecifier a(uvy uvy, String str) {
        if (jkr.h()) {
            WifiAwareNetworkSpecifier.Builder builder = new WifiAwareNetworkSpecifier.Builder(uvy.c, uvy.a);
            if (str != null) {
                builder.setPskPassphrase(str);
                ServerSocket serverSocket = (ServerSocket) this.o.get(uvy);
                if (serverSocket != null) {
                    builder.setPort(serverSocket.getLocalPort());
                }
            }
            return builder.build();
        } else if (str == null) {
            return uvy.c.createNetworkSpecifierOpen(uvy.a);
        } else {
            return uvy.c.createNetworkSpecifierPassphrase(uvy.a, str);
        }
    }

    private static Inet6Address a(LinkProperties linkProperties) {
        Inet6Address inet6Address;
        try {
            NetworkInterface byName = NetworkInterface.getByName(linkProperties.getInterfaceName());
            if (byName == null) {
                ((anih) ((anih) ulh.a.b()).a("uvf", "a", 881, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get WiFi Aware NetworkInterface");
                return null;
            }
            Enumeration<InetAddress> inetAddresses = byName.getInetAddresses();
            while (true) {
                if (!inetAddresses.hasMoreElements()) {
                    inet6Address = null;
                    break;
                }
                InetAddress nextElement = inetAddresses.nextElement();
                if (nextElement instanceof Inet6Address) {
                    inet6Address = (Inet6Address) nextElement;
                    if (inet6Address.isLinkLocalAddress()) {
                        break;
                    }
                }
            }
            if (inet6Address != null) {
                return inet6Address;
            }
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 887, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to find link-local IPv6 address");
            return null;
        } catch (SocketException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvf", "a", 876, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse the NetworkInterface");
            return null;
        }
    }

    private static boolean a(urt urt) {
        urt urt2 = urt.UNKNOWN;
        int ordinal = urt.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", new Object[]{urt}));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final synchronized InetSocketAddress a(uvy uvy) {
        return this.f.containsKey(uvy) ? ((uuz) this.f.get(uvy)).b() : null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ uvz a(uvy uvy, InetSocketAddress inetSocketAddress) {
        ulu.a();
        Socket socket = new Socket();
        ((Network) this.e.get(uvy)).bindSocket(socket);
        socket.connect(inetSocketAddress, (int) aymi.a.a().bb());
        ((anih) ((anih) ulh.a.d()).a("uvf", "a", 796, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully connected to a socket on a WiFi Aware network.");
        uvz uvz = new uvz(socket);
        uvz.a(new uuo(this, uvy));
        return uvz;
    }

    public final synchronized uvz a(uvy uvy, InetSocketAddress inetSocketAddress, tfw tfw) {
        if (!c(uvy)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 774, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to %s for %s because we are not connected to a WiFi Aware network.", (Object) inetSocketAddress, (Object) uvy);
            return null;
        } else if (!this.e.containsKey(uvy)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 781, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to %s for %s because we did not join a remote WiFi Aware network.", (Object) inetSocketAddress, (Object) uvy);
            return null;
        } else {
            uun uun = new uun(this, uvy, inetSocketAddress);
            arzi arzi = new arzi(aymi.S());
            arzi.a = tfw.c();
            return (uvz) arzk.a((Callable) uun, "ConnectWifiAwareSocket", arzi.a());
        }
    }

    public final synchronized void a() {
        tid.a(this.h, "WifiAwareImpl.singleThreadOffloader");
        Iterator it = new ob((Collection) this.l.keySet()).iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
        Iterator it2 = new ob((Collection) this.m.keySet()).iterator();
        while (it2.hasNext()) {
            d((String) it2.next());
        }
        Iterator it3 = new ob((Collection) this.d.keySet()).iterator();
        while (it3.hasNext()) {
            b((uvy) it3.next());
        }
        this.c.a();
        this.b.b();
    }

    public final synchronized void a(LinkProperties linkProperties, int i2, uue uue) {
        Inet6Address a2 = a(linkProperties);
        if (a2 == null) {
            ((anih) ((anih) ulh.a.c()).a("uvf", "a", 600, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to obtain our own local IP address despite forming a WiFi Aware network.");
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uvf", "a", 605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received a WiFi Aware ip address (%s).", (Object) a2);
        uue uue2 = uue;
        uue.c.a((Runnable) new uuc(uue2, uue.a, a2.getHostAddress(), i2, uue.b));
    }

    public final synchronized void a(DiscoverySession discoverySession, PeerHandle peerHandle, String str, byte[] bArr, List list, umo umo) {
        byte[] bArr2;
        uve uve = (uve) this.m.get(str);
        if ((uve != null ? uve.c : null) == discoverySession) {
            int i2 = 0;
            if (!list.isEmpty()) {
                try {
                    i2 = aoog.a((byte[]) list.get(0));
                } catch (IllegalArgumentException e2) {
                    anih anih = (anih) ulh.a.d();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("uvf", "a", 478, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse version from match filter %s", (Object) ulu.a((byte[]) list.get(0)));
                }
            }
            if (i2 == 1) {
                if (list.size() < 2) {
                    bArr2 = new byte[2];
                } else {
                    bArr2 = (byte[]) list.get(1);
                    if (bArr2 == null) {
                        bArr2 = new byte[2];
                    }
                }
                uvy uvy = new uvy(peerHandle, str, discoverySession, bArr2);
                if (bArr.length > 0) {
                    jjg jjg = ulh.a;
                    ulu.a(bArr);
                    ulu.a(bArr2);
                    this.c.a(discoverySession, uvy);
                    umo.a.a.a(uvy, bArr);
                    this.n.put(Short.valueOf(aoom.a(bArr2)), uvy);
                } else {
                    jjg jjg2 = ulh.a;
                    ulu.a(bArr);
                    ulu.a(bArr2);
                    uvy uvy2 = (uvy) this.n.remove(Short.valueOf(aoom.a(bArr2)));
                    if (uvy2 != null) {
                        this.c.b(discoverySession, uvy2);
                        umo.a.a.a(uvy2);
                    }
                }
                ((anih) ((anih) ulh.a.d()).a("uvf", "a", 464, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Processed discovered WifiAwarePeer");
                return;
            }
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 427, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Discovered a remote WiFi Aware advertisement with unknown version %d. Ignoring.", i2);
            return;
        }
        jjg jjg3 = ulh.a;
        ulu.a(bArr);
    }

    public final void a(Runnable runnable) {
        this.h.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(uvy uvy, NetworkRequest networkRequest) {
        try {
            aosh f2 = aosh.f();
            uuu uuu = new uuu(f2, uvy);
            this.a.requestNetwork(networkRequest, uuu, ((int) aymi.a.a().bc()) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            uuz uuz = (uuz) f2.get();
            this.d.put(uvy, uuu);
            this.e.put(uvy, uuz.a());
            this.f.put(uvy, uuz);
            this.c.c(uvy.c);
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 746, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully joined a WiFi Aware network.");
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final synchronized boolean a(String str) {
        return this.l.containsKey(str);
    }

    public final synchronized boolean a(String str, umo umo) {
        if (str == null || umo == null) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start WiFi Aware subscribing because one of serviceId or discoveredPeerCallback is null.");
            return false;
        } else if (c(str)) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start WiFi Aware subscribing because we're already subscribed.");
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 367, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware subscribing because WiFi Aware is unavailable.");
            return false;
        } else {
            uve uve = new uve(this.b, str, this.j, this.c, new uuk(this, str, umo));
            if (!a(this.k.b(uve))) {
                ((anih) ((anih) ulh.a.b()).a("uvf", "a", 393, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware subscribing because the MediumOperation failed to register.");
                return false;
            }
            this.m.put(str, uve);
            return true;
        }
    }

    public final synchronized boolean a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 301, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start WiFi Aware publishing because one of serviceId or serviceInfo is null.");
            return false;
        } else if (a(str)) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 308, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start WiFi Aware publishing because we're already publishing.");
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.b()).a("uvf", "a", 314, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware publishing because WiFi Aware is unavailable.");
            return false;
        } else {
            uvb uvb = new uvb(this.b, str, bArr, this.j, this.c);
            if (!a(this.k.b(uvb))) {
                ((anih) ((anih) ulh.a.b()).a("uvf", "a", 328, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware publishing because the MediumOperation failed to register.");
                return false;
            }
            this.l.put(str, uvb);
            return true;
        }
    }

    public final synchronized boolean a(uvy uvy, String str, tfw tfw) {
        if (c(uvy)) {
            ((anih) ((anih) ulh.a.d()).a("uvf", "a", 664, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't join a WiFi Aware network because we've already joined a network.");
            return false;
        }
        uum uum = new uum(this, uvy, new NetworkRequest.Builder().addTransportType(5).setNetworkSpecifier(a(uvy, str)).build());
        arzi arzi = new arzi(0);
        arzi.a = tfw.c();
        return arzk.a((Runnable) uum, "RequestWifiAwareNetwork", arzi.a());
    }

    public final synchronized boolean a(uvy uvy, String str, uue uue) {
        return a(uvy, str, uue, new tfw());
    }

    public final synchronized boolean a(uvy uvy, String str, uue uue, tfw tfw) {
        int i2;
        if (!c(uvy)) {
            ulu.a();
            Callable callable = uul.a;
            arzi arzi = new arzi(aymi.S());
            arzi.a = tfw.c();
            ServerSocket serverSocket = (ServerSocket) arzk.a(callable, "BindWifiAwareServerSocket", arzi.a());
            if (serverSocket == null) {
                ((anih) ((anih) ulh.a.b()).a("uvf", "a", 631, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to host WiFi Aware server socket.");
                i2 = 0;
            } else {
                ((anih) ((anih) ulh.a.d()).a("uvf", "a", 635, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully hosted WiFi Aware server socket.");
                new uut(this, 9, serverSocket, uvy, uue).start();
                this.o.put(uvy, serverSocket);
                i2 = serverSocket.getLocalPort();
            }
            if (i2 != 0) {
                NetworkRequest build = new NetworkRequest.Builder().addTransportType(5).setNetworkSpecifier(a(uvy, str)).build();
                uur uur = new uur(this, i2, uue);
                this.a.requestNetwork(build, uur);
                this.d.put(uvy, uur);
                this.c.c(uvy.c);
                ((anih) ((anih) ulh.a.d()).a("uvf", "a", 566, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully hosted a WiFi Aware network.");
                return true;
            }
            ((anih) ((anih) ulh.a.c()).a("uvf", "a", 528, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to obtain a port when hosting the WiFi Aware network.");
            return false;
        }
        ((anih) ((anih) ulh.a.c()).a("uvf", "a", 520, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot host WiFi Aware network for %s because we are already connected to them.", (Object) uvy);
        return false;
    }
}
