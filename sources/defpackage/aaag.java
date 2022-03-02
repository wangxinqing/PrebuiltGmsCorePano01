package defpackage;

import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aaag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaag {
    static {
        aaag.class.getSimpleName();
        new ReentrantReadWriteLock();
    }

    public static byte[] a(List list, int i) {
        int i2 = 8;
        byte[] bArr = new byte[((list.size() * 4) + 8 + i)];
        System.arraycopy(aaae.a(1), 0, bArr, 0, 4);
        System.arraycopy(aaae.a(-267522322), 0, bArr, 4, 4);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            byte[] bArr2 = (byte[]) list.get(i3);
            int length = bArr2.length;
            System.arraycopy(aaae.a(length), 0, bArr, i2, 4);
            int i4 = i2 + 4;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i2 = i4 + length;
        }
        return bArr;
    }
}
