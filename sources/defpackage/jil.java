package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: jil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jil {
    public static final LruCache a = new LruCache(16);
    private static final WeakHashMap b = new WeakHashMap();

    private static ansh a(ModuleManager.ConfigInfo configInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        aucd o = ansh.e.o();
        if (configInfo != null) {
            for (ModuleManager.ModuleSetInfo moduleSetInfo : configInfo.moduleSets) {
                iva.a(moduleSetInfo != null);
                aucd o2 = ansk.g.o();
                try {
                    o2.b(moduleSetInfo.getProtoBytes());
                } catch (auda e) {
                    String str = moduleSetInfo.moduleSetId;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    ansk ansk = (ansk) o2.b;
                    str.getClass();
                    int i = 1 | ansk.a;
                    ansk.a = i;
                    ansk.b = str;
                    int i2 = moduleSetInfo.moduleSetVariant;
                    int i3 = i | 2;
                    ansk.a = i3;
                    ansk.c = i2;
                    int i4 = moduleSetInfo.moduleTargeting;
                    ansk.a = i3 | 4;
                    ansk.d = i4;
                }
                ansk ansk2 = (ansk) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ansh ansh = (ansh) o.b;
                ansk2.getClass();
                ansh.a();
                ansh.b.add(ansk2);
            }
            if (!configInfo.optionalModules.isEmpty()) {
                Collection<ModuleManager.ModuleInfo> collection = configInfo.optionalModules;
                ou ouVar = new ou(collection.size());
                for (ModuleManager.ModuleInfo moduleInfo : collection) {
                    if (moduleInfo != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    iva.a(z3);
                    aucd o3 = ansj.d.o();
                    String str2 = moduleInfo.moduleId;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    ansj ansj = (ansj) o3.b;
                    str2.getClass();
                    int i5 = ansj.a | 1;
                    ansj.a = i5;
                    ansj.b = str2;
                    int i6 = moduleInfo.moduleVersion;
                    ansj.a = i5 | 2;
                    ansj.c = i6;
                    ansj ansj2 = (ansj) o3.i();
                    ArrayList arrayList = (ArrayList) ouVar.get(moduleInfo.moduleApk);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        ouVar.put(moduleInfo.moduleApk, arrayList);
                    }
                    arrayList.add(ansj2);
                }
                for (int i7 = 0; i7 < ouVar.h; i7++) {
                    ArrayList arrayList2 = (ArrayList) ouVar.c(i7);
                    if (arrayList2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    irk.a(z);
                    ModuleManager.ModuleApkInfo moduleApkInfo = (ModuleManager.ModuleApkInfo) ouVar.b(i7);
                    if (moduleApkInfo != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    iva.a(z2);
                    aucd o4 = ansi.f.o();
                    String str3 = moduleApkInfo.apkPackageName;
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    ansi ansi = (ansi) o4.b;
                    str3.getClass();
                    int i8 = ansi.a | 1;
                    ansi.a = i8;
                    ansi.b = str3;
                    int i9 = moduleApkInfo.apkVersionCode;
                    ansi.a = i8 | 4;
                    ansi.d = i9;
                    if (!ansi.e.a()) {
                        ansi.e = aucj.a(ansi.e);
                    }
                    auab.a((Iterable) arrayList2, (List) ansi.e);
                    String str4 = moduleApkInfo.apkVersionName;
                    if (str4 != null) {
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        ansi ansi2 = (ansi) o4.b;
                        str4.getClass();
                        ansi2.a |= 2;
                        ansi2.c = str4;
                    }
                    ansi ansi3 = (ansi) o4.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ansh ansh2 = (ansh) o.b;
                    ansi3.getClass();
                    if (!ansh2.c.a()) {
                        ansh2.c = aucj.a(ansh2.c);
                    }
                    ansh2.c.add(ansi3);
                }
            }
            int i10 = configInfo.chimeraConfigModifierFlags;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansh ansh3 = (ansh) o.b;
            ansh3.a |= 1;
            ansh3.d = i10;
        }
        return (ansh) o.i();
    }

    public static ansh b(ModuleManager moduleManager) {
        ModuleManager.ConfigInfo configInfo;
        try {
            configInfo = moduleManager.getCurrentConfig();
        } catch (InvalidConfigException e) {
            Log.w("ChimeraUtils", "Can't get Chimera config");
            configInfo = null;
        }
        return a(configInfo);
    }

    public static ModuleManager.ModuleInfo c(Context context) {
        try {
            return ModuleManager.get(context).getCurrentModule();
        } catch (IllegalStateException e) {
            Log.w("ChimeraUtils", "Non Chimera context");
            return null;
        }
    }

    public static CharSequence d(Context context) {
        try {
            return context.getResources().getString(R.string.common_app_name);
        } catch (Resources.NotFoundException e) {
            Log.w("ChimeraUtils", "Missing string: common_app_name");
            return "Google Play services";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        android.util.Log.w("ChimeraUtils", java.lang.String.format("Module %s has invalid metadata: %s", new java.lang.Object[]{r3.moduleId, r10.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r10 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[ExcHandler: InvalidConfigException (r10v12 'e' com.google.android.chimera.config.InvalidConfigException A[CUSTOM_DECLARE]), Splitter:B:4:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence b(android.content.Context r10) {
        /*
            java.lang.String r0 = "display_name_string_id"
            java.lang.String r1 = "ChimeraUtils"
            android.content.res.Resources r2 = r10.getResources()
            com.google.android.chimera.config.ModuleManager$ModuleInfo r3 = c(r10)
            r4 = 0
            if (r3 == 0) goto L_0x008d
            if (r2 == 0) goto L_0x008d
            r5 = -1
            r6 = 1
            r7 = 0
            r8 = 2
            android.os.Bundle r10 = r3.getMetadata(r10)     // Catch:{ NotFoundException -> 0x0073, RuntimeException -> 0x005f, InvalidConfigException -> 0x0048 }
            java.lang.String r10 = r10.getString(r0)     // Catch:{ NotFoundException -> 0x0073, RuntimeException -> 0x005f, InvalidConfigException -> 0x0048 }
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            if (r9 == 0) goto L_0x0035
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            java.lang.String r9 = r3.moduleId     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            r2[r7] = r9     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            r2[r6] = r0     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            java.lang.String r0 = "Module %s has empty metadata %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            android.util.Log.w(r1, r0)     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            goto L_0x008d
        L_0x0035:
            java.lang.String r0 = "string"
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r9 = r3.moduleApk     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            java.lang.String r9 = r9.apkPackageName     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            int r5 = r2.getIdentifier(r10, r0, r9)     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            java.lang.CharSequence r10 = r2.getText(r5)     // Catch:{ NotFoundException -> 0x0046, RuntimeException -> 0x0044, InvalidConfigException -> 0x0048 }
            return r10
        L_0x0044:
            r0 = move-exception
            goto L_0x0061
        L_0x0046:
            r0 = move-exception
            goto L_0x0075
        L_0x0048:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r3.moduleId
            r0[r7] = r2
            java.lang.String r10 = r10.getMessage()
            r0[r6] = r10
            java.lang.String r10 = "Module %s has invalid metadata: %s"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            android.util.Log.w(r1, r10)
            goto L_0x008d
        L_0x005f:
            r10 = move-exception
            r10 = r4
        L_0x0061:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r3.moduleId
            r0[r7] = r2
            r0[r6] = r10
            java.lang.String r10 = "Module %s missing resource %s"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            android.util.Log.w(r1, r10)
            goto L_0x008d
        L_0x0073:
            r10 = move-exception
            r10 = r4
        L_0x0075:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r3.moduleId
            r0[r7] = r2
            r0[r6] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r0[r8] = r10
            java.lang.String r10 = "Module %s missing resource %s(%d)"
            java.lang.String r10 = java.lang.String.format(r10, r0)
            android.util.Log.w(r1, r10)
        L_0x008d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jil.b(android.content.Context):java.lang.CharSequence");
    }

    public static String a(Context context) {
        ModuleManager.ModuleInfo c = c(context);
        if (c == null) {
            return null;
        }
        String str = c.moduleId;
        if (str == null) {
            Log.w("ChimeraUtils", "Null module id!");
            return null;
        }
        if (str.startsWith("com.google.android.gms.")) {
            str = str.substring(23);
        } else {
            Log.w("ChimeraUtils", str.length() == 0 ? new String("Unexpected module id prefix: ") : "Unexpected module id prefix: ".concat(str));
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("ChimeraUtils", "Empty module id ignored");
        return null;
    }

    public static String a(String str) {
        if (str.startsWith("com.google.android.gms.")) {
            return str.substring(23);
        }
        return str.isEmpty() ? "container" : str;
    }

    public static jik a(ModuleManager moduleManager) {
        ModuleManager.ConfigInfo configInfo;
        jik jik;
        try {
            configInfo = moduleManager.getCurrentConfig();
        } catch (InvalidConfigException e) {
            Log.w("ChimeraUtils", "Can't get Chimera config");
            configInfo = null;
        }
        synchronized (b) {
            jik = (jik) b.get(configInfo);
            if (jik == null) {
                jik = new jik(a(configInfo));
                b.put(configInfo, jik);
            }
        }
        return jik;
    }
}
