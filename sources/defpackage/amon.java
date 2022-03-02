package defpackage;

import java.io.IOException;

/* renamed from: amon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amon {
    public final IOException a;

    private amon(IOException iOException) {
        this.a = iOException;
    }

    public static amon a() {
        return new amon((IOException) null);
    }

    public final boolean b() {
        return this.a == null;
    }

    public static amon a(IOException iOException) {
        return new amon(iOException);
    }
}
