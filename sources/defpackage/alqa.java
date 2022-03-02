package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: alqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqa {
    public final Map a = new EnumMap(alqc.class);

    public alqa() {
        for (alqc alqc : alqc.values()) {
            this.a.put(alqc, alqc.c);
        }
    }
}
