package defpackage;

import android.content.Context;

/* renamed from: aprf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprf extends apqg {
    private final String g;
    private final String h;

    public aprf(String str, String str2, aptp aptp, String str3, String str4, aptm aptm) {
        super(str, str2, aptp, aptm, "UnenrollMfa");
        this.g = str3;
        this.h = str4;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        String str2 = this.h;
        aptg aptg = this.a;
        iva.c(str);
        iva.c(str2);
        iva.a((Object) aptg);
        apte.a(str, (apts) new apsk(apte, str2, aptg));
    }
}
