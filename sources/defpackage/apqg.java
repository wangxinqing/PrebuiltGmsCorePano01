package defpackage;

import android.content.Context;

/* renamed from: apqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apqg extends jba {
    protected final aptg a;
    protected final String d;
    protected final aptp e;
    protected final iwd f;
    private final String g;

    public apqg(String str, String str2, aptp aptp, aptm aptm, String str3) {
        super(112, str3);
        this.f = new iwd("FirebaseAuth", str3);
        iva.c(str);
        this.d = str;
        iva.a((Object) aptp);
        this.e = aptp;
        this.a = new aptg(aptm, this.f);
        iva.c(str2);
        this.g = str2;
    }

    public final void a(Context context) {
        a(context, new apte(new aptt(context, new aptu(context, this.d), this.g, this.e), new aptf(this.e)));
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, apte apte);
}
