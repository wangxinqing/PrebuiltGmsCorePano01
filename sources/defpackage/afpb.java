package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afpb implements aoqb {
    private final afpf a;
    private final boolean b;

    public afpb(afpf afpf, boolean z) {
        this.a = afpf;
        this.b = z;
    }

    public final aorr a(Object obj) {
        afkr a2;
        boolean z;
        afpf afpf = this.a;
        boolean z2 = this.b;
        ArrayList arrayList = new ArrayList();
        for (aflf aflf : (List) obj) {
            if (!aflf.e && (a2 = afpf.d.a(aflf)) != null) {
                aflb aflb = a2.i;
                if (aflb == null) {
                    aflb = aflb.f;
                }
                int a3 = afky.a(aflb.c);
                if (a3 != 0 && a3 == 2) {
                    z = true;
                } else {
                    aflb aflb2 = a2.i;
                    if (aflb2 == null) {
                        aflb2 = aflb.f;
                    }
                    int a4 = afky.a(aflb2.c);
                    if (a4 == 0) {
                        z = false;
                    } else if (a4 == 3) {
                        long a5 = afpf.f.a();
                        afko afko = a2.b;
                        if (afko == null) {
                            afko = afko.g;
                        }
                        long j = (a5 - afko.c) / 1000;
                        aflb aflb3 = a2.i;
                        if (aflb3 == null) {
                            aflb3 = aflb.f;
                        }
                        if (j > aflb3.d) {
                            aucd aucd = (aucd) a2.c(5);
                            aucd.a((aucj) a2);
                            aflb aflb4 = a2.i;
                            if (aflb4 == null) {
                                aflb4 = aflb.f;
                            }
                            aucd aucd2 = (aucd) aflb4.c(5);
                            aucd2.a((aucj) aflb4);
                            if (aucd2.c) {
                                aucd2.c();
                                aucd2.c = false;
                            }
                            aflb aflb5 = (aflb) aucd2.b;
                            aflb5.c = 1;
                            aflb5.a |= 2;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            afkr afkr = (afkr) aucd.b;
                            aflb aflb6 = (aflb) aucd2.i();
                            aflb6.getClass();
                            afkr.i = aflb6;
                            afkr.a |= 128;
                            a2 = (afkr) aucd.i();
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                Object[] objArr = {"FileGroupManager", a2.c, Boolean.valueOf(z)};
                if (z2 || z) {
                    aflb aflb7 = a2.i;
                    if (aflb7 == null) {
                        aflb7 = aflb.f;
                    }
                    arrayList.add(afpf.a(aflf, aflb7));
                }
            }
        }
        return aorl.b((Iterable) arrayList).a(afoj.a, afpf.h);
    }
}
