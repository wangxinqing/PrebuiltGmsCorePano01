package defpackage;

import android.content.Context;

/* renamed from: aedd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aedd extends jni {
    private jnh b = null;

    public final synchronized jnh a(Context context) {
        jnh jnh = this.b;
        if (jnh != null) {
            return jnh;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (!jkr.e()) {
            this.b = new aedc(context);
        } else {
            this.b = new jnh(context);
        }
        return this.b;
    }
}
