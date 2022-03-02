package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwe implements icb, ica {
    public static final boolean a = awhr.b();
    private static final int e = 2;
    private static final int f = 3;
    public final String b;
    public final icc c;
    private final hol d;

    public static int a(boolean z, boolean z2) {
        if (!z2) {
            return z ? 4 : 2;
        }
        return 3;
    }

    public final void a(int i) {
    }

    public final void g(Bundle bundle) {
    }

    public dwe(Context context, String str) {
        this.d = new hol(context, "SOCIAL_APPINVITE", (String) null);
        ibz ibz = new ibz(context);
        ibz.a(hol.a);
        ibz.a((icb) this);
        ibz.a((ica) this);
        this.c = ibz.b();
        this.b = str;
    }

    public static anrm a(String str, String str2, String str3, int i, String str4) {
        aucd o = anrm.g.o();
        int i2 = 1;
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrm anrm = (anrm) o.b;
            str.getClass();
            anrm.a |= 1;
            anrm.b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrm anrm2 = (anrm) o.b;
            str2.getClass();
            anrm2.a |= 64;
            anrm2.f = str2;
        }
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrm anrm3 = (anrm) o.b;
            str3.getClass();
            anrm3.a |= 2;
            anrm3.c = str3;
        }
        if (i != 0) {
            int i3 = i - 1;
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 3;
            } else if (i3 == 3 || i3 == 4) {
                i2 = 2;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrm anrm4 = (anrm) o.b;
            anrm4.d = i2 - 1;
            anrm4.a |= 4;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anrm anrm5 = (anrm) o.b;
            str4.getClass();
            anrm5.a |= 16;
            anrm5.e = str4;
        }
        return (anrm) o.i();
    }

    public static ansa a(int i, long j) {
        aucd o = ansa.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansa ansa = (ansa) o.b;
        ansa.b = i - 1;
        int i2 = ansa.a | 1;
        ansa.a = i2;
        ansa.a = i2 | 2;
        ansa.c = j;
        return (ansa) o.i();
    }

    private static void a(List list, int i, int i2, int i3) {
        aucd o = anrg.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anrg anrg = (anrg) o.b;
        anrg.b = 1;
        anrg.a |= 1;
        anrg anrg2 = (anrg) o.i();
        aucd o2 = anrg.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anrg anrg3 = (anrg) o2.b;
        anrg3.b = 2;
        anrg3.a |= 1;
        anrg anrg4 = (anrg) o2.i();
        aucd o3 = anrg.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anrg anrg5 = (anrg) o3.b;
        anrg5.b = 3;
        anrg5.a = 1 | anrg5.a;
        anrg anrg6 = (anrg) o3.i();
        for (int i4 = 0; i4 < i; i4++) {
            list.add(anrg2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            list.add(anrg4);
        }
        for (int i6 = 0; i6 < i3; i6++) {
            list.add(anrg6);
        }
    }

    public static void a(List list, int[] iArr) {
        if (list != null && iArr.length >= 4) {
            iArr[0] = iArr[0] + list.size();
            for (int i = 0; i < list.size(); i++) {
                ContactPerson.ContactMethod a2 = ((ContactPerson) list.get(i)).a();
                if (a2 != null) {
                    int i2 = a2.a;
                    if (i2 == 0) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i2 == 1) {
                        iArr[2] = iArr[2] + 1;
                    } else if (i2 == 2) {
                        iArr[3] = iArr[3] + 1;
                    }
                }
            }
        }
    }

    public final void a() {
        if (a && !this.c.i() && !this.c.j()) {
            this.c.e();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        this.c.h();
    }

    public final void a(Object obj, int i, String str) {
        if (a && obj != null) {
            aucd o = anre.o.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anre anre = (anre) o.b;
            int i2 = i - 1;
            anre.c = i2;
            int i3 = anre.a | 2;
            anre.a = i3;
            if (str != null) {
                str.getClass();
                i3 |= 1;
                anre.a = i3;
                anre.b = str;
            }
            switch (i2) {
                case 1:
                    anrx anrx = (anrx) obj;
                    anrx.getClass();
                    anre.d = anrx;
                    anre.a = i3 | 4;
                    break;
                case 2:
                    ansb ansb = (ansb) obj;
                    ansb.getClass();
                    anre.e = ansb;
                    anre.a = i3 | 8;
                    break;
                case 3:
                    anrn anrn = (anrn) obj;
                    anrn.getClass();
                    anre.f = anrn;
                    anre.a = i3 | 16;
                    break;
                case 4:
                    anrk anrk = (anrk) obj;
                    anrk.getClass();
                    anre.g = anrk;
                    anre.a = i3 | 32;
                    break;
                case 5:
                    anrs anrs = (anrs) obj;
                    anrs.getClass();
                    anre.h = anrs;
                    anre.a = i3 | 64;
                    break;
                case 6:
                    anru anru = (anru) obj;
                    anru.getClass();
                    anre.i = anru;
                    anre.a = i3 | 128;
                    break;
                case 7:
                    anrv anrv = (anrv) obj;
                    anrv.getClass();
                    anre.j = anrv;
                    anre.a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                case 8:
                    anra anra = (anra) obj;
                    anra.getClass();
                    anre.k = anra;
                    anre.a = i3 | 512;
                    break;
                case 9:
                    anqz anqz = (anqz) obj;
                    anqz.getClass();
                    anre.l = anqz;
                    anre.a = i3 | 1024;
                    break;
                case 10:
                    anrc anrc = (anrc) obj;
                    anrc.getClass();
                    anre.m = anrc;
                    anre.a = i3 | 2048;
                    break;
                default:
                    anrh anrh = (anrh) obj;
                    anrh.getClass();
                    anre.n = anrh;
                    anre.a = i3 | FragmentTransaction.TRANSIT_ENTER_MASK;
                    break;
            }
            hoi a2 = this.d.a(((anre) o.i()).k());
            a2.b(i2);
            a2.b();
        }
    }

    public final void a(boolean z, List list, List list2, List list3, List list4, List list5, String str, String str2, int i, String str3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[4];
        a(list, iArr);
        a(list2, iArr);
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        if (list3 != null) {
            i2 = list3.size();
        } else {
            i2 = 0;
        }
        if (list4 != null) {
            i3 = list4.size();
        } else {
            i3 = 0;
        }
        if (list5 != null) {
            i4 = list5.size();
        } else {
            i4 = 0;
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, i6, i7, i8);
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2, i2, i3, i4);
        if (!z) {
            i5 = f;
        } else {
            i5 = e;
        }
        aucd o = anry.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anry anry = (anry) o.b;
        int i9 = anry.a | 16;
        anry.a = i9;
        anry.d = i;
        if (str != null) {
            str.getClass();
            i9 |= 4;
            anry.a = i9;
            anry.b = str;
        }
        if (str2 != null) {
            str2.getClass();
            i9 |= 8;
            anry.a = i9;
            anry.c = str2;
        }
        if (str3 != null) {
            str3.getClass();
            anry.a = i9 | 32;
            anry.e = str3;
        }
        if (!arrayList.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anry anry2 = (anry) o.b;
            if (!anry2.f.a()) {
                anry2.f = aucj.a(anry2.f);
            }
            auab.a((Iterable) arrayList, (List) anry2.f);
        }
        if (!arrayList2.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anry anry3 = (anry) o.b;
            if (!anry3.g.a()) {
                anry3.g = aucj.a(anry3.g);
            }
            auab.a((Iterable) arrayList2, (List) anry3.g);
        }
        anry anry4 = (anry) o.i();
        aucd o2 = anrx.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anrx anrx = (anrx) o2.b;
        int i10 = i5 - 1;
        if (i5 != 0) {
            anrx.b = i10;
            int i11 = anrx.a | 1;
            anrx.a = i11;
            anry4.getClass();
            anrx.c = anry4;
            anrx.a = i11 | 2;
            a((anrx) o2.i(), 2, this.b);
            return;
        }
        throw null;
    }
}
