package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aooc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aooc {
    public static final /* synthetic */ int a = 0;

    static {
        StringBuilder sb = new StringBuilder(78);
        sb.append("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?".length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|");
        sb3.append(sb2);
        sb3.append(")");
        sb3.toString().replace("#", "+");
    }

    public static int a(double d) {
        return Double.valueOf(d).hashCode();
    }

    public static boolean b(double d) {
        return true;
    }

    public static int a(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List a(double... dArr) {
        int length = dArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new aoob(dArr, 0, length);
    }

    public static double[] a(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            amrl.a(obj);
            dArr[i] = ((Number) obj).doubleValue();
        }
        return dArr;
    }
}
