package defpackage;

import android.content.Intent;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Executor;

/* renamed from: abau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abau implements aoqb {
    private final ConsentChimeraActivity a;

    public abau(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final aorr a(Object obj) {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            return aopr.a((aorr) consentChimeraActivity.f.a(500, (Intent) amri.b()), (amqy) new abax(consentChimeraActivity), (Executor) consentChimeraActivity.c);
        }
        consentChimeraActivity.a(6, "Device management is not supported");
        return aorl.a((Object) ampu.a);
    }
}
