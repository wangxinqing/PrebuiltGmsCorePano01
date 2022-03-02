package defpackage;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyw {
    public final tyu a;
    public final LruCache b = new LruCache((int) aymt.t());
    public final Context c;
    public final arwm d = new tyv(this, "DismissHalfSheet");
    private final AtomicInteger e = new AtomicInteger(-323583948);

    public tyw(Context context) {
        this.c = context;
        this.a = new tyu(context);
    }

    public final Integer a() {
        return Integer.valueOf(this.e.getAndIncrement());
    }
}
