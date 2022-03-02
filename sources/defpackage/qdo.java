package defpackage;

import android.os.Bundle;

/* renamed from: qdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qdo {
    final int a;
    final acwd b = new acwd();
    final Bundle c;

    public qdo(int i, Bundle bundle) {
        this.a = i;
        this.c = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a(qdp qdp) {
        this.b.a((Exception) qdp);
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=1 id=");
        sb.append(i);
        sb.append(" oneWay=false}");
        return sb.toString();
    }
}
