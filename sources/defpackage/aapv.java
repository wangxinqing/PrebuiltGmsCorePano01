package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aapv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapv implements jms {
    static final aapv a = new aapv();

    private aapv() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aapu(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
