package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: ypg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypg implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ypj a;

    public ypg(ypj ypj) {
        this.a = ypj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        ypj ypj = this.a;
        return new yrj(activity, ypj.j, ypj.k, ypj.l, ypj.m);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((yoy) this.a.getListAdapter()).c((xfk) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
