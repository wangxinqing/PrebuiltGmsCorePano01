package defpackage;

import java.security.SecureRandom;
import java.util.Random;

/* renamed from: amrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amrx {
    public static final Random a = new amrv();
    public static final ThreadLocal b = new amru();

    static {
        a();
        new amrw();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
