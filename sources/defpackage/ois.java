package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ois  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ois implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ HelpChimeraActivity b;

    public ois(HelpChimeraActivity helpChimeraActivity, boolean z) {
        this.b = helpChimeraActivity;
        this.a = z;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
