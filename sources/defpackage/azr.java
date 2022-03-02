package defpackage;

/* renamed from: azr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azr {
    private static final bar a = bar.a("fFamily", "fName", "fStyle", "ascent");

    static axg a(bat bat) {
        bat.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (bat.e()) {
            int a2 = bat.a(a);
            if (a2 == 0) {
                str = bat.h();
            } else if (a2 == 1) {
                str2 = bat.h();
            } else if (a2 == 2) {
                str3 = bat.h();
            } else if (a2 != 3) {
                bat.g();
                bat.l();
            } else {
                bat.j();
            }
        }
        bat.d();
        return new axg(str, str2, str3);
    }
}
