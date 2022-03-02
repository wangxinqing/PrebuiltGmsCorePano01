package defpackage;

import android.location.Location;
import java.io.PrintWriter;

/* renamed from: aikm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikm extends aikn {
    private final Location c;
    private final String d;

    public aikm(int i, Location location, String str) {
        super(i);
        this.c = new Location(location);
        this.d = str;
    }

    public final void a(PrintWriter printWriter) {
        printWriter.printf("%s LocationReceived(%08x): location=%s, message=%s%n", new Object[]{a(), Integer.valueOf(this.a), this.c, this.d});
    }
}
