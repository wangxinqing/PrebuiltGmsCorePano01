package defpackage;

import android.os.Bundle;
import com.google.android.chimera.LoaderManager;

/* renamed from: bjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjn implements ir {
    final LoaderManager.LoaderCallbacks a;

    public bjn(LoaderManager.LoaderCallbacks loaderCallbacks) {
        this.a = loaderCallbacks;
    }

    public final km a(int i, Bundle bundle) {
        return this.a.onCreateLoader(i, bundle).getContainerLoader();
    }

    public final void a(km kmVar) {
        this.a.onLoaderReset(((bjm) kmVar).getModuleLoader());
    }

    public final void a(km kmVar, Object obj) {
        this.a.onLoadFinished(((bjm) kmVar).getModuleLoader(), obj);
    }
}
