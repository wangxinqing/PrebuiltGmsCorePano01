package defpackage;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: une  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class une {
    public final uwc a;
    public unc b;
    public final aoru c = tid.b();
    private final Context d;
    private final WifiP2pManager e;
    private final uru f;
    private ServerSocket g;

    public une(Context context, uru uru) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = (WifiP2pManager) applicationContext.getSystemService("wifip2p");
        this.f = uru;
        this.a = new uwc(this.d);
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

    private final WifiP2pDevice g() {
        uwc uwc;
        WifiP2pManager.Channel a2 = this.a.a(2);
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("une", "g", 394, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't get local WifiP2pDevice because we failed to initialize a WiFi Direct channel.");
            return null;
        }
        aosh f2 = aosh.f();
        WifiP2pManager wifiP2pManager = this.e;
        f2.getClass();
        wifiP2pManager.requestDeviceInfo(a2, new umr(f2));
        try {
            WifiP2pDevice wifiP2pDevice = (WifiP2pDevice) f2.get(aymi.a.a().bt(), TimeUnit.SECONDS);
            this.a.b(2);
            return wifiP2pDevice;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("une", "g", 407, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while getting WiFi Direct device");
            uwc = this.a;
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("une", "g", 409, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get WiFi Direct device");
            uwc = this.a;
        } catch (TimeoutException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("une", "g", 411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting to get WiFi Direct device");
            uwc = this.a;
        } catch (Throwable th) {
            this.a.b(2);
            throw th;
        }
        uwc.b(2);
        return null;
    }

    public final synchronized boolean b() {
        return this.b != null;
    }

    public final synchronized void c() {
        if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("une", "c", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop WiFi Direct group because a WiFi Direct isn't hosted.");
            return;
        }
        this.f.c(this.b);
        this.b = null;
        ((anih) ((anih) ulh.a.d()).a("une", "c", 217, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully stopped WiFi Direct group");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.und d() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.e()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r3.b()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.net.wifi.p2p.WifiP2pDevice r0 = r3.g()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.deviceAddress     // Catch:{ all -> 0x0039 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0037
            unc r0 = r3.b     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.b     // Catch:{ all -> 0x0039 }
            java.net.ServerSocket r0 = r3.g     // Catch:{ all -> 0x0039 }
            int r0 = r0.getLocalPort()     // Catch:{ all -> 0x0039 }
            unc r1 = r3.b     // Catch:{ all -> 0x0039 }
            int r1 = r1.c     // Catch:{ all -> 0x0039 }
            und r2 = new und     // Catch:{ all -> 0x0039 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return r2
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.une.d():und");
    }

    public final synchronized boolean e() {
        return this.g != null;
    }

    public final synchronized void f() {
        if (!e()) {
            ((anih) ((anih) ulh.a.d()).a("une", "f", 317, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting WiFi Direct connections because we are not currently accepting WiFi Direct connections.");
            return;
        }
        try {
            this.g.close();
            this.g = null;
        } catch (IOException e2) {
            try {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("une", "f", 326, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop accepting WiFi Direct connections because we were unable to close the ServerSocket.");
                this.g = null;
            } catch (Throwable th) {
                this.g = null;
                ulu.b();
                throw th;
            }
        }
        ulu.b();
        ((anih) ((anih) ulh.a.d()).a("une", "f", 334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped accepting WiFi Direct connections.");
    }

    public final synchronized uwd a(String str, String str2, int i, int i2, tfw tfw) {
        String str3 = str;
        synchronized (this) {
            if (str3 == null || str2 == null) {
                ((anih) ((anih) ulh.a.b()).a("une", "a", 348, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to connect to a WiFi Direct device because a null ssid, and/or password was passed in.");
                return null;
            } else if (!a()) {
                ((anih) ((anih) ulh.a.d()).a("une", "a", 355, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to %s because WiFi Direct is not supported.", (Object) str3);
                return null;
            } else {
                umz umz = new umz(this.d, this.e, this.a, str, str2, i, i2, tfw);
                if (!a(this.f.b(umz))) {
                    ((anih) ((anih) ulh.a.c()).a("une", "a", 371, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to WifiP2pDevice because we failed to register the MediumOperation.");
                    return null;
                }
                uwd uwd = umz.e;
                uwd.a(new umq(this, umz));
                return uwd;
            }
        }
    }

    public final synchronized void a(tor tor, uwd uwd) {
        if (!e()) {
            ((anih) ((anih) ulh.a.c()).a("une", "a", 305, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoting incoming WiFi Direct socket because we are not currently accepting WiFi Direct connections.");
            ulu.a((ull) uwd, "WifiDirect", uwd.a);
            return;
        }
        ((tru) tor.a).a.a(new tlv(trv.a(uwd), uwd));
    }

    public final synchronized void a(urq urq) {
        this.f.c(urq);
    }

    public final boolean a() {
        return aymi.a.a().aJ() && jkr.h() && this.d.getPackageManager().hasSystemFeature("android.hardware.wifi.direct") && this.e != null;
    }

    public final synchronized boolean a(String str, String str2, boolean z, tfw tfw) {
        synchronized (this) {
            if (str == null || str2 == null) {
                ((anih) ((anih) ulh.a.b()).a("une", "a", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to host WiFi Direct group because a null ssid, and/or password was passed in.");
                return false;
            } else if (b()) {
                ((anih) ((anih) ulh.a.b()).a("une", "a", 171, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't host WiFi Direct group because WiFi Direct is already hosted.");
                return false;
            } else if (!a()) {
                ((anih) ((anih) ulh.a.d()).a("une", "a", 176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't host WiFi Direct group because WiFi Direct is not supported.");
                return false;
            } else {
                unc unc = new unc(this.d, this.e, this.a, str, str2, z, tfw);
                if (!a(this.f.b(unc))) {
                    jjg jjg = ulh.a;
                    return false;
                }
                this.b = unc;
                ((anih) ((anih) ulh.a.d()).a("une", "a", 202, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully hosted WiFi Direct group");
                return true;
            }
        }
    }

    public final synchronized boolean a(tor tor) {
        if (tor == null) {
            ((anih) ((anih) ulh.a.b()).a("une", "a", 250, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting WiFi Direct connections because a null serviceName and/or callback was passed in.");
            return false;
        } else if (e()) {
            ((anih) ((anih) ulh.a.b()).a("une", "a", 257, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting WiFi Direct connections because we're already accepting Wifi Direct connections.");
            return false;
        } else if (!a()) {
            ((anih) ((anih) ulh.a.d()).a("une", "a", 264, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting WiFi Direct connections because WiFi Direct is not supported.");
            return false;
        } else {
            try {
                ulu.a();
                ServerSocket serverSocket = new ServerSocket(0);
                new umt(this, tor, serverSocket).start();
                this.g = serverSocket;
                ((anih) ((anih) ulh.a.d()).a("une", "a", 296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Started accepting WiFi Direct connections on port %s.", serverSocket.getLocalPort());
                return true;
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("une", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting WiFi Direct connections.");
                return false;
            }
        }
    }
}
