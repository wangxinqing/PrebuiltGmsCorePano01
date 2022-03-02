package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: auay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class auay implements Iterable, Serializable {
    private static final auar a;
    public static final auay b = new auav(aucy.b);
    public int c = 0;

    static {
        auar auar;
        if (!auag.a()) {
            auar = new auap();
        } else {
            auar = new auax();
        }
        a = auar;
    }

    public static auay a(InputStream inputStream) {
        auay auay;
        ArrayList arrayList = new ArrayList();
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 != 0) {
                auay = a(bArr, 0, i2);
            } else {
                auay = null;
            }
            if (auay == null) {
                return a((Iterable) arrayList);
            }
            arrayList.add(auay);
            i = Math.min(i + i, FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    public static auay b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        c(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new auav(bArr);
    }

    static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static auat d(int i) {
        return new auat(i);
    }

    public static auaw m() {
        return new auaw();
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract auay a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    public abstract void a(auam auam);

    public abstract void a(OutputStream outputStream);

    public abstract void a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract byte b(int i);

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract boolean d();

    public abstract ByteBuffer e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract InputStream g();

    public abstract aubc h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int a2 = a();
            i = b(a2, 0, a2);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    /* renamed from: i */
    public auas iterator() {
        return new auan(this);
    }

    public final boolean j() {
        return a() == 0;
    }

    public final byte[] k() {
        int a2 = a();
        if (a2 == 0) {
            return aucy.b;
        }
        byte[] bArr = new byte[a2];
        a(bArr, 0, 0, a2);
        return bArr;
    }

    public final String l() {
        return b(aucy.a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(a());
        objArr[2] = a() > 50 ? String.valueOf(aufb.a(a(0, 47))).concat("...") : aufb.a(this);
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    static auay b(byte[] bArr) {
        return new auav(bArr);
    }

    static auay b(byte[] bArr, int i, int i2) {
        return new auaq(bArr, i, i2);
    }

    public final auay c(int i) {
        return a(i, a());
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i >= 0) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("Index < 0: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String b(String str) {
        try {
            return b(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.auay a(java.lang.Iterable r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0014
            int r0 = r3.size()
            r1 = 0
            r2 = 0
        L_0x000a:
            if (r1 >= r0) goto L_0x0018
            r3.get(r1)
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0014:
            int r2 = r3.size()
        L_0x0018:
            if (r2 == 0) goto L_0x0023
            java.util.Iterator r3 = r3.iterator()
            auay r3 = a((java.util.Iterator) r3, (int) r2)
            return r3
        L_0x0023:
            auay r3 = b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auay.a(java.lang.Iterable):auay");
    }

    public final String b(Charset charset) {
        return a() != 0 ? a(charset) : "";
    }

    @Deprecated
    public final void b(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, a());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            a(bArr, i, i2, i3);
        }
    }

    public static auay a(String str) {
        return new auav(str.getBytes(aucy.a));
    }

    public static auay a(String str, Charset charset) {
        return new auav(str.getBytes(charset));
    }

    private static auay a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (auay) it.next();
        } else {
            int i2 = i >>> 1;
            return a(it, i2).a(a(it, i - i2));
        }
    }

    public static auay a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static auay a(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new auav(a.a(bArr, i, i2));
    }

    public final auay a(auay auay) {
        if (Integer.MAX_VALUE - a() >= auay.a()) {
            int i = auep.h;
            if (auay.a() == 0) {
                return this;
            }
            if (a() == 0) {
                return auay;
            }
            int a2 = a() + auay.a();
            if (a2 < 128) {
                return auep.a(this, auay);
            }
            if (this instanceof auep) {
                auep auep = (auep) this;
                if (auep.f.a() + auay.a() < 128) {
                    return new auep(auep.e, auep.a(auep.f, auay));
                } else if (auep.e.c() > auep.f.c() && auep.g > auay.c()) {
                    return new auep(auep.e, new auep(auep.f, auay));
                }
            }
            if (a2 >= auep.e(Math.max(c(), auay.c()) + 1)) {
                return new auep(this, auay);
            }
            auem auem = new auem();
            auem.a(this);
            auem.a(auay);
            auay auay2 = (auay) auem.a.pop();
            while (!auem.a.isEmpty()) {
                auay2 = new auep((auay) auem.a.pop(), auay2);
            }
            return auay2;
        }
        int a3 = a();
        int a4 = auay.a();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(a3);
        sb.append("+");
        sb.append(a4);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(byte[] bArr, int i) {
        b(bArr, 0, i, a());
    }
}
