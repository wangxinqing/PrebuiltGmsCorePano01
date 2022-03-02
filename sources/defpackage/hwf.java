package defpackage;

import android.os.ConditionVariable;
import com.google.android.chimera.FragmentTransaction;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: hwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwf extends UrlRequest.Callback {
    final WritableByteChannel a = Channels.newChannel(this.b);
    final /* synthetic */ auaw b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ ConditionVariable d;

    public hwf(auaw auaw, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.b = auaw;
        this.c = atomicReference;
        this.d = conditionVariable;
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.set(new CancellationException());
        this.d.open();
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c.set(cronetException);
        this.d.open();
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.a.write(byteBuffer);
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        String valueOf = String.valueOf(str);
        throw new IOException(valueOf.length() == 0 ? new String("Did not expect a redirect to: ") : "Did not expect a redirect to: ".concat(valueOf));
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        urlRequest.read(ByteBuffer.allocateDirect(FragmentTransaction.TRANSIT_ENTER_MASK));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.set(urlResponseInfo);
        this.d.open();
    }
}
