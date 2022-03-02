package defpackage;

/* renamed from: agxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxm extends Exception {
    public final int a;
    private final String b;

    public agxm(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE");
        sb.append(". ");
        sb.append(this.b);
        return sb.toString();
    }
}
