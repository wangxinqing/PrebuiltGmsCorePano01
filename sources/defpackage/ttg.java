package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;
import java.util.Objects;

/* renamed from: ttg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttg implements Comparable {
    private static final auzz c = tsr.a(101);
    public final jiq a;
    public uaj b;
    private final ttf d;

    public ttg(Context context, uaj uaj) {
        this.d = (ttf) thl.a(context, ttf.class);
        this.a = (jiq) thl.a(context, jiq.class);
        this.b = uaj;
    }

    private final Float K() {
        uaj uaj = this.b;
        if ((uaj.a & 1048576) != 0) {
            return Float.valueOf(uaj.w);
        }
        return null;
    }

    private final void L() {
        List D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            a((uak) D.get(i), false);
        }
    }

    private static int a(auzz auzz, auzz auzz2) {
        int i = 1;
        if (auzz == null) {
            return auzz2 != null ? -1 : 0;
        }
        if (auzz2 == null) {
            return 1;
        }
        int b2 = avbj.b(auzz.b);
        if (b2 == 0) {
            b2 = 1;
        }
        int i2 = b2 - 1;
        int b3 = avbj.b(auzz2.b);
        if (b3 != 0) {
            i = b3;
        }
        return i2 - (i - 1);
    }

    private static boolean a(auzz auzz) {
        return (auzz.a & 4) != 0 || auzz.c > 0.0d;
    }

    public static boolean b(long j, Long l) {
        if (l == null || j - l.longValue() >= aymq.a.a().G()) {
            return true;
        }
        return false;
    }

    public final Bitmap A() {
        uaj uaj = this.b;
        if ((uaj.a & 8388608) == 0) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(uaj.z.k(), 0, this.b.z.a());
        if (!aryg.a(decodeByteArray)) {
            return null;
        }
        return decodeByteArray;
    }

    public final String B() {
        uaj uaj = this.b;
        if ((uaj.a & 65536) != 0) {
            return uaj.s;
        }
        return null;
    }

    public final boolean C() {
        aucx aucx = this.b.C;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            auzz auzz = ((uak) aucx.get(i)).b;
            if (auzz == null) {
                auzz = auzz.d;
            }
            i++;
            if (a(auzz)) {
                return true;
            }
        }
        return false;
    }

    public final List D() {
        return this.b.C;
    }

    public final Long E() {
        uaj uaj = this.b;
        if ((uaj.a & 131072) != 0) {
            return Long.valueOf(uaj.t);
        }
        return null;
    }

    public final Integer F() {
        Object[] objArr = new Object[2];
        uaj uaj = this.b;
        objArr[0] = uaj.y;
        avbe a2 = avbe.a(uaj.u);
        if (a2 == null) {
            a2 = avbe.DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        objArr[1] = a2;
        return Integer.valueOf(Objects.hash(objArr));
    }

    public final String G() {
        uaj uaj = this.b;
        if ((uaj.a & 4194304) != 0) {
            return uaj.y;
        }
        return null;
    }

    public final int H() {
        int a2 = uae.a(this.b.B);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public final int I() {
        int a2 = uag.a(this.b.E);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public final int J() {
        int a2 = uai.a(this.b.m);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public final String b() {
        return this.b.A;
    }

    public final boolean c() {
        return a(this.b, this.a.a());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d2;
        ttg ttg = (ttg) obj;
        if (j() != ttg.j()) {
            return !f() ? -1 : 1;
        }
        int a2 = a(s(), ttg.s());
        if (a2 != 0) {
            return a2;
        }
        Double z = z();
        Double z2 = ttg.z();
        double d3 = Double.MAX_VALUE;
        if (z != null) {
            d2 = z.doubleValue();
        } else {
            d2 = Double.MAX_VALUE;
        }
        Double valueOf = Double.valueOf(d2);
        if (z2 != null) {
            d3 = z2.doubleValue();
        }
        return -valueOf.compareTo(Double.valueOf(d3));
    }

    public final boolean d() {
        uaj uaj = this.b;
        if ((uaj.a & 8) == 0) {
            return false;
        }
        Intent a2 = uan.a(uaj.f);
        if (a2 != null) {
            return "com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR".equals(a2.getAction());
        }
        ((anih) tsp.a.c()).a("FastPair: fail to parse action url %s", (Object) this.b.f);
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ttg) {
            return ((ttg) obj).b.equals(this.b);
        }
        return false;
    }

    public final boolean f() {
        avbx a2 = avbx.a(this.b.d);
        if (a2 == null) {
            a2 = avbx.NEARBY_TYPE_UNKNOWN;
        }
        return a(a2);
    }

    public final boolean g() {
        int a2 = uai.a(this.b.m);
        return a2 == 0 || a2 != 2;
    }

    public final int h() {
        String str;
        avbx avbx = avbx.NEARBY_TYPE_UNKNOWN;
        avbx a2 = avbx.a(this.b.d);
        if (a2 == null) {
            a2 = avbx.NEARBY_TYPE_UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 3 || ordinal == 4) {
            avbx a3 = avbx.a(this.b.d);
            if (a3 == null) {
                a3 = avbx.NEARBY_TYPE_UNKNOWN;
            }
            return Objects.hashCode(a3);
        }
        Object[] objArr = new Object[6];
        avbx a4 = avbx.a(this.b.d);
        if (a4 == null) {
            a4 = avbx.NEARBY_TYPE_UNKNOWN;
        }
        objArr[0] = a4;
        uaj uaj = this.b;
        objArr[1] = uaj.h;
        objArr[2] = uaj.i;
        objArr[3] = uaj.r;
        objArr[4] = uaj.j;
        if (aymw.m()) {
            str = this.b.e;
        } else {
            str = null;
        }
        objArr[5] = str;
        return Objects.hash(objArr);
    }

    public final int hashCode() {
        uaj uaj = this.b;
        int i = uaj.S;
        if (i != 0) {
            return i;
        }
        int a2 = aueh.a.a((Object) uaj).a(uaj);
        uaj.S = a2;
        return a2;
    }

    public final String i() {
        uaj uaj = this.b;
        if ((uaj.a & 1) != 0) {
            return uaj.c;
        }
        return null;
    }

    public final avbx j() {
        uaj uaj = this.b;
        if ((uaj.a & 2) == 0) {
            return null;
        }
        avbx a2 = avbx.a(uaj.d);
        return a2 == null ? avbx.NEARBY_TYPE_UNKNOWN : a2;
    }

    public final String k() {
        uaj uaj = this.b;
        if ((uaj.a & 32) != 0) {
            return uaj.h;
        }
        return null;
    }

    public final String l() {
        uaj uaj = this.b;
        if ((uaj.a & 64) != 0) {
            return uaj.i;
        }
        return null;
    }

    public final String m() {
        uaj uaj = this.b;
        if ((uaj.a & 4) != 0) {
            return uaj.e;
        }
        return null;
    }

    public final byte[] n() {
        uaj uaj = this.b;
        if ((uaj.a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            return uaj.H.k();
        }
        return null;
    }

    public final String o() {
        uaj uaj = this.b;
        if ((uaj.a & 8) == 0) {
            return null;
        }
        Intent a2 = uan.a(uaj.f);
        if (a2 != null) {
            return a2.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_FAST_PAIR_SECRET");
        }
        ((anih) tsp.a.c()).a("FastPair: fail to parse action url %s", (Object) this.b.f);
        return null;
    }

    public final auzo p() {
        uaj uaj = this.b;
        if ((uaj.a & Integer.MIN_VALUE) == 0) {
            return null;
        }
        auzo auzo = uaj.I;
        return auzo == null ? auzo.j : auzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = defpackage.avbp.a(p().c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r2 = this;
            auzo r0 = r2.p()
            if (r0 == 0) goto L_0x0017
            auzo r0 = r2.p()
            int r0 = r0.c
            int r0 = defpackage.avbp.a(r0)
            if (r0 == 0) goto L_0x0017
            r1 = 2
            if (r0 != r1) goto L_0x0017
            r0 = 1
            return r0
        L_0x0017:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttg.q():boolean");
    }

    public final List r() {
        auzo p = p();
        if (p == null) {
            return amzy.h();
        }
        return new aucu(p.f, auzo.g);
    }

    public final auzz s() {
        auzz auzz = c;
        aucx aucx = this.b.C;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            uak uak = (uak) aucx.get(i);
            if (a(this.a, uak)) {
                auzz auzz2 = uak.b;
                if (auzz2 == null) {
                    auzz2 = auzz.d;
                }
                if (a(auzz2, auzz) > 0 && (auzz = uak.b) == null) {
                    auzz = auzz.d;
                }
            }
        }
        return auzz;
    }

    public final String t() {
        uaj uaj = this.b;
        if ((uaj.a & 8) != 0) {
            return uaj.f;
        }
        return null;
    }

    public final String toString() {
        Object[] objArr = new Object[9];
        objArr[0] = j().name();
        int i = 1;
        objArr[1] = G();
        objArr[2] = i();
        objArr[3] = k();
        objArr[4] = t();
        objArr[5] = Boolean.valueOf(C());
        int b2 = avbj.b(s().b);
        if (b2 != 0) {
            i = b2;
        }
        objArr[6] = avbj.a(i);
        objArr[7] = Boolean.valueOf(e());
        objArr[8] = m();
        return String.format("[type=%s], [triggerId=%s], [id=%s], [title=%s], [url=%s], [targeting=%s], [R=%s], [ready=%s], [macAddress=%s]", objArr);
    }

    public final Integer u() {
        uaj uaj = this.b;
        if ((uaj.a & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
            return Integer.valueOf(uaj.p);
        }
        return null;
    }

    public final byte[] v() {
        uaj uaj = this.b;
        if ((uaj.a & 268435456) != 0) {
            return uaj.F.k();
        }
        return null;
    }

    public final Integer w() {
        uaj uaj = this.b;
        if ((uaj.a & 16384) != 0) {
            return Integer.valueOf(uaj.q);
        }
        return null;
    }

    public final Long x() {
        uaj uaj = this.b;
        if ((uaj.a & 512) != 0) {
            return Long.valueOf(uaj.l);
        }
        return null;
    }

    public final Long y() {
        uaj uaj = this.b;
        if ((uaj.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            return Long.valueOf(uaj.k);
        }
        return null;
    }

    public final Double z() {
        uaj uaj = this.b;
        int i = uaj.a;
        if ((i & FragmentTransaction.TRANSIT_EXIT_MASK) == 0 || (i & 16384) == 0) {
            return null;
        }
        return Double.valueOf(guq.b(uaj.p, uaj.q));
    }

    public final boolean e() {
        avbx j = j();
        if (j == avbx.NEARBY_CHROMECAST || j == avbx.NEARBY_WEAR) {
            return true;
        }
        boolean z = !this.b.f.isEmpty();
        if (TextUtils.isEmpty(this.b.h) || !z) {
            return false;
        }
        return true;
    }

    public static uaj a() {
        aucd o = uaj.K.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        uaj uaj = (uaj) o.b;
        uaj.m = 1;
        uaj.a |= 1024;
        return (uaj) o.i();
    }

    public static boolean b(avbx avbx) {
        avbx avbx2 = avbx.NEARBY_TYPE_UNKNOWN;
        int ordinal = avbx.ordinal();
        if (ordinal == 3) {
            return aymq.a.a().j();
        }
        if (ordinal == 4) {
            return aymq.a.a().af();
        }
        if (ordinal == 5) {
            return aymq.a.a().D();
        }
        ((anih) tsp.a.b()).a("Invalid item type %s", (Object) avbx.name());
        return false;
    }

    public static boolean a(long j, Long l) {
        return l == null || j - l.longValue() >= aymq.k();
    }

    public static boolean a(long j, uaj uaj) {
        if ((uaj.a & FragmentTransaction.TRANSIT_ENTER_MASK) == 0 || j - uaj.o >= aymq.a.a().d()) {
            return false;
        }
        return true;
    }

    public final void b(int i) {
        int a2 = uai.a(this.b.m);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 != i) {
            uaj uaj = this.b;
            aucd aucd = (aucd) uaj.c(5);
            aucd.a((aucj) uaj);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj2 = (uaj) aucd.b;
            uaj uaj3 = uaj.K;
            uaj2.m = i - 1;
            uaj2.a |= 1024;
            this.b = (uaj) aucd.i();
            L();
            this.d.b(this);
        }
    }

    public static boolean a(avbx avbx) {
        return avbx == avbx.NEARBY_CHROMECAST || avbx == avbx.NEARBY_WEAR || avbx == avbx.NEARBY_DEVICE;
    }

    public static boolean a(jiq jiq, uak uak) {
        auzz auzz = uak.b;
        if (auzz == null) {
            auzz = auzz.d;
        }
        if (a(auzz)) {
            return (uak.a & 2) != 0 && jiq.a() - uak.c < aymq.k();
        }
        return true;
    }

    static boolean a(uaj uaj, long j) {
        Long l;
        int i = uaj.a;
        if ((67108864 & i) != 0 && uaj.k <= uaj.D) {
            return false;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            l = Long.valueOf(uaj.k);
        } else {
            l = null;
        }
        return !a(j, l);
    }

    public final void b(int i, String str) {
        if (str == null) {
            uaj uaj = this.b;
            aucd aucd = (aucd) uaj.c(5);
            aucd.a((aucj) uaj);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj2 = (uaj) aucd.b;
            uaj uaj3 = uaj.K;
            uaj2.a &= -16777217;
            uaj2.A = uaj.K.A;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj4 = (uaj) aucd.b;
            uaj4.B = i - 1;
            uaj4.a |= 33554432;
            this.b = (uaj) aucd.i();
        } else {
            uaj uaj5 = this.b;
            aucd aucd2 = (aucd) uaj5.c(5);
            aucd2.a((aucj) uaj5);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            uaj uaj6 = (uaj) aucd2.b;
            uaj uaj7 = uaj.K;
            str.getClass();
            int i2 = uaj6.a | 16777216;
            uaj6.a = i2;
            uaj6.A = str;
            uaj6.B = i - 1;
            uaj6.a = i2 | 33554432;
            this.b = (uaj) aucd2.i();
        }
        this.d.b(this);
    }

    public final DiscoveryListItem a(Intent intent) {
        String str;
        String str2;
        float f;
        String str3;
        String str4;
        boolean z;
        String i = i();
        String k = k();
        String l = l();
        uaj uaj = this.b;
        int i2 = uaj.a;
        if ((32768 & i2) != 0) {
            str = uaj.r;
        } else {
            str = null;
        }
        if ((i2 & 524288) != 0) {
            str2 = uaj.v;
        } else {
            str2 = null;
        }
        if (K() != null) {
            f = K().floatValue();
        } else {
            f = -1.0f;
        }
        uaj uaj2 = this.b;
        int i3 = uaj2.a;
        if ((2097152 & i3) != 0) {
            str3 = uaj2.x;
        } else {
            str3 = null;
        }
        if ((i3 & 128) != 0) {
            str4 = uaj2.j;
        } else {
            str4 = t();
        }
        boolean g = g();
        avbx j = j();
        Bitmap A = A();
        int a2 = avcb.a(this.b.n);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 == 3) {
            z = true;
        } else {
            z = false;
        }
        return new DiscoveryListItem(i, k, l, str, str2, f, str3, str4, g, j, intent, A, z, z(), m());
    }

    public final void a(int i) {
        uaj uaj = this.b;
        aucd aucd = (aucd) uaj.c(5);
        aucd.a((aucj) uaj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj2 = (uaj) aucd.b;
        uaj uaj3 = uaj.K;
        uaj2.E = i - 1;
        uaj2.a |= 134217728;
        this.b = (uaj) aucd.i();
        this.d.b(this);
    }

    public final boolean b(long j) {
        return a(j, this.b);
    }

    public final void a(int i, String str) {
        ((anih) tsp.a.d()).a("Item disabled on client: %s, %s", (Object) str, (Object) this);
        b(i, str);
    }

    public final void a(long j) {
        uaj uaj = this.b;
        aucd aucd = (aucd) uaj.c(5);
        aucd.a((aucj) uaj);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj2 = (uaj) aucd.b;
        uaj uaj3 = uaj.K;
        uaj2.a |= 67108864;
        uaj2.D = j;
        this.b = (uaj) aucd.i();
        L();
        uaj uaj4 = this.b;
        aucd aucd2 = (aucd) uaj4.c(5);
        aucd2.a((aucj) uaj4);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        uaj uaj5 = (uaj) aucd2.b;
        uaj5.a &= -8193;
        uaj5.p = 0;
        this.b = (uaj) aucd2.i();
        this.d.b(this);
    }

    public final void a(Long l) {
        if (l != null) {
            uaj uaj = this.b;
            aucd aucd = (aucd) uaj.c(5);
            aucd.a((aucj) uaj);
            long longValue = l.longValue();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uaj uaj2 = (uaj) aucd.b;
            uaj uaj3 = uaj.K;
            uaj2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            uaj2.o = longValue;
            this.b = (uaj) aucd.i();
        } else {
            uaj uaj4 = this.b;
            aucd aucd2 = (aucd) uaj4.c(5);
            aucd2.a((aucj) uaj4);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            uaj uaj5 = (uaj) aucd2.b;
            uaj uaj6 = uaj.K;
            uaj5.a &= -4097;
            uaj5.o = 0;
            this.b = (uaj) aucd2.i();
        }
        this.d.b(this);
    }

    public final void a(uak uak, boolean z) {
        aucd aucd = (aucd) uak.c(5);
        aucd.a((aucj) uak);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uak uak2 = (uak) aucd.b;
            uak uak3 = uak.d;
            uak2.a |= 2;
            uak2.c = currentTimeMillis;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            uak uak4 = (uak) aucd.b;
            uak uak5 = uak.d;
            uak4.a &= -3;
            uak4.c = 0;
        }
        List D = D();
        uak uak6 = (uak) aucd.i();
        uaj uaj = this.b;
        aucd aucd2 = (aucd) uaj.c(5);
        aucd2.a((aucj) uaj);
        int size = D.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((uak) D.get(i2)) == uak) {
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                uaj uaj2 = (uaj) aucd2.b;
                uaj uaj3 = uaj.K;
                uak6.getClass();
                uaj2.a();
                uaj2.C.set(i, uak6);
            }
            i++;
        }
        this.b = (uaj) aucd2.i();
        this.d.b(this);
    }

    public final void a(boolean z) {
        int i;
        int a2 = uai.a(this.b.m);
        if (a2 == 0 || a2 != 3) {
            if (!z) {
                i = 4;
            } else {
                i = 2;
            }
            b(i);
        }
    }
}
