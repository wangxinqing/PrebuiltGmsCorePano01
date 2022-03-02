package defpackage;

import com.google.android.gms.location.settings.LocationAccuracyChimeraActivity;

/* renamed from: rmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rmu implements Runnable {
    private final LocationAccuracyChimeraActivity a;
    private final boolean b;

    public rmu(LocationAccuracyChimeraActivity locationAccuracyChimeraActivity, boolean z) {
        this.a = locationAccuracyChimeraActivity;
        this.b = z;
    }

    public final void run() {
        this.a.c(this.b);
    }
}
