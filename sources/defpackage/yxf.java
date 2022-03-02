package defpackage;

import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: yxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxf {
    public static AudienceMember a(ixg ixg, String str) {
        String str2;
        ixh ixh = ixg.b;
        if (ixh == null) {
            ixh = ixh.d;
        }
        int i = ixg.a;
        if ((i & 4) != 0) {
            int a = ixj.a(ixg.d);
            if (a == 0) {
                a = 1;
            }
            int a2 = ixj.a(a);
            if (a2 != 0) {
                if (a2 == 1) {
                    str2 = "public";
                } else if (a2 == 2) {
                    str2 = "domain";
                } else if (a2 == 3) {
                    str2 = "myCircles";
                } else if (a2 == 4) {
                    str2 = "extendedCircles";
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown system group type: ");
                    sb.append(a);
                    throw new IllegalArgumentException(sb.toString());
                }
                return AudienceMember.c(str2, str);
            }
            throw null;
        } else if ((i & 2) != 0) {
            return AudienceMember.b(ixg.c, str);
        } else {
            int i2 = ixh.a;
            if ((i2 & 4) != 0) {
                return AudienceMember.a(ixh.c, str, (String) null);
            }
            if ((i2 & 1) != 0) {
                String str3 = ixh.b;
                return AudienceMember.a(str3, str3);
            }
            String valueOf = String.valueOf(ixg);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Unrecognized sharing target (");
            sb2.append(valueOf);
            sb2.append(")");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static Audience b(zej zej) {
        iww iww = new iww();
        iww.a((Collection) a(zej));
        int i = 1;
        boolean z = false;
        if (zej.g() && zej.f()) {
            z = true;
        }
        iww.b = z;
        if (zej.c()) {
            if (!zej.h()) {
                i = 2;
            }
            iww.a(i);
        }
        return iww.a();
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceMember audienceMember = (AudienceMember) it.next();
            zhx zhx = new zhx();
            if (audienceMember.c()) {
                String str = audienceMember.e;
                zhx.a(ycm.i(str) ? ycm.g(str) : ycm.e(str));
                zhx.b("person");
            } else if (audienceMember.a()) {
                zhx.a(audienceMember.d);
                zhx.b("circle");
            } else {
                zhx.b(audienceMember.d);
            }
            arrayList.add(zhx.a());
        }
        return arrayList;
    }

    public static ArrayList a(zej zej) {
        ArrayList arrayList = new ArrayList();
        if (zej.e()) {
            for (zhy zhy : zej.d()) {
                String d = zhy.d();
                String c = zhy.c();
                String b = zhy.b();
                if ("circle".equals(d)) {
                    arrayList.add(AudienceMember.b(c, b));
                } else if ("person".equals(d)) {
                    arrayList.add(AudienceMember.a(c, b, (String) null));
                } else if (!"allContacts".equals(d) && !"allCircles".equals(d)) {
                    arrayList.add(AudienceMember.c(d, b));
                }
            }
        }
        return arrayList;
    }

    public static List a(byte[] bArr) {
        ixc ixc = (ixc) aucj.a((aucj) ixc.c, bArr, aubs.c());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        aucx aucx = ixc.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            ixf ixf = (ixf) aucx.get(i);
            ixg ixg = ixf.a;
            if (ixg == null) {
                ixg = ixg.e;
            }
            arrayList2.add(a(ixg, ixf.b));
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AudienceMember audienceMember = (AudienceMember) arrayList2.get(i2);
            hashMap.put(audienceMember, audienceMember);
        }
        aucx aucx2 = ixc.a;
        int size3 = aucx2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ixd ixd = (ixd) aucx2.get(i3);
            if ((ixd.a & 2) != 0) {
                ixe ixe = ixd.b;
                if (ixe == null) {
                    ixe = ixe.b;
                }
                aucx aucx3 = ixe.a;
                int size4 = aucx3.size();
                int i4 = 0;
                while (i4 < size4) {
                    AudienceMember audienceMember2 = (AudienceMember) hashMap.get(a((ixg) aucx3.get(i4), (String) null));
                    if (audienceMember2 != null) {
                        arrayList.add(audienceMember2);
                        i4++;
                    } else {
                        String valueOf = String.valueOf((Object) null);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("No rendered information for ");
                        sb.append(valueOf);
                        sb.append(" available.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                continue;
            }
        }
        return arrayList;
    }

    public static zej a(Audience audience) {
        zei zei = new zei();
        zei.a((List) a(audience.b));
        int i = audience.c;
        if (i == 1) {
            zei.a(true);
        } else if (i == 2) {
            zei.a(false);
        }
        return zei.a();
    }
}
