package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* renamed from: afss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afss {
    public static ByteBuffer a(Iterable iterable) {
        String str;
        Iterator it = iterable.iterator();
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (it.hasNext()) {
            j += (long) (((audx) it.next()).p() + 12);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                audx audx = (audx) it2.next();
                int p = audx.p();
                try {
                    allocate.putInt(p);
                    int i3 = i + 4;
                    try {
                        audx.a(aubk.c(array, i3, p));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i3, p);
                        int i4 = i3 + p;
                        CRC32 crc32 = new CRC32();
                        crc32.update(array, i4 - p, p);
                        allocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        a(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    a(e3);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e4) {
            Object[] objArr = new Object[1];
            if (j > 1073741824) {
                Locale locale = Locale.US;
                double d = (double) j;
                Double.isNaN(d);
                str = String.format(locale, "%.2fGB", new Object[]{Double.valueOf(d / 1.073741824E9d)});
            } else if (j > 1048576) {
                Locale locale2 = Locale.US;
                double d2 = (double) j;
                Double.isNaN(d2);
                str = String.format(locale2, "%.2fMB", new Object[]{Double.valueOf(d2 / 1048576.0d)});
            } else if (j > 1024) {
                Locale locale3 = Locale.US;
                double d3 = (double) j;
                Double.isNaN(d3);
                str = String.format(locale3, "%.2fKB", new Object[]{Double.valueOf(d3 / 1024.0d)});
            } else {
                str = String.format(Locale.US, "%d Bytes", new Object[]{Long.valueOf(j)});
            }
            objArr[0] = str;
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[LOOP:0: B:1:0x0019->B:25:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.nio.ByteBuffer r16, java.lang.Class r17, defpackage.auef r18) {
        /*
            r1 = r16
            java.lang.String r2 = "ProtoLiteUtil"
            java.lang.String r3 = r17.toString()
            int r4 = r16.limit()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r16.limit()
            int r0 = r0 / 1000
            r6 = 1
            int r0 = r0 + r6
            r5.<init>(r0)
        L_0x0019:
            int r0 = r16.position()
            if (r0 >= r4) goto L_0x00ff
            r7 = 0
            r8 = 0
            int r9 = r16.getInt()     // Catch:{ BufferUnderflowException -> 0x00ef }
            r0 = 2
            if (r9 >= 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            r0[r6] = r3
            java.lang.String r1 = "Invalid message size: %d. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r7
        L_0x003c:
            int r10 = r16.position()
            int r10 = r10 + r9
            int r10 = r10 + 8
            if (r4 < r10) goto L_0x00d7
            int r10 = r16.position()
            int r10 = r10 + r9
            long r10 = r1.getLong(r10)
            byte[] r12 = r16.array()
            int r13 = r16.arrayOffset()
            int r14 = r16.position()
            java.util.zip.CRC32 r15 = new java.util.zip.CRC32
            r15.<init>()
            int r13 = r13 + r14
            r15.update(r12, r13, r9)
            long r12 = r15.getValue()
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x00bf
            byte[] r0 = r16.array()
            int r8 = r16.arrayOffset()
            int r10 = r16.position()
            int r8 = r8 + r10
            aubs r10 = defpackage.aubs.b()     // Catch:{ auda -> 0x0087 }
            r11 = r18
            java.lang.Object r0 = r11.c(r0, r8, r9, r10)     // Catch:{ auda -> 0x0085 }
            audx r0 = (defpackage.audx) r0     // Catch:{ auda -> 0x0085 }
            goto L_0x00ad
        L_0x0085:
            r0 = move-exception
            goto L_0x008a
        L_0x0087:
            r0 = move-exception
            r11 = r18
        L_0x008a:
            java.lang.String r8 = java.lang.String.valueOf(r17)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r10 = r10 + 35
            r12.<init>(r10)
            java.lang.String r10 = "Cannot deserialize message of type "
            r12.append(r10)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            android.util.Log.e(r2, r8, r0)
            r0 = r7
        L_0x00ad:
            if (r0 == 0) goto L_0x00be
            r5.add(r0)
            int r0 = r16.position()
            int r0 = r0 + r9
            int r0 = r0 + 8
            r1.position(r0)
            goto L_0x0019
        L_0x00be:
            return r7
        L_0x00bf:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0[r8] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r6] = r1
            java.lang.String r1 = "Corrupt protobuf data, expected CRC: %d computed CRC: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        L_0x00d7:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r6] = r1
            java.lang.String r1 = "Invalid message size: %d (buffer end is %d)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0)
            return r5
        L_0x00ef:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r3
            java.lang.String r3 = "Buffer underflow. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            android.util.Log.e(r2, r0, r1)
            return r7
        L_0x00ff:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afss.a(java.nio.ByteBuffer, java.lang.Class, auef):java.util.List");
    }

    private static void a(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }
}
