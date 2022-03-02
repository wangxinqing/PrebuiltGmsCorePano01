package defpackage;

import com.google.android.gms.audiomodem.DecodedToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uzi extends arwm {
    final /* synthetic */ List a;
    final /* synthetic */ uzj b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uzi(uzj uzj, String str, List list) {
        super(str);
        this.b = uzj;
        this.a = list;
    }

    public final void run() {
        uzn uzn = this.b.a.h;
        if (uzn != null) {
            List list = this.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                tgh tgh = new tgh(((DecodedToken) list.get(i2)).a);
                uzo uzo = uzn.a;
                if (uzo.c && !uzo.d.contains(tgh.a())) {
                    uzn.a.d.add(tgh.a());
                    jjg jjg = tgc.a;
                    vgu.a(uzn.a.a);
                    tgh.a();
                }
                avak avak = (avak) aval.d.o();
                String a2 = tgh.a();
                if (avak.c) {
                    avak.c();
                    avak.c = false;
                }
                aval aval = (aval) avak.b;
                a2.getClass();
                aval.a |= 1;
                aval.b = a2;
                aucd o = avam.e.o();
                avch avch = uzn.a.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avam avam = (avam) o.b;
                avam.b = avch.k;
                avam.a |= 1;
                avak.a((avam) o.i());
                arrayList.add(tgh);
                arrayList2.add((aval) avak.i());
            }
            vgr vgr = uzn.a.b;
            if (vgr != null) {
                uyy uyy = (uyy) vgr;
                uyy.d.b();
                int size2 = arrayList.size();
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    vgw vgw = uyy.a;
                    tgh tgh2 = (tgh) arrayList.get(i3);
                    vgw.c.b();
                    vgw.a();
                    if (vgw.a.containsKey(tgh2) && ((vgx) vgw.a.get(tgh2)).f == 3) {
                        arrayList3.add(Integer.valueOf(i3));
                        break;
                    }
                    i3++;
                }
                int size3 = arrayList3.size();
                if (size3 == 0) {
                    while (i < size2) {
                        uyy.a((tgh) arrayList.get(i), (aval) arrayList2.get(i));
                        i++;
                    }
                    return;
                }
                while (i < size3) {
                    int intValue = ((Integer) arrayList3.get(i)).intValue();
                    uyy.a((tgh) arrayList.get(intValue), (aval) arrayList2.get(intValue));
                    i++;
                }
            }
        }
    }
}
