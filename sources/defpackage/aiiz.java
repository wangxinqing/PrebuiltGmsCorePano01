package defpackage;

import java.util.Collection;

/* renamed from: aiiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiiz extends aija {
    public aiiz(aifw aifw, aidf aidf) {
        super(aifw, aidf);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.l = this.x;
        if (this.u && this.v) {
            this.b.a(22, aidf.a(this.r));
            this.a.a(this.w);
            aifw aifw = this.a;
            long j = this.r;
            long j2 = this.t;
            boolean z = this.s;
            synchronized (aifw.a) {
                aifw.c = true;
                aifw.b(j, j2, z);
            }
            return;
        }
        this.b.a(23);
        this.a.a((Collection) amzy.h());
        aifw aifw2 = this.a;
        synchronized (aifw.a) {
            aifw.c = false;
            aifw2.b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NlpLowPower[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }
}
