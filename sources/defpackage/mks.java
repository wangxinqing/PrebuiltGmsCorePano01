package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: mks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mks implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mkx a;

    public mks(mkx mkx) {
        this.a = mkx;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mkx mkx = this.a;
        return new mmv(activity, mkx.b, mkx.a.k(), this.a.a.j());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        mhg mhg = (mhg) obj;
        if (mhg.b) {
            apjn apjn = (apjn) mhg.a;
            mkx mkx = this.a;
            int size = apjn.i.size();
            mkx.c = Integer.valueOf((apjn.g - size) - apjn.h.size());
            this.a.a();
            return;
        }
        this.a.b();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
