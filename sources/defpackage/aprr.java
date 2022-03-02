package defpackage;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: aprr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aprr implements apts {
    final /* synthetic */ aptr a;
    final /* synthetic */ aptg b;
    final /* synthetic */ GetTokenResponse c;
    final /* synthetic */ apux d;
    final /* synthetic */ apte e;

    public aprr(apte apte, aptr aptr, aptg aptg, GetTokenResponse getTokenResponse, apux apux) {
        this.e = apte;
        this.a = aptr;
        this.b = aptg;
        this.c = getTokenResponse;
        this.d = apux;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List b2 = ((GetAccountInfoResponse) obj).b();
        if (b2 == null || b2.isEmpty()) {
            this.a.a("No users");
        } else {
            this.e.a(this.b, this.c, (GetAccountInfoUser) b2.get(0), this.d, this.a);
        }
    }

    public final void a(String str) {
        this.a.a(str);
    }
}
