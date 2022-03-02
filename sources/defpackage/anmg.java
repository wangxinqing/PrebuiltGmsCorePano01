package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: anmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmg extends anmk {
    final char[] a = new char[512];

    public anmg(anmf anmf) {
        super(anmf, (Character) null);
        boolean z;
        if (anmf.b.length == 16) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        for (int i = 0; i < 256; i++) {
            this.a[i] = anmf.a(i >>> 4);
            this.a[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = anmf.a(i & 15);
        }
    }

    public final int a(byte[] bArr, CharSequence charSequence) {
        amrl.a((Object) bArr);
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.b.a(charSequence.charAt(i)) << 4) | this.b.a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new anmi(sb.toString());
    }

    public final anml a(anmf anmf, Character ch) {
        return new anmg(anmf);
    }

    public final void a(Appendable appendable, byte[] bArr, int i) {
        amrl.a((Object) appendable);
        amrl.a(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            appendable.append(this.a[b]);
            appendable.append(this.a[b | 256]);
        }
    }
}
