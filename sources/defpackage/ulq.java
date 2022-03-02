package defpackage;

import android.nfc.Tag;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;

/* renamed from: ulq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ulq implements Runnable {
    private final NearFieldCommunication$1 a;
    private final Tag b;

    public ulq(NearFieldCommunication$1 nearFieldCommunication$1, Tag tag) {
        this.a = nearFieldCommunication$1;
        this.b = tag;
    }

    public final void run() {
        NearFieldCommunication$1 nearFieldCommunication$1 = this.a;
        nearFieldCommunication$1.a.a(this.b);
    }
}
