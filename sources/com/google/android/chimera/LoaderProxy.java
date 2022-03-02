package com.google.android.chimera;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoaderProxy extends km implements bjm {
    private final Loader a;

    public LoaderProxy(Loader loader, Context context) {
        super(context);
        this.a = loader;
    }

    public void abandon() {
        this.a.abandon();
    }

    public boolean cancelLoad() {
        return this.a.cancelLoad();
    }

    public String dataToString(Object obj) {
        return this.a.dataToString(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.a.forceLoad();
    }

    public Loader getModuleLoader() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.a.onAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.a.onCancelLoad();
    }

    public void onContentChanged() {
        this.a.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.a.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.a.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.a.onStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.a.onStopLoading();
    }

    public void reset() {
        this.a.reset();
    }

    public void stopLoading() {
        this.a.stopLoading();
    }

    public void superAbandon() {
        super.abandon();
    }

    public boolean superCancelLoad() {
        return super.cancelLoad();
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

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
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
        return this.a.toString();
    }
}
