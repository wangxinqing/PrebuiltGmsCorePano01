package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: abmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmk {
    public final LoaderManager a;
    public final Context b;
    public final ClientContext c;

    public abmk(LoaderManager loaderManager, ClientContext clientContext, Context context) {
        this.a = loaderManager;
        this.b = context;
        this.c = clientContext;
    }

    public final void a(int i, avik avik, abmj abmj) {
        this.a.restartLoader(i, (Bundle) null, new abmi(this, avik, abmj));
    }
}
