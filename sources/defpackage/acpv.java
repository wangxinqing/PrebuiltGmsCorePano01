package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.DataOutput;
import java.io.DataOutputStream;

/* renamed from: acpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpv {
    public static final iwd a = acqa.a("D2D", "PipeWriteManager");
    private final DataOutput b;
    private final aoru c = aosd.a(qvj.b.b(1));

    public acpv(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor));
    }

    public final aorr a(byte[] bArr) {
        return this.c.b(new acpu(this.b, bArr));
    }
}
