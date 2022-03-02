package defpackage;

/* renamed from: anmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmh extends anmk {
    private anmh(anmf anmf, Character ch) {
        super(anmf, ch);
        boolean z;
        if (anmf.b.length == 64) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
    }

    public final int a(byte[] bArr, CharSequence charSequence) {
        amrl.a((Object) bArr);
        CharSequence a = a(charSequence);
        if (this.b.b(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i < a.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int a2 = (this.b.a(a.charAt(i)) << 18) | (this.b.a(a.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (a2 >>> 16);
                if (i4 < a.length()) {
                    int i6 = i4 + 1;
                    int a3 = a2 | (this.b.a(a.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((a3 >>> 8) & 255);
                    if (i6 < a.length()) {
                        bArr[i7] = (byte) ((a3 | this.b.a(a.charAt(i6))) & 255);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        int length = a.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anmi(sb.toString());
    }

    public anmh(String str, String str2, Character ch) {
        this(new anmf(str, str2.toCharArray()), ch);
    }

    public final anml a(anmf anmf, Character ch) {
        return new anmh(anmf, ch);
    }

    public final void a(Appendable appendable, byte[] bArr, int i) {
        amrl.a((Object) appendable);
        int i2 = 0;
        amrl.a(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.b.a(b >>> 18));
            appendable.append(this.b.a((b >>> 12) & 63));
            appendable.append(this.b.a((b >>> 6) & 63));
            appendable.append(this.b.a((int) b & 63));
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            a(appendable, bArr, i2, i - i2);
        }
    }
}
