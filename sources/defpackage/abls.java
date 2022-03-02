package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Set;

/* renamed from: abls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abls implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ablu a;
    private final ablt b;
    private final Set c;
    private final boolean d;

    public abls(ablu ablu, Set set, boolean z, ablt ablt) {
        this.a = ablu;
        this.c = set;
        this.d = z;
        this.b = ablt;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ablw(this.a.b, this.c, this.d);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ablt ablt = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        abkl abkl = ((abki) ablt).a;
        if (!booleanValue) {
            i = 4;
        } else {
            i = 3;
        }
        abkl.a(1, i);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
