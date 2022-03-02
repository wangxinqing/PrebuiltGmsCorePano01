package defpackage;

import android.content.Context;

/* renamed from: aprg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprg extends apqg {
    private final String g;

    public aprg(String str, String str2, aptp aptp, String str3, aptm aptm) {
        super(str, str2, aptp, aptm, "UnlinkEmailCredential");
        this.g = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) aptg);
        apte.a(str, (apts) new apsg(apte, aptg));
    }
}
