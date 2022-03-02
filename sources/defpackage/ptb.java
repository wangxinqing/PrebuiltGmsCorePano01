package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ptb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptb implements Closeable {
    public final Context a;
    public avrb b;
    public final pta c = new pta();
    public final psl d;
    public ptd e;
    public final ptc f;
    public final aorr g;
    public final Executor h;

    public ptb(Context context, psl psl, ptc ptc, aorr aorr) {
        this.a = context;
        this.d = psl;
        this.f = ptc;
        this.e = null;
        this.h = aoqm.a;
        this.g = aorr;
    }

    public final aorr a(agtj agtj) {
        if (this.c.a.isEmpty()) {
            return aorl.a((Object) null);
        }
        pta pta = this.c;
        List list = pta.a;
        pta.a = new ArrayList();
        pta.b = 0;
        return agtj.a(list);
    }

    public final void close() {
        try {
            ((agtj) this.g.get()).close();
        } catch (InterruptedException | ExecutionException e2) {
        }
    }
}
