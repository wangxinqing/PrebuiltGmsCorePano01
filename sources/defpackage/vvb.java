package defpackage;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import java.util.List;
import java.util.Locale;

/* renamed from: vvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvb {
    public static int a() {
        int v = (int) ayni.a.a().v();
        if (v != 1) {
            return v != 2 ? 1 : 3;
        }
        return 2;
    }

    public static aslz b(int i) {
        aucd o = aslz.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslz aslz = (aslz) o.b;
        aslz.d = i - 1;
        int i2 = aslz.a | 4;
        aslz.a = i2;
        aslz.b = 1;
        int i3 = i2 | 1;
        aslz.a = i3;
        aslz.c = 1;
        aslz.a = i3 | 2;
        return (aslz) o.i();
    }

    public static int c(int i) {
        if (i == 1) {
            return 4;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                return 1;
            }
        }
        return i2;
    }

    public static aucd d(int i) {
        aucd o = asmc.B.o();
        int a = a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmc asmc = (asmc) o.b;
        asmc.v = a - 1;
        int i2 = asmc.a | 67108864;
        asmc.a = i2;
        asmc.b = i - 1;
        asmc.a = i2 | 1;
        String Q = ayni.Q();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmc asmc2 = (asmc) o.b;
        Q.getClass();
        asmc2.a |= Integer.MIN_VALUE;
        asmc2.A = Q;
        return o;
    }

    private static int e(int i) {
        if (i == 0) {
            return 5;
        }
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 2;
    }

    public static asld a(List list) {
        aucd o = asld.c.o();
        if (list.isEmpty()) {
            return (asld) o.i();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attachment attachment = (Attachment) list.get(i);
            long a = attachment.a();
            int i2 = 3;
            if (attachment.d()) {
                int b = attachment.b();
                if (b == 1) {
                    i2 = 2;
                } else if (b != 2) {
                    i2 = b != 3 ? 1 : 4;
                }
                aucd o2 = asmb.d.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asmb asmb = (asmb) o2.b;
                asmb.b = i2 - 1;
                int i3 = asmb.a | 1;
                asmb.a = i3;
                asmb.a = i3 | 2;
                asmb.c = a;
                asmb asmb2 = (asmb) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asld asld = (asld) o.b;
                asmb2.getClass();
                if (!asld.a.a()) {
                    asld.a = aucj.a(asld.a);
                }
                asld.a.add(asmb2);
            } else if (attachment.c()) {
                int b2 = attachment.b();
                if (b2 == 1) {
                    i2 = 2;
                } else if (b2 != 2) {
                    i2 = b2 != 3 ? b2 != 4 ? 1 : 5 : 4;
                }
                FileAttachment fileAttachment = (FileAttachment) attachment;
                if (i2 == 1 || i2 == 4) {
                    String str = fileAttachment.a;
                    String[] strArr = whw.a;
                    int length = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (str.toLowerCase(Locale.getDefault()).endsWith(strArr[i4])) {
                            i2 = 6;
                            break;
                        }
                        i4++;
                    }
                }
                aucd o3 = aslj.e.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aslj aslj = (aslj) o3.b;
                aslj.b = i2 - 1;
                int i5 = aslj.a | 1;
                aslj.a = i5;
                int i6 = i5 | 2;
                aslj.a = i6;
                aslj.c = a;
                String str2 = fileAttachment.f;
                str2.getClass();
                aslj.a = 4 | i6;
                aslj.d = str2;
                aslj aslj2 = (aslj) o3.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asld asld2 = (asld) o.b;
                aslj2.getClass();
                if (!asld2.b.a()) {
                    asld2.b = aucj.a(asld2.b);
                }
                asld2.b.add(aslj2);
            } else {
                ((anih) vvj.a.c()).a("Unable to create event for attachment info. Unknown attachment %s", (Object) attachment);
            }
        }
        return (asld) o.i();
    }

    public static vut a(int i) {
        aucd d = d(15);
        aucd o = aslp.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslp aslp = (aslp) o.b;
        aslp.b = i - 1;
        aslp.a |= 1;
        aslp aslp2 = (aslp) o.i();
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asmc asmc2 = asmc.B;
        aslp2.getClass();
        asmc.p = aslp2;
        asmc.a |= 32768;
        return new vut((asmc) d.i());
    }

    public static vuv a(int i, int i2) {
        aucd d = d(4);
        aucd o = asly.d.o();
        int e = e(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asly asly = (asly) o.b;
        asly.c = e - 1;
        asly.a |= 2;
        int e2 = e(i2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        asly asly2 = (asly) o.b;
        asly2.b = e2 - 1;
        asly2.a |= 1;
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        asly asly3 = (asly) o.i();
        asmc asmc2 = asmc.B;
        asly3.getClass();
        asmc.e = asly3;
        asmc.a |= 16;
        return new vuv((asmc) d.i());
    }

    public static vuv a(int i, int i2, long j) {
        aucd d = d(26);
        aucd o = aslh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aslh aslh = (aslh) o.b;
        aslh.c = i - 1;
        int i3 = aslh.a | 2;
        aslh.a = i3;
        aslh.b = i2 - 1;
        aslh.a = i3 | 1;
        if (ayni.a.a().d()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aslh aslh2 = (aslh) o.b;
            aslh2.a |= 4;
            aslh2.d = j;
        }
        if (d.c) {
            d.c();
            d.c = false;
        }
        asmc asmc = (asmc) d.b;
        aslh aslh3 = (aslh) o.i();
        asmc asmc2 = asmc.B;
        aslh3.getClass();
        asmc.w = aslh3;
        asmc.a |= 134217728;
        return new vuv((asmc) d.i());
    }
}
