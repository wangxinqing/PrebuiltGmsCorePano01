package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bats  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bats extends OutputStream {
    final /* synthetic */ batt a;

    public bats(batt batt) {
        this.a = batt;
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        batt batt = this.a;
        if (!batt.c) {
            batt.flush();
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append(valueOf);
        sb.append(".outputStream()");
        return sb.toString();
    }

    public final void write(int i) {
        batt batt = this.a;
        if (!batt.c) {
            batt.a.h((int) (byte) i);
            this.a.p();
            return;
        }
        throw new IOException("closed");
    }

    public final void write(byte[] bArr, int i, int i2) {
        batt batt = this.a;
        if (!batt.c) {
            batt.a.b(bArr, i, i2);
            this.a.p();
            return;
        }
        throw new IOException("closed");
    }
}
