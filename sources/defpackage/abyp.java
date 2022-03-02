package defpackage;

import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abyp implements igp {
    private final D2DDevice a;
    private final String b;
    private final abpw c;
    private final abqf d;

    public abyp(abqf abqf, D2DDevice d2DDevice, String str, abpw abpw) {
        this.d = abqf;
        this.a = d2DDevice;
        this.b = str;
        this.c = abpw;
    }

    public final void a(Object obj, Object obj2) {
        abqf abqf = this.d;
        D2DDevice d2DDevice = this.a;
        String str = this.b;
        abpw abpw = this.c;
        abzc abzc = new abzc((acwd) obj2);
        ((abxh) ((abyj) obj).x()).a((abxe) new abyc(abzc), d2DDevice, str, abqf.a(abpw));
    }
}
