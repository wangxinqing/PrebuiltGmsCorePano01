package defpackage;

import java.util.Locale;

/* renamed from: nhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhu {
    public static nfw a() {
        byte[] bArr;
        aucd o = nfw.e.o();
        String format = String.format(Locale.ENGLISH, "directory%03d.pb", new Object[]{Long.valueOf(axir.c())});
        if (o.c) {
            o.c();
            o.c = false;
        }
        nfw nfw = (nfw) o.b;
        format.getClass();
        nfw.a |= 1;
        nfw.b = format;
        long b = axir.a.a().b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nfw nfw2 = (nfw) o.b;
        nfw2.a |= 2;
        nfw2.c = b;
        String b2 = axir.b();
        if (b2 == null) {
            bArr = new byte[0];
        } else {
            int length = b2.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr2[i] = (byte) ((Character.digit(b2.charAt(i2), 16) << 4) + Character.digit(b2.charAt(i2 + 1), 16));
            }
            bArr = bArr2;
        }
        auay a = auay.a(bArr);
        if (o.c) {
            o.c();
            o.c = false;
        }
        nfw nfw3 = (nfw) o.b;
        a.getClass();
        nfw3.a |= 4;
        nfw3.d = a;
        return (nfw) o.i();
    }
}
