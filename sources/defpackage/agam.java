package defpackage;

import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: agam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agam implements Runnable {
    private final AccountParticleDisc a;

    public agam(AccountParticleDisc accountParticleDisc) {
        this.a = accountParticleDisc;
    }

    public final void run() {
        FrameLayout frameLayout = (FrameLayout) this.a.b.get();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }
}
