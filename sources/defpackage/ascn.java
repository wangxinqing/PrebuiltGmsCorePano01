package defpackage;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import com.google.location.nearby.direct.bluetooth.state.BackgroundBleScanner$3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: ascn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascn {
    public static final asey[] a = {asey.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS};
    public static final ParcelUuid b = ParcelUuid.fromString("0000FE2C-0000-1000-8000-00805F9B34FB");
    public final Context c;
    public final arwg d;
    public final Map e = new HashMap();
    public final jbs f;
    public aseb g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Integer l;
    public long m = 0;
    public final BroadcastReceiver n = new BackgroundBleScanner$3(this, "nearby");
    public int o = 1;
    private final ascs p;
    private final asht q;
    private BleSettings r;
    private List s = Collections.emptyList();
    private final arwm t = new ascf(this, "BackgroundBleScanner_stopScanBurst");
    private final asdz u = new ascj(this);

    public ascn(Context context, ascs ascs) {
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) ascs);
        this.p = ascs;
        this.d = (arwg) thl.a(context, arwg.class);
        this.q = (asht) thl.a(context, asht.class);
        this.f = new jbs(context);
    }

    static int a(int i2) {
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            return 3;
        } else {
            if (i3 == 2) {
                return 0;
            }
            if (i3 == 3) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            anih anih = (anih) ((anih) asil.a.b()).a("ascn", "a", 713, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String a2 = avay.a(i2);
            if (i2 != 0) {
                anih.a("BackgroundBleScanner: Unknown BleScanMode: %s", (Object) a2);
                return 3;
            }
            throw null;
        }
    }

    private static int b(int i2) {
        if (i2 == 0) {
            return 3;
        }
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 3) {
            return 2;
        }
        ((anih) ((anih) asil.a.c()).a("ascn", "b", 729, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Unknown BleSettings scan mode: %s", i2);
        return 1;
    }

    public final PendingIntent c() {
        return PendingIntent.getBroadcast(this.c, 0, new Intent("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE"), 134217728);
    }

    public final void d() {
        int i2;
        int i3;
        if (!this.h) {
            this.d.e(this.t);
        } else if (!this.d.b(this.t)) {
            this.d.a(this.t, aymn.a.a().r());
        }
        int i4 = 1;
        if (g()) {
            ascm f2 = f();
            auyt auyt = this.q.b;
            boolean e2 = e();
            Integer num = this.l;
            int i5 = 3;
            if (num != null) {
                i2 = num.intValue();
            } else if (this.h && a(f2.c)) {
                auyn auyn = auyt.h;
                if (auyn == null) {
                    auyn = auyn.j;
                }
                auym auym = auyn.e;
                if (auym == null) {
                    auym = auym.e;
                }
                int b2 = avay.b(auym.b);
                if (b2 == 0) {
                    b2 = 1;
                }
                i2 = a(b2);
            } else if (b(f2.c)) {
                i2 = this.k ? 3 : 0;
            } else if (!e2) {
                auyn auyn2 = auyt.h;
                if (auyn2 == null) {
                    auyn2 = auyn.j;
                }
                auym auym2 = auyn2.e;
                if (auym2 == null) {
                    auym2 = auym.e;
                }
                int b3 = avay.b(auym2.c);
                if (b3 == 0) {
                    b3 = 1;
                }
                i2 = a(b3);
            } else {
                auyn auyn3 = auyt.h;
                if (auyn3 == null) {
                    auyn3 = auyn.j;
                }
                auym auym3 = auyn3.e;
                if (auym3 == null) {
                    auym3 = auym.e;
                }
                int b4 = avay.b(auym3.d);
                if (b4 == 0) {
                    b4 = 1;
                }
                i2 = a(b4);
            }
            gtj gtj = new gtj();
            gtj.a(f2.b);
            gtj.b(i2);
            gtj.a(f2.a);
            auyn auyn4 = auyt.h;
            if (auyn4 == null) {
                auyn4 = auyn.j;
            }
            gtj.a(auyn4.h);
            gtj.a = 1;
            BleSettings a2 = gtj.a();
            if (this.g == null && !this.s.isEmpty() && !aymn.a.a().k()) {
                this.g = new aseb(this.c, this.u);
            }
            if (this.g != null) {
                if (aymw.z() && (this.h || e2)) {
                    aseb aseb = this.g;
                    List list = this.s;
                    if (!aseb.g) {
                        i3 = (int) aymt.q();
                    } else {
                        i3 = (int) aymt.o();
                    }
                    aseb.a(list, i3);
                } else {
                    this.g.a();
                }
            }
            if (a2.equals(this.r)) {
                jjg jjg = asil.a;
                return;
            }
            jjg jjg2 = asil.a;
            this.r = a2;
            if (i2 != 0) {
                if (i2 == 1) {
                    i5 = 4;
                } else if (i2 == 2) {
                    i5 = 5;
                } else if (i2 != 3) {
                    ((anih) ((anih) asil.a.c()).a("ascn", "b", 729, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Unknown BleSettings scan mode: %s", i2);
                    i5 = 1;
                } else {
                    i5 = 2;
                }
            }
            this.o = i5;
            this.p.a(a2, (gth) this.u);
        } else {
            jjg jjg3 = asil.a;
            this.p.a((gth) this.u);
            aseb aseb2 = this.g;
            if (aseb2 != null) {
                aseb2.a();
            }
            this.r = null;
            this.o = 1;
            for (ascl a3 : this.e.keySet()) {
                a3.a();
            }
            b();
        }
        int i6 = this.o;
        aseb aseb3 = this.g;
        if (aseb3 != null) {
            i4 = aseb3.k;
        }
        a(i6, i4);
    }

    public final boolean e() {
        if (aymn.h()) {
            return this.i;
        }
        PowerManager powerManager = (PowerManager) this.c.getSystemService("power");
        return powerManager != null && powerManager.isScreenOn();
    }

    public final ascm f() {
        List list;
        HashSet hashSet = new HashSet(this.e.size());
        Set<BleFilter> hashSet2 = new HashSet<>(this.e.size());
        WorkSource workSource = new WorkSource();
        boolean z = false;
        for (ascm ascm : this.e.values()) {
            hashSet.addAll(Arrays.asList(ascm.c));
            List list2 = ascm.a;
            if (list2.isEmpty()) {
                hashSet2 = Collections.emptySet();
                z = true;
            } else if (!z) {
                hashSet2.addAll(list2);
            }
            workSource.add(ascm.b);
        }
        if (aymw.z()) {
            ArrayList arrayList = new ArrayList();
            for (BleFilter bleFilter : hashSet2) {
                if (b.equals(bleFilter.e)) {
                    arrayList.add(bleFilter);
                }
            }
            this.s = arrayList;
            hashSet2.removeAll(arrayList);
        }
        if (hashSet2.isEmpty() && hashSet.contains(asey.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON)) {
            ((anih) ((anih) asil.a.c()).a("ascn", "f", 580, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Can't do always-on scanning without filters.");
            hashSet.remove(asey.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON);
        }
        BleSettings bleSettings = this.r;
        if (bleSettings != null) {
            List list3 = bleSettings.d;
            if (hashSet2.size() == list3.size() && hashSet2.containsAll(list3)) {
                list = this.r.d;
                return new ascm(list, workSource, (asey[]) hashSet.toArray(new asey[0]));
            }
        }
        list = new ArrayList(hashSet2);
        return new ascm(list, workSource, (asey[]) hashSet.toArray(new asey[0]));
    }

    public final boolean g() {
        return this.j && this.p.o();
    }

    public static boolean b(asey[] aseyArr) {
        return jhx.a((Object[]) aseyArr, (Object) asey.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON);
    }

    public static boolean a(Context context, asey[] aseyArr) {
        if (aseyArr == null) {
            return true;
        }
        asda asda = (asda) thl.b(context, asda.class);
        for (asey asey : aseyArr) {
            if (asey == asey.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON && (asda == null || !asda.g.f())) {
                return false;
            }
        }
        return true;
    }

    public final void b() {
        this.f.a(c());
        this.k = false;
    }

    public static boolean a(asey[] aseyArr) {
        return jhx.a((Object[]) aseyArr, (Object) asey.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS);
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b2 = aymn.a.a().b();
        long a2 = aymn.a.a().a();
        long j2 = this.m;
        if (j2 + b2 < elapsedRealtime) {
            this.m = elapsedRealtime;
        } else if (!this.k && j2 + a2 < elapsedRealtime) {
            ((anih) ((anih) asil.a.d()).a("ascn", "a", 399, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Wake up rate too high, pausing for %tM:%tS.", b2, b2);
            this.k = true;
            this.f.a("NearbyDirect_BackgroundBleScanner_Unpause", 2, elapsedRealtime + b2, c(), f().b);
            d();
        }
    }

    public final void a(int i2, int i3) {
        for (ascl a2 : this.e.keySet()) {
            a2.a(i2, i3);
        }
    }

    public final void a(ascl ascl, List list, WorkSource workSource, asey[] aseyArr) {
        if (aseyArr == null) {
            aseyArr = a;
        }
        if (a(this.c, aseyArr)) {
            this.e.put(ascl, new ascm(Collections.unmodifiableList(list), workSource, aseyArr));
            if (this.j) {
                this.c.unregisterReceiver(this.n);
            }
            this.j = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED");
            if (jkr.b()) {
                intentFilter.addAction("android.bluetooth.adapter.action.BLE_STATE_CHANGED");
            }
            if (a(f().c)) {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                if (aymn.h()) {
                    intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON");
                    intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF");
                }
            }
            if (b(f().c)) {
                intentFilter.addAction("com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE");
            }
            this.c.registerReceiver(this.n, intentFilter);
            this.h = true;
            d();
            return;
        }
        ((anih) ((anih) asil.a.b()).a("ascn", "a", 272, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Ignoring request, scanning strategies unsupported (%s), maybe the device doesn't support hardware-offloaded filters.", (Object) Arrays.toString(aseyArr));
    }

    /* access modifiers changed from: package-private */
    public final void a(BleSighting bleSighting) {
        BluetoothDevice bluetoothDevice;
        int i2;
        UUID uuid;
        BleSighting bleSighting2 = bleSighting;
        if (!this.j) {
            return;
        }
        if (bleSighting2 == null || (bluetoothDevice = bleSighting2.a) == null || bluetoothDevice.getAddress() == null) {
            anih anih = (anih) asil.a.c();
            anih.a((Throwable) new IllegalStateException());
            ((anih) anih.a("ascn", "a", 645, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Invalid scan result: %s", (Object) bleSighting2);
        } else if (bleSighting2.b != null) {
            for (ascl ascl : this.e.keySet()) {
                Iterator it = ((ascm) this.e.get(ascl)).a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BleFilter bleFilter = (BleFilter) it.next();
                    BluetoothDevice bluetoothDevice2 = bleSighting2.a;
                    String str = bleFilter.b;
                    if (str == null || (bluetoothDevice2 != null && str.equals(bluetoothDevice2.getAddress()))) {
                        gti gti = bleSighting2.b;
                        if (gti != null || (bleFilter.a == null && bleFilter.c == null && bleFilter.i == null && bleFilter.f == null)) {
                            String str2 = bleFilter.a;
                            if (str2 == null || str2.equals(gti.d)) {
                                ParcelUuid parcelUuid = bleFilter.c;
                                if (parcelUuid != null) {
                                    ParcelUuid parcelUuid2 = bleFilter.d;
                                    List list = gti.a;
                                    if (list != null) {
                                        if (parcelUuid2 != null) {
                                            uuid = parcelUuid2.getUuid();
                                        } else {
                                            uuid = null;
                                        }
                                        int size = list.size();
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= size) {
                                                continue;
                                                break;
                                            }
                                            UUID uuid2 = parcelUuid.getUuid();
                                            UUID uuid3 = ((ParcelUuid) list.get(i3)).getUuid();
                                            if (uuid != null) {
                                                if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                                                    break;
                                                }
                                            } else if (uuid2.equals(uuid3)) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                ParcelUuid parcelUuid3 = bleFilter.e;
                                if ((parcelUuid3 == null || BleFilter.a(bleFilter.f, bleFilter.g, gti.a(parcelUuid3))) && ((i2 = bleFilter.h) < 0 || BleFilter.a(bleFilter.i, bleFilter.j, gti.a(i2)))) {
                                    ascl.a(bleSighting2);
                                }
                            }
                        }
                    }
                }
                ascl.a(bleSighting2);
            }
        } else {
            anih anih2 = (anih) asil.a.c();
            anih2.a((Throwable) new IllegalStateException());
            ((anih) anih2.a("ascn", "a", 658, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BackgroundBleScanner: Scan record with null bytes: %s", (Object) bleSighting2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            jjg r0 = defpackage.asil.a
            int r0 = r6.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -2128145023: goto L_0x0052;
                case -1530327060: goto L_0x0048;
                case -1454123155: goto L_0x003e;
                case -737417248: goto L_0x0034;
                case 360422632: goto L_0x002a;
                case 575967096: goto L_0x0020;
                case 880469964: goto L_0x0016;
                case 1524764930: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x005c
        L_0x000c:
            java.lang.String r0 = "com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_OFF"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 4
            goto L_0x005d
        L_0x0016:
            java.lang.String r0 = "com.google.location.nearby.direct.bluetooth.state.FAKE_SCREEN_ON"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x0020:
            java.lang.String r0 = "com.google.location.nearby.direct.bluetooth.state.ACTION_UNPAUSE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 5
            goto L_0x005d
        L_0x002a:
            java.lang.String r0 = "android.bluetooth.adapter.action.BLE_STATE_CHANGED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 7
            goto L_0x005d
        L_0x0034:
            java.lang.String r0 = "com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 2
            goto L_0x005d
        L_0x003e:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 0
            goto L_0x005d
        L_0x0048:
            java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 6
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x005c
            r0 = 3
            goto L_0x005d
        L_0x005c:
            r0 = -1
        L_0x005d:
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0085;
                case 2: goto L_0x0087;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x007c;
                case 6: goto L_0x0089;
                case 7: goto L_0x0089;
                default: goto L_0x0060;
            }
        L_0x0060:
            jjg r0 = defpackage.asil.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r1 = 631(0x277, float:8.84E-43)
            java.lang.String r2 = "ascn"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r1, (java.lang.String) r4)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "BackgroundBleScanner: Unexpected action=%s"
            r0.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x0089
        L_0x007c:
            r5.b()
            goto L_0x0089
        L_0x0080:
            r5.i = r2
            r5.h = r2
            goto L_0x0089
        L_0x0085:
            r5.i = r1
        L_0x0087:
            r5.h = r1
        L_0x0089:
            r5.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ascn.a(java.lang.String):void");
    }
}
