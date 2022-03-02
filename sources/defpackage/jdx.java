package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: jdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdx {
    private static jdx a = null;
    private final ExecutorService b = jfm.b(10);

    private jdx() {
    }

    public static jdx a() {
        if (a == null) {
            a = new jdx();
        }
        return a;
    }

    public static final synchronized void a(Context context, int i, long j, long j2) {
        synchronized (jdx.class) {
            new jea(context, i, j, j2, true, true).run();
        }
    }

    public final synchronized Future a(ContentResolver contentResolver, int i) {
        return this.b.submit(new jeb(contentResolver, i), true);
    }

    public final synchronized Future a(Context context, int i, long j, long j2, boolean z, boolean z2) {
        Future submit;
        synchronized (this) {
            submit = this.b.submit(new jea(context, i, j, j2, z, z2), true);
        }
        return submit;
    }
}
