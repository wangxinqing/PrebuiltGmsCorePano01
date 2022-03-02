package defpackage;

import com.google.android.gms.location.ActivityTransition;

/* renamed from: rco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rco {
    public int a = -1;
    private int b = -1;

    public final ActivityTransition a() {
        boolean z = true;
        iva.a(this.a != -1, (Object) "Activity type not set.");
        if (this.b == -1) {
            z = false;
        }
        iva.a(z, (Object) "Activity transition type not set.");
        return new ActivityTransition(this.a, this.b);
    }

    public final void a(int i) {
        ActivityTransition.a(i);
        this.b = i;
    }
}
