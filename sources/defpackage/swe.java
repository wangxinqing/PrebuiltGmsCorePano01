package defpackage;

import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: swe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swe implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ suf c;

    public swe(suf suf, EventParcel eventParcel, String str) {
        this.c = suf;
        this.a = eventParcel;
        this.b = str;
    }

    public final void run() {
        this.c.a.y();
        this.c.a.a(this.a, this.b);
    }
}
