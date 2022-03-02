package defpackage;

import java.util.Map;

/* renamed from: htw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class htw implements amqy {
    private final Map a;

    public htw(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        Map map = this.a;
        avsl avsl = (avsl) obj;
        aucd aucd = (aucd) avsl.c(5);
        aucd.a((aucj) avsl);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avsl avsl2 = avsl.b;
        ((avsl) aucd.b).c().putAll(map);
        return (avsl) aucd.i();
    }
}
