package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aaps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaps implements jms {
    static final aaps a = new aaps();

    private aaps() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aapr(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), viewGroup.getContext());
    }
}
