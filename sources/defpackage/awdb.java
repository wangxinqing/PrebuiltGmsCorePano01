package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: awdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdb extends Exception {
    public static final Method a;
    public IOException b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception e) {
            method = null;
        }
        a = method;
    }

    public awdb(IOException iOException) {
        super(iOException);
        this.b = iOException;
    }
}
