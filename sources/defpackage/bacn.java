package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* renamed from: bacn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacn extends BidirectionalStream.Callback {
    final /* synthetic */ bacr a;
    private List b;

    public bacn(bacr bacr) {
        this.a = bacr;
    }

    private static final babj a(UrlResponseInfo urlResponseInfo) {
        return bagt.a(urlResponseInfo.getHttpStatusCode());
    }

    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        babj babj;
        bacr bacr = this.a;
        ByteBuffer byteBuffer = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            babj = this.a.o.e;
            if (babj == null) {
                if (urlResponseInfo == null) {
                    babj = babj.c.a("stream cancelled without reason");
                } else {
                    babj = a(urlResponseInfo);
                }
            }
        }
        this.a.a(babj);
    }

    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        bacr bacr = this.a;
        babj b2 = babj.o.b((Throwable) cronetException);
        ByteBuffer byteBuffer = bacr.a;
        bacr.a(b2);
    }

    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        bacr bacr = this.a;
        ByteBuffer byteBuffer2 = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            this.a.o.f = z;
            if (byteBuffer.remaining() != 0) {
                bacq.a(this.a.o, byteBuffer);
            }
        }
        if (z && (list = this.b) != null) {
            a(list, true);
        }
    }

    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(FragmentTransaction.TRANSIT_ENTER_MASK));
    }

    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.b = asList;
        bacr bacr = this.a;
        ByteBuffer byteBuffer = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            z = this.a.o.f;
        }
        if (z) {
            a(asList, true);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List, java.util.Collection] */
    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        bacr bacr = this.a;
        ByteBuffer byteBuffer = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            this.a.o.a();
            bacq bacq2 = this.a.o;
            bacq2.c = true;
            ? r1 = bacq2.b;
            int size = r1.size();
            for (int i2 = 0; i2 < size; i2++) {
                baco baco = (baco) r1.get(i2);
                bacq2.h.a(baco.a, baco.b, baco.c);
            }
            bacq2.b.clear();
        }
    }

    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        bacr bacr = this.a;
        ByteBuffer byteBuffer = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            z = false;
            if (this.b != null && this.a.o.f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.b;
            if (list != null) {
                a(list, true);
            } else if (urlResponseInfo != null) {
                a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        this.a.a(a(urlResponseInfo));
    }

    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        bacr bacr = this.a;
        ByteBuffer byteBuffer2 = bacr.a;
        bacq bacq = bacr.o;
        int i = bacq.i;
        synchronized (bacq.a) {
            bacr bacr2 = this.a;
            bacq bacq2 = bacr2.o;
            if (!bacq2.g) {
                bacq2.g = true;
                bacr2.f.a();
            }
            this.a.o.c(byteBuffer.position());
        }
    }

    private final void a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(Charset.forName("UTF-8"));
        }
        baaf a2 = azyz.a(balr.a(bArr));
        bacr bacr = this.a;
        ByteBuffer byteBuffer = bacr.a;
        bacq bacq = bacr.o;
        int i3 = bacq.i;
        synchronized (bacq.a) {
            bacq bacq2 = this.a.o;
            if (!z) {
                bacq2.a(a2);
            } else {
                bacq2.b(a2);
            }
        }
    }
}
