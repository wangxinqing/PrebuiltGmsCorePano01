package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: swk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swk implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ suf c;

    public swk(suf suf, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        this.c = suf;
        this.a = conditionalUserPropertyParcel;
        this.b = appMetadata;
    }

    public final void run() {
        this.c.a.y();
        if (this.a.c.a() == null) {
            this.c.a.b(this.a, this.b);
        } else {
            this.c.a.a(this.a, this.b);
        }
    }
}
