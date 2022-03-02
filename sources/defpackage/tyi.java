package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: tyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tyi implements Runnable {
    private final tyt a;
    private final int b;
    private final int c;
    private final byte[] d;

    public tyi(tyt tyt, int i, int i2, byte[] bArr) {
        this.a = tyt;
        this.b = i;
        this.c = i2;
        this.d = bArr;
    }

    public final void run() {
        tyt tyt = this.a;
        int i = this.b;
        int i2 = this.c;
        byte[] bArr = this.d;
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(tyt.d.getOutputStream());
            dataOutputStream.writeByte(i);
            dataOutputStream.writeByte(i2);
            int length = bArr.length;
            dataOutputStream.writeShort(length);
            if (length > 0) {
                dataOutputStream.write(bArr);
            }
            dataOutputStream.flush();
            ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Send message: %d, %d, %s", tyt.c.getAddress(), Integer.valueOf(i), Integer.valueOf(i2), anml.g.a(bArr));
        } catch (IOException | NullPointerException e) {
            anih anih = (anih) tsp.a.c();
            anih.a(e);
            anih.a("RfcommEventStreamMedium: [%s] Failed to send message: %d, %d, %s", tyt.c.getAddress(), Integer.valueOf(i), Integer.valueOf(i2), anml.g.a(bArr));
        }
    }
}
