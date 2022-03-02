package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;

/* renamed from: ntp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntp extends ntr {
    final /* synthetic */ nrj a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ StringBuilder c;
    final /* synthetic */ nut d;

    public ntp(nrj nrj, ArrayList arrayList, StringBuilder sb, nut nut) {
        this.a = nrj;
        this.b = arrayList;
        this.c = sb;
        this.d = nut;
    }

    public final void a(long j, amnc amnc) {
        nrj nrj = this.a;
        if (amnc.l != 0) {
            if (System.currentTimeMillis() > amnc.m + ((long) (amnc.l * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))) {
                nrj.a(amnc, "SERVICE_NOT_AVAILABLE");
            } else {
                StringBuilder sb = this.c;
                sb.append(amnc.b);
                sb.append(",");
                nut nut = this.d;
                aucd aucd = (aucd) amnc.c(5);
                aucd.a((aucj) amnc);
                nut.a((audw) aucd);
                return;
            }
        }
        this.b.add(amnc.h);
    }
}
