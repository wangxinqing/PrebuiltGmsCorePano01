package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: zlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zlj implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ zlk a;

    public zlj(zlk zlk) {
        this.a = zlk;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        zlk zlk = this.a;
        yrl yrl = new yrl(zlk.F, zlk.G, zlk.H, zlk.m, zlk.n);
        yrl.a(this.a.I);
        return yrl;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ilh ilh = (ilh) obj;
        if (ilh != null) {
            this.a.a(ilh, ((yrl) loader).a());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
