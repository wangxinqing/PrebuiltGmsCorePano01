package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: juc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juc {
    public static final ibq a = gra.a;

    static {
        ibq ibq = gra.a;
    }

    @Deprecated
    public static icf a(icc icc, PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent);
        jtz jtz = new jtz(icc, pendingIntent);
        icc.a((idf) jtz);
        return jtz;
    }

    @Deprecated
    public static WriteBatchImpl b() {
        return new WriteBatchImpl();
    }

    @Deprecated
    public static icf a(icc icc, jtn jtn) {
        jwp jwp = new jwp(icc, jtn);
        icc.a((idf) jwp);
        return jwp;
    }

    @Deprecated
    public static icf b(icc icc, jtn jtn) {
        jwn jwn = new jwn(icc, jtn);
        icc.a((idf) jwn);
        return jwn;
    }

    @Deprecated
    public static icf a(icc icc, jtn jtn, PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent);
        jtx jtx = new jtx(icc, jtn, pendingIntent);
        icc.a((idf) jtx);
        return jtx;
    }

    @Deprecated
    public static icf a(icc icc, jtn jtn, jtv jtv) {
        iva.a((Object) jtv);
        return icc.a((idf) new jtw(icc, jtn, jtv));
    }

    @Deprecated
    public static icf a(icc icc, jtv jtv) {
        iva.a((Object) jtv);
        return icc.a((idf) new jty(icc, jtv));
    }

    @Deprecated
    public static jua a() {
        return new InterestUpdateBatchImpl();
    }
}
