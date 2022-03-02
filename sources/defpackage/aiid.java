package defpackage;

import android.location.Location;

/* renamed from: aiid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiid implements Runnable {
    private final aiie a;
    private final Location b;

    public aiid(aiie aiie, Location location) {
        this.a = aiie;
        this.b = location;
    }

    public final void run() {
        aiie aiie = this.a;
        Location location = this.b;
        if (aiie.e) {
            aiie.a(location);
        }
    }
}
