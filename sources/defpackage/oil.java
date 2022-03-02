package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oil implements Observer {
    private final HelpChimeraActivity a;
    private final nzc b;

    public oil(HelpChimeraActivity helpChimeraActivity, nzc nzc) {
        this.a = helpChimeraActivity;
        this.b = nzc;
    }

    public final void update(Observable observable, Object obj) {
        this.b.a(this.a.m);
    }
}
