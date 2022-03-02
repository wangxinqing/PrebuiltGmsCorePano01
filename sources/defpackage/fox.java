package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: fox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fox implements aoqb {
    private final foy a;
    private final fde b;

    public fox(foy foy, fde fde) {
        this.a = foy;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        foy foy = this.a;
        fde fde = this.b;
        ArrayList arrayList = new ArrayList();
        for (InternalCredentialWrapper internalCredentialWrapper : (Iterable) obj) {
            Account account = internalCredentialWrapper.b;
            iva.a((Object) account);
            qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_REMOVE;
            fis fis = foy.a;
            pyv a2 = fcg.a(account);
            String str = foy.b;
            Credential credential = internalCredentialWrapper.a;
            aorr a3 = aopr.a(((fkm) fis).b.b(a2, fkn.a(credential, str)), (amqy) new fkg(credential), (Executor) aoqm.a);
            fde.a(qbk, a3);
            arrayList.add(a3);
        }
        return aorl.c((Iterable) arrayList).a(aoqf.a(), (Executor) aoqm.a);
    }
}
