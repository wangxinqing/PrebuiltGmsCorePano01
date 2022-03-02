package defpackage;

import java.util.ListIterator;

/* renamed from: amwl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwl extends amwj implements ListIterator {
    final /* synthetic */ amwm d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwl(amwm amwm) {
        super(amwm);
        this.d = amwm;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.d.isEmpty();
        b().add(obj);
        amwq.a(this.d.f);
        if (isEmpty) {
            this.d.c();
        }
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final Object previous() {
        return b().previous();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwl(amwm amwm, int i) {
        super(amwm, amwm.d().listIterator(i));
        this.d = amwm;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }
}
