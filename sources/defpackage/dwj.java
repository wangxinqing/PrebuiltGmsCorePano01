package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: dwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwj {
    private static dwj c;
    public final dwi a;
    public final Context b;

    private dwj(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = new dwi(this.b, new dwg(new iyn(applicationContext, awhr.g(), awhr.f(), awhr.d(), awhr.h(), awhr.c(), awhr.e(), "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", (byte[]) null)));
    }

    public static synchronized dwj a(Context context) {
        dwj dwj;
        synchronized (dwj.class) {
            if (c == null) {
                c = new dwj(context);
            }
            dwj = c;
        }
        return dwj;
    }

    public final avfk a(ClientContext clientContext, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, List list, String str8, String str9, String str10, String str11, byte[] bArr, int i, int i2, String str12, String str13, int i3, String str14) {
        int i4;
        int i5;
        int i6;
        ClientContext clientContext2 = clientContext;
        String str15 = str6;
        int i7 = i3;
        dwi dwi = this.a;
        avfe a2 = dwi.a(clientContext2.e);
        if (a2 == null) {
            Log.e("AppInviteAgent", "Error creating ClientIdInfo");
            return null;
        }
        aucd o = avfj.n.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj = (avfj) o.b;
        a2.getClass();
        avfj.e = a2;
        avfj.a |= 4;
        aucd o2 = avgg.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avgg avgg = (avgg) o2.b;
        avgg.b = 1;
        avgg.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj2 = (avfj) o.b;
        avgg avgg2 = (avgg) o2.i();
        avgg2.getClass();
        avfj2.b = avgg2;
        avfj2.a |= 1;
        avgt a3 = dwi.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj3 = (avfj) o.b;
        a3.getClass();
        avfj3.m = a3;
        avfj3.a |= 512;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str9)) {
            aucd o3 = avfe.g.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            avfe avfe = (avfe) o3.b;
            str9.getClass();
            int i8 = avfe.a | 2;
            avfe.a = i8;
            avfe.c = str9;
            avfe.b = 2;
            avfe.a = i8 | 1;
            arrayList.add((avfe) o3.i());
        }
        if (!TextUtils.isEmpty(str10)) {
            aucd o4 = avfe.g.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            avfe avfe2 = (avfe) o4.b;
            str10.getClass();
            int i9 = avfe2.a | 2;
            avfe2.a = i9;
            avfe2.c = str10;
            avfe2.b = 1;
            avfe2.a = i9 | 1;
            arrayList.add((avfe) o4.i());
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj4 = (avfj) o.b;
        if (!avfj4.f.a()) {
            avfj4.f = aucj.a(avfj4.f);
        }
        auab.a((Iterable) arrayList, (List) avfj4.f);
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            SourcedContactPerson sourcedContactPerson = (SourcedContactPerson) list.get(i10);
            ContactPerson contactPerson = sourcedContactPerson.a;
            int a4 = avgq.a(sourcedContactPerson.b);
            aucd o5 = avgm.e.o();
            aucd o6 = avgo.f.o();
            int i11 = contactPerson.a().a;
            if (i11 == 0) {
                i4 = size;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                avgo avgo = (avgo) o6.b;
                avgo.b = 1;
                int i12 = avgo.a | 1;
                avgo.a = i12;
                String str16 = contactPerson.b;
                str16.getClass();
                avgo.a = i12 | 2;
                avgo.c = str16;
            } else if (i11 == 1) {
                i4 = size;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                avgo avgo2 = (avgo) o6.b;
                avgo2.b = 2;
                avgo2.a |= 1;
                String str17 = contactPerson.a().b;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                avgo avgo3 = (avgo) o6.b;
                str17.getClass();
                avgo3.a |= 4;
                avgo3.d = str17;
            } else if (i11 != 2) {
                if (!o6.c) {
                    i6 = 0;
                } else {
                    o6.c();
                    i6 = 0;
                    o6.c = false;
                }
                avgo avgo4 = (avgo) o6.b;
                avgo4.b = i6;
                avgo4.a |= 1;
                i4 = size;
            } else {
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                avgo avgo5 = (avgo) o6.b;
                avgo5.b = 3;
                avgo5.a |= 1;
                String str18 = contactPerson.a().b;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                avgo avgo6 = (avgo) o6.b;
                str18.getClass();
                i4 = size;
                avgo6.a |= 8;
                avgo6.e = str18;
            }
            avgo avgo7 = (avgo) o6.i();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            avgm avgm = (avgm) o5.b;
            avgo7.getClass();
            avgm.b = avgo7;
            avgm.a |= 1;
            aucd o7 = avfn.f.o();
            int i13 = contactPerson.a().a;
            if (i13 == 0) {
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                avfn avfn = (avfn) o7.b;
                avfn.b = 1;
                int i14 = avfn.a | 1;
                avfn.a = i14;
                String str19 = contactPerson.b;
                str19.getClass();
                avfn.a = i14 | 2;
                avfn.c = str19;
            } else if (i13 == 1) {
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                avfn avfn2 = (avfn) o7.b;
                avfn2.b = 2;
                avfn2.a |= 1;
                String str20 = contactPerson.a().b;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                avfn avfn3 = (avfn) o7.b;
                str20.getClass();
                avfn3.a |= 4;
                avfn3.d = str20;
            } else if (i13 != 2) {
                if (!o7.c) {
                    i5 = 0;
                } else {
                    o7.c();
                    i5 = 0;
                    o7.c = false;
                }
                avfn avfn4 = (avfn) o7.b;
                avfn4.b = i5;
                avfn4.a |= 1;
            } else {
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                avfn avfn5 = (avfn) o7.b;
                avfn5.b = 3;
                avfn5.a |= 1;
                String str21 = contactPerson.a().b;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                avfn avfn6 = (avfn) o7.b;
                str21.getClass();
                avfn6.a |= 8;
                avfn6.e = str21;
            }
            avfn avfn7 = (avfn) o7.i();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            avgm avgm2 = (avgm) o5.b;
            avfn7.getClass();
            avgm2.c = avfn7;
            avgm2.a |= 2;
            aucd o8 = avgr.c.o();
            if (a4 == 0) {
                a4 = 1;
            }
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            avgr avgr = (avgr) o8.b;
            avgr.b = a4 - 1;
            avgr.a |= 1;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            avgm avgm3 = (avgm) o5.b;
            avgr avgr2 = (avgr) o8.i();
            avgr2.getClass();
            avgm3.d = avgr2;
            avgm3.a |= 8;
            arrayList2.add((avgm) o5.i());
            i10++;
            size = i4;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj5 = (avfj) o.b;
        if (!avfj5.c.a()) {
            avfj5.c = aucj.a(avfj5.c);
        }
        auab.a((Iterable) arrayList2, (List) avfj5.c);
        if (i7 != 0) {
            aucd o9 = avgb.c.o();
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            avgb avgb = (avgb) o9.b;
            avgb.a |= 1;
            avgb.b = i7;
            avgb avgb2 = (avgb) o9.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj6 = (avfj) o.b;
            avgb2.getClass();
            avfj6.l = avgb2;
            avfj6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        aucd o10 = avgd.e.o();
        if (!TextUtils.isEmpty(str2)) {
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            avgd avgd = (avgd) o10.b;
            str2.getClass();
            avgd.a |= 8;
            avgd.d = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            avgd avgd2 = (avgd) o10.b;
            str3.getClass();
            avgd2.a |= 1;
            avgd2.b = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            avgd avgd3 = (avgd) o10.b;
            str4.getClass();
            avgd3.a |= 2;
            avgd3.c = str4;
        }
        aucd o11 = avgh.d.o();
        if (o11.c) {
            o11.c();
            o11.c = false;
        }
        avgh avgh = (avgh) o11.b;
        str.getClass();
        avgh.a |= 1;
        avgh.b = str;
        avgd avgd4 = (avgd) o10.i();
        avgd4.getClass();
        avgh.c = avgd4;
        avgh.a |= 2;
        avgh avgh2 = (avgh) o11.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfj avfj7 = (avfj) o.b;
        avgh2.getClass();
        avfj7.d = avgh2;
        avfj7.a |= 2;
        if (!TextUtils.isEmpty(str7)) {
            aucd o12 = avgl.d.o();
            if (o12.c) {
                o12.c();
                o12.c = false;
            }
            avgl avgl = (avgl) o12.b;
            str7.getClass();
            int i15 = avgl.a | 1;
            avgl.a = i15;
            avgl.b = str7;
            if (str15 != null) {
                str6.getClass();
                avgl.a = i15 | 2;
                avgl.c = str15;
            }
            avgl avgl2 = (avgl) o12.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj8 = (avfj) o.b;
            avgl2.getClass();
            avfj8.g = avgl2;
            avfj8.a |= 8;
        }
        if (!TextUtils.isEmpty(str5) || map != null) {
            aucd o13 = avgi.d.o();
            if (!TextUtils.isEmpty(str5)) {
                if (o13.c) {
                    o13.c();
                    o13.c = false;
                }
                avgi avgi = (avgi) o13.b;
                str5.getClass();
                avgi.a |= 1;
                avgi.b = str5;
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    aucd o14 = avgs.d.o();
                    String str22 = (String) entry.getKey();
                    if (o14.c) {
                        o14.c();
                        o14.c = false;
                    }
                    avgs avgs = (avgs) o14.b;
                    str22.getClass();
                    avgs.a |= 1;
                    avgs.b = str22;
                    String str23 = (String) entry.getValue();
                    if (o14.c) {
                        o14.c();
                        o14.c = false;
                    }
                    avgs avgs2 = (avgs) o14.b;
                    str23.getClass();
                    avgs2.a |= 2;
                    avgs2.c = str23;
                    avgs avgs3 = (avgs) o14.i();
                    if (o13.c) {
                        o13.c();
                        o13.c = false;
                    }
                    avgi avgi2 = (avgi) o13.b;
                    avgs3.getClass();
                    if (!avgi2.c.a()) {
                        avgi2.c = aucj.a(avgi2.c);
                    }
                    avgi2.c.add(avgs3);
                }
            }
            avgi avgi3 = (avgi) o13.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj9 = (avfj) o.b;
            avgi3.getClass();
            avfj9.h = avgi3;
            avfj9.a |= 16;
        }
        if (!TextUtils.isEmpty(str8)) {
            aucd o15 = avfr.c.o();
            aucd o16 = avfv.c.o();
            if (o16.c) {
                o16.c();
                o16.c = false;
            }
            avfv avfv = (avfv) o16.b;
            str8.getClass();
            avfv.a |= 1;
            avfv.b = str8;
            avfv avfv2 = (avfv) o16.i();
            aucd o17 = avfz.c.o();
            if (o15.c) {
                o15.c();
                o15.c = false;
            }
            avfr avfr = (avfr) o15.b;
            avfv2.getClass();
            avfr.b = avfv2;
            avfr.a |= 1;
            if (o17.c) {
                o17.c();
                o17.c = false;
            }
            avfz avfz = (avfz) o17.b;
            avfr avfr2 = (avfr) o15.i();
            avfr2.getClass();
            avfz.b = avfr2;
            avfz.a |= 1;
            avfz avfz2 = (avfz) o17.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj10 = (avfj) o.b;
            avfz2.getClass();
            avfj10.j = avfz2;
            avfj10.a |= 64;
        }
        if (!TextUtils.isEmpty(str11)) {
            aucd o18 = avfx.g.o();
            if (o18.c) {
                o18.c();
                o18.c = false;
            }
            avfx avfx = (avfx) o18.b;
            str11.getClass();
            int i16 = avfx.a | 2;
            avfx.a = i16;
            avfx.c = str11;
            avfx.b = 1;
            avfx.a = i16 | 1;
            avfx avfx2 = (avfx) o18.i();
            aucd o19 = avgc.e.o();
            if (o19.c) {
                o19.c();
                o19.c = false;
            }
            avgc avgc = (avgc) o19.b;
            avfx2.getClass();
            avgc.c = avfx2;
            avgc.a |= 2;
            avgc avgc2 = (avgc) o19.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj11 = (avfj) o.b;
            avgc2.getClass();
            avfj11.k = avgc2;
            avfj11.a |= 128;
        } else if (bArr != null) {
            aucd o20 = avfx.g.o();
            auay a5 = auay.a(bArr);
            if (o20.c) {
                o20.c();
                o20.c = false;
            }
            avfx avfx3 = (avfx) o20.b;
            a5.getClass();
            int i17 = avfx3.a | 4;
            avfx3.a = i17;
            avfx3.d = a5;
            int i18 = i17 | 16;
            avfx3.a = i18;
            avfx3.e = i;
            int i19 = i18 | 32;
            avfx3.a = i19;
            avfx3.f = i2;
            avfx3.b = 2;
            avfx3.a = i19 | 1;
            avfx avfx4 = (avfx) o20.i();
            aucd o21 = avgc.e.o();
            if (o21.c) {
                o21.c();
                o21.c = false;
            }
            avgc avgc3 = (avgc) o21.b;
            avfx4.getClass();
            avgc3.c = avfx4;
            avgc3.a |= 2;
            avgc avgc4 = (avgc) o21.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj12 = (avfj) o.b;
            avgc4.getClass();
            avfj12.k = avgc4;
            avfj12.a |= 128;
        }
        if (!TextUtils.isEmpty(str12) || !TextUtils.isEmpty(str13)) {
            if ((((avfj) o.b).a & 128) == 0) {
                avgc avgc5 = avgc.e;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avfj avfj13 = (avfj) o.b;
                avgc5.getClass();
                avfj13.k = avgc5;
                avfj13.a |= 128;
            }
            if (!TextUtils.isEmpty(str12)) {
                avgc avgc6 = ((avfj) o.b).k;
                if (avgc6 == null) {
                    avgc6 = avgc.e;
                }
                aucd aucd = (aucd) avgc6.c(5);
                aucd.a((aucj) avgc6);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                avgc avgc7 = (avgc) aucd.b;
                str12.getClass();
                avgc7.a |= 1;
                avgc7.b = str12;
                avgc avgc8 = (avgc) aucd.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avfj avfj14 = (avfj) o.b;
                avgc8.getClass();
                avfj14.k = avgc8;
                avfj14.a |= 128;
            }
            if (!TextUtils.isEmpty(str13)) {
                avgc avgc9 = ((avfj) o.b).k;
                if (avgc9 == null) {
                    avgc9 = avgc.e;
                }
                aucd aucd2 = (aucd) avgc9.c(5);
                aucd2.a((aucj) avgc9);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                avgc avgc10 = (avgc) aucd2.b;
                str13.getClass();
                avgc10.a |= 4;
                avgc10.d = str13;
                avgc avgc11 = (avgc) aucd2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avfj avfj15 = (avfj) o.b;
                avgc11.getClass();
                avfj15.k = avgc11;
                avfj15.a |= 128;
            }
        }
        if (!TextUtils.isEmpty(str14)) {
            aucd o22 = avgw.c.o();
            if (o22.c) {
                o22.c();
                o22.c = false;
            }
            avgw avgw = (avgw) o22.b;
            str14.getClass();
            avgw.a |= 1;
            avgw.b = str14;
            avgw avgw2 = (avgw) o22.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avfj avfj16 = (avfj) o.b;
            avgw2.getClass();
            avfj16.i = avgw2;
            avfj16.a |= 32;
        }
        dwh dwh = new dwh(dwi.a, clientContext2, avfj.o, (avfj) o.i());
        dwh.a();
        avfk avfk = (avfk) dwh.a(avfk.d);
        if (!dwh.c()) {
            return avfk;
        }
        int e = dwh.e();
        String d = dwh.d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 57);
        sb.append("Create invitations failed due to error code: ");
        sb.append(e);
        sb.append("\n");
        sb.append(d);
        Log.e("AppInviteAgent", sb.toString());
        throw new dvy(dwh.d(), dwh.e());
    }

    public final ArrayList a(ClientContext clientContext) {
        audx audx;
        AvatarReference avatarReference;
        ContactPerson.ContactMethod contactMethod;
        String str;
        ClientContext clientContext2 = clientContext;
        dwi dwi = this.a;
        avfe a2 = dwi.a(clientContext2.e);
        if (a2 == null) {
            return null;
        }
        dwf dwf = new dwf(dwi.a, clientContext2);
        auci auci = avfp.e;
        aucd o = avfp.d.o();
        int i = 0;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfp avfp = (avfp) o.b;
        a2.getClass();
        avfp.b = a2;
        avfp.a |= 1;
        avgt a3 = dwi.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avfp avfp2 = (avfp) o.b;
        a3.getClass();
        avfp2.c = a3;
        avfp2.a |= 2;
        avfp avfp3 = (avfp) o.i();
        int size = dwf.c.size();
        List list = dwf.c;
        aucd o2 = amdu.e.o();
        int a4 = auci.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        amdu amdu = (amdu) o2.b;
        int i2 = amdu.a | 1;
        amdu.a = i2;
        amdu.b = a4;
        amdu.a = i2 | 4;
        amdu.d = size;
        aucf aucf = (aucf) amdv.a.o();
        aucf.a(auci, avfp3);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        amdu amdu2 = (amdu) o2.b;
        amdv amdv = (amdv) aucf.i();
        amdv.getClass();
        amdu2.c = amdv;
        amdu2.a |= 2;
        list.add((amdu) o2.i());
        try {
            dwg dwg = dwf.a;
            ClientContext clientContext3 = dwf.b;
            aucd o3 = amds.b.o();
            List list2 = dwf.c;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            amds amds = (amds) o3.b;
            if (!amds.a.a()) {
                amds.a = aucj.a(amds.a);
            }
            auab.a((Iterable) list2, (List) amds.a);
            dwf.d = ((amdt) dwg.a.a(clientContext3, 1, "/fetch?alt=proto", ((amds) o3.i()).k(), (Object) amdt.b)).a;
            if (dwf.a()) {
                int b2 = dwf.b();
                if (dwf.a()) {
                    atip atip = ((amdx) dwf.d.get(b2)).c;
                    if (atip == null) {
                        atip = atip.c;
                    }
                    i = atip.a;
                }
                int b3 = dwf.b();
                if (dwf.a()) {
                    atip atip2 = ((amdx) dwf.d.get(b3)).c;
                    if (atip2 == null) {
                        atip2 = atip.c;
                    }
                    str = atip2.b;
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
                sb.append("Get suggested invitees failed due to error code: ");
                sb.append(i);
                sb.append("\n");
                sb.append(str);
                Log.e("AppInviteAgent", sb.toString());
                return null;
            }
            auci auci2 = avfq.c;
            int b4 = dwf.b();
            if (b4 < 0 || (((amdx) dwf.d.get(b4)).a & 1) == 0) {
                audx = null;
            } else {
                amdw amdw = ((amdx) dwf.d.get(b4)).b;
                if (amdw == null) {
                    amdw = amdw.b;
                }
                amdw.a(auci2);
                Object b5 = amdw.m.b(auci2.d);
                if (b5 == null) {
                    b5 = auci2.b;
                } else {
                    auci2.a(b5);
                }
                audx = (audx) b5;
            }
            avfq avfq = (avfq) audx;
            if (avfq == null) {
                return null;
            }
            aucx aucx = avfq.a;
            if (aucx == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(aucx.size());
            int size2 = aucx.size();
            for (int i3 = 0; i3 < size2; i3++) {
                avgx avgx = (avgx) aucx.get(i3);
                aucx aucx2 = avgx.d;
                ArrayList arrayList2 = new ArrayList(aucx2.size());
                int size3 = aucx2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    avfn avfn = (avfn) aucx2.get(i4);
                    int a5 = avfm.a(avfn.b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i5 = a5 - 1;
                    if (i5 == 1) {
                        contactMethod = new ContactPerson.ContactMethod(0, avfn.c);
                    } else if (i5 == 2) {
                        contactMethod = new ContactPerson.ContactMethod(1, avfn.d);
                    } else if (i5 != 3) {
                        contactMethod = null;
                    } else {
                        contactMethod = new ContactPerson.ContactMethod(2, avfn.e);
                    }
                    arrayList2.add(contactMethod);
                }
                if (!avgx.c.isEmpty()) {
                    avatarReference = new AvatarReference(1, avgx.c);
                } else {
                    avatarReference = null;
                }
                String str2 = avgx.b;
                avgo avgo = avgx.a;
                if (avgo == null) {
                    avgo = avgo.f;
                }
                arrayList.add(new ContactPerson(str2, avgo.c, avatarReference, arrayList2));
            }
            return arrayList;
        } catch (eif e) {
            Log.e("AppInviteAgent", "Authentication Failed ", e);
            return null;
        } catch (VolleyError e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb2.append("Error communicating with server ");
            sb2.append(valueOf);
            Log.e("AppInviteAgent", sb2.toString());
            return null;
        }
    }
}
