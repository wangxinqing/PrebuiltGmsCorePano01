package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: swg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swg implements Runnable {
    final /* synthetic */ UserAttributeParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ suf c;

    public swg(suf suf, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.c = suf;
        this.a = userAttributeParcel;
        this.b = appMetadata;
    }

    public final void run() {
        this.c.a.y();
        if (this.a.a() == null) {
            this.c.a.b(this.a, this.b);
        } else {
            this.c.a.a(this.a, this.b);
        }
    }
}
