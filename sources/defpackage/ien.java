package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ien  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ien extends ies {
    final /* synthetic */ iet a;
    private final Map c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ien(iet iet, Map map) {
        super(iet);
        this.a = iet;
        this.c = map;
    }

    public final void a() {
        abag abag;
        itj itj = new itj(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ibo ibo : this.c.keySet()) {
            if (!ibo.n() || ((iek) this.c.get(ibo)).a) {
                arrayList2.add(ibo);
            } else {
                arrayList.add(ibo);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                i = itj.a(this.a.c, (ibo) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = itj.a(this.a.c, (ibo) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) null);
            iet iet = this.a;
            iet.a.a((ifa) new iel(this, iet, connectionResult));
            return;
        }
        iet iet2 = this.a;
        if (iet2.f && (abag = iet2.e) != null) {
            abag.e();
        }
        for (ibo ibo2 : this.c.keySet()) {
            irr irr = (irr) this.c.get(ibo2);
            if (!ibo2.n() || itj.a(this.a.c, ibo2) == 0) {
                ibo2.a(irr);
            } else {
                iet iet3 = this.a;
                iet3.a.a((ifa) new iem(iet3, irr));
            }
        }
    }
}
