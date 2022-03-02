package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.util.Set;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: jiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jiw {
    private static volatile Boolean a = false;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.wearable.settings").path("bluetooth_mode").build();
    }

    private static int a(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 5;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r25, defpackage.aucd r26) {
        /*
            r1 = r25
            r2 = r26
            java.lang.String r3 = "No stable density DPI found: "
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)
            r4 = r0
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            android.content.pm.ConfigurationInfo r5 = r4.getDeviceConfigurationInfo()
            int r0 = r5.reqTouchScreen
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r0 == r9) goto L_0x0025
            if (r0 == r8) goto L_0x0023
            if (r0 == r7) goto L_0x0021
            r0 = 1
            goto L_0x0026
        L_0x0021:
            r0 = 4
            goto L_0x0026
        L_0x0023:
            r0 = 3
            goto L_0x0026
        L_0x0025:
            r0 = 2
        L_0x0026:
            boolean r10 = r2.c
            r11 = 0
            if (r10 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r26.c()
            r2.c = r11
        L_0x0031:
            aucj r10 = r2.b
            haa r10 = (defpackage.haa) r10
            haa r12 = defpackage.haa.y
            int r0 = r0 + -1
            r10.b = r0
            int r0 = r10.a
            r0 = r0 | r9
            r10.a = r0
            int r0 = r5.reqKeyboardType
            if (r0 == r9) goto L_0x004e
            if (r0 == r8) goto L_0x004c
            if (r0 == r7) goto L_0x004a
            r0 = 1
            goto L_0x004f
        L_0x004a:
            r0 = 4
            goto L_0x004f
        L_0x004c:
            r0 = 3
            goto L_0x004f
        L_0x004e:
            r0 = 2
        L_0x004f:
            boolean r10 = r2.c
            if (r10 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r26.c()
            r2.c = r11
        L_0x0059:
            aucj r10 = r2.b
            haa r10 = (defpackage.haa) r10
            int r0 = r0 + -1
            r10.c = r0
            int r0 = r10.a
            r0 = r0 | r8
            r10.a = r0
            int r0 = r5.reqNavigation
            r10 = 5
            if (r0 == r9) goto L_0x0079
            if (r0 == r8) goto L_0x0077
            if (r0 == r7) goto L_0x0075
            if (r0 == r6) goto L_0x0073
            r0 = 1
            goto L_0x007a
        L_0x0073:
            r0 = 5
            goto L_0x007a
        L_0x0075:
            r0 = 4
            goto L_0x007a
        L_0x0077:
            r0 = 3
            goto L_0x007a
        L_0x0079:
            r0 = 2
        L_0x007a:
            boolean r12 = r2.c
            if (r12 != 0) goto L_0x007f
            goto L_0x0084
        L_0x007f:
            r26.c()
            r2.c = r11
        L_0x0084:
            aucj r12 = r2.b
            haa r12 = (defpackage.haa) r12
            int r0 = r0 + -1
            r12.d = r0
            int r0 = r12.a
            r0 = r0 | r6
            r12.a = r0
            int r0 = r5.reqInputFeatures
            r0 = r0 & r9
            boolean r12 = r2.c
            if (r12 != 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r26.c()
            r2.c = r11
        L_0x009e:
            aucj r12 = r2.b
            haa r12 = (defpackage.haa) r12
            int r13 = r12.a
            r13 = r13 | 32
            r12.a = r13
            if (r0 != 0) goto L_0x00ac
            r0 = 0
            goto L_0x00ad
        L_0x00ac:
            r0 = 1
        L_0x00ad:
            r12.g = r0
            int r0 = r5.reqInputFeatures
            r0 = r0 & r8
            if (r0 <= 0) goto L_0x00b6
            r0 = 1
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            boolean r12 = r2.c
            if (r12 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r26.c()
            r2.c = r11
        L_0x00c1:
            aucj r12 = r2.b
            haa r12 = (defpackage.haa) r12
            int r13 = r12.a
            r13 = r13 | 64
            r12.a = r13
            r12.h = r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            boolean r12 = defpackage.jkr.f()
            java.lang.String r13 = "window"
            if (r12 == 0) goto L_0x00e7
            java.lang.String r0 = "display"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.graphics.Point r0 = r0.getStableDisplaySize()
            goto L_0x00f7
        L_0x00e7:
            java.lang.Object r12 = r1.getSystemService(r13)
            android.view.WindowManager r12 = (android.view.WindowManager) r12
            int r14 = android.os.Build.VERSION.SDK_INT
            android.view.Display r12 = r12.getDefaultDisplay()
            r12.getRealSize(r0)
        L_0x00f7:
            android.graphics.Point r12 = new android.graphics.Point
            int r14 = r0.x
            int r15 = r0.y
            int r14 = java.lang.Math.min(r14, r15)
            int r15 = r0.x
            int r0 = r0.y
            int r0 = java.lang.Math.max(r15, r0)
            r12.<init>(r14, r0)
            int r0 = r12.x
            boolean r14 = r2.c
            if (r14 == 0) goto L_0x0117
            r26.c()
            r2.c = r11
        L_0x0117:
            aucj r14 = r2.b
            haa r14 = (defpackage.haa) r14
            int r15 = r14.a
            r15 = r15 | 256(0x100, float:3.59E-43)
            r14.a = r15
            r14.j = r0
            int r0 = r12.y
            boolean r14 = r2.c
            if (r14 == 0) goto L_0x012e
            r26.c()
            r2.c = r11
        L_0x012e:
            aucj r14 = r2.b
            haa r14 = (defpackage.haa) r14
            int r15 = r14.a
            r15 = r15 | 512(0x200, float:7.175E-43)
            r14.a = r15
            r14.k = r0
            java.lang.Object r0 = r1.getSystemService(r13)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.util.DisplayMetrics r13 = new android.util.DisplayMetrics
            r13.<init>()
            int r14 = android.os.Build.VERSION.SDK_INT
            r0.getRealMetrics(r13)
            int r14 = r13.densityDpi
            boolean r0 = defpackage.jkr.c()
            java.lang.String r15 = "DeviceConfigUtils"
            if (r0 == 0) goto L_0x016e
            java.lang.Class<android.util.DisplayMetrics> r0 = android.util.DisplayMetrics.class
            java.lang.String r6 = "DENSITY_DEVICE_STABLE"
            java.lang.reflect.Field r0 = r0.getField(r6)     // Catch:{ NoSuchFieldException -> 0x016a, IllegalAccessException -> 0x0165 }
            int r14 = r0.getInt(r13)     // Catch:{ NoSuchFieldException -> 0x016a, IllegalAccessException -> 0x0165 }
            goto L_0x016e
        L_0x0165:
            r0 = move-exception
            android.util.Log.w(r15, r3, r0)
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            android.util.Log.w(r15, r3, r0)
        L_0x016e:
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r26.c()
            r2.c = r11
        L_0x0178:
            aucj r0 = r2.b
            haa r0 = (defpackage.haa) r0
            int r3 = r0.a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r0.a = r3
            r0.i = r14
            android.content.res.Resources r0 = r25.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r3 = r0.screenLayout
            int r3 = a((int) r3)
            boolean r6 = r2.c
            if (r6 != 0) goto L_0x0197
            goto L_0x019c
        L_0x0197:
            r26.c()
            r2.c = r11
        L_0x019c:
            aucj r6 = r2.b
            haa r6 = (defpackage.haa) r6
            int r3 = r3 + -1
            r6.f = r3
            int r3 = r6.a
            r3 = r3 | 16
            r6.a = r3
            boolean r3 = defpackage.jkr.c()
            if (r3 != 0) goto L_0x01b3
            int r3 = r0.screenLayout
            goto L_0x01f0
        L_0x01b3:
            r3 = 1126170624(0x43200000, float:160.0)
            float r6 = (float) r14
            float r3 = r3 / r6
            int r6 = r12.x
            float r6 = (float) r6
            float r6 = r6 * r3
            int r6 = (int) r6
            int r12 = r12.y
            float r12 = (float) r12
            float r12 = r12 * r3
            int r3 = (int) r12
            r12 = 470(0x1d6, float:6.59E-43)
            if (r3 >= r12) goto L_0x01ca
            r3 = 1
        L_0x01c8:
            r6 = 0
            goto L_0x01ec
        L_0x01ca:
            r12 = 960(0x3c0, float:1.345E-42)
            if (r3 < r12) goto L_0x01d5
            r12 = 720(0x2d0, float:1.009E-42)
            if (r6 >= r12) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r12 = 4
            goto L_0x01e0
        L_0x01d5:
            r12 = 640(0x280, float:8.97E-43)
            if (r3 < r12) goto L_0x01df
            r12 = 480(0x1e0, float:6.73E-43)
            if (r6 < r12) goto L_0x01df
            r12 = 3
            goto L_0x01e0
        L_0x01df:
            r12 = 2
        L_0x01e0:
            int r3 = r3 * 3
            int r3 = r3 / r10
            int r6 = r6 + -1
            if (r3 < r6) goto L_0x01ea
            r3 = r12
            r6 = 1
            goto L_0x01ec
        L_0x01ea:
            r3 = r12
            goto L_0x01c8
        L_0x01ec:
            if (r6 != 0) goto L_0x01f0
            r3 = r3 | 16
        L_0x01f0:
            int r3 = a((int) r3)
            boolean r6 = r2.c
            if (r6 == 0) goto L_0x01fd
            r26.c()
            r2.c = r11
        L_0x01fd:
            aucj r6 = r2.b
            haa r6 = (defpackage.haa) r6
            int r3 = r3 + -1
            r6.e = r3
            int r3 = r6.a
            r3 = r3 | 8
            r6.a = r3
            int r0 = r0.smallestScreenWidthDp
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            r26.c()
            r2.c = r11
        L_0x0217:
            aucj r3 = r2.b
            haa r3 = (defpackage.haa) r3
            int r6 = r3.a
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r3.a = r6
            r3.s = r0
            int r0 = r5.reqGlEsVersion
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x022a
            goto L_0x022f
        L_0x022a:
            r26.c()
            r2.c = r11
        L_0x022f:
            aucj r3 = r2.b
            haa r3 = (defpackage.haa) r3
            int r5 = r3.a
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r3.a = r5
            r3.l = r0
            android.content.pm.PackageManager r0 = r25.getPackageManager()
            java.lang.String[] r3 = r0.getSystemSharedLibraryNames()
            if (r3 == 0) goto L_0x0289
            java.util.Arrays.sort(r3)
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x024d
            goto L_0x0252
        L_0x024d:
            r26.c()
            r2.c = r11
        L_0x0252:
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            aucx r6 = defpackage.aucj.s()
            r5.m = r6
            java.lang.Object r3 = r3.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.List r3 = java.util.Arrays.asList(r3)
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x026b
            goto L_0x0270
        L_0x026b:
            r26.c()
            r2.c = r11
        L_0x0270:
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            aucx r6 = r5.m
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0284
            aucx r6 = r5.m
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r5.m = r6
        L_0x0284:
            aucx r5 = r5.m
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r5)
        L_0x0289:
            android.content.pm.FeatureInfo[] r0 = r0.getSystemAvailableFeatures()
            if (r0 == 0) goto L_0x0365
            int r3 = r0.length
            java.lang.String[] r5 = new java.lang.String[r3]
            r6 = 0
            r12 = 0
        L_0x0294:
            if (r6 < r3) goto L_0x0350
            java.util.Arrays.sort(r5, r11, r12)
            java.util.List r3 = java.util.Arrays.asList(r5)
            java.util.List r3 = r3.subList(r11, r12)
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x02aa
            r26.c()
            r2.c = r11
        L_0x02aa:
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            aucx r6 = r5.n
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x02be
            aucx r6 = r5.n
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r5.n = r6
        L_0x02be:
            aucx r5 = r5.n
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r5)
            java.util.TreeSet r3 = new java.util.TreeSet
            jiv r5 = new jiv
            r5.<init>()
            r3.<init>(r5)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.addAll(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x02d8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0365
            java.lang.Object r3 = r0.next()
            android.content.pm.FeatureInfo r3 = (android.content.pm.FeatureInfo) r3
            java.lang.String r5 = r3.name
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02d8
            hab r5 = defpackage.hab.d
            aucd r5 = r5.o()
            java.lang.String r6 = r3.name
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x02f9
            goto L_0x02fe
        L_0x02f9:
            r5.c()
            r5.c = r11
        L_0x02fe:
            aucj r12 = r5.b
            hab r12 = (defpackage.hab) r12
            r6.getClass()
            int r13 = r12.a
            r13 = r13 | r9
            r12.a = r13
            r12.b = r6
            int r3 = r3.reqGlEsVersion
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0313
            goto L_0x0318
        L_0x0313:
            r5.c()
            r5.c = r11
        L_0x0318:
            aucj r6 = r5.b
            hab r6 = (defpackage.hab) r6
            int r12 = r6.a
            r12 = r12 | r8
            r6.a = r12
            r6.c = r3
            aucj r3 = r5.i()
            hab r3 = (defpackage.hab) r3
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x032e
            goto L_0x0333
        L_0x032e:
            r26.c()
            r2.c = r11
        L_0x0333:
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            r3.getClass()
            aucx r6 = r5.o
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x034a
            aucx r6 = r5.o
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r5.o = r6
        L_0x034a:
            aucx r5 = r5.o
            r5.add(r3)
            goto L_0x02d8
        L_0x0350:
            r13 = r0[r6]
            java.lang.String r14 = r13.name
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0361
            int r14 = r12 + 1
            java.lang.String r13 = r13.name
            r5[r12] = r13
            r12 = r14
        L_0x0361:
            int r6 = r6 + 1
            goto L_0x0294
        L_0x0365:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            if (r0 == 0) goto L_0x0379
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            int r3 = r0.length
            r5 = 0
        L_0x036f:
            if (r5 >= r3) goto L_0x038d
            r6 = r0[r5]
            r2.f((java.lang.String) r6)
            int r5 = r5 + 1
            goto L_0x036f
        L_0x0379:
            java.lang.String r0 = android.os.Build.CPU_ABI
            r2.f((java.lang.String) r0)
            java.lang.String r0 = android.os.Build.CPU_ABI2
            java.lang.String r3 = "unknown"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x038d
            java.lang.String r0 = android.os.Build.CPU_ABI2
            r2.f((java.lang.String) r0)
        L_0x038d:
            android.content.res.AssetManager r0 = r25.getAssets()
            java.lang.String[] r0 = r0.getLocales()
            if (r0 == 0) goto L_0x03f3
            java.util.ArrayList r3 = new java.util.ArrayList
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            aucx r5 = r5.q
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            r3.<init>(r5)
            java.util.Arrays.sort(r0)
            int r5 = r0.length
            r6 = 0
        L_0x03ab:
            if (r6 >= r5) goto L_0x03bc
            r12 = r0[r6]
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x03b6
            goto L_0x03b9
        L_0x03b6:
            r3.add(r12)
        L_0x03b9:
            int r6 = r6 + 1
            goto L_0x03ab
        L_0x03bc:
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x03c1
            goto L_0x03c6
        L_0x03c1:
            r26.c()
            r2.c = r11
        L_0x03c6:
            aucj r0 = r2.b
            haa r0 = (defpackage.haa) r0
            aucx r5 = defpackage.aucj.s()
            r0.q = r5
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x03d5
            goto L_0x03da
        L_0x03d5:
            r26.c()
            r2.c = r11
        L_0x03da:
            aucj r0 = r2.b
            haa r0 = (defpackage.haa) r0
            aucx r5 = r0.q
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x03ee
            aucx r5 = r0.q
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)
            r0.q = r5
        L_0x03ee:
            aucx r0 = r0.q
            defpackage.auab.a((java.lang.Iterable) r3, (java.util.List) r0)
        L_0x03f3:
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r15, r11)
            java.lang.String r3 = "cachedGlExt"
            r5 = 0
            java.lang.String r6 = r0.getString(r3, r5)
            boolean r12 = a((android.content.Context) r25)
            java.lang.String r13 = " "
            if (r12 != 0) goto L_0x0419
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x040e
            goto L_0x0419
        L_0x040e:
            java.lang.String[] r0 = r6.split(r13)
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L_0x0518
        L_0x0419:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            javax.microedition.khronos.egl.EGL r12 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r12 = (javax.microedition.khronos.egl.EGL10) r12
            if (r12 != 0) goto L_0x042d
            java.lang.String r5 = "Couldn't get EGL"
            android.util.Log.e(r15, r5)
            goto L_0x0500
        L_0x042d:
            java.lang.Object r14 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r14 = r12.eglGetDisplay(r14)
            int[] r8 = new int[r8]
            r12.eglInitialize(r14, r8)
            int[] r8 = new int[r9]
            boolean r5 = r12.eglGetConfigs(r14, r5, r11, r8)
            if (r5 != 0) goto L_0x0447
            java.lang.String r5 = "Couldn't get EGL config count"
            android.util.Log.e(r15, r5)
            goto L_0x0500
        L_0x0447:
            r5 = r8[r11]
            javax.microedition.khronos.egl.EGLConfig[] r11 = new javax.microedition.khronos.egl.EGLConfig[r5]
            boolean r5 = r12.eglGetConfigs(r14, r11, r5, r8)
            if (r5 != 0) goto L_0x0458
            java.lang.String r5 = "Couldn't get EGL configs"
            android.util.Log.e(r15, r5)
            goto L_0x0500
        L_0x0458:
            int[] r5 = new int[r10]
            r5 = {12375, 1, 12374, 1, 12344} // fill-array
            int[] r7 = new int[r7]
            r7 = {12440, 2, 12344} // fill-array
            int[] r10 = new int[r9]
            r15 = 0
            r17 = 0
            r23 = 0
        L_0x046a:
            r18 = 0
            r9 = r8[r18]
            if (r15 >= r9) goto L_0x04f9
            r9 = r11[r15]
            r24 = r8
            r8 = 12327(0x3027, float:1.7274E-41)
            r12.eglGetConfigAttrib(r14, r9, r8, r10)
            r8 = r10[r18]
            r9 = 12368(0x3050, float:1.7331E-41)
            if (r8 == r9) goto L_0x04ea
            r8 = r11[r15]
            r9 = 12339(0x3033, float:1.729E-41)
            r12.eglGetConfigAttrib(r14, r8, r9, r10)
            r8 = r10[r18]
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x04e5
            r8 = r11[r15]
            r9 = 12352(0x3040, float:1.7309E-41)
            r12.eglGetConfigAttrib(r14, r8, r9, r10)
            if (r17 != 0) goto L_0x04ac
            r8 = r10[r18]
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x04ad
            r19 = r11[r15]
            r21 = 0
            r17 = r12
            r18 = r14
            r20 = r5
            r22 = r6
            a(r17, r18, r19, r20, r21, r22)
            r8 = 1
            goto L_0x04af
        L_0x04ac:
            r9 = 1
        L_0x04ad:
            r8 = r17
        L_0x04af:
            if (r23 != 0) goto L_0x04d5
            r17 = 0
            r18 = r10[r17]
            r20 = 4
            r16 = r18 & 4
            if (r16 == 0) goto L_0x04d0
            r16 = r11[r15]
            r21 = r14
            r14 = r12
            r22 = r15
            r15 = r21
            r17 = r5
            r18 = r7
            r19 = r6
            a(r14, r15, r16, r17, r18, r19)
            r23 = 1
            goto L_0x04db
        L_0x04d0:
            r21 = r14
            r22 = r15
            goto L_0x04db
        L_0x04d5:
            r21 = r14
            r22 = r15
            r20 = 4
        L_0x04db:
            if (r8 != 0) goto L_0x04de
            goto L_0x04e2
        L_0x04de:
            if (r23 == 0) goto L_0x04e1
            goto L_0x04fb
        L_0x04e1:
        L_0x04e2:
            r17 = r8
            goto L_0x04f1
        L_0x04e5:
            r21 = r14
            r22 = r15
            goto L_0x04ef
        L_0x04ea:
            r21 = r14
            r22 = r15
            r9 = 1
        L_0x04ef:
            r20 = 4
        L_0x04f1:
            int r15 = r22 + 1
            r14 = r21
            r8 = r24
            goto L_0x046a
        L_0x04f9:
            r21 = r14
        L_0x04fb:
            r5 = r21
            r12.eglTerminate(r5)
        L_0x0500:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            java.util.Collections.sort(r5)
            java.lang.String r6 = android.text.TextUtils.join(r13, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r6)
            r0.apply()
            r0 = r5
        L_0x0518:
            java.util.Iterator r0 = r0.iterator()
        L_0x051c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0550
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x052d
            goto L_0x0533
        L_0x052d:
            r26.c()
            r5 = 0
            r2.c = r5
        L_0x0533:
            aucj r5 = r2.b
            haa r5 = (defpackage.haa) r5
            r3.getClass()
            aucx r6 = r5.r
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x054a
            aucx r6 = r5.r
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r5.r = r6
        L_0x054a:
            aucx r5 = r5.r
            r5.add(r3)
            goto L_0x051c
        L_0x0550:
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = defpackage.jix.d(r25)
            boolean r3 = r2.c
            if (r3 == 0) goto L_0x0560
            r26.c()
            r3 = 0
            r2.c = r3
        L_0x0560:
            aucj r3 = r2.b
            haa r3 = (defpackage.haa) r3
            int r5 = r3.a
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r3.a = r5
            r3.t = r0
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r4.getMemoryInfo(r0)
            long r3 = r0.totalMem
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x057b
            goto L_0x0581
        L_0x057b:
            r26.c()
            r5 = 0
            r2.c = r5
        L_0x0581:
            aucj r0 = r2.b
            haa r0 = (defpackage.haa) r0
            int r5 = r0.a
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r0.a = r5
            r0.u = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x059c
            goto L_0x05a2
        L_0x059c:
            r26.c()
            r3 = 0
            r2.c = r3
        L_0x05a2:
            aucj r3 = r2.b
            haa r3 = (defpackage.haa) r3
            int r4 = r3.a
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r5
            r3.a = r4
            r3.v = r0
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r1 = defpackage.jkr.b()
            if (r1 != 0) goto L_0x05c3
            boolean r0 = r0.isKeyguardSecure()
            goto L_0x05c7
        L_0x05c3:
            boolean r0 = r0.isDeviceSecure()
        L_0x05c7:
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x05cc
            goto L_0x05d2
        L_0x05cc:
            r26.c()
            r1 = 0
            r2.c = r1
        L_0x05d2:
            aucj r1 = r2.b
            haa r1 = (defpackage.haa) r1
            int r3 = r1.a
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r4
            r1.a = r3
            r1.w = r0
            java.lang.String r0 = "ro.oem.key1"
            java.lang.String r1 = ""
            java.lang.String r0 = defpackage.jli.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0609
            boolean r1 = r2.c
            if (r1 != 0) goto L_0x05f2
            goto L_0x05f8
        L_0x05f2:
            r26.c()
            r1 = 0
            r2.c = r1
        L_0x05f8:
            aucj r1 = r2.b
            haa r1 = (defpackage.haa) r1
            r0.getClass()
            int r2 = r1.a
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.a = r2
            r1.x = r0
            return
        L_0x0609:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiw.a(android.content.Context, aucd):void");
    }

    public static void b(Context context) {
        int i = Build.VERSION.SDK_INT;
        jix.i(context);
    }

    public static void a(Context context, aucd aucd, SharedPreferences sharedPreferences) {
        if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
            String str = Build.FINGERPRINT;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac = (hac) aucd.b;
            hac hac2 = hac.r;
            str.getClass();
            hac.a |= 1;
            hac.b = str;
        }
        String radioVersion = Build.getRadioVersion();
        if (TextUtils.isEmpty(radioVersion)) {
            radioVersion = null;
        }
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
        }
        String string = sharedPreferences.getString("lastRadio", (String) null);
        if (radioVersion == null) {
            radioVersion = string;
        } else if (!radioVersion.equals(string)) {
            sharedPreferences.edit().putString("lastRadio", radioVersion).apply();
        }
        if (!TextUtils.isEmpty(radioVersion)) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac3 = (hac) aucd.b;
            hac hac4 = hac.r;
            radioVersion.getClass();
            hac3.a |= 2;
            hac3.c = radioVersion;
        }
        if (!TextUtils.isEmpty(Build.BOOTLOADER)) {
            String str2 = Build.BOOTLOADER;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac5 = (hac) aucd.b;
            hac hac6 = hac.r;
            str2.getClass();
            hac5.a |= 4;
            hac5.d = str2;
        }
        if (!TextUtils.isEmpty(Build.HARDWARE)) {
            String str3 = Build.HARDWARE;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac7 = (hac) aucd.b;
            hac hac8 = hac.r;
            str3.getClass();
            hac7.a |= 8;
            hac7.e = str3;
        }
        if (!TextUtils.isEmpty(Build.BRAND)) {
            String str4 = Build.BRAND;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac9 = (hac) aucd.b;
            hac hac10 = hac.r;
            str4.getClass();
            hac9.a |= 16;
            hac9.f = str4;
        }
        if (!TextUtils.isEmpty(Build.DEVICE)) {
            String str5 = Build.DEVICE;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac11 = (hac) aucd.b;
            hac hac12 = hac.r;
            str5.getClass();
            hac11.a |= 512;
            hac11.k = str5;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str6 = Build.MODEL;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac13 = (hac) aucd.b;
            hac hac14 = hac.r;
            str6.getClass();
            hac13.a |= 1024;
            hac13.l = str6;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str7 = Build.MANUFACTURER;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac15 = (hac) aucd.b;
            hac hac16 = hac.r;
            str7.getClass();
            hac15.a |= 2048;
            hac15.m = str7;
        }
        if (!TextUtils.isEmpty(Build.PRODUCT)) {
            String str8 = Build.PRODUCT;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac17 = (hac) aucd.b;
            hac hac18 = hac.r;
            str8.getClass();
            hac17.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            hac17.n = str8;
        }
        long j = Build.TIME / 1000;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        hac hac19 = (hac) aucd.b;
        hac hac20 = hac.r;
        hac19.a |= 64;
        hac19.h = j;
        int i = Build.VERSION.SDK_INT;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        hac hac21 = (hac) aucd.b;
        hac21.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        hac21.j = i;
        String a2 = !jkr.b() ? jli.a("ro.build.version.security_patch", (String) null) : Build.VERSION.SECURITY_PATCH;
        if (!TextUtils.isEmpty(a2)) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hac hac22 = (hac) aucd.b;
            a2.getClass();
            hac22.a |= 65536;
            hac22.q = a2;
        }
        boolean exists = new File("/system/recovery-from-boot.p").exists();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        hac hac23 = (hac) aucd.b;
        hac23.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        hac23.o = exists;
        b(context);
    }

    private static void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr, int[] iArr2, Set set) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr2);
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr);
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
                return;
            }
            egl10.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            String glGetString = GLES10.glGetString(7939);
            if (!TextUtils.isEmpty(glGetString)) {
                for (String add : glGetString.split(" ")) {
                    set.add(add);
                }
            }
            egl10.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eGLDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
        }
    }

    public static boolean a(Context context) {
        if (a != null) {
            return a.booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
        String str = Build.FINGERPRINT;
        String str2 = Build.RADIO;
        String str3 = Build.BOOTLOADER;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        sb.append("\n");
        sb.append(str3);
        String sb2 = sb.toString();
        if (sb2.equals(sharedPreferences.getString("lastBuildFingerprint", (String) null))) {
            a = false;
        } else {
            sharedPreferences.edit().putString("lastBuildFingerprint", sb2).apply();
            a = true;
        }
        return a.booleanValue();
    }
}
