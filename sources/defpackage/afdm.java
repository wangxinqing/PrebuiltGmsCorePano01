package defpackage;

import java.io.IOException;

/* renamed from: afdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdm extends IOException {
    public afdm(String str) {
        super(str);
    }

    public static afdm a(IOException iOException) {
        if (iOException instanceof afdm) {
            throw ((afdm) iOException);
        }
        throw new afdm("Generic IOException encountered", iOException);
    }

    public afdm(String str, Throwable th) {
        super(str, th);
    }
}
