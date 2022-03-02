package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: csv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class csv implements csr {
    private final eb a;
    private final dr b;
    private final eg c;

    public csv(eb ebVar) {
        this.a = ebVar;
        this.b = new css(ebVar);
        new cst(ebVar);
        this.c = new csu(ebVar);
    }

    public final List a() {
        Long l;
        ee a2 = ee.a("SELECT * FROM dismissed_prompt_item", 0);
        this.a.e();
        Cursor a3 = this.a.a((dg) a2);
        try {
            int a4 = ek.a(a3, "accountName");
            int a5 = ek.a(a3, "promptItemId");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                String string = a3.getString(a4);
                if (!a3.isNull(a5)) {
                    l = Long.valueOf(a3.getLong(a5));
                } else {
                    l = null;
                }
                arrayList.add(new csw(string, l));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.b();
        }
    }

    public final void b() {
        this.a.e();
        C0000do b2 = this.c.b();
        this.a.f();
        try {
            b2.b();
            this.a.h();
        } finally {
            this.a.g();
            this.c.a(b2);
        }
    }

    public final void a(List list) {
        this.a.e();
        StringBuilder a2 = el.a();
        a2.append("DELETE FROM dismissed_prompt_item WHERE accountName NOT IN (");
        el.a(a2, list.size());
        a2.append(")");
        C0000do a3 = this.a.a(a2.toString());
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            if (str == null) {
                a3.a(i);
            } else {
                a3.a(i, str);
            }
            i++;
        }
        this.a.f();
        try {
            a3.b();
            this.a.h();
        } finally {
            this.a.g();
        }
    }

    public final void a(csw... cswArr) {
        this.a.e();
        this.a.f();
        try {
            this.b.a(cswArr);
            this.a.h();
        } finally {
            this.a.g();
        }
    }
}
