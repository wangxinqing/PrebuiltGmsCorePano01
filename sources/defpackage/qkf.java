package defpackage;

import android.app.InstantAppResolverService;

/* renamed from: qkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qkf implements Runnable {
    final /* synthetic */ int[] a;
    final /* synthetic */ qev b;
    final /* synthetic */ InstantAppResolverService.InstantAppResolutionCallback c;
    final /* synthetic */ qkg d;

    public qkf(qkg qkg, int[] iArr, qev qev, InstantAppResolverService.InstantAppResolutionCallback instantAppResolutionCallback) {
        this.d = qkg;
        this.a = iArr;
        this.b = qev;
        this.c = instantAppResolutionCallback;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0352, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x034e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "failed to deserialize bytes"
            qkg r0 = r1.d
            qkc r0 = r0.a
            int[] r3 = r1.a
            qjp r0 = (defpackage.qjp) r0
            qeg r4 = r0.a
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x001c
            qkc r0 = r0.b
            java.util.List r0 = r0.a(r3)
            goto L_0x03d0
        L_0x001c:
            qkc r4 = r0.c
            axve r0 = defpackage.axve.a
            axvf r0 = r0.a()
            boolean r0 = r0.a()
            r5 = 0
            if (r0 != 0) goto L_0x0032
            amzy r0 = defpackage.amzy.h()
            r11 = 0
            goto L_0x0384
        L_0x0032:
            r0 = r4
            qjs r0 = (defpackage.qjs) r0
            android.content.ContentProviderClient r6 = r0.a()
            if (r6 == 0) goto L_0x0376
            r0 = 3
            java.lang.String[] r8 = new java.lang.String[r0]
            java.lang.String r7 = "splitId"
            r8[r5] = r7
            java.lang.String r7 = "domain"
            r12 = 1
            r8[r12] = r7
            java.lang.String r7 = "routes"
            r13 = 2
            r8[r13] = r7
            android.net.Uri r7 = defpackage.qln.a(r3)     // Catch:{ RemoteException -> 0x0359, all -> 0x0356 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x0359, all -> 0x0356 }
            if (r6 != 0) goto L_0x005b
            goto L_0x0339
        L_0x005b:
            boolean r7 = r6.moveToFirst()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r7 == 0) goto L_0x0339
            r7 = r4
            qjs r7 = (defpackage.qjs) r7     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qfn r7 = r7.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r8 = "DevMan response some results"
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r7.a(r8, r9)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r7.<init>()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0072:
            int r8 = r6.getColumnCount()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r8 == r0) goto L_0x0089
            r8 = r4
            qjs r8 = (defpackage.qjs) r8     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qfn r8 = r8.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r9 = "Skipping bad column."
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r8.a(r9, r10)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5 = 0
            r14 = 3
            r15 = 1
            goto L_0x02de
        L_0x0089:
            byte[] r8 = r6.getBlob(r5)     // Catch:{ auda -> 0x0332 }
            aubs r9 = defpackage.aubs.b()     // Catch:{ auda -> 0x0332 }
            arbf r10 = defpackage.arbf.e     // Catch:{ auda -> 0x0332 }
            aucj r8 = defpackage.aucj.a((defpackage.aucj) r10, (byte[]) r8, (defpackage.aubs) r9)     // Catch:{ auda -> 0x0332 }
            arbf r8 = (defpackage.arbf) r8     // Catch:{ auda -> 0x0332 }
            java.lang.String r9 = r6.getString(r12)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            byte[] r10 = r6.getBlob(r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            avwl r11 = defpackage.avwl.d     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.io.ObjectInputStream r15 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0325, ClassNotFoundException -> 0x0323, all -> 0x0320 }
            java.io.ByteArrayInputStream r14 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0325, ClassNotFoundException -> 0x0323, all -> 0x0320 }
            r14.<init>(r10)     // Catch:{ IOException -> 0x0325, ClassNotFoundException -> 0x0323, all -> 0x0320 }
            r15.<init>(r14)     // Catch:{ IOException -> 0x0325, ClassNotFoundException -> 0x0323, all -> 0x0320 }
            java.lang.Object r10 = r15.readObject()     // Catch:{ IOException -> 0x031d, ClassNotFoundException -> 0x031b, all -> 0x0318 }
            byte[][] r10 = (byte[][]) r10     // Catch:{ IOException -> 0x031d, ClassNotFoundException -> 0x031b, all -> 0x0318 }
            defpackage.aeeo.a(r15)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r10 == 0) goto L_0x0312
            java.lang.Class r14 = r11.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r15 = r10.length     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r14, r15)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            audx[] r14 = (defpackage.audx[]) r14     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15 = 0
        L_0x00c5:
            int r0 = r10.length     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r15 < r0) goto L_0x02ef
            aeeo r0 = new aeeo     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r0.<init>(r14)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            audx[] r0 = r0.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            avwl[] r0 = (defpackage.avwl[]) r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qje r10 = defpackage.qje.d     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucd r10 = r10.o()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjn r11 = defpackage.qjn.f     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucd r11 = r11.o()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r14 = r8.d     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r15 = r11.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r15 != 0) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            r11.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.c = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x00ed:
            aucj r15 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjn r15 = (defpackage.qjn) r15     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15.d = r14     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r14 = r8.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r14.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15.a = r14     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r8 = r8.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15.c = r8     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r8.<init>()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0107:
            boolean r15 = r14.hasNext()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r15 == 0) goto L_0x0168
            java.lang.Object r15 = r14.next()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            avwl r15 = (defpackage.avwl) r15     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r13 = r15.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r13 = r8.containsKey(r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r13 != 0) goto L_0x0166
            java.lang.String r13 = r15.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r12 = r11.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r12 != 0) goto L_0x0122
            goto L_0x0127
        L_0x0122:
            r11.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.c = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0127:
            aucj r12 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjn r12 = (defpackage.qjn) r12     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r12.b = r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucj r12 = r11.i()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjn r12 = (defpackage.qjn) r12     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r13 = r10.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r13 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            r10.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r10.c = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0140:
            aucj r13 = r10.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qje r13 = (defpackage.qje) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r12.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13.b()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucx r13 = r13.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13.add(r12)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r12 = r15.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucj r13 = r10.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qje r13 = (defpackage.qje) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucx r13 = r13.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r13 = r13.size()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r13 = r13 + -1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r8.put(r12, r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r12 = 1
            goto L_0x0107
        L_0x0166:
            r12 = 1
            goto L_0x0107
        L_0x0168:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x016c:
            boolean r11 = r0.hasNext()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 == 0) goto L_0x02ba
            java.lang.Object r11 = r0.next()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            avwl r11 = (defpackage.avwl) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r12 = defpackage.qjh.e     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucd r12 = r12.o()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r13 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.Object r13 = r8.get(r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r13 = r13.intValue()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r14 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r14 != 0) goto L_0x018f
            goto L_0x0194
        L_0x018f:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r12.c = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0194:
            aucj r14 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r14 = (defpackage.qjh) r14     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r14.c = r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            avwr r11 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 == 0) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            avwr r11 = defpackage.avwr.e     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x01a1:
            int r13 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r13 = defpackage.avwq.a(r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            int r14 = r13 + -1
            if (r13 == 0) goto L_0x02b7
            if (r14 == 0) goto L_0x026b
            java.lang.String r13 = ""
            r15 = 1
            if (r14 == r15) goto L_0x0242
            r15 = 4
            r5 = 2
            if (r14 == r5) goto L_0x0217
            r5 = 3
            if (r14 == r5) goto L_0x01ec
            if (r14 == r15) goto L_0x01c0
            r13 = 2
            r14 = 3
            r15 = 1
            goto L_0x0294
        L_0x01c0:
            int r5 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r14 = 7
            if (r5 != r14) goto L_0x01cb
            java.lang.Object r5 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x01cc
        L_0x01cb:
        L_0x01cc:
            auay r5 = defpackage.auay.a((java.lang.String) r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r11 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x01d5
            goto L_0x01db
        L_0x01d5:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r12.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x01db:
            aucj r11 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r11 = (defpackage.qjh) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 5
            r11.a = r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.b = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 2
            r14 = 3
            r15 = 1
            goto L_0x0294
        L_0x01ec:
            int r5 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r14 = 5
            if (r5 != r14) goto L_0x01f7
            java.lang.Object r5 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x01f8
        L_0x01f7:
        L_0x01f8:
            auay r5 = defpackage.auay.a((java.lang.String) r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r11 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x0201
            goto L_0x0207
        L_0x0201:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r12.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0207:
            aucj r11 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r11 = (defpackage.qjh) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.a = r15     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.b = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 2
            r14 = 3
            r15 = 1
            goto L_0x0294
        L_0x0217:
            int r5 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r5 != r15) goto L_0x0222
            java.lang.Object r5 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x0223
        L_0x0222:
        L_0x0223:
            auay r5 = defpackage.auay.a((java.lang.String) r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r11 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x022c
            goto L_0x0232
        L_0x022c:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r12.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0232:
            aucj r11 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r11 = (defpackage.qjh) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 3
            r11.a = r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.b = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 2
            r14 = 3
            r15 = 1
            goto L_0x0294
        L_0x0242:
            int r5 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r14 = 3
            if (r5 != r14) goto L_0x024d
            java.lang.Object r5 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x024e
        L_0x024d:
        L_0x024e:
            auay r5 = defpackage.auay.a((java.lang.String) r13)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r11 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x0257
            goto L_0x025d
        L_0x0257:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r12.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x025d:
            aucj r11 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r11 = (defpackage.qjh) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r13 = 2
            r11.a = r13     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.b = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15 = 1
            goto L_0x0294
        L_0x026b:
            r13 = 2
            r14 = 3
            int r5 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15 = 6
            if (r5 != r15) goto L_0x027b
            java.lang.Object r5 = r11.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r5 = r5.booleanValue()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x027c
        L_0x027b:
            r5 = 0
        L_0x027c:
            boolean r11 = r12.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x0281
            goto L_0x0287
        L_0x0281:
            r12.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r12.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0287:
            aucj r11 = r12.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r11 = (defpackage.qjh) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r15 = 1
            r11.a = r15     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.b = r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0294:
            aucj r5 = r12.i()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qjh r5 = (defpackage.qjh) r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            boolean r11 = r10.c     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r11 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            r10.c()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11 = 0
            r10.c = r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x02a5:
            aucj r11 = r10.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qje r11 = (defpackage.qje) r11     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5.getClass()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.a()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            aucx r11 = r11.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r11.add(r5)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r5 = 0
            goto L_0x016c
        L_0x02b7:
            r5 = 0
            throw r5     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x02ba:
            r5 = 0
            r13 = 2
            r14 = 3
            r15 = 1
            aucj r0 = r10.i()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qje r0 = (defpackage.qje) r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            anaf r8 = defpackage.anfu.b     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r10 = 0
            java.util.List r0 = defpackage.qke.a(r9, r0, r8, r10)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r0 != 0) goto L_0x02db
            r0 = r4
            qjs r0 = (defpackage.qjs) r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qfn r0 = r0.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r8 = "Found devman domain with no filters!"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r0.b(r8, r10)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            goto L_0x02de
        L_0x02db:
            r7.addAll(r0)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x02de:
            boolean r0 = r6.moveToNext()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            if (r0 != 0) goto L_0x02ea
            defpackage.qjs.a((android.database.Cursor) r6)
            r0 = r7
            goto L_0x036f
        L_0x02ea:
            r0 = 3
            r5 = 0
            r12 = 1
            goto L_0x0072
        L_0x02ef:
            r0 = 3
            r5 = 0
            r13 = 2
            r0 = 7
            java.lang.Object r0 = r11.c(r0)     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            auef r0 = (defpackage.auef) r0     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            r5 = r10[r15]     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            java.lang.Object r0 = r0.a((byte[]) r5)     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            audx r0 = (defpackage.audx) r0     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            r14[r15] = r0     // Catch:{ Exception -> 0x0309, all -> 0x034e }
            int r15 = r15 + 1
            r0 = 3
            r5 = 0
            goto L_0x00c5
        L_0x0309:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r5 = "failed to create message array"
            r2.<init>(r5, r0)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            throw r2     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0312:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            throw r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0318:
            r0 = move-exception
            r14 = r15
            goto L_0x032e
        L_0x031b:
            r0 = move-exception
            goto L_0x031e
        L_0x031d:
            r0 = move-exception
        L_0x031e:
            r14 = r15
            goto L_0x0327
        L_0x0320:
            r0 = move-exception
            r14 = 0
            goto L_0x032e
        L_0x0323:
            r0 = move-exception
            goto L_0x0326
        L_0x0325:
            r0 = move-exception
        L_0x0326:
            r14 = 0
        L_0x0327:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x032d }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x032d }
            throw r5     // Catch:{ all -> 0x032d }
        L_0x032d:
            r0 = move-exception
        L_0x032e:
            defpackage.aeeo.a(r14)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            throw r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0332:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r2.<init>(r0)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            throw r2     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
        L_0x0339:
            r0 = r4
            qjs r0 = (defpackage.qjs) r0     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            qfn r0 = r0.a     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            java.lang.String r2 = "DevMan response with no results"
            r5 = 0
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            r0.a(r2, r7)     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            amzy r0 = defpackage.amzy.h()     // Catch:{ RemoteException -> 0x0350, all -> 0x034e }
            defpackage.qjs.a((android.database.Cursor) r6)
            goto L_0x036f
        L_0x034e:
            r0 = move-exception
            goto L_0x0352
        L_0x0350:
            r0 = move-exception
            goto L_0x0354
        L_0x0352:
            r14 = r6
            goto L_0x0372
        L_0x0354:
            r14 = r6
            goto L_0x035b
        L_0x0356:
            r0 = move-exception
            r14 = 0
            goto L_0x0372
        L_0x0359:
            r0 = move-exception
            r14 = 0
        L_0x035b:
            r2 = r4
            qjs r2 = (defpackage.qjs) r2     // Catch:{ all -> 0x0371 }
            qfn r2 = r2.a     // Catch:{ all -> 0x0371 }
            java.lang.String r5 = "Remote exception calling devman."
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0371 }
            r2.a(r0, r5, r7)     // Catch:{ all -> 0x0371 }
            amzy r0 = defpackage.amzy.h()     // Catch:{ all -> 0x0371 }
            defpackage.qjs.a((android.database.Cursor) r14)
        L_0x036f:
            r11 = 0
            goto L_0x0384
        L_0x0371:
            r0 = move-exception
        L_0x0372:
            defpackage.qjs.a((android.database.Cursor) r14)
            throw r0
        L_0x0376:
            qfn r0 = r0.a
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r5 = "No content provider client"
            r0.a(r5, r2)
            amzy r0 = defpackage.amzy.h()
        L_0x0384:
            qjs r4 = (defpackage.qjs) r4
            qkd r2 = r4.b
            java.util.List r2 = r2.a(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r0)
            r0 = 0
        L_0x0395:
            int r4 = r2.size()
            if (r0 >= r4) goto L_0x03cf
            java.lang.Object r4 = r2.get(r0)
            android.content.pm.InstantAppResolveInfo r4 = (android.content.pm.InstantAppResolveInfo) r4
            r5 = 0
        L_0x03a2:
            int r6 = r3.size()
            if (r5 >= r6) goto L_0x03c9
            java.lang.Object r6 = r3.get(r5)
            android.content.pm.InstantAppResolveInfo r6 = (android.content.pm.InstantAppResolveInfo) r6
            int r7 = r6.getDigestPrefix()
            int r8 = r4.getDigestPrefix()
            if (r7 != r8) goto L_0x03c6
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = r4.getPackageName()
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x03cc
        L_0x03c6:
            int r5 = r5 + 1
            goto L_0x03a2
        L_0x03c9:
            r3.add(r4)
        L_0x03cc:
            int r0 = r0 + 1
            goto L_0x0395
        L_0x03cf:
            r0 = r3
        L_0x03d0:
            if (r0 != 0) goto L_0x03d3
            goto L_0x03e1
        L_0x03d3:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x03e1
            qev r2 = r1.b
            java.lang.String r3 = "InstantAppResolverService.atLeastOneHashPrefixFilterMatch"
            r2.a(r3)
            goto L_0x03e8
        L_0x03e1:
            qev r2 = r1.b
            java.lang.String r3 = "InstantAppResolverService.zeroHashPrefixFilterMatches"
            r2.a(r3)
        L_0x03e8:
            android.app.InstantAppResolverService$InstantAppResolutionCallback r2 = r1.c
            r2.onInstantAppResolveInfo(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkf.run():void");
    }
}
