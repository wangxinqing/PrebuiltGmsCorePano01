package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.LoaderManager;

/* renamed from: abmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmb {
    public final LoaderManager a;
    public final Context b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public abmb(LoaderManager loaderManager, Context context, int i, String str, String str2, String str3) {
        this.a = loaderManager;
        this.b = context;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final void a(int i, abma abma) {
        this.a.initLoader(i, (Bundle) null, new ablz(this, abma));
    }
}
