package defpackage;

import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class oan implements View.OnClickListener {
    private final HelpChimeraActivity a;
    private final int b;

    public oan(HelpChimeraActivity helpChimeraActivity, int i) {
        this.a = helpChimeraActivity;
        this.b = i;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        int i = this.b;
        oao.a(helpChimeraActivity);
        okg.e(helpChimeraActivity, i);
    }
}
