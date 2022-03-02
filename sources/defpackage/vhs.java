package defpackage;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vhs implements acvv {
    private final ConsentsChimeraActivity a;

    public vhs(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public final void a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.a;
        vvl vvl = (vvl) obj;
        if (!consentsChimeraActivity.f) {
            TransitionManager.beginDelayedTransition((ViewGroup) consentsChimeraActivity.findViewById(16908290));
        }
        consentsChimeraActivity.h.setVisibility(8);
        consentsChimeraActivity.m.setText(vvl.a);
        vie vie = new vie(consentsChimeraActivity, vvl);
        String str = vvl.b;
        String string = consentsChimeraActivity.getString(R.string.sharing_consents_link_learn_more);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
        sb.append(str);
        sb.append(" ");
        sb.append(string);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(vie, vvl.b.length() + 1, spannableString.length(), 33);
        consentsChimeraActivity.n.setText(spannableString);
        consentsChimeraActivity.n.setMovementMethod(LinkMovementMethod.getInstance());
        consentsChimeraActivity.o.setText(vvl.c);
        consentsChimeraActivity.q.setText(vvl.f);
        consentsChimeraActivity.r.setText(vvl.e);
        consentsChimeraActivity.p.setVisibility(8);
        consentsChimeraActivity.i.setVisibility(0);
        consentsChimeraActivity.m.setVisibility(0);
        consentsChimeraActivity.n.setVisibility(0);
        consentsChimeraActivity.o.setVisibility(0);
        consentsChimeraActivity.q.setVisibility(0);
        consentsChimeraActivity.r.setVisibility(0);
    }
}
