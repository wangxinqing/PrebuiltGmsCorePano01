package defpackage;

/* renamed from: jlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class jlx {
    public static int a(jly jly, jly jly2) {
        if (jly == jly2) {
            return 0;
        }
        int compare = Integer.compare(jly.c(), jly2.c());
        if (compare != 0) {
            return compare;
        }
        CharSequence b = jly.b();
        CharSequence b2 = jly2.b();
        if (b != null && b2 != null) {
            return b.toString().compareToIgnoreCase(b2.toString());
        }
        if (b != b2) {
            return b != null ? 1 : -1;
        }
        return 0;
    }
}
