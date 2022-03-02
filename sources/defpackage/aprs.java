package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aprs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aprs implements apts {
    final /* synthetic */ apux a;
    final /* synthetic */ GetAccountInfoUser b;
    final /* synthetic */ aptg c;
    final /* synthetic */ GetTokenResponse d;
    final /* synthetic */ aptr e;

    public aprs(apux apux, GetAccountInfoUser getAccountInfoUser, aptg aptg, GetTokenResponse getTokenResponse, aptr aptr) {
        this.a = apux;
        this.b = getAccountInfoUser;
        this.c = aptg;
        this.d = getTokenResponse;
        this.e = aptr;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apuy apuy = (apuy) obj;
        List list = null;
        if (!this.a.a("EMAIL")) {
            String str = this.a.a;
            if (str != null) {
                this.b.b = str;
            }
        } else {
            this.b.b = null;
        }
        if (!this.a.a("DISPLAY_NAME")) {
            String str2 = this.a.c;
            if (str2 != null) {
                this.b.d = str2;
            }
        } else {
            this.b.d = null;
        }
        if (!this.a.a("PHOTO_URL")) {
            String str3 = this.a.d;
            if (str3 != null) {
                this.b.e = str3;
            }
        } else {
            this.b.e = null;
        }
        if (!TextUtils.isEmpty(this.a.b)) {
            GetAccountInfoUser getAccountInfoUser = this.b;
            String b2 = jhy.b("redacted".getBytes());
            iva.c(b2);
            getAccountInfoUser.g = b2;
        }
        ProviderUserInfoList providerUserInfoList = apuy.b;
        if (providerUserInfoList != null) {
            list = providerUserInfoList.a;
        }
        if (list == null) {
            list = new ArrayList();
        }
        GetAccountInfoUser getAccountInfoUser2 = this.b;
        iva.a((Object) list);
        getAccountInfoUser2.f = new ProviderUserInfoList();
        getAccountInfoUser2.f.a.addAll(list);
        aptg aptg = this.c;
        GetTokenResponse getTokenResponse = this.d;
        iva.a((Object) getTokenResponse);
        iva.a((Object) apuy);
        String str4 = apuy.c;
        String str5 = apuy.d;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            getTokenResponse = new GetTokenResponse(str5, str4, Long.valueOf(apuy.e), getTokenResponse.d);
        }
        aptg.a(getTokenResponse, this.b);
    }

    public final void a(String str) {
        this.e.a(str);
    }
}
