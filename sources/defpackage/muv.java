package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.R;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: muv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muv {
    public ErrorReport a;
    public muu b;
    public boolean c;
    public boolean d;
    private final Context e;

    public muv(Context context, ErrorReport errorReport, Screenshot screenshot) {
        this.e = context;
        this.a = errorReport;
        muu muu = new muu();
        this.b = muu;
        if (screenshot != null) {
            muu.c = screenshot;
            Screenshot.a(this.a, (Screenshot) null);
        }
        c();
    }

    private static String a(Pair pair) {
        if (pair == null) {
            return null;
        }
        String valueOf = String.valueOf(pair.first);
        String str = (String) pair.second;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(str).length());
        sb.append("VersionCode:");
        sb.append(valueOf);
        sb.append(";VersionName:");
        sb.append(str);
        return sb.toString();
    }

    private final Pair b(String str) {
        try {
            PackageInfo packageInfo = this.e.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return Pair.create(Integer.valueOf(packageInfo.versionCode), packageInfo.versionName);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0256 A[SYNTHETIC, Splitter:B:108:0x0256] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0260 A[SYNTHETIC, Splitter:B:115:0x0260] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a6 A[Catch:{ all -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2 A[Catch:{ all -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c6 A[SYNTHETIC, Splitter:B:78:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d1 A[SYNTHETIC, Splitter:B:84:0x01d1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            android.os.Bundle r0 = r0.D
            r2 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0019
            muu r0 = r1.b
            com.google.android.gms.feedback.ErrorReport r3 = r1.a
            android.os.Bundle r4 = r3.D
            r0.d = r4
            r3.D = r2
        L_0x0019:
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            java.lang.String[] r3 = r0.V
            if (r3 != 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            int r4 = r3.length
            if (r4 <= 0) goto L_0x0029
            muu r4 = r1.b
            r4.e = r3
            r0.V = r2
        L_0x0029:
            android.app.ApplicationErrorReport r0 = r0.a
            boolean r0 = r0.systemApp
            java.lang.String r3 = "gf_ErrorReportUtil"
            r4 = 0
            if (r0 != 0) goto L_0x006d
            android.content.Context r0 = r1.e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            com.google.android.gms.feedback.ErrorReport r5 = r1.a
            android.app.ApplicationErrorReport r5 = r5.a
            java.lang.String r5 = r5.packageName
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r5, r4)     // Catch:{ NameNotFoundException -> 0x0053 }
            com.google.android.gms.feedback.ErrorReport r6 = r1.a     // Catch:{ NameNotFoundException -> 0x0053 }
            android.app.ApplicationErrorReport r6 = r6.a     // Catch:{ NameNotFoundException -> 0x0053 }
            r7 = 1
            if (r0 == 0) goto L_0x004f
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0053 }
            r0 = r0 & r7
            if (r0 != r7) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            r6.systemApp = r7     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x006d
        L_0x0053:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r5 = "Error trying to get the application info for "
            int r6 = r0.length()
            if (r6 != 0) goto L_0x0066
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L_0x006a
        L_0x0066:
            java.lang.String r0 = r5.concat(r0)
        L_0x006a:
            android.util.Log.e(r3, r0)
        L_0x006d:
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            android.app.ApplicationErrorReport r0 = r0.a
            long r5 = java.lang.System.currentTimeMillis()
            r0.time = r5
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            java.lang.String r5 = defpackage.oal.a()
            r0.C = r5
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            java.lang.String r5 = android.os.Build.DEVICE
            r0.e = r5
            java.lang.String r5 = android.os.Build.DISPLAY
            r0.f = r5
            java.lang.String r5 = android.os.Build.TYPE
            r0.g = r5
            java.lang.String r5 = android.os.Build.MODEL
            r0.h = r5
            java.lang.String r5 = android.os.Build.PRODUCT
            r0.i = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            r0.k = r5
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            r0.l = r5
            java.lang.String r5 = android.os.Build.VERSION.INCREMENTAL
            r0.m = r5
            java.lang.String r5 = android.os.Build.VERSION.CODENAME
            r0.n = r5
            java.lang.String r5 = android.os.Build.BOARD
            r0.o = r5
            java.lang.String r5 = android.os.Build.BRAND
            r0.p = r5
            java.lang.String r5 = android.os.Build.FINGERPRINT
            r0.j = r5
            android.app.ApplicationErrorReport r5 = r0.a
            java.lang.String r5 = r5.packageName
            android.util.Pair r5 = r1.b(r5)
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            r0.d = r5
        L_0x00cb:
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            r1.a((com.google.android.gms.feedback.ErrorReport) r0)
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            android.content.Context r5 = r1.e
            java.lang.String r6 = "activity"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            int r7 = r5.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.util.Iterator r5 = r5.iterator()
            r8 = 0
        L_0x00eb:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00ff
            int r9 = r8 + 1
            java.lang.Object r10 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10
            java.lang.String r10 = r10.processName
            r7[r8] = r10
            r8 = r9
            goto L_0x00eb
        L_0x00ff:
            muu r5 = r1.b
            r5.a = r7
            android.app.ApplicationErrorReport r0 = r0.a
            int r0 = r0.type
            r5 = 2
            if (r0 != r5) goto L_0x026b
            muu r5 = r1.b
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            java.lang.String r8 = ""
            if (r0 <= r7) goto L_0x014c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "/data/anr"
            r0.<init>(r7)
            java.io.FilenameFilter r7 = defpackage.mur.a
            java.io.File[] r0 = r0.listFiles(r7)
            if (r0 != 0) goto L_0x0124
            goto L_0x014a
        L_0x0124:
            int r7 = r0.length
            if (r7 == 0) goto L_0x014a
            axhq r7 = defpackage.axhq.a
            axhr r7 = r7.a()
            boolean r7 = r7.a()
            boolean r7 = defpackage.ofq.b(r7)
            if (r7 == 0) goto L_0x013d
            java.util.Comparator r7 = defpackage.mus.a
            java.util.Arrays.sort(r0, r7)
            goto L_0x0142
        L_0x013d:
            java.util.Comparator r7 = defpackage.mut.a
            java.util.Arrays.sort(r0, r7)
        L_0x0142:
            r0 = r0[r4]
            java.lang.String r0 = r0.getName()
            goto L_0x014e
        L_0x014a:
            r0 = r8
            goto L_0x014e
        L_0x014c:
            java.lang.String r0 = "/data/anr/traces.txt"
        L_0x014e:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x0268
            java.io.File r7 = new java.io.File
            r7.<init>(r0)
            long r9 = r7.length()
            long r11 = defpackage.axgy.i()
            java.lang.String r13 = "com.google"
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 > 0) goto L_0x01d7
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x019a, all -> 0x0196 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x019a, all -> 0x0196 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            r7.<init>()     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
        L_0x0176:
            java.lang.String r9 = r0.readLine()     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            if (r9 == 0) goto L_0x0185
            r7.append(r9)     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            java.lang.String r9 = "\n"
            r7.append(r9)     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            goto L_0x0176
        L_0x0185:
            java.lang.String r8 = r7.toString()     // Catch:{ IOException -> 0x0194, all -> 0x0191 }
            r6.close()     // Catch:{ IOException -> 0x018e }
            goto L_0x0269
        L_0x018e:
            r0 = move-exception
            goto L_0x0269
        L_0x0191:
            r0 = move-exception
            r2 = r0
            goto L_0x01cf
        L_0x0194:
            r0 = move-exception
            goto L_0x019c
        L_0x0196:
            r0 = move-exception
            r6 = r2
            r2 = r0
            goto L_0x01cf
        L_0x019a:
            r0 = move-exception
            r6 = r2
        L_0x019c:
            com.google.android.gms.feedback.ErrorReport r0 = r1.a     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.B     // Catch:{ all -> 0x01cd }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01cd }
            if (r0 != 0) goto L_0x01b2
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ all -> 0x01cd }
            com.google.android.gms.feedback.ErrorReport r7 = r1.a     // Catch:{ all -> 0x01cd }
            java.lang.String r7 = r7.B     // Catch:{ all -> 0x01cd }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x01cd }
            r17 = r0
            goto L_0x01b4
        L_0x01b2:
            r17 = r2
        L_0x01b4:
            android.content.Context r14 = r1.e     // Catch:{ all -> 0x01cd }
            com.google.android.gms.feedback.ErrorReport r15 = r1.a     // Catch:{ all -> 0x01cd }
            r16 = 167(0xa7, float:2.34E-43)
            r18 = 0
            r19 = 0
            r20 = 0
            defpackage.myc.a(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01cd }
            if (r6 != 0) goto L_0x01c6
            goto L_0x01cb
        L_0x01c6:
            r6.close()     // Catch:{ IOException -> 0x01ca }
            goto L_0x01cb
        L_0x01ca:
            r0 = move-exception
        L_0x01cb:
            goto L_0x0269
        L_0x01cd:
            r0 = move-exception
            r2 = r0
        L_0x01cf:
            if (r6 == 0) goto L_0x01d6
            r6.close()     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01d6
        L_0x01d5:
            r0 = move-exception
        L_0x01d6:
            throw r2
        L_0x01d7:
            android.content.Context r0 = r1.e
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            r0.getMemoryInfo(r6)
            long r9 = r6.availMem
            long r11 = defpackage.axgy.i()
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0219
            com.google.android.gms.feedback.ErrorReport r0 = r1.a
            java.lang.String r0 = r0.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0207
            android.accounts.Account r0 = new android.accounts.Account
            com.google.android.gms.feedback.ErrorReport r6 = r1.a
            java.lang.String r6 = r6.B
            r0.<init>(r6, r13)
            r17 = r0
            goto L_0x0209
        L_0x0207:
            r17 = r2
        L_0x0209:
            android.content.Context r14 = r1.e
            com.google.android.gms.feedback.ErrorReport r15 = r1.a
            r16 = 166(0xa6, float:2.33E-43)
            r18 = 0
            r19 = 0
            r20 = 0
            defpackage.myc.a(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0269
        L_0x0219:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x025c, all -> 0x0251 }
            java.lang.String r0 = "r"
            r6.<init>(r7, r0)     // Catch:{ IOException -> 0x025c, all -> 0x0251 }
            long r7 = defpackage.axgy.i()     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            int r0 = (int) r7     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            long r7 = r6.length()     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            long r9 = defpackage.axgy.i()     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            int r10 = (int) r9     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            long r9 = (long) r10     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            long r7 = r7 - r9
            r9 = -1
            long r7 = r7 + r9
            r6.seek(r7)     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            r6.readFully(r0)     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            r8.<init>(r0, r7)     // Catch:{ IOException -> 0x024f, all -> 0x024c }
            r6.close()     // Catch:{ IOException -> 0x024a }
            goto L_0x0268
        L_0x024a:
            r0 = move-exception
            goto L_0x0269
        L_0x024c:
            r0 = move-exception
            r2 = r0
            goto L_0x0254
        L_0x024f:
            r0 = move-exception
            goto L_0x025e
        L_0x0251:
            r0 = move-exception
            r6 = r2
            r2 = r0
        L_0x0254:
            if (r6 == 0) goto L_0x025b
            r6.close()     // Catch:{ IOException -> 0x025a }
            goto L_0x025b
        L_0x025a:
            r0 = move-exception
        L_0x025b:
            throw r2
        L_0x025c:
            r0 = move-exception
            r6 = r2
        L_0x025e:
            if (r6 == 0) goto L_0x0266
            r6.close()     // Catch:{ IOException -> 0x0265 }
            r8 = r2
            goto L_0x0269
        L_0x0265:
            r0 = move-exception
        L_0x0266:
            r8 = r2
            goto L_0x0269
        L_0x0268:
        L_0x0269:
            r5.b = r8
        L_0x026b:
            muu r5 = r1.b
            axgy r0 = defpackage.axgy.a
            axgz r0 = r0.a()
            java.lang.String r0 = r0.g()
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x032f
            java.lang.String[] r6 = defpackage.ofx.a((java.lang.String) r0)
            int r7 = r6.length
        L_0x0282:
            if (r4 >= r7) goto L_0x032f
            r0 = r6[r4]
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L_0x028e
            goto L_0x032b
        L_0x028e:
            android.os.Bundle r8 = r5.d
            if (r8 != 0) goto L_0x0299
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r5.d = r8
        L_0x0299:
            android.util.Pair r8 = r1.b(r0)
            java.lang.String r8 = a((android.util.Pair) r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x02ad
            android.os.Bundle r9 = r5.d
            r9.putCharSequence(r0, r8)
            goto L_0x02c6
        L_0x02ad:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r9 = "Error trying to add app version info for "
            int r10 = r8.length()
            if (r10 != 0) goto L_0x02bf
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
            goto L_0x02c3
        L_0x02bf:
            java.lang.String r8 = r9.concat(r8)
        L_0x02c3:
            android.util.Log.e(r3, r8)
        L_0x02c6:
            java.lang.String r8 = "com.google.android.webview"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x032b
            android.content.Context r0 = r1.e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r8 = android.os.Build.VERSION.SDK_INT
            boolean r8 = defpackage.jkr.c()
            if (r8 == 0) goto L_0x02e6
            java.lang.String r8 = "android.webkit.WebViewUpdateService"
            java.lang.String r9 = "getCurrentWebViewPackageName"
            java.lang.String r8 = a(r8, r9)
            goto L_0x02ef
        L_0x02e6:
            java.lang.String r8 = "android.webkit.WebViewFactory"
            java.lang.String r9 = "getWebViewPackageName"
            java.lang.String r8 = a(r8, r9)
        L_0x02ef:
            if (r8 == 0) goto L_0x02fb
            r9 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x02f8 }
            goto L_0x02fc
        L_0x02f8:
            r0 = move-exception
            r0 = r2
            goto L_0x02fc
        L_0x02fb:
            r0 = r2
        L_0x02fc:
            if (r0 == 0) goto L_0x032b
            int r8 = r0.versionCode
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = r0.versionName
            android.util.Pair r8 = android.util.Pair.create(r8, r9)
            java.lang.String r8 = a((android.util.Pair) r8)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0325
            android.os.Bundle r9 = r5.d
            java.lang.String r0 = r0.packageName
            java.lang.String r10 = "Effective WebView package name"
            r9.putCharSequence(r10, r0)
            android.os.Bundle r0 = r5.d
            java.lang.String r9 = "Effective WebView package version"
            r0.putCharSequence(r9, r8)
            goto L_0x032b
        L_0x0325:
            java.lang.String r0 = "Empty WebView package version when attempting to get effective WebView package info."
            android.util.Log.e(r3, r0)
        L_0x032b:
            int r4 = r4 + 1
            goto L_0x0282
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muv.c():void");
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(str);
            return (String) cls.getMethod(str2, new Class[0]).invoke(cls, new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    public final ErrorReport b() {
        a();
        return this.a;
    }

    private final void a(ErrorReport errorReport) {
        TelephonyManager telephonyManager = (TelephonyManager) this.e.getSystemService("phone");
        errorReport.y = telephonyManager.getPhoneType();
        errorReport.A = telephonyManager.getNetworkOperatorName();
        errorReport.z = telephonyManager.getNetworkType();
        String networkOperator = telephonyManager.getNetworkOperator();
        try {
            if (!TextUtils.isEmpty(networkOperator)) {
                errorReport.F = Integer.parseInt(networkOperator.substring(0, 3));
                errorReport.G = Integer.parseInt(networkOperator.substring(3));
            }
        } catch (NumberFormatException e2) {
        } catch (IndexOutOfBoundsException e3) {
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            Log.e("gf_ErrorReportUtil", valueOf.length() == 0 ? new String("Exception while gathering network params: ") : "Exception while gathering network params: ".concat(valueOf));
        }
    }

    public muv(Context context, FeedbackOptions feedbackOptions) {
        this.e = context;
        this.a = new ErrorReport(feedbackOptions, context.getCacheDir());
        this.b = new muu();
        Bitmap bitmap = feedbackOptions.m;
        if (bitmap != null) {
            this.b.c = Screenshot.a(bitmap);
        }
        c();
    }

    public final List a(String str) {
        Context context = this.e;
        String str2 = this.a.a.packageName;
        yey a2 = yef.a(context);
        String valueOf = String.valueOf(str2);
        acwa a3 = a2.c(valueOf.length() == 0 ? new String("app:") : "app:".concat(valueOf), str, a2.c.getPackageName()).a(mxe.a);
        try {
            acws.a(a3, axhe.a.a().b(), TimeUnit.MILLISECONDS);
            return (List) a3.d();
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.a.ai = 2;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 38);
            sb.append("Could not retrieve experiment tokens: ");
            sb.append(valueOf2);
            Log.e("gf_ErrorReportUtil", sb.toString());
            return null;
        }
    }

    public final void a() {
        String[] strArr;
        String[] strArr2;
        this.a.V = this.b.b(true);
        this.a.D = this.b.a(true);
        if (!this.c) {
            ErrorReport errorReport = this.a;
            muu muu = this.b;
            errorReport.t = muu.b;
            Map map = muu.f;
            if (map != null) {
                strArr = (String[]) map.get("system_log");
            } else {
                strArr = null;
            }
            errorReport.r = strArr;
            ErrorReport errorReport2 = this.a;
            Map map2 = this.b.f;
            if (map2 != null) {
                strArr2 = (String[]) map2.get("event_log");
            } else {
                strArr2 = null;
            }
            errorReport2.s = strArr2;
            this.a.q = this.b.a;
        } else {
            ErrorReport errorReport3 = this.a;
            errorReport3.t = null;
            errorReport3.r = null;
            errorReport3.s = null;
            errorReport3.q = null;
            if (!errorReport3.ae) {
                errorReport3.V = null;
                errorReport3.D = null;
            }
        }
        if (!this.d) {
            Screenshot.a(this.a, this.b.c);
        } else if (ofq.b(axhk.a.a().b())) {
            ErrorReport errorReport4 = this.a;
            if (errorReport4 != null) {
                errorReport4.u = null;
                errorReport4.v = null;
                errorReport4.T = null;
                BitmapTeleporter bitmapTeleporter = errorReport4.S;
                if (bitmapTeleporter != null) {
                    if (!bitmapTeleporter.d) {
                        try {
                            bitmapTeleporter.b.close();
                        } catch (IOException e2) {
                            Log.w("BitmapTeleporter", "Could not close PFD", e2);
                        }
                    }
                    errorReport4.S = null;
                }
                Bitmap bitmap = errorReport4.af;
                if (bitmap != null) {
                    bitmap.recycle();
                    errorReport4.af = null;
                }
                errorReport4.w = 0;
                errorReport4.x = 0;
            }
        } else {
            Screenshot.a(this.a, (Screenshot) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle != null && bundle.size() != 0) {
            muu muu = this.b;
            Bundle bundle2 = muu.d;
            if (bundle2 != null) {
                bundle2.putAll(bundle);
            } else {
                muu.d = bundle;
            }
            ErrorReport errorReport = this.a;
            errorReport.D = this.b.a(!errorReport.W);
        }
    }

    public final void a(Map map) {
        LogOptions logOptions;
        if (map != null) {
            if (map.containsKey("radio_log") && ((String[]) map.get("radio_log")).length > 0 && (logOptions = this.a.Z) != null && logOptions.b) {
                FileTeleporter fileTeleporter = new FileTeleporter(TextUtils.join("\n", (Object[]) map.get("radio_log")).getBytes(), "text/plain", this.e.getString(R.string.gf_radio_log));
                fileTeleporter.a(this.e.getFilesDir());
                String a2 = ofx.a(fileTeleporter, ofx.a(this.e.getFilesDir()));
                muu muu = this.b;
                String[] strArr = muu.e;
                if (strArr != null) {
                    muu.e = (String[]) jhx.a((Object[][]) new String[][]{strArr, new String[]{a2}});
                } else {
                    muu.e = new String[]{a2};
                }
                map.remove("radio_log");
            }
            muu muu2 = this.b;
            if (muu2.f == null) {
                muu2.f = new nz();
            }
            this.b.f.putAll(map);
        }
    }
}
