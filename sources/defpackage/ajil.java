package defpackage;

import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: ajil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajil {
    public final WriteBatch a = WriteBatch.create();
    public int b;

    public final void a() {
        this.a.close();
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        this.a.put(bArr, bArr2);
        this.b++;
    }
}
