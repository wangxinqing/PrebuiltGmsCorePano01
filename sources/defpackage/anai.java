package defpackage;

import java.io.Serializable;

/* renamed from: anai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anai implements Serializable {
    private static final long serialVersionUID = 0;
    final anaf a;

    public anai(anaf anaf) {
        this.a = anaf;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.a.keySet();
    }
}
