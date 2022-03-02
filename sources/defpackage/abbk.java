package defpackage;

import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: abbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbk implements amqy {
    private final ConsentChimeraActivity a;

    public abbk(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            consentChimeraActivity.k = new ConsentResult(gei.SUCCESS, gda.GRANTED, (String) amri.b());
            return amri.b(400);
        }
        consentChimeraActivity.a(4, "");
        return ampu.a;
    }
}
