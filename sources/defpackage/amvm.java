package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: amvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvm extends AbstractQueue {
    final amvp a = new amvk();

    /* renamed from: a */
    public final amvp peek() {
        amvp amvp = this.a;
        amvp amvp2 = ((amvk) amvp).a;
        if (amvp2 == amvp) {
            return null;
        }
        return amvp2;
    }

    public final void clear() {
        amvp amvp = ((amvk) this.a).a;
        while (true) {
            amvp amvp2 = this.a;
            if (amvp != amvp2) {
                amvp i = amvp.i();
                amvo.b(amvp);
                amvp = i;
            } else {
                amvk amvk = (amvk) amvp2;
                amvk.a = amvp2;
                amvk.b = amvp2;
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return ((amvp) obj).i() != amuq.a;
    }

    public final boolean isEmpty() {
        amvp amvp = this.a;
        return ((amvk) amvp).a == amvp;
    }

    public final Iterator iterator() {
        return new amvl(this, peek());
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        amvp amvp = (amvp) obj;
        amvo.b(amvp.j(), amvp.i());
        amvo.b(((amvk) this.a).b, amvp);
        amvo.b(amvp, this.a);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        amvp amvp = this.a;
        amvp amvp2 = ((amvk) amvp).a;
        if (amvp2 == amvp) {
            return null;
        }
        remove(amvp2);
        return amvp2;
    }

    public final boolean remove(Object obj) {
        amvp amvp = (amvp) obj;
        amvp j = amvp.j();
        amvp i = amvp.i();
        amvo.b(j, i);
        amvo.b(amvp);
        return i != amuq.a;
    }

    public final int size() {
        int i = 0;
        for (amvp amvp = ((amvk) this.a).a; amvp != this.a; amvp = amvp.i()) {
            i++;
        }
        return i;
    }
}
