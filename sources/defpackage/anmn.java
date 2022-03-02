package defpackage;

import java.nio.charset.Charset;

/* renamed from: anmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmn extends anms {
    public final Charset a;
    public final /* synthetic */ anmo b;

    public anmn(anmo anmo, Charset charset) {
        this.b = anmo;
        amrl.a((Object) charset);
        this.a = charset;
    }

    public final String a() {
        return new String(this.b.a(), this.a);
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(".asCharSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
