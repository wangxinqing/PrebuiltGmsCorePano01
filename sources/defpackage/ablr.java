package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.Set;

/* renamed from: ablr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablr implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ ablu a;
    private final ablt b;
    private final Set c;

    public ablr(ablu ablu, Set set, ablt ablt) {
        this.a = ablu;
        this.c = set;
        this.b = ablt;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ablv(this.a.b, this.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        ablt ablt = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        abkl abkl = ((abkh) ablt).a;
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
