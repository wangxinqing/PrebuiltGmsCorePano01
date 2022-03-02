package defpackage;

import android.content.Context;

/* renamed from: hty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hty {
    private final ahfv a;

    public hty(Context context, ahei ahei) {
        iva.a((Object) context);
        iva.a((Object) ahei);
        ahee g = ahef.g();
        ahai a2 = ahaj.a();
        a2.a(context.getFilesDir());
        a2.a("clearcut");
        a2.a("GenericDimension.pb");
        g.a(a2.a());
        g.a((audx) avsl.b);
        this.a = ahei.a(g.a());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: avsn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r4) {
        /*
            r3 = this;
            ahfv r0 = r3.a     // Catch:{ ExecutionException -> 0x0035 }
            aorr r0 = r0.a()     // Catch:{ ExecutionException -> 0x0035 }
            java.lang.Object r0 = defpackage.aosr.a(r0)     // Catch:{ ExecutionException -> 0x0035 }
            avsl r0 = (defpackage.avsl) r0     // Catch:{ ExecutionException -> 0x0035 }
            avsn r1 = defpackage.avsn.b     // Catch:{ ExecutionException -> 0x0035 }
            r4.getClass()     // Catch:{ ExecutionException -> 0x0035 }
            audr r0 = r0.a     // Catch:{ ExecutionException -> 0x0035 }
            boolean r2 = r0.containsKey(r4)     // Catch:{ ExecutionException -> 0x0035 }
            if (r2 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r4)     // Catch:{ ExecutionException -> 0x0035 }
            r1 = r0
            avsn r1 = (defpackage.avsn) r1     // Catch:{ ExecutionException -> 0x0035 }
            goto L_0x0022
        L_0x0021:
        L_0x0022:
            aucs r0 = r1.a     // Catch:{ ExecutionException -> 0x0035 }
            ahfv r1 = r3.a     // Catch:{ ExecutionException -> 0x0035 }
            htx r2 = new htx     // Catch:{ ExecutionException -> 0x0035 }
            r2.<init>(r4)     // Catch:{ ExecutionException -> 0x0035 }
            aoqm r4 = defpackage.aoqm.a     // Catch:{ ExecutionException -> 0x0035 }
            aorr r4 = r1.a((defpackage.amqy) r2, (java.util.concurrent.Executor) r4)     // Catch:{ ExecutionException -> 0x0035 }
            defpackage.aosr.a(r4)     // Catch:{ ExecutionException -> 0x0035 }
            return r0
        L_0x0035:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hty.a(java.lang.String):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: avsn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int[] r7, java.lang.String r8, java.util.Collection r9) {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
        L_0x0009:
            boolean r1 = r9.hasNext()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            if (r1 != 0) goto L_0x0020
            ahfv r7 = r6.a     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            htw r8 = new htw     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r8.<init>(r0)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            aoqm r9 = defpackage.aoqm.a     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            aorr r7 = r7.a((defpackage.amqy) r8, (java.util.concurrent.Executor) r9)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r7.get()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            return
        L_0x0020:
            java.lang.Object r1 = r9.next()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            boolean r2 = r1.equals(r8)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            if (r2 != 0) goto L_0x0009
            avsn r2 = defpackage.avsn.b     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            aucd r2 = r2.o()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            avsm r2 = (defpackage.avsm) r2     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            ahfv r3 = r6.a     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            aorr r3 = r3.a()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            java.lang.Object r3 = r3.get()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            avsl r3 = (defpackage.avsl) r3     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            avsn r4 = defpackage.avsn.b     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r1.getClass()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            audr r3 = r3.a     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            boolean r5 = r3.containsKey(r1)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            if (r5 == 0) goto L_0x0055
            java.lang.Object r3 = r3.get(r1)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r4 = r3
            avsn r4 = (defpackage.avsn) r4     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            aucs r3 = r4.a     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r2.a(r3)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            java.util.List r3 = defpackage.aoog.b((int[]) r7)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r2.a(r3)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            aucj r2 = r2.i()     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            avsn r2 = (defpackage.avsn) r2     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            r0.put(r1, r2)     // Catch:{ InterruptedException -> 0x006e, ExecutionException -> 0x006c }
            goto L_0x0009
        L_0x006c:
            r7 = move-exception
            goto L_0x006f
        L_0x006e:
            r7 = move-exception
        L_0x006f:
            java.lang.String r8 = "DimensionStore"
            java.lang.String r9 = "Failed to accumulate dimensions to dimension storage."
            android.util.Log.e(r8, r9, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hty.a(int[], java.lang.String, java.util.Collection):void");
    }
}
