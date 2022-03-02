package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.util.Comparator;

/* renamed from: akrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akrl implements Comparator {
    private final LatLng a;

    public akrl(LatLng latLng) {
        this.a = latLng;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        akrj akrj = (akrj) obj;
        akrj akrj2 = (akrj) obj2;
        double a2 = rls.a(akrj.b, this.a);
        float f = akrj.c;
        double a3 = rls.a(akrj2.b, this.a);
        double d = (double) f;
        Double.isNaN(d);
        double d2 = (double) akrj2.c;
        Double.isNaN(d2);
        int compare = Double.compare(a2 - d, a3 - d2);
        return compare == 0 ? Double.compare(a2, a3) : compare;
    }
}
