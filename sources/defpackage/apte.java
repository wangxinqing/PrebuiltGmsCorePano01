package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedIdpSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apte {
    public static final iwd a = new iwd("FBAuthApiDispatcher", new String[0]);
    public final aptt b;
    public final aptf c;

    public apte(aptt aptt, aptf aptf) {
        iva.a((Object) aptt);
        this.b = aptt;
        iva.a((Object) aptf);
        this.c = aptf;
    }

    /* access modifiers changed from: private */
    public final void a(GetTokenResponse getTokenResponse, String str, String str2, Boolean bool, DefaultOAuthCredential defaultOAuthCredential, aptg aptg, aptr aptr) {
        iva.a((Object) getTokenResponse);
        iva.a((Object) aptr);
        iva.a((Object) aptg);
        GetTokenResponse getTokenResponse2 = getTokenResponse;
        this.b.a(new apuh(getTokenResponse2.b), (apts) new aprt(aptr, str2, str, bool, defaultOAuthCredential, aptg, getTokenResponse2));
    }

    public final void a(aptg aptg, GetTokenResponse getTokenResponse, apux apux, aptr aptr) {
        iva.a((Object) aptg);
        iva.a((Object) getTokenResponse);
        iva.a((Object) apux);
        iva.a((Object) aptr);
        this.b.a(new apuh(getTokenResponse.b), (apts) new aprr(this, aptr, aptg, getTokenResponse, apux));
    }

    public final void a(aptg aptg, GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser, apux apux, aptr aptr) {
        iva.a((Object) aptg);
        iva.a((Object) getTokenResponse);
        iva.a((Object) getAccountInfoUser);
        iva.a((Object) apux);
        iva.a((Object) aptr);
        this.b.a(apux, (apts) new aprs(apux, getAccountInfoUser, aptg, getTokenResponse, aptr));
    }

    public final void a(aptz aptz, aptg aptg) {
        iva.a((Object) aptz);
        iva.a((Object) aptg);
        this.b.a((aptv) aptz, (apth) new apua(), axic.c(), "emailLinkSignin").a((acvp) new appl(new aprq(this, aptg)));
    }

    public final void a(apul apul, aptg aptg) {
        iva.a((Object) apul);
        iva.a((Object) aptg);
        this.b.a(apul, (apts) new apsw(aptg));
    }

    public final void a(apvh apvh, aptg aptg, aptr aptr) {
        Status status;
        if (!apvh.a && TextUtils.isEmpty(apvh.i)) {
            a(new GetTokenResponse(apvh.c, apvh.b, Long.valueOf(apvh.d), "Bearer"), apvh.g, apvh.f, Boolean.valueOf(apvh.h), apvh.c(), aptg, aptr);
            return;
        }
        DefaultOAuthCredential c2 = apvh.c();
        String str = apvh.e;
        String str2 = apvh.j;
        if (apvh.a) {
            status = new Status(17012);
        } else {
            status = apvs.a(apvh.i);
        }
        if (this.c.a()) {
            OnFailedIdpSignInAidlResponse onFailedIdpSignInAidlResponse = new OnFailedIdpSignInAidlResponse(status, c2, str, str2);
            try {
                aptm aptm = aptg.c;
                Parcel aQ = aptm.aQ();
                bhx.a(aQ, (Parcelable) onFailedIdpSignInAidlResponse);
                aptm.c(14, aQ);
            } catch (RemoteException e) {
                aptg.b.e("RemoteException when sending failure result with credential", e, new Object[0]);
            }
        } else {
            aptg.a(status);
        }
    }

    public final void a(String str, apts apts) {
        iva.a((Object) apts);
        iva.c(str);
        GetTokenResponse a2 = GetTokenResponse.a(str);
        if (System.currentTimeMillis() + 300000 < a2.e.longValue() + (a2.c.longValue() * 1000)) {
            apts.a(a2);
            return;
        }
        this.b.a(new apug(a2.a), (apts) new aptd(apts));
    }
}
