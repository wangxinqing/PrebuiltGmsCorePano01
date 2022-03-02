package defpackage;

import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* renamed from: hvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hvz implements HttpEntity {
    public long a = -1;
    private final hwc b;

    public hvz(hwc hwc) {
        this.b = hwc;
    }

    public final void consumeContent() {
    }

    public final InputStream getContent() {
        return null;
    }

    public final Header getContentEncoding() {
        return new BasicHeader("Content-Encoding", "gzip");
    }

    public final long getContentLength() {
        return -1;
    }

    public final Header getContentType() {
        return new BasicHeader("Content-Type", "application/x-gzip");
    }

    public final boolean isChunked() {
        return true;
    }

    public final boolean isRepeatable() {
        return true;
    }

    public final boolean isStreaming() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeTo(java.io.OutputStream r6) {
        /*
            r5 = this;
            hwc r0 = r5.b
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = java.lang.System.currentTimeMillis()
            r0.a(r1, r3)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0035 }
            r1 = 100
            r0.<init>(r1)     // Catch:{ all -> 0x0035 }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0035 }
            r1.<init>(r0)     // Catch:{ all -> 0x0035 }
            hwc r2 = r5.b     // Catch:{ all -> 0x0033 }
            byte[] r2 = r2.d()     // Catch:{ all -> 0x0033 }
            r1.write(r2)     // Catch:{ all -> 0x0033 }
            r1.finish()     // Catch:{ all -> 0x0033 }
            int r2 = r0.size()     // Catch:{ all -> 0x0033 }
            long r2 = (long) r2     // Catch:{ all -> 0x0033 }
            r5.a = r2     // Catch:{ all -> 0x0033 }
            r0.writeTo(r6)     // Catch:{ all -> 0x0033 }
            r1.close()
            return
        L_0x0033:
            r6 = move-exception
            goto L_0x0037
        L_0x0035:
            r6 = move-exception
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvz.writeTo(java.io.OutputStream):void");
    }
}
