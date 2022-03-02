package defpackage;

import android.os.CountDownTimer;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.R;
import com.google.android.gms.update.InstallationOptions;
import java.util.concurrent.TimeUnit;

/* renamed from: adpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adpf extends CountDownTimer {
    final /* synthetic */ ador a;
    final /* synthetic */ adpo b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adpf(long j, long j2, ador ador, adpo adpo) {
        super(j, j2);
        this.a = ador;
        this.b = adpo;
    }

    public final void onFinish() {
        adpg.a.a("Rebooting now", new Object[0]);
        this.b.a(true);
        this.b.c((int) R.string.system_update_tv_restarting_countdown_complete);
        this.a.c().a(new InstallationOptions(true, true, true, false));
    }

    public final void onTick(long j) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        if (seconds > 0) {
            ador ador = this.a;
            ador.q();
            if (ador != null) {
                ador ador2 = this.a;
                ador2.q();
                if (!((ActivityBase) ador2).isFinishing()) {
                    this.b.a(false);
                    adpo adpo = this.b;
                    ador ador3 = this.a;
                    ador3.q();
                    adpo.c(((Activity) ador3).getResources().getQuantityString(R.plurals.system_update_tv_restarting_countdown, seconds, new Object[]{Integer.valueOf(seconds)}));
                }
            }
        }
    }
}
