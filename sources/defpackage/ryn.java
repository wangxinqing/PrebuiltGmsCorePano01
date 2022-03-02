package defpackage;

import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncSubPolicy;

/* renamed from: ryn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ryn {
    public int a = 1;
    private final SyncSubPolicy b = SyncSubPolicy.a().a();
    private final SyncSubPolicy c = SyncSubPolicy.a().a();

    public final void a() {
        int i = this.a;
        SyncSubPolicy syncSubPolicy = this.b;
        SyncSubPolicy syncSubPolicy2 = this.c;
        new SyncPolicy(i, syncSubPolicy, syncSubPolicy, syncSubPolicy2, syncSubPolicy2, (Integer) null, false, false);
    }
}
