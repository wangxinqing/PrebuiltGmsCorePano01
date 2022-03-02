package defpackage;

import com.google.android.chimera.Service;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* renamed from: aidf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aidf extends jjb {
    private static final long n = TimeUnit.SECONDS.toMillis(1);
    private static final long o = TimeUnit.MINUTES.toMillis(1);
    private static final String[] p = {"Engine [%s] enabled", "Engine [%s] disabled", "Location GPS setting enabled", "Location GPS setting disabled", "Location NLP setting enabled", "Location NLP setting disabled", "Added location request %s", "Removed location request %s", "Received GPS locations [%d]", "Received WIFI location", "Received CELL location", "Received UNKNOWN location", "Delivered GPS location(s) %s", "Delivered WIFI location(s) %s", "Delivered CELL location(s) %s", "Delivered UNKNOWN location(s) %s", "Delivered SUCCESSFUL status %s", "Delivered UNSUCCESSFUL status %s", "Requested GPS updates at (%s)", "Stopped GPS updates", "Requested NLP updates at (%s)", "Stopped NLP updates", "Requested low power NLP updates at [%s]", "Stopped low power NLP updates", "Device paired [%s]", "Device unpaired [%s]", "Entered stationary mode (%s)", "Exited stationary mode (%s)", "Location delegated to device [%s]", "Local node location capable: true", "Local node location capable: false", "Flush location request %s", "Request throttled %s", "Request unthrottled %s", "Wifi connected to %s", "Wifi disconnected", "Screen-on location requested", "Added Device Orientation Request %s", "Removed Device Orientation Request %s", "Requested Bluesky updates", "Stopped Blueksy updates", "Received Bluesky likelihood update"};
    private static final long[] q = {1000, 5000, 10000, 60000, 300000};
    public final aide j = new aide(5, "Unknown Engine");
    public final aide k = new aide(30, Collections.emptyList());
    public final aide l = new aide(10, "Unknown Device");
    public final aide m = new aide(10, "Unknown Access Point");

    public aidf(int i) {
        super(i);
    }

    public static int a(long j2) {
        int i = 0;
        while (true) {
            long[] jArr = q;
            if (i >= jArr.length) {
                return jArr.length;
            }
            if (j2 < jArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static String b(long j2) {
        long j3 = o;
        if (j2 < j3) {
            long j4 = j2 / n;
            StringBuilder sb = new StringBuilder(21);
            sb.append(j4);
            sb.append("s");
            return sb.toString();
        }
        long j5 = j2 / j3;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(j5);
        sb2.append("m");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(long j2, int i, int i2) {
        String str;
        String str2 = p[i];
        switch (i) {
            case 0:
            case 1:
            case 9:
            case 10:
            case 11:
                str2 = String.format(str2, new Object[]{this.j.a(i2)});
                break;
            case 6:
            case 7:
            case 12:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
            case Service.START_CONTINUATION_MASK:
            case 16:
            case 17:
            case 31:
            case 32:
            case 33:
            case 37:
            case 38:
                str2 = String.format(str2, new Object[]{this.k.a(i2)});
                break;
            case 8:
                str2 = String.format(str2, new Object[]{Integer.valueOf(i2)});
                break;
            case 18:
            case 20:
            case 22:
                Object[] objArr = new Object[1];
                if (i2 <= 0) {
                    String valueOf = String.valueOf(b(q[0]));
                    str = valueOf.length() == 0 ? new String("interval < ") : "interval < ".concat(valueOf);
                } else {
                    long[] jArr = q;
                    if (i2 >= jArr.length) {
                        str = String.valueOf(b(jArr[jArr.length - 1])).concat(" <= interval");
                    } else {
                        String b = b(jArr[i2 - 1]);
                        String b2 = b(q[i2]);
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 15 + String.valueOf(b2).length());
                        sb.append(b);
                        sb.append(" <= interval < ");
                        sb.append(b2);
                        str = sb.toString();
                    }
                }
                objArr[0] = str;
                str2 = String.format(str2, objArr);
                break;
            case 24:
            case 25:
            case 28:
                str2 = String.format(str2, new Object[]{this.l.a(i2)});
                break;
            case 26:
                if (i2 != 1) {
                    if (i2 == 2) {
                        str2 = String.format(str2, new Object[]{"location still"});
                        break;
                    } else {
                        str2 = String.format(str2, new Object[]{"unknown"});
                        break;
                    }
                } else {
                    str2 = String.format(str2, new Object[]{"AR still"});
                    break;
                }
            case 27:
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                str2 = String.format(str2, new Object[]{"GPS speed"});
                                break;
                            } else {
                                str2 = String.format(str2, new Object[]{"unknown"});
                                break;
                            }
                        } else {
                            str2 = String.format(str2, new Object[]{"SMD"});
                            break;
                        }
                    } else {
                        str2 = String.format(str2, new Object[]{"AR walking"});
                        break;
                    }
                } else {
                    str2 = String.format(str2, new Object[]{"AR vehicle"});
                    break;
                }
            case 34:
                str2 = String.format(str2, new Object[]{this.m.a(i2)});
                break;
        }
        String a = ajqm.a(j2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(str2).length());
        sb2.append(a);
        sb2.append(": ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final void b(boolean z) {
        a(!z ? 5 : 4);
    }

    public final void a() {
        super.a();
        this.j.a();
        this.k.a();
        this.l.a();
    }

    public final void a(boolean z) {
        a(!z ? 3 : 2);
    }

    public final void a(boolean z, List list) {
        a(!z ? 32 : 33, this.k.a((Object) list));
    }
}
