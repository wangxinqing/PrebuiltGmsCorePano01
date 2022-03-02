package defpackage;

import java.util.Arrays;
import java.util.Map;

/* renamed from: wuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuf implements wuj {
    private final String a;
    private final byte[] b;

    public wuf(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final int a() {
        return this.b.length;
    }

    public final String b() {
        return this.a;
    }

    public final byte[] a(int i) {
        if (i != Integer.MAX_VALUE) {
            byte[] bArr = this.b;
            if (i < bArr.length) {
                return Arrays.copyOf(bArr, i);
            }
        }
        return this.b;
    }

    public final Map c() {
        return anfu.b;
    }
}
