package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aapg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapg implements jms {
    static final aapg a = new aapg();

    private aapg() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aapf(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
