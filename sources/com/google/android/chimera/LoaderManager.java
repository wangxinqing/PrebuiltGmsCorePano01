package com.google.android.chimera;

import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoaderManager {
    private static WeakHashMap a = new WeakHashMap();
    private final is b;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface LoaderCallbacks {
        Loader onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader loader, Object obj);

        void onLoaderReset(Loader loader);
    }

    private LoaderManager(is isVar) {
        this.b = isVar;
    }

    static LoaderManager get(is isVar) {
        LoaderManager loaderManager;
        WeakReference weakReference = (WeakReference) a.get(isVar);
        if (weakReference != null) {
            loaderManager = (LoaderManager) weakReference.get();
        } else {
            loaderManager = null;
        }
        if (loaderManager != null) {
            return loaderManager;
        }
        LoaderManager loaderManager2 = new LoaderManager(isVar);
        a.put(isVar, new WeakReference(loaderManager2));
        return loaderManager2;
    }

    public void destroyLoader(int i) {
        this.b.a(i);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.a(str, fileDescriptor, printWriter, strArr);
    }

    public Loader getLoader(int i) {
        bjm bjm = (bjm) this.b.b(i);
        if (bjm != null) {
            return bjm.getModuleLoader();
        }
        return null;
    }

    public boolean hasRunningLoaders() {
        return this.b.a();
    }

    public Loader initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        return ((bjm) this.b.a(i, bundle, new bjn(loaderCallbacks))).getModuleLoader();
    }

    public Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        return ((bjm) this.b.b(i, bundle, new bjn(loaderCallbacks))).getModuleLoader();
    }
}
