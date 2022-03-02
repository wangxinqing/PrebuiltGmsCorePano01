package defpackage;

import android.content.ContentProviderClient;
import android.os.Build;

/* renamed from: apa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apa implements AutoCloseable {
    public final ContentProviderClient a;

    public apa(ContentProviderClient contentProviderClient) {
        this.a = contentProviderClient;
    }

    public final void close() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.close();
        } else {
            this.a.release();
        }
    }
}
