package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: ahai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahai {
    private final Uri.Builder a = new Uri.Builder().scheme("file").authority("").path("/");
    private final amzt b = amzy.j();

    public final Uri a() {
        return this.a.encodedFragment(ahbw.a((List) this.b.a())).build();
    }

    public final void b(String str) {
        this.a.path(str);
    }

    public final void a(File file) {
        this.a.path(file.getAbsolutePath());
    }

    public final void a(String str) {
        this.a.appendPath(str);
    }
}
