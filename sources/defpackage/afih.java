package defpackage;

import com.google.android.gms.mdh.MdhFootprintsReadResult;
import java.util.Collection;

/* renamed from: afih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afih implements amqy {
    private final afij a;

    public afih(afij afij) {
        this.a = afij;
    }

    public final Object a(Object obj) {
        MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
        aubq aubq = this.a.d;
        if (mdhFootprintsReadResult != null) {
            return new aepb(amzy.a((Collection) anda.a(mdhFootprintsReadResult.a, (amqy) new afid(aubq))), afia.a(mdhFootprintsReadResult.b));
        }
        return null;
    }
}
