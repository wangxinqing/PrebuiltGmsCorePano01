package com.google.android.gms.droidguard;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DroidGuardChimeraService extends TracingIntentService {
    public static final anax a = anax.a((Object) "android.permission-group.PHONE");
    public mal b;
    public mbn c;
    public Executor d;
    public lyp e;
    private mam f;
    private Handler g;

    public DroidGuardChimeraService() {
        super("DG");
        setIntentRedelivery(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c2 A[Catch:{ all -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c3 A[Catch:{ all -> 0x02b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(byte[] r14) {
        /*
            r13 = this;
            java.lang.String r0 = "fast"
            java.lang.String r1 = "full"
            r2 = 0
            maz r3 = defpackage.may.a(r13)     // Catch:{ Exception -> 0x02b8, LinkageError -> 0x02b6 }
            aucd r4 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r4 = r4.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r4 = (defpackage.lym) r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r5 = r4.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r5 = r5 & 16
            if (r5 == 0) goto L_0x001d
            lyi r4 = r4.f     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r4 == 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            lyi r4 = defpackage.lyi.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            goto L_0x001e
        L_0x001d:
            r4 = r2
        L_0x001e:
            int r5 = r3.f()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r6 = r3.d()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r7 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r10 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r11 = 0
            if (r10 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r7.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0037:
            aucj r7 = r7.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r7 = (defpackage.lym) r7     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r10 = defpackage.lym.h     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r10 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10 = r10 | 4
            r7.a = r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.d = r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r7 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r8 = r3.f()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r8 = r8 + 1
            boolean r9 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r9 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r7.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0057:
            aucj r7 = r7.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r7 = (defpackage.lym) r7     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r9 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r9 = r9 | 8
            r7.a = r9     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.e = r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r7 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyh r8 = defpackage.lyh.e     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r8 = r8.o()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            java.lang.String r9 = "Process unexpectedly died"
            boolean r10 = r8.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r10 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            r8.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r8.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0077:
            aucj r10 = r8.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyh r10 = (defpackage.lyh) r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r9.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r12 = r10.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r12 = r12 | 1
            r10.a = r12     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10.b = r9     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r8 = r8.i()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyh r8 = (defpackage.lyh) r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyi r9 = defpackage.lyi.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r9 = r9.o()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r10 = r9.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r10 != 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r9.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r9.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x009c:
            aucj r10 = r9.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyi r10 = (defpackage.lyi) r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r8.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10.a()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucx r10 = r10.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10.add(r8)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r8 = r9.i()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyi r8 = (defpackage.lyi) r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r9 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r9 != 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            r7.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x00bb:
            aucj r7 = r7.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r7 = (defpackage.lym) r7     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r8.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.f = r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r8 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r8 = r8 | 16
            r7.a = r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbb r7 = r3.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r8 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r8 = r8.i()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r8 = (defpackage.lym) r8     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            byte[] r8 = r8.k()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.a(r8)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mal r7 = r13.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            java.lang.String r8 = ""
            max r8 = r13.a((java.lang.String) r8)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            maj r9 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mai r9 = r9.a((java.lang.String) r1)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r4 == 0) goto L_0x010a
            aucd r10 = r9.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r12 = r10.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r12 != 0) goto L_0x00f2
        L_0x00f1:
            goto L_0x00f8
        L_0x00f2:
            r10.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            goto L_0x00f1
        L_0x00f8:
            aucj r10 = r10.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r10 = (defpackage.lyd) r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r12 = defpackage.lyd.p     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10.m = r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r4 = r10.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r10.a = r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            goto L_0x0124
        L_0x010a:
            aucd r4 = r9.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r10 = r4.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r10 != 0) goto L_0x0111
            goto L_0x0116
        L_0x0111:
            r4.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0116:
            aucj r4 = r4.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r4 = (defpackage.lyd) r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r10 = defpackage.lyd.p     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.m = r2     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r10 = r4.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10 = r10 & -1025(0xfffffffffffffbff, float:NaN)
            r4.a = r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0124:
            aucd r4 = r9.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r10 = r4.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r10 != 0) goto L_0x012b
            goto L_0x0130
        L_0x012b:
            r4.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0130:
            aucj r4 = r4.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r4 = (defpackage.lyd) r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r10 = r4.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r4.a = r10     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.k = r5     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbi r4 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r9.a(r4)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r14 != 0) goto L_0x0144
            goto L_0x016b
        L_0x0144:
            aucd r4 = r9.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aubs r5 = defpackage.aubs.b()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyk r10 = defpackage.lyk.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r14 = defpackage.aucj.a((defpackage.aucj) r10, (byte[]) r14, (defpackage.aubs) r5)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyk r14 = (defpackage.lyk) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r5 != 0) goto L_0x0157
            goto L_0x015c
        L_0x0157:
            r4.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x015c:
            aucj r4 = r4.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r4 = (defpackage.lyd) r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.n = r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r14 = r4.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14 = r14 | 2048(0x800, float:2.87E-42)
            r4.a = r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x016b:
            lyd r14 = r9.a()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            maj r4 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mar r14 = r4.a((defpackage.lyd) r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r7.a((defpackage.mar) r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mas r14 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            com.google.android.gms.droidguard.DroidGuardResultsRequest r4 = new com.google.android.gms.droidguard.DroidGuardResultsRequest     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.<init>()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.a(r11)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbi r5 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbj r14 = r5.a(r1, r14, r8, r4)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            byte[] r14 = r14.a(r1)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            maj r1 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mai r1 = r1.a((java.lang.String) r0)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r4 = r1.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            auay r14 = defpackage.auay.a((byte[]) r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r5 != 0) goto L_0x01a1
            goto L_0x01a6
        L_0x01a1:
            r4.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x01a6:
            aucj r4 = r4.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r4 = (defpackage.lyd) r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.getClass()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r5 = r4.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.a = r5     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.j = r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbi r14 = r7.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r1.a(r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r6 > 0) goto L_0x01bd
            goto L_0x01d5
        L_0x01bd:
            aucd r14 = r1.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r4 = r14.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r4 != 0) goto L_0x01c4
            goto L_0x01c9
        L_0x01c4:
            r14.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x01c9:
            aucj r14 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lyd r14 = (defpackage.lyd) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r4 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4 = r4 | 512(0x200, float:7.175E-43)
            r14.a = r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.l = r6     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x01d5:
            lyd r14 = r1.a()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            maj r1 = r7.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mar r14 = r1.a((defpackage.lyd) r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r1 = r14.d     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r1 != 0) goto L_0x02a7
            r7.a((defpackage.mar) r14)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mas r1 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mau r4 = r7.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mav r5 = new mav     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r5.<init>(r0)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r4.a(r5, r1)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mbl r14 = r14.e     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r14 == 0) goto L_0x029f
            aucd r0 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            long r4 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r1 = r0.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r1 != 0) goto L_0x01ff
            goto L_0x0204
        L_0x01ff:
            r0.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0204:
            aucj r0 = r0.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r0 = (defpackage.lym) r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r1 = r0.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r1 = r1 | 1
            r0.a = r1     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0.b = r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r0 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            long r4 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r14 = r0.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r14 != 0) goto L_0x0219
            goto L_0x021e
        L_0x0219:
            r0.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x021e:
            aucj r14 = r0.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r14 = (defpackage.lym) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r0 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0 = r0 | 2
            r14.a = r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.c = r4     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r14 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r0 = r14.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r0 != 0) goto L_0x0231
            goto L_0x0236
        L_0x0231:
            r14.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0236:
            aucj r14 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r14 = (defpackage.lym) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r0 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0 = r0 | 8
            r14.a = r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.e = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r14 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            boolean r0 = r14.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r0 != 0) goto L_0x0249
            goto L_0x024e
        L_0x0249:
            r14.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x024e:
            aucj r14 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r14 = (defpackage.lym) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.f = r2     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r0 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r0 = r0 & -17
            r14.a = r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r14 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r0 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r0 = (defpackage.lym) r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r1 = r0.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r1 = r1 & 32
            if (r1 != 0) goto L_0x0267
            goto L_0x0281
        L_0x0267:
            int r0 = r0.g     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r0 = r0 + 1
            boolean r1 = r14.c     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            if (r1 != 0) goto L_0x0270
            goto L_0x0275
        L_0x0270:
            r14.c()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.c = r11     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0275:
            aucj r14 = r14.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r14 = (defpackage.lym) r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            int r1 = r14.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r1 = r1 | 32
            r14.a = r1     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.g = r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x0281:
            mbb r14 = r3.a     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucd r0 = r3.b     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            aucj r0 = r0.i()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            lym r0 = (defpackage.lym) r0     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            byte[] r0 = r0.k()     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            r14.a(r0)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            mam r14 = r13.f     // Catch:{ Exception -> 0x0298 }
            r14.a()     // Catch:{ Exception -> 0x0298 }
            return
        L_0x0298:
            r14 = move-exception
            lyp r0 = r13.e
        L_0x029b:
            r0.a((java.lang.Throwable) r14)
            return
        L_0x029f:
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            java.lang.String r0 = "Server response is missing a repeat window"
            r14.<init>(r0)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            throw r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x02a7:
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            java.lang.String r0 = "Server requested a retry"
            r14.<init>(r0)     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
            throw r14     // Catch:{ Exception -> 0x02b1, LinkageError -> 0x02af }
        L_0x02af:
            r14 = move-exception
            goto L_0x02b2
        L_0x02b1:
            r14 = move-exception
        L_0x02b2:
            r2 = r3
            goto L_0x02b9
        L_0x02b4:
            r14 = move-exception
            goto L_0x02d0
        L_0x02b6:
            r14 = move-exception
            goto L_0x02b9
        L_0x02b8:
            r14 = move-exception
        L_0x02b9:
            java.lang.String r0 = "DG"
            java.lang.String r1 = "FSC error"
            android.util.Log.e(r0, r1, r14)     // Catch:{ all -> 0x02b4 }
            if (r2 != 0) goto L_0x02c3
            goto L_0x02c6
        L_0x02c3:
            r2.a((java.lang.Throwable) r14)     // Catch:{ all -> 0x02b4 }
        L_0x02c6:
            mam r14 = r13.f     // Catch:{ Exception -> 0x02cc }
            r14.a()     // Catch:{ Exception -> 0x02cc }
            return
        L_0x02cc:
            r14 = move-exception
            lyp r0 = r13.e
            goto L_0x029b
        L_0x02d0:
            mam r0 = r13.f     // Catch:{ Exception -> 0x02d6 }
            r0.a()     // Catch:{ Exception -> 0x02d6 }
            goto L_0x02dc
        L_0x02d6:
            r0 = move-exception
            lyp r1 = r13.e
            r1.a((java.lang.Throwable) r0)
        L_0x02dc:
            goto L_0x02de
        L_0x02dd:
            throw r14
        L_0x02de:
            goto L_0x02dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.droidguard.DroidGuardChimeraService.a(byte[]):void");
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.droidguard.service.START".equals(intent.getAction())) {
            return new lxy(this, this);
        }
        return null;
    }

    public final void onCreate() {
        this.e = lyp.a((Context) this);
        this.b = mal.a((Context) this);
        this.f = new mam(this);
        this.g = new qvr();
        int i = Build.VERSION.SDK_INT;
        this.c = new mbn(this.e);
        this.d = new jfz(9, new LinkedBlockingQueue(1), new ThreadPoolExecutor.DiscardPolicy());
        super.onCreate();
    }

    public DroidGuardChimeraService(mal mal, mam mam, may may) {
        super("DG");
        setIntentRedelivery(true);
        this.b = mal;
        this.f = mam;
        this.g = new qvr();
    }

    public final max a(String str) {
        return new max(this, str);
    }

    public final void a(Intent intent) {
        if (intent != null && "com.google.android.gms.droidguard.service.PING".equals(intent.getAction())) {
            if (!axff.b()) {
                Log.i("DG", "Low-latency disabled");
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            long d2 = axff.a.a().d();
            lxw lxw = new lxw(this, Thread.currentThread());
            this.g.postDelayed(lxw, d2);
            a(byteArrayExtra);
            this.g.removeCallbacks(lxw);
        }
    }
}
