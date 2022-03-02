package defpackage;

import android.os.CountDownTimer;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.concurrent.TimeUnit;

/* renamed from: adpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpg extends adoq {
    public static final iwd a = adnt.i("SetupForceApplyUpdateController");
    private static final long b = TimeUnit.SECONDS.toMillis(5);
    private CountDownTimer c;
    private final anax d = anax.a(531, 787, 1043);

    /* access modifiers changed from: protected */
    public final void b(int i, ador ador) {
        if (!ador.d().a() || !ador.f().a()) {
            a.e("layout() or systemUpdateStatus() is absent", new Object[0]);
            return;
        }
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) ador.f().b();
        adpo adpo = (adpo) ador.d().b();
        if (i == 3) {
            if (this.d.contains(Integer.valueOf(systemUpdateStatus.c))) {
                a.a("Forcing AB OTA installing as we are in TV Setup.", new Object[0]);
                ador.c().b(new InstallationOptions(true, true, true, false));
                return;
            }
            a.a("Forcing device to reboot to install OTA as we are in TV Setup.", new Object[0]);
            adpo.a(systemUpdateStatus.x.a);
            adpo.b(systemUpdateStatus.x.b);
            adpo.d(0);
            adpo.d(systemUpdateStatus.x.c);
            adpo.e(100);
            adpo.b(false);
            adpo.c(false);
            adpf adpf = new adpf(b, TimeUnit.SECONDS.toMillis(1), ador, adpo);
            this.c = adpf;
            adpf.start();
        } else if ((i == -3 || i == 2) && this.c != null) {
            adpo.a(true);
            this.c.cancel();
        }
    }
}
