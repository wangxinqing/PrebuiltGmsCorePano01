package defpackage;

import android.app.usage.UsageEvents;
import java.util.Iterator;

/* renamed from: rpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rpj implements Iterator {
    final /* synthetic */ UsageEvents a;

    public rpj(UsageEvents usageEvents) {
        this.a = usageEvents;
    }

    public final boolean hasNext() {
        return this.a.hasNextEvent();
    }

    public final void remove() {
    }

    public final /* bridge */ /* synthetic */ Object next() {
        UsageEvents.Event event = new UsageEvents.Event();
        this.a.getNextEvent(event);
        return new rpi(event);
    }
}
