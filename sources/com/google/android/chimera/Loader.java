package com.google.android.chimera;

import android.content.Context;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Loader {
    private WeakHashMap Ds;
    private WeakHashMap b;
    protected km proxy;
    protected bjm proxyCallbacks;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface OnLoadCanceledListener {
        void onLoadCanceled(Loader loader);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OnLoadCanceledListenerWrapper implements kk {
        OnLoadCanceledListener a;

        public OnLoadCanceledListenerWrapper(OnLoadCanceledListener onLoadCanceledListener) {
            this.a = onLoadCanceledListener;
        }

        public void onLoadCanceled(km kmVar) {
            this.a.onLoadCanceled(((bjm) kmVar).getModuleLoader());
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface OnLoadCompleteListener {
        void onLoadComplete(Loader loader, Object obj);
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class OnLoadCompleteListenerWrapper implements kl {
        OnLoadCompleteListener a;

        public OnLoadCompleteListenerWrapper(OnLoadCompleteListener onLoadCompleteListener) {
            this.a = onLoadCompleteListener;
        }

        public void onLoadComplete(km kmVar, Object obj) {
            this.a.onLoadComplete(((bjm) kmVar).getModuleLoader(), obj);
        }
    }

    public Loader(Context context) {
        setProxy(new LoaderProxy(this, context));
    }

    public void abandon() {
        this.proxyCallbacks.superAbandon();
    }

    public boolean cancelLoad() {
        return this.proxyCallbacks.superCancelLoad();
    }

    public void commitContentChanged() {
        this.proxyCallbacks.superCommitContentChanged();
    }

    public String dataToString(Object obj) {
        return this.proxyCallbacks.superDataToString(obj);
    }

    public void deliverCancellation() {
        this.proxyCallbacks.superDeliverCancellation();
    }

    public void deliverResult(Object obj) {
        this.proxyCallbacks.superDeliverResult(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.proxyCallbacks.superDump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.proxyCallbacks.superForceLoad();
    }

    public km getContainerLoader() {
        return this.proxy;
    }

    public Context getContext() {
        return this.proxyCallbacks.superGetContext();
    }

    public int getId() {
        return this.proxyCallbacks.superGetId();
    }

    public boolean isAbandoned() {
        return this.proxyCallbacks.superIsAbandoned();
    }

    public boolean isReset() {
        return this.proxyCallbacks.superIsReset();
    }

    public boolean isStarted() {
        return this.proxyCallbacks.superIsStarted();
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.proxyCallbacks.superOnAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.proxyCallbacks.superOnCancelLoad();
    }

    public void onContentChanged() {
        this.proxyCallbacks.superOnContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.proxyCallbacks.superOnForceLoad();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.proxyCallbacks.superOnReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.proxyCallbacks.superOnStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.proxyCallbacks.superOnStopLoading();
    }

    public synchronized void registerListener(int i, OnLoadCompleteListener onLoadCompleteListener) {
        OnLoadCompleteListenerWrapper onLoadCompleteListenerWrapper;
        if (this.Ds == null) {
            this.Ds = new WeakHashMap();
        }
        WeakReference weakReference = (WeakReference) this.Ds.get(onLoadCompleteListener);
        if (weakReference != null) {
            onLoadCompleteListenerWrapper = (OnLoadCompleteListenerWrapper) weakReference.get();
            if (onLoadCompleteListenerWrapper != null) {
                this.proxyCallbacks.superRegisterListener(i, onLoadCompleteListenerWrapper);
            }
        }
        onLoadCompleteListenerWrapper = new OnLoadCompleteListenerWrapper(onLoadCompleteListener);
        this.Ds.put(onLoadCompleteListener, new WeakReference(onLoadCompleteListenerWrapper));
        this.proxyCallbacks.superRegisterListener(i, onLoadCompleteListenerWrapper);
    }

    public synchronized void registerOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        OnLoadCanceledListenerWrapper onLoadCanceledListenerWrapper;
        if (this.b == null) {
            this.b = new WeakHashMap();
        }
        WeakReference weakReference = (WeakReference) this.b.get(onLoadCanceledListener);
        if (weakReference != null) {
            onLoadCanceledListenerWrapper = (OnLoadCanceledListenerWrapper) weakReference.get();
            if (onLoadCanceledListenerWrapper != null) {
                this.proxyCallbacks.superRegisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
            }
        }
        onLoadCanceledListenerWrapper = new OnLoadCanceledListenerWrapper(onLoadCanceledListener);
        this.b.put(onLoadCanceledListener, new WeakReference(onLoadCanceledListenerWrapper));
        this.proxyCallbacks.superRegisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
    }

    public void reset() {
        this.proxyCallbacks.superReset();
    }

    public void rollbackContentChanged() {
        this.proxyCallbacks.superRollbackContentChanged();
    }

    /* access modifiers changed from: protected */
    public void setProxy(km kmVar) {
        this.proxy = kmVar;
        this.proxyCallbacks = (bjm) kmVar;
    }

    public final void startLoading() {
        this.proxy.startLoading();
    }

    public void stopLoading() {
        this.proxyCallbacks.superStopLoading();
    }

    public boolean takeContentChanged() {
        return this.proxyCallbacks.superTakeContentChanged();
    }

    public String toString() {
        return this.proxyCallbacks.superToString();
    }

    public synchronized void unregisterListener(OnLoadCompleteListener onLoadCompleteListener) {
        OnLoadCompleteListenerWrapper onLoadCompleteListenerWrapper;
        WeakReference weakReference = (WeakReference) this.Ds.remove(onLoadCompleteListener);
        if (weakReference != null) {
            onLoadCompleteListenerWrapper = (OnLoadCompleteListenerWrapper) weakReference.get();
        } else {
            onLoadCompleteListenerWrapper = null;
        }
        if (onLoadCompleteListenerWrapper != null) {
            this.proxyCallbacks.superUnregisterListener(onLoadCompleteListenerWrapper);
        }
    }

    public synchronized void unregisterOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        OnLoadCanceledListenerWrapper onLoadCanceledListenerWrapper;
        WeakReference weakReference = (WeakReference) this.b.remove(onLoadCanceledListener);
        if (weakReference != null) {
            onLoadCanceledListenerWrapper = (OnLoadCanceledListenerWrapper) weakReference.get();
        } else {
            onLoadCanceledListenerWrapper = null;
        }
        if (onLoadCanceledListenerWrapper != null) {
            this.proxyCallbacks.superUnregisterOnLoadCanceledListener(onLoadCanceledListenerWrapper);
        }
    }
}
