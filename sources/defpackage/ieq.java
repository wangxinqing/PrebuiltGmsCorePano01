package defpackage;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

/* renamed from: ieq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ieq extends abdq {
    private final WeakReference a;

    public final void a(SignInResponse signInResponse) {
        iet iet = (iet) this.a.get();
        if (iet != null) {
            iet.a.a((ifa) new iep(iet, iet, signInResponse));
        }
    }

    public ieq(iet iet) {
        this.a = new WeakReference(iet);
    }
}
