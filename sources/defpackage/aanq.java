package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aanq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aanq {
    protected Context a;
    private final Queue b = new ArrayDeque();
    private int c = -1;
    private boolean d = false;
    private PendingIntent e;

    static {
        aanq.class.getSimpleName();
    }

    public final synchronized void a(PendingIntent pendingIntent) {
        this.e = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Status status, zzw zzw, int i);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final synchronized void c() {
        if (this.c < 0) {
            this.c = Math.abs(new SecureRandom().nextInt());
        }
    }

    public final synchronized int d() {
        return this.c;
    }

    public final synchronized void e() {
        this.d = true;
    }

    public final synchronized boolean f() {
        return this.d;
    }

    public final synchronized void a(Status status, int i) {
        while (!this.b.isEmpty()) {
            a(status, (zzw) this.b.remove(), i);
        }
        this.b.clear();
        this.c = -1;
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.e = null;
        }
        this.d = false;
        b();
    }

    public final synchronized void a(zzw zzw) {
        if (zzw != null) {
            this.b.add(zzw);
        }
    }
}
