package defpackage;

import java.nio.ByteBuffer;

/* renamed from: argm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class argm extends arhg {
    public arhp a;
    public Object[] b;

    public argm(arhj arhj) {
        this.d = new argl(this, arhj);
    }

    public final int a(Object obj, boolean z) {
        if (obj != null && !isEmpty()) {
            int a2 = this.c.a(obj.hashCode());
            while (a2 != -1) {
                if (!obj.equals(this.b[a2])) {
                    a2 = this.c.b(a2);
                } else {
                    if (z) {
                        this.c.e(a2);
                    }
                    return a2;
                }
            }
        }
        return -1;
    }

    public final boolean add(Object obj) {
        return b(obj) < 0;
    }

    /* access modifiers changed from: protected */
    public final byte b() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return arhq.a(this.a, this.b);
    }

    public final boolean remove(Object obj) {
        try {
            int c = c(obj);
            if (c == -1) {
                return false;
            }
            this.d.d(c);
            return true;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public final int b(Object obj) {
        if (obj != null) {
            int a2 = a(obj, true);
            if (a2 != -1) {
                return a2;
            }
            int g = this.c.g();
            this.c.a(g, obj.hashCode());
            this.b[g] = obj;
            return g ^ -1;
        }
        throw new NullPointerException("The specified element cannot be null");
    }

    public final int c(Object obj) {
        int a2 = a(obj, false);
        if (a2 == -1) {
            return -1;
        }
        int a3 = this.c.a(a2, true);
        this.b[a3] = null;
        return a3;
    }

    public final void c(ByteBuffer byteBuffer) {
        if (this.a != null) {
            super.c(byteBuffer);
            return;
        }
        throw new IllegalStateException("The element protocol was not previously specified.");
    }

    /* renamed from: a */
    public final argk iterator() {
        return new argk(this);
    }

    /* access modifiers changed from: protected */
    public final void b(ByteBuffer byteBuffer) {
        arhq.a(byteBuffer, this.a, this.b);
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        arhp arhp = this.a;
        Object[] objArr = this.b;
        arhq.b(byteBuffer, arhp, objArr);
        this.b = objArr;
    }

    public final boolean a(Object obj) {
        try {
            return a(obj, false) != -1;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }
}
