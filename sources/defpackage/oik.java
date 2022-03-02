package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oik implements Observer {
    private final HelpChimeraActivity a;
    private final String b;
    private final nzz c;
    private final boolean d;
    private final boolean e;

    public oik(HelpChimeraActivity helpChimeraActivity, String str, nzz nzz, boolean z, boolean z2) {
        this.a = helpChimeraActivity;
        this.b = str;
        this.c = nzz;
        this.d = z;
        this.e = z2;
    }

    public final void update(Observable observable, Object obj) {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
