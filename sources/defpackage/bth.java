package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: bth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bth {
    public static atnf a(int i, atnd atnd, String str) {
        aucd o = atnf.d.o();
        aucd o2 = atpd.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atpd atpd = (atpd) o2.b;
        atpd.b = i - 1;
        atpd.a |= 1;
        if (!TextUtils.isEmpty(str)) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atpd atpd2 = (atpd) o2.b;
            str.getClass();
            atpd2.a |= 2;
            atpd2.c = str;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnf atnf = (atnf) o.b;
        atpd atpd3 = (atpd) o2.i();
        atpd3.getClass();
        atnf.b = atpd3;
        atnf.a |= 1;
        aucd o3 = atnb.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atnb atnb = (atnb) o3.b;
        atnb.b = atnd.j;
        atnb.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnf atnf2 = (atnf) o.b;
        atnb atnb2 = (atnb) o3.i();
        atnb2.getClass();
        atnf2.c = atnb2;
        atnf2.a |= 2;
        return (atnf) o.i();
    }

    public static atow a(atjv atjv, atqx atqx, atnf... atnfArr) {
        aucd o = atow.f.o();
        aucd o2 = atoy.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atoy atoy = (atoy) o2.b;
        atoy.c = atjv.bA;
        atoy.a |= 2;
        atoy atoy2 = (atoy) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atow atow = (atow) o.b;
        atoy2.getClass();
        atow.b = atoy2;
        atow.a |= 1;
        List asList = Arrays.asList(atnfArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atow atow2 = (atow) o.b;
        if (!atow2.c.a()) {
            atow2.c = aucj.a(atow2.c);
        }
        auab.a((Iterable) asList, (List) atow2.c);
        aucd o3 = atqv.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atqv atqv = (atqv) o3.b;
        atqv.b = atqx.f;
        atqv.a |= 1;
        atqv atqv2 = (atqv) o3.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atow atow3 = (atow) o.b;
        atqv2.getClass();
        atow3.d = atqv2;
        atow3.a |= 2;
        return (atow) o.i();
    }
}
