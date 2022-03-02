package defpackage;

import java.util.NoSuchElementException;

/* renamed from: pft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pft implements amqy {
    private final pfu a;

    public pft(pfu pfu) {
        this.a = pfu;
    }

    public final Object a(Object obj) {
        amri amri = (amri) obj;
        if (((Boolean) this.a.a.a()).booleanValue()) {
            try {
                boolean z = false;
                if (amri.a() && ((aulx) ((afhu) amri.b()).a()).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } catch (auda e) {
                throw new RuntimeException(e);
            }
        } else if (amri.a()) {
            try {
                return Boolean.valueOf(((aulx) ((afhu) amri.b()).a()).a);
            } catch (auda e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new NoSuchElementException("No footprint matching given secondary ID");
        }
    }
}
