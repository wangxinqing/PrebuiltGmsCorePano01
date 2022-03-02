package defpackage;

import android.content.res.Resources;
import java.util.List;
import java.util.Set;

/* renamed from: oru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oru extends ppr {
    final /* synthetic */ String a;
    final /* synthetic */ osf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oru(osf osf, aonk aonk, String str) {
        super(aonk);
        this.b = osf;
        this.a = str;
    }

    public final void b() {
        Resources resources;
        if (this.a.equals(this.b.b.getResources().getConfiguration().locale.getLanguage())) {
            osf osf = this.b;
            osf.c.b(2);
            Set<oyz> a2 = osf.m.a();
            ozq b2 = osf.b();
            for (oyz oyz : a2) {
                Resources l = oyz.l();
                if (l == null) {
                    String valueOf = String.valueOf(oyz.b);
                    oso.b(valueOf.length() == 0 ? new String("Can't get resources for package: ") : "Can't get resources for package: ".concat(valueOf));
                } else {
                    for (pao c : oyz.a()) {
                        ozv c2 = b2.c(c);
                        otg otg = ((ota) c2.c()).c;
                        if (otg == null) {
                            otg = otg.h;
                        }
                        int a3 = otf.a(otg.c);
                        if (a3 == 0 || a3 == 1) {
                            osz osz = ((ota) c2.c()).b;
                            if (osz == null) {
                                osz = osz.s;
                            }
                            aucd aucd = (aucd) osz.c(5);
                            aucd.a((aucj) osz);
                            osz osz2 = ((ota) c2.c()).b;
                            if (osz2 == null) {
                                osz2 = osz.s;
                            }
                            if (!osz2.k.isEmpty()) {
                                osz osz3 = ((ota) c2.c()).b;
                                if (osz3 == null) {
                                    osz3 = osz.s;
                                }
                                osz osz4 = ((ota) c2.c()).b;
                                if (osz4 == null) {
                                    osz4 = osz.s;
                                }
                                if (oxe.a(osz4.c)) {
                                    resources = osf.b.getResources();
                                } else {
                                    resources = l;
                                }
                                pbj pbj = new pbj(osz3, resources);
                                try {
                                    pbj.a();
                                    List b3 = pbj.b();
                                    if (aucd.c) {
                                        aucd.c();
                                        aucd.c = false;
                                    }
                                    ((osz) aucd.b).k = aucj.s();
                                    if (b3 != null) {
                                        aucd.K(b3);
                                    }
                                    String str = oyz.b;
                                    osz osz5 = ((ota) c2.c()).b;
                                    if (osz5 == null) {
                                        osz5 = osz.s;
                                    }
                                    try {
                                        b2.a(new pao(str, osz5.c), c2.a((Object) (osz) aucd.i()));
                                    } catch (pau e) {
                                        oso.a((Throwable) e, "Failed to set corpus config on reparse");
                                        osf.r.a("reparse_sourcecheck_failed");
                                    }
                                } catch (pav e2) {
                                    String str2 = oyz.b;
                                    osz osz6 = ((ota) c2.c()).b;
                                    if (osz6 == null) {
                                        osz6 = osz.s;
                                    }
                                    String str3 = osz6.c;
                                    String message = e2.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 73 + String.valueOf(str3).length() + String.valueOf(message).length());
                                    sb.append("Error while reparsing mapping for packageName = ");
                                    sb.append(str2);
                                    sb.append(", corpusName = ");
                                    sb.append(str3);
                                    sb.append(", error = ");
                                    sb.append(message);
                                    oso.b(sb.toString());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
