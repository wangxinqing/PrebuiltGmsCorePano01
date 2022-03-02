package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ukz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ukz {
    public static final /* synthetic */ int f = 0;
    private static final ParcelUuid g = new ParcelUuid(urm.a);
    private static final ParcelUuid h = new ParcelUuid(urm.b);
    private final aoru A = tid.b();
    private final SecureRandom B = new SecureRandom();
    public final Map a = new ConcurrentHashMap();
    public ukc b;
    public uky c;
    public ukf d;
    public ukf e;
    private final Context i;
    private final BluetoothManager j;
    private final BluetoothAdapter k;
    private final uru l;
    private final uqm m = new uqm();
    private final ScheduledExecutorService n = tid.a();
    private final Map o = new nz();
    private final gte p;
    private ukw q;
    private final ukq r = new ukq();
    private final int s = ((int) aymi.a.a().D());
    private final Map t = new nz();
    private final Map u = new nz();
    private final byte[] v;
    private ukg w;
    private ukn x;
    private final Map y = new nz();
    private final Set z = new ob();

    public ukz(Context context, uru uru) {
        Context applicationContext = context.getApplicationContext();
        this.i = applicationContext;
        this.l = uru;
        this.p = gtd.a(applicationContext);
        int i2 = Build.VERSION.SDK_INT;
        this.j = (BluetoothManager) this.i.getSystemService("bluetooth");
        this.k = BluetoothAdapter.getDefaultAdapter();
        String a2 = ths.a();
        long nextLong = new SecureRandom().nextLong();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 20);
        sb.append(a2);
        sb.append(nextLong);
        this.v = ulu.a(sb.toString().getBytes(), 2);
    }

    private final uqr a(String str, byte[] bArr, tfw tfw, int i2) {
        String str2;
        if (bArr != null) {
            str2 = jhy.d(bArr);
        } else {
            str2 = null;
        }
        uki uki = new uki(this.i, str, new ujw(this, str2), this.B, tfw, i2);
        if (a(this.l.b(uki))) {
            uqr uqr = uki.e;
            if (!(uqr == null || bArr == null)) {
                this.y.put(str2, new uko(uqr, uki));
            }
            return uqr;
        }
        ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1531, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create an outgoing MultiplexBleSocket to %s because the MediumOperation was unable to be registered.", (Object) str);
        return null;
    }

    public static void e() {
        try {
            Thread.sleep(aymi.a.a().B());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean f() {
        return aymi.a.a().T() && Build.VERSION.SDK_INT >= 29;
    }

    private final boolean g() {
        AdvertiseData advertiseData;
        AdvertiseData advertiseData2;
        AdvertiseData advertiseData3;
        boolean z2;
        int i2;
        int i3 = 2;
        AdvertiseData advertiseData4 = null;
        if (p()) {
            AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder addServiceUuid = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(g);
            Map map = this.a;
            ukn ukn = this.x;
            int i4 = ukn != null ? ukn.a.a : 0;
            byte[] bArr = new byte[128];
            this.B.nextBytes(bArr);
            String str = new String(bArr);
            arwc arwc = new arwc(new byte[10], new uqp());
            arwc.a(str);
            byte[] a2 = a(bArr);
            for (ukd ukd : map.values()) {
                if (ukd != null) {
                    arwc.a(ukd.a);
                    byte[] bArr2 = ukd.b;
                    ByteBuffer allocate = ByteBuffer.allocate(a2.length + bArr2.length);
                    allocate.put(a2);
                    allocate.put(bArr2);
                    a2 = a(allocate.array());
                }
            }
            byte[] a3 = upi.a(2, this.s, arwc.a(), a2, i4);
            if (a3 != null) {
                addServiceUuid.addServiceData(g, a3);
                advertiseData2 = includeTxPowerLevel.build();
                advertiseData = addServiceUuid.build();
            } else {
                ((anih) ((anih) ulh.a.b()).a("ukz", "g", 545, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a BLE advertisement because creating an advertisement header failed.");
                return false;
            }
        } else {
            advertiseData2 = null;
            advertiseData = null;
        }
        if (this.w != null) {
            AdvertiseData.Builder includeTxPowerLevel2 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            AdvertiseData.Builder includeTxPowerLevel3 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            ukk ukk = this.w.c;
            if (ukk != null) {
                includeTxPowerLevel2.addServiceData(h, ukk.a).setIncludeTxPowerLevel(aymi.a.a().a());
                includeTxPowerLevel3.addServiceUuid(h);
            }
            ukj ukj = this.w.d;
            if (ukj != null) {
                includeTxPowerLevel2.addServiceUuid(g);
                if (!g.equals(ukj.a)) {
                    includeTxPowerLevel2.addServiceUuid(ukj.a);
                }
                includeTxPowerLevel3.addServiceData(ukj.a, ukj.b);
            }
            advertiseData4 = includeTxPowerLevel2.build();
            advertiseData3 = includeTxPowerLevel3.build();
        } else {
            advertiseData3 = null;
        }
        ukg ukg = this.w;
        if (ukg == null || ukg.b != 0) {
            Iterator it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                ukd ukd2 = (ukd) it.next();
                if (ukd2 != null && ukd2.c == 0) {
                    z2 = false;
                    break;
                }
            }
        } else {
            z2 = false;
        }
        AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
        if (z2) {
            i2 = (int) aymi.a.a().C();
        } else {
            i2 = 2;
        }
        AdvertiseSettings.Builder advertiseMode = builder.setAdvertiseMode(i2);
        if (!z2) {
            i3 = 3;
        }
        AdvertiseSettings build = advertiseMode.setTxPowerLevel(i3).setConnectable(true).build();
        if (!(advertiseData4 == null || advertiseData3 == null)) {
            ukf ukf = new ukf(build, advertiseData4, advertiseData3);
            if (!a(this.l.b(ukf))) {
                ((anih) ((anih) ulh.a.b()).a("ukz", "g", 605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise a fast advertisement over BLE because the MediumOperation failed to register.");
                return false;
            }
            this.e = ukf;
            jjg jjg = ulh.a;
        }
        if (!(advertiseData2 == null || advertiseData == null)) {
            ukf ukf2 = new ukf(build, advertiseData2, advertiseData);
            if (!a(this.l.b(ukf2))) {
                ((anih) ((anih) ulh.a.b()).a("ukz", "g", 622, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to advertise GATT header over BLE because the MediumOperation failed to register.");
                this.l.c(this.e);
                return false;
            }
            this.d = ukf2;
            jjg jjg2 = ulh.a;
        }
        return true;
    }

    private final void h() {
        ukf ukf = this.d;
        if (ukf == null && this.e == null) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "h", 640, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot stop BLE advertising because there are no active BLE advertisements.");
            return;
        }
        if (ukf != null) {
            this.l.c(ukf);
        }
        ukf ukf2 = this.e;
        if (ukf2 != null) {
            this.l.c(ukf2);
        }
        this.d = null;
        this.e = null;
    }

    private final int i() {
        for (ukp ukp : this.o.values()) {
            if (ukp.a == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final boolean j() {
        return this.q != null;
    }

    private final boolean k() {
        int i2;
        Iterator it = this.o.values().iterator();
        WorkSource workSource = null;
        while (true) {
            if (it.hasNext()) {
                ukp ukp = (ukp) it.next();
                if (ukp.a == 0) {
                    workSource = ukp.b;
                    break;
                }
                workSource = ukp.b;
            } else {
                break;
            }
        }
        if (workSource != null) {
            gtf gtf = new gtf();
            gtf.a(g);
            List singletonList = Collections.singletonList(gtf.a());
            gtj gtj = new gtj();
            if (i() != 0) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            gtj.b(i2);
            gtj.a(1);
            gtj.a(0);
            gtj.a(singletonList);
            gtj.a = 1;
            gtj.a(workSource);
            BleSettings a2 = gtj.a();
            ujz ujz = new ujz(this);
            BleSettings bleSettings = a2;
            ukw ukw = new ukw(this.p, ujz, bleSettings, new ujr(this), this.n, this.r.a());
            if (!a(this.l.b(ukw))) {
                ((anih) ((anih) ulh.a.b()).a("ukz", "k", 1013, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE scanning with settings %s because the MediumOperation failed to register.", (Object) a2);
                return false;
            }
            this.q = ukw;
            return true;
        }
        ((anih) ((anih) ulh.a.b()).a("ukz", "k", 960, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot start BLE scanning because no WorkSource could be found.");
        return false;
    }

    private final void l() {
        if (!j()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "l", 1048, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop BLE scanning because there is no scan in progress.");
            return;
        }
        this.l.c(this.q);
        this.q = null;
    }

    private final boolean m() {
        ukn ukn = new ukn(this.k, this.a, new ujs(this));
        if (!a(this.l.b(ukn))) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "m", 1250, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.x = ukn;
        return true;
    }

    private final boolean n() {
        uky uky = new uky(this.i, new ujt(this));
        if (!a(this.l.b(uky))) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "n", 1283, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open a BLE server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.c = uky;
        return true;
    }

    private final void o() {
        if (!d()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "o", 1356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop the BLE server socket because it was never started.");
            return;
        }
        this.l.c(this.c);
        this.c = null;
        ukn ukn = this.x;
        if (ukn != null) {
            this.l.c(ukn);
            this.x = null;
        }
    }

    private final boolean p() {
        return this.b != null;
    }

    private final boolean q() {
        aejh aejh = new aejh();
        aejg aejg = new aejg();
        for (int i2 = 0; i2 < this.s; i2++) {
            ukb ukb = new ukb(this, i2);
            aejg.a.put(new BluetoothGattCharacteristic(urm.a(ukb.a), 2, 1), ukb);
        }
        aejh.a.put(urm.a, aejg);
        ukc ukc = new ukc(this.i, this.j, aejh);
        if (!a(this.l.b(ukc))) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "q", 1599, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to start an advertisement GATT server because BluetoothLowEnergy was unable to register the MediumOperation.");
            return false;
        }
        this.b = ukc;
        return true;
    }

    private final void r() {
        if (!p()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "r", 1647, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to stop the advertisement GATT server because it's not running.");
            return;
        }
        this.l.c(this.b);
        this.b = null;
    }

    public final synchronized void b(String str) {
        if (!a(str)) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "b", 800, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot stop BLE advertising for service ID %s because it never started.", (Object) str);
            return;
        }
        h();
        ukg ukg = this.w;
        if (ukg != null) {
            if (ukg.a.equals(str)) {
                this.w = null;
            }
        }
        Set<Integer> set = (Set) this.t.remove(str);
        if (set != null) {
            for (Integer intValue : set) {
                this.a.remove(Integer.valueOf(intValue.intValue()));
            }
        }
        if (this.w == null) {
            if (this.t.isEmpty()) {
                if (this.z.isEmpty()) {
                    jjg jjg = ulh.a;
                    r();
                }
                jjg jjg2 = ulh.a;
            }
        }
        if (!g()) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "b", 821, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to restart BLE advertisement after stopping BLE advertisement for service ID %s.", (Object) str);
        }
        jjg jjg22 = ulh.a;
    }

    public final synchronized void c() {
        this.m.b();
    }

    public final void d(String str) {
        this.r.b(str);
        synchronized (this) {
            if (c(str)) {
                int i2 = i();
                this.o.remove(str);
                this.m.a(str);
                int i3 = i();
                if (this.o.isEmpty()) {
                    l();
                } else if (i2 != i3) {
                    l();
                    if (!k()) {
                        ((anih) ((anih) ulh.a.b()).a("ukz", "d", 1127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to restart BLE scan after stopping BLE scan for service ID %s.", (Object) str);
                    }
                }
                jjg jjg = ulh.a;
                return;
            }
            ((anih) ((anih) ulh.a.d()).a("ukz", "d", 1109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot stop BLE scanning for service ID %s because it never started.", (Object) str);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.c != null;
    }

    public final synchronized boolean c(String str) {
        return this.o.containsKey(str);
    }

    public final synchronized void f(String str) {
        if (!e(str)) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "f", 1378, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting BLE connections for service ID %s because it was never started.", (Object) str);
        } else {
            this.u.remove(str);
        }
    }

    private static byte[] h(String str) {
        return ulu.a(str.getBytes(), 3);
    }

    public final synchronized boolean e(String str) {
        return this.c != null && this.u.containsKey(str);
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

    private static byte[] a(byte[] bArr) {
        return ulu.a(bArr, 4);
    }

    public final synchronized upg a(aejw aejw, int i2, upg upg, int i3, Set set) {
        synchronized (this) {
            upg upg2 = upg != null ? upg : new upg();
            if (aejw == null) {
                ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1786, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read from an advertisement GATT server because bluetoothDevice is null.");
                return upg2;
            } else if (!b()) {
                ((anih) ((anih) ulh.a.d()).a("ukz", "a", 1792, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read from an advertisement GATT server because BLE is not available.");
                return upg2;
            } else {
                aeja e2 = aejb.e();
                e2.b();
                e2.a(aymi.m());
                ukm ukm = new ukm(this.i, this.k, aejw, e2.a(), i2, upg2, this.r.a(), i3, set);
                if (!a(this.l.b(ukm))) {
                    ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1822, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read from an advertisement GATT server because the MediumOperation was unable to be registered.");
                }
                this.l.c(ukm);
                return upg2;
            }
        }
    }

    public final boolean b() {
        return aymi.a.a().aF() && Build.VERSION.SDK_INT >= 23 && this.i.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.i.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && this.j != null && this.k != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.uqe a(int r14, java.lang.String r15, byte[] r16, java.lang.String r17, defpackage.tfw r18, int r19) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            r9 = r17
            monitor-enter(r13)
            r10 = 0
            if (r16 == 0) goto L_0x002a
            java.util.Map r2 = r1.y     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = defpackage.jhy.d(r16)     // Catch:{ all -> 0x0027 }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x002a
            java.util.Map r2 = r1.y     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = defpackage.jhy.d(r16)     // Catch:{ all -> 0x0027 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0027 }
            uko r2 = (defpackage.uko) r2     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0025
            uqr r2 = r2.a     // Catch:{ all -> 0x0027 }
            goto L_0x0082
        L_0x0025:
            r2 = r10
            goto L_0x0082
        L_0x0027:
            r0 = move-exception
            goto L_0x00d2
        L_0x002a:
            if (r16 == 0) goto L_0x0032
            java.lang.String r2 = defpackage.jhy.d(r16)     // Catch:{ all -> 0x0027 }
            r11 = r2
            goto L_0x0033
        L_0x0032:
            r11 = r10
        L_0x0033:
            uki r12 = new uki     // Catch:{ all -> 0x0027 }
            android.content.Context r3 = r1.i     // Catch:{ all -> 0x0027 }
            ujw r5 = new ujw     // Catch:{ all -> 0x0027 }
            r5.<init>(r13, r11)     // Catch:{ all -> 0x0027 }
            java.security.SecureRandom r6 = r1.B     // Catch:{ all -> 0x0027 }
            r2 = r12
            r4 = r15
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0027 }
            uru r2 = r1.l     // Catch:{ all -> 0x0027 }
            urt r2 = r2.b(r12)     // Catch:{ all -> 0x0027 }
            boolean r2 = a((defpackage.urt) r2)     // Catch:{ all -> 0x0027 }
            if (r2 != 0) goto L_0x0070
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0027 }
            anie r2 = r2.b()     // Catch:{ all -> 0x0027 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "ukz"
            java.lang.String r4 = "a"
            r5 = 1531(0x5fb, float:2.145E-42)
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0027 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "Failed to create an outgoing MultiplexBleSocket to %s because the MediumOperation was unable to be registered."
            r2.a((java.lang.String) r3, (java.lang.Object) r15)     // Catch:{ all -> 0x0027 }
            r2 = r10
            goto L_0x0082
        L_0x0070:
            uqr r2 = r12.e     // Catch:{ all -> 0x0027 }
            if (r2 != 0) goto L_0x0075
            goto L_0x0082
        L_0x0075:
            if (r16 == 0) goto L_0x0081
            java.util.Map r3 = r1.y     // Catch:{ all -> 0x0027 }
            uko r4 = new uko     // Catch:{ all -> 0x0027 }
            r4.<init>(r2, r12)     // Catch:{ all -> 0x0027 }
            r3.put(r11, r4)     // Catch:{ all -> 0x0027 }
        L_0x0081:
        L_0x0082:
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "ukz"
            if (r2 != 0) goto L_0x00a1
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x0027 }
            anie r2 = r2.b()     // Catch:{ all -> 0x0027 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0027 }
            r6 = 1460(0x5b4, float:2.046E-42)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r4, (int) r6, (java.lang.String) r3)     // Catch:{ all -> 0x0027 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "Failed to retrieve a physical BLE socket to %s when creating a BLE socket for service ID %s."
            r2.a((java.lang.String) r3, (java.lang.Object) r15, (java.lang.Object) r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r13)
            return r10
        L_0x00a1:
            r6 = r14
            uqe r6 = r2.a(r14, r9)     // Catch:{ all -> 0x0027 }
            if (r6 != 0) goto L_0x00d0
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x0027 }
            anie r6 = r6.b()     // Catch:{ all -> 0x0027 }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x0027 }
            r7 = 1470(0x5be, float:2.06E-42)
            anie r3 = r6.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r3)     // Catch:{ all -> 0x0027 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = "Failed to create a per-client BLE socket to %s for service ID %s."
            r3.a((java.lang.String) r4, (java.lang.Object) r15, (java.lang.Object) r9)     // Catch:{ all -> 0x0027 }
            if (r16 != 0) goto L_0x00ce
            boolean r0 = r2 instanceof defpackage.urc     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x00c9
            urc r2 = (defpackage.urc) r2     // Catch:{ all -> 0x0027 }
            r2.a()     // Catch:{ all -> 0x0027 }
            goto L_0x00ce
        L_0x00c9:
            ura r2 = (defpackage.ura) r2     // Catch:{ all -> 0x0027 }
            r2.a()     // Catch:{ all -> 0x0027 }
        L_0x00ce:
            monitor-exit(r13)
            return r10
        L_0x00d0:
            monitor-exit(r13)
            return r6
        L_0x00d2:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukz.a(int, java.lang.String, byte[], java.lang.String, tfw, int):uqe");
    }

    public final synchronized uqe a(upv upv, String str, int i2, tfw tfw) {
        if (upv == null || str == null) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1404, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to create client BLE socket because at least one of blePeripheral or serviceId is null.");
            return null;
        } else if (tfw.b()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "a", 1411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't create client BLE socket to %s for service ID %s because the action has been cancelled", (Object) upv, (Object) str);
            return null;
        } else {
            return this.m.a(upv, new ujv(this, str, tfw, upv));
        }
    }

    public final synchronized void g(String str) {
        if (str != null) {
            uko uko = (uko) this.y.remove(str);
            if (uko != null) {
                this.l.c(uko.b);
            }
        }
    }

    public final synchronized void a() {
        tid.a(this.n, "BluetoothLowEnergy.onLostExecutor");
        tid.a(this.A, "BluetoothLowEnergy.singleThreadOffloader");
        Iterator it = new ob((Collection) this.t.keySet()).iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
        r();
        Iterator it2 = new ob((Collection) this.u.keySet()).iterator();
        while (it2.hasNext()) {
            f((String) it2.next());
        }
        o();
        Iterator it3 = new ob((Collection) this.o.keySet()).iterator();
        while (it3.hasNext()) {
            d((String) it3.next());
        }
        this.m.a();
    }

    public final synchronized void a(BleSighting bleSighting) {
        this.m.a(bleSighting, new uka(this));
    }

    public final void a(Runnable runnable) {
        this.A.execute(runnable);
    }

    public final synchronized void a(uqe uqe) {
        ton ton;
        Iterator it = this.u.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ton = null;
                break;
            }
            String str = (String) it.next();
            if (Arrays.equals(uqe.d(), h(str))) {
                ton = (ton) this.u.get(str);
                break;
            }
        }
        String a2 = ulu.a(uqe.d());
        if (ton == null) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "a", 1309, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received an incoming BLE socket with service ID hash %s, but no clients map to that socket.", (Object) a2);
            ulu.a((ull) uqe, "BLE", a2);
            return;
        }
        urq urq = new urq(38);
        if (!a(this.l.b(urq))) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1320, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to accept an incoming BLE socket because BluetoothLowEnergy was unable to register the MediumOperation.");
            ulu.a((ull) uqe, "BLE", a2);
            return;
        }
        this.z.add(uqe);
        uqe.a(new uju(this, urq, uqe));
        tqa tqa = ton.a;
        tqa.c.a((Runnable) new tpz(tqa, uqe));
    }

    public final synchronized void a(urq urq, uqe uqe) {
        this.l.c(urq);
        this.z.remove(uqe);
        if (this.z.isEmpty() && this.t.isEmpty()) {
            r();
        }
        if (this.z.isEmpty() && this.u.isEmpty()) {
            o();
        }
    }

    public final synchronized boolean a(WorkSource workSource, String str, tov tov, int i2, ParcelUuid parcelUuid) {
        if (workSource == null || str == null || tov == null) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 868, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start BLE scanning because at least one of workSource, serviceId, ordiscoveredPeripheralCallback is null.");
            return false;
        } else if (c(str)) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 875, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start BLE scanning for service ID %s because we are already scanning for that service ID.", (Object) str);
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "a", 883, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE scanning for service ID %s because BLE is not available.", (Object) str);
            return false;
        } else {
            int i3 = i();
            this.m.a(str, tov, parcelUuid);
            this.o.put(str, new ukp(i2, workSource));
            this.r.a(str);
            int i4 = i();
            if (j()) {
                if (i3 != i4) {
                    l();
                }
            }
            if (j() || k()) {
                return true;
            }
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 907, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE scanning for service ID %s because the BLE scan failed to start.", (Object) str);
            d(str);
            return false;
        }
    }

    public final synchronized boolean a(String str) {
        ukg ukg;
        ukg = this.w;
        return (ukg == null || !ukg.a.equals(str)) ? this.t.containsKey(str) : true;
    }

    public final synchronized boolean a(String str, ton ton) {
        if (str == null || ton == null) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1161, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting BLE connections because at least one of serviceId or acceptedConnectionCallback is null.");
            return false;
        } else if (e(str)) {
            ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1168, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting BLE connections for %s because BluetoothLowEnergy is alreadyaccepting BLE connections for that service ID.", (Object) str);
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("ukz", "a", 1176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting BLE connections for %s because BLE is not available.", (Object) str);
            return false;
        } else {
            if (this.z.isEmpty()) {
                jjg jjg = ulh.a;
                o();
            }
            if (!d()) {
                uky uky = new uky(this.i, new ujt(this));
                if (!a(this.l.b(uky))) {
                    ((anih) ((anih) ulh.a.b()).a("ukz", "n", 1283, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open a BLE server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
                    ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1202, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting BLE connections for %s because a BLE server socket could not be spun up.", (Object) str);
                    return false;
                }
                this.c = uky;
            }
            this.u.put(str, ton);
            if (f() && this.x == null) {
                ukn ukn = new ukn(this.k, this.a, new ujs(this));
                if (!a(this.l.b(ukn))) {
                    ((anih) ((anih) ulh.a.b()).a("ukz", "m", 1250, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to open a BLE L2CAP server socket because BluetoothLowEnergy was unable to register the MediumOperation.");
                    ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1216, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting BLE L2CAP connections for %s because a BLE server socket could not be spun up.", (Object) str);
                } else {
                    this.x = ukn;
                }
            }
            return true;
        }
    }

    public final boolean a(String str, byte[] bArr, int i2) {
        int i3;
        if (!this.t.containsKey(str)) {
            int i4 = 0;
            loop0:
            while (true) {
                if (i4 < this.s) {
                    int i5 = i4;
                    while (true) {
                        i3 = i4 + 1;
                        if (i5 < i3) {
                            if (this.a.get(Integer.valueOf(i5)) != null) {
                                break;
                            }
                            i5++;
                        } else {
                            break loop0;
                        }
                    }
                } else {
                    i4 = -1;
                    break;
                }
                i4 = i3;
            }
            if (i4 < 0) {
                ((anih) ((anih) ulh.a.c()).a("ukz", "a", 1679, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot add a GATT advertisement for service ID %s because there are no available advertisement slots.", (Object) str);
                return false;
            }
            byte[] a2 = uph.a(2, 2, h(str), bArr, this.v, false);
            if (a2 == null) {
                ((anih) ((anih) ulh.a.b()).a("ukz", "a", 1695, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot add a GATT advertisement for service ID %s because creating a BleAdvertisementfailed.", (Object) str);
                return false;
            }
            Map map = this.a;
            Integer valueOf = Integer.valueOf(i4);
            map.put(valueOf, new ukd(str, a2, i2));
            ob obVar = new ob();
            obVar.add(valueOf);
            this.t.put(str, obVar);
            return true;
        }
        ((anih) ((anih) ulh.a.c()).a("ukz", "a", 1668, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot add a GATT advertisement for service ID %s because it already exists in the advertisement GATT server.", (Object) str);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a5, code lost:
        if (r26 != null) goto L_0x02a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[SYNTHETIC, Splitter:B:44:0x00f5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0055=Splitter:B:20:0x0055, B:117:0x02d8=Splitter:B:117:0x02d8, B:13:0x0039=Splitter:B:13:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r22, byte[] r23, byte[] r24, int r25, android.os.ParcelUuid r26) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            monitor-enter(r21)
            java.lang.String r5 = "ukz"
            java.lang.String r6 = "a"
            java.lang.String r7 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r8 = 0
            if (r0 != 0) goto L_0x0016
            goto L_0x02d8
        L_0x0016:
            if (r23 == 0) goto L_0x02d8
            if (r2 == 0) goto L_0x0034
            if (r4 != 0) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 368(0x170, float:5.16E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Refusing to start BLE advertising for service ID %s because the request contained both a FastPair model ID and a fast advertisement service UUID, but there's only room for one."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            return r8
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            if (r4 == 0) goto L_0x0055
        L_0x0039:
            ukg r9 = r1.w     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x003e
            goto L_0x0055
        L_0x003e:
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 377(0x179, float:5.28E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Refusing to start BLE advertising for service ID %s because the request contained either a FastPair model ID or a fast advertisement service UUID, but there's no room for either."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            return r8
        L_0x0055:
            boolean r9 = r21.a((java.lang.String) r22)     // Catch:{ all -> 0x02f0 }
            if (r9 == 0) goto L_0x0072
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 386(0x182, float:5.41E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Refusing to start BLE advertising for service ID %s because that service ID is already being advertised."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            return r8
        L_0x0072:
            boolean r9 = r21.b()     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x008f
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.d()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 394(0x18a, float:5.52E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Failed to start BLE advertising for service ID %s because BLE is not available."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            return r8
        L_0x008f:
            if (r2 == 0) goto L_0x00fb
            int r10 = r2.length     // Catch:{ all -> 0x02f0 }
            r11 = 14
            r12 = 3
            if (r10 >= r12) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            if (r10 > r11) goto L_0x00af
            int r11 = r10 + 1
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)     // Catch:{ all -> 0x02f0 }
            int r10 = r10 + r10
            r10 = r10 & 30
            byte r10 = (byte) r10     // Catch:{ all -> 0x02f0 }
            r11.put(r10)     // Catch:{ all -> 0x02f0 }
            r11.put(r2)     // Catch:{ all -> 0x02f0 }
            byte[] r10 = r11.array()     // Catch:{ all -> 0x02f0 }
            goto L_0x00d7
        L_0x00af:
            jjg r13 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r13 = r13.c()     // Catch:{ all -> 0x02f0 }
            anih r13 = (defpackage.anih) r13     // Catch:{ all -> 0x02f0 }
            java.lang.String r14 = "uqn"
            java.lang.String r15 = "a"
            r9 = 53
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r8 = r13.a((java.lang.String) r14, (java.lang.String) r15, (int) r9, (java.lang.String) r8)     // Catch:{ all -> 0x02f0 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x02f0 }
            java.lang.String r9 = "Out of range modelId. Expected between %d and %d but got %d instead."
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r8.a((java.lang.String) r9, (java.lang.Object) r12, (java.lang.Object) r11, (java.lang.Object) r10)     // Catch:{ all -> 0x02f0 }
            r10 = 0
        L_0x00d7:
            if (r10 != 0) goto L_0x00f5
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r3 = r3.b()     // Catch:{ all -> 0x02f0 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x02f0 }
            r4 = 405(0x195, float:5.68E-43)
            anie r3 = r3.a((java.lang.String) r5, (java.lang.String) r6, (int) r4, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x02f0 }
            java.lang.String r4 = "Failed to start BLE advertising for service ID %s because the FastPair service data failed to serialize from FastPair model ID %s."
            java.lang.String r2 = defpackage.ulu.a((byte[]) r24)     // Catch:{ all -> 0x02f0 }
            r3.a((java.lang.String) r4, (java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x00f5:
            ukk r8 = new ukk     // Catch:{ all -> 0x02f0 }
            r8.<init>(r10)     // Catch:{ all -> 0x02f0 }
            goto L_0x0103
        L_0x00fb:
            ukg r8 = r1.w     // Catch:{ all -> 0x02f0 }
            if (r8 == 0) goto L_0x0102
            ukk r8 = r8.c     // Catch:{ all -> 0x02f0 }
            goto L_0x0103
        L_0x0102:
            r8 = 0
        L_0x0103:
            if (r4 == 0) goto L_0x0132
            r9 = 2
            r10 = 2
            r11 = 0
            byte[] r13 = r1.v     // Catch:{ all -> 0x02f0 }
            r14 = 1
            r12 = r23
            byte[] r9 = defpackage.uph.a(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x012b
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 426(0x1aa, float:5.97E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Failed to start BLE advertising for service ID %s because the fast advertisement failed to serialize."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x012b:
            ukj r10 = new ukj     // Catch:{ all -> 0x02f0 }
            r10.<init>(r4, r9)     // Catch:{ all -> 0x02f0 }
            r15 = r10
            goto L_0x013b
        L_0x0132:
            ukg r9 = r1.w     // Catch:{ all -> 0x02f0 }
            if (r9 == 0) goto L_0x013a
            ukj r9 = r9.d     // Catch:{ all -> 0x02f0 }
            r15 = r9
            goto L_0x013b
        L_0x013a:
            r15 = 0
        L_0x013b:
            if (r4 != 0) goto L_0x029c
            java.util.Set r9 = r1.z     // Catch:{ all -> 0x02f0 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x02f0 }
            if (r9 == 0) goto L_0x014a
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            r21.r()     // Catch:{ all -> 0x02f0 }
        L_0x014a:
            boolean r9 = r21.p()     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x01da
            aejh r9 = new aejh     // Catch:{ all -> 0x02f0 }
            r9.<init>()     // Catch:{ all -> 0x02f0 }
            aejg r10 = new aejg     // Catch:{ all -> 0x02f0 }
            r10.<init>()     // Catch:{ all -> 0x02f0 }
            r11 = 0
        L_0x015b:
            int r12 = r1.s     // Catch:{ all -> 0x02f0 }
            if (r11 >= r12) goto L_0x0183
            ukb r12 = new ukb     // Catch:{ all -> 0x02f0 }
            r12.<init>(r1, r11)     // Catch:{ all -> 0x02f0 }
            java.util.Map r13 = r10.a     // Catch:{ all -> 0x02f0 }
            android.bluetooth.BluetoothGattCharacteristic r14 = new android.bluetooth.BluetoothGattCharacteristic     // Catch:{ all -> 0x02f0 }
            r17 = r8
            int r8 = r12.a     // Catch:{ all -> 0x02f0 }
            java.util.UUID r8 = defpackage.urm.a((int) r8)     // Catch:{ all -> 0x02f0 }
            r18 = r15
            r15 = 2
            r4 = 1
            r14.<init>(r8, r15, r4)     // Catch:{ all -> 0x02f0 }
            r13.put(r14, r12)     // Catch:{ all -> 0x02f0 }
            int r11 = r11 + 1
            r4 = r26
            r8 = r17
            r15 = r18
            goto L_0x015b
        L_0x0183:
            r17 = r8
            r18 = r15
            r4 = 1
            java.util.UUID r8 = defpackage.urm.a     // Catch:{ all -> 0x02f0 }
            java.util.Map r11 = r9.a     // Catch:{ all -> 0x02f0 }
            r11.put(r8, r10)     // Catch:{ all -> 0x02f0 }
            ukc r8 = new ukc     // Catch:{ all -> 0x02f0 }
            android.content.Context r10 = r1.i     // Catch:{ all -> 0x02f0 }
            android.bluetooth.BluetoothManager r11 = r1.j     // Catch:{ all -> 0x02f0 }
            r8.<init>(r10, r11, r9)     // Catch:{ all -> 0x02f0 }
            uru r9 = r1.l     // Catch:{ all -> 0x02f0 }
            urt r9 = r9.b(r8)     // Catch:{ all -> 0x02f0 }
            boolean r9 = a((defpackage.urt) r9)     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x01d7
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "ukz"
            java.lang.String r4 = "q"
            r8 = 1599(0x63f, float:2.24E-42)
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r2 = r2.a((java.lang.String) r3, (java.lang.String) r4, (int) r8, (java.lang.String) r9)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Fail to start an advertisement GATT server because BluetoothLowEnergy was unable to register the MediumOperation."
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x02f0 }
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 466(0x1d2, float:6.53E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Failed to start BLE advertising for service ID %s because the advertisement GATT server failed to start."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x01d7:
            r1.b = r8     // Catch:{ all -> 0x02f0 }
            goto L_0x01df
        L_0x01da:
            r17 = r8
            r18 = r15
            r4 = 1
        L_0x01df:
            java.lang.String r8 = "ukz"
            java.lang.String r15 = "a"
            java.lang.String r14 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.util.Map r9 = r1.t     // Catch:{ all -> 0x02f0 }
            boolean r9 = r9.containsKey(r0)     // Catch:{ all -> 0x02f0 }
            if (r9 == 0) goto L_0x0203
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.c()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 1668(0x684, float:2.337E-42)
            anie r2 = r2.a((java.lang.String) r8, (java.lang.String) r15, (int) r3, (java.lang.String) r14)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Cannot add a GATT advertisement for service ID %s because it already exists in the advertisement GATT server."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            goto L_0x0268
        L_0x0203:
            r9 = 0
        L_0x0204:
            int r10 = r1.s     // Catch:{ all -> 0x02f0 }
            if (r9 < r10) goto L_0x020c
            r9 = -1
            r16 = -1
            goto L_0x0224
        L_0x020c:
            r10 = r9
        L_0x020d:
            int r11 = r9 + 1
            if (r10 >= r11) goto L_0x0222
            java.util.Map r12 = r1.a     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x02f0 }
            if (r12 != 0) goto L_0x0220
            int r10 = r10 + 1
            goto L_0x020d
        L_0x0220:
            r9 = r11
            goto L_0x0204
        L_0x0222:
            r16 = r9
        L_0x0224:
            if (r16 >= 0) goto L_0x023c
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.c()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 1679(0x68f, float:2.353E-42)
            anie r2 = r2.a((java.lang.String) r8, (java.lang.String) r15, (int) r3, (java.lang.String) r14)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Cannot add a GATT advertisement for service ID %s because there are no available advertisement slots."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            goto L_0x0268
        L_0x023c:
            r9 = 2
            r10 = 2
            byte[] r11 = h(r22)     // Catch:{ all -> 0x02f0 }
            byte[] r13 = r1.v     // Catch:{ all -> 0x02f0 }
            r19 = 0
            r12 = r23
            r4 = r14
            r20 = 1
            r14 = r19
            byte[] r9 = defpackage.uph.a(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x02f0 }
            if (r9 != 0) goto L_0x0280
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 1695(0x69f, float:2.375E-42)
            anie r2 = r2.a((java.lang.String) r8, (java.lang.String) r15, (int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Cannot add a GATT advertisement for service ID %s because creating a BleAdvertisementfailed."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
        L_0x0268:
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 476(0x1dc, float:6.67E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Failed to start BLE advertising for service ID %s because the GATT advertisements were unable to be added to the advertisement GATT server."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x0280:
            java.util.Map r4 = r1.a     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x02f0 }
            ukd r10 = new ukd     // Catch:{ all -> 0x02f0 }
            r10.<init>(r0, r9, r3)     // Catch:{ all -> 0x02f0 }
            r4.put(r8, r10)     // Catch:{ all -> 0x02f0 }
            ob r4 = new ob     // Catch:{ all -> 0x02f0 }
            r4.<init>()     // Catch:{ all -> 0x02f0 }
            r4.add(r8)     // Catch:{ all -> 0x02f0 }
            java.util.Map r8 = r1.t     // Catch:{ all -> 0x02f0 }
            r8.put(r0, r4)     // Catch:{ all -> 0x02f0 }
            goto L_0x02a2
        L_0x029c:
            r17 = r8
            r18 = r15
            r20 = 1
        L_0x02a2:
            if (r2 == 0) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            if (r26 == 0) goto L_0x02b2
        L_0x02a7:
            ukg r2 = new ukg     // Catch:{ all -> 0x02f0 }
            r8 = r17
            r10 = r18
            r2.<init>(r0, r3, r8, r10)     // Catch:{ all -> 0x02f0 }
            r1.w = r2     // Catch:{ all -> 0x02f0 }
        L_0x02b2:
            r21.h()     // Catch:{ all -> 0x02f0 }
            boolean r2 = r21.g()     // Catch:{ all -> 0x02f0 }
            if (r2 != 0) goto L_0x02d6
            jjg r2 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r2 = r2.b()     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            r3 = 498(0x1f2, float:6.98E-43)
            anie r2 = r2.a((java.lang.String) r5, (java.lang.String) r6, (int) r3, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x02f0 }
            java.lang.String r3 = "Failed to start BLE advertising for service ID %s because the BLE advertisement failed to start."
            r2.a((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ all -> 0x02f0 }
            r21.b(r22)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x02d6:
            monitor-exit(r21)
            return r20
        L_0x02d8:
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x02f0 }
            anie r0 = r0.b()     // Catch:{ all -> 0x02f0 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02f0 }
            r2 = 361(0x169, float:5.06E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r6, (int) r2, (java.lang.String) r7)     // Catch:{ all -> 0x02f0 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x02f0 }
            java.lang.String r2 = "Refusing to start BLE advertising because a null serviceId or advertisementsBytes was passed in."
            r0.a((java.lang.String) r2)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r21)
            r0 = 0
            return r0
        L_0x02f0:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x02f4
        L_0x02f3:
            throw r0
        L_0x02f4:
            goto L_0x02f3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukz.a(java.lang.String, byte[], byte[], int, android.os.ParcelUuid):boolean");
    }
}
