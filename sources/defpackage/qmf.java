package defpackage;

import android.view.View;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;

/* renamed from: qmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmf implements View.OnClickListener {
    final /* synthetic */ OptInChimeraActivity a;

    public qmf(OptInChimeraActivity optInChimeraActivity) {
        this.a = optInChimeraActivity;
    }

    public void onClick(View view) {
        this.a.e.a("OptInActivity.onEmptyPressed");
        this.a.j();
    }
}
