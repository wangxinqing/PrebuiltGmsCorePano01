package com.google.android.chimera;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CursorLoaderProxy extends kg implements biz {
    private final CursorLoader c;

    public CursorLoaderProxy(CursorLoader cursorLoader, Context context) {
        super(context);
        this.c = cursorLoader;
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

    public String dataToString(Cursor cursor) {
        return this.c.dataToString(cursor);
    }

    public void deliverCancellation() {
        this.c.deliverCancellation();
    }

    public void deliverResult(Cursor cursor) {
        this.c.deliverResult(cursor);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.c.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.c.forceLoad();
    }

    public Context getContext() {
        return this.c.getContext();
    }

    public Loader getModuleLoader() {
        return this.c;
    }

    public boolean isAbandoned() {
        return this.c.isAbandoned();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.c.isLoadInBackgroundCanceled();
    }

    public boolean isReset() {
        return this.c.isReset();
    }

    public boolean isStarted() {
        return this.c.isStarted();
    }

    public Cursor loadInBackground() {
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

    public void onCanceled(Cursor cursor) {
        this.c.onCanceled(cursor);
    }

    public void onContentChanged() {
        this.c.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.c.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public Cursor onLoadInBackground() {
        return (Cursor) this.c.onLoadInBackground();
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
        super.cancelLoadInBackground();
    }

    public void superCommitContentChanged() {
        super.commitContentChanged();
    }

    public String superDataToString(Cursor cursor) {
        return super.dataToString(cursor);
    }

    public void superDeliverCancellation() {
        super.deliverCancellation();
    }

    public void superDeliverResult(Cursor cursor) {
        super.deliverResult(cursor);
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

    public String[] superGetProjection() {
        return super.getProjection();
    }

    public String superGetSelection() {
        return super.getSelection();
    }

    public String[] superGetSelectionArgs() {
        return super.getSelectionArgs();
    }

    public String superGetSortOrder() {
        return super.getSortOrder();
    }

    public Uri superGetUri() {
        return super.getUri();
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

    public Cursor superLoadInBackground() {
        return super.loadInBackground();
    }

    public void superOnAbandon() {
    }

    public boolean superOnCancelLoad() {
        return super.onCancelLoad();
    }

    public void superOnCanceled(Cursor cursor) {
        super.onCanceled(cursor);
    }

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
        super.onForceLoad();
    }

    public Cursor superOnLoadInBackground() {
        return (Cursor) super.onLoadInBackground();
    }

    public void superOnReset() {
        super.onReset();
    }

    public void superOnStartLoading() {
        super.onStartLoading();
    }

    public void superOnStopLoading() {
        super.onStopLoading();
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

    public void superSetProjection(String[] strArr) {
        super.setProjection(strArr);
    }

    public void superSetSelection(String str) {
        super.setSelection(str);
    }

    public void superSetSelectionArgs(String[] strArr) {
        super.setSelectionArgs(strArr);
    }

    public void superSetSortOrder(String str) {
        super.setSortOrder(str);
    }

    public void superSetUpdateThrottle(long j) {
        super.setUpdateThrottle(j);
    }

    public void superSetUri(Uri uri) {
        super.setUri(uri);
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

    public boolean takeContentChanged() {
        return this.c.takeContentChanged();
    }

    public String toString() {
        return this.c.toString();
    }

    public CursorLoaderProxy(CursorLoader cursorLoader, Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, uri, strArr, str, strArr2, str2);
        this.c = cursorLoader;
    }

    public /* bridge */ /* synthetic */ void deliverResult(Object obj) {
        deliverResult((Cursor) obj);
    }

    public /* bridge */ /* synthetic */ void onCanceled(Object obj) {
        onCanceled((Cursor) obj);
    }
}
