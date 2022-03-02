package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: arwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwc {
    public static final Charset a = StandardCharsets.UTF_8;
    private final BitSet b;
    private final int c;
    private final arwb d;

    public arwc(byte[] bArr, arwb arwb) {
        this.b = BitSet.valueOf(bArr);
        this.c = bArr.length * 8;
        this.d = arwb;
    }

    public final void a(String str) {
        for (int a2 : this.d.a(str.getBytes(a))) {
            this.b.set(aooq.a(a2, this.c));
        }
    }

    public final boolean a(byte[] bArr) {
        for (int a2 : this.d.a(bArr)) {
            if (!this.b.get(aooq.a(a2, this.c))) {
                return false;
            }
        }
        return true;
    }

    public final byte[] a() {
        byte[] byteArray = this.b.toByteArray();
        int length = byteArray.length;
        int i = this.c / 8;
        return length != i ? Arrays.copyOf(byteArray, i) : byteArray;
    }
}
