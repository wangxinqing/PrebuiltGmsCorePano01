package defpackage;

/* renamed from: afzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzp {
    public final afzo a;
    public final int b;
    public final String c;
    public final String d;

    public afzp(afzo afzo, int i, String str, String str2) {
        this.a = afzo;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public static afzp a(afzo afzo) {
        return new afzp(afzo, -1, (String) null, (String) null);
    }

    public static afzp a(afzo afzo, String str) {
        return new afzp(afzo, -1, str, (String) null);
    }

    public static afzp a(afzo afzo, Throwable th) {
        return new afzp(afzo, -1, th.getMessage(), (String) null);
    }
}
