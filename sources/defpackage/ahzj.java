package defpackage;

/* renamed from: ahzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahzj implements arne {
    private final ahzm a;

    public ahzj(ahzm ahzm) {
        this.a = ahzm;
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        ahzm ahzm = this.a;
        if (!axyu.d()) {
            ahzm.b();
        } else if (ahzm.a == arnh.a() && arnt.a == 128) {
            army army = (army) arnt.a((auef) army.c.c(7));
            int i = 1;
            if (army == null) {
                aucd o = army.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                army army2 = (army) o.b;
                army2.b = 0;
                army2.a |= 1;
                army = (army) o.i();
            }
            int a2 = armx.a(army.b);
            if (a2 != 0) {
                i = a2;
            }
            if (i - 1 != 0) {
                ahzm.a();
                ahzm.a(2);
                return;
            }
            ahzm.b();
        }
    }
}
