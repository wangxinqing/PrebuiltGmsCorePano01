package defpackage;

import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oib implements View.OnClickListener {
    private final HelpChimeraActivity a;

    public oib(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public void onClick(View view) {
        this.a.onBackPressed();
        oay.a(view);
    }
}
