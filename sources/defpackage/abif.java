package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import java.util.List;

/* renamed from: abif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abif extends abii {
    final /* synthetic */ abij a;

    public abif(abij abij) {
        this.a = abij;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        abij abij = this.a;
        return new ablj(abij.d, abij.b, abij.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.e.a((List) obj);
    }
}
