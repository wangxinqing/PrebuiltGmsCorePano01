package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: athx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athx implements athh {
    public final athh a;

    public athx(athh athh) {
        this.a = athh;
    }

    public static athx a(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        short readShort = dataInputStream.readShort();
        if (dataInputStream.readUTF().length() == 0) {
            int i = 0;
            while (true) {
                if (i < atia.b.length) {
                    if (atia.b[i] == readShort) {
                        String str = atia.a[i];
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        dataInputStream.readUTF();
        HashMap hashMap = new HashMap();
        byte readByte = dataInputStream.readByte() & 255;
        for (int i2 = 0; i2 < readByte; i2++) {
            hashMap.put(dataInputStream.readUTF(), dataInputStream.readUTF());
        }
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        athg athg = new athg(dataInputStream, readInt);
        athy athy = new athy(readUTF, -1, athg);
        athg.a();
        return new athx(athy);
    }

    public final int a() {
        throw null;
    }

    public final InputStream b() {
        throw null;
    }
}
