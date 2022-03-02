package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class cf {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);

    public final boolean c() {
        return this.b.get();
    }
}
