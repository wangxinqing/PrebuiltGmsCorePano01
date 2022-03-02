package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: batg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class batg implements Serializable, Comparable {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final batg b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    public batg(byte[] bArr) {
        this.c = bArr;
    }

    public static batg a(String str) {
        if (str != null) {
            batg batg = new batg(str.getBytes(baud.a));
            batg.e = str;
            return batg;
        }
        throw new IllegalArgumentException("s == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            batg batg = new batg(bArr);
            try {
                Field declaredField = batg.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                declaredField.set(this, batg.c);
            } catch (NoSuchFieldException e2) {
                throw new AssertionError();
            } catch (IllegalAccessException e3) {
                throw new AssertionError();
            }
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public String b() {
        byte[] bArr = this.c;
        byte[] bArr2 = batb.a;
        int length = bArr.length;
        byte[] bArr3 = new byte[(((length + 2) / 3) * 4)];
        int i = length - (length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[i] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = i + 1;
            bArr3[i11] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i13] & 255) >> 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public String c() {
        char[] cArr = new char[(r1 + r1)];
        int i = 0;
        for (byte b2 : this.c) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            batg r10 = (defpackage.batg) r10
            int r0 = r9.e()
            int r1 = r10.e()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x0029
            byte r7 = r9.a((int) r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.a((int) r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 < r8) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            return r5
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            if (r0 < r1) goto L_0x0030
        L_0x002e:
            r3 = 1
        L_0x002f:
            return r3
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.batg.compareTo(java.lang.Object):int");
    }

    public batg d() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new batg(bArr2);
            }
            i++;
        }
    }

    public int e() {
        return this.c.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r6 = (defpackage.batg) r6;
        r1 = r6.e();
        r3 = r5.c;
        r4 = r3.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r5) goto L_0x001b
            boolean r1 = r6 instanceof defpackage.batg
            r2 = 0
            if (r1 == 0) goto L_0x001a
            batg r6 = (defpackage.batg) r6
            int r1 = r6.e()
            byte[] r3 = r5.c
            int r4 = r3.length
            if (r1 != r4) goto L_0x001a
            boolean r6 = r6.a(r2, r3, r2, r4)
            if (r6 == 0) goto L_0x001a
            return r0
        L_0x001a:
            return r2
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.batg.equals(java.lang.Object):boolean");
    }

    public byte[] f() {
        return (byte[]) this.c.clone();
    }

    public batg g() {
        byte[] bArr = this.c;
        int length = bArr.length;
        if (length < 64) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("endIndex > length(");
            sb.append(length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 64) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new batg(bArr2);
        }
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                if (i2 == 64) {
                    break;
                }
                int codePointAt = a2.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            } else {
                i = a2.length();
                break;
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a2.length()) {
                int length2 = this.c.length;
                StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 25);
                sb.append("[size=");
                sb.append(length2);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 7);
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        }
        int length3 = this.c.length;
        if (length3 <= 64) {
            String c2 = c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 6);
            sb3.append("[hex=");
            sb3.append(c2);
            sb3.append("]");
            return sb3.toString();
        }
        String c3 = g().c();
        StringBuilder sb4 = new StringBuilder(String.valueOf(c3).length() + 24);
        sb4.append("[size=");
        sb4.append(length3);
        sb4.append(" hex=");
        sb4.append(c3);
        sb4.append("…]");
        return sb4.toString();
    }

    public static batg a(byte... bArr) {
        if (bArr != null) {
            return new batg((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte a(int i) {
        return this.c[i];
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, baud.a);
        this.e = str2;
        return str2;
    }

    public void a(batd batd) {
        byte[] bArr = this.c;
        batd.b(bArr, 0, bArr.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && baud.a(bArr2, i, bArr, i2, i3);
    }

    public final boolean a(batg batg) {
        return a(batg, batg.e());
    }

    public boolean a(batg batg, int i) {
        return batg.a(0, this.c, 0, i);
    }
}
