package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;

/* renamed from: athz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class athz extends atih {
    private final String f;
    private final String g;
    private byte[] h;

    public athz(String str, String str2, String str3, String str4, String str5) {
        this.g = str + ',' + str2 + ',' + str3 + ',' + str4 + ",en_US";
        this.f = str5;
    }

    private final synchronized byte[] e() {
        if (this.h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(2);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeUTF(this.g);
            dataOutputStream.writeLong(0);
            dataOutputStream.writeUTF(this.f);
            dataOutputStream.close();
            byteArrayOutputStream.close();
            this.h = byteArrayOutputStream.toByteArray();
        }
        return this.h;
    }

    public final int a() {
        return e().length;
    }

    public final InputStream b() {
        return new ByteArrayInputStream(e());
    }

    public final void d() {
    }
}
