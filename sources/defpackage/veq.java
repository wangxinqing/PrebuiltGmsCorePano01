package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: veq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class veq implements vew {
    final /* synthetic */ ClientAppIdentifier a;
    final /* synthetic */ ver b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ Set g;
    final /* synthetic */ ves h;
    final /* synthetic */ vej i;

    public veq(ves ves, ClientAppIdentifier clientAppIdentifier, ver ver, List list, List list2, List list3, List list4, Set set, vej vej) {
        this.h = ves;
        this.a = clientAppIdentifier;
        this.b = ver;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = set;
        this.i = vej;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        HashSet hashSet;
        int i2;
        avcx avcx = (avcx) obj;
        jjg jjg = tgc.a;
        this.b.b(this.c);
        int i3 = 0;
        this.h.i.a(ves.b(this.c), 4, 0);
        this.h.i.a(this.d, 4);
        this.h.j.a(ves.a(this.e), 4, 0);
        this.h.j.b(this.f, 4, 0);
        vah a2 = this.h.a(this.a);
        a2.a(this.g, false);
        HashSet hashSet2 = new HashSet();
        int i4 = 5;
        if ((avcx.a & 8) != 0) {
            ver ver = this.b;
            avdb avdb = avcx.e;
            if (avdb == null) {
                avdb = avdb.f;
            }
            List<avae> list = avdb.c;
            if (!ver.a.isEmpty()) {
                amzt amzt = new amzt();
                for (int i5 = 0; i5 < list.size(); i5++) {
                    avae avae = (avae) list.get(i5);
                    ob obVar = new ob();
                    aucx aucx = avae.b;
                    int size = aucx.size();
                    int i6 = 0;
                    while (i6 < size) {
                        String str = (String) aucx.get(i6);
                        String str2 = (String) ver.a.get(str);
                        if (str2 != null) {
                            str = str2;
                        }
                        obVar.add(str);
                        i6++;
                        i4 = 5;
                    }
                    aucd aucd = (aucd) avae.c(i4);
                    aucd.a((aucj) avae);
                    aucf aucf = (aucf) aucd;
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    avae avae2 = avae.h;
                    ((avae) aucf.b).b = aucj.s();
                    aucf.a((Iterable) obVar);
                    amzt.c((avae) aucf.i());
                }
                list = amzt.a();
            }
            vak vak = (vak) thl.a(this.h.a, vak.class);
            avdb avdb2 = avcx.e;
            if (avdb2 == null) {
                avdb2 = avdb.f;
            }
            vak.a((auze[]) avdb2.e.toArray(new auze[0]));
            avdb avdb3 = avcx.e;
            if (avdb3 == null) {
                avdb3 = avdb.f;
            }
            avai[] avaiArr = (avai[]) avdb3.b.toArray(new avai[0]);
            int length = avaiArr.length;
            int i7 = 0;
            while (true) {
                int i8 = 1;
                if (i7 >= length) {
                    break;
                }
                avai avai = avaiArr[i7];
                int a3 = avcj.a(avai.b);
                if (a3 != 0) {
                    i8 = a3;
                }
                if (i8 == 2) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
                tgh a4 = tgh.a(avai.a);
                vgw vgw = this.h.e;
                vgw.c.b();
                if (vgw.a.containsKey(a4)) {
                    ((vgx) vgw.a.get(a4)).f = i2;
                }
                i7++;
            }
            avdb avdb4 = avcx.e;
            if (avdb4 == null) {
                avdb4 = avdb.f;
            }
            String str3 = avdb4.d;
            if (!TextUtils.equals(this.h.k.a(this.a), str3)) {
                ((vbp) thl.a(this.h.a, vbp.class)).a(this.a, (avae[]) list.toArray(new avae[0]), str3);
                a2.a(this.g, true);
                a2.a((avae[]) list.toArray(new avae[0]), false);
            }
            if (!list.isEmpty()) {
                for (avae avae3 : list) {
                    hashSet2.addAll(avae3.b);
                }
            }
        }
        if ((avcx.a & 16) != 0) {
            avcv avcv = avcx.f;
            if (avcv == null) {
                avcv = avcv.c;
            }
            String str4 = avcv.b;
            if (!TextUtils.isEmpty(str4)) {
                this.h.f.a(str4);
            }
        }
        if ((avcx.a & 32) != 0) {
            ved ved = this.h.d;
            avcp avcp = avcx.g;
            if (avcp == null) {
                avcp = avcp.b;
            }
            ved.b.b();
            aucx aucx2 = avcp.a;
            int size2 = aucx2.size();
            int i9 = 0;
            while (i9 < size2) {
                avac avac = (avac) aucx2.get(i9);
                avch a5 = avch.a(avac.a);
                if (a5 == null) {
                    a5 = avch.TOKEN_MEDIUM_UNKNOWN;
                }
                avaa[] avaaArr = (avaa[]) avac.b.toArray(new avaa[i3]);
                ved.b.b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length2 = avaaArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length2) {
                    avaa avaa = avaaArr[i10];
                    int i12 = i11 + 1;
                    aucd aucd2 = (aucd) avaa.c(5);
                    aucd2.a((aucj) avaa);
                    HashSet hashSet3 = hashSet2;
                    int i13 = size2;
                    long j = avaa.d + elapsedRealtime;
                    aucx aucx3 = aucx2;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    avaa avaa2 = (avaa) aucd2.b;
                    avaa avaa3 = avaa.e;
                    int i14 = length2;
                    int i15 = avaa2.a | 4;
                    avaa2.a = i15;
                    avaa2.d = j;
                    long j2 = avaa.c;
                    avaa2.a = i15 | 2;
                    avaa2.c = j2 + elapsedRealtime;
                    avaaArr[i11] = (avaa) aucd2.i();
                    i10++;
                    hashSet2 = hashSet3;
                    i11 = i12;
                    size2 = i13;
                    aucx2 = aucx3;
                    length2 = i14;
                }
                aucx aucx4 = aucx2;
                HashSet hashSet4 = hashSet2;
                int i16 = size2;
                ved.a(a5, avaaArr);
                avac.b.size();
                avch a6 = avch.a(avac.a);
                if (a6 == null) {
                    a6 = avch.TOKEN_MEDIUM_UNKNOWN;
                }
                vgu.a(a6);
                i9++;
                hashSet2 = hashSet4;
                size2 = i16;
                aucx2 = aucx4;
                i3 = 0;
            }
            hashSet = hashSet2;
            ((vbf) thl.a(this.h.a, vbf.class)).c();
        } else {
            hashSet = hashSet2;
        }
        if (hashSet.size() > 0) {
            this.h.g.a((String) null, 17, (Set) hashSet, (Set) null);
        }
        this.i.a();
    }

    public final void a(vev vev, int i2) {
        if (!aynf.b() || !((anih) tgc.a.d()).l()) {
            jjg jjg = tgc.a;
            uye.g(i2);
        } else {
            ((anih) ((anih) tgc.a.d()).a("veq", "a", 544, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Call failed (network error, Nearby status code = %s) for client: %s", (Object) "ReportRpcManager: ", (Object) uye.g(i2), (Object) this.a);
        }
        this.b.b(this.c);
        this.h.i.a(ves.b(this.c), 3, i2);
        this.h.i.a(this.d, 3);
        this.h.j.a(ves.a(this.e), 3, i2);
        this.h.j.b(this.f, 3, i2);
        this.i.a();
    }
}
