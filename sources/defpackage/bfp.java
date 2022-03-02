package defpackage;

import android.content.Context;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* renamed from: bfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfp implements DiskBasedCache.FileSupplier {
    final /* synthetic */ Context a;
    private File b = null;

    public bfp(Context context) {
        this.a = context;
    }

    public final File get() {
        if (this.b == null) {
            this.b = new File(this.a.getCacheDir(), "volley");
        }
        return this.b;
    }
}
