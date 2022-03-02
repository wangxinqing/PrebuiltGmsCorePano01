package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: anmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class anmk extends anml {
    private transient anml a;
    public final anmf b;
    public final Character c;
    public transient anml d;

    public anmk(anmf anmf, Character ch) {
        amrl.a((Object) anmf);
        this.b = anmf;
        boolean z = true;
        if (ch != null && anmf.b(ch.charValue())) {
            z = false;
        }
        amrl.a(z, "Padding character %s was already in alphabet", (Object) ch);
        this.c = ch;
    }

    public final int a(int i) {
        anmf anmf = this.b;
        return anmf.e * aons.a(i, anmf.f, RoundingMode.CEILING);
    }

    public final int b(int i) {
        return (int) (((((long) this.b.d) * ((long) i)) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anmk) {
            anmk anmk = (anmk) obj;
            return this.b.equals(anmk.b) && amqx.a(this.c, anmk.c);
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Arrays.hashCode(new Object[]{this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b.a);
        if (8 % this.b.d != 0) {
            if (this.c != null) {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            } else {
                sb.append(".omitPadding()");
            }
        }
        return sb.toString();
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        anmf anmf;
        amrl.a((Object) bArr);
        CharSequence a2 = a(charSequence);
        if (this.b.b(a2.length())) {
            int i = 0;
            int i2 = 0;
            while (i < a2.length()) {
                long j = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    anmf = this.b;
                    if (i3 >= anmf.e) {
                        break;
                    }
                    j <<= anmf.d;
                    if (i + i3 < a2.length()) {
                        j |= (long) this.b.a(a2.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = anmf.f;
                int i6 = (i5 * 8) - (i4 * anmf.d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                    i7 -= 8;
                    i2++;
                }
                i += this.b.e;
            }
            return i2;
        }
        int length = a2.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anmi(sb.toString());
    }

    public final anml b() {
        anml anml = this.a;
        if (anml == null) {
            anmf anmf = this.b;
            if (anmf.b()) {
                amrl.b(!anmf.a(), (Object) "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = new char[anmf.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = anmf.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    char c2 = cArr2[i];
                    if (ampw.c(c2)) {
                        c2 ^= ' ';
                    }
                    cArr[i] = (char) c2;
                    i++;
                }
                anmf = new anmf(anmf.a.concat(".lowerCase()"), cArr);
            }
            anml = anmf != this.b ? a(anmf, this.c) : this;
            this.a = anml;
        }
        return anml;
    }

    public anmk(String str, String str2, Character ch) {
        this(new anmf(str, str2.toCharArray()), ch);
    }

    public final anml a() {
        return this.c != null ? a(this.b, (Character) null) : this;
    }

    public anml a(anmf anmf, Character ch) {
        return new anmk(anmf, ch);
    }

    public final anml a(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            amrl.a(!this.b.b(str.charAt(i)), "Separator (%s) cannot contain alphabet characters", (Object) str);
        }
        Character ch = this.c;
        if (ch != null) {
            if (str.indexOf(ch.charValue()) < 0) {
                z = true;
            }
            amrl.a(z, "Separator (%s) cannot contain padding character", (Object) str);
        }
        return new anmj(this, str);
    }

    public final CharSequence a(CharSequence charSequence) {
        amrl.a((Object) charSequence);
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public void a(Appendable appendable, byte[] bArr, int i) {
        amrl.a((Object) appendable);
        int i2 = 0;
        amrl.a(0, i, bArr.length);
        while (i2 < i) {
            a(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        amrl.a((Object) appendable);
        amrl.a(i, i + i2, bArr.length);
        int i3 = 0;
        if (i2 <= this.b.f) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.b.d;
        while (i3 < i2 * 8) {
            anmf anmf = this.b;
            appendable.append(anmf.a(((int) (j >>> (i5 - i3))) & anmf.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                appendable.append(this.c.charValue());
                i3 += this.b.d;
            }
        }
    }
}
