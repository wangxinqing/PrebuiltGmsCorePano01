package defpackage;

import android.os.Bundle;
import android.util.Pair;
import java.util.LinkedList;
import java.util.List;

/* renamed from: enw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class enw {
    public final List a = new LinkedList();

    public static enw a() {
        return new enw();
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        for (Pair pair : this.a) {
            enx enx = (enx) pair.first;
            bundle.putString(enx.a(), enx.a(pair.second));
        }
        return bundle;
    }

    public final void a(enx enx, Object obj) {
        this.a.add(Pair.create(enx, obj));
    }
}
