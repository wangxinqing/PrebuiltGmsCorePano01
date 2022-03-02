package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: aooz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aooz extends aoqv implements Runnable {
    aorr a;
    Class b;
    Object c;

    public aooz(aorr aorr, Class cls, Object obj) {
        amrl.a((Object) aorr);
        this.a = aorr;
        amrl.a((Object) cls);
        this.b = cls;
        amrl.a(obj);
        this.c = obj;
    }

    public static aorr a(aorr aorr, Class cls, amqy amqy, Executor executor) {
        aooy aooy = new aooy(aorr, cls, amqy);
        aorr.a(aooy, aosd.a(executor, aooy));
        return aooy;
    }

    public abstract Object a(Object obj, Throwable th);

    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public final String aK() {
        String str;
        aorr aorr = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String aK = super.aK();
        if (aorr != null) {
            String valueOf = String.valueOf(aorr);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (aK == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            return aK.length() == 0 ? new String(valueOf4) : valueOf4.concat(aK);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a((Future) this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            aorr r0 = r10.a
            java.lang.Class r1 = r10.b
            java.lang.Object r2 = r10.c
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r10.isCancelled()
            if (r3 != 0) goto L_0x00b7
            r3 = 0
            r10.a = r3
            boolean r4 = r0 instanceof defpackage.aoss     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            if (r4 == 0) goto L_0x002f
            r4 = r0
            aoss r4 = (defpackage.aoss) r4     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            java.lang.Throwable r4 = r4.e()     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            if (r4 != 0) goto L_0x0037
            java.lang.Object r5 = defpackage.aorl.a((java.util.concurrent.Future) r0)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            goto L_0x008d
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x008d
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x008b
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
            r4 = r5
            goto L_0x003a
        L_0x008b:
            r4 = r5
            goto L_0x003a
        L_0x008d:
            if (r4 == 0) goto L_0x00b4
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r0 = r10.a(r2, r4)     // Catch:{ all -> 0x00a1 }
            r10.b = r3
            r10.c = r3
            r10.a(r0)
            return
        L_0x00a1:
            r0 = move-exception
            r10.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00aa }
            r10.b = r3
            r10.c = r3
            return
        L_0x00aa:
            r0 = move-exception
            r10.b = r3
            r10.c = r3
            throw r0
        L_0x00b0:
            r10.b((defpackage.aorr) r0)
            return
        L_0x00b4:
            r10.b((java.lang.Object) r5)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aooz.run():void");
    }

    public static aorr a(aorr aorr, Class cls, aoqb aoqb, Executor executor) {
        aoox aoox = new aoox(aorr, cls, aoqb);
        aorr.a(aoox, aosd.a(executor, aoox));
        return aoox;
    }
}
