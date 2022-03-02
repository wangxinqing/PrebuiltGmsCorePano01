package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aiam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiam {
    public aiaj a;
    public final List b;
    public final long c;

    public aiam() {
        this(20000);
    }

    public final long a() {
        aiaj aiaj = this.a;
        if (aiaj != null) {
            return aiaj.g;
        }
        return 0;
    }

    public final Object clone() {
        return new aiam(this.a, this.c, this.b);
    }

    public aiam(long j) {
        this((aiaj) null, j, new ArrayList());
    }

    private aiam(aiaj aiaj, long j, List list) {
        this.a = aiaj;
        this.c = j;
        this.b = list;
    }
}
