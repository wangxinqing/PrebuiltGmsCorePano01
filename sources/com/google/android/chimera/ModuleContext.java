package com.google.android.chimera;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Map;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleContext extends ContextThemeWrapper {
    private static final ThreadLocal j = new ThreadLocal();
    /* access modifiers changed from: private */
    public static final BroadcastReceiver k = new bjo();
    private static final Object l = new Object();
    private ModuleContext a;
    private Context b;
    private bms c;
    private String d;
    private int e;
    /* access modifiers changed from: private */
    public Resources f;
    private Resources g;
    private ClassLoader h;
    private anaf i;

    private ModuleContext() {
        super((Context) null);
    }

    public static ModuleContext createApplicationContext(Context context, bms bms, Resources resources, ClassLoader classLoader, Map map) {
        ModuleContext moduleContext = new ModuleContext();
        moduleContext.a(context, moduleContext, bms, (String) null, -1, "apkappcontext", resources, classLoader, map);
        bjo.a(context, moduleContext);
        return moduleContext;
    }

    public static ModuleContext getModuleContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof ModuleContext) {
                return (ModuleContext) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public Context createCredentialProtectedStorageContext() {
        return new ModuleContext(super.createCredentialProtectedStorageContext(), this, this.d, this.f);
    }

    public Context createDeviceProtectedStorageContext() {
        return new ModuleContext(super.createDeviceProtectedStorageContext(), this, this.d, this.f);
    }

    public Context createDisplayContext(Display display) {
        Resources resources;
        if (this.f != null) {
            try {
                resources = this.c.c();
            } catch (PackageManager.NameNotFoundException | bop e2) {
                throw new RuntimeException("Failed to create module Resources", e2);
            }
        } else {
            resources = null;
        }
        return new ModuleContext(super.createDisplayContext(display), this, this.d, resources);
    }

    public Context createFeatureContext(String str) {
        String str2 = this.d;
        if (str2 == null) {
            str2 = getFeatureId();
        }
        if (str2 != null && str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
            sb.append(str2);
            sb.append(":");
            sb.append(str);
            str = sb.toString();
        } else if (str2 != null) {
            str = str2;
        }
        return new ModuleContext(super.createFeatureContext(str), this, (String) null, this.f);
    }

    public Context getApplicationContext() {
        return this.a;
    }

    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = (ApplicationInfo) j.get();
        return applicationInfo == null ? super.getApplicationInfo() : applicationInfo;
    }

    public Context getBaseContext() {
        return this.b;
    }

    public ClassLoader getClassLoader() {
        return this.h;
    }

    public Context getContainerContext() {
        return this.b;
    }

    public Resources getContainerResources() {
        return this.g;
    }

    public anaf getFulfilledApis() {
        return this.i;
    }

    public bms getModuleApk() {
        return this.c;
    }

    public String getModuleId() {
        return this.d;
    }

    public int getModuleVersion() {
        return this.e;
    }

    public Resources getResources() {
        Resources resources = this.f;
        return resources == null ? this.g : resources;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getSystemService(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -905948230: goto L_0x003f;
                case -787751952: goto L_0x0035;
                case 3599307: goto L_0x002b;
                case 3649301: goto L_0x0021;
                case 1901043637: goto L_0x0017;
                case 1923312055: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "connectivity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "location"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "wifi"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "user"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "window"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "sensor"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0072
            if (r0 == r5) goto L_0x0067
            if (r0 == r4) goto L_0x0067
            if (r0 == r3) goto L_0x0067
            if (r0 == r2) goto L_0x0067
            if (r0 == r1) goto L_0x005b
            java.lang.Object r7 = super.getSystemService(r7)
            return r7
        L_0x005b:
            java.lang.Object r0 = l
            monitor-enter(r0)
            java.lang.Object r7 = super.getSystemService(r7)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return r7
        L_0x0064:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r7
        L_0x0067:
            com.google.android.chimera.ModuleContext r0 = r6.a
            android.content.Context r0 = super.getBaseContext()
            java.lang.Object r7 = r0.getSystemService(r7)
            return r7
        L_0x0072:
            android.content.Context r0 = r6.b
            java.lang.Object r7 = r0.getSystemService(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.chimera.ModuleContext.getSystemService(java.lang.String):java.lang.Object");
    }

    public ApplicationInfo overrideApplicationInfo(ApplicationInfo applicationInfo) {
        ApplicationInfo applicationInfo2 = (ApplicationInfo) j.get();
        j.set(applicationInfo);
        return applicationInfo2;
    }

    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks);
    }

    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks);
    }

    public void updateModuleConfiguration(Configuration configuration) {
        Resources resources = this.f;
        if (resources != null) {
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        ModuleContext moduleContext = this.a;
        if (moduleContext != this) {
            moduleContext.updateModuleConfiguration(configuration);
        }
    }

    public ModuleContext(Context context, ModuleContext moduleContext, bms bms, String str, int i2, Resources resources, ClassLoader classLoader) {
        this();
        a(context, moduleContext, bms, str, i2, str, resources, classLoader, moduleContext.getFulfilledApis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r0 == false) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.content.Context r6, com.google.android.chimera.ModuleContext r7, defpackage.bms r8, java.lang.String r9, int r10, java.lang.String r11, android.content.res.Resources r12, java.lang.ClassLoader r13, java.util.Map r14) {
        /*
            r5 = this;
            boolean r0 = defpackage.bos.a()
            if (r0 == 0) goto L_0x0093
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L_0x0089
            boolean r0 = defpackage.mm.b()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r4 = "REL"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            goto L_0x0024
        L_0x001f:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L_0x0040
            goto L_0x001e
        L_0x0024:
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r0 = r0.length()
            if (r0 != r2) goto L_0x0093
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r3)
            r1 = 82
            if (r0 < r1) goto L_0x0093
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L_0x0093
        L_0x0040:
            java.lang.Boolean r0 = defpackage.bos.a
            if (r0 == 0) goto L_0x004b
            java.lang.Boolean r0 = defpackage.bos.a
            boolean r0 = r0.booleanValue()
            goto L_0x0086
        L_0x004b:
            java.lang.String r0 = "google"
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ NumberFormatException -> 0x006a }
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x006a }
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ NumberFormatException -> 0x006a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x006a }
            r1 = 6283131(0x5fdf7b, float:8.804542E-39)
            if (r0 < r1) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ NumberFormatException -> 0x006a }
            defpackage.bos.a = r0     // Catch:{ NumberFormatException -> 0x006a }
            goto L_0x0071
        L_0x006a:
            r0 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            defpackage.bos.a = r0
        L_0x0071:
            java.lang.Boolean r0 = defpackage.bos.a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "PlatformUtils"
            java.lang.String r1 = "Build version must be at least 5954562 to support R in gmscore"
            android.util.Log.w(r0, r1)
        L_0x0080:
            java.lang.Boolean r0 = defpackage.bos.a
            boolean r0 = r0.booleanValue()
        L_0x0086:
            if (r0 != 0) goto L_0x0089
            goto L_0x0093
        L_0x0089:
            if (r11 == 0) goto L_0x0093
            android.content.Context r11 = r6.createFeatureContext(r11)
            r5.attachBaseContext(r11)
            goto L_0x0096
        L_0x0093:
            r5.attachBaseContext(r6)
        L_0x0096:
            r5.a = r7
            r5.b = r6
            r5.c = r8
            r5.d = r9
            r5.e = r10
            r5.h = r13
            anaf r7 = defpackage.anaf.a((java.util.Map) r14)
            r5.i = r7
            r5.f = r12
            android.content.res.Resources r6 = r6.getResources()
            r5.g = r6
            android.content.res.Resources r7 = r5.f
            if (r7 == 0) goto L_0x00c1
            android.content.res.Configuration r6 = r6.getConfiguration()
            android.content.res.Resources r8 = r5.g
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r7.updateConfiguration(r6, r8)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.chimera.ModuleContext.a(android.content.Context, com.google.android.chimera.ModuleContext, bms, java.lang.String, int, java.lang.String, android.content.res.Resources, java.lang.ClassLoader, java.util.Map):void");
    }

    public static ModuleContext createApplicationContext(ModuleContext moduleContext, String str, int i2) {
        ModuleContext moduleContext2 = new ModuleContext();
        moduleContext2.a(moduleContext.getContainerContext(), moduleContext2, moduleContext.c, str, i2, str, moduleContext.getResources(), moduleContext.h, moduleContext.getFulfilledApis());
        return moduleContext2;
    }

    protected ModuleContext(Context context, ModuleContext moduleContext, String str, Resources resources) {
        this();
        a(context, moduleContext.a, moduleContext.c, moduleContext.d, moduleContext.e, str, resources, moduleContext.h, moduleContext.getFulfilledApis());
    }
}
