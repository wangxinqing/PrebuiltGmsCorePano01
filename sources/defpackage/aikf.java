package defpackage;

import android.location.Location;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: aikf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikf extends aikn {
    private final List c;
    private final int d;
    private final Location e;

    public aikf(List list, int i, Location location) {
        super(275770293);
        this.c = list;
        this.d = i;
        this.e = new Location(location);
    }

    public final void a(PrintWriter printWriter) {
        printWriter.printf("%s FireAlerts(%08x): transition=%d, location=%s, geofences=%s%n", new Object[]{a(), Integer.valueOf(this.a), Integer.valueOf(this.d), this.e, this.c});
    }
}
