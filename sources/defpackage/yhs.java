package defpackage;

/* renamed from: yhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yhs {
    public static final boolean a(String str, int i) {
        if (!str.startsWith("__internal.") && i != 1) {
            String a = ygb.a(str);
            if (!azaf.a.a().t().a.contains(a) && (!(i == 9 || i == 16 || i == 17) || !yge.a(azaf.a.a().w(), a))) {
                if ((i != 9 && i != 17) || !azaf.a.a().v().a.contains(a)) {
                    return i != 21 || azaf.a.a().u();
                }
                return false;
            }
        }
        return false;
    }
}
