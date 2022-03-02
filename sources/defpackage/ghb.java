package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ghb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghb {
    public final Intent a;

    public ghb(Context context) {
        this.a = new Intent().setClassName(context.getApplicationContext(), "com.google.android.gms.auth.login.UsernamePasswordActivity");
    }
}
