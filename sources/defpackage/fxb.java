package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: fxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxb extends nis {
    public static final iwd a = new iwd("GoogleSilentSignIn", new String[0]);
    public final fwq b;
    private final GoogleSignInOptions c;
    private final String d;
    private final hol e;

    public fxb(fwq fwq, Context context, GoogleSignInOptions googleSignInOptions, String str) {
        super(91, "GoogleSilentSignIn");
        this.b = fwq;
        this.d = str;
        this.c = googleSignInOptions;
        this.e = new hol(context, "ANDROID_AUTH", (String) null);
    }

    public final void a(int i) {
        if (((Boolean) fvx.c.c()).booleanValue()) {
            this.e.a((audx) fxj.a(this.d, 2, Integer.valueOf(i), this.c)).b();
        }
    }

    public final void a(Context context) {
        aorl.a(aorl.a(new fxp(context, this.c, this.d, ampu.a).a(), (long) ((Integer) fvx.d.c()).intValue(), TimeUnit.SECONDS, jfm.a(1, 9)), new fxa(this), aoqm.a);
    }

    public final void a(Status status) {
        this.b.a((GoogleSignInAccount) null, status);
    }
}
