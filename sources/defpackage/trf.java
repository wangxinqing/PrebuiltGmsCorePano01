package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: trf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class trf implements Runnable {
    private final trm a;
    private final tlh b;
    private final String[] c;
    private final ParcelablePayload d;

    public trf(trm trm, tlh tlh, String[] strArr, ParcelablePayload parcelablePayload) {
        this.a = trm;
        this.b = tlh;
        this.c = strArr;
        this.d = parcelablePayload;
    }

    public final void run() {
        trm trm = this.a;
        tlh tlh = this.b;
        String[] strArr = this.c;
        ParcelablePayload parcelablePayload = this.d;
        trm.a(tlh, strArr, parcelablePayload);
        for (String a2 : strArr) {
            tlh.f.a(a2, parcelablePayload.a, asog.LOCAL_ERROR);
        }
    }
}
