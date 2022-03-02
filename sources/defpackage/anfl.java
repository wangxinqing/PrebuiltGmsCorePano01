package defpackage;

import java.lang.reflect.Array;

/* renamed from: anfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfl {
    static Object[] a(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }
}
