package org.chromium.net;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
