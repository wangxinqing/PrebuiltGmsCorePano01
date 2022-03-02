package defpackage;

/* renamed from: pen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pen implements amqy {
    private final per a;
    private final anuc b;

    public pen(per per, anuc anuc) {
        this.a = per;
        this.b = anuc;
    }

    public final Object a(Object obj) {
        boolean z;
        per per = this.a;
        anuc anuc = this.b;
        amri amri = (amri) obj;
        try {
            if (!amri.a() || !((anuc) ((afhu) amri.b()).a()).equals(anuc)) {
                z = true;
            } else {
                z = false;
            }
            if (axti.b()) {
                if (!z) {
                    ((aetj) per.b.a()).a(12009);
                } else {
                    ((aetj) per.b.a()).a(12010);
                }
            }
            return Boolean.valueOf(z);
        } catch (auda e) {
            if (axti.b()) {
                ((aetj) per.b.a()).a(12011);
            }
            return true;
        }
    }
}
