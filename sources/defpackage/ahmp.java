package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ahmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmp implements ahmg {
    public static final ahmn[] b = {ahmn.ON_BICYCLE, ahmn.INCONSISTENT, ahmn.RUNNING, ahmn.STILL, ahmn.IN_VEHICLE, ahmn.WALKING};
    private final ahmu c;

    public ahmp(ByteBuffer byteBuffer, long j) {
        this.c = new ahmu(b, byteBuffer, j);
    }

    public final List a(ahml ahml) {
        int i;
        if (ahml.c < 4.0E-4f || ahml.s < 4.0E-4f) {
            return Collections.singletonList(new ahmo(ahmn.STILL, 100));
        }
        TreeMap treeMap = new TreeMap();
        for (int i2 = 0; i2 < this.c.a(); i2++) {
            ahms a = this.c.a(i2, ahml.a());
            Integer num = (Integer) treeMap.get(a.a);
            if (num == null) {
                i = 1;
            } else {
                i = Integer.valueOf(num.intValue() + 1);
            }
            treeMap.put((ahmn) a.a, i);
        }
        ativ.b(!treeMap.containsKey(ahmn.ON_FOOT));
        Integer num2 = (Integer) treeMap.get(ahmn.WALKING);
        if (num2 == null) {
            num2 = 0;
        }
        Integer num3 = (Integer) treeMap.get(ahmn.RUNNING);
        if (num3 == null) {
            num3 = 0;
        }
        int intValue = num2.intValue() + num3.intValue();
        if (intValue != 0) {
            treeMap.put(ahmn.ON_FOOT, Integer.valueOf(intValue));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int a2 = this.c.a();
            double d = (double) intValue2;
            Double.isNaN(d);
            double d2 = (double) a2;
            Double.isNaN(d2);
            arrayList.add(new ahmo((ahmn) entry.getKey(), (int) Math.round((d * 100.0d) / d2)));
        }
        Collections.sort(arrayList, ahmg.a);
        return arrayList;
    }

    public final List a(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return a((ahml) ahmm.a(arrayList));
    }
}
