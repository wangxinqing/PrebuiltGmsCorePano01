package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: aeeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeeo {
    public final audx[] a;

    public aeeo(audx[] audxArr) {
        this.a = audxArr;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
