package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onx extends ons {
    private final InProductHelp f;

    public onx(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, InProductHelp inProductHelp) {
        super("ProcessInProductHelpAndPipOperation", googleHelpChimeraService, str, ojq);
        this.f = inProductHelp;
    }

    public final void a(Context context) {
        onw.a(this.f.a, this.d, this.a);
        this.e.a(this.f);
    }
}
