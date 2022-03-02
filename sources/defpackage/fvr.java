package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: fvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvr extends iby {
    static int a = 1;

    public fvr(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, eso.a, (ibm) googleSignInOptions, (igu) new icz());
    }

    public final synchronized int a() {
        if (a == 1) {
            Context context = this.c;
            hxj hxj = hxj.a;
            int b = hxj.b(context);
            if (b == 0) {
                a = 4;
            } else if (hxj.b(context, b, (String) null) != null || mcx.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                a = 2;
            } else {
                a = 3;
            }
        }
        return a;
    }
}
