package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: wmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmi {
    public final wml a;
    public String b;
    public String c;
    public List d = new ArrayList();
    public int e;
    public String f;
    public SparseIntArray g = new SparseIntArray();
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public final String q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w = 1;
    private final ArrayList x = new ArrayList();
    private final int y;

    public wmi(String str) {
        wml a2 = wml.a();
        this.y = a(str);
        this.a = a2;
        this.q = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r9) {
        /*
            int r0 = r9.hashCode()
            r1 = 6
            r2 = 1
            r3 = 4
            r4 = 8
            r5 = 3
            r6 = 2
            r7 = 7
            r8 = 5
            switch(r0) {
                case -1562673867: goto L_0x0062;
                case -786677719: goto L_0x0058;
                case -256273972: goto L_0x004e;
                case 68692846: goto L_0x0044;
                case 862665990: goto L_0x003a;
                case 1124082446: goto L_0x002f;
                case 1138528744: goto L_0x0025;
                case 1665805510: goto L_0x001b;
                case 2079406139: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x006c
        L_0x0011:
            java.lang.String r0 = "SetAvatar"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 6
            goto L_0x006d
        L_0x001b:
            java.lang.String r0 = "LoadOwners"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 1
            goto L_0x006d
        L_0x0025:
            java.lang.String r0 = "LoadOwnerCoverPhoto"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 4
            goto L_0x006d
        L_0x002f:
            java.lang.String r0 = "isSyncToContactsEnabled"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 8
            goto L_0x006d
        L_0x003a:
            java.lang.String r0 = "LoadOwnerAvatar"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 3
            goto L_0x006d
        L_0x0044:
            java.lang.String r0 = "GetMe"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 2
            goto L_0x006d
        L_0x004e:
            java.lang.String r0 = "LoadAutocompleteList"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 0
            goto L_0x006d
        L_0x0058:
            java.lang.String r0 = "IdentityGetByIds"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 7
            goto L_0x006d
        L_0x0062:
            java.lang.String r0 = "LoadAvatarByReference"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x006c
            r9 = 5
            goto L_0x006d
        L_0x006c:
            r9 = -1
        L_0x006d:
            switch(r9) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007c;
                case 2: goto L_0x007b;
                case 3: goto L_0x007a;
                case 4: goto L_0x0079;
                case 5: goto L_0x0078;
                case 6: goto L_0x0077;
                case 7: goto L_0x0074;
                case 8: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            return r2
        L_0x0071:
            r9 = 10
            return r9
        L_0x0074:
            r9 = 9
            return r9
        L_0x0077:
            return r4
        L_0x0078:
            return r7
        L_0x0079:
            return r1
        L_0x007a:
            return r8
        L_0x007b:
            return r3
        L_0x007c:
            return r5
        L_0x007d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmi.a(java.lang.String):int");
    }

    public final void b(int i2, int i3) {
        this.r = i2;
        this.e = i3;
    }

    public final void a(int i2, int i3) {
        int i4;
        double d2;
        double d3;
        String str;
        List list;
        Double d4;
        int i5;
        int i6;
        int i7 = this.y;
        if (i7 == 2) {
            xip.a();
            if (Boolean.valueOf(aywy.a.a().am()).booleanValue()) {
                if (this.h == 1) {
                    d4 = Double.valueOf(aywy.a.a().aA());
                } else {
                    d4 = Double.valueOf(aywy.a.a().az());
                }
                double doubleValue = d4.doubleValue();
                wml wml = this.a;
                String str2 = this.b;
                String str3 = this.c;
                SparseIntArray sparseIntArray = this.g;
                String str4 = this.f;
                if (str4 != null) {
                    i5 = str4.length();
                } else {
                    i5 = 0;
                }
                int i8 = this.h;
                int i9 = this.i;
                boolean z = this.j;
                int i10 = this.u;
                List list2 = this.d;
                aucd o2 = xlx.f.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xlx xlx = (xlx) o2.b;
                int i11 = xlx.a | 1;
                xlx.a = i11;
                xlx.b = i5;
                if (i8 != 0) {
                    i6 = i8 != 1 ? i8 != 2 ? 1 : 4 : 3;
                } else {
                    i6 = 2;
                }
                xlx.c = i6 - 1;
                xlx.a = i11 | 2;
                xip.a();
                if (sparseIntArray != null && sparseIntArray.size() > 0) {
                    xlu[] xluArr = new xlu[sparseIntArray.size()];
                    int i12 = 0;
                    while (i12 < sparseIntArray.size()) {
                        int a2 = xlt.a(sparseIntArray.keyAt(i12));
                        int i13 = a2 - 1;
                        if (a2 != 0) {
                            int i14 = sparseIntArray.get(i13);
                            aucd o3 = xlu.d.o();
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            xlu xlu = (xlu) o3.b;
                            xlu.b = i13;
                            int i15 = xlu.a | 1;
                            xlu.a = i15;
                            xlu.a = i15 | 2;
                            xlu.c = i14;
                            xluArr[i12] = (xlu) o3.i();
                            i12++;
                        } else {
                            throw null;
                        }
                    }
                    List asList = Arrays.asList(xluArr);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    xlx xlx2 = (xlx) o2.b;
                    if (!xlx2.d.a()) {
                        xlx2.d = aucj.a(xlx2.d);
                    }
                    auab.a((Iterable) asList, (List) xlx2.d);
                }
                if (Boolean.valueOf(aywy.a.a().an()).booleanValue()) {
                    aucd o4 = xlv.d.o();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    xlv xlv = (xlv) o4.b;
                    int i16 = xlv.a | 1;
                    xlv.a = i16;
                    xlv.b = i9;
                    xlv.a = i16 | 2;
                    xlv.c = z;
                    xlv xlv2 = (xlv) o4.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    xlx xlx3 = (xlx) o2.b;
                    xlv2.getClass();
                    xlx3.e = xlv2;
                    xlx3.a |= 4;
                }
                wml.a(2, (String) null, str2, str3, i2, i3, i10, list2, (xlx) o2.i(), (xlp) null, (xma) null, doubleValue);
            }
        } else if (i7 == 3) {
            xip.a();
            if (Boolean.valueOf(aywy.a.a().ao()).booleanValue()) {
                wml wml2 = this.a;
                String str5 = this.b;
                String str6 = this.c;
                List list3 = this.d;
                int i17 = this.s;
                int i18 = this.t;
                int i19 = this.k;
                int i20 = this.l;
                int i21 = this.m;
                int i22 = this.n;
                int i23 = this.o;
                int i24 = this.p;
                int i25 = this.v;
                int i26 = this.w;
                double doubleValue2 = ((Double) xhg.a.a()).doubleValue();
                aucd o5 = xlp.i.o();
                xip.a();
                if (((Boolean) xgx.a.a()).booleanValue()) {
                    d3 = doubleValue2;
                    aucd o6 = xlm.f.o();
                    xip.a();
                    if (!((Boolean) xgv.a.a()).booleanValue()) {
                        str = str6;
                        list = list3;
                    } else {
                        list = list3;
                        if (o6.c) {
                            o6.c();
                            o6.c = false;
                        }
                        xlm xlm = (xlm) o6.b;
                        str = str6;
                        int i27 = xlm.a | 4;
                        xlm.a = i27;
                        xlm.d = i21;
                        xlm.a = i27 | 8;
                        xlm.e = i22;
                    }
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    xlm xlm2 = (xlm) o6.b;
                    int i28 = i17 - 1;
                    if (i17 != 0) {
                        xlm2.b = i28;
                        int i29 = xlm2.a | 1;
                        xlm2.a = i29;
                        int i30 = i18 - 1;
                        if (i18 != 0) {
                            xlm2.c = i30;
                            xlm2.a = i29 | 2;
                            xlm xlm3 = (xlm) o6.i();
                            if (o5.c) {
                                o5.c();
                                o5.c = false;
                            }
                            xlp xlp = (xlp) o5.b;
                            xlm3.getClass();
                            xlp.b = xlm3;
                            xlp.a |= 1;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    str = str6;
                    d3 = doubleValue2;
                    list = list3;
                }
                if (((Boolean) xgw.a.a()).booleanValue()) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    xlp xlp2 = (xlp) o5.b;
                    int i31 = i26 - 1;
                    if (i26 != 0) {
                        xlp2.h = i31;
                        xlp2.a |= 64;
                    } else {
                        throw null;
                    }
                }
                if (((Boolean) xgy.a.a()).booleanValue()) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    xlp xlp3 = (xlp) o5.b;
                    int i32 = xlp3.a | 2;
                    xlp3.a = i32;
                    xlp3.c = i19;
                    xlp3.a = i32 | 4;
                    xlp3.d = i20;
                }
                if (((Boolean) xgz.a.a()).booleanValue()) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    xlp xlp4 = (xlp) o5.b;
                    int i33 = xlp4.a | 8;
                    xlp4.a = i33;
                    xlp4.e = i23;
                    xlp4.a = i33 | 16;
                    xlp4.f = i24;
                }
                if (((Boolean) xhd.a.a()).booleanValue()) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    xlp xlp5 = (xlp) o5.b;
                    int i34 = i25 - 1;
                    if (i25 != 0) {
                        xlp5.g = i34;
                        xlp5.a |= 32;
                    } else {
                        throw null;
                    }
                }
                wml2.a(3, (String) null, str5, str, i2, i3, 1, list, (xlx) null, (xlp) o5.i(), (xma) null, d3);
            }
        } else if (i7 != 9) {
            wml wml3 = this.a;
            String str7 = this.b;
            String str8 = this.c;
            int i35 = this.u;
            List list4 = this.d;
            xip.a();
            switch (i7 - 1) {
                case 2:
                    d2 = ((Double) xhg.a.a()).doubleValue();
                    break;
                case 3:
                    d2 = Double.valueOf(aywy.a.a().bb()).doubleValue();
                    break;
                case 4:
                    d2 = Double.valueOf(aywy.a.a().bj()).doubleValue();
                    break;
                case 5:
                    d2 = Double.valueOf(aywy.a.a().bk()).doubleValue();
                    break;
                case 6:
                    d2 = Double.valueOf(aywy.a.a().bi()).doubleValue();
                    break;
                case 7:
                    d2 = Double.valueOf(aywy.a.a().bK()).doubleValue();
                    break;
                case 9:
                    d2 = ayut.a.a().a();
                    break;
                default:
                    d2 = Double.valueOf(aywy.a.a().ax()).doubleValue();
                    break;
            }
            wml3.a(i7, (String) null, str7, str8, i2, i3, i35, list4, (xlx) null, (xlp) null, (xma) null, d2);
        } else {
            if (ayvr.b()) {
                wml wml4 = this.a;
                String str9 = this.b;
                String str10 = this.c;
                List list5 = this.d;
                double b2 = ayvr.a.a().b();
                ArrayList arrayList = this.x;
                aucd o7 = xma.b.o();
                if (!o7.c) {
                    i4 = 0;
                } else {
                    o7.c();
                    i4 = 0;
                    o7.c = false;
                }
                xma xma = (xma) o7.b;
                if (!xma.a.a()) {
                    xma.a = aucj.a(xma.a);
                }
                int size = arrayList.size();
                while (i4 < size) {
                    xma.a.d(((xlz) arrayList.get(i4)).e);
                    i4++;
                }
                wml4.a(9, (String) null, str9, str10, i2, i3, 1, list5, (xlx) null, (xlp) null, (xma) o7.i(), b2);
            }
        }
    }

    public final void a(xlz xlz) {
        this.x.add(xlz);
    }

    public final void a(xmc xmc) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(xmc);
    }
}
