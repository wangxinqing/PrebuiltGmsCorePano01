package defpackage;

/* renamed from: alza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alza extends alyw {
    private final String a;

    public alza(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final char a(int i) {
        return this.a.charAt(i);
    }

    public final /* bridge */ /* synthetic */ alzb a(int i, int i2) {
        return new alza(this.a.substring(i, i2));
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.a.length();
    }

    public final void a(amiq amiq) {
        String valueOf = String.valueOf(amiq.c);
        String valueOf2 = String.valueOf(this.a);
        amiq.c = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
