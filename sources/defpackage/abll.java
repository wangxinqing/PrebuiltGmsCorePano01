package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: abll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abll implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ablm a;
    private final String b;
    private final abfc c;

    public abll(ablm ablm, String str, abfc abfc) {
        this.a = ablm;
        this.b = str;
        this.c = abfc;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new abln(this.a.b, this.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.c.a.a(amri.c((Bitmap) obj));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
