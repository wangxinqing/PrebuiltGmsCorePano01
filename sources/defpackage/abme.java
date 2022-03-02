package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.List;

/* renamed from: abme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abme implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ abmf a;

    public abme(abmf abmf) {
        this.a = abmf;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        abmf abmf = this.a;
        return new abmh(abmf.a, abmf.b, abmf.c, abmf.d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        abmg abmg = (abmg) obj;
        abmf abmf = this.a;
        abmf.g = abmg;
        List list = abmf.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((abgb) list.get(i)).a(abmg);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
