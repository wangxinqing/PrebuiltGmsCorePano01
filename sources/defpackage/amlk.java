package defpackage;

/* renamed from: amlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amlk implements aoqb {
    final /* synthetic */ amkw a;
    final /* synthetic */ aoqb b;

    public amlk(amkw amkw, aoqb aoqb) {
        this.a = amkw;
        this.b = aoqb;
    }

    public final aorr a(Object obj) {
        amkw b2 = amlv.b(this.a);
        try {
            return this.b.a(obj);
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
