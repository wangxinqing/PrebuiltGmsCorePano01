package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: baxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxi {
    public static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void a(String str) {
        Throwable th;
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError != 1285) {
                StringBuilder sb = new StringBuilder(str.length() + 27);
                sb.append(str);
                sb.append(": GLES20 error: ");
                sb.append(glGetError);
                th = new RuntimeException(sb.toString());
            } else {
                th = new baxh(str);
            }
            throw th;
        }
    }
}
