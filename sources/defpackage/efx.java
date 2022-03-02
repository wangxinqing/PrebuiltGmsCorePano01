package defpackage;

import com.google.android.gms.audiomodem.AudioModemBroadcastReceiver;

/* renamed from: efx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efx implements Runnable {
    private final efz a;
    private final Runnable b;

    public efx(efz efz, Runnable runnable) {
        this.a = efz;
        this.b = runnable;
    }

    public final void run() {
        ede ede;
        efz efz = this.a;
        Runnable runnable = this.b;
        eda eda = efz.b;
        efy efy = new efy(efz, runnable);
        AudioModemBroadcastReceiver audioModemBroadcastReceiver = eda.g;
        if (audioModemBroadcastReceiver.c) {
            audioModemBroadcastReceiver.a.unregisterReceiver(audioModemBroadcastReceiver);
            audioModemBroadcastReceiver.c = false;
        }
        if (eda.f) {
            eda.e.a();
        }
        if (eda.d) {
            ees ees = eda.c;
            ees.c = efy;
            edf edf = ees.a;
            edf.k = true;
            for (int i = 0; i < edf.a.length; i++) {
                if (edf.g[i]) {
                    edf.b(i);
                }
            }
            for (int i2 = 0; i2 < edf.a.length; i2++) {
                edf.d[i2].post(new edc(edf, i2));
            }
            if (!edf.a() && (ede = edf.e) != null) {
                ede.a();
                return;
            }
            return;
        }
        efy.run();
    }
}
