package defpackage;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.Locale;
import java.util.Random;

/* renamed from: nkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nkl implements amlc {
    private int a = 0;
    private int b = 0;
    private final njh c;
    private final njh d;

    public nkl(Random random) {
        this.c = new njh(random, 14400000);
        this.d = new njh(random, 14400000);
    }

    private static final amkp a(amln amln) {
        aucx aucx = amln.d;
        int size = aucx.size();
        int i = 0;
        while (i < size) {
            amkp amkp = (amkp) aucx.get(i);
            i++;
            if (amkp.d == -1) {
                return amkp;
            }
        }
        return null;
    }

    private static final String b(amln amln) {
        amkp a2 = a(amln);
        return a2 != null ? a2.b : "UNKNOWN";
    }

    public final synchronized void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static String a(amks amks) {
        String str;
        String str2 = null;
        if (amks.b()) {
            amri amri = ((njx) amks.a()).b;
            if (amri.a() && (((barb) amri.b()).a & 32) != 0) {
                nih nih = ((barb) amri.b()).b;
                if (nih == null) {
                    nih = nih.f;
                }
                if ((nih.a & 1) != 0) {
                    nig nig = nih.b;
                    if (nig == null) {
                        nig = nig.g;
                    }
                    if ((nig.a & 1) != 0) {
                        str = nig.b;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                nii nii = nih.d;
                if (nii == null) {
                    nii = nii.d;
                }
                if ((nii.a & 1) != 0) {
                    str2 = nii.b;
                }
                return String.format("module=%s, caller=%s", new Object[]{str2, str});
            }
        }
        str = null;
        return String.format("module=%s, caller=%s", new Object[]{str2, str});
    }

    public final synchronized void a(amln amln, SparseArray sparseArray) {
        String str;
        if (this.a <= 0) {
            if (this.b <= 0) {
                return;
            }
        }
        aucx aucx = amln.d;
        int size = aucx.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((amkp) aucx.get(i2)).g;
        }
        String b2 = b(amln);
        int a2 = this.c.a(b2, amln.f, 1);
        int a3 = this.d.a(b2, amln.f, i);
        if (a2 < this.b) {
            if (a3 < this.a) {
                return;
            }
        }
        this.c.a(b2);
        this.d.a(b2);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(a2);
        objArr[1] = Integer.valueOf(a3);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        long j = amln.f;
        Locale locale = Locale.US;
        Object[] objArr2 = new Object[3];
        objArr2[0] = b(amln);
        amkp a4 = a(amln);
        if (a4 != null) {
            amkv amkv = (amkv) sparseArray.get(a4.c);
            str = amkv != null ? a(amkv.a(ammb.a, amkv, amlw.a)) : "<no context>";
        } else {
            str = "<no root>";
        }
        objArr2[1] = str;
        objArr2[2] = Long.valueOf((elapsedRealtime - j) / 1000);
        sb.append(String.format(locale, "%s, %s, age: %ds, spans:", objArr2));
        aucx aucx2 = amln.d;
        int size2 = aucx2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            amkp amkp = (amkp) aucx2.get(i3);
            int i4 = amkp.g;
            int i5 = (int) amkp.f;
            if (i4 < 3) {
                if (i5 < 3) {
                }
            }
            sb.append(String.format(Locale.US, " (%s: %dms CPU, %dms real)", new Object[]{amkp.b, Integer.valueOf(i4), Integer.valueOf(i5)}));
        }
        objArr[2] = sb.toString();
        Log.e("GmsTraceAlert", String.format("%d traces used %dms CPU. Sample: %s", objArr));
    }
}
