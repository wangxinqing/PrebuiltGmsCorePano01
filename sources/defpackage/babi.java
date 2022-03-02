package defpackage;

import java.nio.ByteBuffer;

/* renamed from: babi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babi implements baae {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    private static boolean a(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length) {
                return new String(bArr, 0);
            }
            byte b = bArr[i];
            if (b >= 32 && b < 126 && (b != 37 || i + 2 >= length)) {
                i++;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        int i2 = 0;
        while (true) {
            int length2 = bArr.length;
            if (i2 >= length2) {
                return new String(allocate.array(), 0, allocate.position(), amqn.c);
            }
            if (bArr[i2] == 37 && i2 + 2 < length2) {
                try {
                    allocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, amqn.a), 16));
                    i2 += 3;
                } catch (NumberFormatException e) {
                }
            }
            allocate.put(bArr[i2]);
            i2++;
        }
    }

    public final /* bridge */ /* synthetic */ byte[] a(Object obj) {
        byte[] bytes = ((String) obj).getBytes(amqn.c);
        int i = 0;
        while (true) {
            int length = bytes.length;
            if (i >= length) {
                return bytes;
            }
            if (a(bytes[i])) {
                byte[] bArr = new byte[(((length - i) * 3) + i)];
                if (i != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i);
                }
                int i2 = i;
                while (i < bytes.length) {
                    byte b = bytes[i];
                    if (a(b)) {
                        bArr[i2] = 37;
                        byte[] bArr2 = a;
                        bArr[i2 + 1] = bArr2[(b >> 4) & 15];
                        bArr[i2 + 2] = bArr2[b & 15];
                        i2 += 3;
                    } else {
                        bArr[i2] = b;
                        i2++;
                    }
                    i++;
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, 0, bArr3, 0, i2);
                return bArr3;
            }
            i++;
        }
    }
}
