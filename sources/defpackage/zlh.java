package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: zlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zlh implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ zlk a;

    public zlh(zlk zlk) {
        this.a = zlk;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new yrg(this.a.F);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        xfj xfj = (xfj) obj;
        if (xfj != null) {
            this.a.a(xfj);
        } else {
            this.a.a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
