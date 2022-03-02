package defpackage;

import com.google.android.ulr.LatLng;

/* renamed from: alkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkr {
    public static auir a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        aucd o = auir.d.o();
        if (latLng.b() != null) {
            int intValue = latLng.b().intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auir auir = (auir) o.b;
            auir.a |= 1;
            auir.b = intValue;
        }
        if (latLng.c() != null) {
            int intValue2 = latLng.c().intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auir auir2 = (auir) o.b;
            auir2.a |= 2;
            auir2.c = intValue2;
        }
        return (auir) o.i();
    }
}
