package defpackage;

/* renamed from: arhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhx extends artd {
    private arhw e;

    /* renamed from: a */
    public final arhw entrySet() {
        if (this.e == null) {
            this.e = new arhw(this);
        }
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return a(((Long) obj).longValue(), 0, (byte[]) obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = ((argb) this.d).c(((Long) obj).longValue())) == -1) {
            return null;
        }
        byte[][] bArr = this.b;
        byte[] bArr2 = bArr[c];
        bArr[c] = null;
        return bArr2;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, boolean z) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue(), z);
        }
        return null;
    }

    public final byte[] a(long j, long j2, byte[] bArr) {
        byte[] bArr2;
        if (bArr != null) {
            int b = ((argb) this.d).b(j);
            if (b >= 0) {
                bArr2 = this.b[b];
            } else {
                b ^= -1;
                bArr2 = null;
            }
            this.a[b] = j2;
            this.b[b] = bArr;
            return bArr2;
        }
        throw new NullPointerException("The value must not be null.");
    }

    public final byte[] a(long j, boolean z) {
        int b = ((argb) this.d).b(j, z);
        if (b >= 0) {
            return this.b[b];
        }
        return null;
    }
}
