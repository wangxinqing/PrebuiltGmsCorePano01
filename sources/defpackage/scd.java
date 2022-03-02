package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Random;

/* renamed from: scd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class scd implements afsb, sdw {
    private static final Random a = new Random();
    private final Context b;
    private final int c;
    private final String d;
    private final afsu e;

    public scd(Context context, afsu afsu, int i) {
        this.b = context;
        this.e = afsu;
        this.c = i;
        this.d = context.getPackageName();
    }

    private final void a(int i, aucd aucd, int i2) {
        boolean z;
        long j = (long) i2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji = (aoji) aucd.b;
        aoji aoji2 = aoji.R;
        aoji.a |= 524288;
        aoji.s = j;
        aucd o = aojh.c.o();
        if (this.b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null) {
            z = true;
        } else {
            z = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojh aojh = (aojh) o.b;
        aojh.a |= 1;
        aojh.b = z;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji3 = (aoji) aucd.b;
        aojh aojh2 = (aojh) o.i();
        aojh2.getClass();
        aoji3.E = aojh2;
        aoji3.b |= 64;
        aucd o2 = aoiu.d.o();
        String str = this.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoiu aoiu = (aoiu) o2.b;
        str.getClass();
        int i3 = aoiu.a | 2;
        aoiu.a = i3;
        aoiu.c = str;
        int i4 = this.c;
        aoiu.a = 1 | i3;
        aoiu.b = i4;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji4 = (aoji) aucd.b;
        aoiu aoiu2 = (aoiu) o2.i();
        aoiu2.getClass();
        aoji4.L = aoiu2;
        aoji4.b |= 131072;
        hoi a2 = this.e.a.a((audx) aucd.i());
        a2.b(aolk.a(i));
        a2.b();
    }

    public final void b(int i) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            a(i, aoji.R.o(), b2);
        }
    }

    public static boolean a(int i) {
        if (i > 0) {
            return a.nextInt(i) == 0;
        }
        if (i < 0) {
            afsh.a("Bad sample interval: %d", (Object) Integer.valueOf(i));
        }
        return false;
    }

    public final void a(int i, int i2) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            aucd o = aoji.R.o();
            aucd o2 = aojw.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojw aojw = (aojw) o2.b;
            int i3 = aojw.a | 2;
            aojw.a = i3;
            aojw.c = i2;
            aojw.b = i - 2;
            aojw.a = i3 | 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aojw aojw2 = (aojw) o2.i();
            aojw2.getClass();
            aoji.J = aojw2;
            aoji.b |= 16384;
            a(1053, o, b2);
        }
    }

    public final void a(int i, aojg aojg) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            aucd o = aoji.R.o();
            aucd o2 = aojv.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojv aojv = (aojv) o2.b;
            if (i != 1) {
                aojv.b = i - 2;
                aojv.a |= 1;
                aojv aojv2 = (aojv) o2.b;
                aojg.getClass();
                aojv2.c = aojg;
                aojv2.a |= 2;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoji aoji = (aoji) o.b;
                aojv aojv3 = (aojv) o2.i();
                aojv3.getClass();
                aoji.P = aojv3;
                aoji.b |= 536870912;
                a(1070, o, b2);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public final void a(int i, String str, int i2) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            aucd o = aojg.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojg aojg = (aojg) o.b;
            str.getClass();
            int i3 = aojg.a | 1;
            aojg.a = i3;
            aojg.b = str;
            aojg.a = i3 | 2;
            aojg.c = i2;
            aojg aojg2 = (aojg) o.i();
            aucd o2 = aoji.R.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoji aoji = (aoji) o2.b;
            aojg2.getClass();
            aoji.j = aojg2;
            aoji.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            a(i, o2, b2);
        }
    }

    public final void a(aojg aojg) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            aucd o = aoji.R.o();
            aucd o2 = aokb.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aokb aokb = (aokb) o2.b;
            aojg.getClass();
            aokb.b = aojg;
            aokb.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokb aokb2 = (aokb) o2.i();
            aokb2.getClass();
            aoji.Q = aokb2;
            aoji.b |= JGCastService.FLAG_PRIVATE_DISPLAY;
            a(1071, o, b2);
        }
    }

    public final void a(aojg aojg, int i, long j, long j2, String str, int i2) {
        int b2 = (int) axtc.b();
        if (a(b2)) {
            aucd o = aoji.R.o();
            aucd o2 = aojy.h.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojy aojy = (aojy) o2.b;
            aojg.getClass();
            aojy.b = aojg;
            int i3 = aojy.a | 1;
            aojy.a = i3;
            aojy.c = i - 2;
            aojy.a = i3 | 2;
            aojy aojy2 = (aojy) o2.b;
            int i4 = aojy2.a | 4;
            aojy2.a = i4;
            aojy2.d = j;
            int i5 = i4 | 8;
            aojy2.a = i5;
            aojy2.e = j2;
            str.getClass();
            int i6 = i5 | 16;
            aojy2.a = i6;
            aojy2.f = str;
            aojy2.a = i6 | 32;
            aojy2.g = i2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aojy aojy3 = (aojy) o2.i();
            aojy3.getClass();
            aoji.O = aojy3;
            aoji.b |= 1048576;
            a(1068, o, b2);
        }
    }

    public final void a(aojg aojg, aoju aoju) {
        int a2 = (int) axtc.a.a().a();
        if (a(a2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aojg.getClass();
            aoji.j = aojg;
            int i = aoji.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aoji.a = i;
            aoju.getClass();
            aoji.C = aoju;
            aoji.a = i | Integer.MIN_VALUE;
            a(1047, o, a2);
        }
    }

    public final void a(aojg aojg, aojx aojx, int i) {
        aucd o = aoji.R.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoji aoji = (aoji) o.b;
        aojg.getClass();
        aoji.j = aojg;
        int i2 = aoji.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aoji.a = i2;
        aojx.getClass();
        aoji.B = aojx;
        aoji.a = i2 | JGCastService.FLAG_PRIVATE_DISPLAY;
        a(1046, o, i);
    }

    public final void a(aoka aoka, int i) {
        aucd o = aoji.R.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoji aoji = (aoji) o.b;
        aoka.getClass();
        aoji.K = aoka;
        aoji.b |= 32768;
        a(1058, o, i);
    }

    public final void a(aokc aokc, int i) {
        aucd o = aoji.R.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoji aoji = (aoji) o.b;
        aokc.getClass();
        aoji.I = aokc;
        aoji.b |= FragmentTransaction.TRANSIT_ENTER_MASK;
        a(1057, o, i);
    }

    public final void a(aokq aokq) {
        int e2 = (int) axtc.a.a().e();
        if (a(e2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokq.getClass();
            aoji.u = aokq;
            aoji.a |= 2097152;
            a(13002, o, e2);
        }
    }
}
