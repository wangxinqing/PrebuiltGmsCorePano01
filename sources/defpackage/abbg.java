package defpackage;

import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbg implements amqy {
    private final ConsentChimeraActivity a;

    public abbg(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        TokenResponse tokenResponse = (TokenResponse) obj;
        consentChimeraActivity.e.a((Object) 0);
        ConsentChimeraActivity.a.a("Token response: %s.", tokenResponse.b().ac);
        consentChimeraActivity.j = tokenResponse;
        gei gei = gei.CLIENT_LOGIN_DISABLED;
        int ordinal = tokenResponse.b().ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                consentChimeraActivity.a(tokenResponse.d);
                return ampu.a;
            } else if (ordinal == 5) {
                consentChimeraActivity.a(3, "Network error");
                return ampu.a;
            } else if (ordinal == 6) {
                consentChimeraActivity.a(4, "Service unavailable");
                return ampu.a;
            } else if (ordinal == 7) {
                consentChimeraActivity.a(4, "Internal error");
                return ampu.a;
            } else if (ordinal == 8) {
                return amri.b(100);
            } else {
                if (ordinal == 20) {
                    return amri.b(300);
                }
                if (ordinal == 21) {
                    return amri.b(200);
                }
                switch (ordinal) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 35:
                        break;
                    case 34:
                        return amri.b(501);
                    default:
                        consentChimeraActivity.a(4, "Unknown error");
                        return ampu.a;
                }
            }
        }
        return amri.b(500);
    }
}
