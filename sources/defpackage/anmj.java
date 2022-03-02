package defpackage;

import java.math.RoundingMode;

/* renamed from: anmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anmj extends anml {
    private final anml a;
    private final String b;

    public anmj(anml anml, String str) {
        amrl.a((Object) anml);
        this.a = anml;
        amrl.a((Object) str);
        this.b = str;
        amrl.a(true, "Cannot add a separator after every %s chars", 2);
    }

    public final int a(int i) {
        int a2 = this.a.a(i);
        return a2 + (this.b.length() * aons.a(Math.max(0, a2 - 1), 2, RoundingMode.FLOOR));
    }

    public final anml a() {
        throw null;
    }

    public final int b(int i) {
        return this.a.b(i);
    }

    public final anml b() {
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + str.length());
        sb.append(valueOf);
        sb.append(".withSeparator(\"");
        sb.append(str);
        sb.append("\", 2)");
        return sb.toString();
    }

    public final int a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (this.b.indexOf(charAt) < 0) {
                sb.append(charAt);
            }
        }
        return this.a.a(bArr, (CharSequence) sb);
    }

    public final anml a(String str) {
        throw new UnsupportedOperationException("Already have a separator");
    }

    public final CharSequence a(CharSequence charSequence) {
        return this.a.a(charSequence);
    }

    public final void a(Appendable appendable, byte[] bArr, int i) {
        anml anml = this.a;
        String str = this.b;
        amrl.a((Object) appendable);
        amrl.a((Object) str);
        amrl.a(true);
        anml.a(new anme(appendable, str), bArr, i);
    }
}
