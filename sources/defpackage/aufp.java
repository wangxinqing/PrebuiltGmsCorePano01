package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: aufp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aufp {
    public static final aufo a;
    public static final boolean b;
    public static final boolean c;
    static final long d = ((long) b(byte[].class));
    static final boolean e = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    private static final Logger f = Logger.getLogger(aufp.class.getName());
    private static final Unsafe g = a();
    private static final Class h = auag.a;
    private static final boolean i = c(Long.TYPE);
    private static final boolean j = c(Integer.TYPE);
    private static final long k;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0165 A[SYNTHETIC, Splitter:B:37:0x0165] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0319  */
    static {
        /*
            java.lang.String r0 = "copyMemory"
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<aufp> r6 = defpackage.aufp.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f = r6
            sun.misc.Unsafe r6 = a()
            g = r6
            java.lang.Class r6 = defpackage.auag.a
            h = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = c(r6)
            i = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = c(r6)
            j = r6
            sun.misc.Unsafe r6 = g
            r7 = 0
            if (r6 == 0) goto L_0x005d
            boolean r6 = defpackage.auag.a()
            if (r6 != 0) goto L_0x0045
            aufn r7 = new aufn
            sun.misc.Unsafe r6 = g
            r7.<init>(r6)
            goto L_0x005e
        L_0x0045:
            boolean r6 = i
            if (r6 == 0) goto L_0x0051
            aufm r7 = new aufm
            sun.misc.Unsafe r6 = g
            r7.<init>(r6)
            goto L_0x005e
        L_0x0051:
            boolean r6 = j
            if (r6 == 0) goto L_0x005d
            aufl r7 = new aufl
            sun.misc.Unsafe r6 = g
            r7.<init>(r6)
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            a = r7
            sun.misc.Unsafe r6 = g
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putInt"
            java.lang.String r9 = "putByte"
            java.lang.String r10 = "getInt"
            java.lang.String r11 = "getByte"
            java.lang.String r12 = "objectFieldOffset"
            java.lang.String r13 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r14 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r15 = "getLong"
            r16 = r1
            r1 = 1
            r17 = 0
            if (r6 == 0) goto L_0x015a
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x012d }
            r18 = r2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class<java.lang.reflect.Field> r19 = java.lang.reflect.Field.class
            r2[r17] = r19     // Catch:{ all -> 0x012b }
            r6.getMethod(r12, r2)     // Catch:{ all -> 0x012b }
            r2 = 2
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x012b }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x012b }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r19 = 1
            r1[r19] = r2     // Catch:{ all -> 0x012b }
            r6.getMethod(r15, r1)     // Catch:{ all -> 0x012b }
            java.lang.reflect.Field r1 = b()     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x015c
            boolean r1 = defpackage.auag.a()     // Catch:{ all -> 0x012b }
            if (r1 != 0) goto L_0x0127
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r2[r17] = r1     // Catch:{ all -> 0x012b }
            r6.getMethod(r11, r2)     // Catch:{ all -> 0x012b }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x012b }
            r2[r17] = r1     // Catch:{ all -> 0x012b }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x012b }
            r20 = r3
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r9, r2)     // Catch:{ all -> 0x0125 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            r6.getMethod(r10, r1)     // Catch:{ all -> 0x0125 }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r8, r2)     // Catch:{ all -> 0x0125 }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            r6.getMethod(r15, r1)     // Catch:{ all -> 0x0125 }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r7, r2)     // Catch:{ all -> 0x0125 }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r2[r17] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x0125 }
            r6.getMethod(r0, r2)     // Catch:{ all -> 0x0125 }
            r1 = 5
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ all -> 0x0125 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0125 }
            r2 = 4
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0125 }
            r1[r2] = r3     // Catch:{ all -> 0x0125 }
            r6.getMethod(r0, r1)     // Catch:{ all -> 0x0125 }
            r0 = 1
            goto L_0x015f
        L_0x0125:
            r0 = move-exception
            goto L_0x0132
        L_0x0127:
            r20 = r3
            r0 = 1
            goto L_0x015f
        L_0x012b:
            r0 = move-exception
            goto L_0x0130
        L_0x012d:
            r0 = move-exception
            r18 = r2
        L_0x0130:
            r20 = r3
        L_0x0132:
            java.util.logging.Logger r1 = f
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 71
            r6.<init>(r3)
            r6.append(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeByteBufferOperations"
            r1.logp(r2, r13, r3, r0)
            r0 = 0
            goto L_0x015f
        L_0x015a:
            r18 = r2
        L_0x015c:
            r20 = r3
            r0 = 0
        L_0x015f:
            b = r0
            sun.misc.Unsafe r0 = g
            if (r0 == 0) goto L_0x02c5
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r12, r2)     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "arrayBaseOffset"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "arrayIndexScale"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r10, r2)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r8, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            r0.getMethod(r15, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r7, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getObject"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putObject"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            boolean r1 = defpackage.auag.a()     // Catch:{ all -> 0x029a }
            if (r1 != 0) goto L_0x0296
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r11, r2)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Byte.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            r0.getMethod(r9, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getBoolean"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putBoolean"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getFloat"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ all -> 0x029a }
            r3 = 2
            r2[r3] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "putFloat"
            r0.getMethod(r1, r2)     // Catch:{ all -> 0x029a }
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "getDouble"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x029a }
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ all -> 0x029a }
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r1[r17] = r2     // Catch:{ all -> 0x029a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x029a }
            r19 = 1
            r1[r19] = r2     // Catch:{ all -> 0x0294 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0294 }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x0294 }
            java.lang.String r2 = "putDouble"
            r0.getMethod(r2, r1)     // Catch:{ all -> 0x0294 }
            r0 = 1
            goto L_0x02c8
        L_0x0294:
            r0 = move-exception
            goto L_0x029d
        L_0x0296:
            r19 = 1
            r0 = 1
            goto L_0x02c8
        L_0x029a:
            r0 = move-exception
            r19 = 1
        L_0x029d:
            java.util.logging.Logger r1 = f
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 71
            r6.<init>(r3)
            r6.append(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r13, r3, r0)
            r0 = 0
            goto L_0x02c8
        L_0x02c5:
            r19 = 1
            r0 = 0
        L_0x02c8:
            c = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r0 = (long) r0
            d = r0
            b(r5)
            d(r5)
            b(r4)
            d(r4)
            b(r20)
            d(r20)
            b(r18)
            d(r18)
            b(r16)
            d(r16)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            d(r0)
            java.lang.reflect.Field r0 = b()
            r1 = -1
            if (r0 == 0) goto L_0x030c
            aufo r3 = a
            if (r3 == 0) goto L_0x030c
            long r1 = r3.a((java.lang.reflect.Field) r0)
            goto L_0x030d
        L_0x030c:
        L_0x030d:
            k = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0319
            r1 = 1
            goto L_0x031a
        L_0x0319:
            r1 = 0
        L_0x031a:
            e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aufp.<clinit>():void");
    }

    private aufp() {
    }

    static byte a(long j2) {
        return a.a(j2);
    }

    private static int b(Class cls) {
        if (c) {
            return a.a(cls);
        }
        return -1;
    }

    private static boolean c(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (auag.a()) {
            try {
                Class cls3 = h;
                cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
                cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
                cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
                cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
                cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
                cls3.getMethod("peekByte", new Class[]{cls});
                cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
                cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    static float d(Object obj, long j2) {
        return a.c(obj, j2);
    }

    static double e(Object obj, long j2) {
        return a.d(obj, j2);
    }

    static Object f(Object obj, long j2) {
        return a.g(obj, j2);
    }

    public static byte g(Object obj, long j2) {
        return (byte) ((a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j2) {
        return (byte) ((a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static boolean i(Object obj, long j2) {
        return g(obj, j2) != 0;
    }

    public static boolean j(Object obj, long j2) {
        return h(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return a.a((Object) bArr, d + j2);
    }

    static long b(Object obj, long j2) {
        return a.f(obj, j2);
    }

    private static void d(Class cls) {
        if (c) {
            a.b(cls);
        }
    }

    static int a(Object obj, long j2) {
        return a.e(obj, j2);
    }

    private static Field b() {
        Field a2;
        if (auag.a() && (a2 = a(Buffer.class, "effectiveDirectAddress")) != null) {
            return a2;
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    static boolean c(Object obj, long j2) {
        return a.b(obj, j2);
    }

    static long a(ByteBuffer byteBuffer) {
        return a.f(byteBuffer, k);
    }

    static Object a(Class cls) {
        try {
            return g.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void b(Object obj, long j2, byte b2) {
        int i2 = (((int) j2) & 3) << 3;
        long j3 = j2 & -4;
        a(obj, j3, ((b2 & 255) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new aufk());
        } catch (Throwable th) {
            return null;
        }
    }

    static void a(long j2, byte b2) {
        a.a(j2, b2);
    }

    static void a(long j2, byte[] bArr, long j3) {
        a.a(j2, bArr, j3);
    }

    public static void a(Object obj, long j2, byte b2) {
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        long j3 = j2 & -4;
        a(obj, j3, ((b2 & 255) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static void a(Object obj, long j2, double d2) {
        a.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        a.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        a.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        a.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        a.a(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        a.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        a.a((Object) bArr, d + j2, b2);
    }
}
