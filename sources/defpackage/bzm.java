package defpackage;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzm {
    public final String a;
    public final bzk b;
    public final long c;
    public final Collection d;
    public String e;
    public String f;
    public String g;
    public String h;
    public clg i;
    public SparseBooleanArray j;
    public int k;
    public int l = 0;
    public int m;
    public ArrayList n;
    public long o;
    public final long p;
    public int q;

    public bzm(ContextFenceRegistrationStub contextFenceRegistrationStub) {
        String str = contextFenceRegistrationStub.a;
        long j2 = contextFenceRegistrationStub.c;
        ContextFenceStub contextFenceStub = contextFenceRegistrationStub.b;
        iva.a((Object) contextFenceStub);
        bzk bzk = new bzk(contextFenceStub.c());
        iva.c(str);
        this.a = str;
        iva.a((Object) bzk);
        this.b = bzk;
        bzk.d = this;
        this.c = j2;
        long a2 = cbi.i().a();
        this.o = a2;
        this.p = a2;
        this.q = 0;
        ArrayList arrayList = null;
        this.n = null;
        ArrayList arrayList2 = new ArrayList();
        this.b.a((Collection) null, (Collection) arrayList2);
        if (!arrayList2.isEmpty() && awuz.a.a().m()) {
            arrayList = arrayList2;
        }
        this.d = arrayList;
    }

    public static String a(ContextManagerClientInfo contextManagerClientInfo, String str) {
        return a(contextManagerClientInfo.b, contextManagerClientInfo.a, contextManagerClientInfo.d, str);
    }

    public final void b(int i2) {
        this.m = this.l;
        this.l = i2;
        this.q = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bzm) {
            bzm bzm = (bzm) obj;
            return TextUtils.equals(this.e, bzm.e) && TextUtils.equals(this.a, bzm.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.e});
    }

    public static String a(String str, String str2, String str3, String str4) {
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(str4);
        return sb.toString();
    }

    public static void a(bzm bzm, int i2) {
        bzk bzk = bzm.b;
        if (i2 == 4 && !bzk.c()) {
            new Object[1][0] = bzm.e;
            return;
        }
        aucd o2 = atsx.e.o();
        String str = bzm.e;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atsx atsx = (atsx) o2.b;
        str.getClass();
        int i3 = atsx.a | 1;
        atsx.a = i3;
        atsx.b = str;
        atjt atjt = (atjt) bzk.c;
        atjt.getClass();
        atsx.d = atjt;
        atsx.a = i3 | 4;
        aucd o3 = atsw.d.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atsw atsw = (atsw) o3.b;
        atsw.b = i2 - 1;
        atsw.a |= 1;
        if (i2 == 4) {
            atsu s = bzk.s();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atsw atsw2 = (atsw) o3.b;
            s.getClass();
            atsw2.c = s;
            atsw2.a |= 2;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atsx atsx2 = (atsx) o2.b;
        atsw atsw3 = (atsw) o3.i();
        atsw3.getClass();
        atsx2.c = atsw3;
        atsx2.a |= 2;
        new Object[1][0] = o2.i();
        if (a(bzk)) {
            btx G = cbi.G();
            atsx atsx3 = (atsx) o2.i();
            if (atsx3 != null) {
                aucd b2 = btx.b();
                if (b2.c) {
                    b2.c();
                    b2.c = false;
                }
                jud jud = (jud) b2.b;
                jud jud2 = jud.i;
                atsx3.getClass();
                jud.h = atsx3;
                jud.a |= 64;
                G.a((jud) b2.i(), 7);
            }
        }
        jti jti = new jti(7, 10009, 1);
        jti.a(atsx.f, (atsx) o2.i());
        jti.a(jun.a(bzm.f, bzm.h, bzm.a));
        ContextData a2 = jti.a();
        WriteBatchImpl b3 = juc.b();
        b3.a(a2);
        ContextManagerClientInfo a3 = cbi.a(bsz.a, "ContextFenceRegistration");
        a2.a(a3.d, cbi.v().a(bsz.a, true).a.b);
        cbi.k().a(new bzl(b3, a3), bvq.a("ContextFenceRegistration_write_to_store"));
    }

    private static boolean a(bzk bzk) {
        if (bzk != null) {
            if (bzk.q()) {
                return bzk.a == atjs.PLACE_FENCE && bzk.e() == 4;
            }
            for (bzk a2 : bzk.a()) {
                if (a(a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set a() {
        HashSet hashSet = null;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            Iterator it = ((Set) this.i.valueAt(i2)).iterator();
            while (it.hasNext()) {
                cas cas = (cas) it.next();
                if (cas.a(cas, 6)) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cas);
                    it.remove();
                }
            }
            if (((Set) this.i.valueAt(i2)).isEmpty()) {
                this.j.put(this.i.keyAt(i2), false);
            }
        }
        return hashSet;
    }

    public final boolean a(int i2) {
        if (this.j == null) {
            ((anih) ((anih) bxk.a.b()).a("bzm", "a", 298, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceRegistration] Cannot add interest records; must first set activation state");
            return false;
        }
        Set set = (Set) this.i.get(i2);
        if (set == null) {
            ((anih) ((anih) bxk.a.b()).a("bzm", "a", 305, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceRegistration] Cannot find interest record for context %s!", i2);
            return false;
        }
        cbi.r().a((Collection) set, !awuz.n());
        if (this.j.get(i2, false)) {
            return false;
        }
        this.j.put(i2, true);
        return true;
    }

    public final boolean a(List list) {
        boolean z;
        SparseBooleanArray sparseBooleanArray = this.j;
        if (sparseBooleanArray == null) {
            ((anih) ((anih) bxk.a.b()).a("bzm", "a", 432, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextFenceRegistration] Cannot update interest records; must first set activation state");
            return false;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray.size());
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            sparseBooleanArray2.append(this.j.keyAt(i2), false);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (sparseBooleanArray2.indexOfKey(intValue) >= 0) {
                    sparseBooleanArray2.put(intValue, true);
                }
            }
        }
        cap r = cbi.r();
        boolean z2 = false;
        for (int i3 = 0; i3 < sparseBooleanArray2.size(); i3++) {
            int keyAt = sparseBooleanArray2.keyAt(i3);
            if (sparseBooleanArray2.valueAt(i3)) {
                Iterator it2 = ((Set) this.i.get(keyAt)).iterator();
                long a2 = cbi.i().a();
                while (it2.hasNext()) {
                    if (cas.a((cas) it2.next(), a2)) {
                        it2.remove();
                    }
                }
                r.a((Collection) this.i.get(keyAt), false);
                z = !this.j.valueAt(i3);
            } else {
                if (list != null && awuz.q()) {
                    for (cas cas : (Set) this.i.get(keyAt)) {
                        if (cas.f()) {
                            r.b(cas);
                        } else {
                            r.a(cas, false);
                        }
                    }
                } else {
                    r.b((Collection) this.i.get(keyAt));
                }
                z = this.j.valueAt(i3);
            }
            z2 |= z;
        }
        this.j = sparseBooleanArray2;
        return z2;
    }
}
