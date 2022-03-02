package defpackage;

import java.util.Map;

/* renamed from: aqsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsp extends aucd implements audy {
    public aqsp() {
        super((aucj) aqsr.d);
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (this.c) {
            c();
            this.c = false;
        }
        aqsr aqsr = aqsr.d;
        ((aqsr) this.b).a().put(str, str2);
    }

    public final void a(Map map) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqsr aqsr = aqsr.d;
        ((aqsr) this.b).a().putAll(map);
    }
}
