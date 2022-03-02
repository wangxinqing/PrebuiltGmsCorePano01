package defpackage;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: apsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsr implements apts {
    final /* synthetic */ apts a;
    final /* synthetic */ GetTokenResponse b;
    final /* synthetic */ apss c;

    public apsr(apss apss, apts apts, GetTokenResponse getTokenResponse) {
        this.c = apss;
        this.a = apts;
        this.b = getTokenResponse;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List b2 = ((GetAccountInfoResponse) obj).b();
        if (b2 == null || b2.isEmpty()) {
            this.a.a("No users");
        } else {
            this.c.a.a(this.b, (GetAccountInfoUser) b2.get(0));
        }
    }

    public final void a(String str) {
        this.a.a(str);
    }
}
