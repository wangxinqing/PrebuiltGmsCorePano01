package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vie extends ClickableSpan {
    final /* synthetic */ vvl a;
    final /* synthetic */ ConsentsChimeraActivity b;

    public vie(ConsentsChimeraActivity consentsChimeraActivity, vvl vvl) {
        this.b = consentsChimeraActivity;
        this.a = vvl;
    }

    public void onClick(View view) {
        ConsentsChimeraActivity consentsChimeraActivity = this.b;
        vvl vvl = this.a;
        ajwe ajwe = new ajwe(consentsChimeraActivity);
        ajwe.d(vvl.a);
        ajwe.c((CharSequence) vvl.d);
        ajwe.d((CharSequence) consentsChimeraActivity.getString(R.string.sharing_consents_dismiss_learn_more), vhu.a);
        ajwe.c();
    }
}
