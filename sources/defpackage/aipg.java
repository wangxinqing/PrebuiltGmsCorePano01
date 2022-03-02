package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: aipg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipg implements aizw {
    private static aipg a;
    private final hol b;
    private final ahyl c;

    public aipg(hol hol, ahyl ahyl) {
        this.b = hol;
        this.c = ahyl;
    }

    public static synchronized aipg a(Context context) {
        aipg aipg;
        synchronized (aipg.class) {
            if (a == null) {
                a = new aipg(new hol(context.getApplicationContext(), "LE", (String) null), new ahyl(context));
            }
            aipg = a;
        }
        return aipg;
    }

    public final synchronized void a() {
        this.b.a(30, TimeUnit.MINUTES);
    }

    public final synchronized void a(long j, int i, long j2, boolean z, boolean z2, int i2, int i3, int i4) {
        long j3 = j;
        long j4 = j2;
        int i5 = i3;
        int i6 = i4;
        synchronized (this) {
            if (j3 >= 0) {
                aucd o = anyw.j.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                anyw anyw = (anyw) o.b;
                int i7 = anyw.a | 2;
                anyw.a = i7;
                anyw.c = j3;
                int i8 = i7 | 8;
                anyw.a = i8;
                anyw.e = z;
                int i9 = i8 | 16;
                anyw.a = i9;
                anyw.f = z2;
                int i10 = i9 | 32;
                anyw.a = i10;
                anyw.g = i2;
                int i11 = i10 | 1;
                anyw.a = i11;
                anyw.b = i;
                if (j4 >= 0) {
                    i11 |= 4;
                    anyw.a = i11;
                    anyw.d = j4;
                }
                if (i5 >= 0) {
                    i11 |= 64;
                    anyw.a = i11;
                    anyw.h = i5;
                }
                if (i6 >= 0) {
                    anyw.a = i11 | 128;
                    anyw.i = i6;
                }
                aucd o2 = anyu.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anyu anyu = (anyu) o2.b;
                anyu.b = 2;
                anyu.a |= 1;
                anyw anyw2 = (anyw) o.i();
                anyw2.getClass();
                anyu.d = anyw2;
                anyu.a |= 4;
                aucd o3 = anui.p.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                anui anui = (anui) o3.b;
                anui.b = 2;
                anui.a |= 1;
                anyu anyu2 = (anyu) o2.i();
                anyu2.getClass();
                anui.d = anyu2;
                anui.a |= 4;
                this.b.a(((anui) o3.i()).k()).b();
            }
        }
    }

    public final synchronized void a(artq artq) {
        aucd o = anyu.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anyu anyu = (anyu) o.b;
        anyu.b = 3;
        int i = anyu.a | 1;
        anyu.a = i;
        artq.getClass();
        anyu.e = artq;
        anyu.a = i | 8;
        aucd o2 = anui.p.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anui anui = (anui) o2.b;
        anui.b = 2;
        anui.a |= 1;
        anyu anyu2 = (anyu) o.i();
        anyu2.getClass();
        anui.d = anyu2;
        anui.a |= 4;
        this.b.a(((anui) o2.i()).k()).b();
    }

    public final synchronized void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        aucd o = aoga.h.o();
        boolean booleanValue = bool.booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoga aoga = (aoga) o.b;
        aoga.a |= 1;
        aoga.b = booleanValue;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoga aoga2 = (aoga) o.b;
            aoga2.a |= 2;
            aoga2.c = booleanValue2;
        }
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoga aoga3 = (aoga) o.b;
            aoga3.a |= 4;
            aoga3.d = booleanValue3;
        }
        boolean booleanValue4 = bool4.booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoga aoga4 = (aoga) o.b;
        aoga4.a |= 8;
        aoga4.e = booleanValue4;
        boolean booleanValue5 = bool5.booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoga aoga5 = (aoga) o.b;
        aoga5.a |= 16;
        aoga5.f = booleanValue5;
        boolean booleanValue6 = bool6.booleanValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoga aoga6 = (aoga) o.b;
        aoga6.a |= 32;
        aoga6.g = booleanValue6;
        aucd o2 = anui.p.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anui anui = (anui) o2.b;
        anui.b = 3;
        anui.a |= 1;
        aoga aoga7 = (aoga) o.i();
        aoga7.getClass();
        anui.e = aoga7;
        anui.a |= 8;
        this.b.a(((anui) o2.i()).k()).b();
    }

    public final synchronized void a(String str, long j) {
        if (this.c.a()) {
            aucd o = anyc.j.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anyc anyc = (anyc) o.b;
            str.getClass();
            anyc.a |= 1;
            anyc.b = str;
            aucd o2 = anyv.d.o();
            int min = (int) Math.min(j, 2147483647L);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anyv anyv = (anyv) o2.b;
            anyv.a |= 1;
            anyv.b = min;
            anyc anyc2 = (anyc) o.i();
            anyc2.getClass();
            anyv.c = anyc2;
            anyv.a |= 2;
            aucd o3 = anyu.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anyu anyu = (anyu) o3.b;
            anyu.b = 1;
            anyu.a |= 1;
            anyv anyv2 = (anyv) o2.i();
            anyv2.getClass();
            anyu.c = anyv2;
            anyu.a |= 2;
            aucd o4 = anui.p.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            anui anui = (anui) o4.b;
            anui.b = 2;
            anui.a |= 1;
            anyu anyu2 = (anyu) o3.i();
            anyu2.getClass();
            anui.d = anyu2;
            anui.a |= 4;
            this.b.a(((anui) o4.i()).k()).b();
        }
    }
}
