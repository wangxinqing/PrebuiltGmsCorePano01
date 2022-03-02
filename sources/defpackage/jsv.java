package defpackage;

import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: jsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class jsv implements LoaderManager.LoaderCallbacks {
    private final jsw a;

    public jsv(jsw jsw) {
        this.a = jsw;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a((amri) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
