package defpackage;

import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import java.util.concurrent.Executor;

/* renamed from: fel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fel implements aoqb {
    private final fez a;

    public fel(fez fez) {
        this.a = fez;
    }

    public final aorr a(Object obj) {
        fez fez = this.a;
        iby iby = fez.r;
        wkz wkz = new wkz();
        wkz.b = false;
        return aopr.a(qbc.a(iby.a(wkz)), (aoqb) new fem(fez, (MatchPasswordResult) obj), (Executor) fez.e);
    }
}
