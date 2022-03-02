package com.google.android.gms.framework.tracing;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.io.Closeable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbstractGmsTracer {
    public static final /* synthetic */ int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(true);
    private static final AtomicBoolean h = new AtomicBoolean(true);
    private static final ConcurrentMap i = new ConcurrentHashMap(10);
    final ClassLoader a;
    final int b;
    final String c;
    final String d;
    final int e;

    public AbstractGmsTracer(ClassLoader classLoader, int i2, Context context, String str) {
        String str2;
        this.a = classLoader;
        this.e = i2;
        int i3 = -1;
        String str3 = "unknown";
        if (jlo.b() >= 14768000) {
            ModuleManager.BasicModuleInfo basicModuleInfo = ModuleManager.getBasicModuleInfo(context);
            iva.a((Object) basicModuleInfo, (Object) "A Chimera Context is required");
            if (!(basicModuleInfo == null || (str2 = basicModuleInfo.moduleId) == null)) {
                String a2 = jil.a(str2);
                i3 = basicModuleInfo.moduleVersion;
                str3 = a2;
            }
        } else {
            ModuleManager.ModuleInfo c2 = jil.c(context);
            iva.a((Object) c2, (Object) "A Chimera Context is required");
            if (c2 != null) {
                str3 = jil.a(c2.moduleId);
                i3 = c2.moduleVersion;
            }
        }
        this.c = str3;
        this.b = i3;
        this.d = str != null ? b(str) : "";
    }

    static amky a(nkg nkg, String str, nih nih, boolean z) {
        if (amlv.b(amlw.a)) {
            return nkg.a(amlv.a(str, amlw.a, nku.a(nih, z)));
        }
        amkv a2 = nku.a(nih);
        amkz a3 = nku.a();
        amrl.a((Object) amlw.a);
        return nkg.a(new amkr(a3.a.a(str, amkv.a(a3.b, a2), 2, a3.c)));
    }

    private final String b(String str) {
        StringBuilder sb = new StringBuilder(this.c.length() + str.length() + 2);
        sb.append(this.c);
        sb.append('-');
        sb.append(str);
        sb.append('_');
        return sb.toString();
    }

    private static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z) {
        nih nih = null;
        if (bArr != null) {
            try {
                nih = (nih) aucj.a((aucj) nih.f, bArr, aubs.c());
            } catch (auda e2) {
                Log.e("AbstractGmsTracer", "Invalid GCoreClientInfo bytes.");
            }
        }
        return a(nkf.b, str, nih, z);
    }

    public AbstractGmsTracer(ClassLoader classLoader, int i2, String str, String str2) {
        this.a = classLoader;
        this.e = i2;
        this.c = str;
        this.b = -1;
        this.d = b(str2);
    }

    private static final String a(Bundle bundle, String str) {
        String string;
        if (bundle == null) {
            return null;
        }
        synchronized (bundle) {
            try {
                string = bundle.getString(str);
            } catch (BadParcelableException e2) {
                Log.e("AbstractGmsTracer", "Exception unparcelling Intent swallowed", e2);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    private static void a() {
        boolean andSet = g.getAndSet(false);
    }

    private static void a(Exception exc) {
        if (h.getAndSet(false)) {
            Log.e("AbstractGmsTracer", "Reflection failed", exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[SYNTHETIC, Splitter:B:16:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.amky a(java.lang.String r9, defpackage.amsv r10, android.content.Intent r11, boolean r12) {
        /*
            r8 = this;
            java.lang.Class<com.google.android.gms.framework.tracing.AbstractGmsTracer> r0 = com.google.android.gms.framework.tracing.AbstractGmsTracer.class
            nih r10 = r8.a(r9, r10, r11)
            java.lang.ClassLoader r11 = r8.a
            java.lang.ClassLoader r1 = r0.getClassLoader()
            if (r11 == r1) goto L_0x0084
            java.lang.ClassLoader r11 = r8.a
            java.util.concurrent.ConcurrentMap r1 = i
            java.lang.Object r1 = r1.get(r11)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 1
            if (r1 != 0) goto L_0x0050
            java.lang.String r0 = r0.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r11)     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.Class<byte[]> r7 = byte[].class
            r6[r5] = r7     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            r6[r2] = r7     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            java.lang.String r7 = "beginTraceInternalUsingReflection"
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r7, r6)     // Catch:{ ClassNotFoundException -> 0x004c, NoSuchMethodException -> 0x0047 }
            r1.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x0045, NoSuchMethodException -> 0x0043 }
            java.util.concurrent.ConcurrentMap r0 = i     // Catch:{ ClassNotFoundException -> 0x0045, NoSuchMethodException -> 0x0043 }
            r0.put(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0045, NoSuchMethodException -> 0x0043 }
            goto L_0x0050
        L_0x0043:
            r11 = move-exception
            goto L_0x0048
        L_0x0045:
            r11 = move-exception
            goto L_0x004d
        L_0x0047:
            r11 = move-exception
        L_0x0048:
            a()
            goto L_0x0050
        L_0x004c:
            r11 = move-exception
        L_0x004d:
            a()
        L_0x0050:
            r11 = 0
            if (r1 == 0) goto L_0x007a
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            r0[r3] = r9     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            if (r10 == 0) goto L_0x005e
            byte[] r9 = r10.k()     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            goto L_0x005f
        L_0x005e:
            r9 = r11
        L_0x005f:
            r0[r5] = r9     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            r0[r2] = r9     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            java.lang.Object r9 = r1.invoke(r11, r0)     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch:{ IllegalAccessException -> 0x0074, InvocationTargetException -> 0x006e }
            goto L_0x007b
        L_0x006e:
            r9 = move-exception
            a((java.lang.Exception) r9)
            r9 = r11
            goto L_0x007b
        L_0x0074:
            r9 = move-exception
            a((java.lang.Exception) r9)
            r9 = r11
            goto L_0x007b
        L_0x007a:
            r9 = r11
        L_0x007b:
            if (r9 == 0) goto L_0x0083
            njg r10 = new njg
            r10.<init>(r9)
            return r10
        L_0x0083:
            return r11
        L_0x0084:
            nkg r11 = defpackage.nkf.b
            amky r9 = a((defpackage.nkg) r11, (java.lang.String) r9, (defpackage.nih) r10, (boolean) r12)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.a(java.lang.String, amsv, android.content.Intent, boolean):amky");
    }

    public final amky a(String str, boolean z) {
        return a(a(str), (amsv) null, (Intent) null, z);
    }

    public final String a(String str) {
        StringBuilder a2 = a(str.length());
        a2.append(str);
        return a2.toString();
    }

    public final StringBuilder a(int i2) {
        StringBuilder sb = new StringBuilder(this.d.length() + i2);
        sb.append(this.d);
        return sb;
    }

    /* access modifiers changed from: package-private */
    public final nih a(String str, amsv amsv, Intent intent) {
        int i2;
        int i3;
        int i4;
        int i5;
        String a2;
        nig nig;
        if (!axda.a.a().O()) {
            return null;
        }
        aucd o = nih.f.o();
        aucd o2 = nie.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        nie nie = (nie) o2.b;
        str.getClass();
        int i6 = 2;
        int i7 = nie.a | 2;
        nie.a = i7;
        nie.c = str;
        nie.b = this.e - 1;
        nie.a = i7 | 1;
        if (intent != null) {
            int a3 = nkd.a(intent);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            nie nie2 = (nie) o2.b;
            nie2.a |= 4;
            nie2.d = a3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        nih nih = (nih) o.b;
        nie nie3 = (nie) o2.i();
        nie3.getClass();
        nih.c = nie3;
        nih.a |= 2;
        if (!TextUtils.isEmpty(this.c)) {
            aucd o3 = nii.d.o();
            String str2 = this.c;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            nii nii = (nii) o3.b;
            str2.getClass();
            int i8 = nii.a | 1;
            nii.a = i8;
            nii.b = str2;
            int i9 = this.b;
            if (i9 != -1) {
                nii.a = i8 | 2;
                nii.c = i9;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            nih nih2 = (nih) o.b;
            nii nii2 = (nii) o3.i();
            nii2.getClass();
            nih2.d = nii2;
            nih2.a |= 4;
        }
        if (axda.d()) {
            nig nig2 = amsv != null ? (nig) amsv.a() : null;
            if (!(intent == null || (a2 = a(intent.getExtras(), "gms_trace_module_LOGGED")) == null)) {
                nig2 = njm.a(a2, nig2);
                try {
                    intent.removeExtra("gms_trace_module_LOGGED");
                } catch (BadParcelableException e2) {
                    Log.e("AbstractGmsTracer", "Exception unparcelling Intent while removing swallowed", e2);
                    return null;
                }
            }
            if (nig2 != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nih nih3 = (nih) o.b;
                nig2.getClass();
                nih3.b = nig2;
                nih3.a |= 1;
            }
        } else if (!(amsv == null || amlv.b(amlw.a) || (nig = (nig) amsv.a()) == null)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            nih nih4 = (nih) o.b;
            nig.getClass();
            nih4.b = nig;
            nih4.a |= 1;
        }
        njq njq = njp.a;
        if (!njq.a || njq.b == null || njq.c == null || njq.d == null) {
            i2 = 7;
        } else {
            boolean booleanValue = njq.b.booleanValue();
            if (!njq.c.booleanValue()) {
                i6 = 0;
            }
            int i10 = (booleanValue ? 1 : 0) + i6;
            if (!njq.d.booleanValue()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            int i11 = i10 + i3;
            if (!njq.e) {
                i4 = 0;
            } else {
                i4 = 16;
            }
            int i12 = i11 + i4;
            if (!njq.f) {
                i5 = 0;
            } else {
                i5 = 32;
            }
            i2 = i12 + i5;
        }
        if (i2 != 7) {
            aucd o4 = nic.c.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            nic nic = (nic) o4.b;
            nic.a |= 1;
            nic.b = i2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            nih nih5 = (nih) o.b;
            nic nic2 = (nic) o4.i();
            nic2.getClass();
            nih5.e = nic2;
            nih5.a |= 8;
        }
        return (nih) o.i();
    }
}
