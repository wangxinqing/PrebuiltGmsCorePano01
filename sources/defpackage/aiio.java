package defpackage;

/* renamed from: aiio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiio extends aijc {
    private final aihq a;
    private final aidf b;

    public aiio(aihq aihq, aidf aidf) {
        this.a = aihq;
        this.b = aidf;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (this.u && this.v) {
            aihq aihq = this.a;
            if (aihq != null) {
                if (ayam.c()) {
                    ahqa.b(aihq.c);
                }
                this.b.a(39);
            }
        } else if (this.a != null) {
            this.b.a(40);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bluesky[");
        a(sb);
        sb.append(']');
        return sb.toString();
    }
}
