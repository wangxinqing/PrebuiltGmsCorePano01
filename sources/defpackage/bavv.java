package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bavv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavv implements bawd {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ bavz c;

    public bavv(bavz bavz, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.c = bavz;
        this.a = urlResponseInfo;
        this.b = byteBuffer;
    }

    public final void a() {
        if (this.c.d.g.compareAndSet(5, 4)) {
            bavz bavz = this.c;
            bavz.a.onReadCompleted(bavz.d, this.a, this.b);
        }
    }
}
