package defpackage;

import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;

/* renamed from: ryw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ryw implements igp {
    private final MdhBroadcastListenerKey a;
    private final MdhBroadcastListenerParams b;

    public ryw(MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
        this.a = mdhBroadcastListenerKey;
        this.b = mdhBroadcastListenerParams;
    }

    public final void a(Object obj, Object obj2) {
        ((sav) ((sbc) obj).x()).a((ifu) new ryy((acwd) obj2), this.a, this.b);
    }
}
