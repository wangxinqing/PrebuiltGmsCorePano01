package defpackage;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: arhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhq {
    public static int a(arhp arhp, Object[] objArr) {
        int i = r0 * 4;
        for (Object obj : objArr) {
            if (obj != null) {
                i += arhp.a(obj);
            }
        }
        return i;
    }

    public static void b(ByteBuffer byteBuffer, arhp arhp, Object[] objArr) {
        int length = objArr.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            int i2 = asIntBuffer.get();
            if (i2 != -1) {
                objArr[i] = arhp.a(byteBuffer, i2);
            }
        }
    }

    public static void a(ByteBuffer byteBuffer, arhp arhp, Object[] objArr) {
        int length = objArr.length;
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        byteBuffer.position(byteBuffer.position() + (length * 4));
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                asIntBuffer.put(-1);
            } else {
                asIntBuffer.put(arhp.a(obj));
                arhp.a(byteBuffer, objArr[i]);
            }
        }
    }
}
