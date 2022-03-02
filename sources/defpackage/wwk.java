package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: wwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wwk {
    private static final wwk c = new wwk(0, (byte[]) null);
    public final byte[] a;
    public final int b;

    public wwk(int i, byte[] bArr) {
        this.b = i;
        this.a = bArr;
    }

    public static wwk a(Bundle bundle) {
        if (bundle == null) {
            return c;
        }
        if (bundle.getInt("get.server_blob.code", -1) == -1) {
            return c;
        }
        byte[] byteArray = bundle.getByteArray("get.server_blob.body");
        int i = bundle.getInt("get.server_blob.format");
        HashMap hashMap = (HashMap) bundle.getSerializable("get.server_blob.headers");
        return new wwk(i, byteArray);
    }
}
