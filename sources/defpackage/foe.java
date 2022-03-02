package defpackage;

import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: foe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class foe implements amrm {
    private final fof a;

    public foe(fof fof) {
        this.a = fof;
    }

    public final boolean a(Object obj) {
        Credential credential = (Credential) obj;
        HintRequest hintRequest = this.a.c;
        if (!amrk.a(credential.f)) {
            return angm.a((Object[]) hintRequest.e).contains(credential.f);
        }
        if (hintRequest.c && Patterns.EMAIL_ADDRESS.matcher(credential.a).matches()) {
            return true;
        }
        if (!hintRequest.d || !Patterns.PHONE.matcher(credential.a).matches()) {
            return false;
        }
        return true;
    }
}
