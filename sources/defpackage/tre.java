package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: tre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tre implements Runnable {
    private final tlh a;
    private final String[] b;
    private final ParcelablePayload c;

    public tre(tlh tlh, String[] strArr, ParcelablePayload parcelablePayload) {
        this.a = tlh;
        this.b = strArr;
        this.c = parcelablePayload;
    }

    public final void run() {
        long j;
        tlh tlh = this.a;
        String[] strArr = this.b;
        ParcelablePayload parcelablePayload = this.c;
        tkx tkx = tlh.f;
        long j2 = parcelablePayload.a;
        int a2 = asar.a(parcelablePayload.b);
        int i = parcelablePayload.b;
        if (i != 1) {
            j = i != 2 ? -1 : parcelablePayload.f;
        } else {
            j = (long) parcelablePayload.c.length;
        }
        tkx.a(strArr, j2, a2, j);
    }
}
