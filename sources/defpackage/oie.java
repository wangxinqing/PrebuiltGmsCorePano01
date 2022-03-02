package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oie implements View.OnClickListener {
    private final HelpChimeraActivity a;
    private final EditText b;

    public oie(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.a = helpChimeraActivity;
        this.b = editText;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        this.b.setText("");
        helpChimeraActivity.s.e();
        okg.i(helpChimeraActivity);
    }
}
