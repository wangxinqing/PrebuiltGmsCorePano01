package defpackage;

import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: onn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class onn implements Observer {
    private final GoogleHelpChimeraService a;
    private final nzc b;

    public onn(GoogleHelpChimeraService googleHelpChimeraService, nzc nzc) {
        this.a = googleHelpChimeraService;
        this.b = nzc;
    }

    public final void update(Observable observable, Object obj) {
        this.b.a(this.a.j);
    }
}
