package defpackage;

import com.google.android.ulr.LatLngRect;

/* renamed from: alks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alks {
    public static auis a(LatLngRect latLngRect) {
        if (latLngRect == null) {
            return null;
        }
        aucd o = auis.d.o();
        if (latLngRect.getLo() != null) {
            auir a = alkr.a(latLngRect.getLo());
            if (o.c) {
                o.c();
                o.c = false;
            }
            auis auis = (auis) o.b;
            a.getClass();
            auis.b = a;
            auis.a |= 1;
        }
        if (latLngRect.getHi() != null) {
            auir a2 = alkr.a(latLngRect.getHi());
            if (o.c) {
                o.c();
                o.c = false;
            }
            auis auis2 = (auis) o.b;
            a2.getClass();
            auis2.c = a2;
            auis2.a |= 2;
        }
        return (auis) o.i();
    }
}
