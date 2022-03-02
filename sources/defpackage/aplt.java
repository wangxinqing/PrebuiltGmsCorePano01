package defpackage;

import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: aplt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aplt {
    public String a = avqe.f.d;
    public final Bundle b = new Bundle();
    private boolean c = avqe.f.b;
    private int d = avqe.f.c;

    public final Thing.Metadata a() {
        return new Thing.Metadata(this.c, this.d, this.a, this.b);
    }

    public final void b() {
        this.c = true;
    }

    public final void a(int i) {
        boolean z = i >= 0;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Negative score values are invalid. Value: ");
        sb.append(i);
        iva.b(z, sb.toString());
        this.d = i;
    }
}
