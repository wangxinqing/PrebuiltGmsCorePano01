package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: qbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbv {
    public static anty a(int i, qbu qbu, String str) {
        aucd o = antz.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antz antz = (antz) o.b;
        antz.b = i - 1;
        int i2 = antz.a | 1;
        antz.a = i2;
        long j = qbu.c;
        long j2 = qbu.b;
        int i3 = i2 | 4;
        antz.a = i3;
        antz.d = j - j2;
        long j3 = qbu.d;
        antz.a = i3 | 2;
        antz.c = j3;
        antz antz2 = (antz) o.i();
        aucd o2 = anty.n.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty = (anty) o2.b;
        anty.b = 1;
        int i4 = anty.a | 1;
        anty.a = i4;
        antz2.getClass();
        anty.e = antz2;
        int i5 = i4 | 8;
        anty.a = i5;
        if (str != null) {
            str.getClass();
            anty.a = i5 | 2;
            anty.c = str;
        }
        return (anty) o2.i();
    }

    public static anty a(qbk qbk, qbr qbr, String str) {
        int i;
        if (qbr.e.a()) {
            i = ((Status) qbr.e.b()).i;
        } else {
            i = 0;
        }
        aucd o = antu.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antu antu = (antu) o.b;
        antu.b = qbk.ay;
        int i2 = antu.a | 1;
        antu.a = i2;
        int i3 = i2 | 4;
        antu.a = i3;
        antu.d = i;
        long j = qbr.d;
        antu.a = i3 | 2;
        antu.c = j;
        antu antu2 = (antu) o.i();
        aucd o2 = anty.n.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty = (anty) o2.b;
        anty.b = 2;
        int i4 = anty.a | 1;
        anty.a = i4;
        antu2.getClass();
        anty.d = antu2;
        int i5 = i4 | 4;
        anty.a = i5;
        if (str != null) {
            str.getClass();
            anty.a = i5 | 2;
            anty.c = str;
        }
        return (anty) o2.i();
    }
}
