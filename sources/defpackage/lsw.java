package defpackage;

/* renamed from: lsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsw {
    public final boolean a;
    public final int b;

    private lsw(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public static lsw a(int i) {
        return new lsw(i, false);
    }

    public static lsw b(int i) {
        return new lsw(i, true);
    }

    public final String toString() {
        String a2 = lsx.a(this.b);
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(a2.length() + 35);
        sb.append("Transition{type=");
        sb.append(a2);
        sb.append(", audioBased=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
