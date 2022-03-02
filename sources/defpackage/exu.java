package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: exu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class exu implements amrm {
    private final fcp a;

    public exu(fcp fcp) {
        this.a = fcp;
    }

    public final boolean a(Object obj) {
        fcp fcp = this.a;
        iwd iwd = eyf.c;
        return TextUtils.equals(((InternalSignInCredentialWrapper) obj).g.a, fcp.b);
    }
}
