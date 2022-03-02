package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: yoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yoh implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ yok a;

    public yoh(yok yok) {
        this.a = yok;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        yok yok = this.a;
        yrh yrh = new yrh(activity, yok.j, yok.k, yok.l, yok.m);
        yrh.b(this.a.c);
        return yrh;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ((yod) this.a.getListAdapter()).b((xfe) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
