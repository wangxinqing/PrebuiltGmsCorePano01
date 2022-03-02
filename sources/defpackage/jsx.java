package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.LoaderManager;

/* renamed from: jsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jsx {
    public final Context a;
    private final LoaderManager b;

    public jsx(LoaderManager loaderManager, Context context) {
        this.b = loaderManager;
        this.a = context;
    }

    public final void a(String str, int i, jsw jsw) {
        if (str.startsWith("android.resource")) {
            this.b.initLoader(i, (Bundle) null, new jst(this, jsw, str));
        } else {
            this.b.initLoader(i, (Bundle) null, new jsu(this, jsw, str));
        }
    }
}
