package defpackage;

import java.util.Arrays;

/* renamed from: wls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wls implements ibj {
    public final int a;
    private final String b = null;

    public wls(wlr wlr) {
        this.a = wlr.a;
    }

    public static wlr a() {
        return new wlr();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wls) {
            wls wls = (wls) obj;
            if (this.a == wls.a) {
                String str = wls.b;
                if (ius.a((Object) null, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
