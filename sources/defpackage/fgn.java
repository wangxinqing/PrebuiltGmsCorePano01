package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: fgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgn {
    public static antr a(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        aucd o = antr.d.o();
        boolean a = internalSignInCredentialWrapper.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antr antr = (antr) o.b;
        int i = 2;
        antr.a |= 2;
        antr.c = a;
        if (!TextUtils.isEmpty(internalSignInCredentialWrapper.g.f)) {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        antr antr2 = (antr) o.b;
        antr2.b = i - 1;
        antr2.a |= 1;
        return (antr) o.i();
    }
}
