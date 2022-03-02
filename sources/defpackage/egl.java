package defpackage;

import java.util.UUID;

/* renamed from: egl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class egl {
    public static byte[] a() {
        aucd o = aqld.c.o();
        UUID randomUUID = UUID.randomUUID();
        aucd o2 = aqle.d.o();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqle aqle = (aqle) o2.b;
        aqle.a |= 1;
        aqle.b = mostSignificantBits;
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqle aqle2 = (aqle) o2.b;
        aqle2.a |= 2;
        aqle2.c = leastSignificantBits;
        aqle aqle3 = (aqle) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqld aqld = (aqld) o.b;
        aqle3.getClass();
        aqld.b = aqle3;
        aqld.a |= 1;
        return ((aqld) o.i()).k();
    }
}
