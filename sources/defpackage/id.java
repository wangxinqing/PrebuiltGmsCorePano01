package defpackage;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: id  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class id implements Transition.TransitionListener {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public id(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
