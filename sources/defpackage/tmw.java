package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tmw {
    final int a;
    final List b;

    private tmw(int i, List list) {
        ArrayList a2 = anda.a();
        this.b = a2;
        this.a = i;
        if (list != null) {
            a2.addAll(list);
        }
    }

    protected static tmw a() {
        return new tmw(8007, (List) null);
    }

    protected static tmw a(List list) {
        if (list.isEmpty()) {
            ((anih) tky.a.d()).a("StartOperationResult#success expected at least one medium but none were provided");
        }
        return new tmw(0, list);
    }
}
