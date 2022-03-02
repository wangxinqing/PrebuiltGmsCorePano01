package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: ypd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypd implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ypj a;

    public ypd(ypj ypj) {
        this.a = ypj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        ypj ypj = this.a;
        return new yrf(activity, ypj.j, ypj.k, ypj.l, ypj.m, ypj.e);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        xfe xfe = (xfe) obj;
        if (this.a.b().a()) {
            this.a.c().b(xfe.a());
            yoy yoy = (yoy) this.a.getListAdapter();
            yoy.x = new yor(yoy);
            yoy.g();
        }
        ((yoy) this.a.getListAdapter()).a((ilh) xfe);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
