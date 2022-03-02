package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: fma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fma implements amrm {
    private final fmb a;

    public fma(fmb fmb) {
        this.a = fmb;
    }

    public final boolean a(Object obj) {
        fmb fmb = this.a;
        Credential credential = ((InternalCredentialWrapper) obj).a;
        return !amrk.a(credential.f) ? fmb.f.contains(credential.f) : fmb.e;
    }
}
