package defpackage;

/* renamed from: ngg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngg {
    public static String a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    public static nfw a(nfw nfw) {
        if (!nfw.b.isEmpty()) {
            return nfw;
        }
        aucd o = nfw.e.o();
        String concat = String.valueOf(a(nfw.d.k())).concat(".ttf");
        if (o.c) {
            o.c();
            o.c = false;
        }
        nfw nfw2 = (nfw) o.b;
        concat.getClass();
        int i = nfw2.a | 1;
        nfw2.a = i;
        nfw2.b = concat;
        auay auay = nfw.d;
        auay.getClass();
        int i2 = i | 4;
        nfw2.a = i2;
        nfw2.d = auay;
        long j = nfw.c;
        nfw2.a = i2 | 2;
        nfw2.c = j;
        return (nfw) o.i();
    }
}
