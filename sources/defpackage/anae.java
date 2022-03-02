package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: anae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anae implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    public anae(anaf anaf) {
        this.a = new Object[anaf.size()];
        this.b = new Object[anaf.size()];
        anhj a2 = anaf.entrySet().iterator();
        int i = 0;
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a(anab anab) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return anab.a();
            }
            anab.a(objArr[i], this.b[i]);
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return a(new anab(this.a.length));
    }
}
