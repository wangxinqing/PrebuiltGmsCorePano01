package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: moa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class moa implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ mob a;
    private final apix b;
    private final String c;

    public moa(mob mob, String str, apix apix) {
        this.a = mob;
        this.b = apix;
        this.c = str;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        Activity activity = this.a.getActivity();
        mob mob = this.a;
        return new mpq(activity, mob.d, mob.c.k(), this.a.c.j(), this.c, this.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.g();
        if (((mhg) obj).b) {
            mnz mnz = this.a.c;
            if (mnz != null) {
                mnz.h();
            }
            this.a.a();
            return;
        }
        this.a.e();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
