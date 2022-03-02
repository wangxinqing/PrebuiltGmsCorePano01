package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.accessibility.AccessibilityManager;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.concurrent.TimeUnit;

/* renamed from: txr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txr extends LruCache {
    static final ParcelUuid f = new ParcelUuid(aeft.a);
    public final txs a;
    public final Context b;
    public final arwg c;
    public final jiq d;
    public final tsu e;
    private final tza g;
    private final tyw h;
    private final udf i;

    public txr(Context context) {
        super((int) aymt.t());
        this.b = context;
        this.a = new txs(context);
        this.c = (arwg) thl.a(context, arwg.class);
        this.d = (jiq) thl.a(context, jiq.class);
        this.g = (tza) thl.a(context, tza.class);
        this.i = (udf) thl.a(context, udf.class);
        this.e = (tsu) thl.a(context, tsu.class);
        this.h = (tyw) thl.a(context, tyw.class);
    }

    private static boolean a(tzf tzf) {
        int i2 = tzf.j;
        return i2 != 0 && tzf.c >= i2;
    }

    private static boolean b(ScanResult scanResult, tzf tzf) {
        byte[] serviceData = scanResult.getScanRecord().getServiceData(f);
        if (serviceData == null) {
            return false;
        }
        if (tzf == null || ((tga.b(serviceData) && (tzf.a & 512) != 0) || (!tga.b(serviceData) && (tzf.a & 1) != 0))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final tzf a(ScanResult scanResult, int i2) {
        byte[] serviceData = scanResult.getScanRecord().getServiceData(f);
        int txPowerLevel = scanResult.getScanRecord().getTxPowerLevel();
        long a2 = this.d.a();
        aucd o = tzf.A.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf = (tzf) o.b;
        int i3 = tzf.a | 2097152;
        tzf.a = i3;
        tzf.y = a2;
        tzf.a = i3 | 32;
        tzf.g = a2;
        String address = scanResult.getDevice().getAddress();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf2 = (tzf) o.b;
        address.getClass();
        tzf2.a |= 128;
        tzf2.i = address;
        int rssi = scanResult.getRssi();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf3 = (tzf) o.b;
        tzf3.a |= 2;
        tzf3.c = rssi;
        auay a3 = auay.a(scanResult.getScanRecord().getBytes());
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf4 = (tzf) o.b;
        a3.getClass();
        tzf4.a |= 524288;
        tzf4.w = a3;
        if (!(scanResult.getDevice() == null || scanResult.getDevice().getName() == null)) {
            String name = scanResult.getDevice().getName();
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzf tzf5 = (tzf) o.b;
            name.getClass();
            tzf5.a |= 1024;
            tzf5.l = name;
        }
        if (tga.b(serviceData)) {
            String a4 = jjp.a(tga.a(serviceData));
            if (o.c) {
                o.c();
                o.c = false;
            }
            tzf tzf6 = (tzf) o.b;
            a4.getClass();
            tzf6.a |= 1;
            tzf6.b = a4;
            this.e.a(asom.FAST_PAIR_DEVICE_DETECTED_WITH_MODEL_ID, a4, tie.a(scanResult.getRssi(), txPowerLevel), scanResult.getDevice().getAddress(), i2);
            ((anih) tsp.a.d()).a("FastPairCache: found device %s advertising model id %s", (Object) scanResult.getDevice().getAddress(), (Object) a4);
            tzf tzf7 = (tzf) put(scanResult.getDevice().getAddress(), (tzf) o.i());
            this.c.c(new txo(this, "fastPairCacheManager_loadObservedDevice", scanResult, a4, txPowerLevel));
            return tzf7;
        }
        jjg jjg = tsp.a;
        scanResult.getDevice().getAddress();
        this.e.a(asom.FAST_PAIR_DEVICE_DETECTED_WITH_BLOOM_FILTER, "0", tie.a(scanResult.getRssi(), txPowerLevel), scanResult.getDevice().getAddress(), i2);
        String address2 = scanResult.getDevice().getAddress();
        auay a5 = auay.a(serviceData);
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf8 = (tzf) o.b;
        a5.getClass();
        int i4 = tzf8.a | 512;
        tzf8.a = i4;
        tzf8.k = a5;
        tzf8.a = i4 | 4;
        tzf8.d = txPowerLevel;
        return (tzf) put(address2, (tzf) o.i());
    }

    public final void b(ScanResult scanResult, int i2) {
        tzf tzf;
        String address = scanResult.getDevice().getAddress();
        tzf tzf2 = (tzf) get(scanResult.getDevice().getAddress());
        if (tzf2 == null) {
            tzf = a(scanResult, i2);
        } else if (b(scanResult, tzf2)) {
            ((anih) tsp.a.d()).a("FastPairCache: Advertisement type changed for device %s", (Object) scanResult.getDevice().getAddress());
            tzf = a(scanResult, i2);
        } else {
            String address2 = scanResult.getDevice().getAddress();
            aucd aucd = (aucd) tzf2.c(5);
            aucd.a((aucj) tzf2);
            int rssi = scanResult.getRssi();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tzf tzf3 = (tzf) aucd.b;
            tzf3.a |= 2;
            tzf3.c = rssi;
            tzf = (tzf) put(address2, (tzf) aucd.i());
        }
        tzf tzf4 = (tzf) get(address);
        if (tzf4 != null) {
            if (b(scanResult, tzf)) {
                if ((tzf4.a & 1) == 0) {
                    ((anih) tsp.a.d()).a("FastPairCache: First time device %s advertising bloom filter found with data %s.", (Object) address, (Object) jjp.a(scanResult.getScanRecord().getServiceData(f)));
                } else {
                    ((anih) tsp.a.d()).a("FastPairCache: First time device %s with model id %s found.", (Object) address, (Object) tzf4.b);
                }
            }
            a(scanResult, tzf4);
        }
    }

    public final tzg a(asqq asqq, boolean z) {
        asqq asqq2;
        long j;
        aucd o = tzg.f.o();
        if (asqq == null) {
            asqq2 = asqq.d;
        } else {
            asqq2 = asqq;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzg tzg = (tzg) o.b;
        asqq2.getClass();
        tzg.c = asqq2;
        tzg.a |= 2;
        if (asqq != null) {
            j = this.d.a();
        } else {
            j = this.d.a() - TimeUnit.HOURS.toMillis(aymt.w() - 1);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzg tzg2 = (tzg) o.b;
        int i2 = tzg2.a | 4;
        tzg2.a = i2;
        tzg2.d = j;
        tzg2.a = i2 | 8;
        tzg2.e = z;
        String str = "-1";
        if (asqq != null) {
            asqj asqj = asqq.a;
            if (asqj == null) {
                asqj = asqj.q;
            }
            try {
                String hexString = Long.toHexString(asqj.a);
                while (hexString.length() < 6) {
                    String valueOf = String.valueOf(hexString);
                    hexString = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
                }
                str = hexString;
            } catch (NumberFormatException e2) {
                ((anih) tsp.a.d()).a("FastPair: The format of input is not long.");
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzg tzg3 = (tzg) o.b;
        str.getClass();
        tzg3.a |= 1;
        tzg3.b = str;
        tzg tzg4 = (tzg) o.i();
        this.a.e(tzg4);
        return tzg4;
    }

    public final void a(ScanResult scanResult, tzf tzf) {
        int a2 = asqs.a(tzf.v);
        if (a2 != 0 && a2 == 3 && aymw.a.a().bF() && a(tzf)) {
            ((anih) tsp.a.d()).a("FastPairCache: Auto launching %s", (Object) tzf.i);
            uaj a3 = tvq.a(tzf);
            aucd aucd = (aucd) a3.c(5);
            aucd.a((aucj) a3);
            int rssi = scanResult.getRssi();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj = (uaj) aucd.b;
            uaj uaj2 = uaj.K;
            uaj.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            uaj.p = rssi;
            auay a4 = auay.a(gti.a(scanResult.getScanRecord().getBytes()).e);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj3 = (uaj) aucd.b;
            a4.getClass();
            uaj3.a |= 268435456;
            uaj3.F = a4;
            aucd o = uak.d.o();
            aucd o2 = auzz.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auzz auzz = (auzz) o2.b;
            auzz.b = 700;
            auzz.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            uak uak = (uak) o.b;
            auzz auzz2 = (auzz) o2.i();
            auzz2.getClass();
            uak.b = auzz2;
            uak.a |= 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj4 = (uaj) aucd.b;
            uak uak2 = (uak) o.i();
            uak2.getClass();
            uaj4.a();
            uaj4.C.add(uak2);
            this.i.a(new ttg(this.b, (uaj) aucd.i()), false);
        } else if (aymw.P() || !aymw.R()) {
            a(tzf, scanResult);
        } else {
            this.c.c(new txp(this, "fastPairEvaluateAndScan", tzf, scanResult));
        }
    }

    public final void a(tzf tzf, ScanResult scanResult) {
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        boolean z2;
        boolean z3;
        byte[] bArr3;
        tzf tzf2 = tzf;
        if (!(scanResult.getScanRecord() == null || (tga.a(scanResult.getScanRecord()) == null && tga.c(scanResult.getScanRecord()) == null))) {
            if (!aymw.R()) {
                Context context = this.b;
                String address = scanResult.getDevice().getAddress();
                ScanRecord scanRecord = scanResult.getScanRecord();
                int rssi = scanResult.getRssi();
                byte[] a2 = tga.a(scanRecord);
                if (a2 == null) {
                    a2 = tga.c(scanRecord);
                    z3 = true;
                } else {
                    z3 = false;
                }
                byte[] b2 = tga.b(scanRecord);
                byte[] e2 = tga.e(scanRecord);
                double a3 = tie.a(rssi, scanRecord.getTxPowerLevel());
                Intent putExtra = new Intent("com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED").setClassName("com.google.android.gms", "com.google.android.gms.nearby.discovery.service.DiscoveryService").putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER", a2).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION", z3).putExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT", b2);
                if (e2 != null && e2.length > 0) {
                    bArr3 = e2;
                } else {
                    bArr3 = tga.d(scanRecord);
                }
                context.startService(putExtra.putExtra("com.google.android.gms.nearby.discovery.BATTERY_VALUES", bArr3).putExtra("com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION", e2 != null && e2.length > 0).putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", address).putExtra("com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE", a3));
            } else {
                byte[] a4 = tga.a(scanResult.getScanRecord());
                if (a4 == null) {
                    bArr = tga.c(scanResult.getScanRecord());
                    z = true;
                } else {
                    bArr = a4;
                    z = false;
                }
                byte[] e3 = tga.e(scanResult.getScanRecord());
                udb udb = (udb) thl.a(this.b, udb.class);
                String address2 = scanResult.getDevice().getAddress();
                byte[] b3 = tga.b(scanResult.getScanRecord());
                if (e3 != null && e3.length > 0) {
                    bArr2 = e3;
                } else {
                    bArr2 = tga.d(scanResult.getScanRecord());
                }
                if (e3 == null || e3.length <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (udb.a(bArr, z, address2, b3, bArr2, z2, tie.a(scanResult.getRssi(), scanResult.getScanRecord().getTxPowerLevel())) == 2) {
                    return;
                }
            }
        }
        if ((tzf2.a & 1) != 0 && a(tzf)) {
            jjg jjg = tsp.a;
            aucd aucd = (aucd) tzf2.c(5);
            aucd.a((aucj) tzf2);
            long a5 = ((jiq) thl.a(this.b, jiq.class)).a();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            tzf tzf3 = (tzf) aucd.b;
            auct auct = tzf.u;
            tzf3.a |= 32;
            tzf3.g = a5;
            tzf tzf4 = (tzf) aucd.i();
            if (aymw.E()) {
                tyw tyw = this.h;
                synchronized (tyw.b) {
                    if (tyw.b.get(tzf4.i) == null) {
                        tyw.b.put(tzf4.i, tyw.a());
                    }
                }
                int intValue = ((Integer) tyw.b.get(tzf4.i)).intValue();
                if (!tyw.a.a(intValue)) {
                    Intent className = new Intent().setClassName(tyw.c, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity");
                    className.putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", tzf4.k());
                    className.setFlags(268435456);
                    tyw.a.a(intValue, 2);
                    tyw.c.startActivity(className);
                    ((arwg) thl.a(tyw.c, arwg.class)).e(tyw.d);
                    ((arwg) thl.a(tyw.c, arwg.class)).a(tyw.d, TimeUnit.SECONDS.toMillis(aymt.m()));
                    return;
                }
                return;
            }
            tza tza = this.g;
            if (aymw.a.a().be() && !tza.k.e()) {
                ((anih) tsp.a.d()).a("FastPair: Skipping showing notification, preference disabled.");
                return;
            }
            synchronized (tza.b) {
                if (tza.b.get(tzf4.i) == null) {
                    tza.b.put(tzf4.i, Integer.valueOf(tza.a.getAndIncrement()));
                    tza.j.a(asom.FAST_PAIR_NOTIFICATION_SHOWN, tzf4.b, tzf4.i, tza.l.a() - tzf4.y);
                }
            }
            int intValue2 = ((Integer) tza.b.get(tzf4.i)).intValue();
            if (!tza.e.a(intValue2)) {
                tyy tyy = tza.e;
                Integer valueOf = Integer.valueOf(intValue2);
                txm txm = (txm) tyy.get(valueOf);
                boolean z4 = (txm == null || txm.a != 3) ? false : !tyy.a(txm);
                tzb tzb = tza.f;
                String str = tzf4.f;
                String b4 = tzb.b(tzb.b, tzf4);
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", tzb.b.getResources().getString(R.string.common_devices));
                if (aymt.a.a().O()) {
                    String valueOf2 = String.valueOf(str);
                    str = valueOf2.length() == 0 ? new String("@") : "@".concat(valueOf2);
                }
                twb twb = new twb(tzb.b, false);
                twb.a((aymw.a.a().bt() && z4) ? "DEVICES_REBRANDED" : "DEVICES_WITHIN_REACH_REBRANDED");
                twb.b(hdg.a(tzb.b, R.drawable.quantum_ic_devices_other_googblue_24));
                twb.a(tzb.a(tzb.b, tzf4));
                twb.e(str);
                twb.b((CharSequence) b4);
                jd jdVar = new jd();
                jdVar.a((CharSequence) b4);
                twb.a((jh) jdVar);
                Context context2 = tzb.b;
                int i2 = tzb.a;
                tzb.a = i2 + 1;
                twb.f = PendingIntent.getService(context2, i2, tzb.a(context2, valueOf, tzf4), JGCastService.FLAG_PRIVATE_DISPLAY);
                Context context3 = tzb.b;
                String str2 = tzf4.b;
                Intent action = DiscoveryChimeraService.a(context3).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED");
                action.putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", intValue2).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", str2);
                int i3 = tzb.a;
                tzb.a = i3 + 1;
                twb.b(PendingIntent.getService(context3, i3, action, JGCastService.FLAG_PRIVATE_DISPLAY));
                twb.c(true);
                twb.d();
                twb.a(false);
                twb.u = kf.b(tzb.b, R.color.discovery_activity_accent);
                twb.c();
                twb.s = "recommendation";
                twb.a(bundle);
                if (aymw.a.a().aS()) {
                    AccessibilityManager accessibilityManager = (AccessibilityManager) tzb.b.getSystemService("accessibility");
                    if (aymw.T() || !accessibilityManager.isTouchExplorationEnabled()) {
                        Context context4 = tzb.b;
                        int i4 = tzb.a;
                        tzb.a = i4 + 1;
                        twb.c(PendingIntent.getService(context4, i4, new Intent(), JGCastService.FLAG_PRIVATE_DISPLAY));
                    }
                }
                if (aymw.K()) {
                    String str3 = null;
                    if ((tzf4.a & 1024) != 0 && !tzf4.l.isEmpty()) {
                        String str4 = tzf4.l;
                        if (!TextUtils.isEmpty(str4) && str4.trim().matches("^LE-[0-9]{4}")) {
                            str3 = str4.substring(3, 7);
                        }
                    }
                    if (str3 != null) {
                        twb.c((CharSequence) str3);
                    }
                }
                if (z4) {
                    int a6 = hdg.a(tzb.b, R.drawable.quantum_ic_notifications_paused_grey600_24);
                    String string = tzb.b.getString(R.string.discovery_do_not_show_again);
                    Context context5 = tzb.b;
                    Intent putExtra2 = DiscoveryChimeraService.a(context5).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED").putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", intValue2).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", tzf4.b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", tzf4.i);
                    int i5 = tzb.a;
                    tzb.a = i5 + 1;
                    twb.a(a6, (CharSequence) string, PendingIntent.getService(context5, i5, putExtra2, JGCastService.FLAG_PRIVATE_DISPLAY));
                }
                Notification b5 = twb.b();
                if (!tza.e.a(intValue2)) {
                    long aZ = aymt.a.a().aZ();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("FastPairNotificationTimeout");
                    sb.append(intValue2);
                    tyz tyz = new tyz(tza, sb.toString(), intValue2, tzf4);
                    tza.i.e((arwm) tza.c.get(valueOf));
                    tza.i.a(tyz, aZ);
                    tza.c.put(valueOf, tyz);
                    tza.g.a(intValue2, b5);
                    tyx tyx = tza.h;
                    tyx.a.put(valueOf, tzf4);
                    tyx.a();
                }
                tza.e.a(intValue2, 2);
                if (aymw.ab() && aymw.X()) {
                    thp.a(tza.d, "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING");
                }
            }
        }
    }
}
