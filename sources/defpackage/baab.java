package defpackage;

import java.util.BitSet;
import java.util.Locale;

/* renamed from: baab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class baab {
    private static final BitSet c;
    public final String a;
    public final byte[] b;
    private final String d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        c = bitSet;
    }

    public baab(String str, boolean z) {
        amrl.a((Object) str, (Object) "name");
        this.d = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        amrl.a((Object) lowerCase, (Object) "name");
        amrl.a(!lowerCase.isEmpty(), (Object) "token must have at least 1 tchar");
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if ((z && charAt == ':' && i == 0) || c.get(charAt)) {
                i++;
            } else {
                throw new IllegalArgumentException(amsu.a("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.a = lowerCase;
        this.b = lowerCase.getBytes(amqn.a);
    }

    public static baab a(String str, azzu azzu) {
        return new azzy(str, azzu);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] a(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((baab) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public static baab a(String str, azzx azzx) {
        return new azzw(str, azzx);
    }

    static baab a(String str, boolean z, baae baae) {
        return new baad(str, z, baae);
    }
}
