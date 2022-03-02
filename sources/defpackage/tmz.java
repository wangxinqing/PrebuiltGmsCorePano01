package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: tmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class tmz implements tqu, tny, tnk {
    public static final Comparator a = tmf.a;
    public final tob b;
    public final tph c;
    public final tnl d;
    public final SecureRandom e;
    public final ScheduledExecutorService f = tid.a();
    public final Map g = new nz();
    public final Map h = new nz();
    public final Map i = new nz();
    private final tlt j;
    private final tnq k;
    private final aoru l = tid.b();

    public tmz(tob tob, tnq tnq, tlt tlt, tph tph) {
        tnl tnl = new tnl();
        SecureRandom secureRandom = new SecureRandom();
        this.b = tob;
        this.k = tnq;
        this.j = tlt;
        this.c = tph;
        this.d = tnl;
        this.e = secureRandom;
    }

    private static asoe a(tnm tnm) {
        if (tnm != null) {
            return tnm.l();
        }
        return asoe.UNKNOWN_MEDIUM;
    }

    protected static final boolean c(tlh tlh, String str) {
        ConnectionOptions b2 = tlh.b(str);
        return b2 != null && b2.a;
    }

    public static final boolean g(tlh tlh) {
        if (tlh.j() != null) {
            return tlh.j().c;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract tmw a(tlh tlh, String str, DiscoveryOptions discoveryOptions);

    /* access modifiers changed from: protected */
    public abstract tmw a(tlh tlh, String str, String str2, byte[] bArr, byte[] bArr2, AdvertisingOptions advertisingOptions);

    /* access modifiers changed from: protected */
    public abstract tnm a(tlh tlh, tms tms);

    /* access modifiers changed from: protected */
    public abstract void a(tlh tlh);

    /* access modifiers changed from: protected */
    public abstract void b(tlh tlh);

    public final void b(tlh tlh, String str) {
        this.h.remove(str);
        this.b.a(tlh, str);
        tlh.a(str, 13, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public abstract String[] b();

    /* access modifiers changed from: protected */
    public boolean c(tlh tlh) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract String[] c();

    /* access modifiers changed from: protected */
    public abstract List d();

    /* access modifiers changed from: protected */
    public boolean d(tlh tlh) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract asoe e();

    /* access modifiers changed from: protected */
    public final boolean e(tlh tlh) {
        for (tmv tmv : this.h.values()) {
            if (!tmv.e) {
                return true;
            }
        }
        if (tlh.s() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final List f() {
        ArrayList arrayList = new ArrayList(this.c.a(d()));
        Collections.sort(arrayList, tmg.a);
        return arrayList;
    }

    public final void h(tlh tlh) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a((Runnable) new tmi(this, tlh, countDownLatch));
        thr.a("stopAdvertising()", countDownLatch);
    }

    public final void i(tlh tlh) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a((Runnable) new tmk(this, tlh, countDownLatch));
        thr.a("stopDiscovery()", countDownLatch);
    }

    /* access modifiers changed from: protected */
    public final void b(tlh tlh, tms tms) {
        int i2;
        tmt tmt = (tmt) this.g.get(tlh);
        if (tmt == null) {
            ((anih) tky.a.c()).a("onEndpointFound reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", (Object) tms.b);
            return;
        }
        if (!tmt.a.containsKey(tms.b)) {
            tmt.a.put(tms.b, new ArrayList());
        }
        List list = (List) tmt.a.get(tms.b);
        if (list.isEmpty()) {
            list.add(tms);
            i2 = 1;
        } else if (!Arrays.equals(((tms) list.get(0)).c, tms.c)) {
            list.clear();
            list.add(tms);
            i2 = 2;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tms tms2 = (tms) it.next();
                if (tms2.e == tms.e) {
                    list.remove(tms2);
                    break;
                }
            }
            list.add(tms);
            Collections.sort(list, a);
            i2 = 3;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            tlh.a(tms.b, tms.d, tms.c, tms.e);
        } else if (i3 == 1) {
            ((anih) tky.a.d()).a("onEndpointFound reported for endpoint %s with a new endpoint name.", (Object) tms.b);
            tlh.a(tms.d, tms.b);
            tlh.a(tms.b, tms.d, tms.c, tms.e);
        }
    }

    /* access modifiers changed from: protected */
    public final void c(tlh tlh, tms tms) {
        tmt tmt = (tmt) this.g.get(tlh);
        if (tmt == null) {
            ((anih) tky.a.c()).a("onEndpointLost reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", (Object) tms.b);
            return;
        }
        List b2 = tmt.b(tms.b);
        if (b2.remove(tms) && b2.isEmpty()) {
            tlh.a(tms.d, tms.b);
            return;
        }
        String str = tms.b;
        tlh.a(str, tmt.a(str));
    }

    private final Future a(Callable callable) {
        return this.l.b(callable);
    }

    /* access modifiers changed from: protected */
    public final boolean f(tlh tlh) {
        for (tmv tmv : this.h.values()) {
            if (tmv.e) {
                return true;
            }
        }
        if (tlh.t() > 0) {
            return true;
        }
        return false;
    }

    protected static usu a(String str, String str2, byte[] bArr) {
        byte[] bytes = str.getBytes(tlh.a);
        byte[] bytes2 = str2.getBytes(tlh.a);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bytes2.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bytes2);
        allocate.put(bArr);
        return usu.a(allocate.array());
    }

    public static void a(tlh tlh, asoe asoe, String str, boolean z, long j2) {
        int i2 = 3;
        if (str != null && tlh.q(str).b()) {
            i2 = 4;
        }
        if (!z) {
            tlh.f.a(str, 2, asoe, i2, SystemClock.elapsedRealtime() - j2);
            return;
        }
        tlh.f.a(2, asoe, i2, SystemClock.elapsedRealtime() - j2);
    }

    private final void a(tlh tlh, String str, tmv tmv) {
        a(tlh, tmv.c.l(), str, tmv.c, tmv.e, tmv.f, 8012, tmv.k);
        b(tlh, str);
    }

    public static boolean a(asoe asoe, asoe asoe2, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Integer num = (Integer) list.get(i2);
            if (num.intValue() == asoe.k) {
                return true;
            }
            i2++;
            if (num.intValue() == asoe2.k) {
                return false;
            }
        }
        throw new IllegalStateException(String.format("Failed to find either %s or %s in the list of locally supported mediums despite  expecting to find both, when deciding which medium is preferred.", new Object[]{asoe.name(), asoe2.name()}));
    }

    public final int a(tlh tlh, String str) {
        return thr.a(String.format("rejectConnection(%s)", new Object[]{str}), a((Callable) new tlz(this, tlh, str)));
    }

    public final int a(tlh tlh, String str, DiscoveryOptions discoveryOptions, ugq ugq) {
        return thr.a(String.format("startDiscovery(%s)", new Object[]{str}), a((Callable) new tmj(this, tlh, str, discoveryOptions, ugq)));
    }

    public final int a(tlh tlh, String str, byte[] bArr, AdvertisingOptions advertisingOptions, ugh ugh) {
        return thr.a(String.format("startAdvertising(%s)", new Object[]{tky.a(bArr)}), a((Callable) new tmh(this, tlh, bArr, str, advertisingOptions, ugh)));
    }

    public final int a(tlh tlh, String str, byte[] bArr, ugx ugx) {
        return thr.a(String.format("acceptConnection(%s)", new Object[]{str}), a((Callable) new tmo(this, tlh, str, bArr, ugx)));
    }

    public final int a(tlh tlh, byte[] bArr, String str, byte[] bArr2, ConnectionOptions connectionOptions, ugh ugh) {
        aosh f2 = aosh.f();
        a((Runnable) new tml(this, str, f2, tlh, connectionOptions, bArr, bArr2, ugh));
        return thr.a(String.format("requestConnection(%s)", new Object[]{str}), (Future) f2);
    }

    public final void a() {
        ((anih) tky.a.d()).a("Initiating shutdown of PCPHandler(%s).", (Object) g().a());
        this.b.b(asav.CONNECTION_RESPONSE, this);
        tnl tnl = this.d;
        tid.a(tnl.c, "EncryptionRunner.serverExecutor");
        tid.a(tnl.d, "EncryptionRunner.clientExecutor");
        tid.a(tnl.b, "EncryptionRunner.alarmExecutor");
        tid.a(this.l, "BasePCPHandler.serialExecutor");
        tid.a(this.f, "BasePCPHandler.alarmExecutor");
        this.i.clear();
        for (tmt tmt : this.g.values()) {
            tmt.a.clear();
        }
        this.g.clear();
        for (tmv tmv : this.h.values()) {
            aosh aosh = tmv.k;
            if (aosh != null) {
                aosh.b((Object) 13);
            }
            tmv.c.a(6);
        }
        this.h.clear();
        g().a();
    }

    public final void a(asai asai, String str, tlh tlh, asoe asoe) {
        asac asac;
        asaw asaw = asai.c;
        if (asaw == null) {
            asaw = asaw.j;
        }
        asac asac2 = asaw.d;
        if (asac2 != null) {
            asac = asac2;
        } else {
            asac = asac.d;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a((Runnable) new tma(this, str, asac, tlh, countDownLatch));
        thr.a("onConnectionResponse()", countDownLatch);
    }

    public final void a(Runnable runnable) {
        this.l.execute(runnable);
    }

    public final void a(String str, auta auta, String str2, byte[] bArr) {
        a((Runnable) new tmm(this, str, auta, str2, bArr));
    }

    public final void a(String str, tnm tnm) {
        a((Runnable) new tmn(this, str, tnm));
    }

    public final void a(tlh tlh, asoe asoe, String str, tnm tnm, boolean z, long j2, int i2, aosh aosh) {
        String str2 = str;
        a(tlh, asoe, str2, z, j2);
        a(tlh, str2, tnm, i2, aosh);
    }

    /* access modifiers changed from: protected */
    public final void a(tlh tlh, String str, asoe asoe, int i2) {
        tmt tmt = (tmt) this.g.get(tlh);
        if (tmt == null) {
            ((anih) tky.a.c()).a("onEndpointDistanceChanged reported for endpoint %s, but the associated ClientProxy is not tied to a DiscoveredEndpointTracker.", (Object) str);
        } else if (tmt.c(str)) {
            Iterator it = tmt.b(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    jjg jjg = tky.a;
                    asoe.name();
                    break;
                }
                tms tms = (tms) it.next();
                if (tms.e == asoe) {
                    tms.f = i2;
                    break;
                }
            }
            tlh.a(str, tmt.a(str));
        } else {
            ((anih) tky.a.c()).a("onEndpointDistanceChanged reported for endpoint %s, but the endpoint has not been reported onEndpointFound yet.", (Object) str);
        }
    }

    public final void a(tlh tlh, String str, CountDownLatch countDownLatch) {
        a((Runnable) new tmc(this, str, tlh, countDownLatch));
    }

    public final void a(tlh tlh, String str, tnm tnm, int i2, aosh aosh) {
        if (str != null) {
            try {
                this.h.remove(str);
            } catch (Throwable th) {
                if (aosh != null) {
                    aosh.b((Object) Integer.valueOf(i2));
                }
                throw th;
            }
        }
        if (tnm != null) {
            tnm.g();
        }
        tlh.o(str);
        if (aosh != null) {
            aosh.b((Object) Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(tlh tlh, String str, tnm tnm, asoe asoe) {
        tfu b2;
        byte[] bArr;
        boolean z;
        tlh tlh2 = tlh;
        tnm tnm2 = tnm;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (!tlh.g()) {
                throw new IOException(String.format("Ignoring incoming connection on medium %s because client %d is no longer advertising", new Object[]{a(tnm).name(), Long.valueOf(tlh.b())}));
            } else if (tnm2 != null) {
                jjg jjg = tky.a;
                new Object[1][0] = g().a();
                b2 = tfu.b(new tmd(tnm2), aymi.t(), this.f);
                asai a2 = tpk.a(tnm.e());
                b2.b();
                if (tpk.a(a2) == asav.CONNECTION_REQUEST) {
                    asaw asaw = a2.c;
                    if (asaw == null) {
                        asaw = asaw.j;
                    }
                    asab asab = asaw.c;
                    if (asab == null) {
                        asab = asab.j;
                    }
                    ((anih) tky.a.d()).a("In onIncomingConnection(%s) for client %d, read ConnectionRequestFrame from endpoint %s", (Object) a(tnm).name(), (Object) Long.valueOf(tlh.b()), (Object) asab.b);
                    if (!tlh2.e(asab.b)) {
                        String str2 = asab.b;
                        int i2 = asab.e;
                        if (this.h.containsKey(str2)) {
                            tmv tmv = (tmv) this.h.get(str2);
                            ((anih) tky.a.d()).a("In onIncomingConnection() for client %d, found a collision with endpoint %s. We've already sent a connection request to them with nonce %d, but they're also trying to connect to us with nonce %d.", Long.valueOf(tlh.b()), str2, Integer.valueOf(tmv.d), Integer.valueOf(i2));
                            int i3 = tmv.d;
                            if (i3 > i2) {
                                tnm.g();
                                ((anih) tky.a.d()).a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing their channel.", tlh.b(), (Object) str2);
                                return;
                            } else if (i3 < i2) {
                                a(tlh2, str2, tmv);
                                ((anih) tky.a.d()).a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing our channel and notifying our client of the failure.", tlh.b(), (Object) str2);
                            } else {
                                tnm.g();
                                a(tlh2, str2, tmv);
                                ((anih) tky.a.d()).a("In onIncomingConnection() for client %d, cleaned up the collision with endpoint %s by closing both channels. Our nonces were identical, so we couldn't decide which channel to use.", tlh.b(), (Object) str2);
                                return;
                            }
                        }
                        if (g(tlh)) {
                            if (!d(tlh)) {
                                throw new IOException("Incoming connections are currently disallowed.");
                            }
                        }
                        if ((asab.a & 16) != 0) {
                            bArr = asab.h.k();
                        } else {
                            bArr = asab.c.getBytes(tlh.a);
                        }
                        if ((asab.a & 32) != 0) {
                            asaf asaf = asab.i;
                            if (asaf == null) {
                                asaf = asaf.c;
                            }
                            z = asaf.b;
                        } else {
                            z = false;
                        }
                        this.h.put(asab.b, new tmv(tlh, bArr, tnm, asab.e, true, elapsedRealtime, asab.d.k(), tlh.i(), (aosh) null, (asaa[]) new aucu(asab.f, asab.g).toArray(new asaa[0]), z));
                        tnl tnl = this.d;
                        tnl.c.execute(new tng(tnl, tlh, asab.b, tnm, this));
                        return;
                    }
                    throw new IOException(String.format("Incoming connection on medium %s was denied because we're already connected to endpoint %s.", new Object[]{a(tnm).name(), asab.b}));
                }
                throw new IOException(String.format("In readConnectionRequestFrame, expected a CONNECTION_REQUEST v1 OfflineFrame but got a %s frame instead", new Object[]{tpk.a(a2).name()}));
            } else {
                throw new IOException("Unable to read from a null EndpointChannel");
            }
        } catch (IOException e2) {
            throw new IOException(String.format("In readConnectionRequestFrame, attempted to read a ConnectionRequestFrame from EndpointChannel %s but was unable to obtain any OfflineFrame.", new Object[]{tnm.a()}), e2);
        } catch (IOException e3) {
            anih anih = (anih) tky.a.b();
            anih.a((Throwable) e3);
            anih.a("onIncomingConnection(%s) for client %d failed to initialize the connection with %s", (Object) a(tnm).name(), (Object) Long.valueOf(tlh.b()), (Object) str);
            a(tlh, asoe, (String) null, tnm, true, elapsedRealtime, -1, (aosh) null);
        } catch (Throwable th) {
            b2.b();
            throw th;
        }
    }

    public final void a(tlh tlh, String str, byte[] bArr, boolean z) {
        int i2;
        if (tlh.l(str) || tlh.m(str)) {
            tmv tmv = (tmv) this.h.remove(str);
            if (tmv == null) {
                ((anih) tky.a.c()).a("evaluateConnectionResult() for client %d failed to find a pending connection to endpoint %s.", tlh.b(), (Object) str);
                return;
            }
            boolean l2 = tlh.l(str);
            if (l2) {
                ((anih) tky.a.d()).a("The connection with endpoint %s was accepted by both sides", (Object) str);
                try {
                    this.k.a(str, tmv.l.c());
                    tlh.f.b(str, tmv.c.l());
                    i2 = 0;
                } catch (ausp e2) {
                    anih anih = (anih) tky.a.b();
                    anih.a((Throwable) e2);
                    anih.a("evaluateConnectionResult() for client %d failed to upgrade the connection to endpoint %s to use encryption.", tlh.b(), (Object) str);
                    b(tlh, str);
                    return;
                }
            } else {
                ((anih) tky.a.d()).a("The connection with endpoint %s was rejected by one or both sides.", (Object) str);
                i2 = 8004;
            }
            tlh.a(str, i2, bArr);
            if (l2) {
                tlh.a(str, tmv.c.l());
                if (!tmv.e) {
                    return;
                }
                if (tlh.j() == null || tlh.j().b) {
                    this.j.a(tlh, str);
                }
            } else if (!z) {
                this.i.put(str, tfu.b(new tmb(this, str, tlh), aymi.K(), this.f));
            } else {
                this.b.a(tlh, str);
            }
        } else if (!tlh.g(str)) {
            ((anih) tky.a.d()).a("Waiting for the client to decide whether or not to accept the connection to endpoint %s", (Object) str);
        } else if (!tlh.h(str)) {
            ((anih) tky.a.d()).a("Waiting for endpoint %s to decide whether or not to accept the connection", (Object) str);
        }
    }
}
