package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: afic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afic implements afit {
    public final Executor a;
    public final Set b = new HashSet();
    public final rza c;

    public afic(rza rza, Executor executor) {
        this.c = rza;
        this.a = executor;
    }

    public final aorr a(afiu afiu, afiw afiw) {
        MdhBroadcastListenerParams mdhBroadcastListenerParams;
        Executor executor = this.a;
        rza rza = this.c;
        MdhBroadcastListenerKey a2 = afhz.a(afiu);
        if (afiw != null) {
            mdhBroadcastListenerParams = new MdhBroadcastListenerParams(afie.a(((afis) afiw).a));
        } else {
            mdhBroadcastListenerParams = null;
        }
        sbb sbb = rza.a;
        iha b2 = ihb.b();
        b2.a = new ryw(a2, mdhBroadcastListenerParams);
        b2.b = new Feature[]{oqd.c};
        return afin.a(executor, sbb.a(b2.a()));
    }
}
