package defpackage;

import android.content.Context;

/* renamed from: ajfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfl extends ajgq {
    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajfl(Context context, ajgd ajgd) {
        super(context, ajgd);
    }

    static boolean d() {
        return ayek.i();
    }

    public final boolean f() {
        if (jkf.a(this.a)) {
            return super.f();
        }
        return true;
    }

    public final boolean e() {
        if (!ayek.i() || kr.a(this.a, "android.permission.ACCESS_FINE_LOCATION") == -1) {
            return true;
        }
        if (ayek.w()) {
            Context context = this.a;
            if (jgu.d(context, context.getPackageName()).isEmpty()) {
                return true;
            }
        }
        if (!ayek.a.a().seismicDisableForSupervised() || !ajgq.d(this.a)) {
            return super.e();
        }
        return true;
    }
}
