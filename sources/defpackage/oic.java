package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: oic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oic implements Observer {
    private final Runnable a;

    public oic(Runnable runnable) {
        this.a = runnable;
    }

    public final void update(Observable observable, Object obj) {
        Runnable runnable = this.a;
        String str = HelpChimeraActivity.a;
        runnable.run();
    }
}
