package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: amty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amty extends AbstractQueue {
    final amvp a = new amtw();

    /* renamed from: a */
    public final amvp peek() {
        amvp amvp = this.a;
        amvp amvp2 = ((amtw) amvp).a;
        if (amvp2 == amvp) {
            return null;
        }
        return amvp2;
    }

    public final void clear() {
        amvp amvp = ((amtw) this.a).a;
        while (true) {
            amvp amvp2 = this.a;
            if (amvp != amvp2) {
                amvp f = amvp.f();
                amvo.a(amvp);
                amvp = f;
            } else {
                amtw amtw = (amtw) amvp2;
                amtw.a = amvp2;
                amtw.b = amvp2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((amvp) obj).f() != amuq.a;
    }

    public final boolean isEmpty() {
        amvp amvp = this.a;
        return ((amtw) amvp).a == amvp;
    }

    public final Iterator iterator() {
        return new amtx(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        amvp amvp = (amvp) obj;
        amvo.a(amvp.g(), amvp.f());
        amvo.a(((amtw) this.a).b, amvp);
        amvo.a(amvp, this.a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        amvp amvp = this.a;
        amvp amvp2 = ((amtw) amvp).a;
        if (amvp2 == amvp) {
            return null;
        }
        remove(amvp2);
        return amvp2;
    }

    public final boolean remove(Object obj) {
        amvp amvp = (amvp) obj;
        amvp g = amvp.g();
        amvp f = amvp.f();
        amvo.a(g, f);
        amvo.a(amvp);
        return f != amuq.a;
    }

    public final int size() {
        int i = 0;
        for (amvp amvp = ((amtw) this.a).a; amvp != this.a; amvp = amvp.f()) {
            i++;
        }
        return i;
    }
}
