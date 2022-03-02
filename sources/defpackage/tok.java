package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class tok extends toc {
    private final aoru b;
    private final ParcelFileDescriptor.AutoCloseInputStream c;
    private byte[] d;

    public tok(ParcelablePayload parcelablePayload, ParcelFileDescriptor parcelFileDescriptor, aoru aoru) {
        super(parcelablePayload);
        this.c = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.b = aoru;
    }

    private final int a(InputStream inputStream) {
        IOException iOException;
        try {
            return ((Integer) this.b.b(new toj(inputStream)).get(1000, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            iOException = new IOException(String.format("Timed out waiting for status for Payload %s", new Object[]{this}), e);
            throw iOException;
        } catch (InterruptedException e2) {
            iOException = new IOException(String.format("Interrupted waiting for status for Payload %s", new Object[]{this}), e2);
            throw iOException;
        } catch (ExecutionException e3) {
            iOException = new IOException(String.format("Exception reading status for Payload %s", new Object[]{this}), e3);
            throw iOException;
        }
    }

    public final void c() {
        jjt.a((Closeable) this.c);
    }

    public final void a(byte[] bArr) {
        throw new IOException(String.format("Cannot attach a chunk for an outgoing Payload %s.", new Object[]{this}));
    }

    public byte[] a(int i) {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length != i) {
            this.d = new byte[i];
        }
        byte[] bArr2 = this.d;
        try {
            int read = this.c.read(bArr2);
            if (read >= 0) {
                return read < bArr2.length ? Arrays.copyOf(bArr2, read) : bArr2;
            }
            jjg jjg = tky.a;
            jjt.a((Closeable) this.c);
            ParcelFileDescriptor parcelFileDescriptor = this.a.g;
            if (parcelFileDescriptor == null) {
                return null;
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                if (a((InputStream) autoCloseInputStream) == 0) {
                    return null;
                }
                throw new IOException(String.format("Error status received for Payload %s", new Object[]{this}));
            } finally {
                jjt.a((Closeable) autoCloseInputStream);
            }
        } catch (IOException e) {
            jjt.a((Closeable) this.c);
            throw e;
        }
    }
}
