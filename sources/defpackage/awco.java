package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: awco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awco implements awcu {
    private static final batg b = batg.a("connection");
    private static final batg c = batg.a("host");
    private static final batg d = batg.a("keep-alive");
    private static final batg e = batg.a("proxy-connection");
    private static final batg f = batg.a("transfer-encoding");
    private static final batg g = batg.a("te");
    private static final batg h = batg.a("encoding");
    private static final batg i = batg.a("upgrade");
    private static final List j = awaj.a((Object[]) new batg[]{b, c, d, e, f, awbg.b, awbg.c, awbg.d, awbg.e, awbg.f, awbg.g});
    private static final List k = awaj.a((Object[]) new batg[]{b, c, d, e, f});
    private static final List l = awaj.a((Object[]) new batg[]{b, c, d, e, g, f, h, i, awbg.b, awbg.c, awbg.d, awbg.e, awbg.f, awbg.g});
    private static final List m = awaj.a((Object[]) new batg[]{b, c, d, e, g, f, h, i});
    public final awde a;
    private final awbb n;
    private awcs o;
    private awbf p;

    public awco(awde awde, awbb awbb) {
        this.a = awde;
        this.n = awbb;
    }

    public final avzn a(avzm avzm) {
        return new awcx(batq.a((baua) new awcn(this, this.p.f)));
    }

    public final void a(awcs awcs) {
        this.o = awcs;
    }

    public final avzl b() {
        String str = null;
        if (this.n.b == avzh.HTTP_2) {
            List c2 = this.p.c();
            avza avza = new avza();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                batg batg = ((awbg) c2.get(i2)).h;
                String a2 = ((awbg) c2.get(i2)).i.a();
                if (batg.equals(awbg.a)) {
                    str = a2;
                } else if (!m.contains(batg)) {
                    avza.c(batg.a(), a2);
                }
            }
            if (str != null) {
                String valueOf = String.valueOf(str);
                awdd a3 = awdd.a(valueOf.length() == 0 ? new String("HTTP/1.1 ") : "HTTP/1.1 ".concat(valueOf));
                avzl avzl = new avzl();
                avzl.b = avzh.HTTP_2;
                avzl.c = a3.b;
                avzl.d = a3.c;
                avzl.a(avza.a());
                return avzl;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        List c3 = this.p.c();
        avza avza2 = new avza();
        int size2 = c3.size();
        String str2 = "HTTP/1.1";
        for (int i3 = 0; i3 < size2; i3++) {
            batg batg2 = ((awbg) c3.get(i3)).h;
            String a4 = ((awbg) c3.get(i3)).i.a();
            int i4 = 0;
            while (i4 < a4.length()) {
                int indexOf = a4.indexOf(0, i4);
                if (indexOf == -1) {
                    indexOf = a4.length();
                }
                String substring = a4.substring(i4, indexOf);
                if (batg2.equals(awbg.a)) {
                    str = substring;
                } else if (batg2.equals(awbg.g)) {
                    str2 = substring;
                } else if (!k.contains(batg2)) {
                    avza2.c(batg2.a(), substring);
                }
                i4 = indexOf + 1;
            }
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            awdd a5 = awdd.a(sb.toString());
            avzl avzl2 = new avzl();
            avzl2.b = avzh.SPDY_3;
            avzl2.c = a5.b;
            avzl2.d = a5.c;
            avzl2.a(avza2.a());
            return avzl2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final void c() {
        this.p.d().close();
    }

    public final batz a(avzj avzj, long j2) {
        return this.p.d();
    }

    public final void a() {
        awbf awbf = this.p;
        if (awbf != null) {
            awbf.b(awak.CANCEL);
        }
    }

    public final void a(avzj avzj) {
        ArrayList arrayList;
        int i2;
        awbf awbf;
        if (this.p == null) {
            this.o.a();
            boolean a2 = this.o.a(avzj);
            if (this.n.b != avzh.HTTP_2) {
                avzb avzb = avzj.c;
                arrayList = new ArrayList(avzb.a() + 5);
                arrayList.add(new awbg(awbg.b, avzj.b));
                arrayList.add(new awbg(awbg.c, awcz.a(avzj.a)));
                arrayList.add(new awbg(awbg.g, "HTTP/1.1"));
                arrayList.add(new awbg(awbg.f, awaj.a(avzj.a)));
                arrayList.add(new awbg(awbg.d, avzj.a.a));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int a3 = avzb.a();
                for (int i3 = 0; i3 < a3; i3++) {
                    batg a4 = batg.a(avzb.a(i3).toLowerCase(Locale.US));
                    if (!j.contains(a4)) {
                        String b2 = avzb.b(i3);
                        if (linkedHashSet.add(a4)) {
                            arrayList.add(new awbg(a4, b2));
                        } else {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= arrayList.size()) {
                                    break;
                                } else if (((awbg) arrayList.get(i4)).h.equals(a4)) {
                                    arrayList.set(i4, new awbg(a4, ((awbg) arrayList.get(i4)).i.a() + 0 + b2));
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            } else {
                avzb avzb2 = avzj.c;
                arrayList = new ArrayList(avzb2.a() + 4);
                arrayList.add(new awbg(awbg.b, avzj.b));
                arrayList.add(new awbg(awbg.c, awcz.a(avzj.a)));
                arrayList.add(new awbg(awbg.e, awaj.a(avzj.a)));
                arrayList.add(new awbg(awbg.d, avzj.a.a));
                int a5 = avzb2.a();
                for (int i5 = 0; i5 < a5; i5++) {
                    batg a6 = batg.a(avzb2.a(i5).toLowerCase(Locale.US));
                    if (!l.contains(a6)) {
                        arrayList.add(new awbg(a6, avzb2.b(i5)));
                    }
                }
            }
            awbb awbb = this.n;
            boolean z = !a2;
            synchronized (awbb.q) {
                synchronized (awbb) {
                    if (!awbb.h) {
                        i2 = awbb.g;
                        awbb.g = i2 + 2;
                        awbf = new awbf(i2, awbb, z, false);
                        if (awbf.a()) {
                            awbb.d.put(Integer.valueOf(i2), awbf);
                            awbb.a(false);
                        }
                    } else {
                        throw new IOException("shutdown");
                    }
                }
                awbb.q.a(z, i2, (List) arrayList);
            }
            if (!a2) {
                awbb.q.b();
            }
            this.p = awbf;
            awbf.h.a((long) this.o.b.r, TimeUnit.MILLISECONDS);
            this.p.i.a((long) this.o.b.s, TimeUnit.MILLISECONDS);
        }
    }

    public final void a(awda awda) {
        awda.a(this.p.d());
    }
}
