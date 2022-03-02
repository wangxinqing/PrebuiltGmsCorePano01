package defpackage;

import java.nio.ByteBuffer;

/* renamed from: argi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argi extends arhd {
    public Object[] a;
    private argf b;
    private arge e;

    public argi() {
        this.c = new argh(this);
    }

    /* renamed from: a */
    public final argf values() {
        if (this.b == null) {
            this.b = new argf(this);
        }
        return this.b;
    }

    /* renamed from: b */
    public final arge entrySet() {
        if (this.e == null) {
            this.e = new arge(this);
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return arhq.a((arhp) null, this.a);
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return a(((Long) obj).longValue(), obj2);
    }

    public final Object remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = ((argb) this.d).c(((Long) obj).longValue())) == -1) {
            return null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[c];
        objArr[c] = null;
        return obj2;
    }

    public final Object a(long j, Object obj) {
        Object obj2;
        if (obj != null) {
            int b2 = ((argb) this.d).b(j);
            if (b2 >= 0) {
                obj2 = this.a[b2];
            } else {
                b2 ^= -1;
                obj2 = null;
            }
            this.a[b2] = obj;
            return obj2;
        }
        throw new NullPointerException("The value must not be null.");
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        arhq.a(byteBuffer, (arhp) null, this.a);
    }

    public final Object a(long j, boolean z) {
        int b2 = ((argb) this.d).b(j, z);
        if (b2 >= 0) {
            return this.a[b2];
        }
        return null;
    }

    public final Object a(Object obj, boolean z) {
        if (obj instanceof Long) {
            return a(((Long) obj).longValue(), z);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        Object[] objArr = this.a;
        arhq.b(byteBuffer, (arhp) null, objArr);
        this.a = objArr;
    }
}
