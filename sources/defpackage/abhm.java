package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.util.Iterator;
import java.util.List;

/* renamed from: abhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abhm {
    public final abmk a;

    public abhm(abmk abmk) {
        this.a = abmk;
    }

    public static avik a(avix avix) {
        avij avij = (avij) avik.d.o();
        aucd o = avhs.m.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avhs avhs = (avhs) o.b;
        avix.getClass();
        avhs.i = avix;
        avhs.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        avij.a(o);
        return (avik) avij.i();
    }

    public static final avis a(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        avis avis = ((avhr) it.next()).j;
        return avis == null ? avis.f : avis;
    }
}
