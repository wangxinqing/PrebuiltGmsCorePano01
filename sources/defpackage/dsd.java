package defpackage;

import java.util.List;

/* renamed from: dsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dsd extends ppr {
    final /* synthetic */ String a;
    final /* synthetic */ oyz b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ dsh e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsd(dsh dsh, aonk aonk, String str, String str2, oyz oyz, List list, List list2) {
        super(aonk, 2, str);
        this.e = dsh;
        this.a = str2;
        this.b = oyz;
        this.c = list;
        this.d = list2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        ozq b2 = this.e.a.b();
        String str = this.a;
        if (str != null) {
            pao pao = new pao(this.b.b, str);
            ozv e2 = b2.e(pao);
            if (e2 == null) {
                return null;
            }
            if (!e2.a(1)) {
                String b3 = ozv.b(1);
                String d2 = e2.d();
                StringBuilder sb = new StringBuilder(String.valueOf(b3).length() + 36 + String.valueOf(d2).length());
                sb.append("unregister: cannot ");
                sb.append(b3);
                sb.append(" when previously ");
                sb.append(d2);
                oso.b(sb.toString());
                this.c.add(false);
                return null;
            }
            this.d.add(((osz) e2.c()).f);
            this.c.add(Boolean.valueOf(this.e.a.a(pao, this.b)));
            return null;
        }
        anhk i = b2.a(this.b).listIterator();
        while (i.hasNext()) {
            pao pao2 = (pao) i.next();
            ozv e3 = b2.e(pao2);
            if (e3 != null && e3.a(1)) {
                if (ozq.a((osz) e3.c())) {
                    this.d.add(((osz) e3.c()).f);
                }
                this.c.add(Boolean.valueOf(this.e.a.a(pao2, this.b)));
            }
        }
        return null;
    }
}
