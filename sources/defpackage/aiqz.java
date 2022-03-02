package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.location.internal.server.GoogleLocationChimeraService;

/* renamed from: aiqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aiqz implements Runnable {
    private final aire a;
    private final PendingIntent b;
    private final ActivityRecognitionRequest c;
    private final boolean d;

    public aiqz(aire aire, PendingIntent pendingIntent, ActivityRecognitionRequest activityRecognitionRequest, boolean z) {
        this.a = aire;
        this.b = pendingIntent;
        this.c = activityRecognitionRequest;
        this.d = z;
    }

    public final void run() {
        boolean z;
        GoogleLocationChimeraService googleLocationChimeraService;
        aiov aiov;
        aire aire = this.a;
        PendingIntent pendingIntent = this.b;
        ActivityRecognitionRequest activityRecognitionRequest = this.c;
        boolean z2 = this.d;
        synchronized (aire.f) {
            if (axwx.f()) {
                z = aire.u.a(ajqw.b(pendingIntent));
            } else {
                z = true;
            }
            aiov aiov2 = aire.n;
            GoogleLocationChimeraService googleLocationChimeraService2 = aire.a;
            ajbg d2 = aire.d();
            if (!ahjk.a()) {
                googleLocationChimeraService = googleLocationChimeraService2;
                aiov = aiov2;
            } else {
                if (!axwu.d()) {
                    if (!ahjk.b(googleLocationChimeraService2, ajqw.b(pendingIntent), ajqw.a(pendingIntent))) {
                        googleLocationChimeraService = googleLocationChimeraService2;
                        aiov = aiov2;
                    }
                }
                ahma ahma = r2;
                googleLocationChimeraService = googleLocationChimeraService2;
                aiov = aiov2;
                ahma ahma2 = new ahma(googleLocationChimeraService2, ajqw.b(pendingIntent), ajqw.a(pendingIntent), z2, z, pendingIntent, activityRecognitionRequest, (ajrb) null, d2);
                aiov.a((Object) pendingIntent, (jio) ahma);
            }
            aiov.a(googleLocationChimeraService, d2, pendingIntent, activityRecognitionRequest, z2, z);
            aire.b(activityRecognitionRequest.b);
            if (!aire.d && axwx.g()) {
                aire.u.a((jhk) aire);
                aire.d = true;
            }
        }
    }
}
