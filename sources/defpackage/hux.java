package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.List;

/* renamed from: hux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hux {
    static final hux a = new hux();
    public final avtn b;
    public final amzy c;
    public final amzy d;

    private hux() {
        this.c = amzy.h();
        this.b = null;
        this.d = amzy.h();
    }

    public hux(avtn avtn, List list) {
        iva.a((Object) avtn);
        this.b = avtn;
        iva.a((Object) list);
        this.c = amzy.a((Collection) list);
        this.d = amzy.h();
    }

    @Deprecated
    public hux(avtn avtn, List list, List list2) {
        iva.a((Object) list);
        amzt j = amzy.j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            j.c(new huw((File) null, (auay) list.get(i), 1));
        }
        this.c = j.a();
        iva.a((Object) avtn);
        this.b = avtn;
        this.d = amzy.a((Collection) list2);
    }
}
