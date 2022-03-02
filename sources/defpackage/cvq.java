package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvq {
    public final Map a = new LinkedHashMap();
    public final Map b = new nz();

    public cvq() {
        quj.a();
    }

    public final void a(int i, int i2) {
        this.a.put(Integer.valueOf(i2), new cvn(ihs.b().getString(i), i2, -1, false));
    }

    public final void a(int i, int i2, int i3) {
        this.a.put(Integer.valueOf(i2), new cvn(ihs.b().getString(i), i2, i3, true));
    }
}
