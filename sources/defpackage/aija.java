package defpackage;

import java.util.Collection;

/* renamed from: aija  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aija extends aiiy {
    protected final aifw a;
    protected final aidf b;
    private boolean c = false;

    public aija(aifw aifw, aidf aidf) {
        this.a = aifw;
        this.b = aidf;
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.a.l = this.x;
        if (this.u && this.v) {
            this.b.a(20, aidf.a(this.r));
            this.a.a(this.w);
            aifw aifw = this.a;
            long j = this.r;
            long j2 = this.t;
            boolean z = this.s;
            synchronized (aifw.a) {
                aifw.b = true;
                aifw.a(j, j2, z);
            }
            return;
        }
        this.b.a(21);
        this.a.a((Collection) amzy.h());
        aifw aifw2 = this.a;
        synchronized (aifw.a) {
            aifw.b = false;
            aifw2.a();
        }
    }

    public final void c() {
        g();
        f();
    }

    public final void d() {
        if (!this.c) {
            this.c = true;
            g();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Nlp[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(StringBuilder sb) {
        super.a(sb);
        sb.append(", debug info=");
        sb.append(this.c);
    }
}
