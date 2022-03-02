package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: ajnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnk implements acvf {
    final /* synthetic */ Context a;
    final /* synthetic */ aqnk b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ Account d;

    public ajnk(Context context, aqnk aqnk, byte[] bArr, Account account) {
        this.a = context;
        this.b = aqnk;
        this.c = bArr;
        this.d = account;
    }

    public final /* bridge */ /* synthetic */ Object a(acwa acwa) {
        Context context = this.a;
        aqnk aqnk = this.b;
        String str = (String) acwa.d();
        String hexString = Long.toHexString(jhg.a(context));
        aucd o = aqnp.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqnp aqnp = (aqnp) o.b;
        hexString.getClass();
        aqnp.a |= 1;
        aqnp.b = hexString;
        aqnp aqnp2 = (aqnp) o.i();
        aucd o2 = aqnr.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqnr aqnr = (aqnr) o2.b;
        aqnp2.getClass();
        aqnr.c = aqnp2;
        aqnr.a |= 2;
        if (str != null) {
            aucd o3 = aqnq.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aqnq aqnq = (aqnq) o3.b;
            str.getClass();
            aqnq.a |= 1;
            aqnq.b = str;
            aqnq aqnq2 = (aqnq) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqnr aqnr2 = (aqnr) o2.b;
            aqnq2.getClass();
            aqnr2.b = aqnq2;
            aqnr2.a |= 1;
        }
        aucd o4 = aqnt.d.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqnt aqnt = (aqnt) o4.b;
        aqnt.b = 1;
        aqnt.a |= 1;
        aqnr aqnr3 = (aqnr) o2.i();
        aqnr3.getClass();
        aqnt.c = aqnr3;
        aqnt.a |= 2;
        aqnk.a(o4);
        aucd o5 = aqnt.d.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqnt aqnt2 = (aqnt) o5.b;
        aqnt2.b = 2;
        aqnt2.a |= 1;
        aqnr aqnr4 = (aqnr) o2.i();
        aqnr4.getClass();
        aqnt2.c = aqnr4;
        aqnt2.a |= 2;
        aqnk.a(o5);
        egr egr = new egr();
        egr.a = 20;
        egr.b();
        egr.a(((aqnl) this.b.i()).k());
        byte[] bArr = this.c;
        if (bArr != null) {
            egr.c = bArr;
        }
        egr.b = this.d.name;
        return egj.a(this.a).a(egr.a());
    }
}
