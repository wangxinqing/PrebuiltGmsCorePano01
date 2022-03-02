package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: amym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amym implements Iterable {
    private final amri a;

    protected amym() {
        this.a = ampu.a;
    }

    public static amym a(Iterable iterable) {
        return iterable instanceof amym ? (amym) iterable : new amyi(iterable, iterable);
    }

    public static amym b(Iterable iterable) {
        amrl.a((Object) iterable);
        return new amyj(iterable);
    }

    public final anax c() {
        return anax.a(a());
    }

    public String toString() {
        return anbs.a(a());
    }

    public amym(Iterable iterable) {
        amrl.a((Object) iterable);
        this.a = amri.c(this == iterable ? null : iterable);
    }

    public static amym a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            amrl.a((Object) iterableArr[i]);
        }
        return new amyl(iterableArr);
    }

    public final amzy b() {
        return amzy.a(a());
    }

    public final boolean b(amrm amrm) {
        return anbs.b(a(), amrm);
    }

    public static amym a(Object[] objArr) {
        return a((Iterable) Arrays.asList(objArr));
    }

    public final amym a(amqy amqy) {
        return a(anbs.a(a(), amqy));
    }

    public final amym a(amrm amrm) {
        return a(anbs.a(a(), amrm));
    }

    public final amzy a(Comparator comparator) {
        return amzy.a((Comparator) anfk.a(comparator), a());
    }

    public final Iterable a() {
        return (Iterable) this.a.a((Object) this);
    }
}
