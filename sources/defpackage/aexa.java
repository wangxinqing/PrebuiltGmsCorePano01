package defpackage;

import java.util.List;

/* renamed from: aexa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aexa extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;
    private final awef e;
    private final awef f;
    private final awef g;
    private final awef h;
    private final awef i;
    private final awef j;

    public aexa(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2, awef awef3, awef awef4, awef awef5, awef awef6, awef awef7, awef awef8) {
        super(bapu2, awey.a(aexa.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
        this.e = aweu.a(awef3);
        this.f = aweu.a(awef4);
        this.g = aweu.a(awef5);
        this.h = aweu.a(awef6);
        this.i = aweu.a(awef7);
        this.j = aweu.a(awef8);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b(), this.e.b(), this.f.b(), this.g.b(), this.h.b(), this.i.b(), this.j.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        afdp afdp;
        Throwable th;
        aukv aukv;
        aukq aukq;
        auld auld;
        List list = (List) obj;
        awdn b2 = awds.b(this.b);
        aukh aukh = (aukh) list.get(0);
        int i2 = 1;
        aull aull = (aull) list.get(1);
        aevm aevm = (aevm) list.get(2);
        int i3 = 3;
        aeti aeti = (aeti) list.get(3);
        int i4 = 4;
        Long l = (Long) list.get(4);
        int i5 = 5;
        Long l2 = (Long) list.get(5);
        Integer num = (Integer) list.get(6);
        afgr afgr = (afgr) list.get(7);
        aucx<aukc> aucx = aull.a;
        afdp b3 = aevm.c().b();
        try {
            if (aevm.b().a(b3)) {
                for (aukc aukc : aucx) {
                    int a = aukb.a(aukc.d);
                    if (a == 0) {
                        a = 1;
                    }
                    int i6 = a - 1;
                    if (i6 != i2) {
                        if (i6 != 2) {
                            if (i6 == i3) {
                                afdp afdp2 = b3;
                                String valueOf = String.valueOf(aukh);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                                sb.append("Unsupported change type DELETE while syncing channel ");
                                sb.append(valueOf);
                                throw new afer(sb.toString());
                            } else if (i6 != i4) {
                                if (i6 != i5) {
                                    try {
                                        int a2 = aukb.a(aukc.d);
                                        if (a2 != 0) {
                                            i2 = a2;
                                        }
                                        String valueOf2 = String.valueOf(aukb.b(i2));
                                        String valueOf3 = String.valueOf(aukh);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 47 + String.valueOf(valueOf3).length());
                                        sb2.append("Got unknown change type ");
                                        sb2.append(valueOf2);
                                        sb2.append(" while syncing channel ");
                                        sb2.append(valueOf3);
                                        throw new afer(sb2.toString());
                                    } catch (Throwable th2) {
                                        th = th2;
                                        afdp = b3;
                                    }
                                } else {
                                    if (aukc.b == i5) {
                                        auld = (auld) aukc.c;
                                    } else {
                                        auld = auld.c;
                                    }
                                    long j2 = auld.a;
                                    long j3 = auld.b;
                                    aucx aucx2 = aucx;
                                    afdp = b3;
                                    try {
                                        aevm.a(b3, j2, j3);
                                        aucx = aucx2;
                                        b3 = afdp;
                                        i2 = 1;
                                        i4 = 4;
                                        i5 = 5;
                                        i3 = 3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        try {
                                            afdp.close();
                                        } catch (Throwable th4) {
                                            apev.a(th, th4);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                        aucx aucx3 = aucx;
                        afdp afdp3 = b3;
                        if (aukc.b == 4) {
                            aukq = (aukq) aukc.c;
                        } else {
                            aukq = aukq.f;
                        }
                        aevm.a(afdp3, aukq.d, aukq.b);
                        aucx = aucx3;
                        b3 = afdp3;
                        i2 = 1;
                        i4 = 4;
                        i5 = 5;
                        i3 = 3;
                    } else {
                        afdp afdp4 = b3;
                        aevm.a(afdp4);
                        afgr.c();
                        aucx = aucx;
                        b3 = afdp4;
                        i2 = 1;
                        i4 = 4;
                        i5 = 5;
                        i3 = 3;
                    }
                }
                aucx aucx4 = aucx;
                afdp afdp5 = b3;
                aumr aumr = aull.b;
                if (aumr == null) {
                    aumr = aumr.c;
                }
                aevm.a(afdp5, aumr);
                aevm.a(afdp5, aeti, l.longValue(), num.intValue(), l2.longValue(), aull.d);
                afdp5.b();
                afdp5.close();
                if (aukh.a == 2) {
                    aukv = (aukv) aukh.b;
                } else {
                    aukv = aukv.e;
                }
                ((pia) b2.a()).a("Downloaded %d changes to the local %s/%s InternalFootprintsTimeSeriesSyncVariant.", Integer.valueOf(aucx4.size()), Integer.valueOf(aukv.b), Integer.valueOf(aukv.c));
                afgr.b((long) aull.a.size());
                int i7 = aull.U;
                if (i7 == -1) {
                    i7 = aueh.a.a((Object) aull).b(aull);
                    aull.U = i7;
                }
                long j4 = (long) i7;
                afgr.a(j4, j4);
                return aorl.a((Object) null);
            }
            afdp = b3;
            throw new affu("GetChanges aborted due to pending local changes", 3);
        } catch (Throwable th5) {
            th = th5;
            afdp = b3;
            th = th;
            afdp.close();
            throw th;
        }
    }
}
