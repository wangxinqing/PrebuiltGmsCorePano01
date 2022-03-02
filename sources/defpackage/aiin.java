package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: aiin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiin extends aija {
    public aiin(aifw aifw, aidf aidf) {
        super(aifw, aidf);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.u && this.v) {
            this.a.a(this.w);
            aifw aifw = this.a;
            long j = this.r;
            boolean z = this.s;
            synchronized (aifw.a) {
                aifw.d = true;
                aifw.a(j, z);
            }
            return;
        }
        this.a.a((Collection) Collections.emptyList());
        aifw aifw2 = this.a;
        synchronized (aifw.a) {
            aifw.d = false;
            aifw2.c();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityRecognition[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }
}
