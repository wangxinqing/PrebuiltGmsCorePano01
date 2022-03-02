package defpackage;

import java.io.OutputStream;
import java.util.List;

/* renamed from: ahap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahap implements agzk {
    private OutputStream a;
    private ahbo b;

    public final void a() {
        if (this.b != null) {
            this.a.flush();
            this.b.a();
            return;
        }
        throw new ahbp("Cannot sync underlying stream");
    }

    public final void a(List list) {
    }

    public final void b(List list) {
        OutputStream outputStream = (OutputStream) anbs.d(list);
        if (outputStream instanceof ahbo) {
            this.b = (ahbo) outputStream;
            this.a = (OutputStream) list.iterator().next();
        }
    }
}
