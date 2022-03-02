package defpackage;

/* renamed from: afkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afkd {
    public afke a;
    public String b;
    public Throwable c;

    public final afkf a() {
        amrl.a((Object) this.a);
        if (this.b == null) {
            String valueOf = String.valueOf(this.a.name());
            this.b = valueOf.length() == 0 ? new String("Download result code: ") : "Download result code: ".concat(valueOf);
        }
        return new afkf(this);
    }
}
