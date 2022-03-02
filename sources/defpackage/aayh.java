package defpackage;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: aayh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayh {
    public final int a;
    public final boolean b;
    private final Object c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    private final Field h;
    private final Field i;
    private final Field j;
    private final Field k;
    private final int l;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.reflect.AccessibleObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aayh() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "readlink"
            java.lang.String r3 = ".Os"
            r17.<init>()
            java.lang.String r0 = "libcore.io.StructStat"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0012 }
            java.lang.String r0 = "libcore.io"
            r4 = r0
            goto L_0x0016
        L_0x0012:
            r0 = move-exception
            java.lang.String r0 = "android.system"
            r4 = r0
        L_0x0016:
            r5 = 1
            r6 = 0
            r7 = 0
            java.lang.String r0 = ".StructStat"
            java.lang.String r0 = r4.concat(r0)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.String r8 = ".OsConstants"
            java.lang.String r8 = r4.concat(r8)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.String r9 = r4.concat(r3)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.String r10 = "libcore.io.Libcore"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.String r11 = "os"
            java.lang.reflect.Field r10 = r10.getField(r11)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.Object r10 = r10.get(r7)     // Catch:{ NoSuchMethodException -> 0x0127, IllegalArgumentException -> 0x0125, IllegalAccessException -> 0x0123, ClassNotFoundException -> 0x0121, NoSuchFieldException -> 0x011f }
            java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0119, IllegalArgumentException -> 0x0117, IllegalAccessException -> 0x0115, ClassNotFoundException -> 0x0113, NoSuchFieldException -> 0x0111 }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r11[r6] = r12     // Catch:{ NoSuchMethodException -> 0x0119, IllegalArgumentException -> 0x0117, IllegalAccessException -> 0x0115, ClassNotFoundException -> 0x0113, NoSuchFieldException -> 0x0111 }
            java.lang.String r12 = "lstat"
            java.lang.reflect.Method r11 = r9.getMethod(r12, r11)     // Catch:{ NoSuchMethodException -> 0x0119, IllegalArgumentException -> 0x0117, IllegalAccessException -> 0x0115, ClassNotFoundException -> 0x0113, NoSuchFieldException -> 0x0111 }
            java.lang.Class[] r12 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x010b, IllegalArgumentException -> 0x0109, IllegalAccessException -> 0x0107, ClassNotFoundException -> 0x0105, NoSuchFieldException -> 0x0103 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x010b, IllegalArgumentException -> 0x0109, IllegalAccessException -> 0x0107, ClassNotFoundException -> 0x0105, NoSuchFieldException -> 0x0103 }
            r12[r6] = r13     // Catch:{ NoSuchMethodException -> 0x010b, IllegalArgumentException -> 0x0109, IllegalAccessException -> 0x0107, ClassNotFoundException -> 0x0105, NoSuchFieldException -> 0x0103 }
            java.lang.String r13 = "S_ISLNK"
            java.lang.reflect.Method r12 = r8.getMethod(r13, r12)     // Catch:{ NoSuchMethodException -> 0x010b, IllegalArgumentException -> 0x0109, IllegalAccessException -> 0x0107, ClassNotFoundException -> 0x0105, NoSuchFieldException -> 0x0103 }
            r13 = 2
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch:{ NoSuchMethodException -> 0x00fd, IllegalArgumentException -> 0x00fb, IllegalAccessException -> 0x00f9, ClassNotFoundException -> 0x00f7, NoSuchFieldException -> 0x00f5 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r13[r6] = r14     // Catch:{ NoSuchMethodException -> 0x00fd, IllegalArgumentException -> 0x00fb, IllegalAccessException -> 0x00f9, ClassNotFoundException -> 0x00f7, NoSuchFieldException -> 0x00f5 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00fd, IllegalArgumentException -> 0x00fb, IllegalAccessException -> 0x00f9, ClassNotFoundException -> 0x00f7, NoSuchFieldException -> 0x00f5 }
            r13[r5] = r14     // Catch:{ NoSuchMethodException -> 0x00fd, IllegalArgumentException -> 0x00fb, IllegalAccessException -> 0x00f9, ClassNotFoundException -> 0x00f7, NoSuchFieldException -> 0x00f5 }
            java.lang.String r14 = "access"
            java.lang.reflect.Method r9 = r9.getMethod(r14, r13)     // Catch:{ NoSuchMethodException -> 0x00fd, IllegalArgumentException -> 0x00fb, IllegalAccessException -> 0x00f9, ClassNotFoundException -> 0x00f7, NoSuchFieldException -> 0x00f5 }
            java.lang.String r13 = "X_OK"
            java.lang.reflect.Field r13 = r8.getField(r13)     // Catch:{ NoSuchMethodException -> 0x00ef, IllegalArgumentException -> 0x00ed, IllegalAccessException -> 0x00eb, ClassNotFoundException -> 0x00e9, NoSuchFieldException -> 0x00e7 }
            int r13 = r13.getInt(r7)     // Catch:{ NoSuchMethodException -> 0x00ef, IllegalArgumentException -> 0x00ed, IllegalAccessException -> 0x00eb, ClassNotFoundException -> 0x00e9, NoSuchFieldException -> 0x00e7 }
            java.lang.String r14 = "st_mode"
            java.lang.reflect.Field r14 = r0.getField(r14)     // Catch:{ NoSuchMethodException -> 0x00e0, IllegalArgumentException -> 0x00de, IllegalAccessException -> 0x00dc, ClassNotFoundException -> 0x00da, NoSuchFieldException -> 0x00d8 }
            java.lang.String r15 = "st_gid"
            java.lang.reflect.Field r15 = r0.getField(r15)     // Catch:{ NoSuchMethodException -> 0x00d2, IllegalArgumentException -> 0x00d0, IllegalAccessException -> 0x00ce, ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x00ca }
            java.lang.String r6 = "st_uid"
            java.lang.reflect.Field r6 = r0.getField(r6)     // Catch:{ NoSuchMethodException -> 0x00c5, IllegalArgumentException -> 0x00c3, IllegalAccessException -> 0x00c1, ClassNotFoundException -> 0x00bf, NoSuchFieldException -> 0x00bd }
            java.lang.String r5 = "st_mtime"
            java.lang.reflect.Field r0 = r0.getField(r5)     // Catch:{ NoSuchFieldException -> 0x009c, NoSuchMethodException -> 0x0098, IllegalArgumentException -> 0x0096, IllegalAccessException -> 0x0094, ClassNotFoundException -> 0x0092 }
            r5 = r0
            goto L_0x009e
        L_0x0092:
            r0 = move-exception
            goto L_0x0099
        L_0x0094:
            r0 = move-exception
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            goto L_0x0099
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            r5 = r7
            goto L_0x0131
        L_0x009c:
            r0 = move-exception
            r5 = r7
        L_0x009e:
            java.lang.String r0 = "S_ISUID"
            java.lang.reflect.Field r0 = r8.getField(r0)     // Catch:{ NoSuchMethodException -> 0x00ba, IllegalArgumentException -> 0x00b7, IllegalAccessException -> 0x00b4, ClassNotFoundException -> 0x00b1, NoSuchFieldException -> 0x00ae }
            int r0 = r0.getInt(r7)     // Catch:{ NoSuchMethodException -> 0x00ba, IllegalArgumentException -> 0x00b7, IllegalAccessException -> 0x00b4, ClassNotFoundException -> 0x00b1, NoSuchFieldException -> 0x00ae }
            r8 = r6
            r7 = 1
            r6 = r5
            r5 = r0
            goto L_0x0135
        L_0x00ae:
            r0 = move-exception
            goto L_0x0131
        L_0x00b1:
            r0 = move-exception
            goto L_0x0131
        L_0x00b4:
            r0 = move-exception
            goto L_0x0131
        L_0x00b7:
            r0 = move-exception
            goto L_0x0131
        L_0x00ba:
            r0 = move-exception
            goto L_0x0131
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c6
        L_0x00bf:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c3:
            r0 = move-exception
            goto L_0x00c6
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            r5 = r7
            r6 = r5
            goto L_0x0131
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d3
        L_0x00cc:
            r0 = move-exception
            goto L_0x00d3
        L_0x00ce:
            r0 = move-exception
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d3
        L_0x00d2:
            r0 = move-exception
        L_0x00d3:
            r5 = r7
            r6 = r5
            r15 = r6
            goto L_0x0131
        L_0x00d8:
            r0 = move-exception
            goto L_0x00e1
        L_0x00da:
            r0 = move-exception
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            goto L_0x00e1
        L_0x00de:
            r0 = move-exception
            goto L_0x00e1
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            r5 = r7
            r6 = r5
            r14 = r6
            r15 = r14
            goto L_0x0131
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f0
        L_0x00e9:
            r0 = move-exception
            goto L_0x00f0
        L_0x00eb:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ef:
            r0 = move-exception
        L_0x00f0:
            r5 = r7
            r6 = r5
            r14 = r6
            goto L_0x012f
        L_0x00f5:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            goto L_0x00fe
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            r5 = r7
            r6 = r5
            r9 = r6
            r14 = r9
            goto L_0x012f
        L_0x0103:
            r0 = move-exception
            goto L_0x010c
        L_0x0105:
            r0 = move-exception
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            goto L_0x010c
        L_0x0109:
            r0 = move-exception
            goto L_0x010c
        L_0x010b:
            r0 = move-exception
        L_0x010c:
            r5 = r7
            r6 = r5
            r9 = r6
            r12 = r9
            goto L_0x012e
        L_0x0111:
            r0 = move-exception
            goto L_0x011a
        L_0x0113:
            r0 = move-exception
            goto L_0x011a
        L_0x0115:
            r0 = move-exception
            goto L_0x011a
        L_0x0117:
            r0 = move-exception
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            r5 = r7
            r6 = r5
            r9 = r6
            r11 = r9
            goto L_0x012d
        L_0x011f:
            r0 = move-exception
            goto L_0x0128
        L_0x0121:
            r0 = move-exception
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            goto L_0x0128
        L_0x0125:
            r0 = move-exception
            goto L_0x0128
        L_0x0127:
            r0 = move-exception
        L_0x0128:
            r5 = r7
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x012d:
            r12 = r11
        L_0x012e:
            r14 = r12
        L_0x012f:
            r15 = r14
            r13 = 0
        L_0x0131:
            r8 = r6
            r7 = 0
            r6 = r5
            r5 = 0
        L_0x0135:
            java.lang.String r0 = r4.concat(r3)     // Catch:{ NoSuchMethodException -> 0x014f, ClassNotFoundException -> 0x014c }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x014f, ClassNotFoundException -> 0x014c }
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x014f, ClassNotFoundException -> 0x014c }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r16 = 0
            r4[r16] = r3     // Catch:{ NoSuchMethodException -> 0x014f, ClassNotFoundException -> 0x014c }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x014f, ClassNotFoundException -> 0x014c }
            goto L_0x016b
        L_0x014c:
            r0 = move-exception
        L_0x014d:
            r0 = 0
            goto L_0x016b
        L_0x014f:
            r0 = move-exception
            r3 = 1
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0169 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r0[r4] = r3     // Catch:{ NoSuchMethodException -> 0x0169 }
            java.lang.Class<java.io.File> r3 = java.io.File.class
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0169 }
            if (r2 == 0) goto L_0x0166
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0165 }
            goto L_0x0166
        L_0x0165:
            r0 = move-exception
        L_0x0166:
            r0 = r2
            goto L_0x016b
        L_0x0169:
            r0 = move-exception
            goto L_0x014d
        L_0x016b:
            r1.c = r10
            r1.d = r11
            r1.e = r12
            r1.f = r0
            r1.g = r9
            r1.h = r14
            r1.i = r15
            r1.j = r8
            r1.k = r6
            r1.l = r13
            r1.a = r5
            r1.b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayh.<init>():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[ExcHandler: InvocationTargetException (e java.lang.reflect.InvocationTargetException), Splitter:B:3:0x0008] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aayf a(java.io.File r8) {
        /*
            r7 = this;
            boolean r0 = r7.b
            if (r0 == 0) goto L_0x0072
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.reflect.Method r0 = r7.d     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.Object r1 = r7.c     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r4 = 0
            r3[r4] = r8     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            aayf r1 = new aayf     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r1.<init>()     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.reflect.Field r3 = r7.j     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            int r3 = r3.getInt(r0)     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r1.b = r3     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.reflect.Field r3 = r7.i     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            int r3 = r3.getInt(r0)     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r1.a = r3     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.reflect.Field r3 = r7.h     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            int r3 = r3.getInt(r0)     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r1.c = r3     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            java.lang.reflect.Field r3 = r7.k     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            if (r3 != 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            long r5 = r3.getLong(r0)     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            r1.d = r5     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
        L_0x003e:
            r0 = 0
            java.lang.String r3 = "android.os.SELinux"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r4] = r6     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.String r6 = "getFileContext"
            java.lang.reflect.Method r3 = r3.getMethod(r6, r5)     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            r2[r4] = r8     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.Object r8 = r3.invoke(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ClassNotFoundException -> 0x0063, IllegalAccessException -> 0x0061, IllegalArgumentException -> 0x005f, NoSuchMethodException -> 0x005d, InvocationTargetException -> 0x0069 }
            r0 = r8
            goto L_0x0064
        L_0x005d:
            r8 = move-exception
            goto L_0x0064
        L_0x005f:
            r8 = move-exception
            goto L_0x0064
        L_0x0061:
            r8 = move-exception
            goto L_0x0064
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            r1.e = r0     // Catch:{ IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0069, IllegalArgumentException -> 0x0067 }
            return r1
        L_0x0067:
            r8 = move-exception
            goto L_0x006c
        L_0x0069:
            r8 = move-exception
            goto L_0x006c
        L_0x006b:
            r8 = move-exception
        L_0x006c:
            aayg r0 = new aayg
            r0.<init>(r8)
            throw r0
        L_0x0072:
            aayg r8 = new aayg
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayh.a(java.io.File):aayf");
    }

    /* access modifiers changed from: package-private */
    public final boolean b(File file) {
        if (this.b) {
            String absolutePath = file.getAbsolutePath();
            try {
                int i2 = this.h.getInt(this.d.invoke(this.c, new Object[]{absolutePath}));
                try {
                    return ((Boolean) this.e.invoke((Object) null, new Object[]{Integer.valueOf(i2)})).booleanValue();
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    throw new aayg(e2);
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                throw new aayg(e3);
            }
        } else {
            throw new aayg();
        }
    }

    /* access modifiers changed from: package-private */
    public final String c(File file) {
        if (!this.b || this.f == null) {
            throw new aayg();
        }
        String absolutePath = file.getAbsolutePath();
        try {
            return (String) this.f.invoke(this.c, new Object[]{absolutePath});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw new aayg(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (this.b) {
            try {
                return ((Boolean) this.g.invoke(this.c, new Object[]{str, Integer.valueOf(this.l)})).booleanValue();
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                throw new aayg(e2);
            }
        } else {
            throw new aayg();
        }
    }
}
