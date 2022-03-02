package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: ahco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahco implements ahcn {
    public final void a(Uri uri, Uri uri2) {
        c().a(l(uri), l(uri2));
    }

    public boolean a(Uri uri) {
        throw null;
    }

    public final ahbj b() {
        return c().b();
    }

    public InputStream b(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract ahcn c();

    public final OutputStream c(Uri uri) {
        return c().c(l(uri));
    }

    public final void d(Uri uri) {
        c().d(l(uri));
    }

    public final OutputStream e(Uri uri) {
        return c().e(l(uri));
    }

    public final void f(Uri uri) {
        c().f(l(uri));
    }

    public final boolean g(Uri uri) {
        return c().g(l(uri));
    }

    public final void h(Uri uri) {
        c().h(l(uri));
    }

    public final long i(Uri uri) {
        return c().i(l(uri));
    }

    public final Iterable j(Uri uri) {
        ArrayList arrayList = new ArrayList();
        for (Uri m : c().j(l(uri))) {
            arrayList.add(m(m));
        }
        return arrayList;
    }

    public File k(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public Uri l(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public Uri m(Uri uri) {
        throw null;
    }
}
