package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aapm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapm implements jms {
    static final aapm a = new aapm();

    private aapm() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aapl(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
