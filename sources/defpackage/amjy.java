package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: amjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amjy {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReferenceQueue b = new ReferenceQueue();
    public final ExecutorService c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public amjy(ExecutorService executorService) {
        this.c = executorService;
    }
}
