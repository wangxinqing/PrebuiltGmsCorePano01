package defpackage;

import android.os.Message;
import java.util.Vector;

/* renamed from: ainu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainu {
    private final Vector a = new Vector();
    private int b = 20;
    private int c = 0;
    private int d = 0;

    /* access modifiers changed from: package-private */
    public final synchronized int a() {
        return this.a.size();
    }

    /* access modifiers changed from: package-private */
    public final synchronized int b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        this.b = 10;
        this.d = 0;
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final synchronized aint a(int i) {
        int i2;
        i2 = this.c + i;
        int i3 = this.b;
        if (i2 >= i3) {
            i2 -= i3;
        }
        return i2 < a() ? (aint) this.a.get(i2) : null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(aioa aioa, Message message, String str, ains ains, ains ains2, ains ains3) {
        this.d++;
        if (this.a.size() < this.b) {
            this.a.add(new aint(aioa, message, str, ains, ains2, ains3));
            return;
        }
        aint aint = (aint) this.a.get(this.c);
        int i = this.c + 1;
        this.c = i;
        if (i >= this.b) {
            this.c = 0;
        }
        aint.a(aioa, message, str, ains, ains2, ains3);
    }
}
