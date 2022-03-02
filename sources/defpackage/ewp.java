package defpackage;

import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: ewp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewp implements amqy {
    private final ews a;

    public ewp(ews ews) {
        this.a = ews;
    }

    public final Object a(Object obj) {
        ews ews = this.a;
        return fcp.a(ews.getContext(), (InternalSignInCredentialWrapper) obj, ews.b.m);
    }
}
