package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: ablz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablz implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ abmb a;
    private final abma b;
    private boolean c;

    public ablz(abmb abmb, abma abma) {
        this.a = abmb;
        this.b = abma;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        abmb abmb = this.a;
        return new abmd(abmb.b, abmb.d, abmb.e, abmb.f, abmb.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        abmc abmc = (abmc) obj;
        if (!this.c && abmc.b == 1) {
            this.b.a(abmc.a);
            this.c = true;
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
