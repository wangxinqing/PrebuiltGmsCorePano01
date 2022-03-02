package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: eb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eb {
    public Executor a;
    public de b;
    public final dw c;
    public boolean d;
    @Deprecated
    public volatile di e;
    private final ReentrantReadWriteLock f = new ReentrantReadWriteLock();
    private final ThreadLocal g = new ThreadLocal();

    public eb() {
        new ConcurrentHashMap();
        this.c = b();
    }

    public final Cursor a(dg dgVar) {
        j();
        e();
        return this.b.a().a(dgVar);
    }

    /* access modifiers changed from: protected */
    public abstract de a(dp dpVar);

    /* access modifiers changed from: protected */
    public abstract dw b();

    public final boolean c() {
        di diVar = this.e;
        return diVar != null && diVar.e();
    }

    public final void d() {
        if (c()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
            writeLock.lock();
            try {
                dx dxVar = this.c.g;
                this.b.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public final void e() {
        if (!i() && this.g.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void f() {
        j();
        di a2 = this.b.a();
        this.c.a(a2);
        a2.a();
    }

    @Deprecated
    public final void g() {
        this.b.a().b();
        if (!i()) {
            dw dwVar = this.c;
            if (dwVar.d.compareAndSet(false, true)) {
                dwVar.c.a.execute(dwVar.h);
            }
        }
    }

    @Deprecated
    public final void h() {
        this.b.a().c();
    }

    public final boolean i() {
        return this.b.a().d();
    }

    public static final void j() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final C0000do a(String str) {
        j();
        e();
        return this.b.a().c(str);
    }

    /* access modifiers changed from: package-private */
    public final Lock a() {
        return this.f.readLock();
    }
}
