package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abet extends nis {
    public final abev a;
    public final abdr b;
    private final SignInRequest c;
    private final aber d;

    public abet(abev abev, abdr abdr, SignInRequest signInRequest, aber aber) {
        super(44, "SignIn");
        this.a = abev;
        this.b = abdr;
        this.c = signInRequest;
        this.d = aber;
    }

    public final void a(Context context) {
        new aben(this.a, this.c.b, new iud(this, context), this.d).a(context);
    }

    public final void a(Status status) {
        this.b.a(new SignInResponse());
    }
}
