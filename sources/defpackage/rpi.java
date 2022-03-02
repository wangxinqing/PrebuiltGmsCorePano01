package defpackage;

import android.app.usage.UsageEvents;

/* renamed from: rpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rpi {
    public final UsageEvents.Event a;

    public rpi(UsageEvents.Event event) {
        this.a = event;
    }

    public final long a() {
        return this.a.getTimeStamp();
    }

    public final int b() {
        return this.a.getEventType();
    }
}
