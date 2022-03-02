package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: asbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbt implements ashj {
    public final asbb a;
    public final asda b;
    public final iso c;
    public final aseu d;
    public final AtomicBoolean e;
    public asgs f;
    public final WorkSource g;
    public final gth h = new asbp(this);
    public int i = 1;
    public int j = 1;
    private final arwg k;
    private final boolean l;
    private final asey[] m;
    private final BleFilter[] n;
    private final ascl o = new asbq(this);

    public asbt(Context context, asfa asfa, WorkSource workSource, BleFilter[] bleFilterArr) {
        boolean z;
        this.a = (asbb) thl.a(context, asbb.class);
        this.k = (arwg) thl.a(context, arwg.class);
        this.b = (asda) thl.a(context, asda.class);
        int a2 = asfe.a(asfa.b);
        if ((a2 == 0 ? 1 : a2) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = (asey[]) new aucu(asfa.d, asfa.e).toArray(new asey[0]);
        aseu a3 = aseu.a(asfa.c);
        this.d = a3 == null ? aseu.BLE_ADVERTISE_DATA_TYPE_UNKNOWN : a3;
        this.e = new AtomicBoolean(false);
        this.g = workSource == null ? new WorkSource() : workSource;
        aseu aseu = this.d;
        gtf gtf = new gtf();
        int ordinal = aseu.ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) asil.a.c()).a("asbt", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown BleAdvertiseDataType: %s", (Object) aseu);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                ((anih) ((anih) asil.a.c()).a("asbt", "a", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown BleAdvertiseDataType: %s", (Object) aseu);
                gtf.a(new byte[0]);
                if (bleFilterArr != null && bleFilterArr.length > 0) {
                    ((anih) ((anih) asil.a.c()).a("asbt", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
                }
                bleFilterArr = new BleFilter[]{gtf.a()};
            }
            this.n = bleFilterArr;
            this.c = new iso(10000, -1, 1, TimeUnit.SECONDS);
        }
        gtf.a(new byte[0]);
        ((anih) ((anih) asil.a.c()).a("asbt", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
        bleFilterArr = new BleFilter[]{gtf.a()};
        this.n = bleFilterArr;
        this.c = new iso(10000, -1, 1, TimeUnit.SECONDS);
    }

    public static asgh a(asgd asgd) {
        asgg asgg = (asgg) asgh.d.o();
        asgg.a(asgd);
        return (asgh) asgg.i();
    }

    public final void b() {
        asgs asgs = this.f;
        aucf aucf = (aucf) asgd.e.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgd asgd = (asgd) aucf.b;
        asgd.b = 4;
        asgd.a |= 1;
        aucf aucf2 = (aucf) asev.h.o();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        asev asev = (asev) aucf2.b;
        asev.f = 3;
        asev.a |= 16;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgd asgd2 = (asgd) aucf.b;
        asev asev2 = (asev) aucf2.i();
        asev2.getClass();
        asgd2.d = asev2;
        asgd2.a |= 4;
        asgs.a(a((asgd) aucf.i()));
    }

    public final List c() {
        return Arrays.asList(this.n);
    }

    public final String toString() {
        boolean z = this.l;
        String arrays = Arrays.toString(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 50);
        sb.append("BleScan{inBackground=");
        sb.append(z);
        sb.append(", backgroundStrategies=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }

    public static void a(Context context, asgc asgc) {
        if ((asgc.a & 4) != 0) {
            asfa asfa = asgc.d;
            if (asfa == null) {
                asfa = asfa.f;
            }
            int a2 = asfe.a(asfa.b);
            if (!(a2 == 0 || a2 == 1)) {
                asda asda = (asda) thl.b(context, asda.class);
                if (asda != null && asda.c()) {
                    asfa asfa2 = asgc.d;
                    if (asfa2 == null) {
                        asfa2 = asfa.f;
                    }
                    if (ascn.a(context, (asey[]) new aucu(asfa2.d, asfa.e).toArray(new asey[0]))) {
                        return;
                    }
                }
                throw new asjk(asda.class, asbt.class);
            }
        }
        throw new asji("BleScanStrategy is not correctly set");
    }

    private static BleFilter[] a(aseu aseu, BleFilter[] bleFilterArr) {
        gtf gtf = new gtf();
        aseu aseu2 = aseu.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        int ordinal = aseu.ordinal();
        if (ordinal == 0) {
            ((anih) ((anih) asil.a.c()).a("asbt", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown BleAdvertiseDataType: %s", (Object) aseu);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                return bleFilterArr;
            }
            ((anih) ((anih) asil.a.c()).a("asbt", "a", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unknown BleAdvertiseDataType: %s", (Object) aseu);
            gtf.a(new byte[0]);
            if (bleFilterArr != null && bleFilterArr.length > 0) {
                ((anih) ((anih) asil.a.c()).a("asbt", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
            }
            return new BleFilter[]{gtf.a()};
        }
        gtf.a(new byte[0]);
        ((anih) ((anih) asil.a.c()).a("asbt", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Passing BleFilters but the request dataType is not BleAdvertiseDataType.BLE_ADVERTISE_SCAN_RECORD");
        return new BleFilter[]{gtf.a()};
    }

    /* access modifiers changed from: package-private */
    public final int a(boolean z) {
        return (aymw.z() && z) ? this.j : this.i;
    }

    public final /* bridge */ /* synthetic */ audx a() {
        return asgh.d;
    }

    public final void a(asgs asgs, asiz asiz) {
        this.f = asgs;
        if (this.l) {
            asda asda = this.b;
            ascl ascl = this.o;
            List c2 = c();
            WorkSource workSource = this.g;
            asey[] aseyArr = this.m;
            ascn ascn = asda.l;
            if (ascn != null) {
                if (aseyArr == null) {
                    aseyArr = ascn.a;
                }
                if (ascn.a(ascn.c, aseyArr)) {
                    ascn.e.put(ascl, new ascm(Collections.unmodifiableList(c2), workSource, aseyArr));
                    if (ascn.j) {
                        ascn.c.unregisterReceiver(ascn.n);
                    }
                    ascn.j = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    intentFilter.addAction("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED");
                    if (jkr.b()) {
                        intentFilter.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
                    }
                    if (ascn.a(ascn.f().c)) {
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        if (aymn.h()) {
                            intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON");
                            intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF");
                        }
                    }
                    if (ascn.b(ascn.f().c)) {
                        intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE");
                    }
                    ascn.c.registerReceiver(ascn.n, intentFilter);
                    ascn.h = true;
                    ascn.d();
                } else {
                    ((anih) ((anih) asil.a.b()).a("ascn", "a", 272, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Ignoring request, scanning strategies unsupported (%s), maybe the device doesn't support hardware-offloaded filters.", (Object) Arrays.toString(aseyArr));
                }
            }
            jjg jjg = asil.a;
            asiz.a();
            return;
        }
        this.b.a((asiz) new asbr(this, asiz));
    }

    public final void a(asiz asiz) {
        if (this.l) {
            asda asda = this.b;
            ascl ascl = this.o;
            ascn ascn = asda.l;
            if (ascn != null) {
                ascn.e.remove(ascl);
                if (ascn.e.isEmpty()) {
                    if (ascn.j) {
                        ascn.j = false;
                        ascn.c.unregisterReceiver(ascn.n);
                    }
                    ascn.d();
                } else {
                    ascn.d();
                }
            }
            asiz.a();
            jjg jjg = asil.a;
            return;
        }
        if (this.e.compareAndSet(true, false)) {
            this.b.h();
            jjg jjg2 = asil.a;
        }
        this.b.b(asiz);
    }

    public final void a(byte[] bArr, BluetoothDevice bluetoothDevice, int i2, aseu aseu, int i3) {
        if (this.f != null) {
            this.k.c(new asbs(this, "BLEInformStatusListener", bluetoothDevice, bArr, aseu, i2, i3));
        }
    }
}
