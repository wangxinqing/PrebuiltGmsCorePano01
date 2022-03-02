package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: ahin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahin {
    public static final Comparator h = new ahim();
    public final List a = new ArrayList();
    public long b;
    public long c;
    public Integer d = null;
    public int e = 0;
    public int f = 0;
    public Bundle g;

    static List a(Map map, double d2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (d2 == 0.0d) {
            arrayList.add(new DetectedActivity(4, 100));
            return arrayList;
        }
        for (Map.Entry entry : map.entrySet()) {
            double intValue = (double) ((Integer) entry.getValue()).intValue();
            Double.isNaN(intValue);
            arrayList.add(new DetectedActivity(((Integer) entry.getKey()).intValue(), (int) Math.round(intValue / d2)));
        }
        if (z) {
            Collections.sort(arrayList, h);
        }
        return arrayList;
    }
}
