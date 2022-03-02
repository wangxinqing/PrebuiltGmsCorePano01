package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bawu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawu extends UrlRequest.Callback {
    final /* synthetic */ bawv a;

    public bawu(bawv bawv) {
        this.a = bawv;
    }

    private final void a(IOException iOException) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.f = iOException;
        baww baww = bawv.c;
        if (baww != null) {
            baww.c = iOException;
            baww.a = true;
            baww.b = null;
        }
        bawx bawx = bawv.d;
        if (bawx != null) {
            bawx.d = iOException;
            bawx.e = true;
        }
        bawv.o = true;
        this.a.a.b();
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.e = urlResponseInfo;
        a(new IOException("disconnect() called"));
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException != null) {
            bawv bawv = this.a;
            int i = bawv.h;
            bawv.e = urlResponseInfo;
            a(cronetException);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.e = urlResponseInfo;
        bawv.a.b();
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.g = true;
        try {
            URL url = new URL(str);
            boolean equals = url.getProtocol().equals(this.a.url.getProtocol());
            if (this.a.instanceFollowRedirects) {
                this.a.url = url;
            }
            if (this.a.instanceFollowRedirects) {
                if (equals) {
                    this.a.b.followRedirect();
                    return;
                }
            }
        } catch (MalformedURLException e) {
        }
        bawv bawv2 = this.a;
        bawv2.e = urlResponseInfo;
        bawv2.b.cancel();
        a((IOException) null);
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.e = urlResponseInfo;
        bawv.o = true;
        this.a.a.b();
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        bawv bawv = this.a;
        int i = bawv.h;
        bawv.e = urlResponseInfo;
        a((IOException) null);
    }
}
