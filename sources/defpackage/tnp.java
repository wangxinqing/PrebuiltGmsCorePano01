package defpackage;

import java.util.Map;

/* renamed from: tnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tnp {
    public final Map a = new nz();

    public final aurx a(String str) {
        if (this.a.containsKey(str)) {
            return ((tno) this.a.get(str)).b;
        }
        return null;
    }

    public final tnm b(String str) {
        if (this.a.containsKey(str)) {
            return ((tno) this.a.get(str)).a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i) {
        tno tno = (tno) this.a.remove(str);
        if (tno == null) {
            return false;
        }
        new jfx(9, new tnn(tno, str)).start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        tno.a.a(i);
        return true;
    }
}
