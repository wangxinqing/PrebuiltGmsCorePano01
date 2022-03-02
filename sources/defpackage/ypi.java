package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: ypi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ypi implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ypj a;

    public ypi(ypj ypj) {
        this.a = ypj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        ypj ypj = this.a;
        return new yrm(activity, ypj.l, ypj.m, ypj.j, 1, ypj.g + ypj.h, (String) null);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PeopleFeed peopleFeed = (PeopleFeed) obj;
        if (peopleFeed != null) {
            yoy yoy = (yoy) this.a.getListAdapter();
            yoy.r = peopleFeed;
            yoy.z = yoy.a(yoy.r, yoy.q);
            yoy.g();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
