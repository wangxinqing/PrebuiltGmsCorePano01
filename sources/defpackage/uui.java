package defpackage;

import android.net.wifi.aware.DiscoverySession;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: uui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uui {
    public final uvf a;
    public final uts b;
    public final ExecutorService c;
    public final ExecutorService d;
    public final ScheduledExecutorService e;
    public final uuh f;

    public uui(uvf uvf, uts uts) {
        ScheduledExecutorService a2 = tid.a();
        aoru b2 = tid.b();
        aoru b3 = tid.b();
        this.a = uvf;
        this.b = uts;
        this.e = a2;
        this.c = b2;
        this.d = b3;
        this.f = new uuh(uvf);
    }

    private final asmy a(InputStream inputStream, int i, boolean z) {
        Short sh = null;
        while (true) {
            asmy asmy = (asmy) aucj.b(asmy.f, inputStream);
            int i2 = 1;
            if (asmy != null) {
                int i3 = asmy.a;
                if (!((i3 & 32) == 0 || (i3 & 64) == 0 || asmy.e.a() != 2)) {
                    sh = Short.valueOf(aoom.a(asmy.e.k()));
                    int i4 = asmy.d;
                    if (i4 <= this.f.a(sh.shortValue())) {
                        jjg jjg = ulh.a;
                    } else {
                        this.f.a(sh.shortValue(), i4);
                    }
                }
                int b2 = asmx.b(asmy.b);
                if (b2 == 0) {
                    b2 = 1;
                }
                if (b2 == i) {
                    return asmy;
                }
                int b3 = asmx.b(asmy.b);
                if (b3 != 0 && b3 == 5) {
                    Object[] objArr = new Object[1];
                    String a2 = asmx.a(i);
                    if (i != 0) {
                        objArr[0] = a2;
                        throw new IOException(String.format("Remotely cancelled while waiting for frame %s", objArr));
                    }
                    throw null;
                }
                anih anih = (anih) ((anih) ulh.a.c()).a("uui", "a", 514, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                int b4 = asmx.b(asmy.b);
                if (b4 != 0) {
                    i2 = b4;
                }
                String a3 = asmx.a(i2);
                String a4 = asmx.a(i);
                if (i != 0) {
                    anih.a("Found WifiAwareFrame of type %s instead %s. Skipping and continuing to read.", (Object) a3, (Object) a4);
                } else {
                    throw null;
                }
            } else {
                if (sh != null) {
                    this.f.a(sh.shortValue(), z);
                }
                Object[] objArr2 = new Object[1];
                String a5 = asmx.a(i);
                if (i != 0) {
                    objArr2[0] = a5;
                    throw new auda(String.format("Failed to parse WifiAwareFrame of type %s", objArr2));
                }
                throw null;
            }
        }
    }

    public final asmy b(InputStream inputStream, int i) {
        return a(inputStream, i, false);
    }

    public static void a(uvi uvi, asmy asmy) {
        jjg jjg = ulh.a;
        int i = asmy.b;
        byte[] k = asmy.k();
        int length = k.length;
        uvg uvg = uvi.e;
        byte[] bArr = new byte[(length + 1)];
        System.arraycopy(new byte[]{(byte) length}, 0, bArr, 0, 1);
        System.arraycopy(k, 0, bArr, 1, length);
        uvg.write(bArr);
    }

    public final asmy a(InputStream inputStream, int i) {
        return a(inputStream, i, true);
    }

    public final asmy a(byte[] bArr) {
        aucd o = asmy.f.o();
        auay a2 = auay.a(bArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmy asmy = (asmy) o.b;
        a2.getClass();
        asmy.a |= 64;
        asmy.e = a2;
        int a3 = this.f.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmy asmy2 = (asmy) o.b;
        int i = asmy2.a | 32;
        asmy2.a = i;
        asmy2.d = a3;
        asmy2.b = 4;
        asmy2.a = i | 1;
        return (asmy) o.i();
    }

    public final uvz a(uvi uvi, String str, tfw tfw) {
        uts uts;
        uvi uvi2 = uvi;
        short a2 = aoom.a(uvi2.a.d);
        DiscoverySession discoverySession = uvi2.a.c;
        if (this.f.b(a2)) {
            jjg jjg = ulh.a;
            ulu.a(this.a.d());
            return null;
        }
        this.f.a(a2, uvi2);
        aosh f2 = aosh.f();
        utv utv = r1;
        utv utv2 = new utv(this, uvi, tfw, str, a2, f2);
        this.c.execute(utv);
        try {
            this.b.a(discoverySession);
            uvz uvz = (uvz) f2.get();
            this.b.b(discoverySession);
            return uvz;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uui", "a", 432, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to connect to WiFi Aware network");
            uts = this.b;
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("uui", "a", 434, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to WiFi Aware network");
            uts = this.b;
        } catch (Throwable th) {
            this.b.b(discoverySession);
            throw th;
        }
        uts.b(discoverySession);
        this.f.d(a2);
        return null;
    }

    public final void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    public final void a(uvi uvi, String str, int i, tfu tfu) {
        try {
            aucd o = asmy.f.o();
            auay a2 = auay.a(this.a.d());
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy = (asmy) o.b;
            a2.getClass();
            asmy.a |= 64;
            asmy.e = a2;
            int a3 = this.f.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy2 = (asmy) o.b;
            int i2 = asmy2.a | 32;
            asmy2.a = i2;
            asmy2.d = a3;
            asmy2.b = 3;
            asmy2.a = i2 | 1;
            aucd o2 = asmv.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asmv asmv = (asmv) o2.b;
            str.getClass();
            int i3 = asmv.a | 1;
            asmv.a = i3;
            asmv.b = str;
            asmv.a = i3 | 2;
            asmv.c = i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy3 = (asmy) o.b;
            asmv asmv2 = (asmv) o2.i();
            asmv2.getClass();
            asmy3.c = asmv2;
            asmy3.a |= 8;
            a(uvi, (asmy) o.i());
            jjg jjg = ulh.a;
            uvi.close();
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uui", "a", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to inform the remote device about the ServerSocket");
            tfu.b();
            uvi.close();
            this.a.b(uvi.a);
            this.f.c(aoom.a(uvi.a.d));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(uvi uvi, String str, uvq uvq) {
        byte[] d2 = this.a.d();
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new uua(this, uvi, d2), aymi.R() * 1000, this.e);
        try {
            asmy a2 = a((InputStream) uvi.c, 2);
            if ((a2.a & 64) != 0) {
                byte[] k = a2.e.k();
                uvi.a.d = k;
                Arrays.toString(k);
            }
            short a3 = aoom.a(d2);
            short a4 = aoom.a(uvi.a.d);
            if (this.f.b(a4)) {
                if (a3 > a4) {
                    uvi e2 = this.f.e(a4);
                    if (e2 != null) {
                        e2.close();
                    }
                } else {
                    b2.b();
                    uvi.close();
                    return;
                }
            }
            if (!this.a.a(uvi.a, str, new uue(this, uvi, b2, uvq))) {
                ((anih) ((anih) ulh.a.b()).a("uui", "a", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to host a network");
                b2.b();
                uvi.close();
                this.f.c(a4);
                return;
            }
            new jfx(9, new uub(this, uvi, b2, a4)).start();
            try {
                aucd o = asmy.f.o();
                auay a5 = auay.a(this.a.d());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asmy asmy = (asmy) o.b;
                a5.getClass();
                asmy.a |= 64;
                asmy.e = a5;
                int a6 = this.f.a();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asmy asmy2 = (asmy) o.b;
                int i = asmy2.a | 32;
                asmy2.a = i;
                asmy2.d = a6;
                asmy2.b = 2;
                asmy2.a = i | 1;
                a(uvi, (asmy) o.i());
            } catch (IOException e3) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e3);
                ((anih) anih.a("uui", "a", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to inform the remote device about the network");
                b2.b();
                uvi.close();
                this.a.b(uvi.a);
                this.f.c(a4);
            }
        } catch (IOException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("uui", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to read from the remote device");
            b2.b();
            uvi.close();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(uvi uvi, tfw tfw, String str, short s, aosh aosh) {
        byte[] d2 = this.a.d();
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new utw(this, uvi, d2), aymi.R() * 1000, this.e);
        tfw.a(new utx(this, uvi, d2));
        if (tfw.b()) {
            uvi.close();
        }
        try {
            aucd o = asmy.f.o();
            auay a2 = auay.a(this.a.d());
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy = (asmy) o.b;
            a2.getClass();
            asmy.a |= 64;
            asmy.e = a2;
            int a3 = this.f.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy2 = (asmy) o.b;
            int i = asmy2.a | 32;
            asmy2.a = i;
            asmy2.d = a3;
            asmy2.b = 1;
            asmy2.a = 1 | i;
            a(uvi, (asmy) o.i());
            ulu.a(this.a.d());
            b(uvi.c, 3);
            ((anih) ((anih) ulh.a.d()).a("uui", "a", 382, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming notice that a Wifi Aware network is available");
            if (this.a.a(uvi.a, str, tfw)) {
                InetSocketAddress a4 = this.a.a(uvi.a);
                if (a4 != null) {
                    ((anih) ((anih) ulh.a.d()).a("uui", "a", 403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Immediately received the ip/port. No need to wait for notice.");
                } else {
                    asmv asmv = b(uvi.c, 4).c;
                    if (asmv == null) {
                        asmv = asmv.d;
                    }
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(asmv.b, asmv.c);
                    ((anih) ((anih) ulh.a.d()).a("uui", "a", 400, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming notice that a Wifi Aware ServerSocket is available");
                    a4 = inetSocketAddress;
                }
                uvz a5 = this.a.a(uvi.a, a4, tfw);
                if (a5 != null) {
                    a5.a(new uty(this, s));
                    aosh.b((Object) a5);
                    b2.b();
                    uvi.close();
                    return;
                }
                this.a.b(uvi.a);
                throw new IOException("Failed to connect to the Wifi Aware ServerSocket");
            }
            throw new IOException("Failed to join the Wifi Aware network");
        } catch (IOException e2) {
            aosh.a((Throwable) e2);
        } catch (Throwable th) {
            b2.b();
            uvi.close();
            throw th;
        }
    }
}
