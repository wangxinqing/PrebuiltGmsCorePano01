package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvq {
    public static iby a;

    private static String a(long j) {
        byte[] b = aook.b(j);
        int length = b.length;
        return anml.g.a(Arrays.copyOfRange(b, length - 3, length));
    }

    public static tzf b(uaj uaj) {
        aucd o = tzf.A.o();
        long j = uaj.l;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf = (tzf) o.b;
        int i = tzf.a | 2097152;
        tzf.a = i;
        tzf.y = j;
        long j2 = uaj.k;
        int i2 = i | 32;
        tzf.a = i2;
        tzf.g = j2;
        String str = uaj.f;
        str.getClass();
        int i3 = i2 | 64;
        tzf.a = i3;
        tzf.h = str;
        String str2 = uaj.h;
        str2.getClass();
        int i4 = i3 | 16;
        tzf.a = i4;
        tzf.f = str2;
        String str3 = uaj.e;
        str3.getClass();
        int i5 = i4 | 128;
        tzf.a = i5;
        tzf.i = str3;
        String str4 = uaj.y;
        str4.getClass();
        int i6 = 1;
        int i7 = i5 | 1;
        tzf.a = i7;
        tzf.b = str4;
        auay auay = uaj.z;
        auay.getClass();
        int i8 = i7 | 8;
        tzf.a = i8;
        tzf.e = auay;
        auay auay2 = uaj.H;
        auay2.getClass();
        tzf.a = i8 | FragmentTransaction.TRANSIT_ENTER_MASK;
        tzf.n = auay2;
        aucd o2 = tzc.d.o();
        String str5 = uaj.i;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        tzc tzc = (tzc) o2.b;
        str5.getClass();
        tzc.a |= 2;
        tzc.c = str5;
        tzc tzc2 = (tzc) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf2 = (tzf) o.b;
        tzc2.getClass();
        tzf2.m = tzc2;
        tzf2.a |= 2048;
        auzo auzo = uaj.I;
        if (auzo == null) {
            auzo = auzo.j;
        }
        boolean z = auzo.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf3 = (tzf) o.b;
        tzf3.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        tzf3.o = z;
        auzo auzo2 = uaj.I;
        if (auzo2 == null) {
            auzo2 = auzo.j;
        }
        int a2 = avbp.a(auzo2.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i9 = a2 - 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf4 = (tzf) o.b;
        tzf4.a |= 16384;
        tzf4.p = i9;
        auzo auzo3 = uaj.I;
        if (auzo3 == null) {
            auzo3 = auzo.j;
        }
        avan avan = auzo3.d;
        if (avan == null) {
            avan = avan.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf5 = (tzf) o.b;
        avan.getClass();
        tzf5.q = avan;
        tzf5.a |= 32768;
        auzo auzo4 = uaj.I;
        if (auzo4 == null) {
            auzo4 = auzo.j;
        }
        boolean z2 = auzo4.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf6 = (tzf) o.b;
        tzf6.a |= 65536;
        tzf6.r = z2;
        auzo auzo5 = uaj.I;
        if (auzo5 == null) {
            auzo5 = auzo.j;
        }
        String str6 = auzo5.h;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf7 = (tzf) o.b;
        str6.getClass();
        tzf7.a |= 131072;
        tzf7.s = str6;
        auzo auzo6 = uaj.I;
        if (auzo6 == null) {
            auzo6 = auzo.j;
        }
        int a3 = avbc.a(auzo6.i);
        if (a3 != 0) {
            i6 = a3;
        }
        int i10 = i6 - 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf8 = (tzf) o.b;
        tzf8.a |= 4194304;
        tzf8.z = i10;
        auzo auzo7 = uaj.I;
        if (auzo7 == null) {
            auzo7 = auzo.j;
        }
        aucu<avbl> aucu = new aucu(auzo7.f, auzo.g);
        amzt amzt = new amzt();
        for (avbl avbl : aucu) {
            amzt.c(asql.a(avbl.d));
        }
        o.Z(amzt.a());
        asqh asqh = uaj.J;
        if (asqh == null) {
            asqh = asqh.c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        tzf tzf9 = (tzf) o.b;
        asqh.getClass();
        tzf9.x = asqh;
        tzf9.a |= 1048576;
        return (tzf) o.i();
    }

    public static String a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                return parseUri.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            }
            jjg jjg = tsp.a;
            return null;
        } catch (URISyntaxException e) {
            anih anih = (anih) tsp.a.d();
            anih.a((Throwable) e);
            anih.a("FastPair: fail to get companion app info from discovery item");
            return null;
        }
    }

    public static String a(uaj uaj) {
        return a(uaj.f);
    }

    private static List a(List list) {
        amzt amzt = new amzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amzt.c(avbl.a(((asql) it.next()).a()));
        }
        return amzt.a();
    }

    public static tzf a(Context context, String str) {
        return (tzf) ((txr) thl.a(context, txr.class)).get(str);
    }

    public static uaj a(asqq asqq) {
        asqj asqj = asqq.a;
        if (asqj == null) {
            asqj = asqj.q;
        }
        aucd o = uaj.K.o();
        String a2 = a(asqj.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj = (uaj) o.b;
        a2.getClass();
        uaj.a |= 1;
        uaj.c = a2;
        avbx avbx = avbx.NEARBY_DEVICE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj2 = (uaj) o.b;
        uaj2.d = avbx.h;
        int i = 2;
        int i2 = uaj2.a | 2;
        uaj2.a = i2;
        String str = asqj.c;
        str.getClass();
        int i3 = i2 | 8;
        uaj2.a = i3;
        uaj2.f = str;
        String str2 = asqj.b;
        str2.getClass();
        uaj2.a = i3 | 32;
        uaj2.h = str2;
        asqt asqt = asqq.c;
        if (asqt == null) {
            asqt = asqt.c;
        }
        String str3 = asqt.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj3 = (uaj) o.b;
        str3.getClass();
        int i4 = uaj3.a | 64;
        uaj3.a = i4;
        uaj3.i = str3;
        uaj3.n = 2;
        uaj3.a = i4 | 2048;
        String a3 = a(asqj.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj4 = (uaj) o.b;
        a3.getClass();
        int i5 = uaj4.a | 4194304;
        uaj4.a = i5;
        uaj4.y = a3;
        auay auay = asqq.b;
        auay.getClass();
        uaj4.a = 8388608 | i5;
        uaj4.z = auay;
        asqg asqg = asqj.f;
        if (asqg == null) {
            asqg = asqg.b;
        }
        auay auay2 = asqg.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj5 = (uaj) o.b;
        auay2.getClass();
        uaj5.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        uaj5.H = auay2;
        asqh asqh = asqj.p;
        if (asqh == null) {
            asqh = asqh.c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj6 = (uaj) o.b;
        asqh.getClass();
        uaj6.J = asqh;
        uaj6.b |= 1;
        auzn auzn = (auzn) auzo.j.o();
        boolean z = asqj.k;
        if (auzn.c) {
            auzn.c();
            auzn.c = false;
        }
        auzo auzo = (auzo) auzn.b;
        auzo.a |= 1;
        auzo.b = z;
        int i6 = asqj.h;
        int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? 0 : 4 : 3 : 2;
        if (i7 == 0) {
            i7 = 1;
        }
        if (i7 != 1) {
            int a4 = avbp.a(i7 - 2);
            if (auzn.c) {
                auzn.c();
                auzn.c = false;
            }
            auzo auzo2 = (auzo) auzn.b;
            int i8 = a4 - 1;
            if (a4 != 0) {
                auzo2.c = i8;
                auzo2.a |= 2;
                avan avan = asqj.i;
                if (avan == null) {
                    avan = avan.d;
                }
                if (auzn.c) {
                    auzn.c();
                    auzn.c = false;
                }
                auzo auzo3 = (auzo) auzn.b;
                avan.getClass();
                auzo3.d = avan;
                int i9 = auzo3.a | 4;
                auzo3.a = i9;
                boolean z2 = asqj.j;
                auzo3.a = i9 | 8;
                auzo3.e = z2;
                auzn.a(a((List) new aucu(asqj.m, asqj.n)));
                String str4 = asqj.l;
                if (auzn.c) {
                    auzn.c();
                    auzn.c = false;
                }
                auzo auzo4 = (auzo) auzn.b;
                str4.getClass();
                auzo4.a |= 16;
                auzo4.h = str4;
                switch (asqj.g) {
                    case 0:
                        break;
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == 0) {
                    i = 1;
                }
                if (i != 1) {
                    int a5 = avbc.a(i - 2);
                    if (auzn.c) {
                        auzn.c();
                        auzn.c = false;
                    }
                    auzo auzo5 = (auzo) auzn.b;
                    int i10 = a5 - 1;
                    if (a5 != 0) {
                        auzo5.i = i10;
                        auzo5.a |= 32;
                        auzo auzo6 = (auzo) auzn.i();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        uaj uaj7 = (uaj) o.b;
                        auzo6.getClass();
                        uaj7.I = auzo6;
                        uaj7.a |= Integer.MIN_VALUE;
                        return (uaj) o.i();
                    }
                    throw null;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            throw null;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static boolean b(Context context, Intent intent) {
        return context.startService(intent) != null;
    }

    public static uaj a(ttf ttf, txr txr, twd twd, String str) {
        Object obj;
        if (ttf.b() != null) {
            for (ttg ttg : ttf.b()) {
                ((anih) tsp.a.d()).a("FastPairUtils: CachedItem: id=%s, triggerId=%s", (Object) ttg.i(), (Object) ttg.G());
                if (ampw.a(str, amrk.b(ttg.G()))) {
                    ((anih) tsp.a.d()).a("FastPairUtils: CachedItem for %s found", (Object) str);
                    return ttg.b;
                }
            }
        }
        int i = 1;
        if (aymz.b() && aymw.a.a().aw()) {
            txn txn = new txn(txr, str);
            try {
                txr.c.b();
                jjg jjg = tsp.a;
                obj = txn.a();
            } catch (IllegalStateException | NullPointerException e) {
                jjg jjg2 = tsp.a;
                AtomicReference atomicReference = new AtomicReference();
                try {
                    txr.c.a((arwm) new txq(String.format("postAndWait: %s", new Object[]{"getObservedDeviceInfo"}), atomicReference, txn));
                    obj = atomicReference.get();
                } catch (InterruptedException e2) {
                    anih anih = (anih) tsp.a.c();
                    anih.a((Throwable) e2);
                    anih.a("postAndWait failed: %s", (Object) "getObservedDeviceInfo");
                    obj = null;
                }
            }
            asqq asqq = (asqq) obj;
            if (asqq != null) {
                ((anih) tsp.a.d()).a("FastPairUtils: CachedObservedDevice: %s", (Object) str);
                return a(asqq);
            }
        }
        if (aymw.a.a().ag()) {
            if (aymz.b()) {
                long max = Math.max(aymt.a.a().aN(), 1);
                while (((long) i) <= max) {
                    ((anih) tsp.a.d()).a("FastPairUtils: Query device information, attempt %s/%s", i, max);
                    asqq a2 = twd.a(str);
                    if (a2 == null) {
                        ((anih) tsp.a.d()).a("FastPairUtils: Failed to get device for %s", (Object) str);
                        i++;
                    } else {
                        ((anih) tsp.a.d()).a("FastPairUtils: Get device for %s", (Object) str);
                        return a(a2);
                    }
                }
            } else {
                asqq a3 = twd.a(str);
                if (a3 != null) {
                    ((anih) tsp.a.d()).a("FastPairUtils: Get device for %s", (Object) str);
                    return a(a3);
                }
                ((anih) tsp.a.d()).a("FastPairUtils: Failed to get device for %s", (Object) str);
            }
        }
        return null;
    }

    public static uaj a(tzf tzf) {
        aucd o = uaj.K.o();
        String str = tzf.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj = (uaj) o.b;
        str.getClass();
        int i = 1;
        int i2 = uaj.a | 1;
        uaj.a = i2;
        uaj.c = str;
        long j = tzf.y;
        int i3 = i2 | 512;
        uaj.a = i3;
        uaj.l = j;
        long j2 = tzf.g;
        uaj.a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        uaj.k = j2;
        avbx avbx = avbx.NEARBY_DEVICE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj2 = (uaj) o.b;
        uaj2.d = avbx.h;
        int i4 = uaj2.a | 2;
        uaj2.a = i4;
        String str2 = tzf.h;
        str2.getClass();
        int i5 = i4 | 8;
        uaj2.a = i5;
        uaj2.f = str2;
        uaj2.n = 2;
        int i6 = i5 | 2048;
        uaj2.a = i6;
        String str3 = tzf.f;
        str3.getClass();
        int i7 = i6 | 32;
        uaj2.a = i7;
        uaj2.h = str3;
        String str4 = tzf.i;
        str4.getClass();
        int i8 = i7 | 4;
        uaj2.a = i8;
        uaj2.e = str4;
        uaj2.m = 1;
        uaj2.a = i8 | 1024;
        o.ab(tsr.a(601));
        String str5 = tzf.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj3 = (uaj) o.b;
        str5.getClass();
        int i9 = uaj3.a | 4194304;
        uaj3.a = i9;
        uaj3.y = str5;
        auay auay = tzf.e;
        auay.getClass();
        uaj3.a = i9 | 8388608;
        uaj3.z = auay;
        tzc tzc = tzf.m;
        if (tzc == null) {
            tzc = tzc.d;
        }
        String str6 = tzc.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj4 = (uaj) o.b;
        str6.getClass();
        int i10 = uaj4.a | 64;
        uaj4.a = i10;
        uaj4.i = str6;
        auay auay2 = tzf.n;
        auay2.getClass();
        uaj4.a = i10 | JGCastService.FLAG_PRIVATE_DISPLAY;
        uaj4.H = auay2;
        asqh asqh = tzf.x;
        if (asqh == null) {
            asqh = asqh.c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj5 = (uaj) o.b;
        asqh.getClass();
        uaj5.J = asqh;
        uaj5.b |= 1;
        auzn auzn = (auzn) auzo.j.o();
        boolean z = tzf.o;
        if (auzn.c) {
            auzn.c();
            auzn.c = false;
        }
        auzo auzo = (auzo) auzn.b;
        auzo.a |= 1;
        auzo.b = z;
        int a2 = avbp.a(tzf.p);
        if (auzn.c) {
            auzn.c();
            auzn.c = false;
        }
        auzo auzo2 = (auzo) auzn.b;
        int i11 = a2 - 1;
        if (a2 != 0) {
            auzo2.c = i11;
            auzo2.a |= 2;
            avan avan = tzf.q;
            if (avan == null) {
                avan = avan.d;
            }
            if (auzn.c) {
                auzn.c();
                auzn.c = false;
            }
            auzo auzo3 = (auzo) auzn.b;
            avan.getClass();
            auzo3.d = avan;
            int i12 = auzo3.a | 4;
            auzo3.a = i12;
            boolean z2 = tzf.r;
            int i13 = i12 | 8;
            auzo3.a = i13;
            auzo3.e = z2;
            String str7 = tzf.s;
            str7.getClass();
            auzo3.a = i13 | 16;
            auzo3.h = str7;
            if ((tzf.a & 4194304) != 0) {
                i = avbc.a(tzf.z);
            }
            if (auzn.c) {
                auzn.c();
                auzn.c = false;
            }
            auzo auzo4 = (auzo) auzn.b;
            int i14 = i - 1;
            if (i != 0) {
                auzo4.i = i14;
                auzo4.a |= 32;
                auzn.a(a((List) new aucu(tzf.t, tzf.u)));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                uaj uaj6 = (uaj) o.b;
                auzo auzo5 = (auzo) auzn.i();
                auzo5.getClass();
                uaj6.I = auzo5;
                uaj6.a |= Integer.MIN_VALUE;
                return (uaj) o.i();
            }
            throw null;
        }
        throw null;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent.setFlags(268435456));
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
