package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;

/* renamed from: apqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqr extends apqg {
    private final String g;
    private final String h;

    public apqr(String str, String str2, aptp aptp, String str3, String str4, aptm aptm) {
        super(str, str2, aptp, aptm, "GetProviderForEmail");
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
        aptw aptw = new aptw(str, str2);
        apte.b.a((aptv) aptw, (apth) new CreateAuthUriResponse(), axic.c(), "createAuthUri").a((acvp) new appi(new apru(aptg)));
    }
}
