package defpackage;

/* renamed from: ozc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozc {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    private final int h;

    public ozc(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, int i2, String str2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        iva.a((Object) str);
        this.f = str;
        this.g = str2;
        this.h = i2;
    }

    public final boolean a() {
        return this.b || this.c;
    }

    public final int b() {
        iva.a(this.h != -1);
        return this.h;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String str = this.f;
        StringBuilder sb = new StringBuilder(str.length() + 95);
        sb.append("ClientRequest[callingUid=");
        sb.append(i);
        sb.append(", isSuperUser=");
        sb.append(z);
        sb.append(", isGoogleSearchApp=");
        sb.append(z2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
