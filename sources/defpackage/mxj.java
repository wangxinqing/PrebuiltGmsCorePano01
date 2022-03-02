package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.OfflineReportSendTaskChimeraService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: mxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mxj extends Thread {
    private final Context a;
    private final ErrorReport b;

    public mxj(Context context, ErrorReport errorReport) {
        this.a = context;
        this.b = errorReport;
    }

    public static File a(Context context, auoy auoy) {
        File file = new File(context.getFilesDir(), "reports");
        if (file.exists() || file.mkdirs()) {
            a(file, ((int) axgy.a.a().t()) - 1);
            long currentTimeMillis = System.currentTimeMillis();
            int i = auoy.S;
            if (i == 0) {
                i = aueh.a.a((Object) auoy).a(auoy);
                auoy.S = i;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append(currentTimeMillis);
            sb.append(".");
            sb.append(i);
            String sb2 = sb.toString();
            File file2 = new File(file, String.valueOf(sb2).concat(".tmp"));
            File file3 = new File(file, String.valueOf(sb2).concat(".proto.gz"));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
                auoy.a(gZIPOutputStream);
                gZIPOutputStream.close();
                if (file2.renameTo(file3)) {
                    return file3;
                }
                throw new IOException("failed to rename temporary file");
            } finally {
                file2.delete();
            }
        } else {
            throw new IOException("failed to create reports directory");
        }
    }

    public static auoy b(ErrorReport errorReport, Context context) {
        aucd o = auoy.e.o();
        auot c = c(errorReport, context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auoy auoy = (auoy) o.b;
        c.getClass();
        auoy.b = c;
        auoy.a |= 1;
        aucd o2 = auoz.p.o();
        aucd o3 = auos.n.o();
        String a2 = a(errorReport.e);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos = (auos) o3.b;
        a2.getClass();
        auos.a |= 1;
        auos.b = a2;
        String a3 = a(errorReport.f);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos2 = (auos) o3.b;
        a3.getClass();
        auos2.a |= 2;
        auos2.c = a3;
        String a4 = a(errorReport.g);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos3 = (auos) o3.b;
        a4.getClass();
        auos3.a |= 4;
        auos3.d = a4;
        String a5 = a(errorReport.h);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos4 = (auos) o3.b;
        a5.getClass();
        auos4.a |= 8;
        auos4.e = a5;
        String a6 = a(errorReport.i);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos5 = (auos) o3.b;
        a6.getClass();
        int i = auos5.a | 16;
        auos5.a = i;
        auos5.f = a6;
        int i2 = errorReport.k;
        auos5.a = i | 32;
        auos5.g = i2;
        String a7 = a(errorReport.l);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos6 = (auos) o3.b;
        a7.getClass();
        auos6.a |= 64;
        auos6.h = a7;
        String a8 = a(errorReport.m);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos7 = (auos) o3.b;
        a8.getClass();
        auos7.a |= 128;
        auos7.i = a8;
        String a9 = a(errorReport.n);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos8 = (auos) o3.b;
        a9.getClass();
        auos8.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        auos8.j = a9;
        String a10 = a(errorReport.o);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos9 = (auos) o3.b;
        a10.getClass();
        auos9.a |= 512;
        auos9.k = a10;
        String a11 = a(errorReport.p);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos10 = (auos) o3.b;
        a11.getClass();
        auos10.a |= 1024;
        auos10.l = a11;
        String a12 = a(errorReport.j);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auos auos11 = (auos) o3.b;
        a12.getClass();
        auos11.a |= 2048;
        auos11.m = a12;
        auos auos12 = (auos) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auoz auoz = (auoz) o2.b;
        auos12.getClass();
        auoz.d = auos12;
        auoz.a |= 4;
        if (errorReport.a.packageName != null) {
            aucd o4 = aupa.i.o();
            String str = errorReport.a.packageName;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa = (aupa) o4.b;
            str.getClass();
            aupa.a |= 1;
            aupa.b = str;
            String a13 = a(errorReport.a.processName, "unknown");
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa2 = (aupa) o4.b;
            a13.getClass();
            int i3 = aupa2.a | 4;
            aupa2.a = i3;
            aupa2.d = a13;
            int i4 = errorReport.c;
            aupa2.a = i3 | 8;
            aupa2.e = i4;
            String a14 = a(errorReport.d, "unknown");
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa3 = (aupa) o4.b;
            a14.getClass();
            aupa3.a |= 16;
            aupa3.f = a14;
            boolean z = errorReport.a.systemApp;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa4 = (aupa) o4.b;
            aupa4.a |= 32;
            aupa4.g = z;
            String a15 = a(errorReport.a.installerPackageName, "unknown");
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa5 = (aupa) o4.b;
            a15.getClass();
            aupa5.a |= 2;
            aupa5.c = a15;
            String a16 = a(errorReport.R);
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aupa aupa6 = (aupa) o4.b;
            a16.getClass();
            aupa6.a |= 64;
            aupa6.h = a16;
            aupa aupa7 = (aupa) o4.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auoz auoz2 = (auoz) o2.b;
            aupa7.getClass();
            auoz2.c = aupa7;
            auoz2.a |= 2;
            aucd o5 = aupi.j.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aupi aupi = (aupi) o5.b;
            aupi.a |= 1;
            aupi.b = 0;
            if (axgv.a.a().a()) {
                jix.g(context);
            }
            String[] strArr = errorReport.s;
            if (strArr != null) {
                String join = TextUtils.join("\n", strArr);
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aupi aupi2 = (aupi) o5.b;
                join.getClass();
                aupi2.a |= 4;
                aupi2.d = join;
            }
            String[] strArr2 = errorReport.r;
            if (strArr2 != null) {
                String join2 = TextUtils.join("\n", strArr2);
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aupi aupi3 = (aupi) o5.b;
                join2.getClass();
                aupi3.a |= 2;
                aupi3.c = join2;
            }
            long currentTimeMillis = errorReport.a.time == 0 ? System.currentTimeMillis() : errorReport.a.time;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aupi aupi4 = (aupi) o5.b;
            aupi4.a |= 1;
            aupi4.b = currentTimeMillis;
            String[] strArr3 = errorReport.q;
            if (strArr3 != null) {
                List asList = Arrays.asList(strArr3);
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aupi aupi5 = (aupi) o5.b;
                if (!aupi5.e.a()) {
                    aupi5.e = aucj.a(aupi5.e);
                }
                auab.a((Iterable) asList, (List) aupi5.e);
            }
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aupi aupi6 = (aupi) o5.b;
            aupi6.a |= 16;
            aupi6.g = 201216073;
            try {
                String str2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aupi aupi7 = (aupi) o5.b;
                str2.getClass();
                aupi7.a |= 32;
                aupi7.h = str2;
            } catch (PackageManager.NameNotFoundException e) {
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aupi aupi8 = (aupi) o5.b;
                "20.12.16 (080306-{{cl}})".getClass();
                aupi8.a |= 32;
                aupi8.h = "20.12.16 (080306-{{cl}})";
                Log.e("gF_SaveReportThread", "Unable to get the version name from the package manager for GPS.", e);
            }
            aucd o6 = aupj.g.o();
            int i5 = errorReport.y;
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aupj aupj = (aupj) o6.b;
            int i6 = aupj.a | 1;
            aupj.a = i6;
            aupj.b = i5;
            int i7 = errorReport.z;
            aupj.a = i6 | 4;
            aupj.d = i7;
            String a17 = a(errorReport.A);
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aupj aupj2 = (aupj) o6.b;
            a17.getClass();
            int i8 = aupj2.a | 2;
            aupj2.a = i8;
            aupj2.c = a17;
            int i9 = errorReport.F;
            int i10 = i8 | 8;
            aupj2.a = i10;
            aupj2.e = i9;
            int i11 = errorReport.G;
            aupj2.a = i10 | 16;
            aupj2.f = i11;
            aupj aupj3 = (aupj) o6.i();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aupi aupi9 = (aupi) o5.b;
            aupj3.getClass();
            aupi9.f = aupj3;
            aupi9.a |= 8;
            ansh b2 = jil.b(ModuleManager.get(context));
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aupi aupi10 = (aupi) o5.b;
            b2.getClass();
            aupi10.i = b2;
            aupi10.a |= 64;
            aupi aupi11 = (aupi) o5.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auoz auoz3 = (auoz) o2.b;
            aupi11.getClass();
            auoz3.b = aupi11;
            auoz3.a |= 1;
            if (errorReport.a.crashInfo != null) {
                aucd o7 = auou.i.o();
                String a18 = a(errorReport.a.crashInfo.exceptionClassName);
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou = (auou) o7.b;
                a18.getClass();
                auou.a |= 1;
                auou.b = a18;
                String a19 = a(errorReport.a.crashInfo.throwClassName);
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou2 = (auou) o7.b;
                a19.getClass();
                auou2.a |= 16;
                auou2.f = a19;
                String a20 = a(errorReport.a.crashInfo.throwMethodName);
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou3 = (auou) o7.b;
                a20.getClass();
                auou3.a |= 32;
                auou3.g = a20;
                String a21 = a(errorReport.a.crashInfo.stackTrace);
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou4 = (auou) o7.b;
                a21.getClass();
                auou4.a |= 64;
                auou4.h = a21;
                int i12 = errorReport.a.crashInfo.throwLineNumber;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou5 = (auou) o7.b;
                auou5.a |= 8;
                auou5.e = i12;
                String a22 = a(errorReport.a.crashInfo.throwFileName, "unknown");
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou6 = (auou) o7.b;
                a22.getClass();
                auou6.a |= 4;
                auou6.d = a22;
                String a23 = a(errorReport.a.crashInfo.exceptionMessage);
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auou auou7 = (auou) o7.b;
                a23.getClass();
                auou7.a |= 2;
                auou7.c = a23;
                auou auou8 = (auou) o7.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz4 = (auoz) o2.b;
                auou8.getClass();
                auoz4.e = auou8;
                auoz4.a |= 8;
            } else if (errorReport.a.anrInfo != null) {
                aucd o8 = auoq.f.o();
                String a24 = a(errorReport.a.anrInfo.cause);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                auoq auoq = (auoq) o8.b;
                a24.getClass();
                auoq.a |= 2;
                auoq.c = a24;
                String a25 = a(errorReport.a.anrInfo.info);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                auoq auoq2 = (auoq) o8.b;
                a25.getClass();
                auoq2.a |= 4;
                auoq2.d = a25;
                if (errorReport.a.anrInfo.activity != null) {
                    String str3 = errorReport.a.anrInfo.activity;
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    auoq auoq3 = (auoq) o8.b;
                    str3.getClass();
                    auoq3.a |= 1;
                    auoq3.b = str3;
                }
                String str4 = errorReport.t;
                if (str4 != null) {
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    auoq auoq4 = (auoq) o8.b;
                    str4.getClass();
                    auoq4.a |= 8;
                    auoq4.e = str4;
                }
                auoq auoq5 = (auoq) o8.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz5 = (auoz) o2.b;
                auoq5.getClass();
                auoz5.f = auoq5;
                auoz5.a |= 16;
            } else if (errorReport.a.batteryInfo != null) {
                aucd o9 = auor.f.o();
                int i13 = errorReport.a.batteryInfo.usagePercent;
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                auor auor = (auor) o9.b;
                auor.a |= 1;
                auor.b = i13;
                long j = errorReport.a.batteryInfo.durationMicros;
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                auor auor2 = (auor) o9.b;
                auor2.a |= 2;
                auor2.c = j;
                String a26 = a(errorReport.a.batteryInfo.usageDetails, "unknown");
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                auor auor3 = (auor) o9.b;
                a26.getClass();
                auor3.a |= 4;
                auor3.d = a26;
                String a27 = a(errorReport.a.batteryInfo.checkinDetails, "unknown");
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                auor auor4 = (auor) o9.b;
                a27.getClass();
                auor4.a |= 8;
                auor4.e = a27;
                auor auor5 = (auor) o9.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz6 = (auoz) o2.b;
                auor5.getClass();
                auoz6.g = auor5;
                auoz6.a |= 32;
            } else if (errorReport.a.runningServiceInfo != null) {
                aucd o10 = aupg.d.o();
                long j2 = errorReport.a.runningServiceInfo.durationMillis;
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                aupg aupg = (aupg) o10.b;
                aupg.a |= 1;
                aupg.b = j2;
                String a28 = a(errorReport.a.runningServiceInfo.serviceDetails, "unknown");
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                aupg aupg2 = (aupg) o10.b;
                a28.getClass();
                aupg2.a |= 2;
                aupg2.c = a28;
                aupg aupg3 = (aupg) o10.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz7 = (auoz) o2.b;
                aupg3.getClass();
                auoz7.h = aupg3;
                auoz7.a |= 64;
            }
            if (errorReport.a.type == 11 || !TextUtils.isEmpty(errorReport.P)) {
                aucd o11 = aupk.e.o();
                if (errorReport.u != null) {
                    aucd o12 = auox.e.o();
                    if (o12.c) {
                        o12.c();
                        o12.c = false;
                    }
                    auox auox = (auox) o12.b;
                    "image/jpeg".getClass();
                    int i14 = auox.a | 1;
                    auox.a = i14;
                    auox.b = "image/jpeg";
                    String str5 = errorReport.u;
                    str5.getClass();
                    auox.a = i14 | 2;
                    auox.c = str5;
                    aucd o13 = auov.d.o();
                    float f = (float) errorReport.w;
                    if (o13.c) {
                        o13.c();
                        o13.c = false;
                    }
                    auov auov = (auov) o13.b;
                    int i15 = auov.a | 2;
                    auov.a = i15;
                    auov.c = f;
                    int i16 = errorReport.x;
                    auov.a = i15 | 1;
                    auov.b = (float) i16;
                    if (o12.c) {
                        o12.c();
                        o12.c = false;
                    }
                    auox auox2 = (auox) o12.b;
                    auov auov2 = (auov) o13.i();
                    auov2.getClass();
                    auox2.d = auov2;
                    auox2.a |= 4;
                    if (o11.c) {
                        o11.c();
                        o11.c = false;
                    }
                    aupk aupk = (aupk) o11.b;
                    auox auox3 = (auox) o12.i();
                    auox3.getClass();
                    aupk.b = auox3;
                    aupk.a |= 4;
                    List list = errorReport.ad;
                    if (list != null && list.size() > 0) {
                        for (RectF rectF : (RectF[]) errorReport.ad.toArray(new RectF[errorReport.ad.size()])) {
                            aucd o14 = auow.f.o();
                            float f2 = rectF.top;
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            auow auow = (auow) o14.b;
                            auow.a |= 8;
                            auow.e = f2;
                            float f3 = rectF.left;
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            auow auow2 = (auow) o14.b;
                            auow2.a |= 2;
                            auow2.c = f3;
                            float f4 = rectF.right;
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            auow auow3 = (auow) o14.b;
                            auow3.a |= 4;
                            auow3.d = f4;
                            float f5 = rectF.bottom;
                            if (o14.c) {
                                o14.c();
                                o14.c = false;
                            }
                            auow auow4 = (auow) o14.b;
                            auow4.a |= 1;
                            auow4.b = f5;
                            if (o11.c) {
                                o11.c();
                                o11.c = false;
                            }
                            aupk aupk2 = (aupk) o11.b;
                            auow auow5 = (auow) o14.i();
                            auow5.getClass();
                            if (!aupk2.d.a()) {
                                aupk2.d = aucj.a(aupk2.d);
                            }
                            aupk2.d.add(auow5);
                        }
                    }
                }
                if (!TextUtils.isEmpty(errorReport.P)) {
                    String str6 = errorReport.P;
                    if (o11.c) {
                        o11.c();
                        o11.c = false;
                    }
                    aupk aupk3 = (aupk) o11.b;
                    str6.getClass();
                    aupk3.a |= 16;
                    aupk3.c = str6;
                }
                aupk aupk4 = (aupk) o11.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz8 = (auoz) o2.b;
                aupk4.getClass();
                auoz8.i = aupk4;
                auoz8.a |= 128;
            }
            boolean z2 = errorReport.E;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auoz auoz9 = (auoz) o2.b;
            int i17 = auoz9.a | 1024;
            auoz9.a = i17;
            auoz9.j = z2;
            boolean z3 = errorReport.H;
            int i18 = i17 | 2048;
            auoz9.a = i18;
            auoz9.k = z3;
            boolean z4 = errorReport.ab;
            auoz9.a = i18 | FragmentTransaction.TRANSIT_EXIT_MASK;
            auoz9.m = z4;
            if (!TextUtils.isEmpty(errorReport.ag)) {
                String str7 = errorReport.ag;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz10 = (auoz) o2.b;
                str7.getClass();
                auoz10.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                auoz10.l = str7;
            }
            Bundle bundle = errorReport.ac;
            if (bundle != null && bundle.size() > 0) {
                for (String str8 : (String[]) errorReport.ac.keySet().toArray(new String[errorReport.ac.size()])) {
                    aucd o15 = auph.d.o();
                    if (o15.c) {
                        o15.c();
                        o15.c = false;
                    }
                    auph auph = (auph) o15.b;
                    str8.getClass();
                    auph.a |= 1;
                    auph.b = str8;
                    long j3 = errorReport.ac.getLong(str8);
                    if (o15.c) {
                        o15.c();
                        o15.c = false;
                    }
                    auph auph2 = (auph) o15.b;
                    auph2.a |= 4;
                    auph2.c = j3;
                    auph auph3 = (auph) o15.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    auoz auoz11 = (auoz) o2.b;
                    auph3.getClass();
                    if (!auoz11.n.a()) {
                        auoz11.n = aucj.a(auoz11.n);
                    }
                    auoz11.n.add(auph3);
                }
            }
            if (ofq.a(axhe.b()) && !(errorReport.ah == null && errorReport.ai == 0)) {
                aucd o16 = aupd.d.o();
                List list2 = errorReport.ah;
                if (list2 == null) {
                    int i19 = errorReport.ai;
                    if (i19 != 0) {
                        int a29 = aupc.a(i19);
                        if (o16.c) {
                            o16.c();
                            o16.c = false;
                        }
                        aupd aupd = (aupd) o16.b;
                        int i20 = a29 - 1;
                        if (a29 != 0) {
                            aupd.c = i20;
                            aupd.a |= 1;
                        } else {
                            throw null;
                        }
                    }
                } else {
                    if (o16.c) {
                        o16.c();
                        o16.c = false;
                    }
                    aupd aupd2 = (aupd) o16.b;
                    if (!aupd2.b.a()) {
                        aupd2.b = aucj.a(aupd2.b);
                    }
                    auab.a((Iterable) list2, (List) aupd2.b);
                }
                aupd aupd3 = (aupd) o16.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auoz auoz12 = (auoz) o2.b;
                aupd3.getClass();
                auoz12.o = aupd3;
                auoz12.a |= 16384;
            }
            auoz auoz13 = (auoz) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auoy auoy2 = (auoy) o.b;
            auoz13.getClass();
            auoy2.c = auoz13;
            auoy2.a |= 2;
            int i21 = errorReport.a.type;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auoy auoy3 = (auoy) o.b;
            auoy3.a |= 4;
            auoy3.d = i21;
            auoy auoy4 = (auoy) o.i();
            if (!TextUtils.isEmpty(errorReport.T) && !"GoogleHelp".equals(errorReport.X)) {
                ofx.a(context.getFilesDir(), errorReport.T, ".bmp");
            }
            return auoy4;
        }
        throw new mxd(errorReport.i, errorReport.b);
    }

    static auot c(ErrorReport errorReport, Context context) {
        aucd o = auot.h.o();
        String trim = a(errorReport.C).trim();
        if (!trim.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auot auot = (auot) o.b;
            trim.getClass();
            auot.a |= 2;
            auot.c = trim;
        }
        String trim2 = a(errorReport.b).trim();
        if (!trim2.isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auot auot2 = (auot) o.b;
            trim2.getClass();
            auot2.a |= 1;
            auot2.b = trim2;
        }
        if (!TextUtils.isEmpty(errorReport.ag)) {
            String str = errorReport.ag;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auot auot3 = (auot) o.b;
            str.getClass();
            auot3.a |= 16;
            auot3.g = str;
        }
        if (!TextUtils.isEmpty(errorReport.B)) {
            String str2 = errorReport.B;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auot auot4 = (auot) o.b;
            str2.getClass();
            auot4.a |= 4;
            auot4.d = str2;
        }
        Bundle bundle = errorReport.D;
        if (bundle != null && bundle.size() > 0) {
            for (String str3 : (String[]) errorReport.D.keySet().toArray(new String[errorReport.D.size()])) {
                aucd o2 = aupf.d.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aupf aupf = (aupf) o2.b;
                str3.getClass();
                aupf.a |= 1;
                aupf.b = str3;
                String a2 = a(errorReport.D.getString(str3));
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aupf aupf2 = (aupf) o2.b;
                a2.getClass();
                aupf2.a |= 2;
                aupf2.c = a2;
                aupf aupf3 = (aupf) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                auot auot5 = (auot) o.b;
                aupf3.getClass();
                if (!auot5.f.a()) {
                    auot5.f = aucj.a(auot5.f);
                }
                auot5.f.add(aupf3);
            }
        }
        String[] strArr = errorReport.V;
        if (strArr != null && strArr.length > 0) {
            boolean z = !"GoogleHelp".equals(errorReport.X);
            for (String str4 : errorReport.V) {
                try {
                    File file = new File(new File(context.getFilesDir().getPath(), "reports"), String.valueOf(str4).concat(".txt"));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    jjt.a(new FileInputStream(file), new GZIPOutputStream(byteArrayOutputStream), true);
                    if (z) {
                        file.delete();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    String concat = String.valueOf(str4).concat(".gz");
                    aucd o3 = aupe.e.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aupe aupe = (aupe) o3.b;
                    concat.getClass();
                    int i = aupe.a | 1;
                    aupe.a = i;
                    aupe.b = concat;
                    "application/gzip".getClass();
                    aupe.a = i | 2;
                    aupe.c = "application/gzip";
                    auay a3 = auay.a(byteArray);
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aupe aupe2 = (aupe) o3.b;
                    a3.getClass();
                    aupe2.a |= 4;
                    aupe2.d = a3;
                    aupe aupe3 = (aupe) o3.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    auot auot6 = (auot) o.b;
                    aupe3.getClass();
                    if (!auot6.e.a()) {
                        auot6.e = aucj.a(auot6.e);
                    }
                    auot6.e.add(aupe3);
                } catch (Exception e) {
                    String valueOf = String.valueOf(str4);
                    Log.w("gF_SaveReportThread", valueOf.length() == 0 ? new String("Could not read file at ") : "Could not read file at ".concat(valueOf));
                    apev.a(e);
                }
            }
        }
        return (auot) o.i();
    }

    public final void run() {
        try {
            a(this.a, b(this.b, this.a));
            OfflineReportSendTaskChimeraService.a(this.a);
        } catch (IOException e) {
            Log.w("gF_SaveReportThread", "failed to write bug report", e);
        } catch (IllegalArgumentException | mxd e2) {
            Log.e("gF_SaveReportThread", "invalid report", e2);
        }
    }

    private static String a(String str) {
        return a(str, "");
    }

    static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2) ? "" : str2;
        }
        return str;
    }

    public static void a(ErrorReport errorReport, Context context) {
        if (errorReport != null && !errorReport.E && !errorReport.ab) {
            new qvr(Looper.getMainLooper()).post(new mxh(context));
        }
    }

    static synchronized void a(File file, int i) {
        int length;
        synchronized (mxj.class) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && (length = listFiles.length - i) > 0) {
                Arrays.sort(listFiles);
                for (int i2 = 0; i2 < length; i2++) {
                    listFiles[i2].delete();
                }
            }
        }
    }
}
