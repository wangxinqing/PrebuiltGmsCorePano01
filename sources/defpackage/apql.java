package defpackage;

import android.content.Context;

/* renamed from: apql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apql extends apqg {
    private final String g;
    private final String h;
    private final String i;

    public apql(String str, String str2, aptp aptp, String str3, String str4, String str5, aptm aptm) {
        super(str, str2, aptp, aptm, "ConfirmPasswordReset");
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        String str2 = this.h;
        String str3 = this.i;
        aptg aptg = this.a;
        iva.c(str);
        iva.c(str2);
        iva.a((Object) aptg);
        apte.b.a(new aput(str, str2, str3), (apts) new apry(aptg));
    }
}
