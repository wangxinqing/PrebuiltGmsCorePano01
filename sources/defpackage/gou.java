package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: gou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gou implements Runnable {
    final /* synthetic */ MinuteMaidChimeraActivity a;

    public gou(MinuteMaidChimeraActivity minuteMaidChimeraActivity) {
        this.a = minuteMaidChimeraActivity;
    }

    public final void run() {
        if (!this.a.t) {
            MinuteMaidChimeraActivity.a.d("Timed-out. Loading took too long.", new Object[0]);
            aucd aucd = this.a.l.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anpp anpp = (anpp) aucd.b;
            anpp anpp2 = anpp.f;
            anpp.d = 2;
            anpp.a |= 4;
            this.a.a(2, (Intent) null);
        }
    }
}
