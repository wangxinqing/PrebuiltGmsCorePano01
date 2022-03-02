package defpackage;

import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: vep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vep extends arwm {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ ClientAppIdentifier d;
    final /* synthetic */ String e;
    final /* synthetic */ List f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;
    final /* synthetic */ List i;
    final /* synthetic */ avco j;
    final /* synthetic */ vew k;
    final /* synthetic */ ves l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vep(ves ves, String str, List list, List list2, List list3, ClientAppIdentifier clientAppIdentifier, String str2, List list4, List list5, List list6, List list7, avco avco, vew vew) {
        super(str);
        this.l = ves;
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = clientAppIdentifier;
        this.e = str2;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = list7;
        this.j = avco;
        this.k = vew;
    }

    public final void run() {
        aucf aucf = (aucf) avda.h.o();
        List list = this.a;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avda avda = (avda) aucf.b;
        if (!avda.b.a()) {
            avda.b = aucj.a(avda.b);
        }
        auab.a((Iterable) list, (List) avda.b);
        aucf.b((Iterable) this.b);
        List list2 = this.c;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avda avda2 = (avda) aucf.b;
        if (!avda2.f.a()) {
            avda2.f = aucj.a(avda2.f);
        }
        auab.a((Iterable) list2, (List) avda2.f);
        String id = TimeZone.getDefault().getID();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avda avda3 = (avda) aucf.b;
        id.getClass();
        avda3.a |= 16;
        avda3.g = id;
        String a2 = this.l.k.a(this.d);
        if (a2 != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avda avda4 = (avda) aucf.b;
            a2.getClass();
            avda4.a |= 8;
            avda4.d = a2;
        }
        uwv uwv = this.l.f;
        if (!TextUtils.isEmpty(this.e)) {
            uwv = null;
        }
        uwv uwv2 = !this.d.c("0p:discoverer") ? uwv : null;
        HashSet hashSet = new HashSet();
        for (avaf avaf : this.f) {
            hashSet.add(avaf.b);
        }
        hashSet.addAll(this.g);
        if (hashSet.size() > 0) {
            if (aynf.b()) {
                ((anih) ((anih) tgc.a.d()).a("vep", "run", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s REQUEST %s", (Object) "ReportRpcManager: ", (Object) hashSet);
            }
            this.l.g.a(this.d.c.b, 16, (Set) hashSet, Collections.emptySet());
        }
        vef vef = this.l.b;
        ClientAppIdentifier clientAppIdentifier = this.d;
        List list3 = this.h;
        List list4 = this.i;
        List list5 = this.f;
        List list6 = this.g;
        avda avda5 = (avda) aucf.i();
        avco avco = this.j;
        vew vew = this.k;
        ves ves = this.l;
        List<auzg> list7 = this.b;
        anav j2 = anax.j();
        amzt j3 = amzy.j();
        for (auzg auzg : list7) {
            if ((auzg.a & 1) != 0) {
                auzf auzf = auzg.b;
                if (auzf == null) {
                    auzf = auzf.d;
                }
                int a3 = avaw.a(auzf.b);
                if (a3 != 0 && a3 == 107) {
                    auzf auzf2 = auzg.b;
                    if (auzf2 == null) {
                        auzf2 = auzf.d;
                    }
                    j3.c(auzf2);
                }
            }
        }
        for (vai vai : ((vak) thl.a(ves.a, vak.class)).a((auzf[]) j3.a().toArray(new auzf[0]))) {
            j2.b(vai.b);
        }
        new veu(vef.a, vef.b, clientAppIdentifier, list3, list4, list5, list6, avda5, avco, uwv2, vew, j2.a()).b();
    }
}
