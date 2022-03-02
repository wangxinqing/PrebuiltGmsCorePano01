package defpackage;

import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: eza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eza implements aora {
    final /* synthetic */ ezb a;

    public eza(ezb ezb) {
        this.a = ezb;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.b.a(ezf.a((SignInCredential) obj));
    }

    public final void a(Throwable th) {
        this.a.b.a(ezf.b("Unable to get token."));
    }
}
