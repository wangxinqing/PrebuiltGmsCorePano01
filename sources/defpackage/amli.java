package defpackage;

/* renamed from: amli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amli implements aoqa {
    final /* synthetic */ amkw a;
    final /* synthetic */ aoqa b;

    public amli(amkw amkw, aoqa aoqa) {
        this.a = amkw;
        this.b = aoqa;
    }

    public final aorr a() {
        amkw b2 = amlv.b(this.a);
        try {
            return this.b.a();
        } finally {
            amlv.b(b2);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
