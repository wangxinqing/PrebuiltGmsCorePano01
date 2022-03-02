package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: fkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkm implements fis, fit {
    public static final iwd a = ehv.b("ChromeSyncCredentialProvider");
    public final fjw b;
    public final flq c;
    public final aoru d = aosd.a((ExecutorService) jfb.a(2, 9));

    private fkm(Context context) {
        this.b = fjw.a(context);
        this.c = flq.a(context);
    }

    public static fkm a(Context context) {
        int i = jhg.a;
        return new fkm(context);
    }

    public final aorr a(pyv pyv, HintRequest hintRequest) {
        if (hintRequest.c) {
            return aopr.a(this.b.b(pyv), fkd.a, (Executor) aoqm.a);
        }
        return aorl.a((Object) amzy.h());
    }

    public final aorr a(pyv pyv, String str) {
        return aopr.a(this.b.a(pyv, str), (amqy) new fjx(pyv), (Executor) aoqm.a);
    }

    public final aorr a(pyv pyv, String str, Credential credential) {
        return aopr.a(this.b.a(pyv, fkn.a(credential, str)), (amqy) new fkh(credential), (Executor) aoqm.a);
    }

    public final aorr a(pyv pyv, String str, Credential credential, boolean z, String str2, String str3) {
        aorr a2 = aopr.a(this.b.a(pyv, str), (amqy) new fke(credential), (Executor) aoqm.a);
        return (!z || !amqx.a(pyv.b, credential.a)) ? a2 : aopr.a(a2, (aoqb) new fkf(this, pyv, str, str2, str3), (Executor) aoqm.a);
    }
}
