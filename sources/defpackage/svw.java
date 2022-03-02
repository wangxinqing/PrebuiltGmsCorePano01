package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: svw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svw implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ suf b;

    public svw(suf suf, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.b = suf;
        this.a = conditionalUserPropertyParcel;
    }

    public final void run() {
        this.b.a.y();
        if (this.a.c.a() != null) {
            sze sze = this.b.a;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.a;
            AppMetadata a2 = sze.a(conditionalUserPropertyParcel.a);
            if (a2 != null) {
                sze.a(conditionalUserPropertyParcel, a2);
                return;
            }
            return;
        }
        sze sze2 = this.b.a;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = this.a;
        AppMetadata a3 = sze2.a(conditionalUserPropertyParcel2.a);
        if (a3 != null) {
            sze2.b(conditionalUserPropertyParcel2, a3);
        }
    }
}
