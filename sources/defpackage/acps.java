package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: acps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acps implements Runnable {
    public boolean a;
    private final acpr b;
    private final DataInputStream c;

    public acps(acpr acpr, DataInputStream dataInputStream) {
        this.b = acpr;
        this.c = dataInputStream;
    }

    public final void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                int readInt = this.c.readInt();
                iwd iwd = acpt.a;
                StringBuilder sb = new StringBuilder(30);
                sb.append("Waiting for ");
                sb.append(readInt);
                sb.append(" bytes.");
                iwd.a(sb.toString(), new Object[0]);
                byte[] bArr = new byte[readInt];
                this.c.readFully(bArr);
                if (acpt.a.a(2)) {
                    iwd iwd2 = acpt.a;
                    int hashCode = Arrays.hashCode(bArr);
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("Received bytes with hash ");
                    sb2.append(hashCode);
                    iwd2.a(sb2.toString(), new Object[0]);
                }
                if (this.a) {
                    acpt.a.a("Not calling listener -- thread already interrupted.", new Object[0]);
                } else {
                    this.b.b(bArr);
                }
            } catch (IOException e) {
                if (this.a) {
                    acpt.a.a("IOException after interrupting thread.", new Object[0]);
                    return;
                }
                throw new RuntimeException(e);
            }
        }
    }
}
