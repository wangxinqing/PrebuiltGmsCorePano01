package defpackage;

import android.os.Bundle;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: nyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyt {
    public final GoogleHelp a;

    public nyt(GoogleHelp googleHelp) {
        this.a = googleHelp;
    }

    public final String a() {
        return this.a.e;
    }

    public final void a(String str) {
        this.a.D = str;
    }

    public final String b() {
        return this.a.F;
    }

    public final Bundle c() {
        return this.a.d;
    }

    @Deprecated
    public final TogglingData d() {
        return this.a.w;
    }

    public final String e() {
        return this.a.D;
    }

    public final boolean f() {
        return this.a.E;
    }

    public final boolean g() {
        return this.a.A;
    }

    public final boolean h() {
        return this.a.B;
    }

    public final ErrorReport i() {
        return this.a.v;
    }
}
