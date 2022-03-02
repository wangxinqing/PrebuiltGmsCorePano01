package defpackage;

/* renamed from: qpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qpi implements amqy {
    final /* synthetic */ qsu a;

    public qpi(qsu qsu) {
        this.a = qsu;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        Long l = null;
        if (bool == null) {
            return new qpk(false, (Long) null);
        }
        if (axvz.h()) {
            qsu qsu = this.a;
            if (qsu != null && qsu.b().booleanValue()) {
                l = this.a.g;
            }
        } else {
            qsu qsu2 = this.a;
            if (qsu2 != null && qsu2.a().booleanValue()) {
                l = this.a.f;
            }
        }
        return new qpk(bool, l);
    }
}
