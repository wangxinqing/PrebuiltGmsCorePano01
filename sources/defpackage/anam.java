package defpackage;

import java.io.Serializable;

/* renamed from: anam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anam implements Serializable {
    private static final long serialVersionUID = 0;
    final anaf a;

    public anam(anaf anaf) {
        this.a = anaf;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.a.values();
    }
}
