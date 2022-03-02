package com.google.android.ads.tasks;

import android.content.Context;
import com.google.ads.afma.proto2api.c;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b extends v {
    private static final w h = new w();
    private final Context i;

    public b(bhm bhm, String str, String str2, aucd aucd, int i2, Context context) {
        super(bhm, str, str2, aucd, i2, 29);
        this.i = context;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aucd aucd = this.g;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        c cVar = (c) aucd.b;
        c cVar2 = c.Q;
        "E".getClass();
        cVar.a |= 16777216;
        cVar.p = "E";
        AtomicReference a = h.a(this.i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.d.invoke((Object) null, new Object[]{this.i}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.g) {
            aucd aucd2 = this.g;
            String a2 = bfr.a(str.getBytes(), true);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            a2.getClass();
            cVar3.a |= 16777216;
            cVar3.p = a2;
        }
    }
}
