package defpackage;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import java.lang.reflect.Constructor;

/* renamed from: bmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bmi {
    public final String a;
    public final Class b;
    public final Object c = new Object();
    public IntentOperation d = null;
    public int e = 0;
    final /* synthetic */ bml f;
    private final Context g;
    private Constructor h;

    public bmi(bml bml, Context context, String str, String str2) {
        this.f = bml;
        this.g = context;
        this.a = str;
        this.b = context.getClassLoader().loadClass(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r0 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r9.h != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r9.h = r9.b.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r4 = r9.f.l.a(r9.h, r9.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5 = r9.b.getName();
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 78);
        r7.append("Chimera module-intent-operation ");
        r7.append(r5);
        r7.append(" is not an IntentOperation, dropping operation");
        android.util.Log.e("IntentOperationExec", r7.toString());
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r6 = r9.b.getName();
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r6).length() + 65);
        r8.append("Failed to instantiate Chimera operation impl ");
        r8.append(r6);
        r8.append(", dropping operation");
        android.util.Log.e("IntentOperationExec", r8.toString(), r4);
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.chimera.IntentOperation a() {
        /*
            r9 = this;
            bml r0 = r9.f
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            boolean r0 = r0.isHeldByCurrentThread()
            r1 = 1
            r0 = r0 ^ r1
            defpackage.amtf.a((boolean) r0)
            monitor-enter(r9)
            com.google.android.chimera.IntentOperation r0 = r9.d     // Catch:{ all -> 0x00d7 }
            r2 = 0
            if (r0 == 0) goto L_0x0026
            int r0 = r9.e     // Catch:{ all -> 0x00d7 }
            if (r0 <= 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            defpackage.amtf.a((boolean) r2)     // Catch:{ all -> 0x00d7 }
            int r0 = r9.e     // Catch:{ all -> 0x00d7 }
            int r0 = r0 + r1
            r9.e = r0     // Catch:{ all -> 0x00d7 }
            com.google.android.chimera.IntentOperation r0 = r9.d     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            return r0
        L_0x0026:
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = r9.c
            monitor-enter(r0)
            r3 = 0
            java.lang.reflect.Constructor r4 = r9.h     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            if (r4 != 0) goto L_0x0039
            java.lang.Class r4 = r9.b     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            java.lang.reflect.Constructor r4 = r4.getConstructor(r5)     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            r9.h = r4     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
        L_0x0039:
            bml r4 = r9.f     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            bmg r4 = r4.l     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            java.lang.reflect.Constructor r5 = r9.h     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            android.content.Context r6 = r9.g     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            com.google.android.chimera.IntentOperation r4 = r4.a((java.lang.reflect.Constructor) r5, (android.content.Context) r6)     // Catch:{ NoSuchMethodException -> 0x007f, InstantiationException -> 0x007d, IllegalAccessException -> 0x007b, IllegalArgumentException -> 0x0079, InvocationTargetException -> 0x0077, ClassCastException -> 0x0049 }
            goto L_0x00ac
        L_0x0046:
            r1 = move-exception
            goto L_0x00d5
        L_0x0049:
            r4 = move-exception
            java.lang.String r4 = "IntentOperationExec"
            java.lang.Class r5 = r9.b     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0046 }
            int r6 = r6.length()     // Catch:{ all -> 0x0046 }
            int r6 = r6 + 78
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r7.<init>(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = "Chimera module-intent-operation "
            r7.append(r6)     // Catch:{ all -> 0x0046 }
            r7.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = " is not an IntentOperation, dropping operation"
            r7.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0046 }
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x0046 }
            r4 = r3
            goto L_0x00ac
        L_0x0077:
            r4 = move-exception
            goto L_0x0080
        L_0x0079:
            r4 = move-exception
            goto L_0x0080
        L_0x007b:
            r4 = move-exception
            goto L_0x0080
        L_0x007d:
            r4 = move-exception
            goto L_0x0080
        L_0x007f:
            r4 = move-exception
        L_0x0080:
            java.lang.String r5 = "IntentOperationExec"
            java.lang.Class r6 = r9.b     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0046 }
            int r7 = r7.length()     // Catch:{ all -> 0x0046 }
            int r7 = r7 + 65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r8.<init>(r7)     // Catch:{ all -> 0x0046 }
            java.lang.String r7 = "Failed to instantiate Chimera operation impl "
            r8.append(r7)     // Catch:{ all -> 0x0046 }
            r8.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = ", dropping operation"
            r8.append(r6)     // Catch:{ all -> 0x0046 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0046 }
            android.util.Log.e(r5, r6, r4)     // Catch:{ all -> 0x0046 }
            r4 = r3
        L_0x00ac:
            if (r4 == 0) goto L_0x00d3
            monitor-enter(r9)     // Catch:{ all -> 0x0046 }
            com.google.android.chimera.IntentOperation r3 = r9.d     // Catch:{ all -> 0x00d0 }
            if (r3 != 0) goto L_0x00b9
            int r3 = r9.e     // Catch:{ all -> 0x00d0 }
            if (r3 != 0) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            defpackage.amtf.a((boolean) r2)     // Catch:{ all -> 0x00d0 }
            r9.d = r4     // Catch:{ all -> 0x00d0 }
            int r2 = r9.e     // Catch:{ all -> 0x00d0 }
            int r2 = r2 + r1
            r9.e = r2     // Catch:{ all -> 0x00d0 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d0 }
            bml r1 = r9.f     // Catch:{ all -> 0x0046 }
            bmg r1 = r1.l     // Catch:{ all -> 0x0046 }
            android.content.Context r2 = r9.g     // Catch:{ all -> 0x0046 }
            r1.a((com.google.android.chimera.IntentOperation) r4, (android.content.Context) r2)     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return r4
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d0 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x00d3:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return r3
        L_0x00d5:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmi.a():com.google.android.chimera.IntentOperation");
    }
}
