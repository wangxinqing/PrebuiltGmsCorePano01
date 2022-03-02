package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: qpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qpa implements amqy {
    final /* synthetic */ qrf a;
    final /* synthetic */ qrg b;

    public qpa(qrf qrf, qrg qrg) {
        this.a = qrf;
        this.b = qrg;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List<qpc> list = (List) obj;
        if (list == null) {
            return false;
        }
        Boolean bool = true;
        HashSet<qrf> hashSet = new HashSet<>();
        for (qpc qpc : list) {
            bool = Boolean.valueOf(bool.booleanValue() & qpc.b.booleanValue());
            if (qpc.b.booleanValue()) {
                hashSet.add(qpc.a);
                if (qpc.a.equals(this.a) && this.a.a()) {
                    this.b.a(this.a.b.longValue());
                }
            }
        }
        if (!bool.booleanValue()) {
            qrg qrg = this.b;
            synchronized (qrg.b) {
                Set<qrf> a2 = qra.a(qrg.a("batch_indexing_windows"));
                HashSet hashSet2 = new HashSet();
                for (qrf qrf : a2) {
                    hashSet2.add(qrf.toString());
                }
                HashSet hashSet3 = new HashSet();
                for (qrf qrf2 : hashSet) {
                    hashSet3.add(qrf2.toString());
                }
                hashSet2.removeAll(hashSet3);
                qrg.a.edit().putStringSet("batch_indexing_windows", hashSet2).commit();
            }
        } else {
            this.b.c();
            if (this.a.a()) {
                this.b.a(this.a.b.longValue());
            }
        }
        qoi.a("Bulk mediastore status = %s", bool);
        return bool;
    }
}
