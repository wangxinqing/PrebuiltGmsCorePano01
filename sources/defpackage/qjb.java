package defpackage;

import android.content.Context;
import com.google.android.gms.instantapps.internal.AppInfo;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* renamed from: qjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjb {
    private static final qfn b = new qfn("AppInfoFetcher");
    public final Context a;
    private final qiz c;
    private final qei d;
    private final qhj e;
    private final qex f;

    public qjb(qiz qiz, qei qei, qhj qhj, qex qex, Context context) {
        this.c = qiz;
        this.d = qei;
        this.e = qhj;
        this.f = qex;
        this.a = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04f1 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04fd A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x051b A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0533 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x054b A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0564 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0565 A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x058c A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x058d A[Catch:{ all -> 0x05b7, all -> 0x05bd, IOException -> 0x05c3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.instantapps.internal.AppInfo a(defpackage.qli r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            qex r0 = r1.f
            qev r0 = r0.a()
            android.content.Context r3 = r1.a
            java.util.List r3 = defpackage.qlm.a(r3)
            android.content.Context r4 = r1.a
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.densityDpi
            com.google.android.gms.instantapps.internal.AppInfo r5 = r1.a(r2, r3, r4)
            if (r5 != 0) goto L_0x05d3
            r5 = r2
            qll r5 = (defpackage.qll) r5
            java.lang.String r6 = r5.a
            int r0 = r5.b
            int r7 = r5.c
            qex r8 = r1.f
            qev r8 = r8.a()
            r10 = 1
            r11 = 0
            qei r12 = r1.d     // Catch:{ InterruptedException -> 0x0080, ExecutionException -> 0x0045 }
            aorr r0 = r12.a((java.lang.String) r6, (int) r0, (int) r7, (java.util.List) r3)     // Catch:{ InterruptedException -> 0x0080, ExecutionException -> 0x0045 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0080, ExecutionException -> 0x0045 }
            araq r0 = (defpackage.araq) r0     // Catch:{ InterruptedException -> 0x0080, ExecutionException -> 0x0045 }
            java.lang.String r7 = "AppInfoFetcher.success"
            r8.a(r7)     // Catch:{ InterruptedException -> 0x0080, ExecutionException -> 0x0045 }
            goto L_0x0090
        L_0x0045:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()
            boolean r7 = r7 instanceof defpackage.babk
            if (r7 == 0) goto L_0x006f
            java.lang.Throwable r7 = r0.getCause()
            babk r7 = (defpackage.babk) r7
            babj r7 = r7.a
            babg r7 = r7.r
            babj r12 = defpackage.babj.g
            babg r12 = r12.r
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L_0x0063
            goto L_0x006f
        L_0x0063:
            java.lang.String r0 = "AppInfoFetcher.appNotFound"
            r8.a(r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r6
            r0 = 0
            goto L_0x0090
        L_0x006f:
            java.lang.String r6 = "AppInfoFetcher.failed"
            r8.a(r6)
            qfn r6 = b
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r8 = "RPC failed"
            r6.a(r0, r8, r7)
            r0 = 0
            goto L_0x0090
        L_0x0080:
            r0 = move-exception
            java.lang.String r6 = "AppInfoFetcher.interrupted"
            r8.a(r6)
            qfn r6 = b
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r8 = "RPC interrupted"
            r6.a(r0, r8, r7)
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x05d0
            int r6 = r5.b
            int r5 = r5.c
            long r7 = java.lang.System.currentTimeMillis()
            qik r12 = defpackage.qik.m
            aucd r12 = r12.o()
            long r13 = r0.l
            long r13 = r13 + r7
            boolean r7 = r12.c
            if (r7 != 0) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            r12.c()
            r12.c = r11
        L_0x00ad:
            aucj r7 = r12.b
            qik r7 = (defpackage.qik) r7
            r7.g = r13
            java.lang.String r8 = r0.b
            r8.getClass()
            r7.f = r8
            auay r8 = r0.i
            r8.getClass()
            r7.e = r8
            aucx r7 = r0.c
            java.util.ArrayList r8 = new java.util.ArrayList
            int r13 = r7.size()
            r8.<init>(r13)
            int r13 = r7.size()
            r14 = 0
        L_0x00d1:
            if (r14 >= r13) goto L_0x016b
            java.lang.Object r15 = r7.get(r14)
            arbg r15 = (defpackage.arbg) r15
            qiq r16 = defpackage.qiq.h
            aucd r9 = r16.o()
            java.lang.String r10 = r15.a
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            r9.c()
            r11 = 0
            r9.c = r11
        L_0x00ec:
            aucj r11 = r9.b
            qiq r11 = (defpackage.qiq) r11
            r10.getClass()
            r11.a = r10
            java.lang.String r10 = r15.b
            r10.getClass()
            r11.b = r10
            aucx r10 = r15.f
            r17 = r7
            aucx r7 = r11.c
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0110
            aucx r7 = r11.c
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r11.c = r7
        L_0x0110:
            aucx r7 = r11.c
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r7)
            aucs r7 = r15.g
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r9.c()
            r10 = 0
            r9.c = r10
        L_0x0122:
            aucj r10 = r9.b
            qiq r10 = (defpackage.qiq) r10
            aucs r11 = r10.d
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0136
            aucs r11 = r10.d
            aucs r11 = defpackage.aucj.a((defpackage.aucs) r11)
            r10.d = r11
        L_0x0136:
            aucs r10 = r10.d
            defpackage.auab.a((java.lang.Iterable) r7, (java.util.List) r10)
            long r10 = r15.c
            int r7 = (int) r10
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            r9.c()
            r10 = 0
            r9.c = r10
        L_0x0149:
            aucj r10 = r9.b
            qiq r10 = (defpackage.qiq) r10
            r10.e = r7
            auay r7 = r15.d
            r7.getClass()
            r10.f = r7
            boolean r7 = r15.e
            r10.g = r7
            aucj r7 = r9.i()
            qiq r7 = (defpackage.qiq) r7
            r8.add(r7)
            int r14 = r14 + 1
            r7 = r17
            r10 = 1
            r11 = 0
            goto L_0x00d1
        L_0x016b:
            boolean r7 = r12.c
            if (r7 != 0) goto L_0x0170
            goto L_0x0176
        L_0x0170:
            r12.c()
            r7 = 0
            r12.c = r7
        L_0x0176:
            aucj r7 = r12.b
            qik r7 = (defpackage.qik) r7
            aucx r9 = r7.b
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x018a
            aucx r9 = r7.b
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)
            r7.b = r9
        L_0x018a:
            aucx r7 = r7.b
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r7)
            aucx r7 = r0.g
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r7.size()
            r8.<init>(r9)
            int r9 = r7.size()
            r10 = 0
        L_0x019f:
            if (r10 >= r9) goto L_0x0224
            java.lang.Object r11 = r7.get(r10)
            arbe r11 = (defpackage.arbe) r11
            qiw r13 = defpackage.qiw.g
            aucd r13 = r13.o()
            avwp r14 = r11.a
            if (r14 == 0) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            avwp r14 = defpackage.avwp.d
        L_0x01b4:
            java.lang.String r14 = r14.a
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x01bb
            goto L_0x01c1
        L_0x01bb:
            r13.c()
            r15 = 0
            r13.c = r15
        L_0x01c1:
            aucj r15 = r13.b
            qiw r15 = (defpackage.qiw) r15
            r14.getClass()
            r15.a = r14
            avwp r14 = r11.a
            if (r14 == 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            avwp r14 = defpackage.avwp.d
        L_0x01d1:
            int r14 = r14.b
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x01d8
            goto L_0x01de
        L_0x01d8:
            r13.c()
            r15 = 0
            r13.c = r15
        L_0x01de:
            aucj r15 = r13.b
            qiw r15 = (defpackage.qiw) r15
            r15.b = r14
            avwp r14 = r11.a
            if (r14 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            avwp r14 = defpackage.avwp.d
        L_0x01eb:
            java.lang.String r14 = r14.c
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x01f2
            goto L_0x01f8
        L_0x01f2:
            r13.c()
            r15 = 0
            r13.c = r15
        L_0x01f8:
            aucj r15 = r13.b
            qiw r15 = (defpackage.qiw) r15
            r14.getClass()
            r15.c = r14
            java.lang.String r14 = r11.b
            r14.getClass()
            r15.d = r14
            long r1 = r11.c
            r15.e = r1
            auay r1 = r11.d
            r1.getClass()
            r15.f = r1
            aucj r1 = r13.i()
            qiw r1 = (defpackage.qiw) r1
            r8.add(r1)
            int r10 = r10 + 1
            r1 = r18
            r2 = r19
            goto L_0x019f
        L_0x0224:
            boolean r1 = r12.c
            if (r1 != 0) goto L_0x0229
            goto L_0x022f
        L_0x0229:
            r12.c()
            r1 = 0
            r12.c = r1
        L_0x022f:
            aucj r1 = r12.b
            qik r1 = (defpackage.qik) r1
            aucx r2 = r1.c
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0243
            aucx r2 = r1.c
            aucx r2 = defpackage.aucj.a((defpackage.aucx) r2)
            r1.c = r2
        L_0x0243:
            aucx r1 = r1.c
            defpackage.auab.a((java.lang.Iterable) r8, (java.util.List) r1)
            aucx r1 = r0.j
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = r1.size()
            r2.<init>(r7)
            int r7 = r1.size()
            r8 = 0
        L_0x0258:
            if (r8 >= r7) goto L_0x039c
            java.lang.Object r9 = r1.get(r8)
            avwl r9 = (defpackage.avwl) r9
            qiv r10 = defpackage.qiv.g
            aucd r10 = r10.o()
            java.lang.String r11 = r9.c
            boolean r13 = r10.c
            if (r13 != 0) goto L_0x026d
            goto L_0x0273
        L_0x026d:
            r10.c()
            r13 = 0
            r10.c = r13
        L_0x0273:
            aucj r13 = r10.b
            qiv r13 = (defpackage.qiv) r13
            r11.getClass()
            r13.f = r11
            java.lang.String r11 = r9.b
            r11.getClass()
            r13.e = r11
            avwr r11 = r9.a
            if (r11 == 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            avwr r11 = defpackage.avwr.e
        L_0x028a:
            int r11 = r11.a
            int r11 = defpackage.avwq.a(r11)
            int r13 = r11 + -1
            if (r11 == 0) goto L_0x0399
            r11 = 3
            java.lang.String r14 = ""
            r15 = 1
            if (r13 == r15) goto L_0x0326
            r15 = 2
            r17 = r1
            r1 = 4
            if (r13 == r15) goto L_0x02fd
            if (r13 == r11) goto L_0x02d3
            if (r13 == r1) goto L_0x02a6
            goto L_0x0350
        L_0x02a6:
            avwr r1 = r9.a
            if (r1 == 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            avwr r1 = defpackage.avwr.e
        L_0x02ad:
            int r11 = r1.a
            r13 = 7
            if (r11 != r13) goto L_0x02b8
            java.lang.Object r1 = r1.b
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x02b9
        L_0x02b8:
        L_0x02b9:
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x02be
            goto L_0x02c4
        L_0x02be:
            r10.c()
            r1 = 0
            r10.c = r1
        L_0x02c4:
            aucj r1 = r10.b
            qiv r1 = (defpackage.qiv) r1
            r14.getClass()
            r11 = 8
            r1.a = r11
            r1.b = r14
            goto L_0x0350
        L_0x02d3:
            avwr r1 = r9.a
            if (r1 == 0) goto L_0x02d8
            goto L_0x02da
        L_0x02d8:
            avwr r1 = defpackage.avwr.e
        L_0x02da:
            int r11 = r1.a
            r13 = 5
            if (r11 != r13) goto L_0x02e5
            java.lang.Object r1 = r1.b
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x02e6
        L_0x02e5:
        L_0x02e6:
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x02eb
            goto L_0x02f1
        L_0x02eb:
            r10.c()
            r1 = 0
            r10.c = r1
        L_0x02f1:
            aucj r1 = r10.b
            qiv r1 = (defpackage.qiv) r1
            r14.getClass()
            r1.a = r13
            r1.b = r14
            goto L_0x0350
        L_0x02fd:
            avwr r11 = r9.a
            if (r11 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            avwr r11 = defpackage.avwr.e
        L_0x0304:
            int r13 = r11.a
            if (r13 != r1) goto L_0x030e
            java.lang.Object r11 = r11.b
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x030f
        L_0x030e:
        L_0x030f:
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0314
            goto L_0x031a
        L_0x0314:
            r10.c()
            r11 = 0
            r10.c = r11
        L_0x031a:
            aucj r11 = r10.b
            qiv r11 = (defpackage.qiv) r11
            r14.getClass()
            r11.a = r1
            r11.b = r14
            goto L_0x0350
        L_0x0326:
            r17 = r1
            avwr r1 = r9.a
            if (r1 == 0) goto L_0x032d
            goto L_0x032f
        L_0x032d:
            avwr r1 = defpackage.avwr.e
        L_0x032f:
            int r13 = r1.a
            if (r13 != r11) goto L_0x0339
            java.lang.Object r1 = r1.b
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x033a
        L_0x0339:
        L_0x033a:
            boolean r1 = r10.c
            if (r1 != 0) goto L_0x033f
            goto L_0x0345
        L_0x033f:
            r10.c()
            r1 = 0
            r10.c = r1
        L_0x0345:
            aucj r1 = r10.b
            qiv r1 = (defpackage.qiv) r1
            r14.getClass()
            r1.a = r11
            r1.b = r14
        L_0x0350:
            avwr r1 = r9.a
            if (r1 == 0) goto L_0x0355
            goto L_0x0357
        L_0x0355:
            avwr r1 = defpackage.avwr.e
        L_0x0357:
            java.lang.String r1 = r1.c
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x035e
            goto L_0x0364
        L_0x035e:
            r10.c()
            r11 = 0
            r10.c = r11
        L_0x0364:
            aucj r11 = r10.b
            qiv r11 = (defpackage.qiv) r11
            r1.getClass()
            r11.c = r1
            avwr r1 = r9.a
            if (r1 == 0) goto L_0x0372
            goto L_0x0374
        L_0x0372:
            avwr r1 = defpackage.avwr.e
        L_0x0374:
            java.lang.String r1 = r1.d
            boolean r9 = r10.c
            if (r9 != 0) goto L_0x037b
            goto L_0x0381
        L_0x037b:
            r10.c()
            r9 = 0
            r10.c = r9
        L_0x0381:
            aucj r9 = r10.b
            qiv r9 = (defpackage.qiv) r9
            r1.getClass()
            r9.d = r1
            aucj r1 = r10.i()
            qiv r1 = (defpackage.qiv) r1
            r2.add(r1)
            int r8 = r8 + 1
            r1 = r17
            goto L_0x0258
        L_0x0399:
            r1 = 0
            throw r1
        L_0x039c:
            boolean r1 = r12.c
            if (r1 != 0) goto L_0x03a1
            goto L_0x03a7
        L_0x03a1:
            r12.c()
            r1 = 0
            r12.c = r1
        L_0x03a7:
            aucj r1 = r12.b
            qik r1 = (defpackage.qik) r1
            aucx r7 = r1.a
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x03bb
            aucx r7 = r1.a
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r1.a = r7
        L_0x03bb:
            aucx r1 = r1.a
            defpackage.auab.a((java.lang.Iterable) r2, (java.util.List) r1)
            auay r1 = r0.k
            boolean r2 = r12.c
            if (r2 != 0) goto L_0x03c7
            goto L_0x03cd
        L_0x03c7:
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x03cd:
            aucj r2 = r12.b
            qik r2 = (defpackage.qik) r2
            r1.getClass()
            r2.h = r1
            r2.i = r6
            r2.j = r5
            aucx r1 = r2.k
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x03ea
            aucx r1 = r2.k
            aucx r1 = defpackage.aucj.a((defpackage.aucx) r1)
            r2.k = r1
        L_0x03ea:
            aucx r1 = r2.k
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r1)
            boolean r1 = r12.c
            if (r1 != 0) goto L_0x03f4
            goto L_0x03fa
        L_0x03f4:
            r12.c()
            r1 = 0
            r12.c = r1
        L_0x03fa:
            aucj r1 = r12.b
            qik r1 = (defpackage.qik) r1
            r1.l = r4
            aucj r1 = r12.i()
            r3 = r1
            qik r3 = (defpackage.qik) r3
            aucx r1 = r0.h
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x043d
            qix r2 = defpackage.qix.b
            aucd r2 = r2.o()
            r4 = 0
        L_0x0416:
            int r5 = r1.size()
            if (r4 >= r5) goto L_0x0435
            android.content.pm.Signature r5 = new android.content.pm.Signature
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            byte[] r5 = r5.toByteArray()
            auay r5 = defpackage.auay.a((byte[]) r5)
            r2.d((defpackage.auay) r5)
            int r4 = r4 + 1
            goto L_0x0416
        L_0x0435:
            aucj r1 = r2.i()
            qix r1 = (defpackage.qix) r1
            r4 = r1
            goto L_0x043e
        L_0x043d:
            r4 = 0
        L_0x043e:
            avwj r1 = r0.f
            if (r1 == 0) goto L_0x046d
            qir r2 = defpackage.qir.c
            aucd r2 = r2.o()
            java.lang.String r5 = r1.a
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x044f
            goto L_0x0455
        L_0x044f:
            r2.c()
            r6 = 0
            r2.c = r6
        L_0x0455:
            aucj r6 = r2.b
            qir r6 = (defpackage.qir) r6
            r5.getClass()
            r6.a = r5
            java.lang.String r1 = r1.b
            r1.getClass()
            r6.b = r1
            aucj r1 = r2.i()
            qir r1 = (defpackage.qir) r1
            r8 = r1
            goto L_0x046e
        L_0x046d:
            r8 = 0
        L_0x046e:
            qlk r1 = new qlk
            java.lang.String r5 = r0.a
            java.lang.String r6 = r0.d
            java.lang.String r7 = r0.e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = r18
            qiz r0 = r2.c     // Catch:{ IOException -> 0x05c3 }
            r3 = r19
            r4 = r3
            qll r4 = (defpackage.qll) r4     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r4 = r4.a     // Catch:{ IOException -> 0x05c3 }
            r0.b()     // Catch:{ IOException -> 0x05c3 }
            qik r5 = r0.h(r4)     // Catch:{ IOException -> 0x05c3 }
            if (r5 == 0) goto L_0x04e2
            auay r6 = r5.e     // Catch:{ IOException -> 0x05c3 }
            qik r7 = r1.a     // Catch:{ IOException -> 0x05c3 }
            auay r7 = r7.e     // Catch:{ IOException -> 0x05c3 }
            boolean r6 = defpackage.ius.a(r6, r7)     // Catch:{ IOException -> 0x05c3 }
            if (r6 == 0) goto L_0x04e0
            qik r6 = r1.a     // Catch:{ IOException -> 0x05c3 }
            aucx r6 = r6.b     // Catch:{ IOException -> 0x05c3 }
            aucx r5 = r5.b     // Catch:{ IOException -> 0x05c3 }
            int r7 = r6.size()     // Catch:{ IOException -> 0x05c3 }
            int r8 = r5.size()     // Catch:{ IOException -> 0x05c3 }
            if (r7 != r8) goto L_0x04e0
            r7 = 0
        L_0x04ab:
            int r8 = r6.size()     // Catch:{ IOException -> 0x05c3 }
            if (r7 >= r8) goto L_0x04e2
            java.lang.Object r8 = r6.get(r7)     // Catch:{ IOException -> 0x05c3 }
            qiq r8 = (defpackage.qiq) r8     // Catch:{ IOException -> 0x05c3 }
            java.lang.Object r9 = r5.get(r7)     // Catch:{ IOException -> 0x05c3 }
            qiq r9 = (defpackage.qiq) r9     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r10 = r8.a     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r11 = r9.a     // Catch:{ IOException -> 0x05c3 }
            boolean r10 = defpackage.ius.a(r10, r11)     // Catch:{ IOException -> 0x05c3 }
            if (r10 == 0) goto L_0x04e0
            auay r10 = r8.f     // Catch:{ IOException -> 0x05c3 }
            auay r11 = r9.f     // Catch:{ IOException -> 0x05c3 }
            boolean r10 = defpackage.ius.a(r10, r11)     // Catch:{ IOException -> 0x05c3 }
            if (r10 == 0) goto L_0x04e0
            java.lang.String r8 = r8.b     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r9 = r9.b     // Catch:{ IOException -> 0x05c3 }
            boolean r8 = defpackage.ius.a(r8, r9)     // Catch:{ IOException -> 0x05c3 }
            if (r8 == 0) goto L_0x04de
            int r7 = r7 + 1
            goto L_0x04ab
        L_0x04de:
            r10 = 1
            goto L_0x04e3
        L_0x04e0:
            r10 = 1
            goto L_0x04e3
        L_0x04e2:
            r10 = 0
        L_0x04e3:
            com.google.android.gms.leveldb.WriteBatch r5 = com.google.android.gms.leveldb.WriteBatch.create()     // Catch:{ IOException -> 0x05c3 }
            qex r6 = r0.b     // Catch:{ all -> 0x05b7 }
            qev r6 = r6.a()     // Catch:{ all -> 0x05b7 }
            qix r7 = r1.b     // Catch:{ all -> 0x05b7 }
            if (r7 == 0) goto L_0x04fd
            byte[] r8 = r0.k(r4)     // Catch:{ all -> 0x05b7 }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x05b7 }
            r5.put(r8, r7)     // Catch:{ all -> 0x05b7 }
            goto L_0x0504
        L_0x04fd:
            byte[] r7 = r0.k(r4)     // Catch:{ all -> 0x05b7 }
            r5.delete(r7)     // Catch:{ all -> 0x05b7 }
        L_0x0504:
            byte[] r7 = r0.m(r4)     // Catch:{ all -> 0x05b7 }
            qik r8 = r1.a     // Catch:{ all -> 0x05b7 }
            byte[] r8 = r8.k()     // Catch:{ all -> 0x05b7 }
            r5.put(r7, r8)     // Catch:{ all -> 0x05b7 }
            qio r7 = defpackage.qio.e     // Catch:{ all -> 0x05b7 }
            aucd r7 = r7.o()     // Catch:{ all -> 0x05b7 }
            java.lang.String r8 = r1.c     // Catch:{ all -> 0x05b7 }
            if (r8 == 0) goto L_0x052f
            boolean r9 = r7.c     // Catch:{ all -> 0x05b7 }
            if (r9 != 0) goto L_0x0520
            goto L_0x0526
        L_0x0520:
            r7.c()     // Catch:{ all -> 0x05b7 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x05b7 }
        L_0x0526:
            aucj r9 = r7.b     // Catch:{ all -> 0x05b7 }
            qio r9 = (defpackage.qio) r9     // Catch:{ all -> 0x05b7 }
            r8.getClass()     // Catch:{ all -> 0x05b7 }
            r9.a = r8     // Catch:{ all -> 0x05b7 }
        L_0x052f:
            java.lang.String r8 = r1.d     // Catch:{ all -> 0x05b7 }
            if (r8 == 0) goto L_0x0547
            boolean r9 = r7.c     // Catch:{ all -> 0x05b7 }
            if (r9 != 0) goto L_0x0538
            goto L_0x053e
        L_0x0538:
            r7.c()     // Catch:{ all -> 0x05b7 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x05b7 }
        L_0x053e:
            aucj r9 = r7.b     // Catch:{ all -> 0x05b7 }
            qio r9 = (defpackage.qio) r9     // Catch:{ all -> 0x05b7 }
            r8.getClass()     // Catch:{ all -> 0x05b7 }
            r9.b = r8     // Catch:{ all -> 0x05b7 }
        L_0x0547:
            java.lang.String r8 = r1.e     // Catch:{ all -> 0x05b7 }
            if (r8 == 0) goto L_0x0560
            boolean r9 = r7.c     // Catch:{ all -> 0x05b7 }
            if (r9 != 0) goto L_0x0550
        L_0x054f:
            goto L_0x0557
        L_0x0550:
            r7.c()     // Catch:{ all -> 0x05b7 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x05b7 }
            goto L_0x054f
        L_0x0557:
            aucj r9 = r7.b     // Catch:{ all -> 0x05b7 }
            qio r9 = (defpackage.qio) r9     // Catch:{ all -> 0x05b7 }
            r8.getClass()     // Catch:{ all -> 0x05b7 }
            r9.c = r8     // Catch:{ all -> 0x05b7 }
        L_0x0560:
            qir r8 = r1.f     // Catch:{ all -> 0x05b7 }
            if (r8 != 0) goto L_0x0565
            goto L_0x0579
        L_0x0565:
            boolean r9 = r7.c     // Catch:{ all -> 0x05b7 }
            if (r9 != 0) goto L_0x056a
            goto L_0x0570
        L_0x056a:
            r7.c()     // Catch:{ all -> 0x05b7 }
            r9 = 0
            r7.c = r9     // Catch:{ all -> 0x05b7 }
        L_0x0570:
            aucj r9 = r7.b     // Catch:{ all -> 0x05b7 }
            qio r9 = (defpackage.qio) r9     // Catch:{ all -> 0x05b7 }
            r8.getClass()     // Catch:{ all -> 0x05b7 }
            r9.d = r8     // Catch:{ all -> 0x05b7 }
        L_0x0579:
            byte[] r8 = r0.e(r4)     // Catch:{ all -> 0x05b7 }
            aucj r7 = r7.i()     // Catch:{ all -> 0x05b7 }
            qio r7 = (defpackage.qio) r7     // Catch:{ all -> 0x05b7 }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x05b7 }
            r5.put(r8, r7)     // Catch:{ all -> 0x05b7 }
            if (r10 != 0) goto L_0x058d
            goto L_0x0594
        L_0x058d:
            byte[] r4 = r0.l(r4)     // Catch:{ all -> 0x05b7 }
            r5.delete(r4)     // Catch:{ all -> 0x05b7 }
        L_0x0594:
            qgy r0 = r0.c     // Catch:{ all -> 0x05b7 }
            r0.a((com.google.android.gms.leveldb.WriteBatch) r5)     // Catch:{ all -> 0x05b7 }
            java.lang.String r0 = "MetadataDatastore.writeAppMetadata"
            r6.a(r0)     // Catch:{ all -> 0x05b7 }
            r5.close()     // Catch:{ IOException -> 0x05c3 }
            qik r0 = r1.a     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r1 = r1.c     // Catch:{ IOException -> 0x05c3 }
            qhj r4 = r2.e     // Catch:{ IOException -> 0x05c3 }
            r5 = r3
            qll r5 = (defpackage.qll) r5     // Catch:{ IOException -> 0x05c3 }
            java.lang.String r5 = r5.a     // Catch:{ IOException -> 0x05c3 }
            r6 = 20685(0x50cd, float:2.8986E-41)
            android.content.pm.PackageInfo r4 = r4.b(r5, r6)     // Catch:{ IOException -> 0x05c3 }
            com.google.android.gms.instantapps.internal.AppInfo r0 = defpackage.qlj.a(r3, r0, r1, r4)     // Catch:{ IOException -> 0x05c3 }
            return r0
        L_0x05b7:
            r0 = move-exception
            r1 = r0
            r5.close()     // Catch:{ all -> 0x05bd }
            goto L_0x05c2
        L_0x05bd:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x05c3 }
        L_0x05c2:
            throw r1     // Catch:{ IOException -> 0x05c3 }
        L_0x05c3:
            r0 = move-exception
            qfn r1 = b
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "DB write failed"
            r1.a(r0, r4, r3)
            r1 = 0
            return r1
        L_0x05d0:
            r2 = r1
            r1 = 0
            return r1
        L_0x05d3:
            r2 = r1
            java.lang.String r1 = "AppInfoFetcher.cacheHit"
            r0.a(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjb.a(qli):com.google.android.gms.instantapps.internal.AppInfo");
    }

    public final AppInfo a(qli qli, List list, int i) {
        int i2;
        AppInfo appInfo = null;
        try {
            qik h = this.c.h(((qll) qli).a);
            String c2 = this.c.c(((qll) qli).a);
            if (h != null) {
                if (c2 != null && (axuy.d() || h.g >= System.currentTimeMillis())) {
                    if (axuy.d() || axuy.a.a().O()) {
                        if (h.i == ((qll) qli).b && h.j == ((qll) qli).c && h.l == i) {
                            if (!new ob((Collection) h.k).containsAll(new ob((Collection) list))) {
                            }
                        }
                    }
                    appInfo = qlj.a(qli, h, c2, this.e.b(((qll) qli).a, 20685));
                }
            }
        } catch (IOException e2) {
            b.a(e2);
        }
        qlo qlo = ((qll) qli).d;
        if (appInfo == null) {
            i2 = 1415;
        } else {
            i2 = 1414;
        }
        qlo.a(i2);
        return appInfo;
    }
}
