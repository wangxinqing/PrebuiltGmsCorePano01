package defpackage;

/* renamed from: rav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rav {
    @Deprecated
    public static rav a(String str, String str2, String str3) {
        return new qyn(str, str2, str3, (amsv) null);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract amsv d();

    public static rav a(String str, String str2, String str3, amsv amsv) {
        return new qyn(str, str2, str3, amsv);
    }

    @Deprecated
    public final int a(String str) {
        if (!str.equals(c())) {
            return !str.equals(b()) ? 1 : 3;
        }
        return 2;
    }
}
