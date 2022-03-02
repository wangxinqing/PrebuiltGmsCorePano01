package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: jhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhx {
    public static ArrayList a() {
        return new ArrayList();
    }

    public static Object[] b(Object[] objArr, Object obj) {
        Object[] objArr2;
        if (objArr == null && obj == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        if (objArr != null) {
            objArr2 = Arrays.copyOf(objArr, objArr.length + 1);
        } else {
            objArr2 = (Object[]) Array.newInstance(obj.getClass(), 1);
        }
        objArr2[objArr2.length - 1] = obj;
        return objArr2;
    }

    public static void a(StringBuilder sb, Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(objArr[i].toString());
        }
    }

    public static boolean a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Object[] objArr, Object obj) {
        int i;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (!ius.a(objArr[i2], obj)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 == str) {
                return true;
            }
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static int[] a(Collection collection) {
        int i = 0;
        if (collection == null || collection.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static long[] a(Long[] lArr) {
        if (lArr == null) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    public static Object[] a(Object[]... objArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += objArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(objArr[0], i);
        int length = objArr[0].length;
        for (char c = 1; c < 2; c = 2) {
            Object[] objArr2 = objArr[1];
            int length2 = objArr2.length;
            System.arraycopy(objArr2, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }
}
