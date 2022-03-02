package defpackage;

/* renamed from: ahpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpk {
    public final int a;
    public final int b;

    public ahpk(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public final String toString() {
        String str = this.b != 1 ? "TRANSITION" : "NO_OP";
        int i = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("Status = ");
        sb.append(str);
        sb.append(", next activity = ");
        sb.append(i);
        return sb.toString();
    }
}
