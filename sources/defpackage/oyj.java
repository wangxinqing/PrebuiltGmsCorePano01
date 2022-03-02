package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.slice.Slice;
import androidx.slice.SliceItemHolder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;

/* renamed from: oyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyj extends ppr {
    public int a = 0;
    private final Context b;
    private final Uri c;
    private final CountDownLatch d = new CountDownLatch(1);
    private final oyi e = new oyi();
    private final oyh f;
    private final aoe n;
    private final oyp o;
    private long p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oyj(aonk aonk, String str, Context context, Uri uri, oyp oyp) {
        super(aonk, 1, str);
        aoe a2 = aoe.a(context);
        this.b = context;
        this.c = uri;
        this.f = new oyh(this);
        this.n = a2;
        this.o = oyp;
        aucd o2 = aojf.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojf aojf = (aojf) o2.b;
        str.getClass();
        aojf.a |= 1;
        aojf.b = str;
        this.o.a(((aojf) o2.i()).k());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            this.n.a(this.c, this.f);
            this.p = SystemClock.elapsedRealtime();
            a(this.n.c(this.c));
        } catch (Exception e2) {
            this.e.a(new oyf("Slice error. Internal error while trying to retrieve the Slice.", this.c, aolx.INTERNAL_ERROR));
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r4.d.await(((java.lang.Long) defpackage.ozx.cl.c()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r5) {
        /*
            r4 = this;
            oyi r5 = (defpackage.oyi) r5
            boolean r0 = r5.c
            if (r0 == 0) goto L_0x0007
            goto L_0x0038
        L_0x0007:
            java.util.concurrent.CountDownLatch r0 = r4.d     // Catch:{ InterruptedException -> 0x001e }
            agvx r1 = defpackage.ozx.cl     // Catch:{ InterruptedException -> 0x001e }
            java.lang.Object r1 = r1.c()     // Catch:{ InterruptedException -> 0x001e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ InterruptedException -> 0x001e }
            long r1 = r1.longValue()     // Catch:{ InterruptedException -> 0x001e }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x001e }
            boolean r0 = r0.await(r1, r3)     // Catch:{ InterruptedException -> 0x001e }
            if (r0 != 0) goto L_0x0038
            goto L_0x001f
        L_0x001e:
            r0 = move-exception
        L_0x001f:
            oyp r0 = r4.o
            java.lang.String r1 = "SliceRetrievalTimeouts"
            hox r0 = r0.c(r1)
            r0.a()
            oyf r0 = new oyf
            android.net.Uri r1 = r4.c
            aolx r2 = defpackage.aolx.SLICE_TIMED_OUT
            java.lang.String r3 = "Slice error. Timed out waiting for Slice."
            r0.<init>(r3, r1, r2)
            r5.a(r0)
        L_0x0038:
            oyp r0 = r4.o
            java.lang.String r1 = "SliceRetrievalCallbacks"
            hpb r0 = r0.d(r1)
            int r1 = r4.a
            r0.a(r1)
            int r0 = r4.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.net.Uri r1 = r4.c
            java.lang.String r2 = "Took %d callbacks to retrieve Slice uri %s"
            defpackage.oso.d(r2, r0, r1)
            aoe r0 = r4.n     // Catch:{ Exception -> 0x005c }
            android.net.Uri r1 = r4.c     // Catch:{ Exception -> 0x005c }
            oyh r2 = r4.f     // Catch:{ Exception -> 0x005c }
            r0.b(r1, r2)     // Catch:{ Exception -> 0x005c }
            return
        L_0x005c:
            r0 = move-exception
            oyf r0 = new oyf
            android.net.Uri r1 = r4.c
            aolx r2 = defpackage.aolx.INTERNAL_ERROR
            java.lang.String r3 = "Slice error. Internal error while trying to retrieve the Slice."
            r0.<init>(r3, r1, r2)
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyj.b(java.lang.Object):void");
    }

    public final void a(Slice slice) {
        if (slice != null) {
            try {
                if (anz.a(slice).a() != 2) {
                    oso.a("Slice retrieval incomplete. Uri %s, loadingState %d", (Object) this.c, (Object) Integer.valueOf(anz.a(slice).a()));
                    return;
                }
            } catch (Exception e2) {
                this.e.a(new oyf("Slice error. Internal error while trying to retrieve the Slice.", this.c, aolx.INTERNAL_ERROR));
                return;
            }
        }
        if (slice != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Context context = this.b;
                aoc aoc = new aoc();
                aoc.a = 2;
                aoc.b = 2;
                synchronized (SliceItemHolder.a) {
                    SliceItemHolder.b = new aob(context, aoc);
                    atp atp = new atp((InputStream) null, byteArrayOutputStream, new ou(), new ou(), new ou());
                    atp.a((atq) slice);
                    atp.b();
                    SliceItemHolder.b = null;
                }
                oyi oyi = this.e;
                oyi.a = byteArrayOutputStream;
                oyi.c = true;
                oyp oyp = this.o;
                oyp.b("SerializedSliceBytes", oyp.q).a((long) byteArrayOutputStream.size());
            } catch (Exception e3) {
                oso.a("IOException while serializing Slice");
                this.e.a(new oyf("Slice error. Slice is not serializable.", this.c, aolx.INVALID_SLICE_ARGUMENT));
            }
        } else {
            this.e.a(new oyf("Slice error. Received null Slice.", this.c, aolx.NULL_SLICE));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.p;
        oyp oyp2 = this.o;
        oyp2.b("SliceRetrievalLatencyMs", oyp2.r).a(elapsedRealtime);
        oso.d("Retrieved Slice uri %s in %d ms", this.c, Long.valueOf(elapsedRealtime));
        this.d.countDown();
    }
}
