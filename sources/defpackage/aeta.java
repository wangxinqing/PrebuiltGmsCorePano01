package defpackage;

import java.util.Arrays;

/* renamed from: aeta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aeta {
    public static final aeta a = b().a();
    public static final aeta b;
    private static final byte[] c = new byte[0];

    static {
        aesz b2 = b();
        b2.a(c, 2);
        b = b2.a();
    }

    public static aesz b() {
        return new aesz();
    }

    public abstract amzy a();

    public final boolean a(byte[] bArr) {
        byte[] bArr2;
        boolean z;
        anhk i = a().listIterator();
        while (i.hasNext()) {
            aetg aetg = (aetg) i.next();
            if (bArr == null) {
                bArr2 = c;
            } else {
                bArr2 = bArr;
            }
            int b2 = aetg.b();
            if (b2 == 1) {
                z = Arrays.equals(aetg.a(), bArr2);
                continue;
            } else if (b2 == 2) {
                z = aesp.a(aetg.a(), bArr2);
                continue;
            } else {
                int b3 = aetg.b();
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown matching type ");
                sb.append(b3);
                throw new IllegalStateException(sb.toString());
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
