package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fxn implements amqy {
    static final amqy a = new fxn();

    private fxn() {
    }

    public final Object a(Object obj) {
        Integer num = (Integer) fxp.a.get(Integer.valueOf(((ibr) obj).a()));
        if (num == null) {
            num = 8;
        }
        throw fxi.a(new ibr(new Status(num.intValue())));
    }
}
