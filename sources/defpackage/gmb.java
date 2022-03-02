package defpackage;

import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class gmb implements Runnable {
    private final PreAddAccountChimeraActivity a;
    private final FrpSnapshot b;

    public gmb(PreAddAccountChimeraActivity preAddAccountChimeraActivity, FrpSnapshot frpSnapshot) {
        this.a = preAddAccountChimeraActivity;
        this.b = frpSnapshot;
    }

    public final void run() {
        PreAddAccountChimeraActivity preAddAccountChimeraActivity = this.a;
        FrpSnapshot frpSnapshot = this.b;
        if (!preAddAccountChimeraActivity.isFinishing() && !preAddAccountChimeraActivity.isChangingConfigurations()) {
            preAddAccountChimeraActivity.e.g = true;
            if (frpSnapshot.e == null || !((Boolean) preAddAccountChimeraActivity.f().a(PreAddAccountChimeraActivity.c, false)).booleanValue()) {
                preAddAccountChimeraActivity.c();
                return;
            }
            FrpSnapshot frpSnapshot2 = preAddAccountChimeraActivity.e.c;
            if (frpSnapshot2 != null) {
                preAddAccountChimeraActivity.startActivityForResult(FreUnlockChimeraActivity.a(preAddAccountChimeraActivity, preAddAccountChimeraActivity.g(), ((Boolean) preAddAccountChimeraActivity.f().a(gmz.j, false)).booleanValue(), frpSnapshot2.e, frpSnapshot2.f), 3);
            } else {
                PreAddAccountChimeraActivity.a.e("Trying to launch forced re-enrollment before the FRP state has been loaded!", new Object[0]);
            }
        }
    }
}
