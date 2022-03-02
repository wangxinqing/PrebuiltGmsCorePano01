package defpackage;

import java.security.GeneralSecurityException;

@Deprecated
/* renamed from: aouo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aouo {
    @Deprecated
    public static final aouj a(byte[] bArr) {
        try {
            aoza aoza = (aoza) aucj.a((aucj) aoza.c, bArr, aubs.b());
            a(aoza);
            return aouj.a(aoza);
        } catch (auda e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static void a(aoza aoza) {
        aucx aucx = aoza.b;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            aoyz aoyz = (aoyz) aucx.get(i);
            aoyu aoyu = aoyz.a;
            if (aoyu == null) {
                aoyu = aoyu.d;
            }
            int b = aoyt.b(aoyu.c);
            if (b == 0 || b != 2) {
                aoyu aoyu2 = aoyz.a;
                if (aoyu2 == null) {
                    aoyu2 = aoyu.d;
                }
                int b2 = aoyt.b(aoyu2.c);
                if (b2 == 0 || b2 != 3) {
                    aoyu aoyu3 = aoyz.a;
                    if (aoyu3 == null) {
                        aoyu3 = aoyu.d;
                    }
                    int b3 = aoyt.b(aoyu3.c);
                    if (b3 == 0) {
                        b3 = 1;
                    }
                    i++;
                    if (b3 == 4) {
                    }
                }
            }
            throw new GeneralSecurityException("keyset contains secret key material");
        }
    }
}
