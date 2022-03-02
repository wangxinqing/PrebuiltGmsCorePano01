package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: arph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arph {
    static final Comparator a = new arpf();
    private static final arpg b = new arpg(Float.NEGATIVE_INFINITY, -1.0f, new HashSet());

    static float a(List list, float f) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException();
        } else if (f != 1.0f) {
            return ((arpu) list.get((int) (((float) list.size()) * f))).e;
        } else {
            return ((arpu) list.get(list.size() - 1)).e;
        }
    }

    public static arpg a(Set set, aybd aybd) {
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arpu arpu = (arpu) it.next();
                if (arpu.e != Float.NEGATIVE_INFINITY && arpu.f >= ((float) aybd.elevationFromWifiMinRssiDbm())) {
                    arrayList.add(arpu);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, a);
                if (((double) (a((List) arrayList, 0.75f) - a((List) arrayList, 0.25f))) <= aybd.elevationFromWifiOutlierThresholdM()) {
                    float a2 = a((List) arrayList, 0.5f);
                    float max = Math.max(2.0f, a((List) arrayList, 0.8f) - a((List) arrayList, 0.2f));
                    if (((double) max) < aybd.elevationMaxVerticalAccuracyMeters()) {
                        return new arpg(a2 + ((float) aybd.elevationDeltaPhoneFromFloorM()), max, arrayList);
                    }
                }
            }
        }
        return b;
    }
}
