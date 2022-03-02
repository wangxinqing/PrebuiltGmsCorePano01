package defpackage;

import com.google.android.gms.auth.api.identity.AuthorizationResult;

/* renamed from: ezl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezl implements aoqb {
    private final ezo a;

    public ezl(ezo ezo) {
        this.a = ezo;
    }

    public final aorr a(Object obj) {
        ezo ezo = this.a;
        amri amri = (amri) obj;
        if (amri.a()) {
            return aorl.a((Object) (AuthorizationResult) amri.b());
        }
        return ezo.b();
    }
}
