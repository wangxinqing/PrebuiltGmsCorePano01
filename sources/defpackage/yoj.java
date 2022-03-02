package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: yoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yoj implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ yok a;

    public yoj(yok yok) {
        this.a = yok;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        yok yok = this.a;
        yrl yrl = new yrl(activity, yok.j, yok.k, yok.l, yok.m);
        yrl.a(this.a.c);
        return yrl;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ilh ilh = (ilh) obj;
        if (ilh != null) {
            ((yod) this.a.getListAdapter()).a(ilh, ((yrl) loader).a());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
