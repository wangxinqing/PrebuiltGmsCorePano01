package defpackage;

import java.util.Arrays;

/* renamed from: yhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhu {
    public final apgu a;
    public yhx b = null;

    public yhu(String str, int i, String[] strArr, int[] iArr, byte[] bArr, boolean z, String str2) {
        apgq apgq = (apgq) apgu.l.o();
        if (apgq.c) {
            apgq.c();
            apgq.c = false;
        }
        apgu apgu = (apgu) apgq.b;
        int i2 = apgu.a | 2;
        apgu.a = i2;
        apgu.e = i;
        int i3 = i2 | 8;
        apgu.a = i3;
        apgu.i = z;
        apgu.j = 1;
        int i4 = i3 | 64;
        apgu.a = i4;
        if (str != null) {
            str.getClass();
            apgu.a = i4 | 1;
            apgu.d = str;
        }
        if (strArr != null && strArr.length > 0) {
            apgq.a((Iterable) Arrays.asList(strArr));
        }
        if (iArr != null && (r5 = iArr.length) > 0) {
            for (int a2 : iArr) {
                apgq.a(a2);
            }
        }
        if (bArr != null && bArr.length > 0) {
            auay a3 = auay.a(bArr);
            if (apgq.c) {
                apgq.c();
                apgq.c = false;
            }
            apgu apgu2 = (apgu) apgq.b;
            a3.getClass();
            apgu2.a |= 4;
            apgu2.h = a3;
        }
        if (str2 != null) {
            if (apgq.c) {
                apgq.c();
                apgq.c = false;
            }
            apgu apgu3 = (apgu) apgq.b;
            str2.getClass();
            apgu3.b = 7;
            apgu3.c = str2;
        }
        this.a = (apgu) apgq.i();
    }
}
