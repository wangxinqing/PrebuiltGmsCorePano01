package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ctn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctn implements ctj {
    private final eb a;
    private final dr b;
    private final eg c;

    public ctn(eb ebVar) {
        this.a = ebVar;
        this.b = new ctk(ebVar);
        new ctl(ebVar);
        this.c = new ctm(ebVar);
    }

    public final List a() {
        Long l;
        ee a2 = ee.a("SELECT * FROM per_device_dismissed_onboarding_flow", 0);
        this.a.e();
        Cursor a3 = this.a.a((dg) a2);
        try {
            int a4 = ek.a(a3, "dismissalId");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                if (!a3.isNull(a4)) {
                    l = Long.valueOf(a3.getLong(a4));
                } else {
                    l = null;
                }
                arrayList.add(new cto(l));
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

    public final void a(cto... ctoArr) {
        this.a.e();
        this.a.f();
        try {
            this.b.a(ctoArr);
            this.a.h();
        } finally {
            this.a.g();
        }
    }
}
