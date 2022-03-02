package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.threads.TraceWrappingParcelable;

/* renamed from: qvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class qvr extends Handler {
    public static qvq e = null;

    public qvr() {
    }

    public static final void a(Message message, long j) {
        TraceWrappingParcelable traceWrappingParcelable;
        qvq qvq = e;
        if (qvq != null) {
            amlv.b("TracingHandlerProp");
            Object a = jge.a(j);
            if (message.obj != null) {
                amri amri = ((jge) qvq).b;
                Bundle peekData = message.peekData();
                if (amri.a()) {
                    jgc jgc = (jgc) amri.b();
                    if (jgc.c > 0 && jgc.a.compareAndSet(false, true)) {
                        try {
                            int i = jgc.c;
                            if (i > 0) {
                                TraceWrappingParcelable[] traceWrappingParcelableArr = jgc.b;
                                int i2 = i - 1;
                                jgc.c = i2;
                                traceWrappingParcelable = traceWrappingParcelableArr[i2];
                                traceWrappingParcelableArr[i2] = null;
                            } else {
                                jgc.a.lazySet(false);
                            }
                        } finally {
                            jgc.a.lazySet(false);
                        }
                    }
                    traceWrappingParcelable = new TraceWrappingParcelable();
                } else {
                    traceWrappingParcelable = new TraceWrappingParcelable();
                }
                traceWrappingParcelable.b = a;
                traceWrappingParcelable.c = peekData;
                message.setData(traceWrappingParcelable.a);
                return;
            }
            message.obj = a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchMessage(android.os.Message r11) {
        /*
            r10 = this;
            qvq r0 = e
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r11.obj
            boolean r2 = r1 instanceof defpackage.amko
            r3 = 0
            if (r2 == 0) goto L_0x000d
        L_0x000b:
            goto L_0x0076
        L_0x000d:
            boolean r2 = r1 instanceof defpackage.jex
            if (r2 != 0) goto L_0x000b
            if (r1 == 0) goto L_0x0074
            android.os.Bundle r1 = r11.peekData()
            if (r1 == 0) goto L_0x0026
            java.lang.String r2 = "gctthpwp"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            boolean r2 = r1 instanceof com.google.android.gms.common.threads.TraceWrappingParcelable
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.common.threads.TraceWrappingParcelable r1 = (com.google.android.gms.common.threads.TraceWrappingParcelable) r1
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            if (r1 == 0) goto L_0x0074
            android.os.Bundle r2 = r1.c
            r11.setData(r2)
            java.lang.Object r2 = r1.b
            r4 = r0
            jge r4 = (defpackage.jge) r4
            amri r5 = r4.b
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x0071
            amri r4 = r4.b
            java.lang.Object r4 = r4.b()
            jgc r4 = (defpackage.jgc) r4
            int r5 = r4.c
            com.google.android.gms.common.threads.TraceWrappingParcelable[] r6 = r4.b
            int r6 = r6.length
            if (r5 >= r6) goto L_0x0071
            r1.b = r3
            r1.c = r3
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.a
            r6 = 0
            r7 = 1
            boolean r5 = r5.compareAndSet(r6, r7)
            if (r5 == 0) goto L_0x0071
            int r5 = r4.c     // Catch:{ all -> 0x006a }
            com.google.android.gms.common.threads.TraceWrappingParcelable[] r8 = r4.b     // Catch:{ all -> 0x006a }
            int r9 = r8.length     // Catch:{ all -> 0x006a }
            if (r5 >= r9) goto L_0x0064
            r8[r5] = r1     // Catch:{ all -> 0x006a }
            int r5 = r5 + r7
            r4.c = r5     // Catch:{ all -> 0x006a }
        L_0x0064:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.a
            r1.lazySet(r6)
            goto L_0x0072
        L_0x006a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.a
            r0.lazySet(r6)
            throw r11
        L_0x0071:
        L_0x0072:
            r1 = r2
            goto L_0x0078
        L_0x0074:
            r1 = r3
            goto L_0x0078
        L_0x0076:
            r11.obj = r3
        L_0x0078:
            if (r1 == 0) goto L_0x0080
            defpackage.jez.a(r1, r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x0082
        L_0x0080:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0082:
            r10.a(r11)     // Catch:{ all -> 0x0089 }
            r0.a(r1)
            return
        L_0x0089:
            r11 = move-exception
            defpackage.jez.a((java.lang.Throwable) r11)     // Catch:{ all -> 0x008e }
            throw r11     // Catch:{ all -> 0x008e }
        L_0x008e:
            r11 = move-exception
            r0.a(r1)
            throw r11
        L_0x0093:
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvr.dispatchMessage(android.os.Message):void");
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        a(message, j);
        return super.sendMessageAtTime(message, j);
    }

    public qvr(Handler.Callback callback) {
        super(callback);
    }

    public qvr(Looper looper) {
        super(looper);
    }

    public qvr(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        super.dispatchMessage(message);
    }
}
