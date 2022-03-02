package defpackage;

import android.accounts.Account;

/* renamed from: agos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agos {
    private final agny a;
    private final amsv b;
    private final afjl c;
    private final int d;
    private final boolean e;
    private final int f;

    public agos(agny agny, int i, amsv amsv, afjl afjl, boolean z) {
        this.a = agny;
        this.f = i;
        this.b = amsv;
        this.c = afjl;
        this.d = !z ? 1 : 2;
        this.e = z;
    }

    public static agos a(agny agny, int i, agop agop, Account account, afjl afjl, boolean z) {
        return new agos(agny, i, new agor(agop, account), afjl, z);
    }

    public final void a() {
        String str;
        String str2;
        afjl afjl = this.c;
        agny agny = this.a;
        int i = this.f;
        if (!this.e) {
            String d2 = agny.d();
            StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 12);
            sb.append(d2);
            sb.append(":");
            sb.append(i - 1);
            str = sb.toString();
        } else {
            String e2 = agny.e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 12);
            sb2.append(e2);
            sb2.append(":");
            sb2.append(i - 1);
            str = sb2.toString();
        }
        aoje a2 = afjl.a(str);
        if (a2 != null) {
            agoo agoo = (agoo) this.b.a();
            int i2 = this.f;
            aucd o = atwz.h.o();
            int i3 = (int) a2.d;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz = (atwz) o.b;
            atwz.a |= 64;
            atwz.d = i3;
            aucd o2 = atws.d.o();
            if (!this.e) {
                str2 = this.a.d();
            } else {
                str2 = this.a.e();
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atws atws = (atws) o2.b;
            str2.getClass();
            int i4 = atws.a | 1;
            atws.a = i4;
            atws.b = str2;
            int i5 = this.d;
            atws.a = i4 | 2;
            atws.c = i5;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz2 = (atwz) o.b;
            atws atws2 = (atws) o2.i();
            atws2.getClass();
            atwz2.e = atws2;
            atwz2.a |= 128;
            aucd o3 = atvk.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvk atvk = (atvk) o3.b;
            a2.getClass();
            atvk.b = a2;
            atvk.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz3 = (atwz) o.b;
            atvk atvk2 = (atvk) o3.i();
            atvk2.getClass();
            atwz3.c = atvk2;
            atwz3.b = 10;
            agoo.a(i2, (atwz) o.i());
        }
    }
}
