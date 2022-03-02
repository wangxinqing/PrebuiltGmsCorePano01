package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: aniw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aniw {
    public static final aniy a = a(aniy.d);

    private static aniy a(String[] strArr) {
        aniy aniy;
        try {
            aniy = aniz.a();
        } catch (NoClassDefFoundError e) {
            aniy = null;
        }
        if (aniy != null) {
            return aniy;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (aniy) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(10);
                sb.append(str);
                sb.append(": ");
                sb.append(th);
                i++;
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
