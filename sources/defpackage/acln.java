package defpackage;

import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: acln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acln implements Runnable {
    private final SourceLogManager a;
    private final long b;

    public acln(SourceLogManager sourceLogManager, long j) {
        this.a = sourceLogManager;
        this.b = j;
    }

    public final void run() {
        SourceLogManager sourceLogManager = this.a;
        long j = this.b;
        int i = D2DSetupChimeraActivity.e;
        hol hol = sourceLogManager.e;
        if (hol != null) {
            hol.a(j, TimeUnit.MILLISECONDS);
        }
    }
}
