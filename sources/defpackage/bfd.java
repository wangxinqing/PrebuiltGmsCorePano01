package defpackage;

import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* renamed from: bfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfd implements DiskBasedCache.FileSupplier {
    final /* synthetic */ File a;

    public bfd(File file) {
        this.a = file;
    }

    public final File get() {
        return this.a;
    }
}
