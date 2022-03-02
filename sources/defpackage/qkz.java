package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkz extends jba {
    private static final qfn a = new qfn("GetLaunchDataOperation");
    private final qfy d;
    private final qiz e;
    private final List f;
    private final boolean g;

    public qkz(qfy qfy, qiz qiz, List list, boolean z) {
        super(121, "GetVisitedInstantAppsOperation");
        this.d = qfy;
        this.e = qiz;
        this.f = list;
        this.g = z;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        qik qik;
        qgw a2;
        String str;
        qik qik2;
        try {
            qiz qiz = this.e;
            List<String> list = this.f;
            boolean z = this.g;
            qiz.b();
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                qgx b = qiz.c.b();
                try {
                    a2 = qiz.c.a(b);
                    a2.c();
                    while (a2.e()) {
                        String str2 = new String(a2.a(), qfb.b);
                        if (str2.endsWith("-as")) {
                            str = str2.substring(0, str2.length() - 3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            qio qio = (qio) aucj.a((aucj) qio.e, a2.b(), aubs.b());
                            if (z) {
                                qik2 = qiz.h(str);
                            } else {
                                qik2 = null;
                            }
                            arrayList.add(qiz.a(str, qio, qik2));
                        }
                        a2.d();
                    }
                    a2.close();
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            } else {
                for (String str3 : list) {
                    qio d2 = qiz.d(str3);
                    if (d2 != null) {
                        if (z) {
                            qik = qiz.h(str3);
                        } else {
                            qik = null;
                        }
                        arrayList.add(qiz.a(str3, d2, qik));
                    }
                }
            }
            this.d.a(Status.a, (List) arrayList);
            return;
            throw th;
        } catch (IOException e2) {
            a.a(e2, "Error while reading levelDb", new Object[0]);
            this.d.a(Status.c, (List) null);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
