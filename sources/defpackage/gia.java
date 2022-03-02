package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: gia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gia extends nis {
    private final String a;
    private gji b;
    private final ghu c;

    public gia(ghu ghu, String str) {
        super(187, "GetPasswordComplexity");
        this.c = ghu;
        this.a = str;
    }

    public final void a(Context context) {
        gji a2 = gji.a(context);
        this.b = a2;
        aucd o = baqa.f.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqa baqa = (baqa) o.b;
        str.getClass();
        baqa.a |= 1;
        baqa.b = str;
        a2.a(3, (baqa) o.i());
        int a3 = gjk.b().a();
        if (a3 != 1) {
            this.c.a(new Status(21600), a3);
            gji gji = this.b;
            aucd o2 = baqa.f.o();
            String str2 = this.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            baqa baqa2 = (baqa) o2.b;
            str2.getClass();
            baqa2.a = 1 | baqa2.a;
            baqa2.b = str2;
            int b2 = gji.b(a3);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            baqa baqa3 = (baqa) o2.b;
            baqa3.e = b2 - 1;
            baqa3.a |= 8;
            gji.a(4, (baqa) o2.i());
            return;
        }
        int a4 = ghm.a().a(context);
        this.c.a(new Status(0), a4);
        gji gji2 = this.b;
        aucd o3 = baqa.f.o();
        String str3 = this.a;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        baqa baqa4 = (baqa) o3.b;
        str3.getClass();
        baqa4.a = 1 | baqa4.a;
        baqa4.b = str3;
        int b3 = gji.b(a4);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        baqa baqa5 = (baqa) o3.b;
        baqa5.e = b3 - 1;
        baqa5.a |= 8;
        gji2.a(4, (baqa) o3.i());
    }

    public final void a(Status status) {
        this.c.a(status, 1);
        gji gji = this.b;
        aucd o = baqa.f.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqa baqa = (baqa) o.b;
        str.getClass();
        int i = 1 | baqa.a;
        baqa.a = i;
        baqa.b = str;
        baqa.e = 2;
        baqa.a = i | 8;
        gji.a(4, (baqa) o.i());
    }
}
