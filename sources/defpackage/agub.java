package defpackage;

import java.util.List;

/* renamed from: agub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agub implements aoqb {
    private final agui a;
    private final List b;
    private final List c;

    public agub(agui agui, List list, List list2) {
        this.a = agui;
        this.b = list;
        this.c = list2;
    }

    public final aorr a(Object obj) {
        agui agui = this.a;
        List list = this.b;
        List list2 = this.c;
        Exception exc = (Exception) obj;
        if (agsw.a(exc)) {
            return agok.a(agui.g.b.a(list), (Exception) new agte(exc));
        }
        return agok.a(agui.g.b.a(list2), (Exception) new agsy(exc));
    }
}
