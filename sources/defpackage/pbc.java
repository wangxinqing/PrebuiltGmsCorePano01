package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: pbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pbc implements aoqb {
    static final aoqb a = new pbc();

    private pbc() {
    }

    public final aorr a(Object obj) {
        eif eif = (eif) obj;
        if (eif instanceof ein) {
            return aorl.a((Throwable) new agoa(eif));
        }
        if (eif instanceof eiu) {
            return aorl.a((Throwable) new agoc(eif));
        }
        if (eif instanceof UserRecoverableAuthException) {
            return aorl.a((Throwable) new agob(eif));
        }
        return aorl.a((Throwable) new agnz(eif));
    }
}
