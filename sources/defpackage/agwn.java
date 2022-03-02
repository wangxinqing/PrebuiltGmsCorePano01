package defpackage;

import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: agwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwn implements acvp {
    private final agwo a;

    public agwn(agwo agwo) {
        this.a = agwo;
    }

    public final void a(acwa acwa) {
        String str;
        FileOutputStream fileOutputStream;
        Throwable th;
        agwo agwo = this.a;
        if (!acwa.b()) {
            Log.e("FileFlagSource", "Could not read flags from Phenotype API, not performing optimistic update");
            return;
        }
        Configurations configurations = (Configurations) acwa.d();
        if (configurations != null && (str = configurations.a) != null && !str.isEmpty()) {
            aucd o = agxe.g.o();
            Configuration[] configurationArr = configurations.d;
            boolean z = false;
            if (configurationArr != null) {
                int length = configurationArr.length;
                int i = 0;
                while (i < length) {
                    Flag[] flagArr = configurationArr[i].b;
                    if (flagArr != null) {
                        int length2 = flagArr.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            Flag flag = flagArr[i2];
                            aucd o2 = agxf.e.o();
                            String str2 = flag.a;
                            if (o2.c) {
                                o2.c();
                                o2.c = z;
                            }
                            agxf agxf = (agxf) o2.b;
                            str2.getClass();
                            agxf.a |= 1;
                            agxf.d = str2;
                            int i3 = flag.g;
                            if (i3 == 1) {
                                long a2 = flag.a();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                agxf agxf2 = (agxf) o2.b;
                                agxf2.b = 2;
                                agxf2.c = Long.valueOf(a2);
                            } else if (i3 == 2) {
                                boolean b = flag.b();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                agxf agxf3 = (agxf) o2.b;
                                agxf3.b = 3;
                                agxf3.c = Boolean.valueOf(b);
                            } else if (i3 == 3) {
                                double c = flag.c();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                agxf agxf4 = (agxf) o2.b;
                                agxf4.b = 4;
                                agxf4.c = Double.valueOf(c);
                            } else if (i3 == 4) {
                                String d = flag.d();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                agxf agxf5 = (agxf) o2.b;
                                d.getClass();
                                agxf5.b = 5;
                                agxf5.c = d;
                            } else if (i3 == 5) {
                                auay a3 = auay.a(flag.e());
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                agxf agxf6 = (agxf) o2.b;
                                a3.getClass();
                                agxf6.b = 6;
                                agxf6.c = a3;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Impossible flag value type: ");
                                sb.append(i3);
                                throw new AssertionError(sb.toString());
                            }
                            o.i(o2);
                            i2++;
                            z = false;
                        }
                        continue;
                    }
                    i++;
                    z = false;
                }
            }
            String str3 = configurations.c;
            if (str3 != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                agxe agxe = (agxe) o.b;
                str3.getClass();
                agxe.a |= 4;
                agxe.d = str3;
            }
            String str4 = configurations.a;
            if (str4 != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                agxe agxe2 = (agxe) o.b;
                str4.getClass();
                agxe2.a |= 1;
                agxe2.b = str4;
            }
            long j = configurations.g;
            if (o.c) {
                o.c();
                o.c = false;
            }
            agxe agxe3 = (agxe) o.b;
            agxe3.a |= 8;
            agxe3.e = j;
            byte[] bArr = configurations.b;
            if (bArr != null) {
                auay a4 = auay.a(bArr);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                agxe agxe4 = (agxe) o.b;
                a4.getClass();
                agxe4.a |= 2;
                agxe4.c = a4;
            }
            agxe agxe5 = (agxe) o.i();
            try {
                fileOutputStream = new FileOutputStream(agwo.b());
                agxe5.a(fileOutputStream);
                fileOutputStream.close();
                if (!agwo.d.a(agwo.a(agxe5))) {
                    agwz.a(agwo.b.a());
                    return;
                }
                return;
            } catch (IOException e) {
                Log.e("FileFlagSource", "Could not write Phenotype flags to local storage: ", e);
                return;
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
