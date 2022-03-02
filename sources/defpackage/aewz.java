package defpackage;

import android.accounts.Account;
import com.android.volley.toolbox.ImageRequest;
import java.util.List;

/* renamed from: aewz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewz extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aewz(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aewz.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aumy aumy;
        List list = (List) obj;
        int i = 0;
        Long l = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        for (afdx e : ((afeb) list.get(2)).a((Account) list.get(0), (aukh) list.get(1))) {
            aukf e2 = e.e();
            if (e2.a == 2) {
                aumy = (aumy) e2.b;
            } else {
                aumy = aumy.e;
            }
            i = Math.min(i + aumy.b, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
            if (z || (aumy.a & 2) == 0) {
                l2 = null;
                z = true;
            } else {
                long j = aumy.c;
                if (l2 != null) {
                    j = Math.max(l2.longValue(), j);
                }
                l2 = Long.valueOf(j);
            }
            if (z2 || (aumy.a & 4) == 0) {
                l = null;
                z2 = true;
            } else {
                long j2 = aumy.d;
                if (l != null) {
                    j2 = Math.min(l.longValue(), j2);
                }
                l = Long.valueOf(j2);
            }
        }
        return aorl.a((Object) aeti.a(i, l, l2));
    }
}
