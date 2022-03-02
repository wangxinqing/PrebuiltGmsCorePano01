package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: yog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yog implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ yok a;

    public yog(yok yok) {
        this.a = yok;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new yrg(this.a.getActivity());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        xfj xfj = (xfj) obj;
        if (xfj != null) {
            ((yod) this.a.getListAdapter()).a(xfj);
        } else {
            ((yod) this.a.getListAdapter()).a();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
