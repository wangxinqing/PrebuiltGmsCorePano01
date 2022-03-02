package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: vhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vhw implements View.OnClickListener {
    private final ConsentsChimeraActivity a;

    public vhw(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public void onClick(View view) {
        ConsentsChimeraActivity consentsChimeraActivity = this.a;
        acwa b = consentsChimeraActivity.f().t().b(new vid(consentsChimeraActivity));
        b.a((acvv) new vhq(consentsChimeraActivity));
        b.a((acvs) new vhr(consentsChimeraActivity));
    }
}
