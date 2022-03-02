package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: lr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lr extends ly {
    public static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        b = cls;
        a = method;
        d = method2;
    }

    private static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    private static Object a() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[LOOP:0: B:3:0x000e->B:41:0x006a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface a(android.content.Context r17, defpackage.kx r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            java.lang.Object r1 = a()
            r2 = 0
            if (r1 == 0) goto L_0x0073
            r0 = r18
            ky[] r3 = r0.a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L_0x000e:
            if (r5 >= r4) goto L_0x006e
            r6 = r3[r5]
            int r0 = r6.f
            java.io.File r7 = defpackage.lz.a((android.content.Context) r17)
            if (r7 == 0) goto L_0x0059
            r8 = r19
            boolean r0 = defpackage.lz.a(r7, r8, r0)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0050
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004a }
            r9.<init>(r7)     // Catch:{ IOException -> 0x004a }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x003b }
            long r14 = r10.size()     // Catch:{ all -> 0x003b }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x003b }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x003b }
            r9.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004c
        L_0x003b:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r11 = r0
            r9.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            r0 = move-exception
            r9 = r0
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r9)     // Catch:{ IOException -> 0x004a }
        L_0x0049:
            throw r11     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r0 = move-exception
            r0 = r2
        L_0x004c:
            r7.delete()
            goto L_0x005c
        L_0x0050:
            r7.delete()
            goto L_0x005b
        L_0x0054:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0059:
            r8 = r19
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r0 == 0) goto L_0x006d
            int r7 = r6.e
            int r9 = r6.b
            boolean r6 = r6.c
            boolean r0 = a(r1, r0, r7, r9, r6)
            if (r0 == 0) goto L_0x006d
            int r5 = r5 + 1
            goto L_0x000e
        L_0x006d:
            return r2
        L_0x006e:
            android.graphics.Typeface r0 = a(r1)
            return r0
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr.a(android.content.Context, kx, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface a(Context context, nc[] ncVarArr, int i) {
        Object a2 = a();
        if (a2 != null) {
            ou ouVar = new ou();
            for (nc ncVar : ncVarArr) {
                Uri uri = ncVar.a;
                ByteBuffer byteBuffer = (ByteBuffer) ouVar.get(uri);
                if (byteBuffer == null) {
                    byteBuffer = lz.a(context, uri);
                    ouVar.put(uri, byteBuffer);
                }
                if (byteBuffer == null || !a(a2, byteBuffer, ncVar.b, ncVar.c, ncVar.d)) {
                    return null;
                }
            }
            Typeface a3 = a(a2);
            if (a3 != null) {
                return Typeface.create(a3, i);
            }
        }
        return null;
    }
}
