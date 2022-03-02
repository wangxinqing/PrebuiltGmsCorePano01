package defpackage;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbl implements amqy {
    private final ConsentChimeraActivity a;

    public abbl(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        qal qal = (qal) obj;
        if (qal.a == -1) {
            if (qal.b.hasExtra(ConsentResult.a)) {
                qal.b.setExtrasClassLoader(ConsentResult.class.getClassLoader());
                consentChimeraActivity.k = (ConsentResult) qal.b.getParcelableExtra(ConsentResult.a);
            } else if (qal.b.hasExtra("consent")) {
                String stringExtra = qal.b.getStringExtra("consent");
                amrl.a((Object) stringExtra);
                gda a2 = gda.a(stringExtra);
                consentChimeraActivity.k = new ConsentResult(a2 != gda.GRANTED ? gei.PERMISSION_DENIED : gei.SUCCESS, (String) null, (FACLConfig) null, a2, consentChimeraActivity.h.q);
            } else {
                String stringExtra2 = qal.b.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.consent");
                amrl.a((Object) stringExtra2);
                gda a3 = gda.a(stringExtra2);
                consentChimeraActivity.k = new ConsentResult(a3 != gda.GRANTED ? gei.PERMISSION_DENIED : gei.SUCCESS, qal.b.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.pacl"), (FACLConfig) qal.b.getParcelableExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.facl"), a3, consentChimeraActivity.h.q);
            }
            return amri.b(400);
        }
        consentChimeraActivity.a(4, "");
        return ampu.a;
    }
}
