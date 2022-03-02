package defpackage;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aiyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyo {
    public static final aiyo a = new aiyo();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public long d = -1;

    private aiyo() {
    }

    private static final String a(long j) {
        return j + "ms (" + (j / 60000) + "min) ";
    }

    public final String a(long j, long j2) {
        String valueOf = String.valueOf(a(j));
        StringBuilder sb = new StringBuilder(12);
        double d2 = (double) j;
        double d3 = (double) j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        sb.append((int) ((d2 / d3) * 100.0d));
        sb.append("%");
        String valueOf2 = String.valueOf(sb.toString());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final synchronized void a(PrintWriter printWriter, long j) {
        int length;
        printWriter.println("####NlpWakeLockStats (since last process restart)###");
        long j2 = this.d;
        if (j2 != -1) {
            long j3 = j - j2;
            if (j3 <= 0) {
                j3 = 1;
            }
            String valueOf = String.valueOf(a(j3));
            printWriter.println(valueOf.length() == 0 ? new String("Time since first lock: ") : "Time since first lock: ".concat(valueOf));
            printWriter.println("--Locks currently held:");
            List list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aiym aiym = (aiym) list.get(i);
                if (aiym.b()) {
                    String str = aiym.d;
                    String a2 = a(aiym.a(j), j3);
                    boolean b2 = aiym.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(a2).length());
                    sb.append(str);
                    sb.append(" timeHeld= ");
                    sb.append(a2);
                    sb.append(" isHeld=");
                    sb.append(b2);
                    printWriter.println(sb.toString());
                }
            }
            printWriter.println("--Locks that timed out:");
            List list2 = this.b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aiym aiym2 = (aiym) list2.get(i2);
                if (!aiym2.b()) {
                    String str2 = aiym2.d;
                    boolean b3 = aiym2.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13);
                    sb2.append(str2);
                    sb2.append(" isHeld=");
                    sb2.append(b3);
                    printWriter.println(sb2.toString());
                }
            }
            printWriter.println("--Historical locks:");
            for (Map.Entry entry : this.c.entrySet()) {
                aiyn aiyn = (aiyn) entry.getValue();
                String str3 = (String) entry.getKey();
                String a3 = aiyn.e.a(aiyn.a, j3);
                int i3 = aiyn.b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 37 + String.valueOf(a3).length());
                sb3.append(str3);
                sb3.append(", sumOfTimeHeld= ");
                sb3.append(a3);
                sb3.append(", count= ");
                sb3.append(i3);
                printWriter.println(sb3.toString());
                short[] sArr = aiyn.c;
                int i4 = 0;
                while (true) {
                    length = sArr.length;
                    if (i4 >= length) {
                        break;
                    }
                    short s = sArr[i4];
                    int i5 = aiyn.d[i4];
                    StringBuilder sb4 = new StringBuilder(33);
                    sb4.append("  x < ");
                    sb4.append(s);
                    sb4.append("ms, count ");
                    sb4.append(i5);
                    printWriter.println(sb4.toString());
                    i4++;
                }
                short s2 = sArr[length - 1];
                int i6 = aiyn.d[length];
                StringBuilder sb5 = new StringBuilder(33);
                sb5.append("  x > ");
                sb5.append(s2);
                sb5.append("ms, count ");
                sb5.append(i6);
                printWriter.println(sb5.toString());
            }
            printWriter.println();
            return;
        }
        printWriter.println("WakeLockTracker not initialized");
    }
}
