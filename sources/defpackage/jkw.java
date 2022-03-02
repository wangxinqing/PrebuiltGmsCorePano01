package defpackage;

import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

/* renamed from: jkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkw {
    public static audx a(byte[] bArr, int i, int i2, Class cls, auef auef) {
        try {
            return (audx) auef.a(bArr, i, i2);
        } catch (auda e) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Cannot deserialize message of type ");
            sb.append(valueOf);
            Log.e("ProtoLiteUtils", sb.toString(), e);
            return null;
        }
    }

    public static ByteBuffer a(Iterable iterable, boolean z) {
        String str;
        long j = !z ? 0 : 8;
        int i = !z ? 12 : 4;
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            j += (long) (((audx) it.next()).p() + i);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it2 = iterable.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                audx audx = (audx) it2.next();
                int p = audx.p();
                try {
                    allocate.putInt(p);
                    int i4 = i3 + 4;
                    try {
                        audx.a(aubk.c(array, i4, p));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtils", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i4, p);
                        i3 = i4 + p;
                        if (!z) {
                            a(allocate, array, i3 - p, p);
                            i3 += 8;
                        }
                    } catch (BufferOverflowException e2) {
                        a(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    a(e3);
                    return null;
                }
            }
            if (z) {
                try {
                    a(allocate, array, 0, i3);
                } catch (BufferOverflowException e4) {
                    a(e4);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e5) {
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
            Log.e("ProtoLiteUtils", String.format("Too big to serialize, %s", objArr), e5);
            return null;
        }
    }

    public static List a(ByteBuffer byteBuffer, Class cls, auef auef, boolean z) {
        ByteBuffer byteBuffer2 = byteBuffer;
        String cls2 = cls.toString();
        if (z) {
            int limit = byteBuffer.limit() - 8;
            if (limit < 0) {
                Log.e("ProtoLiteUtils", "Protobuf data too short to be valid");
                return null;
            }
            if (!a(byteBuffer.array(), byteBuffer.arrayOffset(), limit, byteBuffer.getLong(limit))) {
                Log.e("ProtoLiteUtils", "Ignoring corrupt protobuf data");
                return null;
            } else if (limit == 0) {
                return new ArrayList(0);
            }
        }
        int limit2 = z ? byteBuffer.limit() - 8 : byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) + 1);
        while (byteBuffer.position() < limit2) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtils", String.format("Invalid message size: %d. May have given the wrong message type: %s", new Object[]{Integer.valueOf(i), cls2}));
                    return null;
                }
                int i2 = 8;
                if (!z) {
                    if (limit2 >= byteBuffer.position() + i + 8) {
                        if (!a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, byteBuffer.getLong(byteBuffer.position() + i))) {
                            return arrayList;
                        }
                    } else {
                        Log.e("ProtoLiteUtils", String.format("Invalid message size: %d (buffer end is %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(limit2)}));
                        return arrayList;
                    }
                }
                audx a = a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, cls, auef);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                int position = byteBuffer.position() + i;
                if (z) {
                    i2 = 0;
                }
                byteBuffer.position(position + i2);
            } catch (BufferUnderflowException e) {
                Log.e("ProtoLiteUtils", String.format("Buffer underflow. May have given the wrong message type: %s", new Object[]{cls2}), e);
                return null;
            }
        }
        return arrayList;
    }

    private static void a(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtils", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    private static void a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        byteBuffer.putLong(crc32.getValue());
    }

    public static boolean a(byte[] bArr, int i, int i2, long j) {
        boolean z;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        if (value == j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.e("ProtoLiteUtils", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", new Object[]{Long.valueOf(j), Long.valueOf(value)}));
        }
        return z;
    }
}
