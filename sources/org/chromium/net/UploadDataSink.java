package org.chromium.net;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
