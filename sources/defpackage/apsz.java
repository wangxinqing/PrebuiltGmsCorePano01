package defpackage;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsz implements apts {
    final /* synthetic */ UserProfileChangeRequest a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public apsz(apte apte, UserProfileChangeRequest userProfileChangeRequest, aptg aptg) {
        this.c = apte;
        this.a = userProfileChangeRequest;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        apux apux = new apux();
        apux.c(getTokenResponse.b);
        UserProfileChangeRequest userProfileChangeRequest = this.a;
        if (userProfileChangeRequest.c || userProfileChangeRequest.a != null) {
            String str = userProfileChangeRequest.a;
            if (str == null) {
                apux.f.b.add("DISPLAY_NAME");
            } else {
                apux.c = str;
            }
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.a;
        if (userProfileChangeRequest2.d || userProfileChangeRequest2.e != null) {
            String str2 = userProfileChangeRequest2.b;
            if (str2 == null) {
                apux.f.b.add("PHOTO_URL");
            } else {
                apux.d = str2;
            }
        }
        this.c.a(this.b, getTokenResponse, apux, this);
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
