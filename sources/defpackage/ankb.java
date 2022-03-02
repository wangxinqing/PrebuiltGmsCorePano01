package defpackage;

import java.util.logging.Logger;

/* renamed from: ankb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankb extends anjw {
    public static final anjw a = new ankb();

    private ankb() {
    }

    public final anis a(String str) {
        return new anju(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
