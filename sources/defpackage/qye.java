package defpackage;

import android.os.Build;
import android.os.Trace;
import java.io.Closeable;

/* renamed from: qye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qye implements Closeable {
    private final boolean a;

    public qye(String str) {
        int i = Build.VERSION.SDK_INT;
        boolean b = axke.a.a().b();
        this.a = b;
        if (b) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    public final void close() {
        if (this.a) {
            Trace.endSection();
        }
    }
}
