package defpackage;

import android.os.Bundle;

/* renamed from: pyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyt {
    public final Bundle a;

    public pyt(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public final pyu a() {
        return new pyu(this.a);
    }

    public final void b(amri amri) {
        this.a.putString("title", (String) ((amrt) amri).a);
    }

    public final void a(amri amri) {
        this.a.putInt("theme", ((Integer) ((amrt) amri).a).intValue());
    }
}
