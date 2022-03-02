package defpackage;

import java.util.List;

/* renamed from: qrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qrv implements amqy {
    final /* synthetic */ qry a;

    public qrv(qry qry) {
        this.a = qry;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List<Boolean> list = (List) obj;
        this.a.d.b();
        if (list == null) {
            this.a.d.b(4);
            qoh.a().a(this.a.d.a());
            return false;
        }
        Boolean bool = true;
        for (Boolean booleanValue : list) {
            bool = Boolean.valueOf(bool.booleanValue() & booleanValue.booleanValue());
        }
        if (bool.booleanValue()) {
            this.a.d.b(3);
        } else {
            this.a.d.b(4);
        }
        qoh a2 = qoh.a();
        qrd qrd = this.a.d;
        qrd.b();
        a2.a(qrd.a());
        return bool;
    }
}
