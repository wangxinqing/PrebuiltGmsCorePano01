package defpackage;

/* renamed from: wqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wqo {
    public final StringBuilder a = new StringBuilder();
    public final StringBuilder b = new StringBuilder();
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public final StringBuilder e = new StringBuilder();
    public final StringBuilder f = new StringBuilder();
    public final StringBuilder g = new StringBuilder();
    public long h;
    public long i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;

    public static String a(StringBuilder sb) {
        if (sb.length() > 1) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }

    public static final void a(StringBuilder sb, String str) {
        if (str != null) {
            sb.append(str);
        }
        sb.append("");
    }
}
