package defpackage;

import com.google.android.ulr.PresenceInterval;

/* renamed from: alkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkv {
    public static aujh a(PresenceInterval presenceInterval) {
        aucd o = aujh.c.o();
        if (((String) presenceInterval.b.get("startOffsetSec")) != null) {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.PresenceInterval.start_offset_sec");
        } else if (((String) presenceInterval.b.get("durationSec")) == null) {
            if (presenceInterval.b() != null) {
                int intValue = presenceInterval.b().intValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aujh aujh = (aujh) o.b;
                aujh.a |= 4;
                aujh.b = intValue;
            }
            return (aujh) o.i();
        } else {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.PresenceInterval.duration_sec");
        }
    }
}
