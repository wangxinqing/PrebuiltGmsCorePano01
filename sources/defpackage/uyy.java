package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyy implements vgr {
    public final vgw a;
    public final vel b;
    public vgr c = null;
    public final arwg d;
    private final Context e;
    private final uyt f;
    private final uyz g;

    public uyy(Context context) {
        this.e = context;
        this.a = (vgw) thl.a(context, vgw.class);
        this.b = (vel) thl.a(context, vel.class);
        this.f = (uyt) thl.a(context, uyt.class);
        ((vak) thl.a(context, vak.class)).a((vaj) new uyx(this));
        this.g = (uyz) thl.a(context, uyz.class);
        this.d = (arwg) thl.a(context, arwg.class);
    }

    private final void a(tgh tgh, HashSet hashSet, String str) {
        vgw vgw = this.a;
        vgw.c.b();
        jjg jjg = tgc.a;
        tgh.toString();
        vgv vgv = vgw.d;
        if (vgv != null && vgv.a.equals(tgh)) {
            vgv vgv2 = vgw.d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            auyz auyz = vgv2.c.i;
            if (auyz == null) {
                auyz = auyz.f;
            }
            long j = elapsedRealtime + auyz.d;
            vgv2.d = j;
            long j2 = vgv2.b;
            if (j > j2) {
                vgv2.d = j2;
                return;
            }
            return;
        }
        vgw.d = new vgv(tgh, ((vav) thl.a(vgw.b, vav.class)).f);
        this.g.a(this.e, (String) null, 14, (Set) hashSet);
        try {
            byte[] bArr = tgh.a;
            int length = bArr.length;
            if (length > 1) {
                byte a2 = uwi.a();
                if (bArr[0] == a2) {
                    int i = length - 1;
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 1, bArr2, 0, i);
                    aucd o = auzr.e.o();
                    auay a3 = auay.a(bArr2);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auzr auzr = (auzr) o.b;
                    a3.getClass();
                    auzr.a |= 2;
                    auzr.c = a3;
                    aucd o2 = auzu.d.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auzu auzu = (auzu) o2.b;
                    "__audio_bytes".getClass();
                    int i2 = auzu.a | 2;
                    auzu.a = i2;
                    auzu.c = "__audio_bytes";
                    "__reserved_namespace".getClass();
                    auzu.a = i2 | 1;
                    auzu.b = "__reserved_namespace";
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auzr auzr2 = (auzr) o.b;
                    auzu auzu2 = (auzu) o2.i();
                    auzu2.getClass();
                    auzr2.b = auzu2;
                    auzr2.a |= 1;
                    aucf aucf = (aucf) avae.h.o();
                    aucf.a(str);
                    if (aucf.c) {
                        aucf.c();
                        aucf.c = false;
                    }
                    avae avae = (avae) aucf.b;
                    auzr auzr3 = (auzr) o.i();
                    auzr3.getClass();
                    avae.c = auzr3;
                    avae.a |= 1;
                    avae avae2 = (avae) aucf.i();
                    aucd aucd = (aucd) avae2.c(5);
                    aucd.a((aucj) avae2);
                    ((vbp) thl.a(this.e, vbp.class)).a((aucf) aucd);
                    return;
                }
                String format = String.format("%s Audio token does not match prefix: %s, %s", new Object[]{"AudioBytesUtil: ", jjp.c(bArr), String.valueOf(a2)});
                ((anih) ((anih) tgc.a.b()).a("uwi", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format);
                throw new UnsupportedEncodingException(format);
            }
            String format2 = String.format("%s Audio token is too short for decoding.", new Object[]{"AudioBytesUtil: "});
            ((anih) ((anih) tgc.a.b()).a("uwi", "a", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format2);
            throw new UnsupportedEncodingException(format2);
        } catch (UnsupportedEncodingException e2) {
            ((anih) ((anih) tgc.a.b()).a("uyy", "a", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to decode invalid audio message: %s", (Object) "TokenListener: ", (Object) e2.toString());
        }
    }

    public final void a(tgh tgh, aval aval) {
        tgh tgh2 = tgh;
        aval aval2 = aval;
        this.d.b();
        HashSet hashSet = new HashSet();
        aucx aucx = aval2.c;
        int size = aucx.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            avam avam = (avam) aucx.get(i2);
            jjg jjg = tgc.a;
            tgh.a();
            avch a2 = avch.a(avam.b);
            if (a2 == null) {
                a2 = avch.TOKEN_MEDIUM_UNKNOWN;
            }
            vgu.a(a2);
            avch a3 = avch.a(avam.b);
            if (a3 == null) {
                a3 = avch.TOKEN_MEDIUM_UNKNOWN;
            }
            hashSet.add(a3);
        }
        aucx aucx2 = aval2.c;
        int size2 = aucx2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            avch a4 = avch.a(((avam) aucx2.get(i3)).b);
            if (a4 == null) {
                a4 = avch.TOKEN_MEDIUM_UNKNOWN;
            }
            i3++;
            if (a4 == avch.AUDIO_ULTRASOUND_PASSBAND) {
                if (this.f.e()) {
                    String str = this.f.h.a;
                    vgw vgw = this.a;
                    vgw.c.b();
                    jjg jjg2 = tgc.a;
                    tgh.toString();
                    vgv vgv = vgw.d;
                    if (vgv != null && vgv.a.equals(tgh2)) {
                        vgv vgv2 = vgw.d;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        auyz auyz = vgv2.c.i;
                        if (auyz == null) {
                            auyz = auyz.f;
                        }
                        long j = elapsedRealtime + auyz.d;
                        vgv2.d = j;
                        long j2 = vgv2.b;
                        if (j > j2) {
                            vgv2.d = j2;
                            return;
                        }
                        return;
                    }
                    vgw.d = new vgv(tgh2, ((vav) thl.a(vgw.b, vav.class)).f);
                    this.g.a(this.e, (String) null, 14, (Set) hashSet);
                    try {
                        byte[] bArr = tgh2.a;
                        int length = bArr.length;
                        if (length > 1) {
                            byte a5 = uwi.a();
                            if (bArr[0] == a5) {
                                int i4 = length - 1;
                                byte[] bArr2 = new byte[i4];
                                System.arraycopy(bArr, 1, bArr2, 0, i4);
                                aucd o = auzr.e.o();
                                auay a6 = auay.a(bArr2);
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                auzr auzr = (auzr) o.b;
                                a6.getClass();
                                auzr.a |= 2;
                                auzr.c = a6;
                                aucd o2 = auzu.d.o();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                auzu auzu = (auzu) o2.b;
                                "__audio_bytes".getClass();
                                int i5 = auzu.a | 2;
                                auzu.a = i5;
                                auzu.c = "__audio_bytes";
                                "__reserved_namespace".getClass();
                                auzu.a = i5 | 1;
                                auzu.b = "__reserved_namespace";
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                auzr auzr2 = (auzr) o.b;
                                auzu auzu2 = (auzu) o2.i();
                                auzu2.getClass();
                                auzr2.b = auzu2;
                                auzr2.a |= 1;
                                aucf aucf = (aucf) avae.h.o();
                                aucf.a(str);
                                if (aucf.c) {
                                    aucf.c();
                                    aucf.c = false;
                                }
                                avae avae = (avae) aucf.b;
                                auzr auzr3 = (auzr) o.i();
                                auzr3.getClass();
                                avae.c = auzr3;
                                avae.a |= 1;
                                avae avae2 = (avae) aucf.i();
                                aucd aucd = (aucd) avae2.c(5);
                                aucd.a((aucj) avae2);
                                ((vbp) thl.a(this.e, vbp.class)).a((aucf) aucd);
                                return;
                            }
                            Object[] objArr = new Object[3];
                            objArr[0] = "AudioBytesUtil: ";
                            char[] cArr = jjp.a;
                            char[] cArr2 = new char[((length * 3) - 1)];
                            int i6 = 0;
                            while (true) {
                                int length2 = bArr.length - 1;
                                if (i < length2) {
                                    byte b2 = bArr[i] & 255;
                                    int i7 = i6 + 1;
                                    cArr2[i6] = jjp.a[b2 >>> 4];
                                    int i8 = i7 + 1;
                                    cArr2[i7] = jjp.a[b2 & 15];
                                    cArr2[i8] = ':';
                                    i++;
                                    i6 = i8 + 1;
                                } else {
                                    byte b3 = bArr[length2] & 255;
                                    cArr2[i6] = jjp.a[b3 >>> 4];
                                    cArr2[i6 + 1] = jjp.a[b3 & 15];
                                    objArr[1] = new String(cArr2);
                                    objArr[2] = String.valueOf(a5);
                                    String format = String.format("%s Audio token does not match prefix: %s, %s", objArr);
                                    ((anih) ((anih) tgc.a.b()).a("uwi", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format);
                                    throw new UnsupportedEncodingException(format);
                                }
                            }
                        } else {
                            String format2 = String.format("%s Audio token is too short for decoding.", new Object[]{"AudioBytesUtil: "});
                            ((anih) ((anih) tgc.a.b()).a("uwi", "a", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format2);
                            throw new UnsupportedEncodingException(format2);
                        }
                    } catch (UnsupportedEncodingException e2) {
                        ((anih) ((anih) tgc.a.b()).a("uyy", "a", 157, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Unable to decode invalid audio message: %s", (Object) "TokenListener: ", (Object) e2.toString());
                        return;
                    }
                }
            }
        }
        vgr vgr = this.c;
        if (vgr != null) {
            vgr.a(tgh2, aval2);
        }
        vgw vgw2 = this.a;
        jjg jjg3 = tgc.a;
        tgh.toString();
        vgw2.c.b();
        if (!vgw.b(tgh)) {
            tgh.toString();
        } else {
            vgx vgx = (vgx) vgw2.a.get(tgh2);
            if (vgx != null) {
                vgx.a();
            } else {
                vgw2.a(tgh2);
                i = 1;
            }
        }
        this.a.a(tgh2, aval2);
        if (i != 0) {
            this.g.a(this.e, (String) null, 14, (Set) hashSet);
            this.b.a();
        }
    }
}
