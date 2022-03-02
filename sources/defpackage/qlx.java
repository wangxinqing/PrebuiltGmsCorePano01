package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: qlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlx {
    public static final qfn a = new qfn("InstantAppsStorage");
    public static final Charset b = Charset.forName("UTF-8");
    public final PackageManager c;
    public final qgy d;
    public final String e;
    private final File f = new File(this.e);

    public qlx(Context context, qgy qgy, String str) {
        this.d = qgy;
        this.c = context.getPackageManager();
        this.e = String.valueOf(str).concat("/appStorage");
    }

    public final void a() {
        if (!this.d.a()) {
            throw new IOException("LevelDb creation failed.");
        } else if (!this.f.exists() && !this.f.mkdirs()) {
            throw new IOException("Can't create storage folder.");
        }
    }

    public final File b(String str) {
        return new File(this.e, String.valueOf(str).concat(".gzip"));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        iva.c(str);
        a();
        this.d.b(str.getBytes(b));
        File b2 = b(str);
        if (b2.exists()) {
            b2.delete();
        }
    }
}
