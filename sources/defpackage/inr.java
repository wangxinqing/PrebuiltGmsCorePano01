package defpackage;

import android.util.Log;
import java.util.List;

/* renamed from: inr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class inr implements acvf {
    private final aogx a;

    public inr(aogx aogx) {
        this.a = aogx;
    }

    public final Object a(acwa acwa) {
        aogx aogx = this.a;
        if (!acwa.b()) {
            Log.w("ClearcutFixerLogger", "Failed to determine opt-in status. Dropping log.");
            return null;
        }
        List<hol> list = (List) acwa.d();
        if (list.isEmpty()) {
            return null;
        }
        avsd avsd = avsd.DEFAULT;
        aucd o = aohl.u.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohl aohl = (aohl) o.b;
        aogx.getClass();
        aohl.m = aogx;
        aohl.a |= 128;
        aohl aohl2 = (aohl) o.i();
        for (hol a2 : list) {
            hoi a3 = a2.a((audx) aohl2);
            a3.f = avsd;
            a3.b(14);
            a3.b();
        }
        return null;
    }
}
