package defpackage;

import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.chimera.Activity;

/* renamed from: lvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lvq extends PackageInstaller.SessionCallback {
    public final Activity a;
    public PackageManager b;
    public PackageInstaller c;
    public int d = -1;
    public int e;
    float f;
    final /* synthetic */ lvr g;

    public lvq(lvr lvr, Activity activity) {
        this.g = lvr;
        this.a = activity;
    }

    public final void onActiveChanged(int i, boolean z) {
        StringBuilder sb = new StringBuilder(65);
        sb.append("DrivingModeFrxDownloadFragment#onActiveChanged: ");
        sb.append(i);
        sb.append(" ");
        sb.append(z);
        Log.i("CAR.DRIVINGMODE", sb.toString());
        if (i == this.d && !z && this.e != 5) {
            this.e = 5;
            this.g.a();
        }
    }

    public final void onBadgingChanged(int i) {
    }

    public final void onCreated(int i) {
        PackageInstaller.SessionInfo sessionInfo = this.c.getSessionInfo(i);
        if (sessionInfo != null) {
            if (sessionInfo.getAppPackageName().equals("com.google.android.projection.gearhead")) {
                this.d = i;
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("DrivingModeFrxDownloadFragment#onCreated: ");
            sb.append(i);
            Log.i("CAR.DRIVINGMODE", sb.toString());
        }
    }

    public final void onFinished(int i, boolean z) {
        StringBuilder sb = new StringBuilder(59);
        sb.append("DrivingModeFrxDownloadFragment#onFinished ");
        sb.append(i);
        sb.append(" ");
        sb.append(z);
        sb.toString();
        if (i != this.d) {
            return;
        }
        if (z) {
            lvr lvr = this.g;
            lvr.g.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS);
            lvr.a.a((lut) new lvp(lvr));
        } else if (this.e != 5) {
            this.e = 5;
            this.g.a();
        }
    }

    public final void onProgressChanged(int i, float f2) {
        StringBuilder sb = new StringBuilder(77);
        sb.append("DrivingModeFrxDownloadFragment#onProgressChanged: ");
        sb.append(i);
        sb.append(" ");
        sb.append(f2);
        sb.toString();
        if (i == this.d) {
            this.g.a(f2);
        }
    }
}
