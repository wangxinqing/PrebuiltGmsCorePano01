package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Collections;

/* renamed from: aijc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aijc {
    private long a = 0;
    private boolean b = false;
    public boolean u = false;
    public boolean v = true;
    public Collection w = Collections.emptyList();
    public boolean x = false;

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(StringBuilder sb) {
        sb.append("requested=");
        sb.append(this.u);
        sb.append(", enabled=");
        sb.append(this.v);
        if (this.a != 0) {
            sb.append(", start(ERT)=");
            sb.append(this.a);
            sb.append("ms");
        }
        sb.append(", clients=");
        sb.append(this.w);
    }

    public void b() {
        if (!this.u) {
            this.u = true;
            this.a = SystemClock.elapsedRealtime();
            g();
        }
        f();
    }

    public final void e() {
        if (this.u) {
            this.u = false;
            g();
        }
        f();
    }

    public final void f() {
        if (this.b) {
            this.b = false;
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void g() {
        this.b = true;
    }

    public final void b(boolean z) {
        if (this.x != z) {
            this.x = z;
            g();
        }
    }

    public final void a(Collection collection) {
        Collection collection2 = this.w;
        if ((collection2 != null && !collection2.equals(collection)) || (collection != null && !collection.equals(this.w))) {
            this.w = collection;
            g();
        }
    }

    public final void a(boolean z) {
        if (this.v != z) {
            this.v = z;
            g();
        }
    }
}
