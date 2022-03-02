package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: mpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mpa implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mpc a;

    public mpa(mpc mpc) {
        this.a = mpc;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new mpp(this.a.getActivity(), this.a.a);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        aqkv aqkv = (aqkv) obj;
        if (aqkv != null) {
            if ((aqkv.a & 2) != 0) {
                aqks aqks = aqkv.c;
                if (aqks == null) {
                    aqks = aqks.b;
                }
                int a2 = aqkn.a(aqks.a);
                if (a2 != 0 && a2 == 2) {
                    this.a.a(true);
                    return;
                }
            }
            if ((aqkv.a & 1) != 0) {
                aqkt aqkt = aqkv.b;
                if (aqkt == null) {
                    aqkt = aqkt.b;
                }
                int a3 = aqkn.a(aqkt.a);
                if (a3 != 0 && a3 == 2) {
                    this.a.a(false);
                    return;
                }
            }
            this.a.a(true);
            return;
        }
        this.a.a(true);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
