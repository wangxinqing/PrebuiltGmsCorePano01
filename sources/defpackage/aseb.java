package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSighting;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$1;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$4;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: aseb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aseb {
    public static final /* synthetic */ int l = 0;
    private static final long m = (TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - SystemClock.elapsedRealtimeNanos());
    public final arwg a;
    public final Map b = new HashMap();
    public final asdz c;
    public final arwm d = new asdw(this, "FastPairScanner_checkForLost");
    public final arwm e = new asdx(this, "FastPairScanner_loseEverything");
    public List f;
    public boolean g = false;
    public final Queue h;
    public asea i;
    public final arwm j = new asdy(this, "FastPairScanner_scanModeDowngrade");
    public int k = 1;
    private final Context n;
    private final ScanCallback o = new FastPairScanner$1(this, "nearby", "FastPairScanner");
    private final IntentFilter p = new IntentFilter("com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST");
    private final IntentFilter q = new IntentFilter("com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED");
    private final IntentFilter r = new IntentFilter("com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED");
    private final BroadcastReceiver s = new FastPairScanner$4(this, "nearby");
    private final BroadcastReceiver t = new FastPairScanner$6(this, "nearby");

    public aseb(Context context, asdz asdz) {
        this.n = context;
        this.c = asdz;
        this.a = (arwg) thl.a(context, arwg.class);
        if (aymn.g()) {
            this.h = new ConcurrentLinkedQueue();
        } else {
            this.h = amyh.a((int) aymn.j());
        }
    }

    static int a(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            return 1;
        }
        if (i2 == -1) {
            return 2;
        }
        if (i2 == 0) {
            return 3;
        }
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 5;
        }
        ((anih) ((anih) asil.a.c()).a("aseb", "a", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: Unknown ScanSettings scan mode: %s", i2);
        return 1;
    }

    private final void b(int i2) {
        int a2 = a(i2);
        int i3 = this.k;
        if (i3 == 0) {
            throw null;
        } else if (i3 != a2) {
            this.k = a2;
            this.c.b(a2);
        }
    }

    private static tgn e() {
        tgn a2 = tgn.a();
        if (a2 == null) {
            ((anih) ((anih) asil.a.d()).a("aseb", "e", 390, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: BluetoothLeScannerCompat is null, Bluetooth might be off. Enabled=%b", (Object) Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().isEnabled()));
        }
        return a2;
    }

    public final boolean c() {
        return ((PowerManager) this.n.getSystemService("power")).isInteractive();
    }

    public final long d() {
        if (this.k == a((int) aymn.i())) {
            return aymt.a.a().an();
        }
        return aymt.p();
    }

    static BleSighting a(ScanResult scanResult) {
        if (scanResult.getScanRecord() != null) {
            return new BleSighting(scanResult.getDevice(), scanResult.getScanRecord().getBytes(), scanResult.getRssi(), scanResult.getTimestampNanos() + m);
        }
        return null;
    }

    public final void b() {
        this.a.e(this.d);
        if (!this.b.isEmpty()) {
            long longValue = ((Long) Collections.min(this.b.values())).longValue();
            this.a.a(this.d, d() - (SystemClock.elapsedRealtime() - longValue));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.i != null) {
            ((anih) ((anih) asil.a.d()).a("aseb", "a", 345, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: Stopping scan.");
            tgn e2 = e();
            if (e2 != null) {
                try {
                    e2.a(this.o);
                    this.i.b = (int) (SystemClock.uptimeMillis() - this.i.a);
                    if (aymn.g()) {
                        while (((long) this.h.size()) >= aymn.j()) {
                            this.h.poll();
                        }
                    }
                    this.h.add(this.i);
                    this.i = null;
                } catch (IllegalStateException e3) {
                    anih anih = (anih) asil.a.b();
                    anih.a((Throwable) e3);
                    ((anih) anih.a("aseb", "a", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not stop scan (ok if Bluetooth is off).");
                }
                try {
                    if (aymw.s()) {
                        thp.a(this.n, this.s);
                    }
                } catch (IllegalArgumentException e4) {
                    anih anih2 = (anih) asil.a.c();
                    anih2.a((Throwable) e4);
                    ((anih) anih2.a("aseb", "a", 369, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to unregister receiver.");
                }
            }
            this.e.run();
            this.f = null;
            b(Integer.MIN_VALUE);
            return;
        }
        ((anih) ((anih) asil.a.d()).a("aseb", "a", 341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: Scan already stopped.");
    }

    public final void a(List list, int i2) {
        byte[] bArr;
        byte[] bArr2;
        if (list == null) {
            ((anih) ((anih) asil.a.d()).a("aseb", "a", 285, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: Scan without filters, no-op.");
            return;
        }
        if (list.equals(this.f)) {
            int i3 = this.k;
            int a2 = a(i2);
            if (i3 == 0) {
                throw null;
            } else if (i3 == a2 && ((aymn.f() && this.i != null) || !aymn.f())) {
                ((anih) ((anih) asil.a.d()).a("aseb", "a", 292, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairScanner: Same filters, scan mode and currentScan=%s, no-op.", (Object) this.i);
                return;
            }
        }
        a();
        if (!list.isEmpty()) {
            anih anih = (anih) ((anih) asil.a.d()).a("aseb", "a", 299, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            int i4 = this.k;
            String a3 = avay.a(i4);
            if (i4 != 0) {
                anih.a("FastPairScanner: Starting scan, mode %s -> %s", (Object) a3, (Object) avay.a(a(i2)));
                tgn e2 = e();
                if (e2 != null) {
                    try {
                        ArrayList arrayList = new ArrayList(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            BleFilter bleFilter = (BleFilter) it.next();
                            ScanFilter.Builder builder = new ScanFilter.Builder();
                            if (!amrk.a(bleFilter.b)) {
                                builder.setDeviceAddress(bleFilter.b);
                            }
                            if (!amrk.a(bleFilter.a)) {
                                builder.setDeviceName(bleFilter.a);
                            }
                            int i5 = bleFilter.h;
                            if (!(i5 == -1 || (bArr2 = bleFilter.i) == null)) {
                                byte[] bArr3 = bleFilter.j;
                                if (bArr3 != null) {
                                    builder.setManufacturerData(i5, bArr2, bArr3);
                                } else {
                                    builder.setManufacturerData(i5, bArr2);
                                }
                            }
                            ParcelUuid parcelUuid = bleFilter.e;
                            if (!(parcelUuid == null || (bArr = bleFilter.f) == null)) {
                                byte[] bArr4 = bleFilter.g;
                                if (bArr4 != null) {
                                    builder.setServiceData(parcelUuid, bArr, bArr4);
                                } else {
                                    builder.setServiceData(parcelUuid, bArr);
                                }
                            }
                            ParcelUuid parcelUuid2 = bleFilter.c;
                            if (parcelUuid2 != null) {
                                ParcelUuid parcelUuid3 = bleFilter.d;
                                if (parcelUuid3 != null) {
                                    builder.setServiceUuid(parcelUuid2, parcelUuid3);
                                } else {
                                    builder.setServiceUuid(parcelUuid2);
                                }
                            }
                            arrayList.add(builder.build());
                        }
                        e2.a(arrayList, new ScanSettings.Builder().setScanMode(i2).build(), this.o);
                        if (this.i == null) {
                            this.i = new asea(SystemClock.uptimeMillis(), a(i2));
                        }
                        this.f = list;
                        b(i2);
                        if (aymw.s()) {
                            thp.a(this.n, this.s, this.p);
                            this.n.registerReceiver(this.s, this.p);
                        }
                        if (aymn.a.a().i()) {
                            thp.a(this.n, this.t, this.q);
                            thp.a(this.n, this.t, this.r);
                        }
                    } catch (IllegalStateException | NullPointerException e3) {
                        anih anih2 = (anih) asil.a.b();
                        anih2.a(e3);
                        ((anih) anih2.a("aseb", "a", 329, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Could not start scan.");
                        if (!aymw.a.a().bc() && (e3 instanceof NullPointerException)) {
                            throw e3;
                        }
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
