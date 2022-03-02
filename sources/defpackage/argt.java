package defpackage;

import java.nio.ByteBuffer;

/* renamed from: argt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argt extends arhd {
    public arhp a;
    public Object[] b;
    private argq e;
    private argp f;

    public argt(arhj arhj) {
        this.c = new args(this, arhj);
    }

    public final int a(Object obj, Object obj2) {
        if (obj2 != null) {
            int b2 = ((argm) this.d).b(obj);
            if (b2 < 0) {
                this.b[b2 ^ -1] = obj2;
            } else {
                this.b[b2] = obj2;
            }
            return b2;
        }
        throw new NullPointerException("The value must not be null.");
    }

    /* renamed from: b */
    public final argp entrySet() {
        if (this.f == null) {
            this.f = new argp(this);
        }
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final byte c() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return arhq.a(this.a, this.b);
    }

    public final Object put(Object obj, Object obj2) {
        Object obj3;
        if (obj2 != null) {
            int b2 = ((argm) this.d).b(obj);
            if (b2 >= 0) {
                obj3 = this.b[b2];
            } else {
                b2 ^= -1;
                obj3 = null;
            }
            this.b[b2] = obj2;
            return obj3;
        }
        throw new NullPointerException("The value must not be null.");
    }

    public final Object remove(Object obj) {
        try {
            int c = ((argm) this.d).c(obj);
            if (c == -1) {
                return null;
            }
            Object[] objArr = this.b;
            Object obj2 = objArr[c];
            objArr[c] = null;
            return obj2;
        } catch (ClassCastException e2) {
            return null;
        } catch (NullPointerException e3) {
            return null;
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        if (this.a != null) {
            super.c(byteBuffer);
            return;
        }
        throw new IllegalStateException("The value protocol was not previously specified.");
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        arhq.a(byteBuffer, this.a, this.b);
    }

    /* renamed from: a */
    public final argq values() {
        if (this.e == null) {
            this.e = new argq(this);
        }
        return this.e;
    }

    public final Object a(Object obj, boolean z) {
        int a2 = ((argm) this.d).a(obj, z);
        if (a2 >= 0) {
            return this.b[a2];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        arhp arhp = this.a;
        Object[] objArr = this.b;
        arhq.b(byteBuffer, arhp, objArr);
        this.b = objArr;
    }
}
