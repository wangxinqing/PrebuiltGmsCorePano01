package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyu {
    private final StringBuilder a = new StringBuilder();
    private final List b = new ArrayList();

    private agyu() {
    }

    public static final agyu a() {
        return new agyu();
    }

    public final agyt b() {
        return new agys(this.a.toString(), this.b);
    }

    public final void a(String str) {
        this.a.append(str);
    }
}
