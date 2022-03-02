package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnm {
    public final AtomicInteger a = new AtomicInteger(0);
    public final agni b;
    public final Map c = new ConcurrentHashMap();
    public final List d;

    public agnm(String str) {
        new agnl(this);
        this.d = new ArrayList();
        this.b = agni.a(str, Thread.currentThread().getId(), 2);
    }
}
