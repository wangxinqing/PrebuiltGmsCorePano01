package defpackage;

import java.util.List;

/* renamed from: bd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bd implements ah {
    private final Object a;
    private final q b = s.a.b(this.a.getClass());

    public bd(Object obj) {
        this.a = obj;
    }

    public final void a(aj ajVar, ac acVar) {
        q qVar = this.b;
        Object obj = this.a;
        q.a((List) qVar.a.get(acVar), ajVar, acVar, obj);
        q.a((List) qVar.a.get(ac.ON_ANY), ajVar, acVar, obj);
    }
}
