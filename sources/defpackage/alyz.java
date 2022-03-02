package defpackage;

/* renamed from: alyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alyz extends alyw {
    private final StringBuilder a;

    public alyz(StringBuilder sb) {
        this.a = sb;
    }

    /* access modifiers changed from: protected */
    public final char a(int i) {
        return this.a.charAt(i);
    }

    public final /* bridge */ /* synthetic */ alzb a(int i, int i2) {
        return new alza(this.a.substring(i, i2));
    }

    public final int b() {
        return this.a.length();
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.a.toString();
    }

    public final void a(amiq amiq) {
        String str = amiq.c;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(valueOf);
        amiq.c = sb.toString();
    }
}
