package defpackage;

/* renamed from: azxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxg {
    public final Object a;
    private final String b;

    private azxg(String str, Object obj) {
        this.b = str;
        this.a = obj;
    }

    public static azxg a(String str) {
        amrl.a((Object) str, (Object) "debugString");
        return new azxg(str, (Object) null);
    }

    public final String toString() {
        return this.b;
    }

    public static azxg a(String str, Object obj) {
        amrl.a((Object) str, (Object) "debugString");
        return new azxg(str, obj);
    }
}
