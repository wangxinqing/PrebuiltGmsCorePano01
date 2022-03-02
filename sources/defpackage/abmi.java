package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.List;

/* renamed from: abmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abmi implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ abmk a;
    private final avik b;
    private final abmj c;

    public abmi(abmk abmk, avik avik, abmj abmj) {
        this.a = abmk;
        this.b = avik;
        this.c = abmj;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        abmk abmk = this.a;
        return new ablx(abmk.b, abmk.c, this.b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.c.a((List) obj);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
