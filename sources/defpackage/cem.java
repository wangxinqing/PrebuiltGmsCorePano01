package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: cem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cem extends bva {
    final /* synthetic */ cen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cem(cen cen, String str, Object... objArr) {
        super(str, objArr);
        this.a = cen;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        jtk d = ((ick) obj).d();
        if (d != null) {
            try {
                ccj ccj = cen.b;
                ContextData contextData = null;
                for (int i = 0; i < d.a(); i++) {
                    ContextData c = d.b(i);
                    if (c.j().b()) {
                        if (contextData == null || c.j().c() > contextData.j().c()) {
                            contextData = c;
                        }
                    }
                }
                if (contextData != null) {
                    this.a.b(contextData);
                }
            } finally {
                d.c();
            }
        }
    }
}
