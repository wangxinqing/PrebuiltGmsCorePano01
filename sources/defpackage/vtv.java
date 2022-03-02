package defpackage;

import com.google.android.chimera.Service;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import org.chromium.net.UrlRequest;

/* renamed from: vtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vtv {
    public String a;
    private int b;
    private float c;
    private boolean d = true;

    public vtv(int i) {
        this.b = i;
    }

    public static vtv a(TransferMetadata transferMetadata) {
        vtv vtv = new vtv(transferMetadata.a);
        vtv.b = transferMetadata.a;
        vtv.c = transferMetadata.b;
        vtv.a = transferMetadata.c;
        vtv.d = transferMetadata.d;
        return vtv;
    }

    public final void b() {
        this.d = false;
    }

    public final TransferMetadata a() {
        boolean z;
        int i = this.b;
        float f = this.c;
        String str = this.a;
        boolean z2 = this.d;
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
            case Service.START_CONTINUATION_MASK:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return new TransferMetadata(i, f, str, z2, z);
    }

    public final void a(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 100.0f) {
            z = true;
        }
        iva.b(z, "Progress must be within 0 and 100");
        this.c = f;
    }
}
