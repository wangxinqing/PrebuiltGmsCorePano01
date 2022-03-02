package defpackage;

/* renamed from: anfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfi {
    public static void a(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
    }

    static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("at index ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    static void a(Object... objArr) {
        a(objArr, objArr.length);
    }

    static void a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
    }
}
