package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* renamed from: fwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwz extends fwx {
    public fwz(fwq fwq, String str) {
        super(fwq, (GoogleSignInOptions) null, str, "GoogleSignOut");
    }

    public final void a(Context context) {
        jgu.c(context, this.b);
        this.d.a(Status.a);
    }

    public final void a(Status status) {
        this.d.a(status);
    }
}
