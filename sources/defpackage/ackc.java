package defpackage;

import android.content.Intent;
import com.google.android.gms.smartdevice.setup.ui.AccountChallengeChimeraActivity;

/* renamed from: ackc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ackc implements acvp {
    final /* synthetic */ Intent a;
    final /* synthetic */ AccountChallengeChimeraActivity b;

    public ackc(AccountChallengeChimeraActivity accountChallengeChimeraActivity, Intent intent) {
        this.b = accountChallengeChimeraActivity;
        this.a = intent;
    }

    public final void a(acwa acwa) {
        this.b.setResult(-1, this.a);
        acpg.a(this.b);
    }
}
