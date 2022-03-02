package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: euq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class euq extends ihb {
    final /* synthetic */ String a;
    final /* synthetic */ CredentialRequest b;

    public euq(String str, CredentialRequest credentialRequest) {
        this.a = str;
        this.b = credentialRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ((fgf) ((ffv) ibf).x()).a((fgb) new euz(acwd, InternalCredentialWrapper.class), this.a, this.b);
    }
}
