package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.List;

/* renamed from: akkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkb implements akld {
    final /* synthetic */ akke a;
    private final akln b;
    private final Collection c;
    private final akkl d;

    public akkb(akke akke, akln akln, Collection collection, akkl akkl) {
        this.a = akke;
        this.b = akln;
        this.c = collection;
        this.d = akkl;
    }

    public final void a(Collection collection, long[] jArr) {
        int i;
        int i2;
        String str;
        if (this.a.j != null) {
            int length = jArr.length;
            if (length > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.a.g[0] + akuo.b() >= elapsedRealtime) {
                    this.a.h.f++;
                    i2 = 4;
                } else if (azcf.a.a().K()) {
                    akkl akkl = this.d;
                    if (akkl.b) {
                        if (akkl.a != 4) {
                            i2 = 6;
                        } else {
                            i2 = 5;
                        }
                        this.a.h.g++;
                    } else {
                        i2 = 2;
                    }
                } else if (this.b.a.g >= ((float) azcf.a.a().d())) {
                    this.a.h.h++;
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                if (i2 == 2) {
                    aklz.a();
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Scheduling a download of missing cells: ");
                    sb.append(length);
                    sb.toString();
                    List a2 = aklw.a(this.b.a, (int) azcf.a.a().r());
                    akke akke = this.a;
                    akke.b.a((Collection) a2, (akld) new akkc(akke));
                    long[] jArr2 = this.a.g;
                    jArr2[0] = jArr2[1];
                    jArr2[1] = elapsedRealtime;
                } else {
                    aklz.a();
                    int i3 = i2 - 1;
                    if (i3 != 2) {
                        str = i3 != 3 ? i3 != 4 ? "User is in transit." : "On-the-go probability too high." : "Too soon since last downloads.";
                    } else {
                        str = "GPS speed is too high.";
                    }
                    float f = this.b.a.g;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 144);
                    sb2.append("Not scheduling a download of missing data because: ");
                    sb2.append(str);
                    sb2.append(" Missing cells: ");
                    sb2.append(length);
                    sb2.append(", speed ");
                    sb2.append(f);
                    sb2.append(",transitDecision confidence ");
                    sb2.append(1.0f);
                    sb2.toString();
                }
                i = i2;
            } else {
                aklz.a();
                i = 1;
            }
            int size = this.c.size();
            float f2 = (((float) length) * 100.0f) / ((float) size);
            float f3 = 100.0f - f2;
            aklz.a();
            StringBuilder sb3 = new StringBuilder(68);
            sb3.append("Inference data available: percentage of area covered ");
            sb3.append(f3);
            sb3.toString();
            if (f3 > ((float) ((int) azcf.a.a().g()))) {
                akke akke2 = this.a;
                akke2.b.a(collection, (akle) new akkd(akke2, this.b, this.c, length, i));
                if (i == 2) {
                    this.a.h.d++;
                    return;
                }
                this.a.h.c++;
                return;
            }
            akka akka = this.a.j;
            if (akka != null) {
                int i4 = (int) f2;
                akln akln = this.b;
                if (akka.a != null) {
                    akof a3 = aklz.a();
                    StringBuilder sb4 = new StringBuilder(62);
                    sb4.append("Too few candidate results: percentageOfMissingArea ");
                    sb4.append(i4);
                    a3.a(sb4.toString());
                    akjy akjy = (akjy) akka.a;
                    if (akjy.d) {
                        akjy.e.a(akln.f);
                        for (akje a4 : akjy.c.values()) {
                            a4.a(akln.f);
                        }
                    }
                } else {
                    aklz.a();
                }
                akke.a(this.a);
            }
            aklz.a();
            akma akma = this.a.c;
            aucd o = aobb.h.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aobb aobb = (aobb) o.b;
            int i5 = aobb.a | 2;
            aobb.a = i5;
            aobb.c = size;
            int i6 = 4 | i5;
            aobb.a = i6;
            aobb.d = length;
            int i7 = i6 | 16;
            aobb.a = i7;
            aobb.f = true;
            aobb.g = i - 1;
            aobb.a = i7 | 32;
            akun akun = (akun) akma;
            akun.a(akun.a((aobb) o.i()));
            if (i != 2) {
                this.a.h.a++;
                return;
            }
            this.a.h.b++;
            return;
        }
        aklz.a().b("L1 data loaded while InferenceDataManager stopped - ignoring");
    }
}
