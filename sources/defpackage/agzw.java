package defpackage;

import android.content.Context;

/* renamed from: agzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzw {
    public final Context a;
    public agzt b;
    public ahbj c = new ahbj();

    public agzw(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        ahbx.a(z, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }

    public final agzx a() {
        return new agzx(this);
    }
}
