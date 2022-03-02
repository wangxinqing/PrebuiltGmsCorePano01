package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import java.util.List;

/* renamed from: hws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hws {
    public static apez a(ExperimentTokens experimentTokens, int[] iArr) {
        int[] iArr2 = null;
        if (experimentTokens == null && iArr == null) {
            return null;
        }
        apey apey = (apey) apez.e.o();
        if (experimentTokens != null) {
            iArr2 = experimentTokens.h;
        }
        if (!a(iArr2) || !a(iArr)) {
            apew apew = (apew) apex.b.o();
            if (iArr2 != null) {
                for (int a : iArr2) {
                    apew.a(a);
                }
            }
            if (iArr != null) {
                for (int a2 : iArr) {
                    apew.a(a2);
                }
            }
            auay au = ((apex) apew.i()).au();
            if (apey.c) {
                apey.c();
                apey.c = false;
            }
            apez apez = (apez) apey.b;
            au.getClass();
            apez.a |= 1;
            apez.b = au;
        }
        if (experimentTokens != null) {
            byte[] bArr = experimentTokens.c;
            if (!(bArr == null || bArr.length == 0)) {
                apey.a(auay.a(bArr));
            }
            byte[][] bArr2 = experimentTokens.i;
            if (bArr2 != null) {
                for (byte[] bArr3 : bArr2) {
                    if (!(bArr3 == null || bArr3.length == 0)) {
                        apey.a(auay.a(bArr3));
                    }
                }
            }
            if (apey.c) {
                apey.c();
                apey.c = false;
            }
            apez apez2 = (apez) apey.b;
            apez2.a |= 4;
            apez2.d = true;
            byte[][][] bArr4 = {experimentTokens.d, experimentTokens.e, experimentTokens.f, experimentTokens.g};
            for (int i = 0; i < 4; i++) {
                byte[][] bArr5 = bArr4[i];
                if (bArr5 != null) {
                    List a3 = anda.a(Arrays.asList(bArr5), (amqy) auga.a.a());
                    if (apey.c) {
                        apey.c();
                        apey.c = false;
                    }
                    apez apez3 = (apez) apey.b;
                    apez3.a();
                    auab.a((Iterable) a3, (List) apez3.c);
                }
            }
        }
        return (apez) apey.i();
    }

    private static boolean a(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }
}
