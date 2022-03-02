package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: oge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oge extends UrlRequest.Callback {
    private final aosh a;
    private final ByteArrayOutputStream b;
    private final WritableByteChannel c;

    public oge(aosh aosh) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.b = byteArrayOutputStream;
        this.c = Channels.newChannel(byteArrayOutputStream);
        this.a = aosh;
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.a((Throwable) cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.c.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode == 401) {
            this.a.a((Throwable) new ogd());
        } else if (httpStatusCode == 429) {
            this.a.a((Throwable) new ogf());
        } else if (httpStatusCode >= 400 && httpStatusCode <= 499) {
            this.a.b((Object) new ogi(httpStatusCode, urlResponseInfo.getAllHeaders(), (byte[]) null));
        } else if (httpStatusCode >= 500 && httpStatusCode <= 599) {
            aosh aosh = this.a;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Received internal server error: ");
            sb.append(httpStatusCode);
            aosh.a((Throwable) new Exception(sb.toString()));
        } else {
            urlRequest.read(ByteBuffer.allocateDirect((int) axmx.a.a().d()));
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.b((Object) new ogi(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getAllHeaders(), this.b.toByteArray()));
    }
}
