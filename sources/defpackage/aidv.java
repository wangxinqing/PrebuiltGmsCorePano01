package defpackage;

import android.location.Location;
import java.util.Collections;

/* renamed from: aidv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidv implements Runnable {
    private final aiei a;
    private final Location b;

    public aidv(aiei aiei, Location location) {
        this.a = aiei;
        this.b = location;
    }

    public final void run() {
        aiei aiei = this.a;
        Location location = this.b;
        aifo aifo = aiei.d;
        if (aifo.d) {
            rev.k(location);
            aifo.e = location;
            aiew aiew = aifo.f;
            if (aiew != null) {
                aiew.e(Collections.singletonList(location));
            }
        }
    }
}
