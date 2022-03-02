package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: fqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqe implements fcu {
    protected static final iwd a = ehv.b("SaveOperation");
    public static final /* synthetic */ int h = 0;
    public final Context b;
    public final fis c;
    public final String d;
    public final Credential e;
    public final String f;
    public final fjh g;
    private final fkw i = fkw.a();

    public fqe(Context context, String str, Credential credential, String str2) {
        this.b = context;
        this.g = fjh.a(context);
        this.c = fkm.a(context);
        this.d = str;
        this.e = credential;
        this.f = str2;
    }

    public static amri a(Credential credential) {
        return anbs.d(fcg.a(), new fpn(credential));
    }

    public final aorr a(fde fde) {
        if (!((Boolean) fdh.b.c()).booleanValue() || azqb.a.a().a().contains("auth_api_credentials")) {
            throw qbf.a(28432);
        } else if (!"https://accounts.google.com".equals(this.e.f) || a(this.e).a()) {
            aorr a2 = new fmo(this.b).a(fde);
            return aopr.a(aopr.a(a2, (aoqb) new fpm(this, fde), (Executor) aoqm.a), (aoqb) new fpv(this, fde, a2), (Executor) aoqm.a);
        } else {
            throw qbf.a(28441);
        }
    }

    public final aorr a(fde fde, Iterable iterable) {
        this.i.a(this.d, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) it.next();
            Account account = internalCredentialWrapper.b;
            amrl.a((Object) account);
            qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE;
            aorr a2 = this.c.a(fcg.a(account), this.d, internalCredentialWrapper.a);
            fde.a(qbk, a2);
            arrayList.add(a2);
        }
        return aorl.c((Iterable) arrayList).a(aoqf.a(), (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_SAVE;
    }
}
