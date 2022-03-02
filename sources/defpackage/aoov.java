package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: aoov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoov {
    aoov() {
    }

    public static aoov a(String str) {
        try {
            return (aoov) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | LinkageError | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }
}
