package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: zli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zli implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ zlk a;

    public zli(zlk zlk) {
        this.a = zlk;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        zlk zlk = this.a;
        yrj yrj = new yrj(zlk.F, zlk.G, zlk.H, zlk.m, zlk.n);
        yrj.b(this.a.I);
        return yrj;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        xfk xfk = (xfk) obj;
        if (xfk != null) {
            this.a.c(xfk);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
