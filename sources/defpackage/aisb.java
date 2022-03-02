package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aisb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aisb {
    public static int a(aiau aiau) {
        aiau aiau2 = aiau.OK;
        int ordinal = aiau.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 7;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 2;
        }
        return 5;
    }

    public static long a(long j, aizy aizy) {
        if (j != -1) {
            return System.currentTimeMillis() - TimeUnit.NANOSECONDS.toMillis(aizy.a() - j);
        }
        return -1;
    }
}
