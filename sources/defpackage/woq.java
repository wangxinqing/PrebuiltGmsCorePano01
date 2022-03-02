package defpackage;

import android.content.Context;

/* renamed from: woq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class woq extends xqg {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final boolean e;
    private final boolean f;
    private final boolean g = ayuq.b();

    public final void b(Context context) {
        boolean z;
        wmi wmi;
        int i;
        wmi wmi2;
        wtz a2 = wtz.a(context);
        String str = this.a;
        if (wtw.a(a2.b).a(str, (String) null) < 0) {
            a2.g();
            if (wtw.a(a2.b).a(str, (String) null) < 0) {
                if (this.g && (wmi2 = this.r) != null) {
                    wmi2.b(3, 0);
                    return;
                }
                return;
            }
        }
        xej a3 = xej.a(context);
        if (this.e) {
            if (this.g) {
                z = a3.a(this.a, this.b, this.c, this.i, this.f, "by client (ua)");
            } else {
                a3.a(this.a, this.b, this.c, this.i, this.f, "by client (ua)");
                z = false;
            }
        } else if (this.g) {
            z = a3.a(this.a, this.b, this.d, this.c, this.i, this.f, "by client (non-ua)");
        } else {
            a3.a(this.a, this.b, this.d, this.c, this.i, this.f, "by client (non-ua)");
            z = false;
        }
        if (this.g && (wmi = this.r) != null) {
            if (!z) {
                i = 8;
            } else {
                i = 2;
            }
            wmi.b(i, 0);
        }
    }

    public woq(String str, int i, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        super(str, i, str3, "RequestSync", (byte[]) null);
        this.a = str3;
        this.b = str4;
        this.c = str2;
        this.d = j;
        this.e = z;
        this.f = z2;
    }
}
