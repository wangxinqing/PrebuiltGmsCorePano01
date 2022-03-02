package defpackage;

import android.util.SparseArray;
import java.util.EnumMap;

/* renamed from: cpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cpu {
    private static SparseArray a = new SparseArray();
    private static EnumMap b;

    static {
        EnumMap enumMap = new EnumMap(clp.class);
        b = enumMap;
        enumMap.put(clp.DEFAULT, 0);
        b.put(clp.VERY_LOW, 1);
        b.put(clp.HIGHEST, 2);
        for (clp clp : b.keySet()) {
            a.append(((Integer) b.get(clp)).intValue(), clp);
        }
    }

    public static int a(clp clp) {
        Integer num = (Integer) b.get(clp);
        if (num != null) {
            return num.intValue();
        }
        String valueOf = String.valueOf(clp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static clp a(int i) {
        clp clp = (clp) a.get(i);
        if (clp != null) {
            return clp;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
