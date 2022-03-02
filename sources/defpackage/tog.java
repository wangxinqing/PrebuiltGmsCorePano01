package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: tog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class tog extends toc {
    private final ParcelFileDescriptor.AutoCloseOutputStream b;

    public tog(ParcelablePayload parcelablePayload, ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelablePayload);
        this.b = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.b.write(bArr);
            this.b.flush();
            return;
        }
        jjg jjg = tky.a;
        jjt.a((Closeable) this.b);
    }

    public final void c() {
        jjt.a((Closeable) this.b);
    }

    public final byte[] a(int i) {
        throw new IOException(String.format("Cannot detach a chunk for an incoming Payload %s.", new Object[]{this}));
    }
}
