package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: aaql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaql implements jms {
    static final aaql a = new aaql();

    private aaql() {
    }

    public final jmr a(ViewGroup viewGroup, int i) {
        return new aaqk(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
