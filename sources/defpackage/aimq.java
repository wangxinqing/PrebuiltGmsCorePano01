package defpackage;

import java.io.PrintWriter;
import java.util.Collections;

/* renamed from: aimq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aimq implements Runnable {
    private final aimr a;
    private final aimf b;

    public aimq(aimr aimr, aimf aimf) {
        this.a = aimr;
        this.b = aimf;
    }

    public final void run() {
        String str;
        String str2;
        aimr aimr = this.a;
        aimf aimf = this.b;
        Object obj = aimf.d;
        aimd aimd = aimr.b.k;
        PrintWriter printWriter = (PrintWriter) obj;
        printWriter.print("\nDump of CHRE hardware geofencing:");
        int i = aimd.g;
        StringBuilder sb = new StringBuilder(61);
        sb.append("\n    Class is BlockingChreGeofenceHardware, limit=");
        sb.append(i);
        printWriter.print(sb.toString());
        boolean b2 = axyu.b();
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("\n    Enabled on this device=");
        sb2.append(b2);
        printWriter.print(sb2.toString());
        printWriter.print("\n    Registered geofences:");
        synchronized (aimd.a) {
            if (aimd.g <= 0) {
                ((PrintWriter) obj).print("\n    <none>");
            } else {
                for (int i2 = 0; i2 < aimd.a.size(); i2++) {
                    aijt aijt = (aijt) aimd.a.get(i2);
                    if (aijt == null) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("\n        id=");
                        sb3.append(i2);
                        sb3.append(" <unused>");
                        ((PrintWriter) obj).print(sb3.toString());
                    } else if (aijt == aimd.l) {
                        Object[] objArr = new Object[7];
                        objArr[0] = Integer.valueOf(((arli) aimd.y.b).g);
                        double d = (double) ((arli) aimd.y.b).b;
                        Double.isNaN(d);
                        objArr[1] = Double.valueOf(d / 1.0E7d);
                        double d2 = (double) ((arli) aimd.y.b).c;
                        Double.isNaN(d2);
                        objArr[2] = Double.valueOf(d2 / 1.0E7d);
                        objArr[3] = Integer.valueOf(((arli) aimd.y.b).d);
                        objArr[4] = Integer.valueOf(((arli) aimd.y.b).e);
                        objArr[5] = Integer.valueOf(((arli) aimd.y.b).f);
                        objArr[6] = Integer.valueOf(((arli) aimd.y.b).i);
                        String format = String.format("[CIRCLE id:sentinel transitions:%d %f %f %dm, resp=%ds, dwell=%ds] it=%d", objArr);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(format).length() + 34);
                        sb4.append("\n        id=");
                        sb4.append(i2);
                        sb4.append(" <Sentinel>");
                        sb4.append(format);
                        ((PrintWriter) obj).print(sb4.toString());
                    } else {
                        String valueOf = String.valueOf(aijt);
                        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                        sb5.append("\n        id=");
                        sb5.append(i2);
                        sb5.append(" ");
                        sb5.append(valueOf);
                        ((PrintWriter) obj).print(sb5.toString());
                    }
                    if (aimd.q >= 131072) {
                        arlu arlu = aimd.d[i2];
                        ((PrintWriter) obj).print(" chreState=");
                        if (arlu == null) {
                            ((PrintWriter) obj).print("null");
                        } else {
                            int a2 = arlt.a(arlu.b);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            if (a2 != 1) {
                                str = a2 != 2 ? a2 != 3 ? "UNCERTAIN" : "OUTSIDE" : "INSIDE";
                            } else {
                                str = "INITIAL";
                            }
                            int a3 = arlr.a(arlu.c);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            if (a3 != 1) {
                                str2 = a3 != 2 ? a3 != 3 ? "DWELL" : "EXIT" : "ENTER";
                            } else {
                                str2 = "NONE";
                            }
                            int i3 = arlu.d;
                            boolean z = arlu.e;
                            StringBuilder sb6 = new StringBuilder(str.length() + 67 + str2.length());
                            sb6.append("(location=");
                            sb6.append(str);
                            sb6.append(",transition=");
                            sb6.append(str2);
                            sb6.append(",dwellCheckStart=");
                            sb6.append(i3);
                            sb6.append(",hasExited=");
                            sb6.append(z);
                            sb6.append(")");
                            ((PrintWriter) obj).print(sb6.toString());
                        }
                    }
                }
                Collections.sort(aimd.c);
                String valueOf2 = String.valueOf(aimd.c);
                StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                sb7.append("\nAvailable slots: ");
                sb7.append(valueOf2);
                ((PrintWriter) obj).print(sb7.toString());
            }
        }
        printWriter.print("\n");
        aimf.a((Object) null);
    }
}
