package defpackage;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: btx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btx {
    private final hol a = new hol(cbi.f(), "CONTEXT_MANAGER", (String) null);

    public static atnl a(ContextDataFilterImpl contextDataFilterImpl) {
        if (contextDataFilterImpl != null) {
            return a((Collection) contextDataFilterImpl.d());
        }
        return null;
    }

    public static aucd b() {
        aucd o = jud.i.o();
        aucd o2 = atou.e.o();
        int d = cbi.d();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atou atou = (atou) o2.b;
        atou.a |= 1;
        atou.b = d;
        String b = awwe.b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atou atou2 = (atou) o2.b;
        b.getClass();
        atou2.a |= 2;
        atou2.c = b;
        int size = cbi.y().a.size();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atou atou3 = (atou) o2.b;
        atou3.a |= 4;
        atou3.d = size;
        if (o.c) {
            o.c();
            o.c = false;
        }
        jud jud = (jud) o.b;
        atou atou4 = (atou) o2.i();
        atou4.getClass();
        jud.e = atou4;
        jud.a |= 8;
        return o;
    }

    public static atnl a(WriteBatchImpl writeBatchImpl) {
        ArrayList arrayList = new ArrayList(writeBatchImpl.a.size());
        ArrayList arrayList2 = writeBatchImpl.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((ContextData) arrayList2.get(i)).g()));
        }
        return a((Collection) arrayList);
    }

    private static atnl a(Collection collection) {
        if (collection == null) {
            return null;
        }
        atnk atnk = (atnk) atnl.b.o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            atnk.a(jtj.b(((Integer) it.next()).intValue()));
        }
        return (atnl) atnk.i();
    }

    public static atnm a(ContextFenceStub contextFenceStub) {
        if (contextFenceStub == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        contextFenceStub.b(hashSet);
        aucd o = atnm.b.o();
        for (Integer intValue : hashSet) {
            atjs a2 = atjs.a(intValue.intValue());
            if (a2 == null) {
                a2 = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            atnm atnm = (atnm) o.b;
            a2.getClass();
            if (!atnm.a.a()) {
                atnm.a = aucj.a(atnm.a);
            }
            atnm.a.d(a2.z);
        }
        return (atnm) o.i();
    }

    public static atnv a(FenceQueryRequestImpl fenceQueryRequestImpl) {
        if (fenceQueryRequestImpl == null) {
            return null;
        }
        aucd o = atnv.c.o();
        atnu atnu = (atnu) amrh.a(atnu.a(fenceQueryRequestImpl.a.a), atnu.UNKNOWN_QUERY_FENCE_OPERATION_TYPE);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnv atnv = (atnv) o.b;
        atnv.b = atnu.d;
        atnv.a |= 1;
        return (atnv) o.i();
    }

    public static atoc a(UpdateFenceOperation updateFenceOperation) {
        atno atno = null;
        if (updateFenceOperation == null) {
            return null;
        }
        ContextFenceRegistrationStub contextFenceRegistrationStub = updateFenceOperation.b;
        if (contextFenceRegistrationStub != null) {
            atnm a2 = a(contextFenceRegistrationStub.b);
            aucd o = atno.e.o();
            String str = contextFenceRegistrationStub.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atno atno2 = (atno) o.b;
            str.getClass();
            int i = atno2.a | 1;
            atno2.a = i;
            atno2.b = str;
            long j = contextFenceRegistrationStub.c;
            int i2 = i | 4;
            atno2.a = i2;
            atno2.d = j;
            if (a2 != null) {
                a2.getClass();
                atno2.c = a2;
                atno2.a = i2 | 2;
            }
            atno = (atno) o.i();
        }
        aucd o2 = atoc.f.o();
        atob atob = (atob) amrh.a(atob.a(updateFenceOperation.a), atob.UNKNOWN_FENCE_OPERATION_TYPE);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atoc atoc = (atoc) o2.b;
        atoc.b = atob.j;
        int i3 = atoc.a | 1;
        atoc.a = i3;
        long j2 = updateFenceOperation.g;
        int i4 = i3 | 4;
        atoc.a = i4;
        atoc.d = j2;
        long j3 = updateFenceOperation.h;
        int i5 = i4 | 8;
        atoc.a = i5;
        atoc.e = j3;
        if (atno != null) {
            atno.getClass();
            atoc.c = atno;
            atoc.a = i5 | 2;
        }
        return (atoc) o2.i();
    }

    private static atot a(ContextManagerClientInfo contextManagerClientInfo) {
        if (contextManagerClientInfo == null) {
            return null;
        }
        aucd o = atot.i.o();
        String str = contextManagerClientInfo.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atot atot = (atot) o.b;
        str.getClass();
        int i = atot.a | 1;
        atot.a = i;
        atot.b = str;
        String str2 = contextManagerClientInfo.d;
        str2.getClass();
        int i2 = 2;
        atot.a = i | 2;
        atot.c = str2;
        if (contextManagerClientInfo.a() != null) {
            if (contextManagerClientInfo.a().b()) {
                i2 = 3;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            atot atot2 = (atot) o.b;
            atot2.d = i2 - 1;
            atot2.a |= 4;
        }
        int i3 = contextManagerClientInfo.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atot atot3 = (atot) o.b;
        int i4 = atot3.a | 8;
        atot3.a = i4;
        atot3.e = i3;
        int i5 = contextManagerClientInfo.f;
        atot3.a = i4 | 16;
        atot3.f = i5;
        if (!TextUtils.isEmpty(contextManagerClientInfo.g)) {
            String str3 = contextManagerClientInfo.g;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atot atot4 = (atot) o.b;
            str3.getClass();
            atot4.a |= 32;
            atot4.g = str3;
        }
        if (!TextUtils.isEmpty(contextManagerClientInfo.h)) {
            String str4 = contextManagerClientInfo.h;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atot atot5 = (atot) o.b;
            str4.getClass();
            atot5.a |= 64;
            atot5.h = str4;
        }
        return (atot) o.i();
    }

    public static aucd a(int i, atjs atjs) {
        aucd o = atpj.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpj atpj = (atpj) o.b;
        atpj.b = i - 1;
        int i2 = atpj.a | 1;
        atpj.a = i2;
        atpj.d = atjs.z;
        atpj.a = i2 | 4;
        long a2 = cbi.i().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpj atpj2 = (atpj) o.b;
        atpj2.a |= 2;
        atpj2.c = a2;
        return o;
    }

    public static aucd a(ContextManagerClientInfo contextManagerClientInfo, int i, int i2) {
        aucd o = atnj.o.o();
        if (a(contextManagerClientInfo) != null) {
            atot a2 = a(contextManagerClientInfo);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atnj atnj = (atnj) o.b;
            a2.getClass();
            atnj.b = a2;
            atnj.a |= 1;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atnj atnj2 = (atnj) o.b;
        atnj2.c = i - 1;
        int i3 = atnj2.a | 2;
        atnj2.a = i3;
        atnj2.a = i3 | 4;
        atnj2.d = i2;
        return o;
    }

    public final void a() {
        aucd a2 = a(2, atjs.PLACE_FENCE);
        aucd o = atpf.c.o();
        atpl b = bzu.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpf atpf = (atpf) o.b;
        b.getClass();
        atpf.b = b;
        atpf.a |= 1;
        if (a2.c) {
            a2.c();
            a2.c = false;
        }
        atpj atpj = (atpj) a2.b;
        atpf atpf2 = (atpf) o.i();
        atpj atpj2 = atpj.g;
        atpf2.getClass();
        atpj.e = atpf2;
        atpj.a |= 8;
        a((atpj) a2.i());
    }

    public final void a(int i) {
        aucd o = atpu.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atpu atpu = (atpu) o.b;
        atpu.b = i - 1;
        atpu.a |= 1;
        atpu atpu2 = (atpu) o.i();
        aucd b = b();
        if (b.c) {
            b.c();
            b.c = false;
        }
        jud jud = (jud) b.b;
        jud jud2 = jud.i;
        atpu2.getClass();
        jud.g = atpu2;
        jud.a |= 32;
        a((jud) b.i(), 6);
    }

    public final void a(atnj atnj) {
        if (atnj != null) {
            aucd b = b();
            if (b.c) {
                b.c();
                b.c = false;
            }
            jud jud = (jud) b.b;
            jud jud2 = jud.i;
            atnj.getClass();
            jud.d = atnj;
            jud.a |= 4;
            a((jud) b.i(), 4);
        }
    }

    public final void a(atpj atpj) {
        if (atpj != null) {
            aucd b = b();
            if (b.c) {
                b.c();
                b.c = false;
            }
            jud jud = (jud) b.b;
            jud jud2 = jud.i;
            atpj.getClass();
            jud.c = atpj;
            jud.a |= 2;
            a((jud) b.i(), 3);
        }
    }

    public final void a(jud jud, int i) {
        int i2;
        if (jud != null) {
            new Object[1][0] = jud;
            hoi a2 = this.a.a(jud.k());
            if (!awwe.a.a().a()) {
                i2 = i - 1;
            } else {
                i2 = 7;
            }
            a2.b(i2);
            a2.b();
        }
    }
}
