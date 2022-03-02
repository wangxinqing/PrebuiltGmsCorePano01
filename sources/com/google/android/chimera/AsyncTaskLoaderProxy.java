package com.google.android.chimera;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AsyncTaskLoaderProxy extends ke implements biz {
    private final AsyncTaskLoader c;

    public AsyncTaskLoaderProxy(AsyncTaskLoader asyncTaskLoader, Context context) {
        super(context);
        this.c = asyncTaskLoader;
    }

    public void abandon() {
        this.c.abandon();
    }

    public boolean cancelLoad() {
        return this.c.cancelLoad();
    }

    public void cancelLoadInBackground() {
        this.c.cancelLoadInBackground();
    }

    public void commitContentChanged() {
        this.c.commitContentChanged();
    }

    public String dataToString(Object obj) {
        return this.c.dataToString(obj);
    }

    public void deliverCancellation() {
        this.c.deliverCancellation();
    }

    public void deliverResult(Object obj) {
        this.c.deliverResult(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.c.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.c.forceLoad();
    }

    public Loader getModuleLoader() {
        return this.c;
    }

    public boolean isAbandoned() {
        return this.c.isAbandoned();
    }

    public boolean isStarted() {
        return this.c.isStarted();
    }

    public Object loadInBackground() {
        return this.c.loadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.c.onAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.c.onCancelLoad();
    }

    public void onCanceled(Object obj) {
        this.c.onCanceled(obj);
    }

    public void onContentChanged() {
        this.c.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.c.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return this.c.onLoadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.c.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.c.onStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.c.onStopLoading();
    }

    public void reset() {
        this.c.reset();
    }

    public void rollbackContentChanged() {
        this.c.rollbackContentChanged();
    }

    public void stopLoading() {
        this.c.stopLoading();
    }

    public void superAbandon() {
        super.abandon();
    }

    public boolean superCancelLoad() {
        return super.cancelLoad();
    }

    public void superCancelLoadInBackground() {
    }

    public void superCommitContentChanged() {
        super.commitContentChanged();
    }

    public String superDataToString(Object obj) {
        return super.dataToString(obj);
    }

    public void superDeliverCancellation() {
        super.deliverCancellation();
    }

    public void superDeliverResult(Object obj) {
        super.deliverResult(obj);
    }

    public void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void superForceLoad() {
        super.forceLoad();
    }

    public Context superGetContext() {
        return super.getContext();
    }

    public int superGetId() {
        return super.getId();
    }

    public boolean superIsAbandoned() {
        return super.isAbandoned();
    }

    public boolean superIsLoadInBackgroundCanceled() {
        return super.isLoadInBackgroundCanceled();
    }

    public boolean superIsReset() {
        return super.isReset();
    }

    public boolean superIsStarted() {
        return super.isStarted();
    }

    public void superOnAbandon() {
    }

    public boolean superOnCancelLoad() {
        return super.onCancelLoad();
    }

    public void superOnCanceled(Object obj) {
    }

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
        super.onForceLoad();
    }

    public Object superOnLoadInBackground() {
        return super.onLoadInBackground();
    }

    public void superOnReset() {
    }

    public void superOnStartLoading() {
    }

    public void superOnStopLoading() {
    }

    public void superRegisterListener(int i, kl klVar) {
        super.registerListener(i, klVar);
    }

    public void superRegisterOnLoadCanceledListener(kk kkVar) {
        super.registerOnLoadCanceledListener(kkVar);
    }

    public void superReset() {
        super.reset();
    }

    public void superRollbackContentChanged() {
        super.rollbackContentChanged();
    }

    public void superSetUpdateThrottle(long j) {
        super.setUpdateThrottle(j);
    }

    public void superStopLoading() {
        super.stopLoading();
    }

    public boolean superTakeContentChanged() {
        return super.takeContentChanged();
    }

    public String superToString() {
        return super.toString();
    }

    public void superUnregisterListener(kl klVar) {
        super.unregisterListener(klVar);
    }

    public void superUnregisterOnLoadCanceledListener(kk kkVar) {
        super.unregisterOnLoadCanceledListener(kkVar);
    }

    public String toString() {
        return this.c.toString();
    }
}
