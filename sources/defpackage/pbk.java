package defpackage;

/* renamed from: pbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbk extends Exception {
    private final int a;
    private final String b;

    public pbk(int i, String str, String str2) {
        super(str2);
        this.a = i;
        this.b = str;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMessage());
        sb.append("\n");
        sb.append(this.b);
        sb.append("\n");
        for (int i = 0; i < this.a; i++) {
            sb.append(" ");
        }
        sb.append("^");
        return sb.toString();
    }
}
