package com.google.android.gms.common.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HttpClientStack;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.stats.radio.NetworkActivityDbHelper;
import com.google.android.gms.common.stats.radio.NetworkLatencyDbHelper;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import com.google.android.gms.common.transporter.FileMigrationApi;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BaseApplicationContext extends ContextWrapper {
    private static final String TAG = "BaseAppContext";
    private ihx apiaryRequestQueue;
    private Context baseContext;
    private boolean createNewAssetMgrs;
    private volatile CronetEngine cronetEngine;
    private final Object cronetEngineLock;
    /* access modifiers changed from: private */
    public String currentLanguage;
    private FileMigrationApi fileMigrationApi;
    private final BaseApplicationContext globalGmsState;
    private volatile boolean inSafeBoot;
    private final WeakHashMap knownLanguageObjects;
    private final Map lockMap;
    private ihx requestQueue;

    protected BaseApplicationContext(Context context) {
        this(context, (BaseApplicationContext) null);
    }

    private ihx buildRequestQueue(String str, HttpClientStack httpClientStack) {
        ihx ihx = new ihx(new DiskBasedCache(new File(getCacheDir(), str)), new izh(httpClientStack), new qvr(Looper.getMainLooper()));
        ihx.start();
        return ihx;
    }

    private RadiosTracingLoggerProvider.NetworkActivityLogger createNetworkActivityLoggerImpl() {
        return new jej(new NetworkActivityDbHelper(this), jfm.a(1, 10), axbe.d(), TimeUnit.MILLISECONDS, (int) axbe.c());
    }

    private RadiosTracingLoggerProvider.NetworkLatencyLogger createNetworkLatencyLoggerImpl() {
        return new jel(new NetworkLatencyDbHelper(this), jfm.a(1, 10), axbe.d(), TimeUnit.MILLISECONDS, (int) axbe.c());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f5, code lost:
        if (r0 == false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f8, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022e A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0231 A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0239 A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x023a A[Catch:{ all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0280 A[SYNTHETIC, Splitter:B:116:0x0280] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.Resources getResourcesWithLanguageAssets(android.content.res.Resources r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            monitor-enter(r18)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r1.globalGmsState     // Catch:{ all -> 0x02bb }
            defpackage.irk.a((java.lang.Object) r0)     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = r1.currentLanguage     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x004d
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ all -> 0x02bb }
            boolean r3 = r1.createNewAssetMgrs     // Catch:{ all -> 0x02bb }
            if (r3 != 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            java.util.WeakHashMap r4 = r1.knownLanguageObjects     // Catch:{ all -> 0x02bb }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x02bb }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x02bb }
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x004f
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x02bb }
            android.content.res.Resources r4 = (android.content.res.Resources) r4     // Catch:{ all -> 0x02bb }
            boolean r7 = r1.createNewAssetMgrs     // Catch:{ all -> 0x02bb }
            if (r7 == 0) goto L_0x0031
            r7 = 1
            goto L_0x0036
        L_0x0031:
            if (r4 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x0035:
            r7 = 1
        L_0x0036:
            defpackage.irk.a((boolean) r7)     // Catch:{ all -> 0x02bb }
            boolean r7 = r1.createNewAssetMgrs     // Catch:{ all -> 0x02bb }
            if (r7 == 0) goto L_0x004d
            if (r4 != 0) goto L_0x0040
            goto L_0x004f
        L_0x0040:
            android.content.res.Configuration r0 = r19.getConfiguration()     // Catch:{ all -> 0x02bb }
            android.util.DisplayMetrics r2 = r19.getDisplayMetrics()     // Catch:{ all -> 0x02bb }
            r4.updateConfiguration(r0, r2)     // Catch:{ all -> 0x02bb }
            monitor-exit(r18)
            return r4
        L_0x004d:
            monitor-exit(r18)
            return r2
        L_0x004f:
            aohk r4 = defpackage.aohk.f     // Catch:{ all -> 0x02bb }
            aucd r4 = r4.o()     // Catch:{ all -> 0x02bb }
            boolean r8 = r1.createNewAssetMgrs     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r8 == 0) goto L_0x009a
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r8)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Object r0 = r0.newInstance(r8)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r5] = r9     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Class<android.content.res.AssetManager> r9 = android.content.res.AssetManager.class
            java.lang.String r10 = "addAssetPath"
            java.lang.reflect.Method r8 = r9.getDeclaredMethod(r10, r8)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            android.content.pm.ApplicationInfo r10 = r18.getApplicationInfo()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r10 = r10.sourceDir     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r9[r5] = r10     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.Object r8 = r8.invoke(r0, r9)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r9 = r8 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r9 == 0) goto L_0x0092
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r8 == 0) goto L_0x0092
            goto L_0x009b
        L_0x0092:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r3 = "addAssetPath(sourceDir) failed"
            r0.<init>(r3)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            throw r0     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
        L_0x009a:
        L_0x009b:
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r10 = r1.currentLanguage     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r11 = r18.getPackageName()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r11 = defpackage.apen.a((android.content.res.Resources) r2, (java.lang.String) r11)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r12 = 0
            if (r11 == 0) goto L_0x0175
            java.lang.String r11 = r18.getPackageName()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r11 = defpackage.apen.a((android.content.res.Resources) r2, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r11 == 0) goto L_0x0173
            android.content.Context r11 = defpackage.apeo.a(r18)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r14 = r18.getPackageName()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r10 = defpackage.apen.a(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r14 = defpackage.apen.a((android.content.res.Resources) r2, (java.lang.String) r10, (java.lang.String) r14)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r14 == 0) goto L_0x0157
            java.io.File r14 = r11.getFilesDir()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r15 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r15 = r15.length()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r7.<init>(r15)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r7.append(r14)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r14 = defpackage.apen.a((android.content.Context) r11, (java.lang.String) r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r15.<init>(r7, r14)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r7 = r15.exists()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r7 == 0) goto L_0x013f
            long r14 = r15.lastModified()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r13 = r11.getPackageCodePath()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r7.<init>(r13)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            long r16 = r7.lastModified()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x013f
            java.lang.String r7 = defpackage.apen.a((android.content.Context) r11, (java.lang.String) r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.io.File r10 = r11.getFilesDir()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r11 = r11.length()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r13 = r13.length()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r11 = r11 + r6
            int r11 = r11 + r13
            r14.<init>(r11)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r14.append(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r10 = "/"
            r14.append(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r14.append(r7)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r7 = r14.toString()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            defpackage.apen.a((android.content.res.AssetManager) r0, (java.lang.String) r7)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r7 = 3
            goto L_0x0176
        L_0x013f:
            java.lang.String r7 = defpackage.apen.a((android.content.Context) r11, (android.content.res.AssetManager) r0, (java.lang.String) r10)     // Catch:{ IOException -> 0x0148 }
            defpackage.apen.a((android.content.res.AssetManager) r0, (java.lang.String) r7)     // Catch:{ IOException -> 0x0148 }
            r7 = 2
            goto L_0x0176
        L_0x0148:
            r0 = move-exception
            java.lang.String r3 = "locale-filtered-resources-"
            r7 = -1
            defpackage.apen.a(r11, r3, r7, r12)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r7 = "AssetManager-twiddling failed"
            r3.<init>(r7, r0)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            throw r3     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
        L_0x0157:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            java.lang.String r3 = "Does not have compressed data for language: "
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r8 = r7.length()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r8 != 0) goto L_0x016b
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            goto L_0x016f
        L_0x016b:
            java.lang.String r7 = r3.concat(r7)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
        L_0x016f:
            r0.<init>(r7)     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            throw r0     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
        L_0x0173:
            r7 = 4
            goto L_0x0176
        L_0x0175:
            r7 = 1
        L_0x0176:
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            long r10 = r10 - r8
            int r8 = (int) r10     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            boolean r9 = r4.c     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            if (r9 != 0) goto L_0x0181
            goto L_0x0186
        L_0x0181:
            r4.c()     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r4.c = r5     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
        L_0x0186:
            aucj r9 = r4.b     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            aohk r9 = (defpackage.aohk) r9     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            int r10 = r9.a     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r11 = 4
            r10 = r10 | r11
            r9.a = r10     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r9.d = r8     // Catch:{ Exception -> 0x0202, all -> 0x01fe }
            r8 = 2
            if (r7 != r8) goto L_0x0197
            r7 = 1
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            boolean r8 = r1.createNewAssetMgrs     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            if (r8 == 0) goto L_0x01aa
            android.content.res.Resources r12 = new android.content.res.Resources     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            android.util.DisplayMetrics r8 = r19.getDisplayMetrics()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            android.content.res.Configuration r9 = r19.getConfiguration()     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            r12.<init>(r0, r8, r9)     // Catch:{ Exception -> 0x01fc, all -> 0x01f9 }
            goto L_0x01ab
        L_0x01aa:
        L_0x01ab:
            if (r7 != 0) goto L_0x01ae
            goto L_0x01e8
        L_0x01ae:
            boolean r0 = r4.c     // Catch:{ all -> 0x02bb }
            if (r0 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r4.c()     // Catch:{ all -> 0x02bb }
            r4.c = r5     // Catch:{ all -> 0x02bb }
        L_0x01b8:
            aucj r0 = r4.b     // Catch:{ all -> 0x02bb }
            aohk r0 = (defpackage.aohk) r0     // Catch:{ all -> 0x02bb }
            r5 = 2
            r0.b = r5     // Catch:{ all -> 0x02bb }
            int r5 = r0.a     // Catch:{ all -> 0x02bb }
            r5 = r5 | r6
            r0.a = r5     // Catch:{ all -> 0x02bb }
            java.lang.String r6 = r1.currentLanguage     // Catch:{ all -> 0x02bb }
            r6.getClass()     // Catch:{ all -> 0x02bb }
            r7 = 2
            r5 = r5 | r7
            r0.a = r5     // Catch:{ all -> 0x02bb }
            r0.c = r6     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "com.google.android.gms.common.LEMON_LOG"
            android.content.Intent r0 = defpackage.jhg.g((java.lang.String) r0)     // Catch:{ all -> 0x02bb }
            java.lang.String r5 = "proto"
            aucj r4 = r4.i()     // Catch:{ all -> 0x02bb }
            aohk r4 = (defpackage.aohk) r4     // Catch:{ all -> 0x02bb }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x02bb }
            android.content.Intent r0 = r0.putExtra(r5, r4)     // Catch:{ all -> 0x02bb }
            r1.sendBroadcast(r0)     // Catch:{ all -> 0x02bb }
        L_0x01e8:
            java.util.WeakHashMap r0 = r1.knownLanguageObjects     // Catch:{ all -> 0x02bb }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x02bb }
            r4.<init>(r12)     // Catch:{ all -> 0x02bb }
            r0.put(r3, r4)     // Catch:{ all -> 0x02bb }
            boolean r0 = r1.createNewAssetMgrs     // Catch:{ all -> 0x02bb }
            monitor-exit(r18)
            if (r0 == 0) goto L_0x01f8
            return r12
        L_0x01f8:
            return r2
        L_0x01f9:
            r0 = move-exception
            goto L_0x027e
        L_0x01fc:
            r0 = move-exception
            goto L_0x0204
        L_0x01fe:
            r0 = move-exception
            r7 = 1
            goto L_0x027e
        L_0x0202:
            r0 = move-exception
            r7 = 1
        L_0x0204:
            java.lang.String r3 = "BaseAppContext"
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x027d }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x027d }
            int r9 = r9.length()     // Catch:{ all -> 0x027d }
            int r9 = r9 + 17
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x027d }
            r10.<init>(r9)     // Catch:{ all -> 0x027d }
            java.lang.String r9 = "ResourcesHelper: "
            r10.append(r9)     // Catch:{ all -> 0x027d }
            r10.append(r8)     // Catch:{ all -> 0x027d }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x027d }
            android.util.Log.w(r3, r8)     // Catch:{ all -> 0x027d }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x027d }
            if (r3 != 0) goto L_0x0231
            java.lang.String r0 = ""
            goto L_0x0235
        L_0x0231:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x027d }
        L_0x0235:
            boolean r3 = r4.c     // Catch:{ all -> 0x027d }
            if (r3 != 0) goto L_0x023a
            goto L_0x023f
        L_0x023a:
            r4.c()     // Catch:{ all -> 0x027d }
            r4.c = r5     // Catch:{ all -> 0x027d }
        L_0x023f:
            aucj r3 = r4.b     // Catch:{ all -> 0x027d }
            aohk r3 = (defpackage.aohk) r3     // Catch:{ all -> 0x027d }
            r0.getClass()     // Catch:{ all -> 0x027d }
            int r8 = r3.a     // Catch:{ all -> 0x027d }
            r8 = r8 | 8
            r3.a = r8     // Catch:{ all -> 0x027d }
            r3.e = r0     // Catch:{ all -> 0x027d }
            if (r7 == 0) goto L_0x027b
            r5 = 2
            r3.b = r5     // Catch:{ all -> 0x02bb }
            r0 = r8 | 1
            r3.a = r0     // Catch:{ all -> 0x02bb }
            java.lang.String r5 = r1.currentLanguage     // Catch:{ all -> 0x02bb }
            r5.getClass()     // Catch:{ all -> 0x02bb }
            r6 = 2
            r0 = r0 | r6
            r3.a = r0     // Catch:{ all -> 0x02bb }
            r3.c = r5     // Catch:{ all -> 0x02bb }
            java.lang.String r0 = "com.google.android.gms.common.LEMON_LOG"
            android.content.Intent r0 = defpackage.jhg.g((java.lang.String) r0)     // Catch:{ all -> 0x02bb }
            java.lang.String r3 = "proto"
            aucj r4 = r4.i()     // Catch:{ all -> 0x02bb }
            aohk r4 = (defpackage.aohk) r4     // Catch:{ all -> 0x02bb }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x02bb }
            android.content.Intent r0 = r0.putExtra(r3, r4)     // Catch:{ all -> 0x02bb }
            r1.sendBroadcast(r0)     // Catch:{ all -> 0x02bb }
        L_0x027b:
            monitor-exit(r18)
            return r2
        L_0x027d:
            r0 = move-exception
        L_0x027e:
            if (r7 == 0) goto L_0x02ba
            boolean r2 = r4.c     // Catch:{ all -> 0x02bb }
            if (r2 != 0) goto L_0x0285
            goto L_0x028a
        L_0x0285:
            r4.c()     // Catch:{ all -> 0x02bb }
            r4.c = r5     // Catch:{ all -> 0x02bb }
        L_0x028a:
            aucj r2 = r4.b     // Catch:{ all -> 0x02bb }
            aohk r2 = (defpackage.aohk) r2     // Catch:{ all -> 0x02bb }
            r3 = 2
            r2.b = r3     // Catch:{ all -> 0x02bb }
            int r3 = r2.a     // Catch:{ all -> 0x02bb }
            r3 = r3 | r6
            r2.a = r3     // Catch:{ all -> 0x02bb }
            java.lang.String r5 = r1.currentLanguage     // Catch:{ all -> 0x02bb }
            r5.getClass()     // Catch:{ all -> 0x02bb }
            r6 = 2
            r3 = r3 | r6
            r2.a = r3     // Catch:{ all -> 0x02bb }
            r2.c = r5     // Catch:{ all -> 0x02bb }
            java.lang.String r2 = "com.google.android.gms.common.LEMON_LOG"
            android.content.Intent r2 = defpackage.jhg.g((java.lang.String) r2)     // Catch:{ all -> 0x02bb }
            java.lang.String r3 = "proto"
            aucj r4 = r4.i()     // Catch:{ all -> 0x02bb }
            aohk r4 = (defpackage.aohk) r4     // Catch:{ all -> 0x02bb }
            byte[] r4 = r4.k()     // Catch:{ all -> 0x02bb }
            android.content.Intent r2 = r2.putExtra(r3, r4)     // Catch:{ all -> 0x02bb }
            r1.sendBroadcast(r2)     // Catch:{ all -> 0x02bb }
        L_0x02ba:
            throw r0     // Catch:{ all -> 0x02bb }
        L_0x02bb:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getResourcesWithLanguageAssets(android.content.res.Resources):android.content.res.Resources");
    }

    public void attachBaseContext(Context context) {
        this.baseContext = context;
        if (jkr.i()) {
            context = context.createFeatureContext("apkappcontext");
        }
        super.attachBaseContext(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r0;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.android.volley.RequestQueue getAuthChannelBoundApiaryRequestQueue() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r2.globalGmsState     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0024
            ihx r0 = r2.apiaryRequestQueue     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0022
            ikz r0 = defpackage.iks.a     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x002a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002a }
            iiq r1 = new iiq     // Catch:{ all -> 0x002a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "volleyApiary"
            ihx r0 = r2.buildRequestQueue(r0, r1)     // Catch:{ all -> 0x002a }
            r2.apiaryRequestQueue = r0     // Catch:{ all -> 0x002a }
        L_0x0022:
            monitor-exit(r2)
            return r0
        L_0x0024:
            com.android.volley.RequestQueue r0 = r0.getAuthChannelBoundApiaryRequestQueue()     // Catch:{ all -> 0x002a }
            monitor-exit(r2)
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getAuthChannelBoundApiaryRequestQueue():com.android.volley.RequestQueue");
    }

    public Context getBaseContext() {
        return this.baseContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.chromium.net.CronetEngine getCronetEngine() {
        /*
            r8 = this;
            org.chromium.net.CronetEngine r0 = r8.cronetEngine
            if (r0 != 0) goto L_0x009f
            com.google.android.gms.common.app.BaseApplicationContext r0 = r8.globalGmsState
            if (r0 != 0) goto L_0x009b
            java.lang.Object r1 = r8.cronetEngineLock
            monitor-enter(r1)
            org.chromium.net.CronetEngine r0 = r8.cronetEngine     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0095
            org.chromium.net.CronetEngine$Builder r0 = new org.chromium.net.CronetEngine$Builder     // Catch:{ all -> 0x0098 }
            r0.<init>((android.content.Context) r8)     // Catch:{ all -> 0x0098 }
            r2 = 1
            r0.enableQuic(r2)     // Catch:{ all -> 0x0098 }
            com.google.android.chimera.config.ModuleManager r2 = com.google.android.chimera.config.ModuleManager.get(r8)     // Catch:{ InvalidConfigException -> 0x0086 }
            java.lang.String r3 = "com.google.android.gmscore.cronet.config.proto"
            java.util.Collection r2 = r2.getAllModulesWithMetadata(r3)     // Catch:{ InvalidConfigException -> 0x0086 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0026:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0098 }
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0098 }
            com.google.android.chimera.config.ModuleManager$ModuleInfo r3 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r3     // Catch:{ all -> 0x0098 }
            android.os.Bundle r4 = r3.getMetadata(r8)     // Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }
            java.lang.String r5 = "com.google.android.gmscore.cronet.config.proto"
            byte[] r4 = r4.getByteArray(r5)     // Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }
            aedk r5 = defpackage.aedk.b     // Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r4)     // Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }
            aedk r4 = (defpackage.aedk) r4     // Catch:{ InvalidConfigException -> 0x0062, auda -> 0x0060 }
            aucx r3 = r4.a     // Catch:{ all -> 0x0098 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0098 }
        L_0x004a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x0026
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0098 }
            aedj r4 = (defpackage.aedj) r4     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x0098 }
            int r6 = r4.b     // Catch:{ all -> 0x0098 }
            int r4 = r4.c     // Catch:{ all -> 0x0098 }
            r0.addQuicHint(r5, r6, r4)     // Catch:{ all -> 0x0098 }
            goto L_0x004a
        L_0x0060:
            r4 = move-exception
            goto L_0x0063
        L_0x0062:
            r4 = move-exception
        L_0x0063:
            java.lang.String r5 = "CronetEngineFactory"
            java.lang.String r6 = "Failed to read or parse cronet config metadata for module "
            java.lang.String r3 = r3.moduleId     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0098 }
            int r7 = r3.length()     // Catch:{ all -> 0x0098 }
            if (r7 != 0) goto L_0x0079
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0098 }
            r3.<init>(r6)     // Catch:{ all -> 0x0098 }
            goto L_0x007d
        L_0x0079:
            java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x0098 }
        L_0x007d:
            android.util.Log.e(r5, r3, r4)     // Catch:{ all -> 0x0098 }
            goto L_0x0026
        L_0x0081:
            org.chromium.net.CronetEngine r0 = r0.build()     // Catch:{ all -> 0x0098 }
            goto L_0x0092
        L_0x0086:
            r2 = move-exception
            java.lang.String r3 = "CronetEngineFactory"
            java.lang.String r4 = "Failed to read metadata com.google.android.gmscore.cronet.config.proto"
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0098 }
            org.chromium.net.CronetEngine r0 = r0.build()     // Catch:{ all -> 0x0098 }
        L_0x0092:
            r8.cronetEngine = r0     // Catch:{ all -> 0x0098 }
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            return r0
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            throw r0
        L_0x009b:
            org.chromium.net.CronetEngine r0 = r0.getCronetEngine()
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getCronetEngine():org.chromium.net.CronetEngine");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.common.transporter.FileMigrationApi getFileMigrationApi() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r1.globalGmsState     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.common.transporter.FileMigrationApi r0 = r1.fileMigrationApi     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0010
            com.google.android.gms.common.transporter.FileMigrationApi r0 = new com.google.android.gms.common.transporter.FileMigrationApi     // Catch:{ all -> 0x0018 }
            r0.<init>()     // Catch:{ all -> 0x0018 }
            r1.fileMigrationApi = r0     // Catch:{ all -> 0x0018 }
        L_0x0010:
            monitor-exit(r1)
            return r0
        L_0x0012:
            com.google.android.gms.common.transporter.FileMigrationApi r0 = r0.getFileMigrationApi()     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getFileMigrationApi():com.google.android.gms.common.transporter.FileMigrationApi");
    }

    /* access modifiers changed from: protected */
    public BaseApplicationContext getGlobalState() {
        return this.globalGmsState;
    }

    public boolean getInSafeBoot() {
        return this.inSafeBoot;
    }

    public ConcurrentMap getLockMap(String str) {
        ConcurrentMap concurrentMap;
        BaseApplicationContext baseApplicationContext = this.globalGmsState;
        if (baseApplicationContext != null) {
            return baseApplicationContext.getLockMap(str);
        }
        synchronized (this.lockMap) {
            concurrentMap = (ConcurrentMap) this.lockMap.get(str);
            if (concurrentMap == null) {
                concurrentMap = new ConcurrentHashMap();
                this.lockMap.put(str, concurrentMap);
            }
        }
        return concurrentMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.isNopLogger() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.NetworkActivityLogger getNetworkActivityLogger() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r3.globalGmsState     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003a
            boolean r0 = defpackage.axbe.f()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger r1 = com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.getNetworkActivityLoggerImpl()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            if (r1 != 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            boolean r2 = r1.isNopLogger()     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger r0 = r3.createNetworkActivityLoggerImpl()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.setNetworkActivityLoggerImpl(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0034
        L_0x0021:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            boolean r0 = r1.isNopLogger()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0034
        L_0x002c:
            jej r0 = new jej     // Catch:{ all -> 0x0040 }
            r0.<init>()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.setNetworkActivityLoggerImpl(r0)     // Catch:{ all -> 0x0040 }
        L_0x0034:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger r0 = com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.getNetworkActivityLoggerImpl()     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return r0
        L_0x003a:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger r0 = r0.getNetworkActivityLogger()     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getNetworkActivityLogger():com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkActivityLogger");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r1.isNopLogger() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.NetworkLatencyLogger getNetworkLatencyLogger() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r3.globalGmsState     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003a
            boolean r0 = defpackage.axbe.b()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkLatencyLogger r1 = com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.getNetworkLatencyLoggerImpl()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            if (r1 != 0) goto L_0x0012
            goto L_0x0019
        L_0x0012:
            boolean r2 = r1.isNopLogger()     // Catch:{ all -> 0x0040 }
            if (r2 != 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkLatencyLogger r0 = r3.createNetworkLatencyLoggerImpl()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.setNetworkLatencyLoggerImpl(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0034
        L_0x0021:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            boolean r0 = r1.isNopLogger()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0034
        L_0x002c:
            jel r0 = new jel     // Catch:{ all -> 0x0040 }
            r0.<init>()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.setNetworkLatencyLoggerImpl(r0)     // Catch:{ all -> 0x0040 }
        L_0x0034:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkLatencyLogger r0 = com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider.getNetworkLatencyLoggerImpl()     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return r0
        L_0x003a:
            com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkLatencyLogger r0 = r0.getNetworkLatencyLogger()     // Catch:{ all -> 0x0040 }
            monitor-exit(r3)
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getNetworkLatencyLogger():com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider$NetworkLatencyLogger");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r0;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.android.volley.RequestQueue getRequestQueue() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.common.app.BaseApplicationContext r0 = r2.globalGmsState     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0024
            ihx r0 = r2.requestQueue     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0022
            ikz r0 = defpackage.iks.a     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x002a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002a }
            izg r1 = new izg     // Catch:{ all -> 0x002a }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "volley"
            ihx r0 = r2.buildRequestQueue(r0, r1)     // Catch:{ all -> 0x002a }
            r2.requestQueue = r0     // Catch:{ all -> 0x002a }
        L_0x0022:
            monitor-exit(r2)
            return r0
        L_0x0024:
            com.android.volley.RequestQueue r0 = r0.getRequestQueue()     // Catch:{ all -> 0x002a }
            monitor-exit(r2)
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.app.BaseApplicationContext.getRequestQueue():com.android.volley.RequestQueue");
    }

    public void installLanguageAssets(Resources resources) {
        irk.a((Object) this.globalGmsState);
        this.currentLanguage = resources.getConfiguration().locale.getLanguage();
        int i = Build.VERSION.SDK_INT;
        this.createNewAssetMgrs = false;
        if (apen.a(resources, getPackageName())) {
            jfp jfp = new jfp(9);
            registerReceiver(new nla("common-api") {
                public final void a(Context context, Intent intent) {
                    if (!BaseApplicationContext.this.currentLanguage.equals(intent.getStringExtra("lang"))) {
                        Process.killProcess(Process.myPid());
                    }
                }
            }, new IntentFilter("com.google.android.gms.common.LANGUAGE_RELOAD"), "com.google.android.gms.permission.INTERNAL_BROADCAST", new jfo(jfp));
            jfp.start();
        }
    }

    /* access modifiers changed from: protected */
    public boolean isFromContainer() {
        return BaseApplicationContext.class.getClassLoader() == getClassLoader() || ModuleManager.get(this).getCurrentModuleApk().apkRequired;
    }

    public void setInSafeBoot() {
        this.inSafeBoot = true;
    }

    public void watchForLeaks(Object obj) {
    }

    protected BaseApplicationContext(Context context, BaseApplicationContext baseApplicationContext) {
        super(context);
        this.inSafeBoot = false;
        this.currentLanguage = null;
        this.knownLanguageObjects = new WeakHashMap();
        this.cronetEngineLock = new Object();
        this.baseContext = context;
        this.globalGmsState = baseApplicationContext;
        if (baseApplicationContext == null) {
            this.lockMap = new HashMap();
        } else {
            this.lockMap = null;
        }
    }
}
