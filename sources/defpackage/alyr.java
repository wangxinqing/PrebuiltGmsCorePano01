package defpackage;

/* renamed from: alyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyr {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    public static boolean a(Object... objArr) {
        if ((objArr.length & 1) == 0) {
            for (int i = 0; i < objArr.length; i += 2) {
                if (!a(objArr[i], objArr[i + 1])) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("There must be an even number of fields to compare.");
    }
}
