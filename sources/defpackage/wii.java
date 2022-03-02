package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: wii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wii extends UrlRequest.Callback {
    private final File a;
    private final CountDownLatch b;

    public wii(File file, CountDownLatch countDownLatch) {
        this.a = file;
        this.b = countDownLatch;
    }

    private final void a() {
        if (this.a.exists()) {
            this.a.delete();
        }
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        a();
        this.b.countDown();
        ((anih) ((anih) vvj.a.c()).a("wii", "onFailed", 415, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to download %s", (Object) this.a);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        FileChannel channel;
        if (byteBuffer.position() == 0) {
            a();
            jjg jjg = vvj.a;
            return;
        }
        try {
            channel = new FileOutputStream(this.a, true).getChannel();
            byteBuffer.flip();
            channel.write(byteBuffer);
            byteBuffer.clear();
            if (!urlRequest.isDone()) {
                urlRequest.read(byteBuffer);
            }
            ((anih) ((anih) vvj.a.d()).a("wii", "onReadCompleted", 399, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Saved file to %s", (Object) this.a.getAbsoluteFile());
            if (channel != null) {
                channel.close();
                return;
            }
            return;
        } catch (IOException e) {
            a();
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("wii", "onReadCompleted", 402, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to write to %s", (Object) this.a);
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo.getHttpStatusCode() != 200) {
            a();
            jjg jjg = vvj.a;
            urlResponseInfo.getHttpStatusCode();
            this.b.countDown();
            return;
        }
        urlRequest.read(ByteBuffer.allocateDirect(FragmentTransaction.TRANSIT_EXIT_MASK));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.b.countDown();
    }
}
