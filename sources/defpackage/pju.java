package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: pju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pju extends awem {
    private final pjq b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;

    public pju(pjq pjq, bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3, awef awef4) {
        super(bapu2, awey.a(pju.class), bapu);
        this.b = pjq;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.e.b(), this.f.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        pjq pjq = this.b;
        Context context = (Context) list.get(0);
        pjn pjn = (pjn) list.get(1);
        pcs pcs = (pcs) list.get(2);
        pjp pjp = (pjp) list.get(3);
        if (pcs != pcs.PASS) {
            pjn.a(new Status(10, String.format("App %s not authorized to perform %s on %s", new Object[]{pjq.a, pjn.b(), pjn.a().toString()})));
        } else if (pjp != pjp.PASS) {
            int ordinal = pjp.ordinal();
            if (ordinal == 1) {
                pjn.a(new Status(10, String.format("%s is not a valid account on this device.", new Object[]{pjn.c()})));
            } else if (ordinal == 2) {
                pjn.a(new Status(10, String.format("%s is not of required account type %s.", new Object[]{pjn.c(), "com.google"})));
            } else if (ordinal != 3) {
                pjn.a(new Status(8, String.format("%s is an unknown account check result.", new Object[]{Integer.valueOf(pjp.ordinal())})));
            } else {
                pjn.a(new Status(8, "Operation should not have an account."));
            }
        } else {
            pjn.e();
        }
        return aorl.a((Object) null);
    }
}
