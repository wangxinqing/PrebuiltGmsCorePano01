package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: agzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzx extends ahco {
    private final aham a;
    private final Context b;
    private final agzt c;
    private final Object d = new Object();
    private String e;

    public agzx(agzw agzw) {
        this.a = new aham(agzw.c);
        this.b = agzw.a;
        this.c = agzw.b;
    }

    public static agzw a(Context context) {
        return new agzw(context);
    }

    private static final void d() {
        throw new ahax("Android backend cannot perform remote operations without a remote backend");
    }

    private final boolean n(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.b.getPackageName().equals(uri.getAuthority());
    }

    public final String a() {
        return "android";
    }

    public final InputStream b(Uri uri) {
        if (!n(uri)) {
            return this.a.b(l(uri));
        }
        d();
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ahcn c() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Uri l(Uri uri) {
        if (!n(uri)) {
            File k = k(uri);
            ahai a2 = ahaj.a();
            a2.a(k);
            return a2.a();
        }
        throw new ahbk("Operation across authorities is not allowed.");
    }

    /* access modifiers changed from: protected */
    public final Uri m(Uri uri) {
        try {
            agzz a2 = ahaa.a(this.b);
            a2.a(uri.getPath(), this.c);
            return a2.a();
        } catch (IllegalArgumentException e2) {
            throw new ahbk((Throwable) e2);
        }
    }

    public final File k(Uri uri) {
        String str;
        if (!n(uri)) {
            File b2 = ahab.a(this.b, this.c).b(uri);
            if (!aekv.b(this.b)) {
                synchronized (this.d) {
                    if (this.e == null) {
                        this.e = agzy.b(this.b).getAbsolutePath();
                    }
                    str = this.e;
                }
                if (!b2.getAbsolutePath().startsWith(str)) {
                    throw new ahax("Cannot access credential-protected data from direct boot");
                }
            }
            return b2;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    public final boolean a(Uri uri) {
        if (!n(uri)) {
            return this.a.a(l(uri));
        }
        d();
        throw null;
    }
}
