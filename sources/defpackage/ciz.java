package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.List;

/* renamed from: ciz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ciz implements cky {
    private final List a;
    private final ContextManagerClientInfo b;

    public ciz(List list, ContextManagerClientInfo contextManagerClientInfo) {
        this.a = list;
        this.b = contextManagerClientInfo;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cja cja = (cja) obj;
        for (ContextData a2 : this.a) {
            cja.a(a2, this.b);
        }
    }
}
