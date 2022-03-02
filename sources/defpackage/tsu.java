package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.List;

/* renamed from: tsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tsu extends arwa {
    private final ttf a;
    private final arxg b;
    private final arxk c;
    private final jiq d;

    public tsu(Context context) {
        super(context);
        this.a = (ttf) thl.a(context, ttf.class);
        this.b = (arxg) thl.a(context, arxg.class);
        this.c = (arxk) thl.a(context, arxk.class);
        this.d = (jiq) thl.a(context, jiq.class);
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("Expected 3-byte hex model ID %s", (Object) str);
            return 0;
        }
    }

    public final aucd b(asom asom) {
        int i;
        aucd o = auwy.u.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwy auwy = (auwy) o.b;
        auwy.b = asom.bt;
        auwy.a |= 1;
        if (!this.b.b()) {
            i = tgl.a();
        } else {
            i = 6;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwy auwy2 = (auwy) o.b;
        auwy2.m = i - 1;
        auwy2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        return o;
    }

    private final void a(asom asom, List list, Integer num, String str, Integer num2) {
        aucd b2 = b(asom);
        if (str != null) {
            if (b2.c) {
                b2.c();
                b2.c = false;
            }
            auwy auwy = (auwy) b2.b;
            auwy auwy2 = auwy.u;
            str.getClass();
            auwy.a |= 8;
            auwy.f = str;
        }
        if (this.a.b() != null) {
            for (ttg ttg : this.a.b()) {
                if (ttg.c()) {
                    auwc a2 = a(ttg);
                    if (b2.c) {
                        b2.c();
                        b2.c = false;
                    }
                    auwy auwy3 = (auwy) b2.b;
                    auwy auwy4 = auwy.u;
                    a2.getClass();
                    if (!auwy3.e.a()) {
                        auwy3.e = aucj.a(auwy3.e);
                    }
                    auwy3.e.add(a2);
                }
            }
        }
        int a3 = this.b.a("notification_settings_beacon");
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy5 = (auwy) b2.b;
        auwy auwy6 = auwy.u;
        auwy5.g = a3 - 1;
        auwy5.a |= 16;
        int a4 = this.b.a("notification_settings_devcie");
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy7 = (auwy) b2.b;
        auwy7.h = a4 - 1;
        auwy7.a |= 32;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.c.a.getSystemService("connectivity")).getActiveNetworkInfo();
        int i = 3;
        int i2 = 1;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            i2 = 2;
        } else if (activeNetworkInfo.getType() == 1) {
            i2 = 3;
        } else if (activeNetworkInfo.getType() == 0) {
            i2 = 4;
        }
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy8 = (auwy) b2.b;
        auwy8.i = i2 - 1;
        auwy8.a |= 128;
        int i3 = !this.b.g() ? 3 : 2;
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy9 = (auwy) b2.b;
        auwy9.k = i3 - 1;
        auwy9.a |= 512;
        int i4 = Build.VERSION.SDK_INT;
        if (((PowerManager) this.c.a.getSystemService("power")).isInteractive()) {
            i = 2;
        }
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy10 = (auwy) b2.b;
        auwy10.l = i - 1;
        auwy10.a |= 2048;
        auwy auwy11 = (auwy) b2.i();
        aucd aucd = (aucd) auwy11.c(5);
        aucd.a((aucj) auwy11);
        if (list != null && !list.isEmpty()) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((auwy) aucd.b).d = aucj.s();
            for (int i5 = 0; i5 < list.size(); i5++) {
                auwc a5 = a((ttg) list.get(i5));
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auwy auwy12 = (auwy) aucd.b;
                a5.getClass();
                if (!auwy12.d.a()) {
                    auwy12.d = aucj.a(auwy12.d);
                }
                auwy12.d.add(a5);
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auwy auwy13 = (auwy) aucd.b;
            auwy13.a |= 2;
            auwy13.c = intValue;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auwy auwy14 = (auwy) aucd.b;
            auwy14.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            auwy14.j = intValue2;
        }
        a((auwy) aucd.i());
    }

    public final void b(asom asom, ttg ttg, String str, Integer num) {
        List list;
        asom asom2;
        asom asom3;
        if (!aymw.p() || ttg == null || !ttg.d()) {
            if (ttg != null) {
                list = Collections.singletonList(ttg);
            } else {
                list = null;
            }
            a(asom, list, num, str, (Integer) null);
            return;
        }
        String o = ttg.o();
        asom asom4 = asom.UNKNOWN_DISCOVERY_EVENT;
        int ordinal = asom.ordinal();
        if (ordinal == 9) {
            asom3 = o == null ? asom.FAST_PAIR_NOTIFICATION_CLICKED : asom.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_CLICKED;
        } else if (ordinal != 52) {
            asom2 = asom;
            a(asom2, ttg.G(), ttg.m(), 0);
        } else {
            asom3 = asom.FAST_PAIR_AUTO_LAUNCH_TRIGGERED;
        }
        asom2 = asom3;
        a(asom2, ttg.G(), ttg.m(), 0);
    }

    /* access modifiers changed from: package-private */
    public final auwc a(ttg ttg) {
        int i;
        int i2;
        aucd o = auwc.n.o();
        String i3 = ttg.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwc auwc = (auwc) o.b;
        i3.getClass();
        auwc.a |= 1;
        auwc.b = i3;
        if (!ttg.g()) {
            i = 2;
        } else {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwc auwc2 = (auwc) o.b;
        auwc2.e = i - 1;
        auwc2.a |= 16;
        String G = ttg.G();
        if (G != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc3 = (auwc) o.b;
            G.getClass();
            auwc3.a |= 128;
            auwc3.h = G;
        }
        String t = ttg.t();
        if (t != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc4 = (auwc) o.b;
            t.getClass();
            auwc4.a |= 8;
            auwc4.d = t;
        }
        avbx j = ttg.j();
        if (j != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc5 = (auwc) o.b;
            auwc5.c = j.h;
            auwc5.a |= 2;
        }
        Integer u = ttg.u();
        if (u != null) {
            int intValue = u.intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc6 = (auwc) o.b;
            auwc6.a |= 32;
            auwc6.f = intValue;
        }
        Integer w = ttg.w();
        if (w != null) {
            int intValue2 = w.intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc7 = (auwc) o.b;
            auwc7.a |= 64;
            auwc7.g = intValue2;
        }
        avbe a2 = avbe.a(ttg.b.u);
        if (a2 == null) {
            a2 = avbe.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        if (a2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc8 = (auwc) o.b;
            auwc8.i = a2.d;
            auwc8.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        Double z = ttg.z();
        if (z != null) {
            double doubleValue = z.doubleValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc9 = (auwc) o.b;
            auwc9.a |= 512;
            auwc9.j = doubleValue;
        }
        Long b2 = b(ttg.m());
        if (b2 != null) {
            long longValue = b2.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc10 = (auwc) o.b;
            auwc10.a |= 1024;
            auwc10.k = longValue;
        }
        String G2 = ttg.j() == avbx.NEARBY_DEVICE ? ttg.G() : null;
        if (G2 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwc auwc11 = (auwc) o.b;
            G2.getClass();
            auwc11.a |= 2048;
            auwc11.l = G2;
        }
        if (!this.b.b()) {
            i2 = tgl.a();
        } else {
            i2 = 6;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwc auwc12 = (auwc) o.b;
        auwc12.m = i2 - 1;
        auwc12.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        return (auwc) o.i();
    }

    public final void a(asom asom) {
        a(asom, (ttg) null, (Integer) null);
    }

    public final void a(asom asom, String str, double d2, String str2, int i) {
        if (!aymw.p()) {
            a(asom);
            return;
        }
        aucd o = auwg.i.o();
        int a2 = a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwg auwg = (auwg) o.b;
        int i2 = 1;
        int i3 = auwg.a | 1;
        auwg.a = i3;
        auwg.b = a2;
        auwg.a = i3 | 8;
        auwg.e = d2;
        long longValue = b(str2).longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwg auwg2 = (auwg) o.b;
        int i4 = auwg2.a | 16;
        auwg2.a = i4;
        auwg2.f = longValue;
        if (i == -1) {
            i2 = 2;
        } else if (i == 0) {
            i2 = 3;
        } else if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 5;
        }
        auwg2.g = i2 - 1;
        auwg2.a = i4 | 32;
        auwg auwg3 = (auwg) o.i();
        aucd b2 = b(asom);
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy = (auwy) b2.b;
        auwy auwy2 = auwy.u;
        auwg3.getClass();
        auwy.n = auwg3;
        auwy.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        a((auwy) b2.i());
    }

    public final void a(asom asom, String str, long j) {
        if (!aymw.p()) {
            a(asom);
            return;
        }
        aucd o = auwi.d.o();
        int a2 = a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwi auwi = (auwi) o.b;
        int i = auwi.a | 1;
        auwi.a = i;
        auwi.b = a2;
        auwi.a = i | 2;
        auwi.c = j;
        auwi auwi2 = (auwi) o.i();
        aucd b2 = b(asom);
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy = (auwy) b2.b;
        auwy auwy2 = auwy.u;
        auwi2.getClass();
        auwy.o = auwi2;
        auwy.a |= 16384;
        a((auwy) b2.i());
    }

    public final void a(asom asom, String str, String str2) {
        if (!aymw.p()) {
            a(asom);
            return;
        }
        aucd b2 = b(asom);
        aucd o = auwh.d.o();
        int a2 = a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwh auwh = (auwh) o.b;
        int i = auwh.a | 1;
        auwh.a = i;
        auwh.b = a2;
        str2.getClass();
        auwh.a = i | 2;
        auwh.c = str2;
        auwh auwh2 = (auwh) o.i();
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy = (auwy) b2.b;
        auwy auwy2 = auwy.u;
        auwh2.getClass();
        auwy.q = auwh2;
        auwy.a |= 65536;
        a((auwy) b2.i());
    }

    public final void a(asom asom, String str, String str2, long j) {
        if (!aymw.p()) {
            a(asom);
            return;
        }
        aucd o = auwk.e.o();
        int a2 = a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwk auwk = (auwk) o.b;
        auwk.a |= 1;
        auwk.b = a2;
        long longValue = b(str2).longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwk auwk2 = (auwk) o.b;
        int i = auwk2.a | 2;
        auwk2.a = i;
        auwk2.c = longValue;
        auwk2.a = i | 4;
        auwk2.d = j;
        auwk auwk3 = (auwk) o.i();
        aucd b2 = b(asom);
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy = (auwy) b2.b;
        auwy auwy2 = auwy.u;
        auwk3.getClass();
        auwy.p = auwk3;
        auwy.a |= 32768;
        a((auwy) b2.i());
    }

    public final void a(asom asom, String str, String str2, long j, int i) {
        if (!aymw.p()) {
            a(asom);
            return;
        }
        aucd b2 = b(asom);
        aucd o = auwf.f.o();
        int a2 = a(str);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwf auwf = (auwf) o.b;
        auwf.a |= 1;
        auwf.b = a2;
        long longValue = b(str2).longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwf auwf2 = (auwf) o.b;
        int i2 = auwf2.a | 2;
        auwf2.a = i2;
        auwf2.c = longValue;
        int i3 = i2 | 4;
        auwf2.a = i3;
        auwf2.d = j;
        auwf2.a = i3 | 8;
        auwf2.e = i;
        auwf auwf3 = (auwf) o.i();
        if (b2.c) {
            b2.c();
            b2.c = false;
        }
        auwy auwy = (auwy) b2.b;
        auwy auwy2 = auwy.u;
        auwf3.getClass();
        auwy.t = auwf3;
        auwy.a |= 524288;
        a((auwy) b2.i());
    }

    public final void a(asom asom, List list) {
        a(asom, list, (Integer) null, (String) null, (Integer) null);
    }

    public final void a(asom asom, List list, Integer num) {
        a(asom, list, num, (String) null, (Integer) null);
    }

    public final void a(asom asom, ttg ttg) {
        a(asom, ttg, (Integer) null);
    }

    public final void a(asom asom, ttg ttg, Integer num) {
        List list;
        long j;
        asom asom2;
        asom asom3;
        if (!aymw.p() || ttg == null || !ttg.d()) {
            if (ttg != null) {
                list = Collections.singletonList(ttg);
            } else {
                list = null;
            }
            a(asom, list, num);
            return;
        }
        String o = ttg.o();
        asom asom4 = asom.UNKNOWN_DISCOVERY_EVENT;
        int ordinal = asom.ordinal();
        long j2 = 0;
        if (ordinal == 3) {
            if (o == null) {
                asom3 = asom.FAST_PAIR_NOTIFICATION_SHOWN;
            } else {
                asom3 = asom.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_SHOWN;
            }
            if (ttg.x() != null) {
                j2 = this.d.a() - ttg.x().longValue();
            }
        } else if (ordinal == 4) {
            asom3 = o == null ? asom.FAST_PAIR_NOTIFICATION_TIMEOUT : asom.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_TIMEOUT;
        } else if (ordinal == 10) {
            asom3 = o == null ? asom.FAST_PAIR_NOTIFICATION_DISMISSED : asom.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DISMISSED;
        } else if (ordinal != 55) {
            asom2 = asom;
            j = 0;
            a(asom2, ttg.G(), ttg.m(), j);
        } else {
            asom3 = o == null ? asom.FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED : asom.FAST_PAIR_SECONDARY_DEVICE_NOTIFICATION_DO_NOT_SHOW_CLICKED;
        }
        asom2 = asom3;
        j = j2;
        a(asom2, ttg.G(), ttg.m(), j);
    }

    public final void a(asom asom, ttg ttg, String str, Integer num) {
        List list;
        if (ttg != null) {
            list = Collections.singletonList(ttg);
        } else {
            list = null;
        }
        a(asom, list, (Integer) null, str, num);
    }

    public final void a(auwy auwy) {
        if (!aynf.b() || !((anih) tsp.a.d()).l()) {
            jjg jjg = tsp.a;
        } else {
            ((anih) tsp.a.d()).a("DiscoveryLogger log %s", (Object) tsp.a(auwy));
        }
        auvz a2 = arwa.a((String) null, (String) null, 9);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        auvz auvz = (auvz) aucd.b;
        auvz auvz2 = auvz.k;
        auwy.getClass();
        auvz.i = auwy;
        auvz.a |= 512;
        a((auvz) aucd.i(), false);
    }
}
