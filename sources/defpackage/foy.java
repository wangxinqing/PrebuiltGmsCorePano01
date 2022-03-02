package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.Executor;

/* renamed from: foy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class foy implements fcu {
    public final fis a;
    public final String b;
    public final fcb c;
    private final fjh d;

    public foy(Context context, String str, Credential credential) {
        this.d = fjh.a(context);
        this.a = fkm.a(context);
        iva.c(str);
        this.b = str;
        iva.a((Object) credential);
        this.c = fcb.a(credential);
    }

    public final aorr a(fde fde) {
        amzt j = amzy.j();
        anhk i = fcg.a().listIterator();
        while (i.hasNext()) {
            pyv pyv = (pyv) i.next();
            qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED;
            aorr a2 = this.d.a(pyv);
            fde.a(qbk, a2);
            j.c(aopr.a(aopr.a(a2, (aoqb) new fou(this, fde, pyv), (Executor) aoqm.a), (amqy) new qav(new fov(this)), (Executor) aoqm.a));
        }
        return aopr.a(qay.a(j.a(), fow.a), (aoqb) new fox(this, fde), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_DELETE;
    }
}
