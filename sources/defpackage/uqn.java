package defpackage;

import java.nio.ByteBuffer;

/* renamed from: uqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uqn {
    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 3 && length <= 14) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 1);
            allocate.put((byte) ((length + length) & 30));
            allocate.put(bArr);
            return allocate.array();
        }
        ((anih) ((anih) ulh.a.c()).a("uqn", "a", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Out of range modelId. Expected between %d and %d but got %d instead.", (Object) 3, (Object) 14, (Object) Integer.valueOf(length));
        return null;
    }
}
