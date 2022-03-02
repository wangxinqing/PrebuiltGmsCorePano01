package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: alft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alft {
    public static final int[] a = {7842000, 3921000, 1825000, 1130000, 579000, 287000, 143000, 72000, 36000, 18000, 9000, 4000, 2000, 1123, 562, 281, 140, 70, 35, 18, 9, 4, 2};

    public static List a(LatLngBounds latLngBounds, int i, Collection collection) {
        Iterator it;
        ArrayList arrayList;
        double[] dArr;
        LatLngBounds latLngBounds2 = latLngBounds;
        double[] dArr2 = new double[2];
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            long longValue = ((Long) it2.next()).longValue();
            aema.a(longValue, dArr2);
            LatLng latLng = new LatLng(dArr2[0], dArr2[1]);
            if (!latLngBounds2.a(latLng)) {
                LatLng latLng2 = latLngBounds2.a;
                LatLng latLng3 = latLngBounds2.b;
                double d = latLng.a;
                double b = aell.b(d, latLng.b, d, latLng3.b);
                double d2 = latLng.a;
                dArr = dArr2;
                double min = Math.min(b, aell.b(d2, latLng.b, d2, latLng2.b));
                double d3 = latLng.a;
                double d4 = latLng.b;
                double b2 = aell.b(d3, d4, latLng3.a, d4);
                double d5 = latLng.a;
                double d6 = latLng.b;
                arrayList = arrayList2;
                it = it2;
                double min2 = Math.min(b2, aell.b(d5, d6, latLng2.a, d6));
                double d7 = latLng.a;
                if (latLng2.a > d7 || d7 > latLng3.a) {
                    double d8 = latLng.b;
                    double d9 = latLng2.b;
                    double d10 = latLng3.b;
                    if (d9 > d10 ? !(d9 <= d8 || d8 <= d10) : !(d9 <= d8 && d8 <= d10)) {
                        int i2 = a[i];
                        double hypot = Math.hypot(min, min2);
                        double d11 = (double) i2;
                        Double.isNaN(d11);
                        if (hypot >= (d11 * 1.414d) / 2.0d) {
                            it2 = it;
                            dArr2 = dArr;
                            arrayList2 = arrayList;
                        }
                    } else if (min2 >= ((double) (a[i] / 2))) {
                        it2 = it;
                        dArr2 = dArr;
                        arrayList2 = arrayList;
                    }
                } else if (min >= ((double) (a[i] / 2))) {
                    it2 = it;
                    dArr2 = dArr;
                    arrayList2 = arrayList;
                }
            } else {
                dArr = dArr2;
                arrayList = arrayList2;
                it = it2;
            }
            arrayList2 = arrayList;
            arrayList2.add(Long.valueOf(longValue));
            it2 = it;
            dArr2 = dArr;
        }
        return arrayList2;
    }
}
