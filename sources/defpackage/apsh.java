package defpackage;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;

/* renamed from: apsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsh implements apts {
    final /* synthetic */ apts a;
    final /* synthetic */ GetTokenResponse b;
    final /* synthetic */ apsi c;

    public apsh(apsi apsi, apts apts, GetTokenResponse getTokenResponse) {
        this.c = apsi;
        this.a = apts;
        this.b = getTokenResponse;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List b2 = ((GetAccountInfoResponse) obj).b();
        if (b2 == null || b2.isEmpty()) {
            this.a.a("No users.");
            return;
        }
        apux apux = new apux();
        apux.c(this.b.b);
        String str = this.c.a;
        iva.c(str);
        apux.e.b.add(str);
        apsi apsi = this.c;
        apsi.c.a(apsi.b, this.b, (GetAccountInfoUser) b2.get(0), apux, this.a);
    }

    public final void a(String str) {
        this.c.b.a(apvs.a(str));
    }
}
