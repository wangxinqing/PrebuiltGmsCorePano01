package defpackage;

import android.content.Context;

/* renamed from: apqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqh extends apqg {
    private final String g;
    private final String h;

    public apqh(String str, String str2, aptp aptp, String str3, String str4, aptm aptm) {
        super(str, str2, aptp, aptm, "ApplyActionCode");
        this.g = str3;
        this.h = str4;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        String str2 = this.h;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) aptg);
        apux apux = new apux();
        iva.c(str);
        apux.g = str;
        apux.h = str2;
        apte.b.a(apux, (apts) new aptc(aptg));
    }
}
