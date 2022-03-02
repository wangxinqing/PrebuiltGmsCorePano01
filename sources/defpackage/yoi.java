package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: yoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yoi implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ yok a;

    public yoi(yok yok) {
        this.a = yok;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        yok yok = this.a;
        yrj yrj = new yrj(activity, yok.j, yok.k, yok.l, yok.m);
        yrj.b(this.a.c);
        return yrj;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((yod) this.a.getListAdapter()).c((xfk) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
