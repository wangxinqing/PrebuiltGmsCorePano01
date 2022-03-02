package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: hxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class hxo extends hxm {
    private static final WeakReference b = new WeakReference((Object) null);
    private WeakReference a = b;

    public hxo(byte[] bArr) {
        super(bArr);
    }

    public final byte[] a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d();
}
