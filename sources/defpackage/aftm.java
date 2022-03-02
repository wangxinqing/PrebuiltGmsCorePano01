package defpackage;

/* renamed from: aftm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aftm {
    private final aftj a;
    private final afjl b;
    private final amsv c;
    private final int d;
    private final boolean e;
    private final int f;

    public aftm(aftj aftj, afjl afjl, int i, amsv amsv, boolean z) {
        this.a = aftj;
        this.b = afjl;
        this.f = i;
        this.c = amsv;
        this.d = !z ? 1 : 2;
        this.e = z;
    }

    public final void a() {
        String str;
        afjl afjl = this.b;
        aftj aftj = this.a;
        int i = this.f;
        if (this.e) {
            aftk aftk = (aftk) aftj;
            String str2 = aftk.a;
            String str3 = aftk.b;
            String str4 = aftk.c;
            StringBuilder sb = new StringBuilder(str2.length() + 2 + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append(str2);
            sb.append("#");
            sb.append(str3);
            sb.append("#");
            sb.append(str4);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12);
            sb3.append(sb2);
            sb3.append(":");
            sb3.append(i - 1);
            str = sb3.toString();
        } else {
            aftk aftk2 = (aftk) aftj;
            String str5 = aftk2.a;
            String str6 = aftk2.c;
            StringBuilder sb4 = new StringBuilder(str5.length() + 40 + String.valueOf(str6).length());
            sb4.append("ApplicationId{packageName=");
            sb4.append(str5);
            sb4.append(", instanceId=");
            sb4.append(str6);
            sb4.append("}");
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 12);
            sb6.append(sb5);
            sb6.append(":");
            sb6.append(i - 1);
            str = sb6.toString();
        }
        aoje a2 = afjl.a(str);
        if (a2 != null) {
            aftn aftn = (aftn) this.c.a();
            int i2 = this.f;
            aucd o = aftc.f.o();
            int i3 = (int) a2.d;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc = (aftc) o.b;
            aftc.a |= 16;
            aftc.d = i3;
            aucd o2 = aftb.f.o();
            aftk aftk3 = (aftk) this.a;
            String str7 = aftk3.b;
            String str8 = aftk3.c;
            if (str8 != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aftb aftb = (aftb) o2.b;
                str8.getClass();
                aftb.a |= 16;
                aftb.e = str8;
            }
            if (this.e && str7 != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aftb aftb2 = (aftb) o2.b;
                str7.getClass();
                aftb2.a |= 8;
                aftb2.d = str7;
            }
            int i4 = this.d;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aftb aftb3 = (aftb) o2.b;
            int i5 = aftb3.a | 2;
            aftb3.a = i5;
            aftb3.b = i4;
            String str9 = ((aftk) this.a).a;
            str9.getClass();
            aftb3.a = i5 | 4;
            aftb3.c = str9;
            aftb aftb4 = (aftb) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc2 = (aftc) o.b;
            aftb4.getClass();
            aftc2.e = aftb4;
            aftc2.a |= 32;
            aucd o3 = aftd.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aftd aftd = (aftd) o3.b;
            a2.getClass();
            aftd.b = a2;
            aftd.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc3 = (aftc) o.b;
            aftd aftd2 = (aftd) o3.i();
            aftd2.getClass();
            aftc3.c = aftd2;
            aftc3.b = 4;
            aftn.a(i2, (aftc) o.i());
        }
    }

    public aftm(aftj aftj, afjl afjl, amsv amsv) {
        this.a = aftj;
        this.b = afjl;
        this.f = 3002;
        this.c = amsv;
        this.d = 1;
        this.e = false;
    }
}
