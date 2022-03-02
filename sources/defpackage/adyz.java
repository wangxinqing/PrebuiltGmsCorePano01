package defpackage;

import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;

/* renamed from: adyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adyz implements Runnable {
    final /* synthetic */ CapabilityInfoParcelable a;
    final /* synthetic */ adzd b;

    public adyz(adzd adzd, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.b = adzd;
        this.a = capabilityInfoParcelable;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
