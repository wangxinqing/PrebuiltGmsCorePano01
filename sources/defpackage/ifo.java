package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: ifo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ifo extends ieg {
    private final iby b;

    public ifo(iby iby) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.b = iby;
    }

    public final idf a(idf idf) {
        this.b.a(0, idf);
        return idf;
    }

    public final Context b() {
        return this.b.c;
    }

    public final Looper c() {
        return this.b.h;
    }

    public final idf b(idf idf) {
        this.b.a(1, idf);
        return idf;
    }
}
