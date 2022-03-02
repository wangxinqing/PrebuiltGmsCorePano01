package defpackage;

import java.util.List;

/* renamed from: aarx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aarx implements Runnable {
    private final aary a;
    private final List b;

    public aarx(aary aary, List list) {
        this.a = aary;
        this.b = list;
    }

    public final void run() {
        aary aary = this.a;
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aary.b.a(((aaxa) list.get(i)).k()).b();
        }
    }
}
