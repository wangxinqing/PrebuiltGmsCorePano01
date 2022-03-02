package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Collection;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: bacp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacp implements bacx {
    final /* synthetic */ bacr a;

    public bacp(bacr bacr) {
        this.a = bacr;
    }

    public final void a(int i) {
        bacq bacq = this.a.o;
        int i2 = bacq.i;
        synchronized (bacq.a) {
            this.a.o.b(i);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void a(baaf baaf) {
        this.a.j.run();
        bacr bacr = this.a;
        if (bacr.p != null) {
            bacn bacn = new bacn(bacr);
            bacr bacr2 = this.a;
            String str = bacr2.d;
            bacl bacl = (bacl) bacr2.p;
            ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) bacl.e).newBidirectionalStreamBuilder(str, bacn, bacr2.g);
            if (bacl.f) {
                int i = bacl.g;
                if (!bacl.a) {
                    synchronized (bacl.class) {
                        if (!bacl.a) {
                            try {
                                bacl.c = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsTag", new Class[]{Integer.TYPE});
                                bacl.a = true;
                            } catch (NoSuchMethodException e) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsTag", e);
                                    bacl.a = true;
                                } catch (Throwable th) {
                                    bacl.a = true;
                                    throw th;
                                }
                            }
                        }
                    }
                }
                if (bacl.c != null) {
                    try {
                        bacl.c.invoke(newBidirectionalStreamBuilder, new Object[]{Integer.valueOf(i)});
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause() != null ? e2.getCause() : e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Failed to set traffic stats tag: ");
                        sb.append(i);
                        Log.w("CronetChannelBuilder", sb.toString(), e3);
                    }
                }
            }
            if (bacl.h) {
                int i2 = bacl.i;
                if (!bacl.b) {
                    synchronized (bacl.class) {
                        if (!bacl.b) {
                            try {
                                bacl.d = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsUid", new Class[]{Integer.TYPE});
                                bacl.b = true;
                            } catch (NoSuchMethodException e4) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsUid", e4);
                                    bacl.b = true;
                                } catch (Throwable th2) {
                                    bacl.b = true;
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                if (bacl.d != null) {
                    try {
                        bacl.d.invoke(newBidirectionalStreamBuilder, new Object[]{Integer.valueOf(i2)});
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause() != null ? e5.getCause() : e5.getTargetException());
                    } catch (IllegalAccessException e6) {
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Failed to set traffic stats uid: ");
                        sb2.append(i2);
                        Log.w("CronetChannelBuilder", sb2.toString(), e6);
                    }
                }
            }
            if (this.a.l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            bacr bacr3 = this.a;
            Object obj = bacr3.m;
            if (!(obj == null && bacr3.n == null)) {
                if (obj != null) {
                    bacr.a(newBidirectionalStreamBuilder, obj);
                }
                Collection<Object> collection = this.a.n;
                if (collection != null) {
                    for (Object a2 : collection) {
                        bacr.a(newBidirectionalStreamBuilder, a2);
                    }
                }
            }
            bacr bacr4 = this.a;
            newBidirectionalStreamBuilder.addHeader(bagt.h.a, bacr4.e);
            newBidirectionalStreamBuilder.addHeader(bagt.f.a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            byte[][] a3 = balr.a(bacr4.h);
            for (int i3 = 0; i3 < a3.length; i3 += 2) {
                String str2 = new String(a3[i3], Charset.forName("UTF-8"));
                if (!bagt.f.a.equalsIgnoreCase(str2) && !bagt.h.a.equalsIgnoreCase(str2) && !bagt.g.a.equalsIgnoreCase(str2)) {
                    newBidirectionalStreamBuilder.addHeader(str2, new String(a3[i3 + 1], Charset.forName("UTF-8")));
                }
            }
            this.a.k = newBidirectionalStreamBuilder.build();
            this.a.k.start();
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.babj r7) {
        /*
            r6 = this;
            bacr r0 = r6.a
            bacq r0 = r0.o
            int r1 = defpackage.bacq.i
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            bacr r1 = r6.a     // Catch:{ all -> 0x0045 }
            bacq r1 = r1.o     // Catch:{ all -> 0x0045 }
            boolean r2 = r1.d     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0043
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x0045 }
            r1.e = r7     // Catch:{ all -> 0x0045 }
            java.util.Collection r2 = r1.b     // Catch:{ all -> 0x0045 }
            int r3 = r2.size()     // Catch:{ all -> 0x0045 }
            r4 = 0
        L_0x001d:
            if (r4 >= r3) goto L_0x002d
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x0045 }
            baco r5 = (defpackage.baco) r5     // Catch:{ all -> 0x0045 }
            java.nio.ByteBuffer r5 = r5.a     // Catch:{ all -> 0x0045 }
            r5.clear()     // Catch:{ all -> 0x0045 }
            int r4 = r4 + 1
            goto L_0x001d
        L_0x002d:
            java.util.Collection r1 = r1.b     // Catch:{ all -> 0x0045 }
            r1.clear()     // Catch:{ all -> 0x0045 }
            bacr r1 = r6.a     // Catch:{ all -> 0x0045 }
            org.chromium.net.BidirectionalStream r2 = r1.k     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x003e
            bacu r2 = r1.i     // Catch:{ all -> 0x0045 }
            r2.a(r1, r7)     // Catch:{ all -> 0x0045 }
            goto L_0x0041
        L_0x003e:
            r2.cancel()     // Catch:{ all -> 0x0045 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0048:
            throw r7
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacp.a(babj):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.balv r4, boolean r5, boolean r6, int r7) {
        /*
            r3 = this;
            bacr r7 = r3.a
            bacq r7 = r7.o
            int r0 = defpackage.bacq.i
            java.lang.Object r7 = r7.a
            monitor-enter(r7)
            bacr r0 = r3.a     // Catch:{ all -> 0x0040 }
            bacq r0 = r0.o     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.d     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r7)     // Catch:{ all -> 0x0040 }
            return
        L_0x0013:
            if (r4 != 0) goto L_0x0018
            java.nio.ByteBuffer r4 = defpackage.bacr.a     // Catch:{ all -> 0x0040 }
            goto L_0x001f
        L_0x0018:
            bacv r4 = (defpackage.bacv) r4     // Catch:{ all -> 0x0040 }
            java.nio.ByteBuffer r4 = r4.a     // Catch:{ all -> 0x0040 }
            r4.flip()     // Catch:{ all -> 0x0040 }
        L_0x001f:
            bacr r0 = r3.a     // Catch:{ all -> 0x0040 }
            int r1 = r4.remaining()     // Catch:{ all -> 0x0040 }
            r0.d(r1)     // Catch:{ all -> 0x0040 }
            bacr r0 = r3.a     // Catch:{ all -> 0x0040 }
            bacq r1 = r0.o     // Catch:{ all -> 0x0040 }
            boolean r2 = r1.c     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x003b
            baco r0 = new baco     // Catch:{ all -> 0x0040 }
            r0.<init>(r4, r5, r6)     // Catch:{ all -> 0x0040 }
            java.util.Collection r4 = r1.b     // Catch:{ all -> 0x0040 }
            r4.add(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x003b:
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r7)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bacp.a(balv, boolean, boolean, int):void");
    }
}
