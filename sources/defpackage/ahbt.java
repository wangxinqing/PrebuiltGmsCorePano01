package defpackage;

import android.os.Build;
import java.io.IOException;
import java.util.List;

/* renamed from: ahbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbt {
    public static IOException a(String str, List list) {
        int i = Build.VERSION.SDK_INT;
        IOException iOException = new IOException(str);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            apev.a((Throwable) iOException, (Throwable) (IOException) list.get(i2));
        }
        return iOException;
    }
}
