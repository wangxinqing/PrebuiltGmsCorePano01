package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: yph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yph implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ypj a;

    public yph(ypj ypj) {
        this.a = ypj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("page_token");
        } else {
            str = null;
        }
        Activity activity = this.a.getActivity();
        ypj ypj = this.a;
        return new yrm(activity, ypj.l, ypj.m, ypj.j, 0, ((Integer) ysu.M.c()).intValue(), str);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        PeopleFeed peopleFeed = (PeopleFeed) obj;
        if (peopleFeed != null) {
            if (((yrm) loader).a == null) {
                yoy yoy = (yoy) this.a.getListAdapter();
                yoy.p.clear();
                yoy.C = 0;
                yoy.a(peopleFeed);
            } else {
                ((yoy) this.a.getListAdapter()).a(peopleFeed);
            }
            if (peopleFeed.e != null) {
                Bundle bundle = new Bundle();
                bundle.putString("page_token", peopleFeed.e);
                this.a.getLoaderManager().restartLoader(3, bundle, new yph(this.a));
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
