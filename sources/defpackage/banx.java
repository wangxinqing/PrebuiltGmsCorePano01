package defpackage;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: banx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class banx {
    public static final String[] a = new String[0];
    public static final Charset b = Charset.forName("UTF-8");

    public static List a(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static Object[] a(Class cls, Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr2[i];
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }
}
