package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hva {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final Map j = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder("flat file ttl debug info: ");
        for (Map.Entry entry : this.j.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" count: ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        long j2 = this.d;
        long j3 = this.h;
        long j4 = this.f;
        long j5 = this.b;
        long j6 = this.e;
        long j7 = this.a;
        long j8 = this.g;
        long j9 = this.c;
        long j10 = this.i;
        String valueOf = String.valueOf(sb);
        long j11 = j7;
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 686);
        sb2.append("Cleanup Results\nNum corrupted LogEvents deleted: 0\nNum corrupted PlayLoggerContexts deleted: ");
        sb2.append(j2);
        sb2.append("\nNum of recycled PlayLoggerContexts: ");
        sb2.append(j3);
        sb2.append("\nNum of log events deleted due to over size: ");
        sb2.append(j4);
        sb2.append("\nBytes of LogEvents deleted due to over size: ");
        sb2.append(j5);
        sb2.append("\nNum of log events deleted due to too old: ");
        sb2.append(j6);
        sb2.append("\nBytes of logEvents deleted due to too old: ");
        sb2.append(j11);
        sb2.append("\nNum of log events deleted due to corrupted PlayLoggerContexts: ");
        sb2.append(j8);
        sb2.append("\nBytes of logEvents deleted due to corrupted PlayLoggerContexts: ");
        sb2.append(j9);
        sb2.append("\nNum of log files deleted due to corrupted name: ");
        sb2.append(j10);
        sb2.append("\n");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
