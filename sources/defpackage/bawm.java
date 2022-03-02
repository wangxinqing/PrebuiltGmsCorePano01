package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bawm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawm extends UrlRequest.Callback {
    private final UrlRequest.Callback a;

    public bawm(UrlRequest.Callback callback) {
        this.a = callback;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.onCanceled(urlRequest, urlResponseInfo);
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.onFailed(urlRequest, urlResponseInfo, cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.a.onRedirectReceived(urlRequest, urlResponseInfo, str);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.onResponseStarted(urlRequest, urlResponseInfo);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.onSucceeded(urlRequest, urlResponseInfo);
    }
}
