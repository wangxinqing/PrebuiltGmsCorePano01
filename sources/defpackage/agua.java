package defpackage;

import java.util.List;

/* renamed from: agua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agua implements aoqb {
    private final agui a;
    private final List b;

    public agua(agui agui, List list) {
        this.a = agui;
        this.b = list;
    }

    public final aorr a(Object obj) {
        agui agui = this.a;
        List list = this.b;
        atxn atxn = (atxn) obj;
        agui.b = System.currentTimeMillis();
        return agui.g.b.a(list);
    }
}
