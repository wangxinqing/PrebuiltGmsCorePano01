package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aapd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapd implements jms {
    static final aapd a = new aapd();

    private aapd() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aapc(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
