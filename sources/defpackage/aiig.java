package defpackage;

import android.location.Location;

/* renamed from: aiig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiig implements Runnable {
    private final aiih a;
    private final Location b;

    public aiig(aiih aiih, Location location) {
        this.a = aiih;
        this.b = location;
    }

    public final void run() {
        aiih aiih = this.a;
        Location location = this.b;
        if (aiih.d) {
            aiih.a(location);
        }
    }
}
