package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: gow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gow implements Runnable {
    final /* synthetic */ MinuteMaidChimeraActivity a;

    public gow(MinuteMaidChimeraActivity minuteMaidChimeraActivity) {
        this.a = minuteMaidChimeraActivity;
    }

    public final void run() {
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this.a;
        minuteMaidChimeraActivity.t = true;
        this.a.r.animate().alpha(0.0f).setDuration((long) minuteMaidChimeraActivity.getResources().getInteger(R.integer.sudTransitionDuration)).setListener(new gov(this)).start();
    }
}
