package defpackage;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: ammm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammm extends ammk {
    public final Queue c = new ArrayDeque();
    private final List d = new ArrayList();

    public ammm(File file) {
        super(file);
    }

    /* access modifiers changed from: protected */
    public final InputStream a(long j, long j2) {
        ammn ammn = (ammn) this.c.poll();
        if (ammn == null) {
            ammh ammh = new ammh(this.a);
            this.d.add(ammh);
            ammn = new ammn(ammh);
        }
        ((ammh) ammn.a).a(j, j2);
        amml amml = new amml(this, ammn);
        ammn.c = true;
        ammn.b = amml;
        return ammn;
    }

    public final void close() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ammh ammh = (ammh) list.get(i);
            if (ammh != null) {
                try {
                    ammh.close();
                } catch (Exception e) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }
}
