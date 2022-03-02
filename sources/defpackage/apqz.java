package defpackage;

import android.content.Context;

/* renamed from: apqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqz extends apqg {
    private final String g;

    public apqz(String str, String str2, aptp aptp, String str3, aptm aptm) {
        super(str, str2, aptp, aptm, "SignInAnonymously");
        this.g = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        aptg aptg = this.a;
        iva.a((Object) aptg);
        apte.b.a(new apuz(str), (apts) new apsy(apte, aptg));
    }
}
