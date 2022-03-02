package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: vwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwi {
    public final ScheduledExecutorService a = tid.a();
    public int b = -2;
    public final Map c = new nz();
    public vwe d;
    public int e = -1;
    private final Context f;
    private final BluetoothAdapter g;
    private tgm h;
    private tgn i;
    private ScanCallback j;
    private boolean k;
    private boolean l;
    private ScheduledFuture m;
    private AdvertiseCallback n;

    public vwi(Context context) {
        this.f = context;
        this.g = BluetoothAdapter.getDefaultAdapter();
        this.h = tgm.a();
        this.i = tgn.a();
    }

    public static String c(int i2) {
        return i2 != -2 ? i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "SCAN_MODE_LOW_LATENCY" : "SCAN_MODE_BALANCED" : "SCAN_MODE_LOW_POWER" : "SCAN_MODE_OPPORTUNISTIC" : "NONE";
    }

    public static String d(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 1 ? "Unknown" : "Silent" : "Notify" : "None";
    }

    private final boolean g() {
        BluetoothAdapter bluetoothAdapter = this.g;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }

    private final vwe h() {
        anhk i2 = amzy.a(this.c.values()).listIterator();
        vwe vwe = null;
        while (i2.hasNext()) {
            vwe vwe2 = ((vwf) i2.next()).a;
            if (vwe == null || vwg.LOST.equals(vwe.c)) {
                vwe = vwe2;
            }
            if (vwg.CLOSE.equals(vwe2.c)) {
                if (vwe2.b == 0) {
                    return vwe2;
                }
                vwe = vwe2;
            }
        }
        return vwe;
    }

    public final synchronized void b(int i2) {
        ((anih) ((anih) vvj.a.d()).a("vwi", "b", 457, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Scanning for FastInitiation failed with error %s. Stopping scan.", (Object) uld.a(i2));
        f();
    }

    public final synchronized boolean c() {
        return this.n != null;
    }

    public final synchronized boolean e() {
        return this.j != null;
    }

    public final synchronized void f() {
        if (!e()) {
            ((anih) ((anih) vvj.a.d()).a("vwi", "f", 594, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop scanning for FastInitiation. Not scanning.");
            return;
        }
        ScanCallback scanCallback = this.j;
        if (scanCallback != null) {
            this.i.a(scanCallback);
            this.j = null;
        }
        this.d = null;
        this.b = -2;
        anhk i2 = amzy.a(this.c.values()).listIterator();
        while (i2.hasNext()) {
            ((vwf) i2.next()).d.cancel(true);
        }
        this.c.clear();
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.m = null;
        }
        ((anih) ((anih) vvj.a.d()).a("vwi", "f", 615, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped scanning for FastInitiation");
    }

    private final boolean a(vjf vjf, int i2) {
        if (!ayni.q() || !this.f.getPackageManager().hasSystemFeature("android.hardware.bluetooth") || !this.f.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || !wia.a(this.f) || this.i == null || (!g() && !b())) {
            ((anih) ((anih) vvj.a.d()).a("vwi", "a", 376, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to scan for FastInitiation. Scanning is not supported on this device.");
            return false;
        } else if (e() && this.b == i2) {
            return true;
        } else {
            if (e()) {
                this.i.a(this.j);
                this.j = null;
                this.b = -2;
            }
            List singletonList = Collections.singletonList(new ScanFilter.Builder().setServiceUuid(vvy.a).build());
            ScanSettings build = new ScanSettings.Builder().setScanMode(i2).setCallbackType(1).setReportDelay(0).build();
            FastInitiation$2 fastInitiation$2 = new FastInitiation$2(this, this.f, "nearby", vjf);
            tgn tgn = this.i;
            if (tgn == null || !tgn.a(singletonList, build, fastInitiation$2)) {
                ((anih) ((anih) vvj.a.d()).a("vwi", "a", 424, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Call to startScan for FastInitiation failed.");
                return false;
            }
            this.j = fastInitiation$2;
            this.b = i2;
            ((anih) ((anih) vvj.a.d()).a("vwi", "a", 430, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Started scanning for FastInitiation with mode: %s", (Object) c(i2));
            return true;
        }
    }

    private final boolean c(vjf vjf) {
        vwg vwg;
        vwe h2 = h();
        if (h2 != null) {
            vwg = h2.c;
        } else {
            vwg = vwg.LOST;
        }
        if (!this.k) {
            return a(vjf, -1);
        }
        if (vwg.LOST.equals(vwg) && !this.l) {
            return a(vjf, 0);
        }
        return a(vjf, 2);
    }

    public final synchronized void d() {
        if (!c()) {
            ((anih) ((anih) vvj.a.d()).a("vwi", "d", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop advertising FastInitiation. Not advertising.");
            return;
        }
        this.h.a(this.n);
        this.n = null;
        this.e = -1;
        ((anih) ((anih) vvj.a.d()).a("vwi", "d", 323, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped advertising FastInitiation");
    }

    /* access modifiers changed from: package-private */
    public final void b(vjf vjf) {
        vwe h2 = h();
        vwe vwe = this.d;
        if (!(vwe instanceof vwe) || !(h2 instanceof vwe)) {
            if (vwe == h2) {
                return;
            }
        } else if (ius.a(Integer.valueOf(vwe.a), Integer.valueOf(h2.a)) && ius.a(Integer.valueOf(vwe.b), Integer.valueOf(h2.b)) && ius.a(vwe.c, h2.c)) {
            return;
        }
        if (h2 != null) {
            vjf.a(h2.a, h2.b, h2.c);
            this.d = new vwe(h2.a, h2.b, h2.c);
            return;
        }
        vwe vwe2 = this.d;
        if (vwe2 != null) {
            vjf.a(vwe2.a, vwe2.b, vwg.LOST);
            this.d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r2.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            ayni r0 = defpackage.ayni.a
            aynj r0 = r0.a()
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x001e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x001e
            android.bluetooth.BluetoothAdapter r0 = r2.g
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isBleScanAlwaysAvailable()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            return r0
        L_0x001e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwi.b():boolean");
    }

    public final synchronized void a() {
        if (c()) {
            d();
        }
        if (e()) {
            f();
        }
        this.a.shutdown();
    }

    public final synchronized void a(vjf vjf) {
        if (e()) {
            this.l = false;
            c(vjf);
            this.m = null;
            ((anih) ((anih) vvj.a.d()).a("vwi", "a", 452, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastInitiation warming period has ended");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(vjf vjf, ScanResult scanResult) {
        double d2;
        if (e()) {
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord == null) {
                jjg jjg = vvj.a;
            } else {
                vvy a2 = vvy.a(scanRecord.getServiceData(vvy.a));
                if (a2 == null) {
                    jjg jjg2 = vvj.a;
                } else {
                    jjg jjg3 = vvj.a;
                    scanResult.getRssi();
                    String address = scanResult.getDevice().getAddress();
                    int rssi = scanResult.getRssi();
                    vwf vwf = (vwf) this.c.get(address);
                    if (vwf == null) {
                        vwf = new vwf(this, new vwa(this, vjf, address));
                        this.c.put(address, vwf);
                    } else {
                        vwf.d.cancel(true);
                        vwf.d = vwf.e.a.schedule(vwf.c, ayni.r(), TimeUnit.MILLISECONDS);
                    }
                    int i2 = a2.c;
                    vwe vwe = vwf.a;
                    vwe.a = i2;
                    vwe.b = a2.d;
                    long aO = ayni.a.a().aO();
                    vwh vwh = vwf.b;
                    double d3 = (double) (rssi + ((int) aO));
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    vwh.d = d3;
                    if (!vwh.f) {
                        long j2 = elapsedRealtime - vwh.c;
                        int i3 = vwh.e >= d3 ? vwh.b : vwh.a;
                        if (i3 != 0) {
                            double d4 = (double) j2;
                            double d5 = (double) i3;
                            Double.isNaN(d4);
                            Double.isNaN(d5);
                            d2 = Math.min(d4 / d5, 1.0d);
                        } else {
                            d2 = 1.0d;
                        }
                        d3 = ((1.0d - d2) * vwh.e) + (vwh.d * d2);
                        vwh.e = d3;
                    } else {
                        vwh.e = d3;
                        vwh.f = false;
                    }
                    vwh.c = elapsedRealtime;
                    double b2 = guq.b((int) d3, a2.e) * 100.0d;
                    vwg vwg = vwf.a.c;
                    if (b2 < ((double) ayni.a.a().T())) {
                        vwf.a(vwg.CLOSE);
                    } else if (b2 >= ((double) ayni.a.a().U())) {
                        if (b2 < ((double) ayni.a.a().V())) {
                            vwf.a(vwg.FAR);
                        } else if (b2 >= ((double) ayni.a.a().W())) {
                            vwf.a(vwg.LOST);
                        } else if (vwg.CLOSE.equals(vwg)) {
                            vwf.a(vwg.FAR);
                        }
                    } else if (vwg.LOST.equals(vwg)) {
                        vwf.a(vwg.FAR);
                    }
                    c(vjf);
                }
            }
            b(vjf);
            return;
        }
        jjg jjg4 = vvj.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(vjf vjf, String str) {
        this.c.remove(str);
        if (e()) {
            c(vjf);
            b(vjf);
        }
    }

    public final synchronized boolean a(int i2) {
        String str;
        int i3 = i2;
        synchronized (this) {
            this.h = tgm.a();
            String str2 = "vwi";
            if (!ayni.q()) {
                str = str2;
            } else if (!this.f.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                str = str2;
            } else if (!this.f.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                str = str2;
            } else if (!g()) {
                str = str2;
            } else if (this.h != null) {
                if (c()) {
                    if (this.e != i3) {
                        d();
                        ((anih) ((anih) vvj.a.d()).a(str2, "a", 275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Restarting FastInitiation advertising with type=%s.", (Object) d(i2));
                    } else {
                        ((anih) ((anih) vvj.a.d()).a(str2, "a", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise FastInitiation. Already advertising with type=%s.", (Object) d(i2));
                        return false;
                    }
                }
                vvy a2 = vvy.a(i2);
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(true).build();
                aosh f2 = aosh.f();
                vwb vwb = new vwb(f2);
                tgm tgm = this.h;
                AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(vvy.a);
                ParcelUuid parcelUuid = vvy.a;
                int i4 = a2.c;
                int i5 = a2.d;
                int i6 = (i5 & 7) << 2;
                byte[] bArr = {(byte) (i6 | ((byte) (i4 << 5))), (byte) (-a2.e)};
                byte[] bArr2 = vvy.b;
                char c2 = 0;
                byte[][] bArr3 = {bArr};
                char c3 = 0;
                while (c3 <= 0) {
                    byte[] bArr4 = bArr3[c2];
                    int length = bArr2.length;
                    int length2 = bArr4.length;
                    byte[][] bArr5 = bArr3;
                    byte[] bArr6 = new byte[(length + length2)];
                    System.arraycopy(bArr2, 0, bArr6, 0, length);
                    System.arraycopy(bArr4, 0, bArr6, length, length2);
                    bArr2 = bArr6;
                    bArr3 = bArr5;
                    str2 = str2;
                    c3 = 1;
                    c2 = 0;
                }
                String str3 = str2;
                if (tgm.a(build, addServiceUuid.addServiceData(parcelUuid, bArr2).build(), vwb)) {
                    try {
                        f2.get(ayni.L(), TimeUnit.SECONDS);
                        this.n = vwb;
                        this.e = i3;
                        jjg jjg = vvj.a;
                        return true;
                    } catch (InterruptedException e2) {
                        String str4 = str3;
                        Thread.currentThread().interrupt();
                        ((anih) ((anih) vvj.a.b()).a(str4, "a", 302, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to start FastInitiation advertising.");
                        return false;
                    } catch (ExecutionException e3) {
                        anih anih = (anih) vvj.a.b();
                        anih.a((Throwable) e3);
                        ((anih) anih.a(str3, "a", 305, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start FastInitiation advertising.");
                        return false;
                    } catch (TimeoutException e4) {
                        anih anih2 = (anih) vvj.a.b();
                        anih2.a((Throwable) e4);
                        ((anih) anih2.a(str3, "a", 307, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start FastInitiation advertising in %d seconds.", ayni.L());
                        return false;
                    }
                } else {
                    ((anih) ((anih) vvj.a.b()).a(str3, "a", 286, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start FastInitiation advertising.");
                    return false;
                }
            } else {
                str = str2;
            }
            ((anih) ((anih) vvj.a.d()).a(str, "a", 261, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise FastInitiation. Advertising is not supported on this device.");
            return false;
        }
    }

    public final synchronized boolean a(boolean z, vjf vjf) {
        boolean c2;
        this.i = tgn.a();
        this.k = z;
        this.l = true;
        c2 = c(vjf);
        if (c2) {
            this.m = this.a.schedule(new vvz(this, vjf), ayni.a.a().aa(), TimeUnit.MILLISECONDS);
        } else {
            this.k = false;
            this.l = false;
        }
        return c2;
    }
}
