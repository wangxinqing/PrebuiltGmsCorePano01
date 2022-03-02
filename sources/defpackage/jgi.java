package defpackage;

import com.google.android.gms.common.internal.SignInButtonConfig;

/* renamed from: jgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgi implements jgj {
    final /* synthetic */ SignInButtonConfig a;

    public jgi(SignInButtonConfig signInButtonConfig) {
        this.a = signInButtonConfig;
    }

    public final mby a(iuk iuk, mby mby) {
        return iuk.newSignInButtonFromConfig(mby, this.a);
    }
}
