package defpackage;

/* renamed from: ajai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajai {
    public final long a;

    public ajai(long j) {
        this.a = j;
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(99);
        sb.append("HardwareDiagnostics{chreAbsoluteTimeInMillis=");
        sb.append(j);
        sb.append(", diagnosticEventType=0}");
        return sb.toString();
    }
}
