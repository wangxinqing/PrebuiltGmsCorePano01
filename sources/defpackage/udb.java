package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.security.GeneralSecurityException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: udb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udb {
    public final arwg a;
    public final ttf b;
    public final txr c;
    public final twd d;
    public final Context e;
    public final tsu f;
    public final arxt g;
    public final udf h;
    public final tya i;
    public final tws j;
    public final txb k;
    public final tzr l;
    public final aryx m;
    public final Map n = new HashMap();
    public final aoru o = jfm.b(9);
    public final Map p = new HashMap();
    public ucz q;
    public boolean r = false;
    public ttg s = null;
    public final arwm t = new uco(this, "reEnableAllDeviceItems");
    public final arwm u = new ucq(this, "removeInvalidDevices");
    private tzs v;

    public udb(Context context) {
        this.e = context;
        this.a = (arwg) thl.a(context, arwg.class);
        this.b = (ttf) thl.a(context, ttf.class);
        this.c = (txr) thl.a(context, txr.class);
        this.d = (twd) thl.a(context, twd.class);
        this.h = (udf) thl.a(context, udf.class);
        this.f = (tsu) thl.a(context, tsu.class);
        this.g = (arxt) thl.a(context, arxt.class);
        this.i = (tya) thl.a(context, tya.class);
        this.j = (tws) thl.a(context, tws.class);
        this.k = (txb) thl.a(context, txb.class);
        this.l = (tzr) thl.a(context, tzr.class);
        this.m = (aryx) thl.a(context, aryx.class);
    }

    public static String a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    static uaj a(ttg ttg) {
        uaj uaj = ttg.b;
        aucd aucd = (aucd) uaj.c(5);
        aucd.a((aucj) uaj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj2 = (uaj) aucd.b;
        uaj uaj3 = uaj.K;
        uaj2.a &= -5;
        uaj2.e = uaj.K.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj4 = (uaj) aucd.b;
        uaj4.m = 1;
        int i2 = uaj4.a | 1024;
        uaj4.a = i2;
        uaj4.E = 1;
        uaj4.a = 134217728 | i2;
        return (uaj) aucd.i();
    }

    public static boolean a(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return false;
        }
        try {
            pendingIntent.send();
            return true;
        } catch (PendingIntent.CanceledException e2) {
            anih anih = (anih) tsp.a.b();
            anih.a((Throwable) e2);
            anih.a("Error sending PendingIntent=%s", (Object) pendingIntent);
            return false;
        }
    }

    public final int a(byte[] bArr, boolean z, String str, byte[] bArr2, byte[] bArr3, boolean z2, double d2) {
        int i2;
        byte[] bArr4;
        byte[] bArr5;
        tzi tzi;
        Context context;
        arwc arwc;
        arxt arxt;
        tzi tzi2;
        boolean z3;
        boolean z4;
        int i3;
        String str2;
        String str3;
        boolean z5;
        byte[] bArr6 = bArr;
        String str4 = str;
        byte[] bArr7 = bArr2;
        byte[] bArr8 = bArr3;
        int i4 = 1;
        if (!this.r) {
            if (this.v == null) {
                this.v = (tzs) thl.a(this.e, tzs.class);
            }
            if (!this.v.a(str4)) {
                jjg jjg = tsp.a;
                return 1;
            }
            this.a.b();
            ((tvg) thl.a(this.e, tvg.class)).a();
            Context context2 = this.e;
            arxt arxt2 = this.g;
            if (Double.isNaN(d2)) {
                jjg jjg2 = tsp.a;
                i2 = 3;
            } else {
                double i5 = aymt.i();
                boolean z6 = tvd.a(bArr3) && aymw.F() && d2 <= aymt.a.a().q();
                if (d2 <= i5 || z6) {
                    if (bArr6 == null) {
                        i2 = 3;
                    } else {
                        int length = bArr6.length;
                        if (length != 0) {
                            int i6 = length * 8;
                            long j2 = (long) i6;
                            if (j2 < aymt.a.a().u()) {
                                i2 = 3;
                            } else if (aymt.a.a().s() < j2) {
                                i2 = 3;
                            } else {
                                double h2 = aymt.h();
                                double h3 = aymt.h();
                                arxt arxt3 = arxt2;
                                long t2 = aymt.a.a().t();
                                BitSet valueOf = BitSet.valueOf(bArr);
                                int cardinality = valueOf.cardinality();
                                double d3 = (double) (length - 2);
                                Double.isNaN(d3);
                                double d4 = (double) ((int) (d3 / h2));
                                Double.isNaN(d4);
                                if (cardinality > i6 - (((int) (d4 * (h3 - 4.0d))) + ((int) t2))) {
                                    ((anih) tsp.a.c()).a("FastPair: Invalid bloom filter, too many bits set. %d out of %d.", valueOf.cardinality(), i6);
                                    i2 = 3;
                                } else {
                                    arwc arwc2 = new arwc(bArr6, new arwd());
                                    anab anab = new anab();
                                    for (tzi tzi3 : ((ttf) thl.a(context2, ttf.class)).d()) {
                                        anab.a(tzi3.c, tzi3);
                                    }
                                    anaf a2 = anab.a();
                                    if (bArr7 == null) {
                                        bArr4 = aeez.a(str);
                                    } else {
                                        bArr4 = bArr7;
                                    }
                                    if (!aymw.a.a().c() || !tvd.a(bArr3)) {
                                        bArr5 = bArr4;
                                    } else {
                                        byte[][] bArr9 = new byte[2][];
                                        bArr9[0] = bArr4;
                                        byte[][] bArr10 = new byte[2][];
                                        byte[] bArr11 = new byte[1];
                                        int i7 = 4;
                                        int length2 = bArr8.length << 4;
                                        if (!z2) {
                                            i7 = 3;
                                        }
                                        bArr11[0] = (byte) (length2 | i7);
                                        bArr10[0] = bArr11;
                                        bArr10[1] = bArr8;
                                        bArr9[1] = aooa.a(bArr10);
                                        bArr5 = aooa.a(bArr9);
                                    }
                                    jjg jjg3 = tsp.a;
                                    a2.size();
                                    Iterator it = a2.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            tzi = null;
                                            break;
                                        }
                                        auay auay = (auay) it.next();
                                        if (arwc2.a(aooa.a(auay.k(), bArr5))) {
                                            tzi = (tzi) a2.get(auay);
                                            break;
                                        }
                                    }
                                    if (aymw.a.a().aK()) {
                                        anih anih = (anih) tsp.a.d();
                                        String a3 = anml.g.a(bArr6);
                                        String str5 = !z6 ? "" : "longer";
                                        Double valueOf2 = Double.valueOf(d2);
                                        if (bArr7 != null) {
                                            str2 = anml.g.a(bArr7);
                                        } else {
                                            str2 = "na";
                                        }
                                        Boolean valueOf3 = Boolean.valueOf(z2);
                                        if (bArr8 != null) {
                                            str3 = anml.g.a(bArr8);
                                        } else {
                                            str3 = "na";
                                        }
                                        Boolean valueOf4 = Boolean.valueOf(z);
                                        if (tzi != null) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        String str6 = str2;
                                        z3 = false;
                                        Boolean bool = valueOf3;
                                        tzi2 = tzi;
                                        arxt = arxt3;
                                        context = context2;
                                        arwc = arwc2;
                                        anih.a("FastPair: Checking bloom filter %s at %s distance %.3fm, addr=%s, salt=%s, suppressBattery=%b, battery=%s, suppressPairing=%b, local cache=%b", a3, str5, valueOf2, str, str6, bool, str3, valueOf4, Boolean.valueOf(z5));
                                    } else {
                                        tzi2 = tzi;
                                        context = context2;
                                        arxt = arxt3;
                                        z3 = false;
                                        arwc = arwc2;
                                    }
                                    if (d2 <= i5) {
                                        i2 = 3;
                                        if (tzi2 != null) {
                                            Context context3 = context;
                                            tvs tvs = (tvs) thl.a(context3, tvs.class);
                                            if (aymw.a.a().bD()) {
                                                auay auay2 = tzi2.c;
                                                if (!tvs.b.containsKey(auay2) || SystemClock.elapsedRealtime() > ((Long) tvs.b.get(auay2)).longValue()) {
                                                    tvs.b("android.bluetooth.device.action.FOUND", tzi2);
                                                }
                                            }
                                            int i8 = tzi2.a;
                                            if ((i8 & 4) != 0 && tzi2.d) {
                                                if ((i8 & 8) != 0) {
                                                    i3 = tzi2.e + 1;
                                                } else {
                                                    i3 = 1;
                                                }
                                                if (((long) i3) <= aymt.a.a().bd()) {
                                                    ((ttf) thl.a(context3, ttf.class)).a(tzi2, z3, i3);
                                                    z4 = true;
                                                    tvd.a().execute(new tur(context3, tzi2, str, bArr3, z2, z4, d2, arxt));
                                                    i4 = 2;
                                                } else {
                                                    ((anih) tsp.a.d()).a("FastPair: reset retry no need to update.");
                                                    ((ttf) thl.a(context3, ttf.class)).a(tzi2, z3, z3 ? 1 : 0);
                                                }
                                            }
                                            z4 = false;
                                            tvd.a().execute(new tur(context3, tzi2, str, bArr3, z2, z4, d2, arxt));
                                            i4 = 2;
                                        } else {
                                            tvd.a().execute(new tus(context, bArr, z, arwc, str, bArr5, arxt));
                                            i4 = 3;
                                        }
                                    } else if (tzi2 != null) {
                                        i2 = 3;
                                        tvd.a().execute(new tut(context, tzi2, bArr3, z2, d2, arxt, str));
                                        i4 = 2;
                                    } else {
                                        i2 = 3;
                                        i4 = 1;
                                    }
                                }
                            }
                            jjg jjg4 = tsp.a;
                        } else {
                            i2 = 3;
                        }
                    }
                    jjg jjg5 = tsp.a;
                    i4 = 1;
                } else {
                    jjg jjg6 = tsp.a;
                    aymt.i();
                    i2 = 3;
                }
            }
            if ((!aymw.G() || i4 != i2) && aymw.G()) {
                return i4;
            }
            this.v.b(str4);
            return i4;
        }
        jjg jjg7 = tsp.a;
        return 1;
    }

    public final void a(BluetoothDevice bluetoothDevice) {
        if (this.i.a(bluetoothDevice)) {
            tya tya = this.i;
            ((anih) tsp.a.d()).a("EventStreamManager: Disconnect event stream from device %s", (Object) bluetoothDevice);
            tyb tyb = (tyb) tya.b.remove(bluetoothDevice);
            if (tyb != null) {
                tyb.a();
                return;
            }
            return;
        }
        ((anih) tsp.a.d()).a("FastPairEventStream: event stream connection (%s) is disconnected, skip", (Object) bluetoothDevice);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.bluetooth.BluetoothDevice r8, defpackage.tzi r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.e
            boolean r0 = defpackage.tga.a((android.content.Context) r0)
            if (r0 != 0) goto L_0x0016
            jjg r8 = defpackage.tsp.a
            anie r8 = r8.d()
            anih r8 = (defpackage.anih) r8
            java.lang.String r9 = "FastPairEventStream: skip rfcomm connection fast pair is disabled on this device."
            r8.a((java.lang.String) r9)
            return
        L_0x0016:
            tya r0 = r7.i
            boolean r0 = r0.a(r8)
            if (r0 == 0) goto L_0x002c
            jjg r9 = defpackage.tsp.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "FastPairEventStream: event stream connection (%s) is already connected, skip"
            r9.a((java.lang.String) r0, (java.lang.Object) r8)
            return
        L_0x002c:
            boolean r0 = defpackage.jkr.h()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0061
            boolean r0 = defpackage.aymw.V()
            if (r0 == 0) goto L_0x0061
            aymw r0 = defpackage.aymw.a
            aymx r0 = r0.a()
            boolean r0 = r0.ai()
            if (r0 != 0) goto L_0x0048
            r1 = 0
            goto L_0x0062
        L_0x0048:
            if (r9 == 0) goto L_0x0061
            aucu r0 = new aucu
            aucs r9 = r9.l
            auct r3 = defpackage.tzi.m
            r0.<init>(r9, r3)
            avbl r9 = defpackage.avbl.SILENCE_MODE
            boolean r9 = r0.contains(r9)
            if (r9 == 0) goto L_0x0061
            jjg r9 = defpackage.tsp.a
            r8.setSilenceMode(r1)
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            jjg r9 = defpackage.tsp.a
            tya r9 = r7.i
            txz r0 = r9.d
            if (r0 != 0) goto L_0x008d
            tye r0 = new tye
            android.content.Context r3 = r7.e
            r0.<init>(r3)
            r9.d = r0
            java.util.Map r9 = r9.b
            java.util.Collection r9 = r9.values()
            java.util.Iterator r9 = r9.iterator()
        L_0x007d:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r9.next()
            tyb r3 = (defpackage.tyb) r3
            r3.a(r0)
            goto L_0x007d
        L_0x008d:
            tya r9 = r7.i
            android.content.Context r0 = r9.a
            java.lang.Class<aryx> r3 = defpackage.aryx.class
            java.lang.Object r3 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r3)
            aryx r3 = (defpackage.aryx) r3
            tyt r4 = new tyt
            tyc r5 = new tyc
            r5.<init>(r3)
            r4.<init>(r0, r8, r5)
            txz r0 = r9.d
            r4.a(r0)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            android.bluetooth.BluetoothDevice r3 = r4.c
            java.lang.String r5 = "RfcommEventStreamMedium: [%s] Connect is requested"
            r0.a((java.lang.String) r5, (java.lang.Object) r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.e
            long r5 = defpackage.aymt.v()
            int r3 = (int) r5
            r0.set(r3)
            tyf r0 = new tyf
            r0.<init>(r4)
            java.lang.String r3 = "connect"
            boolean r0 = r4.a(r0, r3)
            if (r0 != 0) goto L_0x00d4
            if (r1 == 0) goto L_0x00d3
            r8.setSilenceMode(r2)
        L_0x00d3:
            return
        L_0x00d4:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "EventStreamManager: Connect event stream to device %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r8)
            java.util.Map r9 = r9.b
            r9.put(r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udb.a(android.bluetooth.BluetoothDevice, tzi):void");
    }

    public final void a(Intent intent, ucy ucy) {
        if (intent.hasExtra("android.bluetooth.device.extra.DEVICE") && !this.r) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            ((anih) tsp.a.d()).a("onAclChange: state=%s, device=%s", (Object) ucy, (Object) bluetoothDevice);
            if (ucy == ucy.DISCONNECTED) {
                thp.a(this.e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED");
                if (aymw.k() && !aymw.I()) {
                    ((anih) tsp.a.d()).a("FastPairEventStream: Destroy event stream for %s (DISCONNECTED)", (Object) bluetoothDevice);
                    a(bluetoothDevice);
                }
            }
            tvd.a((Runnable) new uca(this, ucy, bluetoothDevice));
            this.a.c(new ucl(this, "processConnection", bluetoothDevice, ucy, intent));
            return;
        }
        jjg jjg = tsp.a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2, byte[] bArr, aehx aehx) {
        arwg arwg;
        ucw ucw;
        try {
            aeha aeha = new aeha(this.e, str, tvt.a().a(), (tue) null);
            aeha.b = new ucb(aeha, str2);
            aeha.a(bArr);
            aehx.a(2, "");
            arwg = this.a;
            ucw = new ucw(this, "SilentPairDone");
        } catch (aeid | BluetoothException | PairingException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e2);
            anih.a("FastPair: silentPair failed to pair.");
            aehx.a(3, e2.getMessage());
            arwg = this.a;
            ucw = new ucw(this, "SilentPairDone");
        } catch (Throwable th) {
            this.a.c(new ucw(this, "SilentPairDone"));
            throw th;
        }
        arwg.c(ucw);
    }

    public final void a(ttg ttg, byte[] bArr, String str, twf twf) {
        aoru aoru;
        if (!aymt.k() && this.r) {
            ((anih) tsp.a.d()).a("FastPair: fastpairing, skip pair request, item=%s", (Object) ttg);
            return;
        }
        ((anih) tsp.a.d()).a("FastPair: start pair, item=%s", (Object) ttg);
        this.a.e(this.t);
        ucz ucz = this.q;
        if (ucz != null) {
            ucz.a(false);
        }
        this.s = new ttg(this.e, ttg.b);
        if (!aymt.k()) {
            aoru = jfm.b(9);
        } else {
            aoru = this.o;
        }
        aorr a2 = aoru.a(new tun(this.e, ttg, str, bArr, this.g, twf), (Object) null);
        if (aymt.k()) {
            this.p.put(ttg.m(), a2);
        }
        this.r = true;
    }

    public final void a(tzi tzi, String str) {
        ((tvs) thl.a(this.e, tvs.class)).b(str, tzi);
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            this.b.a(tzi, true);
        } else {
            this.b.a(tzi, false);
        }
    }

    public final void a(boolean z, String str, boolean z2, String str2) {
        long j2;
        int i2;
        ttg e2 = this.b.e(str);
        if (e2 != null) {
            if (!z) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            e2.a(i2);
            if (aymq.a.a().X()) {
                e2.a(e2.a.a());
                ((anih) tsp.a.d()).a("FastPair: set Lost when pairing process done, %s", (Object) e2.i());
            }
            if (str2 == null) {
                str2 = e2.m();
            }
        }
        if (!z && z2) {
            j2 = aymt.a.a().aH();
        } else {
            j2 = aymt.u();
        }
        this.a.a(this.t, j2);
        this.r = false;
        if (aymt.k() && str2 != null) {
            this.p.remove(str2);
        }
    }
}
