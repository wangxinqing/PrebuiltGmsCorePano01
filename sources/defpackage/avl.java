package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: avl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avl {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile avi b = null;
    private final Set c = new LinkedHashSet(1);
    private final Set d = new LinkedHashSet(1);
    private final Handler e = new Handler(Looper.getMainLooper());

    public final synchronized void a(ave ave) {
        if (this.b != null) {
            if (this.b.b != null) {
                ave.a(this.b.b);
            }
        }
        this.d.add(ave);
    }

    public final synchronized void b(ave ave) {
        if (this.b != null) {
            if (this.b.a != null) {
                ave.a(this.b.a);
            }
        }
        this.c.add(ave);
    }

    public final synchronized void c(ave ave) {
        this.d.remove(ave);
    }

    public final synchronized void d(ave ave) {
        this.c.remove(ave);
    }

    public avl(Callable callable) {
        a.execute(new avk(this, callable));
    }

    public final void a(avi avi) {
        if (this.b == null) {
            this.b = avi;
            this.e.post(new avj(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized void a(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ave) arrayList.get(i)).a(obj);
        }
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ave) arrayList.get(i)).a(th);
            }
            return;
        }
        bay.a("Lottie encountered an error but no failure listener was added:", th);
    }
}
