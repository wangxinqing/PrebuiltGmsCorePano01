package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.List;

/* renamed from: aprt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aprt implements apts {
    final /* synthetic */ aptr a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ Boolean d;
    final /* synthetic */ DefaultOAuthCredential e;
    final /* synthetic */ aptg f;
    final /* synthetic */ GetTokenResponse g;

    public aprt(aptr aptr, String str, String str2, Boolean bool, DefaultOAuthCredential defaultOAuthCredential, aptg aptg, GetTokenResponse getTokenResponse) {
        this.a = aptr;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = defaultOAuthCredential;
        this.f = aptg;
        this.g = getTokenResponse;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list;
        List b2 = ((GetAccountInfoResponse) obj).b();
        if (b2 == null || b2.isEmpty()) {
            this.a.a("No users.");
            return;
        }
        int i = 0;
        GetAccountInfoUser getAccountInfoUser = (GetAccountInfoUser) b2.get(0);
        ProviderUserInfoList providerUserInfoList = getAccountInfoUser.f;
        if (providerUserInfoList != null) {
            list = providerUserInfoList.a;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (TextUtils.isEmpty(this.b)) {
                ((ProviderUserInfo) list.get(0)).e = this.c;
            } else {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (((ProviderUserInfo) list.get(i)).d.equals(this.b)) {
                        ((ProviderUserInfo) list.get(i)).e = this.c;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        getAccountInfoUser.k = this.d.booleanValue();
        getAccountInfoUser.l = this.e;
        this.f.a(this.g, getAccountInfoUser);
    }

    public final void a(String str) {
        this.a.a(str);
    }
}
