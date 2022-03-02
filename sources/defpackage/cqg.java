package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: cqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cqg extends cql {
    private static final ArrayList a = new ArrayList(Arrays.asList(new Integer[]{1, 2}));
    private static final ArrayList b = new ArrayList(Arrays.asList(new Integer[]{1, 2, 3}));
    private static final Set c = Collections.singleton("com.google.android.gms");
    private final Context d;
    private final cqe e;
    private final cqd f;
    private final cqf g;
    private final ArrayList h = new ArrayList();
    private final hhj i;

    public cqg(Context context, cqe cqe, cqd cqd, cqf cqf, hhj hhj) {
        this.d = context;
        this.e = cqe;
        this.f = cqd;
        this.g = cqf;
        this.i = hhj;
    }

    private final int a(String str, String str2) {
        return a(str, str2, true);
    }

    static int b(cpx cpx) {
        if (cpx.k == null) {
            return cpx.h == null ? 1 : 2;
        }
        return 3;
    }

    private static int c(cpx cpx) {
        if (cpx.r == null) {
            return 6;
        }
        int i2 = cpx.s;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 != 8) {
            return i2 != 16 ? 0 : 1;
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07fe, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0869, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x086a, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x086f, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0873, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0876, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0877, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x087b, code lost:
        r26 = "'.";
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x087f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0880, code lost:
        r26 = "'.";
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0932, code lost:
        r1 = new java.lang.String("Error message: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0938, code lost:
        r1 = "Error message: ".concat(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05d8 A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05da A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x060f A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x061d A[Catch:{ all -> 0x0ad7, all -> 0x0b46 }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0869 A[ExcHandler: all (th java.lang.Throwable), PHI: r13 
      PHI: (r13v23 cqw) = (r13v24 cqw), (r13v24 cqw), (r13v6 cqw), (r13v6 cqw), (r13v6 cqw) binds: [B:199:0x04a1, B:200:?, B:148:0x032d, B:197:0x049e, B:198:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x032d] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0885 A[ExcHandler: Exception (e java.lang.Exception), PHI: r13 
      PHI: (r13v22 cqw) = (r13v6 cqw), (r13v6 cqw), (r13v6 cqw), (r13v6 cqw), (r13v29 cqw) binds: [B:122:0x02b0, B:123:?, B:124:0x02b2, B:133:0x02c1, B:136:0x02c9] A[DONT_GENERATE, DONT_INLINE], Splitter:B:122:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0932 A[Catch:{ cqu -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0938 A[Catch:{ cqu -> 0x0950 }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0b31  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int d(defpackage.cpx r33) {
        /*
            r32 = this;
            r7 = r32
            r8 = r33
            java.lang.String r1 = "Module '"
            r2 = 6
            r9 = 0
            r7.a((int) r2, (int) r9, (defpackage.cpx) r8)
            cqf r2 = r7.g
            java.io.File r2 = r2.a()
            java.lang.String r3 = "DynamicModuleDownloader"
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "No module root"
            android.util.Log.e(r3, r1)
            return r9
        L_0x001b:
            long r4 = r8.d
            boolean r4 = a((java.io.File) r2, (long) r4)
            if (r4 != 0) goto L_0x0029
            java.lang.String r1 = "low disk"
            android.util.Log.e(r3, r1)
            return r9
        L_0x0029:
            java.io.File r10 = new java.io.File
            java.lang.String r4 = defpackage.cqf.c(r33)
            r10.<init>(r2, r4)
            defpackage.cqs.a((java.io.File) r10)
            r11 = 2
            r6 = 1
            cqe r14 = r7.e     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            java.lang.Long r15 = r8.r     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            long r4 = r15.longValue()     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            android.os.ParcelFileDescriptor r4 = r14.a((long) r4)     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r5 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0b16, SecurityException -> 0x0af6, all -> 0x0aef }
            long r14 = r4.getStatSize()     // Catch:{ FileNotFoundException -> 0x0aec, SecurityException -> 0x0ae9, all -> 0x0ae3 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0aec, SecurityException -> 0x0ae9, all -> 0x0ae3 }
            r4.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0aec, SecurityException -> 0x0ae9, all -> 0x0ae3 }
            cqw r13 = new cqw     // Catch:{ all -> 0x0add }
            r13.<init>(r4)     // Catch:{ all -> 0x0add }
            android.net.Uri r2 = r8.k     // Catch:{ all -> 0x0ad7 }
            java.lang.String r9 = "'."
            if (r2 != 0) goto L_0x01cb
            android.net.Uri r1 = r8.h     // Catch:{ all -> 0x0ad7 }
            if (r1 == 0) goto L_0x019b
            java.lang.Integer r1 = r8.j     // Catch:{ cqt -> 0x0162 }
            int r1 = r1.intValue()     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = "'. Retrying uncompressed download."
            r12 = -1008(0xfffffffffffffc10, float:NaN)
            if (r1 == r6) goto L_0x00f3
            if (r1 != r11) goto L_0x00a8
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0077 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r5, r6)     // Catch:{ IOException -> 0x0077 }
            goto L_0x00f8
        L_0x0077:
            r0 = move-exception
            r1 = 8
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            r1 = 10
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            cqt r1 = new cqt     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = r8.a     // Catch:{ cqt -> 0x0162 }
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ cqt -> 0x0162 }
            int r12 = r12.length()     // Catch:{ cqt -> 0x0162 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ cqt -> 0x0162 }
            int r12 = r12 + 86
            r14.<init>(r12)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r12 = "Failed to read the gzip compressed file for module '"
            r14.append(r12)     // Catch:{ cqt -> 0x0162 }
            r14.append(r6)     // Catch:{ cqt -> 0x0162 }
            r14.append(r2)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = r14.toString()     // Catch:{ cqt -> 0x0162 }
            r1.<init>(r2)     // Catch:{ cqt -> 0x0162 }
            throw r1     // Catch:{ cqt -> 0x0162 }
        L_0x00a8:
            r1 = -1009(0xfffffffffffffc0f, float:NaN)
            r6 = 8
            r7.a((int) r6, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            r1 = -1009(0xfffffffffffffc0f, float:NaN)
            r6 = 10
            r7.a((int) r6, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            cqt r1 = new cqt     // Catch:{ cqt -> 0x0162 }
            java.lang.Integer r6 = r8.j     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r12 = r8.a     // Catch:{ cqt -> 0x0162 }
            java.lang.String r14 = java.lang.String.valueOf(r6)     // Catch:{ cqt -> 0x0162 }
            int r14 = r14.length()     // Catch:{ cqt -> 0x0162 }
            java.lang.String r15 = java.lang.String.valueOf(r12)     // Catch:{ cqt -> 0x0162 }
            int r15 = r15.length()     // Catch:{ cqt -> 0x0162 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqt -> 0x0162 }
            int r14 = r14 + 85
            int r14 = r14 + r15
            r11.<init>(r14)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r14 = "Unknown compression format ("
            r11.append(r14)     // Catch:{ cqt -> 0x0162 }
            r11.append(r6)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = ") received for module '"
            r11.append(r6)     // Catch:{ cqt -> 0x0162 }
            r11.append(r12)     // Catch:{ cqt -> 0x0162 }
            r11.append(r2)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = r11.toString()     // Catch:{ cqt -> 0x0162 }
            r1.<init>(r2)     // Catch:{ cqt -> 0x0162 }
            throw r1     // Catch:{ cqt -> 0x0162 }
        L_0x00f3:
            aosu r1 = new aosu     // Catch:{ IOException -> 0x0131 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0131 }
        L_0x00f8:
            r2 = 2
            cqv r1 = defpackage.cqx.a(r1, r13, r2)     // Catch:{ IOException -> 0x0100 }
            goto L_0x04b5
        L_0x0100:
            r0 = move-exception
            r1 = 8
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            r1 = 10
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            cqt r1 = new cqt     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = r8.a     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ cqt -> 0x0162 }
            int r6 = r6.length()     // Catch:{ cqt -> 0x0162 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqt -> 0x0162 }
            int r6 = r6 + 48
            r11.<init>(r6)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = "Failed copying compressed module for module: '"
            r11.append(r6)     // Catch:{ cqt -> 0x0162 }
            r11.append(r2)     // Catch:{ cqt -> 0x0162 }
            r11.append(r9)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = r11.toString()     // Catch:{ cqt -> 0x0162 }
            r1.<init>(r2)     // Catch:{ cqt -> 0x0162 }
            throw r1     // Catch:{ cqt -> 0x0162 }
        L_0x0131:
            r0 = move-exception
            r1 = 8
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            r1 = 10
            r7.a((int) r1, (int) r12, (defpackage.cpx) r8)     // Catch:{ cqt -> 0x0162 }
            cqt r1 = new cqt     // Catch:{ cqt -> 0x0162 }
            java.lang.String r6 = r8.a     // Catch:{ cqt -> 0x0162 }
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch:{ cqt -> 0x0162 }
            int r11 = r11.length()     // Catch:{ cqt -> 0x0162 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ cqt -> 0x0162 }
            int r11 = r11 + 88
            r12.<init>(r11)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r11 = "Failed to read the brotli compressed file for module '"
            r12.append(r11)     // Catch:{ cqt -> 0x0162 }
            r12.append(r6)     // Catch:{ cqt -> 0x0162 }
            r12.append(r2)     // Catch:{ cqt -> 0x0162 }
            java.lang.String r2 = r12.toString()     // Catch:{ cqt -> 0x0162 }
            r1.<init>(r2)     // Catch:{ cqt -> 0x0162 }
            throw r1     // Catch:{ cqt -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r1 = r0
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0ad7 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = r8.a     // Catch:{ all -> 0x0ad7 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0ad7 }
            int r2 = r2.length()     // Catch:{ all -> 0x0ad7 }
            r6 = 39
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad7 }
            r6.<init>(r2)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r2 = "Requesting full download for module '"
            r6.append(r2)     // Catch:{ all -> 0x0ad7 }
            r6.append(r1)     // Catch:{ all -> 0x0ad7 }
            r6.append(r9)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0ad7 }
            android.util.Log.i(r3, r1)     // Catch:{ all -> 0x0ad7 }
            a((java.io.Closeable) r13)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r4)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r5)     // Catch:{ all -> 0x0b46 }
            r9 = 3
            goto L_0x0b2e
        L_0x019b:
            r1 = 2
            cqv r2 = defpackage.cqx.a(r5, r13, r1)     // Catch:{ IOException -> 0x01a4 }
            r1 = r2
            goto L_0x04b5
        L_0x01a4:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad7 }
            r2 = 39
            r1.<init>(r2)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r2 = "Failed copying downloaded module: "
            r1.append(r2)     // Catch:{ all -> 0x0ad7 }
            r2 = 0
            r1.append(r2)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0ad7 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0ad7 }
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0ad7 }
            a((java.io.Closeable) r13)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r4)     // Catch:{ all -> 0x0b46 }
            goto L_0x0b0c
        L_0x01cb:
            int r6 = r5.available()     // Catch:{ IOException -> 0x0a6a }
            long r11 = (long) r6     // Catch:{ IOException -> 0x0a6a }
            java.lang.Long r6 = r8.l     // Catch:{ IOException -> 0x0a6a }
            long r17 = r6.longValue()     // Catch:{ IOException -> 0x0a6a }
            int r6 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r6 != 0) goto L_0x0a2f
            java.lang.String r6 = r8.p     // Catch:{ cqu -> 0x0a66 }
            if (r6 != 0) goto L_0x01fd
            java.lang.String r6 = "Using cached base module file."
            android.util.Log.i(r3, r6)     // Catch:{ cqu -> 0x01f8 }
            java.io.File r6 = new java.io.File     // Catch:{ cqu -> 0x01f8 }
            cqf r11 = r7.g     // Catch:{ cqu -> 0x01f8 }
            java.io.File r11 = r11.a()     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r12 = r8.a     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = r8.n     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = defpackage.cqf.b(r12, r2)     // Catch:{ cqu -> 0x01f8 }
            r6.<init>(r11, r2)     // Catch:{ cqu -> 0x01f8 }
            r2 = r6
            goto L_0x0209
        L_0x01f8:
            r0 = move-exception
            r2 = r0
            r1 = r9
            goto L_0x0aa2
        L_0x01fd:
            java.lang.String r2 = "Using base module file stored externally."
            android.util.Log.i(r3, r2)     // Catch:{ cqu -> 0x0a66 }
            java.io.File r2 = new java.io.File     // Catch:{ cqu -> 0x0a66 }
            java.lang.String r6 = r8.p     // Catch:{ cqu -> 0x0a66 }
            r2.<init>(r6)     // Catch:{ cqu -> 0x0a66 }
        L_0x0209:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0277 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0277 }
            r11 = 1
            r12 = 0
            cqv r6 = defpackage.cqx.a(r6, r12, r11)     // Catch:{ IOException -> 0x0277 }
            java.lang.String r6 = r6.b     // Catch:{ IOException -> 0x0277 }
            if (r6 == 0) goto L_0x027e
            java.lang.String r11 = r8.o     // Catch:{ cqu -> 0x01f8 }
            boolean r11 = r6.equals(r11)     // Catch:{ cqu -> 0x01f8 }
            if (r11 != 0) goto L_0x027e
            java.lang.String r2 = r8.a     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ cqu -> 0x01f8 }
            int r11 = r11.length()     // Catch:{ cqu -> 0x01f8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x01f8 }
            int r11 = r11 + 55
            r12.<init>(r11)     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r11 = "Base module file for module '"
            r12.append(r11)     // Catch:{ cqu -> 0x01f8 }
            r12.append(r2)     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = "' has incorrect SHA1 hash."
            r12.append(r2)     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = r12.toString()     // Catch:{ cqu -> 0x01f8 }
            android.util.Log.e(r3, r2)     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = "Expected: "
            java.lang.String r11 = r8.o     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ cqu -> 0x01f8 }
            int r12 = r11.length()     // Catch:{ cqu -> 0x01f8 }
            if (r12 != 0) goto L_0x0259
            java.lang.String r11 = new java.lang.String     // Catch:{ cqu -> 0x01f8 }
            r11.<init>(r2)     // Catch:{ cqu -> 0x01f8 }
            goto L_0x025d
        L_0x0259:
            java.lang.String r11 = r2.concat(r11)     // Catch:{ cqu -> 0x01f8 }
        L_0x025d:
            android.util.Log.e(r3, r11)     // Catch:{ cqu -> 0x01f8 }
            java.lang.String r2 = "Obtained: "
            int r11 = r6.length()     // Catch:{ cqu -> 0x01f8 }
            if (r11 != 0) goto L_0x026e
            java.lang.String r6 = new java.lang.String     // Catch:{ cqu -> 0x01f8 }
            r6.<init>(r2)     // Catch:{ cqu -> 0x01f8 }
            goto L_0x0272
        L_0x026e:
            java.lang.String r6 = r2.concat(r6)     // Catch:{ cqu -> 0x01f8 }
        L_0x0272:
            android.util.Log.e(r3, r6)     // Catch:{ cqu -> 0x01f8 }
            r2 = 0
            goto L_0x027e
        L_0x0277:
            r0 = move-exception
            java.lang.String r2 = "Base module file could not be read while computing its hash."
            android.util.Log.e(r3, r2)     // Catch:{ cqu -> 0x0a66 }
            r2 = 0
        L_0x027e:
            r6 = -1012(0xfffffffffffffc0c, float:NaN)
            if (r2 == 0) goto L_0x09fc
            java.lang.Integer r11 = r8.m     // Catch:{ IOException -> 0x09c6 }
            int r11 = r11.intValue()     // Catch:{ IOException -> 0x09c6 }
            r12 = 2
            if (r11 != r12) goto L_0x028c
            goto L_0x02a3
        L_0x028c:
            r12 = 3
            if (r11 == r12) goto L_0x02a3
            r12 = 4
            if (r11 == r12) goto L_0x02a3
            java.lang.Integer r11 = r8.m     // Catch:{  }
            int r11 = r11.intValue()     // Catch:{  }
            r12 = 5
            if (r11 != r12) goto L_0x02a1
            aosu r11 = new aosu     // Catch:{  }
            r11.<init>(r5)     // Catch:{  }
            goto L_0x02aa
        L_0x02a1:
            r11 = r5
            goto L_0x02aa
        L_0x02a3:
            java.util.zip.GZIPInputStream r11 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x09c6 }
            r12 = 8192(0x2000, float:1.14794E-41)
            r11.<init>(r5, r12)     // Catch:{ IOException -> 0x09c6 }
        L_0x02aa:
            boolean r12 = r2.exists()     // Catch:{ cqu -> 0x0a66 }
            if (r12 == 0) goto L_0x0956
            java.lang.Integer r6 = r8.m     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            int r6 = r6.intValue()     // Catch:{ amme -> 0x087f, IOException -> 0x087a, Exception -> 0x0885 }
            r12 = 1
            if (r6 == r12) goto L_0x032d
            r12 = 2
            if (r6 == r12) goto L_0x032d
            r12 = 3
            if (r6 != r12) goto L_0x02e4
            r16 = r13
            long r12 = r8.d     // Catch:{ amme -> 0x02df, IOException -> 0x02da, Exception -> 0x02d5, all -> 0x02d0 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ amme -> 0x02df, IOException -> 0x02da, Exception -> 0x02d5, all -> 0x02d0 }
            r13 = r16
            defpackage.ammf.a(r2, r13, r11, r12)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r26 = r9
            goto L_0x04a1
        L_0x02d0:
            r0 = move-exception
            r13 = r16
            goto L_0x0ad8
        L_0x02d5:
            r0 = move-exception
            r13 = r16
            goto L_0x0886
        L_0x02da:
            r0 = move-exception
            r13 = r16
            goto L_0x08c2
        L_0x02df:
            r0 = move-exception
            r13 = r16
            goto L_0x08fb
        L_0x02e4:
            java.lang.String r2 = r8.a     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            java.lang.Integer r6 = r8.m     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            int r11 = r11.length()     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            int r11 = r11 + 55
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            int r12 = r12.length()     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            int r11 = r11 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r12.<init>(r11)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r12.append(r1)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r12.append(r2)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            java.lang.String r2 = "' is delivered with unexpected patch format '"
            r12.append(r2)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r12.append(r6)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r12.append(r9)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            java.lang.String r2 = r12.toString()     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            android.util.Log.e(r3, r2)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r2 = -1013(0xfffffffffffffc0b, float:NaN)
            r6 = 8
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r2 = -1013(0xfffffffffffffc0b, float:NaN)
            r6 = 13
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ amme -> 0x08fa, IOException -> 0x08c1, Exception -> 0x0885 }
            r1 = r9
            goto L_0x099a
        L_0x032d:
            long r6 = r8.d     // Catch:{ amme -> 0x0876, IOException -> 0x0872, Exception -> 0x086e, all -> 0x0869 }
            ammi r2 = defpackage.ammi.a(r2)     // Catch:{ amme -> 0x0876, IOException -> 0x0872, Exception -> 0x086e, all -> 0x0869 }
            r12 = 16384(0x4000, float:2.2959E-41)
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x084a }
            r26 = r9
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0844 }
            r27 = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r9.<init>(r11, r1)     // Catch:{ all -> 0x0840 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0840 }
            r1.<init>(r9)     // Catch:{ all -> 0x0840 }
            int r9 = r1.readInt()     // Catch:{ all -> 0x0840 }
            r11 = -771763713(0xffffffffd1ffd1ff, float:-1.37342476E11)
            if (r9 == r11) goto L_0x037c
            amme r1 = new amme     // Catch:{ all -> 0x0840 }
            java.lang.String r6 = "Unexpected magic="
            r11 = 1
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ all -> 0x0840 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0840 }
            r11 = 0
            r7[r11] = r9     // Catch:{ all -> 0x0840 }
            java.lang.String r9 = "%x"
            java.lang.String r7 = java.lang.String.format(r9, r7)     // Catch:{ all -> 0x0840 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0840 }
            int r9 = r7.length()     // Catch:{ all -> 0x0840 }
            if (r9 != 0) goto L_0x0374
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0840 }
            r7.<init>(r6)     // Catch:{ all -> 0x0840 }
            goto L_0x0378
        L_0x0374:
            java.lang.String r7 = r6.concat(r7)     // Catch:{ all -> 0x0840 }
        L_0x0378:
            r1.<init>(r7)     // Catch:{ all -> 0x0840 }
            throw r1     // Catch:{ all -> 0x0840 }
        L_0x037c:
            r11 = 1
            int r9 = r1.read()     // Catch:{ all -> 0x0840 }
            r11 = 4
            if (r9 != r11) goto L_0x0823
            r17 = 0
            r28 = r17
        L_0x0388:
            long r23 = r6 - r28
            int r9 = r1.read()     // Catch:{ all -> 0x081b }
            r11 = -1
            if (r9 == r11) goto L_0x080f
            if (r9 == 0) goto L_0x049b
            switch(r9) {
                case 247: goto L_0x0480;
                case 248: goto L_0x046c;
                case 249: goto L_0x0449;
                case 250: goto L_0x0430;
                case 251: goto L_0x0416;
                case 252: goto L_0x03f2;
                case 253: goto L_0x03d8;
                case 254: goto L_0x03be;
                case 255: goto L_0x03a7;
                default: goto L_0x0396;
            }     // Catch:{ all -> 0x081b }
        L_0x0396:
            r17 = r12
            r18 = r1
            r19 = r13
            r20 = r9
            r21 = r23
            defpackage.ammg.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x081b }
            r30 = r6
            goto L_0x0493
        L_0x03a7:
            long r20 = r1.readLong()     // Catch:{ all -> 0x081b }
            int r9 = r1.readInt()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r2
            r19 = r13
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            r30 = r6
            goto L_0x0493
        L_0x03be:
            int r9 = r1.readInt()     // Catch:{ all -> 0x081b }
            r30 = r6
            long r6 = (long) r9     // Catch:{ all -> 0x081b }
            int r9 = r1.readInt()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x03d8:
            r30 = r6
            int r6 = r1.readInt()     // Catch:{ all -> 0x081b }
            long r6 = (long) r6     // Catch:{ all -> 0x081b }
            int r9 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x03f2:
            r30 = r6
            int r6 = r1.readInt()     // Catch:{ all -> 0x081b }
            long r6 = (long) r6     // Catch:{ all -> 0x081b }
            int r9 = r1.read()     // Catch:{ all -> 0x081b }
            if (r9 == r11) goto L_0x040e
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x040e:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x081b }
            java.lang.String r6 = "Unexpected end of patch"
            r1.<init>(r6)     // Catch:{ all -> 0x081b }
            throw r1     // Catch:{ all -> 0x081b }
        L_0x0416:
            r30 = r6
            int r6 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            long r6 = (long) r6     // Catch:{ all -> 0x081b }
            int r9 = r1.readInt()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x0430:
            r30 = r6
            int r6 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            long r6 = (long) r6     // Catch:{ all -> 0x081b }
            int r9 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x0449:
            r30 = r6
            int r6 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            long r6 = (long) r6     // Catch:{ all -> 0x081b }
            int r9 = r1.read()     // Catch:{ all -> 0x081b }
            if (r9 == r11) goto L_0x0464
            r17 = r12
            r18 = r2
            r19 = r13
            r20 = r6
            r22 = r9
            defpackage.ammg.a(r17, r18, r19, r20, r22, r23)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x0464:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x081b }
            java.lang.String r6 = "Unexpected end of patch"
            r1.<init>(r6)     // Catch:{ all -> 0x081b }
            throw r1     // Catch:{ all -> 0x081b }
        L_0x046c:
            r30 = r6
            int r9 = r1.readInt()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r1
            r19 = r13
            r20 = r9
            r21 = r23
            defpackage.ammg.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x081b }
            goto L_0x0493
        L_0x0480:
            r30 = r6
            int r9 = r1.readUnsignedShort()     // Catch:{ all -> 0x081b }
            r17 = r12
            r18 = r1
            r19 = r13
            r20 = r9
            r21 = r23
            defpackage.ammg.a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x081b }
        L_0x0493:
            long r6 = (long) r9
            long r28 = r28 + r6
            r6 = r30
            r11 = 4
            goto L_0x0388
        L_0x049b:
            r13.flush()     // Catch:{ all -> 0x0840 }
            r2.close()     // Catch:{ amme -> 0x080b, IOException -> 0x0807, Exception -> 0x0802, all -> 0x0869 }
        L_0x04a1:
            java.security.MessageDigest r1 = r13.a     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            byte[] r1 = r1.digest()     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            cqv r2 = new cqv     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            r6 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r6)     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            long r6 = r13.b     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            r2.<init>(r1, r6)     // Catch:{ cqu -> 0x07fd, all -> 0x0869 }
            r1 = r2
        L_0x04b5:
            a((java.io.Closeable) r13)     // Catch:{ all -> 0x07f8 }
            a((java.io.Closeable) r4)     // Catch:{ all -> 0x07f8 }
            a((java.io.Closeable) r5)     // Catch:{ all -> 0x07f8 }
            java.lang.String r2 = r8.a     // Catch:{ all -> 0x07f8 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x07f8 }
            int r4 = r4.length()     // Catch:{ all -> 0x07f8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x07f8 }
            int r4 = r4 + 21
            r5.<init>(r4)     // Catch:{ all -> 0x07f8 }
            java.lang.String r4 = "Downloaded module '"
            r5.append(r4)     // Catch:{ all -> 0x07f8 }
            r5.append(r2)     // Catch:{ all -> 0x07f8 }
            java.lang.String r2 = "' "
            r5.append(r2)     // Catch:{ all -> 0x07f8 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x07f8 }
            long r4 = r1.a     // Catch:{ all -> 0x07f8 }
            long r6 = r8.d     // Catch:{ all -> 0x07f8 }
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0673
            java.lang.String r4 = r1.a()     // Catch:{ all -> 0x07f8 }
            java.lang.String r5 = r8.e     // Catch:{ all -> 0x07f8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x07f8 }
            if (r4 != 0) goto L_0x04f8
            r7 = r32
            goto L_0x0675
        L_0x04f8:
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ bcu -> 0x0505, SecurityException -> 0x0503, IOException -> 0x0501 }
            java.security.cert.X509Certificate[][] r1 = defpackage.bcx.a((java.lang.String) r1)     // Catch:{ bcu -> 0x0505, SecurityException -> 0x0503, IOException -> 0x0501 }
            goto L_0x0507
        L_0x0501:
            r0 = move-exception
            goto L_0x0506
        L_0x0503:
            r0 = move-exception
            goto L_0x0506
        L_0x0505:
            r0 = move-exception
        L_0x0506:
            r1 = 0
        L_0x0507:
            if (r1 != 0) goto L_0x050e
            r7 = r32
            r6 = 0
            goto L_0x0644
        L_0x050e:
            int r2 = r1.length     // Catch:{ all -> 0x07f8 }
            if (r2 == 0) goto L_0x0641
            r2 = 0
            r4 = r1[r2]     // Catch:{ all -> 0x07f8 }
            int r2 = r4.length     // Catch:{ all -> 0x07f8 }
            if (r2 == 0) goto L_0x063d
            r7 = r32
            android.content.Context r2 = r7.d     // Catch:{ all -> 0x0b46 }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ all -> 0x0b46 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x052c }
            r5 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x052c }
            android.content.pm.Signature[] r2 = r2.signatures     // Catch:{ NameNotFoundException -> 0x052c }
            goto L_0x052e
        L_0x052c:
            r0 = move-exception
            r2 = 0
        L_0x052e:
            if (r2 == 0) goto L_0x0549
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0b46 }
            r4.<init>()     // Catch:{ all -> 0x0b46 }
            int r5 = r2.length     // Catch:{ all -> 0x0b46 }
            r6 = 0
        L_0x0537:
            if (r6 >= r5) goto L_0x0548
            r9 = r2[r6]     // Catch:{ all -> 0x0b46 }
            java.security.cert.X509Certificate r9 = defpackage.cqk.a(r9)     // Catch:{ all -> 0x0b46 }
            if (r9 != 0) goto L_0x0542
            goto L_0x0545
        L_0x0542:
            r4.add(r9)     // Catch:{ all -> 0x0b46 }
        L_0x0545:
            int r6 = r6 + 1
            goto L_0x0537
        L_0x0548:
            goto L_0x054a
        L_0x0549:
            r4 = 0
        L_0x054a:
            if (r4 != 0) goto L_0x054d
            goto L_0x057b
        L_0x054d:
            boolean r2 = r4.isEmpty()     // Catch:{ all -> 0x0b46 }
            if (r2 != 0) goto L_0x057b
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0b46 }
        L_0x0557:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0b46 }
            if (r4 == 0) goto L_0x060b
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0b46 }
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch:{ all -> 0x0b46 }
            r5 = 0
        L_0x0564:
            int r6 = r1.length     // Catch:{ all -> 0x0b46 }
            if (r5 >= r6) goto L_0x0575
            r6 = r1[r5]     // Catch:{ all -> 0x0b46 }
            r9 = 0
            r6 = r6[r9]     // Catch:{ all -> 0x0b46 }
            boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x0b46 }
            if (r6 != 0) goto L_0x0557
            int r5 = r5 + 1
            goto L_0x0564
        L_0x0575:
            java.lang.String r2 = "Module certificate could not be verified from the app certificates."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0b46 }
            goto L_0x0580
        L_0x057b:
            java.lang.String r2 = "No certificates found for app."
            android.util.Log.e(r3, r2)     // Catch:{ all -> 0x0b46 }
        L_0x0580:
            android.content.Context r2 = r7.d     // Catch:{ all -> 0x0b46 }
            android.content.res.AssetManager r4 = r2.getAssets()     // Catch:{ IOException -> 0x05cf }
            java.lang.String r5 = "split_certs"
            java.lang.String[] r4 = r4.list(r5)     // Catch:{ IOException -> 0x05cf }
            if (r4 != 0) goto L_0x058f
            goto L_0x05c8
        L_0x058f:
            int r5 = r4.length     // Catch:{ all -> 0x0b46 }
            if (r5 == 0) goto L_0x05c8
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0b46 }
            r13.<init>()     // Catch:{ all -> 0x0b46 }
            r6 = 0
        L_0x0598:
            if (r6 >= r5) goto L_0x05c7
            r9 = r4[r6]     // Catch:{ all -> 0x0b46 }
            java.lang.String r11 = ".pem"
            boolean r11 = r9.endsWith(r11)     // Catch:{ all -> 0x0b46 }
            if (r11 == 0) goto L_0x05c4
            java.lang.String r11 = "split_certs/"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0b46 }
            int r12 = r9.length()     // Catch:{ all -> 0x0b46 }
            if (r12 != 0) goto L_0x05b6
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0b46 }
            r9.<init>(r11)     // Catch:{ all -> 0x0b46 }
            goto L_0x05ba
        L_0x05b6:
            java.lang.String r9 = r11.concat(r9)     // Catch:{ all -> 0x0b46 }
        L_0x05ba:
            java.security.cert.X509Certificate r9 = defpackage.cqk.a(r2, r9)     // Catch:{ all -> 0x0b46 }
            if (r9 != 0) goto L_0x05c1
            goto L_0x05c4
        L_0x05c1:
            r13.add(r9)     // Catch:{ all -> 0x0b46 }
        L_0x05c4:
            int r6 = r6 + 1
            goto L_0x0598
        L_0x05c7:
            goto L_0x05d6
        L_0x05c8:
            java.lang.String r2 = "No split certificates could be read from the relevant assets folder."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0b46 }
            r13 = 0
            goto L_0x05d6
        L_0x05cf:
            r0 = move-exception
            java.lang.String r2 = "An IOException is encountered while accessing the split certificates folder."
            android.util.Log.i(r3, r2)     // Catch:{ all -> 0x0b46 }
            r13 = 0
        L_0x05d6:
            if (r13 != 0) goto L_0x05da
            r6 = 0
            goto L_0x0637
        L_0x05da:
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x0b46 }
            if (r2 != 0) goto L_0x0636
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0b46 }
        L_0x05e4:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0b46 }
            if (r4 != 0) goto L_0x05f1
            java.lang.String r1 = "No matching split signature could be found."
            android.util.Log.i(r3, r1)     // Catch:{ all -> 0x0b46 }
            r6 = 0
            goto L_0x0637
        L_0x05f1:
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0b46 }
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch:{ all -> 0x0b46 }
            r5 = 0
        L_0x05f8:
            int r6 = r1.length     // Catch:{ all -> 0x0b46 }
            if (r5 >= r6) goto L_0x0634
            r6 = r1[r5]     // Catch:{ all -> 0x0b46 }
            r9 = 0
            r6 = r6[r9]     // Catch:{ all -> 0x0b46 }
            boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x0b46 }
            if (r6 == 0) goto L_0x0630
            java.lang.String r1 = "A matching split signature is found for module certificate."
            android.util.Log.i(r3, r1)     // Catch:{ all -> 0x0b46 }
        L_0x060b:
            android.net.Uri r1 = r8.k     // Catch:{ all -> 0x0b46 }
            if (r1 == 0) goto L_0x061d
            long r5 = r10.length()     // Catch:{ all -> 0x0b46 }
            r1 = r32
            r2 = r33
            r3 = r14
            r1.a((defpackage.cpx) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0b46 }
            r6 = 0
            goto L_0x0629
        L_0x061d:
            android.net.Uri r1 = r8.h     // Catch:{ all -> 0x0b46 }
            if (r1 == 0) goto L_0x0628
            r1 = 10
            r6 = 0
            r7.a((int) r1, (int) r6)     // Catch:{ all -> 0x0b46 }
            goto L_0x0629
        L_0x0628:
            r6 = 0
        L_0x0629:
            r1 = 7
            r7.a((int) r1, (int) r6, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r9 = 2
            goto L_0x0b2e
        L_0x0630:
            r6 = 0
            int r5 = r5 + 1
            goto L_0x05f8
        L_0x0634:
            r6 = 0
            goto L_0x05e4
        L_0x0636:
            r6 = 0
        L_0x0637:
            java.lang.String r1 = "Signatures could not be verified."
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            goto L_0x0669
        L_0x063d:
            r7 = r32
            r6 = 0
            goto L_0x0644
        L_0x0641:
            r7 = r32
            r6 = 0
        L_0x0644:
            java.lang.String r1 = r8.a     // Catch:{ all -> 0x0b46 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b46 }
            int r2 = r2.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r2 = r2 + 35
            r4.<init>(r2)     // Catch:{ all -> 0x0b46 }
            java.lang.String r2 = "Downloaded module '"
            r4.append(r2)     // Catch:{ all -> 0x0b46 }
            r4.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = "' is not signed."
            r4.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
        L_0x0669:
            r1 = -1006(0xfffffffffffffc12, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r9 = 0
            goto L_0x0b2e
        L_0x0673:
            r7 = r32
        L_0x0675:
            long r4 = r1.a     // Catch:{ all -> 0x0b46 }
            long r11 = r8.d     // Catch:{ all -> 0x0b46 }
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x073a
            android.net.Uri r1 = r8.k     // Catch:{ all -> 0x0b46 }
            java.lang.String r6 = " vs "
            java.lang.String r9 = "has incorrect length ("
            if (r1 == 0) goto L_0x06c4
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            int r1 = r1.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r1 = r1 + 122
            r13.<init>(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = "Patched file "
            r13.append(r1)     // Catch:{ all -> 0x0b46 }
            r13.append(r2)     // Catch:{ all -> 0x0b46 }
            r13.append(r9)     // Catch:{ all -> 0x0b46 }
            r13.append(r4)     // Catch:{ all -> 0x0b46 }
            r13.append(r6)     // Catch:{ all -> 0x0b46 }
            r13.append(r11)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = "). Retrying to download compressed version."
            r13.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1017(0xfffffffffffffc07, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r1 = -1017(0xfffffffffffffc07, float:NaN)
            r2 = 13
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            goto L_0x07e7
        L_0x06c4:
            android.net.Uri r1 = r8.h     // Catch:{ all -> 0x0b46 }
            if (r1 == 0) goto L_0x0707
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            int r1 = r1.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r1 = r1 + 124
            r13.<init>(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = "Uncompressed "
            r13.append(r1)     // Catch:{ all -> 0x0b46 }
            r13.append(r2)     // Catch:{ all -> 0x0b46 }
            r13.append(r9)     // Catch:{ all -> 0x0b46 }
            r13.append(r4)     // Catch:{ all -> 0x0b46 }
            r13.append(r6)     // Catch:{ all -> 0x0b46 }
            r13.append(r11)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = "). Retrying to download uncompressed version."
            r13.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1010(0xfffffffffffffc0e, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r1 = -1010(0xfffffffffffffc0e, float:NaN)
            r2 = 10
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            goto L_0x07e7
        L_0x0707:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            int r1 = r1.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r1 = r1 + 67
            r13.<init>(r1)     // Catch:{ all -> 0x0b46 }
            r13.append(r2)     // Catch:{ all -> 0x0b46 }
            r13.append(r9)     // Catch:{ all -> 0x0b46 }
            r13.append(r4)     // Catch:{ all -> 0x0b46 }
            r13.append(r6)     // Catch:{ all -> 0x0b46 }
            r13.append(r11)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = ")"
            r13.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1003(0xfffffffffffffc15, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            goto L_0x07e7
        L_0x073a:
            android.net.Uri r4 = r8.k     // Catch:{ all -> 0x0b46 }
            if (r4 == 0) goto L_0x0785
            java.lang.String r2 = r8.e     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x0b46 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            int r4 = r4.length()     // Catch:{ all -> 0x0b46 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b46 }
            int r5 = r5.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r4 = r4 + 87
            int r4 = r4 + r5
            r6.<init>(r4)     // Catch:{ all -> 0x0b46 }
            java.lang.String r4 = "Expected sha256 for patched file is "
            r6.append(r4)     // Catch:{ all -> 0x0b46 }
            r6.append(r2)     // Catch:{ all -> 0x0b46 }
            java.lang.String r2 = " but got "
            r6.append(r2)     // Catch:{ all -> 0x0b46 }
            r6.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = ". Retrying to download compressed version."
            r6.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1018(0xfffffffffffffc06, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r2 = 13
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            goto L_0x07e7
        L_0x0785:
            android.net.Uri r4 = r8.h     // Catch:{ all -> 0x0b46 }
            if (r4 == 0) goto L_0x07d2
            java.lang.String r2 = r8.e     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r1.a()     // Catch:{ all -> 0x0b46 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            int r4 = r4.length()     // Catch:{ all -> 0x0b46 }
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b46 }
            int r5 = r5.length()     // Catch:{ all -> 0x0b46 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b46 }
            int r4 = r4 + 95
            int r4 = r4 + r5
            r6.<init>(r4)     // Catch:{ all -> 0x0b46 }
            java.lang.String r4 = "Expected sha256 for de-compressed file is "
            r6.append(r4)     // Catch:{ all -> 0x0b46 }
            r6.append(r2)     // Catch:{ all -> 0x0b46 }
            java.lang.String r2 = " but got "
            r6.append(r2)     // Catch:{ all -> 0x0b46 }
            r6.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = ". Retrying to download uncompressed version."
            r6.append(r1)     // Catch:{ all -> 0x0b46 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1007(0xfffffffffffffc11, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            r1 = -1007(0xfffffffffffffc11, float:NaN)
            r2 = 10
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
            goto L_0x07e7
        L_0x07d2:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0b46 }
            java.lang.String r2 = "has incorrect sha256"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0b46 }
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b46 }
            r1 = -1005(0xfffffffffffffc13, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b46 }
        L_0x07e7:
            android.net.Uri r1 = r8.k     // Catch:{ all -> 0x0b46 }
            if (r1 != 0) goto L_0x07f5
            android.net.Uri r1 = r8.h     // Catch:{ all -> 0x0b46 }
            if (r1 == 0) goto L_0x07f2
            r9 = 3
            goto L_0x0b2e
        L_0x07f2:
            r9 = 1
            goto L_0x0b2e
        L_0x07f5:
            r9 = 4
            goto L_0x0b2e
        L_0x07f8:
            r0 = move-exception
            r7 = r32
            goto L_0x0b47
        L_0x07fd:
            r0 = move-exception
            r7 = r32
            goto L_0x0951
        L_0x0802:
            r0 = move-exception
            r7 = r32
            goto L_0x088a
        L_0x0807:
            r0 = move-exception
            r7 = r32
            goto L_0x085f
        L_0x080b:
            r0 = move-exception
            r7 = r32
            goto L_0x0864
        L_0x080f:
            r7 = r32
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0819 }
            java.lang.String r6 = "Patch file overrun"
            r1.<init>(r6)     // Catch:{ all -> 0x0819 }
            throw r1     // Catch:{ all -> 0x0819 }
        L_0x0819:
            r0 = move-exception
            goto L_0x081e
        L_0x081b:
            r0 = move-exception
            r7 = r32
        L_0x081e:
            r1 = r0
            r13.flush()     // Catch:{ all -> 0x083e }
            throw r1     // Catch:{ all -> 0x083e }
        L_0x0823:
            r7 = r32
            amme r1 = new amme     // Catch:{ all -> 0x083e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x083e }
            r11 = 30
            r6.<init>(r11)     // Catch:{ all -> 0x083e }
            java.lang.String r11 = "Unexpected version="
            r6.append(r11)     // Catch:{ all -> 0x083e }
            r6.append(r9)     // Catch:{ all -> 0x083e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x083e }
            r1.<init>(r6)     // Catch:{ all -> 0x083e }
            throw r1     // Catch:{ all -> 0x083e }
        L_0x083e:
            r0 = move-exception
            goto L_0x0851
        L_0x0840:
            r0 = move-exception
            r7 = r32
            goto L_0x0851
        L_0x0844:
            r0 = move-exception
            r7 = r32
            r27 = r1
            goto L_0x0851
        L_0x084a:
            r0 = move-exception
            r7 = r32
            r27 = r1
            r26 = r9
        L_0x0851:
            r1 = r0
            r2.close()     // Catch:{ all -> 0x0856 }
            goto L_0x085b
        L_0x0856:
            r0 = move-exception
            r2 = r0
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ amme -> 0x0863, IOException -> 0x085e, Exception -> 0x085c }
        L_0x085b:
            throw r1     // Catch:{ amme -> 0x0863, IOException -> 0x085e, Exception -> 0x085c }
        L_0x085c:
            r0 = move-exception
            goto L_0x088a
        L_0x085e:
            r0 = move-exception
        L_0x085f:
            r2 = r27
            goto L_0x08c5
        L_0x0863:
            r0 = move-exception
        L_0x0864:
            r1 = r0
            r2 = r27
            goto L_0x08ff
        L_0x0869:
            r0 = move-exception
            r7 = r32
            goto L_0x0ad8
        L_0x086e:
            r0 = move-exception
            r7 = r32
            goto L_0x0886
        L_0x0872:
            r0 = move-exception
            r7 = r32
            goto L_0x087b
        L_0x0876:
            r0 = move-exception
            r7 = r32
            goto L_0x0880
        L_0x087a:
            r0 = move-exception
        L_0x087b:
            r26 = r9
            r2 = r1
            goto L_0x08c5
        L_0x087f:
            r0 = move-exception
        L_0x0880:
            r26 = r9
            r2 = r1
            goto L_0x08fe
        L_0x0885:
            r0 = move-exception
        L_0x0886:
            r27 = r1
            r26 = r9
        L_0x088a:
            java.lang.String r1 = r8.a     // Catch:{ cqu -> 0x0950 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ cqu -> 0x0950 }
            int r2 = r2.length()     // Catch:{ cqu -> 0x0950 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0950 }
            int r2 = r2 + 48
            r6.<init>(r2)     // Catch:{ cqu -> 0x0950 }
            r2 = r27
            r6.append(r2)     // Catch:{ cqu -> 0x0950 }
            r6.append(r1)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r1 = "' patch failed with a generic exception."
            r6.append(r1)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r1 = r6.toString()     // Catch:{ cqu -> 0x0950 }
            android.util.Log.e(r3, r1)     // Catch:{ cqu -> 0x0950 }
            r1 = -1016(0xfffffffffffffc08, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = -1016(0xfffffffffffffc08, float:NaN)
            r2 = 13
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = r26
            goto L_0x099a
        L_0x08c1:
            r0 = move-exception
        L_0x08c2:
            r2 = r1
            r26 = r9
        L_0x08c5:
            java.lang.String r1 = r8.a     // Catch:{ cqu -> 0x0950 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ cqu -> 0x0950 }
            int r6 = r6.length()     // Catch:{ cqu -> 0x0950 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0950 }
            int r6 = r6 + 44
            r9.<init>(r6)     // Catch:{ cqu -> 0x0950 }
            r9.append(r2)     // Catch:{ cqu -> 0x0950 }
            r9.append(r1)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r1 = "' patch failed with an IO-Exception."
            r9.append(r1)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r1 = r9.toString()     // Catch:{ cqu -> 0x0950 }
            android.util.Log.e(r3, r1)     // Catch:{ cqu -> 0x0950 }
            r1 = -1015(0xfffffffffffffc09, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = -1015(0xfffffffffffffc09, float:NaN)
            r2 = 13
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = r26
            goto L_0x099a
        L_0x08fa:
            r0 = move-exception
        L_0x08fb:
            r2 = r1
            r26 = r9
        L_0x08fe:
            r1 = r0
        L_0x08ff:
            java.lang.String r6 = r8.a     // Catch:{ cqu -> 0x0950 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ cqu -> 0x0950 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x0950 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0950 }
            int r9 = r9 + 35
            r11.<init>(r9)     // Catch:{ cqu -> 0x0950 }
            r11.append(r2)     // Catch:{ cqu -> 0x0950 }
            r11.append(r6)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r2 = "' patch content is invalid."
            r11.append(r2)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r2 = r11.toString()     // Catch:{ cqu -> 0x0950 }
            android.util.Log.e(r3, r2)     // Catch:{ cqu -> 0x0950 }
            java.lang.String r2 = "Error message: "
            java.lang.String r1 = r1.getMessage()     // Catch:{ cqu -> 0x0950 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ cqu -> 0x0950 }
            int r6 = r1.length()     // Catch:{ cqu -> 0x0950 }
            if (r6 != 0) goto L_0x0938
            java.lang.String r1 = new java.lang.String     // Catch:{ cqu -> 0x0950 }
            r1.<init>(r2)     // Catch:{ cqu -> 0x0950 }
            goto L_0x093c
        L_0x0938:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ cqu -> 0x0950 }
        L_0x093c:
            android.util.Log.e(r3, r1)     // Catch:{ cqu -> 0x0950 }
            r1 = -1014(0xfffffffffffffc0a, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = -1014(0xfffffffffffffc0a, float:NaN)
            r2 = 13
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0950 }
            r1 = r26
            goto L_0x099a
        L_0x0950:
            r0 = move-exception
        L_0x0951:
            r2 = r0
            r1 = r26
            goto L_0x0aa2
        L_0x0956:
            r26 = r9
            java.lang.String r1 = r8.a     // Catch:{ cqu -> 0x09c1 }
            java.lang.String r2 = r8.n     // Catch:{ cqu -> 0x09c1 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ cqu -> 0x09c1 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x09c1 }
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ cqu -> 0x09c1 }
            int r11 = r11.length()     // Catch:{ cqu -> 0x09c1 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x09c1 }
            int r9 = r9 + 90
            int r9 = r9 + r11
            r12.<init>(r9)     // Catch:{ cqu -> 0x09c1 }
            java.lang.String r9 = "Base file for the patch of module '"
            r12.append(r9)     // Catch:{ cqu -> 0x09c1 }
            r12.append(r1)     // Catch:{ cqu -> 0x09c1 }
            java.lang.String r1 = "' not found. Base version for the expected file was '"
            r12.append(r1)     // Catch:{ cqu -> 0x09c1 }
            r12.append(r2)     // Catch:{ cqu -> 0x09c1 }
            r1 = r26
            r12.append(r1)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r2 = r12.toString()     // Catch:{ cqu -> 0x0aa0 }
            android.util.Log.e(r3, r2)     // Catch:{ cqu -> 0x0aa0 }
            r2 = 8
            r7.a((int) r2, (int) r6, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            r2 = 13
            r7.a((int) r2, (int) r6, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
        L_0x099a:
            cqu r2 = new cqu     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r8.a     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x0aa0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0aa0 }
            r12 = 39
            int r9 = r9 + r12
            r11.<init>(r9)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = "Patch application failed for module '"
            r11.append(r9)     // Catch:{ cqu -> 0x0aa0 }
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            r11.append(r1)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r11.toString()     // Catch:{ cqu -> 0x0aa0 }
            r2.<init>(r6)     // Catch:{ cqu -> 0x0aa0 }
            throw r2     // Catch:{ cqu -> 0x0aa0 }
        L_0x09c1:
            r0 = move-exception
            r1 = r26
            goto L_0x0a68
        L_0x09c6:
            r0 = move-exception
            r1 = r9
            r2 = -1019(0xfffffffffffffc05, float:NaN)
            r6 = 8
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            r6 = 13
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            cqu r2 = new cqu     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r8.a     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x0aa0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9 + 58
            r11.<init>(r9)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = "The downloaded patch file for module '"
            r11.append(r9)     // Catch:{ cqu -> 0x0aa0 }
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = "' could not be read."
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r11.toString()     // Catch:{ cqu -> 0x0aa0 }
            r2.<init>(r6)     // Catch:{ cqu -> 0x0aa0 }
            throw r2     // Catch:{ cqu -> 0x0aa0 }
        L_0x09fc:
            r1 = r9
            r2 = 8
            r7.a((int) r2, (int) r6, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            r2 = 13
            r7.a((int) r2, (int) r6, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            cqu r2 = new cqu     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r8.a     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x0aa0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9 + 71
            r11.<init>(r9)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = "Patch base is not available for module '"
            r11.append(r9)     // Catch:{ cqu -> 0x0aa0 }
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = "'. Retrying compressed version."
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r11.toString()     // Catch:{ cqu -> 0x0aa0 }
            r2.<init>(r6)     // Catch:{ cqu -> 0x0aa0 }
            throw r2     // Catch:{ cqu -> 0x0aa0 }
        L_0x0a2f:
            r1 = r9
            r2 = -1018(0xfffffffffffffc06, float:NaN)
            r6 = 8
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ IOException -> 0x0a64 }
            r6 = 13
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ IOException -> 0x0a64 }
            cqu r2 = new cqu     // Catch:{ IOException -> 0x0a64 }
            java.lang.String r6 = r8.a     // Catch:{ IOException -> 0x0a64 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0a64 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x0a64 }
            int r9 = r9 + 66
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0a64 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x0a64 }
            java.lang.String r9 = "Size of downloaded patch file for module '"
            r11.append(r9)     // Catch:{ IOException -> 0x0a64 }
            r11.append(r6)     // Catch:{ IOException -> 0x0a64 }
            java.lang.String r6 = "' could not be verified."
            r11.append(r6)     // Catch:{ IOException -> 0x0a64 }
            java.lang.String r6 = r11.toString()     // Catch:{ IOException -> 0x0a64 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0a64 }
            throw r2     // Catch:{ IOException -> 0x0a64 }
        L_0x0a64:
            r0 = move-exception
            goto L_0x0a6c
        L_0x0a66:
            r0 = move-exception
            r1 = r9
        L_0x0a68:
            r2 = r0
            goto L_0x0aa2
        L_0x0a6a:
            r0 = move-exception
            r1 = r9
        L_0x0a6c:
            r2 = -1019(0xfffffffffffffc05, float:NaN)
            r6 = 8
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            r6 = 13
            r7.a((int) r6, (int) r2, (defpackage.cpx) r8)     // Catch:{ cqu -> 0x0aa0 }
            cqu r2 = new cqu     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r8.a     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9.length()     // Catch:{ cqu -> 0x0aa0 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ cqu -> 0x0aa0 }
            int r9 = r9 + 58
            r11.<init>(r9)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r9 = "The downloaded patch file for module '"
            r11.append(r9)     // Catch:{ cqu -> 0x0aa0 }
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = "' could not be read."
            r11.append(r6)     // Catch:{ cqu -> 0x0aa0 }
            java.lang.String r6 = r11.toString()     // Catch:{ cqu -> 0x0aa0 }
            r2.<init>(r6)     // Catch:{ cqu -> 0x0aa0 }
            throw r2     // Catch:{ cqu -> 0x0aa0 }
        L_0x0aa0:
            r0 = move-exception
            goto L_0x0a68
        L_0x0aa2:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0ad7 }
            android.util.Log.e(r3, r2)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r2 = r8.a     // Catch:{ all -> 0x0ad7 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0ad7 }
            int r6 = r6.length()     // Catch:{ all -> 0x0ad7 }
            int r6 = r6 + 45
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad7 }
            r8.<init>(r6)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r6 = "Requesting compressed download for module '"
            r8.append(r6)     // Catch:{ all -> 0x0ad7 }
            r8.append(r2)     // Catch:{ all -> 0x0ad7 }
            r8.append(r1)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x0ad7 }
            android.util.Log.i(r3, r1)     // Catch:{ all -> 0x0ad7 }
            a((java.io.Closeable) r13)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r4)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r5)     // Catch:{ all -> 0x0b46 }
            r9 = 4
            goto L_0x0b2e
        L_0x0ad7:
            r0 = move-exception
        L_0x0ad8:
            r1 = r0
            r25 = r4
            goto L_0x0b3c
        L_0x0add:
            r0 = move-exception
            r1 = r0
            r25 = r4
            r13 = 0
            goto L_0x0b3c
        L_0x0ae3:
            r0 = move-exception
            r1 = r0
            r13 = 0
            r25 = 0
            goto L_0x0b3c
        L_0x0ae9:
            r0 = move-exception
            r6 = 0
            goto L_0x0af9
        L_0x0aec:
            r0 = move-exception
            r6 = 0
            goto L_0x0b19
        L_0x0aef:
            r0 = move-exception
            r1 = r0
            r5 = 0
            r13 = 0
            r25 = 0
            goto L_0x0b3c
        L_0x0af6:
            r0 = move-exception
            r6 = 0
            r5 = 0
        L_0x0af9:
            java.lang.String r1 = "Cannot access downloaded file! Re-trying ingestion later."
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b10 }
            r1 = -1024(0xfffffffffffffc00, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b10 }
            r1 = 0
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x0b46 }
        L_0x0b0c:
            a((java.io.Closeable) r5)     // Catch:{ all -> 0x0b46 }
            goto L_0x0b2d
        L_0x0b10:
            r0 = move-exception
            r1 = r0
            r13 = 0
            r25 = 0
            goto L_0x0b3c
        L_0x0b16:
            r0 = move-exception
            r6 = 0
            r5 = 0
        L_0x0b19:
            java.lang.String r1 = "Downloaded file could not be found or copied! Re-trying ingestion later."
            android.util.Log.e(r3, r1)     // Catch:{ all -> 0x0b35 }
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            r2 = 8
            r7.a((int) r2, (int) r1, (defpackage.cpx) r8)     // Catch:{ all -> 0x0b35 }
            r1 = 0
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r1)     // Catch:{ all -> 0x0b46 }
            goto L_0x0b0c
        L_0x0b2d:
            r9 = 0
        L_0x0b2e:
            r1 = 2
            if (r9 == r1) goto L_0x0b34
            defpackage.cqs.a((java.io.File) r10)
        L_0x0b34:
            return r9
        L_0x0b35:
            r0 = move-exception
            r1 = 0
            r2 = r0
            r13 = r1
            r25 = r13
            r1 = r2
        L_0x0b3c:
            a((java.io.Closeable) r13)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r25)     // Catch:{ all -> 0x0b46 }
            a((java.io.Closeable) r5)     // Catch:{ all -> 0x0b46 }
            throw r1     // Catch:{ all -> 0x0b46 }
        L_0x0b46:
            r0 = move-exception
        L_0x0b47:
            r1 = r0
            defpackage.cqs.a((java.io.File) r10)
            goto L_0x0b4d
        L_0x0b4c:
            throw r1
        L_0x0b4d:
            goto L_0x0b4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.d(cpx):int");
    }

    private final synchronized void e() {
        cqr cqr;
        if (!this.h.isEmpty()) {
            cqd cqd = this.f;
            Context context = this.d;
            ArrayList<Bundle> arrayList = this.h;
            try {
                cqr = new cqr();
                cqn b2 = ((cqj) cqd).b(context, cqr);
                if (b2 != null) {
                    try {
                        for (Bundle a2 : arrayList) {
                            b2.a(context.getPackageName(), a2);
                        }
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(e2.getMessage());
                        Log.e("ZappPhoneskyConn", valueOf.length() == 0 ? new String("onModuleEvent() failed: ") : "onModuleEvent() failed: ".concat(valueOf));
                    }
                    cqj.a(context, cqr);
                }
            } catch (Exception e3) {
                Log.w("ZappPhoneskyConn", "Unable to send log events to phonesky.", e3);
            } catch (Throwable th) {
                cqj.a(context, cqr);
                throw th;
            }
            this.h.clear();
        }
    }

    private final int a(String str, String str2, boolean z) {
        ou b2 = b();
        if (b2 != null) {
            cpx cpx = null;
            for (int i2 = 0; i2 < b2.h; i2++) {
                cpx cpx2 = (cpx) b2.c(i2);
                if (cpx2.a.equals(str) && (str2 == null || cpx2.b.equals(str2))) {
                    if (cpx2.r != null) {
                        cpx = cpx2;
                    } else if (z) {
                        return c(cpx2);
                    }
                }
            }
            if (cpx != null) {
                return c(cpx);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized defpackage.cpx b(long r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r3 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x00ee }
            cqf r0 = r10.g     // Catch:{ all -> 0x00ee }
            android.content.SharedPreferences r1 = r0.b()     // Catch:{ all -> 0x00ee }
            r0 = 0
            java.lang.String r2 = r1.getString(r3, r0)     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x0018
            cpx r2 = defpackage.cpx.a(r2)     // Catch:{ all -> 0x00ee }
            r6 = r2
            goto L_0x0019
        L_0x0018:
            r6 = r0
        L_0x0019:
            if (r6 == 0) goto L_0x006a
            cqe r2 = r10.e     // Catch:{ all -> 0x00ee }
            r4 = 1
            long[] r5 = new long[r4]     // Catch:{ all -> 0x00ee }
            r7 = 0
            r5[r7] = r11     // Catch:{ all -> 0x00ee }
            java.util.Map r2 = r2.a((long[]) r5)     // Catch:{ all -> 0x00ee }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x00ee }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x00ee }
            r8 = r2
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00ee }
            if (r8 != 0) goto L_0x005d
            java.lang.String r11 = r6.a     // Catch:{ all -> 0x00ee }
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ee }
            int r12 = r12.length()     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            int r12 = r12 + 62
            r1.<init>(r12)     // Catch:{ all -> 0x00ee }
            java.lang.String r12 = "Failed to query DownloadMgr for completion status of module '"
            r1.append(r12)     // Catch:{ all -> 0x00ee }
            r1.append(r11)     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = "'"
            r1.append(r11)     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = "DynamicModuleDownloader"
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x00ee }
            monitor-exit(r10)
            return r0
        L_0x005d:
            int r2 = r8.intValue()     // Catch:{ all -> 0x00ee }
            r5 = 8
            r9 = 3
            if (r2 == r5) goto L_0x0076
            r5 = 16
            if (r2 == r5) goto L_0x006c
        L_0x006a:
            monitor-exit(r10)
            return r0
        L_0x006c:
            r2 = 5
            int r5 = r8.intValue()     // Catch:{ all -> 0x00ee }
            r10.a((int) r2, (int) r5, (defpackage.cpx) r6)     // Catch:{ all -> 0x00ee }
            r2 = 1
            goto L_0x007e
        L_0x0076:
            r10.a((int) r9, (int) r7, (defpackage.cpx) r6)     // Catch:{ all -> 0x00ee }
            int r2 = r10.d((defpackage.cpx) r6)     // Catch:{ all -> 0x00ee }
        L_0x007e:
            if (r2 == 0) goto L_0x00e9
            if (r2 == r4) goto L_0x00c8
            r5 = 2
            if (r2 == r5) goto L_0x00a4
            if (r2 == r9) goto L_0x0094
            r6.b()     // Catch:{ all -> 0x00ee }
            r10.e(r6)     // Catch:{ all -> 0x00ee }
            r0 = r10
            r2 = r6
            r4 = r11
            r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x00ee }
            goto L_0x00de
        L_0x0094:
            r6.a()     // Catch:{ all -> 0x00ee }
            r6.b()     // Catch:{ all -> 0x00ee }
            r10.e(r6)     // Catch:{ all -> 0x00ee }
            r0 = r10
            r2 = r6
            r4 = r11
            r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x00ee }
            goto L_0x00de
        L_0x00a4:
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x00ee }
            r1.remove(r3)     // Catch:{ all -> 0x00ee }
            r6.r = r0     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r6.c()     // Catch:{ all -> 0x00ee }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x00ee }
            r1.putString(r0, r2)     // Catch:{ all -> 0x00ee }
            boolean r0 = r1.commit()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00de
            cqe r0 = r10.e     // Catch:{ all -> 0x00ee }
            long[] r1 = new long[r4]     // Catch:{ all -> 0x00ee }
            r1[r7] = r11     // Catch:{ all -> 0x00ee }
            r0.b(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x00de
        L_0x00c8:
            android.content.SharedPreferences$Editor r0 = r1.edit()     // Catch:{ all -> 0x00ee }
            r0.remove(r3)     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.commit()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00de
            cqe r0 = r10.e     // Catch:{ all -> 0x00ee }
            long[] r1 = new long[r4]     // Catch:{ all -> 0x00ee }
            r1[r7] = r11     // Catch:{ all -> 0x00ee }
            r0.b(r1)     // Catch:{ all -> 0x00ee }
        L_0x00de:
            int r11 = r8.intValue()     // Catch:{ all -> 0x00ee }
            r6.s = r11     // Catch:{ all -> 0x00ee }
            r10.e()     // Catch:{ all -> 0x00ee }
            monitor-exit(r10)
            return r6
        L_0x00e9:
            r10.e()     // Catch:{ all -> 0x00ee }
            monitor-exit(r10)
            return r0
        L_0x00ee:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.b(long):cpx");
    }

    public final Bundle c() {
        a();
        return new Bundle();
    }

    public final Bundle c(Bundle bundle) {
        cpx a2 = this.g.a(d(bundle), bundle.getString("version_code"));
        boolean z = false;
        if (a2 == null) {
            return a(false);
        }
        File b2 = this.g.b(a2);
        SharedPreferences.Editor edit = this.g.b().edit();
        edit.remove(cpx.a(a2.a, a2.b));
        boolean commit = edit.commit();
        if (!commit || !b2.exists() || b2.delete()) {
            z = commit;
        }
        return a(z);
    }

    static Uri a(cpx cpx) {
        Uri uri = cpx.k;
        if (uri != null || (uri = cpx.h) != null) {
            return uri;
        }
        if (cpx.t == null) {
            cpx.t = Uri.parse(cpx.c);
        }
        return cpx.t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = android.net.Uri.parse(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri a(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x001a
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r1 = r3.getScheme()
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "https"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x001a
            return r3
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.a(java.lang.String):android.net.Uri");
    }

    private final void e(cpx cpx) {
        cpx.r = Long.valueOf(this.e.a(a(cpx), cpx.a, cpx.b, cpx.f, cpx.u, cpx.v, cpx.w, b(cpx)));
        a(1, 0, cpx);
    }

    private static Bundle a(int i2, int i3, cpx cpx, long j, long j2) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        bundle.putInt("error_code", i3);
        if (j != 0) {
            bundle.putLong("patch_size", j);
            bundle.putLong("apk_size", j2);
        }
        if (cpx != null) {
            bundle.putString("module_name", cpx.a);
            bundle.putString("module_version_code", cpx.b);
            long j3 = cpx.d;
            if (j3 > 0) {
                bundle.putLong("download_size", j3);
            }
        }
        return bundle;
    }

    private static Bundle a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("delete_successful", z);
        return bundle;
    }

    private static ou a(SharedPreferences sharedPreferences, ou ouVar) {
        String str;
        cpx cpx;
        Map<String, ?> all = sharedPreferences.getAll();
        ou ouVar2 = new ou(all.size());
        for (Map.Entry next : all.entrySet()) {
            Object value = next.getValue();
            cpx cpx2 = null;
            if (value instanceof String) {
                str = (String) value;
            } else {
                str = null;
            }
            if (str != null && (cpx2 = cpx.a(str)) == null) {
                try {
                    long parseLong = Long.parseLong((String) next.getKey());
                    if (ouVar != null) {
                        ouVar.put(Long.valueOf(parseLong), Boolean.TRUE);
                    }
                } catch (NumberFormatException e2) {
                }
            }
            if (!(cpx2 == null || (cpx = (cpx) ouVar2.put(cpx2.d(), cpx2)) == null)) {
                String str2 = cpx.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
                sb.append("Found two download requests for module '");
                sb.append(str2);
                sb.append("'");
                Log.e("DynamicModuleDownloader", sb.toString());
                Long l = cpx.r;
                if (!(l == null || ouVar == null)) {
                    ouVar.put(l, Boolean.TRUE);
                }
            }
        }
        return ouVar2;
    }

    private static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final synchronized void b(String str) {
        this.i.b.b(this.d, 1, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: cpy} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x07cf: MOVE  (r11v6 int) = (r27v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02c3 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c9 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ee A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0688 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x068e A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06cd A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06e3 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06e9 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0707 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07f0 A[Catch:{ all -> 0x02a6, all -> 0x0998 }, LOOP:11: B:303:0x07ec->B:306:0x07f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0802 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0871 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0872 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08d9 A[Catch:{ all -> 0x02a6, all -> 0x0998 }, LOOP:16: B:347:0x08d5->B:349:0x08d9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x08f3 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0928 A[Catch:{ all -> 0x02a6, all -> 0x0998 }] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x095b A[DONT_GENERATE] */
    private final synchronized boolean b(java.util.List r53, boolean r54) {
        /*
            r52 = this;
            r1 = r52
            r2 = r53
            monitor-enter(r52)
            cqe r3 = r1.e     // Catch:{ all -> 0x0998 }
            android.content.Context r4 = r1.d     // Catch:{ all -> 0x0998 }
            boolean r3 = r3.a((android.content.Context) r4)     // Catch:{ all -> 0x0998 }
            r4 = 5
            r5 = 0
            if (r3 == 0) goto L_0x098c
            hhj r3 = r1.i     // Catch:{ all -> 0x0998 }
            long r6 = r3.a     // Catch:{ all -> 0x0998 }
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x001c
            goto L_0x0065
        L_0x001c:
            android.content.Context r3 = r1.d     // Catch:{ all -> 0x0998 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r10 = "com.android.vending"
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r10, r5)     // Catch:{ Exception -> 0x0030 }
            if (r3 == 0) goto L_0x002e
            int r3 = r3.versionCode     // Catch:{ Exception -> 0x0030 }
            long r10 = (long) r3
            goto L_0x0032
        L_0x002e:
            r10 = r8
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r10 = r8
        L_0x0032:
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0065
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            r3 = 123(0x7b, float:1.72E-43)
            r2.<init>(r3)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = "Play Store version "
            r2.append(r3)     // Catch:{ all -> 0x0998 }
            r2.append(r10)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = " is too old. Wanted at least version "
            r2.append(r3)     // Catch:{ all -> 0x0998 }
            r2.append(r6)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = ". Aborting module download."
            r2.append(r3)     // Catch:{ all -> 0x0998 }
            r2.toString()     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0998 }
            r1.b((java.lang.String) r2)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            monitor-exit(r52)
            return r5
        L_0x0065:
            cqf r3 = r1.g     // Catch:{ all -> 0x0998 }
            java.io.File r3 = r3.a()     // Catch:{ all -> 0x0998 }
            if (r3 != 0) goto L_0x007e
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r3 = "Module download root is missing."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0998 }
            r2 = -1025(0xfffffffffffffbff, float:NaN)
            r1.a((int) r4, (int) r2)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            monitor-exit(r52)
            return r5
        L_0x007e:
            android.content.Context r6 = r1.d     // Catch:{ all -> 0x0998 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0998 }
            java.util.Set r7 = c     // Catch:{ all -> 0x0998 }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x0998 }
            if (r7 != 0) goto L_0x00ce
            android.content.Context r7 = r1.d     // Catch:{ all -> 0x0998 }
            java.lang.String r10 = "activity"
            java.lang.Object r7 = r7.getSystemService(r10)     // Catch:{ all -> 0x0998 }
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7     // Catch:{ all -> 0x0998 }
            java.util.List r7 = r7.getRunningAppProcesses()     // Catch:{ all -> 0x0998 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0998 }
        L_0x009e:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x0998 }
            if (r10 == 0) goto L_0x00cc
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x0998 }
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10     // Catch:{ all -> 0x0998 }
            int r11 = r10.importance     // Catch:{ all -> 0x0998 }
            r12 = 125(0x7d, float:1.75E-43)
            if (r11 > r12) goto L_0x009e
            java.lang.String r11 = r10.processName     // Catch:{ all -> 0x0998 }
            boolean r11 = r6.equals(r11)     // Catch:{ all -> 0x0998 }
            if (r11 == 0) goto L_0x00b9
            goto L_0x00ce
        L_0x00b9:
            r11 = 0
        L_0x00ba:
            java.lang.String[] r12 = r10.pkgList     // Catch:{ all -> 0x0998 }
            int r12 = r12.length     // Catch:{ all -> 0x0998 }
            if (r11 >= r12) goto L_0x009e
            java.lang.String[] r12 = r10.pkgList     // Catch:{ all -> 0x0998 }
            r12 = r12[r11]     // Catch:{ all -> 0x0998 }
            boolean r12 = r6.equals(r12)     // Catch:{ all -> 0x0998 }
            if (r12 != 0) goto L_0x00ce
            int r11 = r11 + 1
            goto L_0x00ba
        L_0x00cc:
            monitor-exit(r52)
            return r5
        L_0x00ce:
            ou r6 = new ou     // Catch:{ all -> 0x0998 }
            r6.<init>()     // Catch:{ all -> 0x0998 }
            cqf r7 = r1.g     // Catch:{ all -> 0x0998 }
            android.content.SharedPreferences r7 = r7.b()     // Catch:{ all -> 0x0998 }
            ou r10 = a((android.content.SharedPreferences) r7, (defpackage.ou) r6)     // Catch:{ all -> 0x0998 }
            int r11 = r10.h     // Catch:{ all -> 0x0998 }
            int r12 = r6.h     // Catch:{ all -> 0x0998 }
            int r11 = r11 + r12
            r12 = 0
            r15 = 0
        L_0x00e4:
            int r13 = r10.h     // Catch:{ all -> 0x0998 }
            if (r12 < r13) goto L_0x095e
            r1.a((defpackage.ou) r10)     // Catch:{ all -> 0x0998 }
            ou r12 = new ou     // Catch:{ all -> 0x0998 }
            int r13 = r10.h     // Catch:{ all -> 0x0998 }
            r12.<init>(r13)     // Catch:{ all -> 0x0998 }
            ou r13 = new ou     // Catch:{ all -> 0x0998 }
            int r5 = r53.size()     // Catch:{ all -> 0x0998 }
            r13.<init>(r5)     // Catch:{ all -> 0x0998 }
            ou r5 = new ou     // Catch:{ all -> 0x0998 }
            int r8 = r10.h     // Catch:{ all -> 0x0998 }
            r5.<init>(r8)     // Catch:{ all -> 0x0998 }
            r8 = 0
        L_0x0103:
            int r9 = r10.h     // Catch:{ all -> 0x0998 }
            if (r8 >= r9) goto L_0x0135
            java.lang.Object r9 = r10.c(r8)     // Catch:{ all -> 0x0998 }
            cpx r9 = (defpackage.cpx) r9     // Catch:{ all -> 0x0998 }
            java.lang.String r14 = r9.a     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = r9.b     // Catch:{ all -> 0x0998 }
            int r4 = r1.a((java.lang.String) r14, (java.lang.String) r4)     // Catch:{ all -> 0x0998 }
            r14 = 6
            if (r4 != r14) goto L_0x0131
            java.lang.String r4 = r9.a     // Catch:{ all -> 0x0998 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0998 }
            if (r4 == 0) goto L_0x012a
            java.lang.String r14 = r9.b     // Catch:{ all -> 0x0998 }
            int r4 = r4.compareTo(r14)     // Catch:{ all -> 0x0998 }
            if (r4 >= 0) goto L_0x0131
        L_0x012a:
            java.lang.String r4 = r9.a     // Catch:{ all -> 0x0998 }
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x0998 }
            r5.put(r4, r9)     // Catch:{ all -> 0x0998 }
        L_0x0131:
            int r8 = r8 + 1
            r4 = 5
            goto L_0x0103
        L_0x0135:
            ou r4 = new ou     // Catch:{ all -> 0x0998 }
            int r8 = r53.size()     // Catch:{ all -> 0x0998 }
            r4.<init>(r8)     // Catch:{ all -> 0x0998 }
            boolean r8 = r53.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r8 != 0) goto L_0x06f4
            ou r8 = new ou     // Catch:{ all -> 0x0998 }
            int r9 = r53.size()     // Catch:{ all -> 0x0998 }
            r8.<init>(r9)     // Catch:{ all -> 0x0998 }
            r9 = 0
        L_0x014e:
            int r14 = r53.size()     // Catch:{ all -> 0x0998 }
            if (r9 >= r14) goto L_0x01bf
            java.lang.Object r14 = r2.get(r9)     // Catch:{ all -> 0x0998 }
            cpy r14 = (defpackage.cpy) r14     // Catch:{ all -> 0x0998 }
            r19 = r13
            java.lang.String r13 = r14.a     // Catch:{ all -> 0x0998 }
            r20 = r15
            java.lang.String r15 = r14.b     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = defpackage.cpx.a(r13, r15)     // Catch:{ all -> 0x0998 }
            java.lang.Object r13 = r8.put(r13, r14)     // Catch:{ all -> 0x0998 }
            cpy r13 = (defpackage.cpy) r13     // Catch:{ all -> 0x0998 }
            if (r13 != 0) goto L_0x016f
            goto L_0x01b8
        L_0x016f:
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0998 }
            if (r13 != 0) goto L_0x01b8
            java.lang.String r4 = r14.a     // Catch:{ all -> 0x0998 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0998 }
            int r5 = r5.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r5 = r5 + 57
            r8.<init>(r5)     // Catch:{ all -> 0x0998 }
            java.lang.String r5 = "Ignoring malformed download request (duplicate module '"
            r8.append(r5)     // Catch:{ all -> 0x0998 }
            r8.append(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = "')"
            r8.append(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = "DynamicModuleDownloader"
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x0998 }
            r4 = -1026(0xfffffffffffffbfe, float:NaN)
            r5 = 5
            r1.a((int) r5, (int) r4)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            r26 = r3
            r28 = r6
            r25 = r7
            r30 = r10
            r27 = r11
            r29 = r12
            r9 = r19
            r4 = 0
            r23 = 0
            goto L_0x0705
        L_0x01b8:
            int r9 = r9 + 1
            r13 = r19
            r15 = r20
            goto L_0x014e
        L_0x01bf:
            r19 = r13
            r20 = r15
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0998 }
            r9.<init>()     // Catch:{ all -> 0x0998 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0998 }
            int r14 = r8.h     // Catch:{ all -> 0x0998 }
            r13.<init>(r14)     // Catch:{ all -> 0x0998 }
            r14 = 0
        L_0x01d0:
            int r15 = r8.h     // Catch:{ all -> 0x0998 }
            if (r14 >= r15) goto L_0x023c
            java.lang.Object r15 = r8.c(r14)     // Catch:{ all -> 0x0998 }
            cpy r15 = (defpackage.cpy) r15     // Catch:{ all -> 0x0998 }
            r25 = r7
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0998 }
            r7.<init>()     // Catch:{ all -> 0x0998 }
            r26 = r3
            java.lang.String r3 = r15.a     // Catch:{ all -> 0x0998 }
            r27 = r11
            java.lang.String r11 = "name"
            r7.putString(r11, r3)     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = r15.b     // Catch:{ all -> 0x0998 }
            if (r11 == 0) goto L_0x01f8
            r28 = r6
            java.lang.String r6 = "version_code"
            r7.putString(r6, r11)     // Catch:{ all -> 0x0998 }
            goto L_0x01fa
        L_0x01f8:
            r28 = r6
        L_0x01fa:
            boolean r6 = r5.containsKey(r3)     // Catch:{ all -> 0x0998 }
            if (r6 == 0) goto L_0x020c
            java.lang.String r6 = "existing_version_code"
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0998 }
            r7.putString(r6, r3)     // Catch:{ all -> 0x0998 }
            goto L_0x0220
        L_0x020c:
            java.lang.String r6 = r15.f     // Catch:{ all -> 0x0998 }
            if (r6 == 0) goto L_0x0220
            java.lang.String r11 = "existing_version_code"
            r7.putString(r11, r6)     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = r15.g     // Catch:{ all -> 0x0998 }
            if (r11 == 0) goto L_0x0220
            java.lang.String r3 = b((java.lang.String) r3, (java.lang.String) r6)     // Catch:{ all -> 0x0998 }
            r9.put(r3, r11)     // Catch:{ all -> 0x0998 }
        L_0x0220:
            java.lang.String r3 = "supported_compression_formats"
            java.util.ArrayList r6 = a     // Catch:{ all -> 0x0998 }
            r7.putIntegerArrayList(r3, r6)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = "supported_patch_formats"
            java.util.ArrayList r6 = b     // Catch:{ all -> 0x0998 }
            r7.putIntegerArrayList(r3, r6)     // Catch:{ all -> 0x0998 }
            r13.add(r7)     // Catch:{ all -> 0x0998 }
            int r14 = r14 + 1
            r7 = r25
            r3 = r26
            r11 = r27
            r6 = r28
            goto L_0x01d0
        L_0x023c:
            r26 = r3
            r28 = r6
            r25 = r7
            r27 = r11
            cqd r3 = r1.f     // Catch:{ all -> 0x0998 }
            android.content.Context r6 = r1.d     // Catch:{ all -> 0x0998 }
            cqr r7 = new cqr     // Catch:{ all -> 0x0998 }
            r7.<init>()     // Catch:{ all -> 0x0998 }
            r11 = r3
            cqj r11 = (defpackage.cqj) r11     // Catch:{ all -> 0x0998 }
            cqn r11 = r11.b(r6, r7)     // Catch:{ all -> 0x0998 }
            if (r11 == 0) goto L_0x02df
            java.util.concurrent.ArrayBlockingQueue r14 = new java.util.concurrent.ArrayBlockingQueue     // Catch:{ Exception -> 0x02a9 }
            r15 = 1
            r14.<init>(r15)     // Catch:{ Exception -> 0x02a9 }
            cqo r15 = new cqo     // Catch:{ Exception -> 0x02a9 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x02a9 }
            r29 = r12
            java.lang.String r12 = r6.getPackageName()     // Catch:{ Exception -> 0x02a2 }
            r30 = r10
            android.os.Parcel r10 = r11.aQ()     // Catch:{ Exception -> 0x02a0 }
            r10.writeString(r12)     // Catch:{ Exception -> 0x02a0 }
            r10.writeTypedList(r13)     // Catch:{ Exception -> 0x02a0 }
            defpackage.bhx.a((android.os.Parcel) r10, (android.os.IInterface) r15)     // Catch:{ Exception -> 0x02a0 }
            r12 = 2
            r11.c(r12, r10)     // Catch:{ Exception -> 0x029e }
            r10 = 90
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x02a0 }
            java.lang.Object r10 = r14.poll(r10, r12)     // Catch:{ Exception -> 0x02a0 }
            cqc r10 = (defpackage.cqc) r10     // Catch:{ Exception -> 0x02a0 }
            if (r10 != 0) goto L_0x029c
            java.lang.String r11 = "ZappPhoneskyConn"
            java.lang.String r12 = "Timed out waiting for zapp response"
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x0298 }
            r11 = r3
            cqj r11 = (defpackage.cqj) r11     // Catch:{ Exception -> 0x0298 }
            r12 = 2
            r13 = 0
            r11.a(r6, r12, r13)     // Catch:{ Exception -> 0x0296 }
            goto L_0x02d6
        L_0x0296:
            r0 = move-exception
            goto L_0x029a
        L_0x0298:
            r0 = move-exception
            r12 = 2
        L_0x029a:
            r11 = r0
            goto L_0x02b1
        L_0x029c:
            r12 = 2
            goto L_0x02d6
        L_0x029e:
            r0 = move-exception
            goto L_0x02af
        L_0x02a0:
            r0 = move-exception
            goto L_0x02ae
        L_0x02a2:
            r0 = move-exception
            r30 = r10
            goto L_0x02ae
        L_0x02a6:
            r0 = move-exception
            r2 = r0
            goto L_0x02db
        L_0x02a9:
            r0 = move-exception
            r30 = r10
            r29 = r12
        L_0x02ae:
            r12 = 2
        L_0x02af:
            r11 = r0
            r10 = 0
        L_0x02b1:
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x02a6 }
            java.lang.String r13 = "ZappPhoneskyConn"
            java.lang.String r14 = "resolveZappModules failed: "
            java.lang.String r15 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x02a6 }
            int r18 = r15.length()     // Catch:{ all -> 0x02a6 }
            if (r18 != 0) goto L_0x02c9
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x02a6 }
            r15.<init>(r14)     // Catch:{ all -> 0x02a6 }
            goto L_0x02cd
        L_0x02c9:
            java.lang.String r15 = r14.concat(r15)     // Catch:{ all -> 0x02a6 }
        L_0x02cd:
            android.util.Log.e(r13, r15)     // Catch:{ all -> 0x02a6 }
            cqj r3 = (defpackage.cqj) r3     // Catch:{ all -> 0x02a6 }
            r13 = 3
            r3.a(r6, r13, r11)     // Catch:{ all -> 0x02a6 }
        L_0x02d6:
            defpackage.cqj.a(r6, r7)     // Catch:{ all -> 0x0998 }
            r7 = 4
            goto L_0x02ec
        L_0x02db:
            defpackage.cqj.a(r6, r7)     // Catch:{ all -> 0x0998 }
            throw r2     // Catch:{ all -> 0x0998 }
        L_0x02df:
            r30 = r10
            r29 = r12
            r12 = 2
            cqj r3 = (defpackage.cqj) r3     // Catch:{ all -> 0x0998 }
            r7 = 4
            r10 = 0
            r3.a(r6, r7, r10)     // Catch:{ all -> 0x0998 }
            r10 = 0
        L_0x02ec:
            if (r10 == 0) goto L_0x0688
            int r3 = r10.a     // Catch:{ all -> 0x0998 }
            if (r3 != 0) goto L_0x0683
            java.util.List r3 = r10.b     // Catch:{ all -> 0x0998 }
            int r6 = r3.size()     // Catch:{ all -> 0x0998 }
            r10 = 0
        L_0x02f9:
            if (r10 >= r6) goto L_0x066c
            java.lang.Object r11 = r3.get(r10)     // Catch:{ all -> 0x0998 }
            android.os.Bundle r11 = (android.os.Bundle) r11     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = "name"
            java.lang.String r15 = r11.getString(r13)     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = "download_url"
            java.lang.String r13 = r11.getString(r13)     // Catch:{ all -> 0x0998 }
            java.lang.String r14 = "version_code"
            java.lang.String r14 = r11.getString(r14)     // Catch:{ all -> 0x0998 }
            if (r14 == 0) goto L_0x031b
            boolean r17 = r14.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r17 == 0) goto L_0x0325
        L_0x031b:
            java.lang.String r14 = "version"
            long r17 = r11.getLong(r14)     // Catch:{ all -> 0x0998 }
            java.lang.String r14 = java.lang.Long.toString(r17)     // Catch:{ all -> 0x0998 }
        L_0x0325:
            java.lang.String r7 = "size"
            r21 = r13
            r12 = -1
            long r31 = r11.getLong(r7, r12)     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = "hash_sha256"
            java.lang.String r7 = r11.getString(r7)     // Catch:{ all -> 0x0998 }
            if (r15 != 0) goto L_0x034b
            r33 = r3
            r3 = r4
            r48 = r5
            r34 = r6
            r49 = r9
            r36 = r10
            r2 = r15
            r9 = r19
            r7 = r20
            r23 = 0
            goto L_0x0632
        L_0x034b:
            if (r21 == 0) goto L_0x0620
            r12 = 0
            int r22 = (r31 > r12 ? 1 : (r31 == r12 ? 0 : -1))
            if (r22 <= 0) goto L_0x0620
            boolean r12 = r14.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r12 != 0) goto L_0x060d
            if (r7 == 0) goto L_0x060d
            android.net.Uri r12 = a((java.lang.String) r21)     // Catch:{ all -> 0x0998 }
            if (r12 != 0) goto L_0x039f
            int r7 = r15.length()     // Catch:{ all -> 0x0998 }
            int r11 = r21.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r7 = r7 + 41
            int r7 = r7 + r11
            r12.<init>(r7)     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = "Ignoring invalid Zapp URL for module '"
            r12.append(r7)     // Catch:{ all -> 0x0998 }
            r12.append(r15)     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = "': "
            r12.append(r7)     // Catch:{ all -> 0x0998 }
            r7 = r21
            r12.append(r7)     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = "DynamicModuleDownloader"
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.w(r7, r11)     // Catch:{ all -> 0x0998 }
            r33 = r3
            r3 = r4
            r48 = r5
            r34 = r6
            r49 = r9
            r36 = r10
            r9 = r19
            r7 = r20
            r23 = 0
            goto L_0x0657
        L_0x039f:
            java.lang.String r13 = "compressed_download_url"
            java.lang.String r13 = r11.getString(r13)     // Catch:{ all -> 0x0998 }
            android.net.Uri r13 = a((java.lang.String) r13)     // Catch:{ all -> 0x0998 }
            r33 = r3
            java.lang.String r3 = "compressed_download_size"
            long r21 = r11.getLong(r3)     // Catch:{ all -> 0x0998 }
            java.lang.Long r3 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0998 }
            r34 = r6
            java.lang.String r6 = "compression_format"
            int r6 = r11.getInt(r6)     // Catch:{ all -> 0x0998 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0998 }
            if (r13 != 0) goto L_0x03c8
            r3 = 0
            r6 = 0
            r35 = 0
            goto L_0x03eb
        L_0x03c8:
            long r21 = r3.longValue()     // Catch:{ all -> 0x0998 }
            r23 = 0
            int r35 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r35 != 0) goto L_0x03d7
            r3 = 0
            r6 = 0
            r35 = 0
            goto L_0x03eb
        L_0x03d7:
            r21 = r3
            java.util.ArrayList r3 = a     // Catch:{ all -> 0x0998 }
            boolean r3 = r3.contains(r6)     // Catch:{ all -> 0x0998 }
            if (r3 != 0) goto L_0x03e6
            r3 = 0
            r6 = 0
            r35 = 0
            goto L_0x03eb
        L_0x03e6:
            r35 = r6
            r3 = r13
            r6 = r21
        L_0x03eb:
            java.lang.String r13 = "patch_download_url"
            java.lang.String r13 = r11.getString(r13)     // Catch:{ all -> 0x0998 }
            android.net.Uri r13 = a((java.lang.String) r13)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "patch_size"
            long r21 = r11.getLong(r2)     // Catch:{ all -> 0x0998 }
            java.lang.Long r2 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0998 }
            r36 = r10
            java.lang.String r10 = "patch_format"
            int r10 = r11.getInt(r10)     // Catch:{ all -> 0x0998 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0998 }
            r37 = r4
            java.lang.String r4 = "patch_module_base_version"
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x0998 }
            r38 = r6
            java.lang.String r6 = "patch_module_base_signature"
            java.lang.String r6 = r11.getString(r6)     // Catch:{ all -> 0x0998 }
            r39 = r11
            java.lang.String r11 = b((java.lang.String) r15, (java.lang.String) r4)     // Catch:{ all -> 0x0998 }
            java.lang.Object r11 = r9.get(r11)     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0998 }
            if (r13 != 0) goto L_0x0436
            r2 = 0
            r10 = 0
            r23 = 0
            r41 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            goto L_0x0487
        L_0x0436:
            long r21 = r2.longValue()     // Catch:{ all -> 0x0998 }
            r23 = 0
            int r40 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r40 != 0) goto L_0x044b
            r2 = 0
            r10 = 0
            r41 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            goto L_0x0487
        L_0x044b:
            r21 = r2
            java.util.ArrayList r2 = b     // Catch:{ all -> 0x0998 }
            boolean r2 = r2.contains(r10)     // Catch:{ all -> 0x0998 }
            if (r2 != 0) goto L_0x0460
        L_0x0455:
            r2 = 0
            r10 = 0
            r41 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            goto L_0x0487
        L_0x0460:
            if (r4 != 0) goto L_0x0463
            goto L_0x0455
        L_0x0463:
            java.lang.Object r2 = r5.get(r15)     // Catch:{ all -> 0x0998 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0998 }
            if (r2 != 0) goto L_0x0470
            if (r11 != 0) goto L_0x0470
            goto L_0x047d
        L_0x0470:
            if (r6 == 0) goto L_0x047d
            r45 = r4
            r46 = r6
            r47 = r11
            r41 = r13
            r2 = r21
            goto L_0x0487
        L_0x047d:
            r2 = 0
            r10 = 0
            r41 = 0
            r45 = 0
            r46 = 0
            r47 = 0
        L_0x0487:
            java.lang.String r4 = defpackage.cqs.a((java.lang.String) r7)     // Catch:{ IllegalArgumentException -> 0x05df }
            int r6 = r8.h     // Catch:{ all -> 0x0998 }
            r7 = 0
        L_0x048e:
            if (r7 >= r6) goto L_0x04b5
            java.lang.Object r11 = r8.c(r7)     // Catch:{ all -> 0x0998 }
            r13 = r11
            cpy r13 = (defpackage.cpy) r13     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = r13.b     // Catch:{ all -> 0x0998 }
            r48 = r5
            java.lang.String r5 = r13.a     // Catch:{ all -> 0x0998 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0998 }
            if (r5 != 0) goto L_0x04a4
            goto L_0x04ad
        L_0x04a4:
            if (r11 == 0) goto L_0x04b2
            boolean r5 = r11.equals(r14)     // Catch:{ all -> 0x0998 }
            if (r5 == 0) goto L_0x04ad
            goto L_0x04b3
        L_0x04ad:
            int r7 = r7 + 1
            r5 = r48
            goto L_0x048e
        L_0x04b2:
        L_0x04b3:
            r5 = r13
            goto L_0x04b8
        L_0x04b5:
            r48 = r5
            r5 = 0
        L_0x04b8:
            if (r5 != 0) goto L_0x04f1
            int r2 = r15.length()     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0998 }
            int r3 = r3.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r2 = r2 + 50
            int r2 = r2 + r3
            r4.<init>(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "Ignoring Zapp module response for unknown module "
            r4.append(r2)     // Catch:{ all -> 0x0998 }
            r4.append(r15)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = ":"
            r4.append(r2)     // Catch:{ all -> 0x0998 }
            r4.append(r14)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.w(r2, r3)     // Catch:{ all -> 0x0998 }
            r49 = r9
            r9 = r19
            r7 = r20
            r3 = r37
            goto L_0x0657
        L_0x04f1:
            java.lang.String r6 = r5.b     // Catch:{ all -> 0x0998 }
            if (r6 != 0) goto L_0x04f6
            goto L_0x0546
        L_0x04f6:
            boolean r6 = r6.equals(r14)     // Catch:{ all -> 0x0998 }
            if (r6 != 0) goto L_0x0546
            java.lang.String r2 = r5.b     // Catch:{ all -> 0x0998 }
            int r3 = r15.length()     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0998 }
            int r4 = r4.length()     // Catch:{ all -> 0x0998 }
            java.lang.String r5 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0998 }
            int r5 = r5.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r3 = r3 + 56
            int r3 = r3 + r4
            int r3 = r3 + r5
            r6.<init>(r3)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = "Zapp module "
            r6.append(r3)     // Catch:{ all -> 0x0998 }
            r6.append(r15)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = " has incorrect version (expected "
            r6.append(r3)     // Catch:{ all -> 0x0998 }
            r6.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = ", offered "
            r6.append(r2)     // Catch:{ all -> 0x0998 }
            r6.append(r14)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = ")"
            r6.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0998 }
            r9 = r19
            r4 = 0
            goto L_0x0705
        L_0x0546:
            cpx r6 = new cpx     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = r5.a     // Catch:{ all -> 0x0998 }
            boolean r11 = r5.e     // Catch:{ all -> 0x0998 }
            android.content.Context r13 = r1.d     // Catch:{ all -> 0x0998 }
            int r22 = defpackage.cqa.a(r13)     // Catch:{ all -> 0x0998 }
            r49 = r9
            r9 = r19
            r13 = r6
            r50 = r14
            r14 = r7
            r51 = r15
            r7 = r20
            r15 = r50
            r16 = r12
            r17 = r31
            r19 = r4
            r21 = r11
            r13.<init>((java.lang.String) r14, (java.lang.String) r15, (android.net.Uri) r16, (long) r17, (java.lang.String) r19, (int) r20, (boolean) r21, (int) r22)     // Catch:{ all -> 0x0998 }
            if (r3 == 0) goto L_0x0578
            long r11 = r38.longValue()     // Catch:{ all -> 0x0998 }
            int r4 = r35.intValue()     // Catch:{ all -> 0x0998 }
            r6.a(r3, r11, r4)     // Catch:{ all -> 0x0998 }
        L_0x0578:
            if (r41 != 0) goto L_0x057b
            goto L_0x0588
        L_0x057b:
            long r42 = r2.longValue()     // Catch:{ all -> 0x0998 }
            int r44 = r10.intValue()     // Catch:{ all -> 0x0998 }
            r40 = r6
            r40.a(r41, r42, r44, r45, r46, r47)     // Catch:{ all -> 0x0998 }
        L_0x0588:
            java.lang.String r2 = "show_notification"
            r11 = r39
            boolean r2 = r11.getBoolean(r2)     // Catch:{ all -> 0x0998 }
            r6.u = r2     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = r5.c     // Catch:{ all -> 0x0998 }
            r6.v = r2     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = r5.d     // Catch:{ all -> 0x0998 }
            r6.w = r2     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = r5.b     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = defpackage.cpx.a(r2, r3)     // Catch:{ all -> 0x0998 }
            r3 = r37
            java.lang.Object r2 = r3.put(r2, r6)     // Catch:{ all -> 0x0998 }
            cpx r2 = (defpackage.cpx) r2     // Catch:{ all -> 0x0998 }
            if (r2 == 0) goto L_0x0657
            int r2 = r51.length()     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = java.lang.String.valueOf(r50)     // Catch:{ all -> 0x0998 }
            int r4 = r4.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r2 = r2 + 52
            int r2 = r2 + r4
            r5.<init>(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "Received duplicate Zapp module response for module "
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            r2 = r51
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = ":"
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            r14 = r50
            r5.append(r14)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0998 }
            goto L_0x0657
        L_0x05df:
            r0 = move-exception
            r48 = r5
            r49 = r9
            r2 = r15
            r9 = r19
            r7 = r20
            r3 = r37
            int r4 = r2.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r4 = r4 + 37
            r5.<init>(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = "Ignoring invalid SHA256 for module '"
            r5.append(r4)     // Catch:{ all -> 0x0998 }
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "'"
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.e(r2, r4)     // Catch:{ all -> 0x0998 }
            goto L_0x0657
        L_0x060d:
            r33 = r3
            r3 = r4
            r48 = r5
            r34 = r6
            r49 = r9
            r36 = r10
            r2 = r15
            r9 = r19
            r7 = r20
            r23 = 0
            goto L_0x0632
        L_0x0620:
            r33 = r3
            r3 = r4
            r48 = r5
            r34 = r6
            r49 = r9
            r36 = r10
            r2 = r15
            r9 = r19
            r7 = r20
            r23 = 0
        L_0x0632:
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0998 }
            int r4 = r4.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r4 = r4 + 46
            r5.<init>(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = "Ignoring malformed Zapp response for module '"
            r5.append(r4)     // Catch:{ all -> 0x0998 }
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "'"
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0998 }
            android.util.Log.w(r2, r4)     // Catch:{ all -> 0x0998 }
        L_0x0657:
            int r10 = r36 + 1
            r2 = r53
            r4 = r3
            r20 = r7
            r19 = r9
            r3 = r33
            r6 = r34
            r5 = r48
            r9 = r49
            r7 = 4
            r12 = 2
            goto L_0x02f9
        L_0x066c:
            r3 = r4
            r9 = r19
            r23 = 0
            int r2 = r3.h     // Catch:{ all -> 0x0998 }
            int r4 = r8.h     // Catch:{ all -> 0x0998 }
            if (r2 == r4) goto L_0x0681
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r3 = "Zapp module info missing, aborting download"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0998 }
            r4 = 0
            goto L_0x0705
        L_0x0681:
            goto L_0x0704
        L_0x0683:
            r9 = r19
            r23 = 0
            goto L_0x068c
        L_0x0688:
            r9 = r19
            r23 = 0
        L_0x068c:
            if (r10 == 0) goto L_0x06cd
            int r2 = r10.a     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            r4 = 11
            r3.<init>(r4)     // Catch:{ all -> 0x0998 }
            r3.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = r3.toString()     // Catch:{ all -> 0x0998 }
            android.os.Bundle r2 = r10.c     // Catch:{ all -> 0x0998 }
            if (r2 == 0) goto L_0x06d7
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0998 }
            android.os.Bundle r3 = r10.c     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = "error_code"
            int r3 = r3.getInt(r4)     // Catch:{ all -> 0x0998 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0998 }
            int r4 = r4.length()     // Catch:{ all -> 0x0998 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0998 }
            int r4 = r4 + 12
            r5.<init>(r4)     // Catch:{ all -> 0x0998 }
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            java.lang.String r2 = ","
            r5.append(r2)     // Catch:{ all -> 0x0998 }
            r5.append(r3)     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = r5.toString()     // Catch:{ all -> 0x0998 }
            goto L_0x06d7
        L_0x06cd:
            r2 = -1027(0xfffffffffffffbfd, float:NaN)
            r3 = 5
            r1.a((int) r3, (int) r2)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            r13 = 0
        L_0x06d7:
            java.lang.String r2 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0998 }
            java.lang.String r3 = "Zapp module request failed: "
            int r4 = r2.length()     // Catch:{ all -> 0x0998 }
            if (r4 != 0) goto L_0x06e9
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0998 }
            r2.<init>(r3)     // Catch:{ all -> 0x0998 }
            goto L_0x06ed
        L_0x06e9:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0998 }
        L_0x06ed:
            java.lang.String r3 = "DynamicModuleDownloader"
            android.util.Log.e(r3, r2)     // Catch:{ all -> 0x0998 }
            r4 = 0
            goto L_0x0705
        L_0x06f4:
            r26 = r3
            r3 = r4
            r28 = r6
            r25 = r7
            r30 = r10
            r27 = r11
            r29 = r12
            r9 = r13
            r23 = 0
        L_0x0704:
            r4 = r3
        L_0x0705:
            if (r4 == 0) goto L_0x095b
            int r2 = r53.size()     // Catch:{ all -> 0x0998 }
            r3 = 0
            r5 = 0
            r14 = 0
        L_0x070e:
            r6 = 8
            r7 = 16
            if (r3 >= r2) goto L_0x0785
            r8 = r53
            java.lang.Object r10 = r8.get(r3)     // Catch:{ all -> 0x0998 }
            cpy r10 = (defpackage.cpy) r10     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = r10.a     // Catch:{ all -> 0x0998 }
            java.lang.String r10 = r10.b     // Catch:{ all -> 0x0998 }
            java.lang.String r10 = defpackage.cpx.a(r11, r10)     // Catch:{ all -> 0x0998 }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x0998 }
            cpx r10 = (defpackage.cpx) r10     // Catch:{ all -> 0x0998 }
            java.lang.String r11 = r10.d()     // Catch:{ all -> 0x0998 }
            r13 = r30
            int r11 = r13.a((java.lang.Object) r11)     // Catch:{ all -> 0x0998 }
            if (r11 < 0) goto L_0x073d
            java.lang.Object r12 = r13.c(r11)     // Catch:{ all -> 0x0998 }
            cpx r12 = (defpackage.cpx) r12     // Catch:{ all -> 0x0998 }
            goto L_0x073e
        L_0x073d:
            r12 = 0
        L_0x073e:
            if (r12 != 0) goto L_0x0743
            r15 = r29
            goto L_0x0777
        L_0x0743:
            int r15 = r12.s     // Catch:{ all -> 0x0998 }
            if (r15 == r7) goto L_0x0775
            java.lang.String r7 = r10.b     // Catch:{ all -> 0x0998 }
            java.lang.String r15 = r12.b     // Catch:{ all -> 0x0998 }
            boolean r7 = r7.equals(r15)     // Catch:{ all -> 0x0998 }
            if (r7 == 0) goto L_0x0772
            android.content.Context r7 = r1.d     // Catch:{ all -> 0x0998 }
            int r7 = defpackage.cqa.a(r7)     // Catch:{ all -> 0x0998 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0998 }
            r12.g = r7     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = r12.d()     // Catch:{ all -> 0x0998 }
            r15 = r29
            r15.put(r7, r12)     // Catch:{ all -> 0x0998 }
            int r7 = r12.s     // Catch:{ all -> 0x0998 }
            if (r7 == r6) goto L_0x076b
            goto L_0x076d
        L_0x076b:
            int r5 = r5 + 1
        L_0x076d:
            r13.d(r11)     // Catch:{ all -> 0x0998 }
            r14 = 1
            goto L_0x077e
        L_0x0772:
            r15 = r29
            goto L_0x0777
        L_0x0775:
            r15 = r29
        L_0x0777:
            java.lang.String r6 = r10.d()     // Catch:{ all -> 0x0998 }
            r9.put(r6, r10)     // Catch:{ all -> 0x0998 }
        L_0x077e:
            int r3 = r3 + 1
            r30 = r13
            r29 = r15
            goto L_0x070e
        L_0x0785:
            r8 = r53
            r15 = r29
            r13 = r30
            if (r54 == 0) goto L_0x07ae
            r2 = 0
        L_0x078e:
            int r3 = r13.h     // Catch:{ all -> 0x0998 }
            if (r2 >= r3) goto L_0x07ab
            java.lang.Object r3 = r13.c(r2)     // Catch:{ all -> 0x0998 }
            cpx r3 = (defpackage.cpx) r3     // Catch:{ all -> 0x0998 }
            java.lang.Long r3 = r3.r     // Catch:{ all -> 0x0998 }
            if (r3 == 0) goto L_0x07a4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0998 }
            r10 = r28
            r10.put(r3, r4)     // Catch:{ all -> 0x0998 }
            goto L_0x07a6
        L_0x07a4:
            r10 = r28
        L_0x07a6:
            int r2 = r2 + 1
            r28 = r10
            goto L_0x078e
        L_0x07ab:
            r10 = r28
            goto L_0x07c9
        L_0x07ae:
            r10 = r28
            r2 = 0
        L_0x07b1:
            int r3 = r13.h     // Catch:{ all -> 0x0998 }
            if (r2 >= r3) goto L_0x07c9
            java.lang.Object r3 = r13.c(r2)     // Catch:{ all -> 0x0998 }
            cpx r3 = (defpackage.cpx) r3     // Catch:{ all -> 0x0998 }
            int r4 = r3.s     // Catch:{ all -> 0x0998 }
            if (r4 == r7) goto L_0x07c6
            java.lang.String r4 = r3.d()     // Catch:{ all -> 0x0998 }
            r15.put(r4, r3)     // Catch:{ all -> 0x0998 }
        L_0x07c6:
            int r2 = r2 + 1
            goto L_0x07b1
        L_0x07c9:
            if (r27 <= 0) goto L_0x07ea
            int r2 = r53.size()     // Catch:{ all -> 0x0998 }
            r11 = r27
            if (r2 != r11) goto L_0x07ea
            int r2 = r15.h     // Catch:{ all -> 0x0998 }
            if (r2 == r11) goto L_0x07da
            r2 = 1
            r3 = 0
            goto L_0x07ec
        L_0x07da:
            if (r5 != 0) goto L_0x07ea
            boolean r2 = r9.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r2 != 0) goto L_0x07e4
        L_0x07e2:
            r2 = 1
            goto L_0x07eb
        L_0x07e4:
            if (r14 == 0) goto L_0x07e7
            goto L_0x07e2
        L_0x07e7:
            monitor-exit(r52)
            r2 = 1
            return r2
        L_0x07ea:
            r2 = 1
        L_0x07eb:
            r3 = 0
        L_0x07ec:
            int r4 = r9.h     // Catch:{ all -> 0x0998 }
            if (r3 >= r4) goto L_0x0800
            java.lang.Object r4 = r9.c(r3)     // Catch:{ all -> 0x0998 }
            cpx r4 = (defpackage.cpx) r4     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = r4.d()     // Catch:{ all -> 0x0998 }
            r15.put(r7, r4)     // Catch:{ all -> 0x0998 }
            int r3 = r3 + 1
            goto L_0x07ec
        L_0x0800:
            if (r5 <= 0) goto L_0x086b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0998 }
            r3.<init>(r5)     // Catch:{ all -> 0x0998 }
            r4 = 0
        L_0x0808:
            int r5 = r15.h     // Catch:{ all -> 0x0998 }
            if (r4 >= r5) goto L_0x081d
            java.lang.Object r5 = r15.c(r4)     // Catch:{ all -> 0x0998 }
            cpx r5 = (defpackage.cpx) r5     // Catch:{ all -> 0x0998 }
            int r7 = r5.s     // Catch:{ all -> 0x0998 }
            if (r7 == r6) goto L_0x0817
            goto L_0x081a
        L_0x0817:
            r3.add(r5)     // Catch:{ all -> 0x0998 }
        L_0x081a:
            int r4 = r4 + 1
            goto L_0x0808
        L_0x081d:
            int r4 = r3.size()     // Catch:{ all -> 0x0998 }
            r5 = 0
        L_0x0822:
            if (r5 >= r4) goto L_0x086b
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x0998 }
            cpx r6 = (defpackage.cpx) r6     // Catch:{ all -> 0x0998 }
            int r7 = r1.d((defpackage.cpx) r6)     // Catch:{ all -> 0x0998 }
            if (r7 == r2) goto L_0x0856
            r8 = 2
            if (r7 == r8) goto L_0x0849
            r11 = 3
            if (r7 == r11) goto L_0x0840
            r12 = 4
            if (r7 == r12) goto L_0x083b
            r7 = 0
            goto L_0x0868
        L_0x083b:
            r6.b()     // Catch:{ all -> 0x0998 }
            r7 = 0
            goto L_0x085a
        L_0x0840:
            r12 = 4
            r6.b()     // Catch:{ all -> 0x0998 }
            r6.a()     // Catch:{ all -> 0x0998 }
            r7 = 0
            goto L_0x085a
        L_0x0849:
            r11 = 3
            r12 = 4
            java.lang.Long r7 = r6.r     // Catch:{ all -> 0x0998 }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0998 }
            r10.put(r7, r13)     // Catch:{ all -> 0x0998 }
            r7 = 0
            r6.r = r7     // Catch:{ all -> 0x0998 }
            goto L_0x0868
        L_0x0856:
            r7 = 0
            r8 = 2
            r11 = 3
            r12 = 4
        L_0x085a:
            java.lang.Long r13 = r6.r     // Catch:{ all -> 0x0998 }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0998 }
            r10.put(r13, r14)     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = r6.d()     // Catch:{ all -> 0x0998 }
            r9.put(r13, r6)     // Catch:{ all -> 0x0998 }
        L_0x0868:
            int r5 = r5 + 1
            goto L_0x0822
        L_0x086b:
            boolean r3 = r9.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r3 == 0) goto L_0x0872
            goto L_0x08cd
        L_0x0872:
            r3 = r23
            r5 = 0
        L_0x0875:
            int r6 = r9.h     // Catch:{ all -> 0x0998 }
            if (r5 >= r6) goto L_0x0885
            java.lang.Object r6 = r9.c(r5)     // Catch:{ all -> 0x0998 }
            cpx r6 = (defpackage.cpx) r6     // Catch:{ all -> 0x0998 }
            long r6 = r6.d     // Catch:{ all -> 0x0998 }
            long r3 = r3 + r6
            int r5 = r5 + 1
            goto L_0x0875
        L_0x0885:
            r5 = r26
            boolean r3 = a((java.io.File) r5, (long) r3)     // Catch:{ all -> 0x0998 }
            if (r3 == 0) goto L_0x0948
            r3 = 0
        L_0x088e:
            int r4 = r9.h     // Catch:{ all -> 0x0998 }
            if (r3 >= r4) goto L_0x08cd
            java.lang.Object r4 = r9.c(r3)     // Catch:{ all -> 0x0998 }
            cpx r4 = (defpackage.cpx) r4     // Catch:{ all -> 0x0998 }
            android.net.Uri r27 = a((defpackage.cpx) r4)     // Catch:{ all -> 0x0998 }
            cqe r5 = r1.e     // Catch:{ all -> 0x0998 }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0998 }
            java.lang.String r7 = r4.b     // Catch:{ all -> 0x0998 }
            boolean r8 = r4.f     // Catch:{ all -> 0x0998 }
            boolean r11 = r4.u     // Catch:{ all -> 0x0998 }
            java.lang.String r12 = r4.v     // Catch:{ all -> 0x0998 }
            java.lang.String r13 = r4.w     // Catch:{ all -> 0x0998 }
            int r34 = b((defpackage.cpx) r4)     // Catch:{ all -> 0x0998 }
            r26 = r5
            r28 = r6
            r29 = r7
            r30 = r8
            r31 = r11
            r32 = r12
            r33 = r13
            long r5 = r26.a(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0998 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0998 }
            r4.r = r5     // Catch:{ all -> 0x0998 }
            r5 = 0
            r1.a((int) r2, (int) r5, (defpackage.cpx) r4)     // Catch:{ all -> 0x0998 }
            int r3 = r3 + 1
            goto L_0x088e
        L_0x08cd:
            android.content.SharedPreferences$Editor r3 = r25.edit()     // Catch:{ all -> 0x0998 }
            r3.clear()     // Catch:{ all -> 0x0998 }
            r4 = 0
        L_0x08d5:
            int r5 = r15.h     // Catch:{ all -> 0x0998 }
            if (r4 >= r5) goto L_0x08ed
            java.lang.Object r5 = r15.c(r4)     // Catch:{ all -> 0x0998 }
            cpx r5 = (defpackage.cpx) r5     // Catch:{ all -> 0x0998 }
            java.lang.String r6 = r5.c()     // Catch:{ all -> 0x0998 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0998 }
            r3.putString(r6, r5)     // Catch:{ all -> 0x0998 }
            int r4 = r4 + 1
            goto L_0x08d5
        L_0x08ed:
            boolean r3 = r3.commit()     // Catch:{ all -> 0x0998 }
            if (r3 != 0) goto L_0x0922
            java.lang.String r3 = "DynamicModuleDownloader"
            java.lang.String r4 = "Failed to store updated downloads list, no new modules will be downloaded"
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x0998 }
            r3 = -1022(0xfffffffffffffc02, float:NaN)
            r4 = 5
            r1.a((int) r4, (int) r3)     // Catch:{ all -> 0x0998 }
            r10.clear()     // Catch:{ all -> 0x0998 }
            r3 = 0
        L_0x0904:
            int r4 = r9.h     // Catch:{ all -> 0x0998 }
            if (r3 >= r4) goto L_0x0922
            java.lang.Object r4 = r9.c(r3)     // Catch:{ all -> 0x0998 }
            cpx r4 = (defpackage.cpx) r4     // Catch:{ all -> 0x0998 }
            java.lang.Long r5 = r4.r     // Catch:{ all -> 0x0998 }
            if (r5 == 0) goto L_0x0914
            r14 = 1
            goto L_0x0915
        L_0x0914:
            r14 = 0
        L_0x0915:
            defpackage.cqq.a(r14)     // Catch:{ all -> 0x0998 }
            java.lang.Long r4 = r4.r     // Catch:{ all -> 0x0998 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0998 }
            r10.put(r4, r5)     // Catch:{ all -> 0x0998 }
            int r3 = r3 + 1
            goto L_0x0904
        L_0x0922:
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x0998 }
            if (r3 != 0) goto L_0x0943
            int r3 = r10.h     // Catch:{ all -> 0x0998 }
            long[] r4 = new long[r3]     // Catch:{ all -> 0x0998 }
            r5 = 0
        L_0x092d:
            if (r5 >= r3) goto L_0x093e
            java.lang.Object r6 = r10.b((int) r5)     // Catch:{ all -> 0x0998 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0998 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0998 }
            r4[r5] = r6     // Catch:{ all -> 0x0998 }
            int r5 = r5 + 1
            goto L_0x092d
        L_0x093e:
            cqe r3 = r1.e     // Catch:{ all -> 0x0998 }
            r3.b(r4)     // Catch:{ all -> 0x0998 }
        L_0x0943:
            r52.e()     // Catch:{ all -> 0x0998 }
            monitor-exit(r52)
            return r2
        L_0x0948:
            java.lang.String r2 = "DynamicModuleDownloader"
            java.lang.String r3 = "low disk"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0998 }
            r2 = -1021(0xfffffffffffffc03, float:NaN)
            r3 = 5
            r1.a((int) r3, (int) r2)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            monitor-exit(r52)
            r2 = 0
            return r2
        L_0x095b:
            monitor-exit(r52)
            r2 = 0
            return r2
        L_0x095e:
            r5 = r3
            r25 = r7
            r23 = r8
            r13 = r10
            r7 = r15
            r8 = r2
            r10 = r6
            r2 = 1
            java.lang.Object r3 = r13.c(r12)     // Catch:{ all -> 0x0998 }
            cpx r3 = (defpackage.cpx) r3     // Catch:{ all -> 0x0998 }
            int r3 = r3.q     // Catch:{ all -> 0x0998 }
            if (r3 < r7) goto L_0x097d
            java.lang.Object r3 = r13.c(r12)     // Catch:{ all -> 0x0998 }
            cpx r3 = (defpackage.cpx) r3     // Catch:{ all -> 0x0998 }
            int r3 = r3.q     // Catch:{ all -> 0x0998 }
            int r15 = r3 + 1
            goto L_0x097e
        L_0x097d:
            r15 = r7
        L_0x097e:
            int r12 = r12 + 1
            r3 = r5
            r2 = r8
            r6 = r10
            r10 = r13
            r8 = r23
            r7 = r25
            r4 = 5
            r5 = 0
            goto L_0x00e4
        L_0x098c:
            r2 = -1023(0xfffffffffffffc01, float:NaN)
            r3 = 5
            r1.a((int) r3, (int) r2)     // Catch:{ all -> 0x0998 }
            r52.e()     // Catch:{ all -> 0x0998 }
            monitor-exit(r52)
            r2 = 0
            return r2
        L_0x0998:
            r0 = move-exception
            r2 = r0
            monitor-exit(r52)
            goto L_0x099d
        L_0x099c:
            throw r2
        L_0x099d:
            goto L_0x099c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.b(java.util.List, boolean):boolean");
    }

    private final synchronized void a(int i2, int i3) {
        this.h.add(a(i2, i3, (cpx) null, 0, 0));
    }

    private final synchronized void a(int i2, int i3, cpx cpx) {
        this.h.add(a(i2, i3, cpx, 0, 0));
    }

    private final void a(SharedPreferences sharedPreferences, cpx cpx, String str, long j) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.putString(cpx.c(), cpx.toString());
        if (edit.commit()) {
            this.e.b(j);
        }
    }

    private final synchronized void a(cpx cpx, long j, long j2) {
        this.h.add(a(13, 0, cpx, j, j2));
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }

    private final void a(ou ouVar) {
        boolean z;
        ou ouVar2 = new ou(ouVar.h);
        for (int i2 = 0; i2 < ouVar.h; i2++) {
            cpx cpx = (cpx) ouVar.c(i2);
            Long l = cpx.r;
            if (l != null) {
                ouVar2.put(l, cpx);
                cpx.s = 16;
            } else {
                cpx.s = 0;
            }
        }
        if (!ouVar2.isEmpty()) {
            long[] jArr = new long[ouVar2.h];
            for (int i3 = 0; i3 < ouVar2.h; i3++) {
                jArr[i3] = ((Long) ouVar2.b(i3)).longValue();
            }
            for (Map.Entry entry : this.e.a(jArr).entrySet()) {
                cpx cpx2 = (cpx) ouVar2.remove(entry.getKey());
                if (cpx2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                cqq.a(z);
                int intValue = ((Integer) entry.getValue()).intValue();
                cpx2.s = intValue;
                if (intValue == 16) {
                    String valueOf = String.valueOf(cpx2.a);
                    Log.e("DynamicModuleDownloader", valueOf.length() == 0 ? new String("download status failed for ") : "download status failed for ".concat(valueOf));
                }
            }
        }
    }

    private static boolean a(File file, long j) {
        return file.getUsableSpace() >= j * 4;
    }

    public final Bundle a(long j) {
        cpx b2 = b(j);
        Bundle bundle = new Bundle();
        if (b2 != null) {
            bundle.putString("com.google.android.finsky.zapp.MODULE_NAME", b2.a);
            bundle.putString("com.google.android.finsky.zapp.MODULE_VERSION", b2.b);
            bundle.putInt("com.google.android.finsky.zapp.DOWNLOAD_STATUS", c(b2));
        }
        return bundle;
    }

    public final Bundle a(Bundle bundle) {
        String str;
        String str2;
        cpx cpx;
        String d2 = d(bundle);
        String string = bundle.getString("version_code");
        cpx a2 = this.g.a(d2, string);
        Integer num = null;
        if (bundle.getBoolean("ingest")) {
            cpx a3 = this.g.a(d2, string);
            ou b2 = b();
            if (b2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= b2.h) {
                        break;
                    }
                    cpx = (cpx) b2.c(i2);
                    if (cpx.a.equals(d2) && cpx.r != null && cpx.s == 8 && (string == null || cpx.b.equals(string))) {
                        a3 = b(cpx.r.longValue());
                    } else {
                        i2++;
                    }
                }
                a3 = b(cpx.r.longValue());
            }
            str = a3 != null ? this.g.a(a3) : null;
        } else {
            str = a2 != null ? this.g.a(a2) : null;
        }
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("file_path", str);
        }
        bundle2.putString("version_code", string);
        bundle2.putInt("module_status", a(d2, string));
        bundle2.putInt("pending_module_status", a(d2, string, false));
        cpx a4 = this.g.a(d2, string);
        if (a4 != null && this.g.b(a4).exists()) {
            num = a4.g;
        }
        if (num != null) {
            bundle2.putInt("apk_version_at_which_offered", num.intValue());
        }
        if (!(a2 == null || (str2 = a2.e) == null)) {
            bundle2.putString("hash_sha256", str2);
        }
        return bundle2;
    }

    @Deprecated
    public final Bundle a(List list) {
        return a(list, false);
    }

    public final Bundle a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            arrayList.add(new cpy(d(bundle), bundle.getString("version_code"), bundle.getString("notification_title"), bundle.getString("notification_description"), bundle.getBoolean("metered"), bundle.getString("existing_version_code"), bundle.getString("patch_module_base_external_path")));
        }
        boolean b2 = b((List) arrayList, z);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("download_successful", b2);
        return bundle2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[SYNTHETIC, Splitter:B:29:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            ou r0 = new ou     // Catch:{ all -> 0x0097 }
            r0.<init>()     // Catch:{ all -> 0x0097 }
            cqf r1 = r8.g     // Catch:{ all -> 0x0097 }
            android.content.SharedPreferences r1 = r1.b()     // Catch:{ all -> 0x0097 }
            ou r2 = a((android.content.SharedPreferences) r1, (defpackage.ou) r0)     // Catch:{ all -> 0x0097 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0097 }
            r4 = 0
            if (r3 == 0) goto L_0x0021
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x001f
            r3 = 0
            goto L_0x0022
        L_0x001f:
            monitor-exit(r8)
            return
        L_0x0021:
            r3 = 0
        L_0x0022:
            int r5 = r2.h     // Catch:{ all -> 0x0097 }
            if (r3 >= r5) goto L_0x003c
            java.lang.Object r5 = r2.c(r3)     // Catch:{ all -> 0x0097 }
            cpx r5 = (defpackage.cpx) r5     // Catch:{ all -> 0x0097 }
            java.lang.Long r6 = r5.r     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0035
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0097 }
            r0.put(r6, r7)     // Catch:{ all -> 0x0097 }
        L_0x0035:
            r6 = 4
            r8.a((int) r6, (int) r4, (defpackage.cpx) r5)     // Catch:{ all -> 0x0097 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x003c:
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0097 }
            r1.clear()     // Catch:{ all -> 0x0097 }
            r3 = 0
        L_0x0044:
            int r5 = r2.h     // Catch:{ all -> 0x0097 }
            if (r3 >= r5) goto L_0x0064
            java.lang.Object r5 = r2.c(r3)     // Catch:{ all -> 0x0097 }
            cpx r5 = (defpackage.cpx) r5     // Catch:{ all -> 0x0097 }
            java.lang.Long r6 = r5.r     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.containsKey(r6)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0061
            java.lang.String r6 = r5.c()     // Catch:{ all -> 0x0097 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0097 }
            r1.putString(r6, r5)     // Catch:{ all -> 0x0097 }
        L_0x0061:
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0064:
            boolean r1 = r1.commit()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0073
            java.lang.String r0 = "DynamicModuleDownloader"
            java.lang.String r1 = "Failed to store updated downloads list, not canceling downloads"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)
            return
        L_0x0073:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x0093
            int r1 = r0.h     // Catch:{ all -> 0x0097 }
            long[] r2 = new long[r1]     // Catch:{ all -> 0x0097 }
        L_0x007d:
            if (r4 >= r1) goto L_0x008e
            java.lang.Object r3 = r0.b((int) r4)     // Catch:{ all -> 0x0097 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0097 }
            long r5 = r3.longValue()     // Catch:{ all -> 0x0097 }
            r2[r4] = r5     // Catch:{ all -> 0x0097 }
            int r4 = r4 + 1
            goto L_0x007d
        L_0x008e:
            cqe r0 = r8.e     // Catch:{ all -> 0x0097 }
            r0.b(r2)     // Catch:{ all -> 0x0097 }
        L_0x0093:
            r8.e()     // Catch:{ all -> 0x0097 }
            goto L_0x001f
        L_0x0097:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x009b
        L_0x009a:
            throw r0
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.a():void");
    }

    public final Bundle b(Bundle bundle) {
        cpx a2;
        String d2 = d(bundle);
        SharedPreferences b2 = this.g.b();
        Map<String, ?> all = b2.getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith("_") && next.contains(":") && (a2 = cpx.a(b2.getString(next, (String) null))) != null && d2.equals(a2.a)) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((cpx) arrayList.get(i2)).b);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("version_codes", arrayList2);
        return bundle2;
    }

    private static String d(Bundle bundle) {
        String string = bundle.getString("name");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Bundle must contain module name!");
    }

    public final Bundle d() {
        File[] listFiles;
        int i2;
        Bundle bundle = new Bundle();
        ou a2 = a(this.g.b(), (ou) null);
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (int i3 = 0; i3 < a2.h; i3++) {
            File b2 = this.g.b((cpx) a2.c(i3));
            if (b2.exists()) {
                hashMap.put(b2.getAbsolutePath(), (cpx) a2.c(i3));
            }
        }
        File a3 = this.g.a();
        if (!(a3 == null || (listFiles = a3.listFiles()) == null)) {
            boolean z2 = true;
            for (int i4 = 0; i4 < listFiles.length; i4++) {
                if (!hashMap.containsKey(listFiles[i4].getAbsolutePath())) {
                    boolean delete = listFiles[i4].delete();
                    z2 &= delete;
                    if (!delete) {
                        i2 = -1011;
                    } else {
                        i2 = 0;
                    }
                    a(9, i2);
                }
            }
            e();
            z = z2;
        }
        bundle.putBoolean("cleanup_successful", z);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final ou b() {
        ou a2 = a(this.g.b(), (ou) null);
        a(a2);
        return a2;
    }
}
