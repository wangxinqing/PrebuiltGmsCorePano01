package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: bakq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bakq implements baie {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(bakq.class.getName());
    private static final Constructor c;
    private static final Method d;
    private final Object e;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<bakq> r0 = defpackage.bakq.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0041 }
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ all -> 0x0041 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0041 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "add"
            java.lang.reflect.Method r2 = r1.getMethod(r3, r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "sum"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x003e }
            r1.getMethod(r3, r5)     // Catch:{ all -> 0x003e }
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()     // Catch:{ all -> 0x003e }
            int r3 = r1.length     // Catch:{ all -> 0x003e }
        L_0x002d:
            if (r4 >= r3) goto L_0x003b
            r5 = r1[r4]     // Catch:{ all -> 0x003e }
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch:{ all -> 0x003e }
            int r6 = r6.length     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x003c
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003b:
            r5 = r0
        L_0x003c:
            r1 = r0
            goto L_0x0053
        L_0x003e:
            r1 = move-exception
            r8 = r2
            goto L_0x0043
        L_0x0041:
            r1 = move-exception
            r8 = r0
        L_0x0043:
            java.util.logging.Logger r2 = b
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "io.grpc.internal.ReflectionLongAdderCounter"
            java.lang.String r5 = "<clinit>"
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r7 = r1
            r2.logp(r3, r4, r5, r6, r7)
            r5 = r0
            r2 = r8
        L_0x0053:
            if (r1 == 0) goto L_0x0056
            goto L_0x005f
        L_0x0056:
            if (r5 == 0) goto L_0x005f
            c = r5
            d = r2
        L_0x005c:
            a = r0
            return
        L_0x005f:
            c = r0
            d = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bakq.<clinit>():void");
    }

    public bakq() {
        RuntimeException runtimeException = a;
        if (runtimeException == null) {
            try {
                this.e = c.newInstance(new Object[0]);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } else {
            throw runtimeException;
        }
    }

    public final void a() {
        try {
            d.invoke(this.e, new Object[]{1L});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
