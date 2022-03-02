package defpackage;

import java.util.Arrays;

/* renamed from: tpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tpy {
    final tlh a;
    final String b;
    final byte[] c;
    public final /* synthetic */ tql d;

    public tpy(tql tql, tlh tlh, String str) {
        this.d = tql;
        this.a = tlh;
        this.b = str;
        this.c = tql.a(str);
    }

    public final boolean a(tsa tsa) {
        if (tsa == null) {
            jjg jjg = tky.a;
            return false;
        } else if (tsa.b != this.d.h()) {
            jjg jjg2 = tky.a;
            return false;
        } else if (Arrays.equals(tsa.d, this.c)) {
            return true;
        } else {
            jjg jjg3 = tky.a;
            tky.a(this.c);
            tky.a(tsa.d);
            return false;
        }
    }
}
