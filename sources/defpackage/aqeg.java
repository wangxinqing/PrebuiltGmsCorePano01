package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aqeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqeg {
    public static void a(aqei aqei) {
        if (aqei != null) {
            try {
                aqei.a.disconnect();
            } catch (Throwable th) {
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable th) {
            }
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable th) {
            }
        }
    }
}
