package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.WorkSource;
import java.util.Locale;

/* renamed from: aiym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiym {
    public static final short[] b = {250, 500, 1000, 2000, 4000, 8000};
    private long a = -1;
    final acrz c;
    public final String d;
    final short[] e;

    public aiym(Context context, boolean z, String str, short[] sArr) {
        String str2;
        if (!str.toLowerCase(Locale.ENGLISH).contains("collector")) {
            str2 = "NlpWakeLock";
        } else {
            str2 = "NlpCollectorWakeLock";
        }
        acrz acrz = new acrz(context, str2, str);
        this.c = acrz;
        if (!z) {
            acrz.a(false);
        }
        this.d = str;
        this.e = sArr;
    }

    public final long a(long j) {
        synchronized (aiyo.a) {
            long j2 = this.a;
            if (j2 == -1) {
                return -1;
            }
            long j3 = j - j2;
            return j3;
        }
    }

    public final boolean b() {
        return this.c.e();
    }

    public void a() {
        aiyo aiyo = aiyo.a;
        synchronized (aiyo) {
            if (b()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.c.c();
                if (!b() && this.a != -1) {
                    long a2 = a(elapsedRealtime);
                    aiyo.b.remove(this);
                    String str = this.d;
                    aiyn aiyn = (aiyn) aiyo.c.get(str);
                    if (aiyn == null) {
                        aiyn = new aiyn(aiyo, this);
                        aiyo.c.put(str, aiyn);
                    }
                    short[] sArr = aiyn.c;
                    aiyn.a += a2;
                    aiyn.b++;
                    int i = 0;
                    boolean z = false;
                    while (true) {
                        int length = sArr.length;
                        if (i < length) {
                            if (z) {
                                break;
                            }
                            if (a2 < ((long) sArr[i])) {
                                int[] iArr = aiyn.d;
                                iArr[i] = iArr[i] + 1;
                                z = true;
                            }
                            i++;
                        } else if (!z) {
                            int[] iArr2 = aiyn.d;
                            iArr2[length] = iArr2[length] + 1;
                        }
                    }
                    this.a = -1;
                }
            }
        }
    }

    public void a(long j, aizx aizx) {
        WorkSource a2;
        if ((aizx instanceof ajrb) && (a2 = ((ajrb) aizx).a()) != null) {
            this.c.c(a2);
        }
        this.c.a(j);
        aiyo aiyo = aiyo.a;
        synchronized (aiyo) {
            if (this.a == -1) {
                this.a = SystemClock.elapsedRealtime();
                if (aiyo.d == -1) {
                    aiyo.d = SystemClock.elapsedRealtime();
                }
                aiyo.b.add(this);
            }
        }
    }
}
