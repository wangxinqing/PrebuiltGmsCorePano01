package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: yhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhv extends ygu {
    private final ygj a;
    private final String b;
    private final yhw c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhv(ygj ygj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3, String str4) {
        super("RegisterSyncOperationCall", avtj.REGISTER_SYNC);
        iva.a((Object) ygj);
        this.a = ygj;
        String str5 = str;
        this.b = str5;
        this.c = new yhw(str5, i, strArr, bArr, str2, str3, str4);
    }

    public final avst a() {
        yhw yhw = this.c;
        avss avss = (avss) avst.m.o();
        String str = yhw.c.d;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst = (avst) avss.b;
        str.getClass();
        int i = avst.a | 1;
        avst.a = i;
        avst.b = str;
        apgu apgu = yhw.c;
        int i2 = apgu.e;
        avst.a = i | 2;
        avst.c = i2;
        avss.a(apgu.f);
        yhx yhx = yhw.d;
        if (yhx != null) {
            int i3 = yhx.c - 1;
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst2 = (avst) avss.b;
            avst2.a |= 64;
            avst2.j = i3;
        }
        String str2 = yhw.a;
        if (str2 != null) {
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst3 = (avst) avss.b;
            str2.getClass();
            avst3.a |= 4;
            avst3.f = str2;
        }
        return (avst) avss.i();
    }

    public final void b(Context context) {
        String str;
        yhw yhw = this.c;
        yhw.a(context);
        yhw.d = yhy.a(context, yhw.c, yhw.a);
        yhw.a(context, true);
        apgu apgu = yhw.c;
        String str2 = apgu.d;
        String str3 = yhw.a;
        String str4 = yhw.b;
        if (apgu.b == 7) {
            str = (String) apgu.c;
        } else {
            str = "";
        }
        new yhe(str2, str3, str4, str2, str);
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final avtd c() {
        avta avta = this.c.e;
        if (avta != null) {
            return (avtd) avta.i();
        }
        return null;
    }

    public final void b(Context context, yfw yfw) {
        String str;
        yhw yhw = this.c;
        yhw.a(context);
        yhw.d = yhy.a(context, yfw, yhw.c, yhw.a);
        yhw.a(context, false);
        apgu apgu = yhw.c;
        String str2 = apgu.d;
        String str3 = yhw.a;
        String str4 = yhw.b;
        if (apgu.b == 7) {
            str = (String) apgu.c;
        } else {
            str = "";
        }
        Configurations a2 = new yhe(str2, str3, str4, str2, str).a(context, yfw);
        if (yhs.a(this.b, this.c.d.c)) {
            yij.a(context, this.c.d.c, this.b);
        }
        this.a.a(Status.a, a2);
    }

    public final void a(Status status) {
        this.a.a(status, (Configurations) null);
    }
}
