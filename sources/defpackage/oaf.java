package defpackage;

import android.content.Context;

/* renamed from: oaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oaf {
    private final Context a;

    public oaf(Context context) {
        this.a = context;
    }

    public final boolean a(oab oab) {
        if (oab.e() || oab.f() || oab.j() || oab.k() || oab.q() || oab.l() || oab.h() || oab.g() || oab.o()) {
            return true;
        }
        if (oab.m()) {
            return oah.a(oab.g, this.a);
        }
        if (!oab.n() || !oab.u()) {
            return false;
        }
        return new ohr(this.a).a(oab.v());
    }
}
