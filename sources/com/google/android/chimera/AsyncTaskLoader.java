package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AsyncTaskLoader extends Loader {
    public AsyncTaskLoader(Context context) {
        super(context);
        setProxy(new AsyncTaskLoaderProxy(this, context));
    }

    public void cancelLoadInBackground() {
        getProxyCallbacks().superCancelLoadInBackground();
    }

    public ke getContainerLoader() {
        return (ke) this.proxy;
    }

    /* access modifiers changed from: protected */
    public biz getProxyCallbacks() {
        return (biz) this.proxyCallbacks;
    }

    public boolean isLoadInBackgroundCanceled() {
        return getProxyCallbacks().superIsLoadInBackgroundCanceled();
    }

    public abstract Object loadInBackground();

    public void onCanceled(Object obj) {
        getProxyCallbacks().superOnCanceled(obj);
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return getProxyCallbacks().superOnLoadInBackground();
    }

    public void setUpdateThrottle(long j) {
        getProxyCallbacks().superSetUpdateThrottle(j);
    }

    public void waitForLoader() {
    }
}
