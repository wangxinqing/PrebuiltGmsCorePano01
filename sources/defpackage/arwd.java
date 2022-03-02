package defpackage;

import java.nio.ByteBuffer;

/* renamed from: arwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwd implements arwb {
    public final int[] a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(anln.d().a(bArr).b());
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = wrap.getInt();
        }
        return iArr;
    }
}
