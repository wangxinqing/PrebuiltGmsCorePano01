package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.ads.afma.proto2api.c;
import com.google.android.ads.tasks.a;
import com.google.android.ads.tasks.b;
import com.google.android.ads.tasks.d;
import com.google.android.ads.tasks.e;
import com.google.android.ads.tasks.f;
import com.google.android.ads.tasks.h;
import com.google.android.ads.tasks.i;
import com.google.android.ads.tasks.j;
import com.google.android.ads.tasks.k;
import com.google.android.ads.tasks.l;
import com.google.android.ads.tasks.m;
import com.google.android.ads.tasks.o;
import com.google.android.ads.tasks.p;
import com.google.android.ads.tasks.q;
import com.google.android.ads.tasks.r;
import com.google.android.ads.tasks.s;
import com.google.android.gms.ads.internal.config.n;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bgq extends bgn {
    public static bgk b = null;
    public static ExecutorService c = null;
    public static nnt d = null;
    protected static final Object e = new Object();
    static boolean f = false;
    private static long h = 0;
    public final String g;

    static {
        bgq.class.getSimpleName();
    }

    protected bgq(Context context, String str) {
        super(context);
        this.g = str;
    }

    public static synchronized void a(Context context) {
        synchronized (bgq.class) {
            if (!f) {
                h = System.currentTimeMillis() / 1000;
                bgn.a = b(context);
                f = true;
            }
        }
    }

    public static bhm b(Context context) {
        File cacheDir;
        File file;
        if (bgn.a == null) {
            synchronized (e) {
                if (bgn.a == null) {
                    bhm bhm = new bhm(context);
                    try {
                        bhm.b = Executors.newCachedThreadPool(new bhi());
                        bhm.g = true;
                        bhm.h = bhm.b.submit(new bhj(bhm));
                        bhm.b.execute(new bhl(bhm));
                        try {
                            hxk hxk = hxk.d;
                            bhm.m = hxz.j(bhm.a) > 0;
                            bhm.n = hxk.b(bhm.a) == 0;
                        } catch (Throwable th) {
                        }
                        bhm.a(0);
                        if (bho.a()) {
                            if (((Boolean) n.j.a()).booleanValue()) {
                                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                            }
                        }
                        bhm.d = new bgt();
                        byte[] a = bfr.a("9kMk5n2VSkF1SNXPfFK+bbRbaMIZXvgt5dwubhoIDi8=", false);
                        if (a.length == 32) {
                            byte[] bArr = new byte[16];
                            ByteBuffer.wrap(a, 4, 16).get(bArr);
                            for (int i = 0; i < 16; i++) {
                                bArr[i] = (byte) (bArr[i] ^ 68);
                            }
                            bhm.e = bArr;
                            try {
                                cacheDir = bhm.a.getCacheDir();
                                if (cacheDir == null) {
                                    cacheDir = bhm.a.getDir("dex", 0);
                                    if (cacheDir == null) {
                                        throw new bhe();
                                    }
                                }
                                file = new File(String.format("%s/%s.jar", new Object[]{cacheDir, "1583436603343"}));
                                if (!file.exists()) {
                                    byte[] a2 = bgt.a(bhm.e, "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");
                                    file.createNewFile();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    fileOutputStream.write(a2, 0, a2.length);
                                    fileOutputStream.close();
                                }
                                bhm.b(cacheDir, "1583436603343");
                                bhm.c = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), (String) null, bhm.a.getClassLoader());
                                bhm.a(file);
                                bhm.a(cacheDir, "1583436603343");
                                bhm.a(String.format("%s/%s.dex", new Object[]{cacheDir, "1583436603343"}));
                                bhm.l = new bgm(bhm);
                                bhm.o = true;
                                if (bhm.o) {
                                    try {
                                        if (((Boolean) n.g.a()).booleanValue()) {
                                            bhm.a("4qyeHVLdR2BpVZ/9MkK6HNeJRuvdZpok2ml+qCM18QEPJAStXXleeDElqkUhV/8Z", "GU2WP8XtllQhiTSD7/T7mgvNQQ8dfZxwOUN2ptkRE5g=", new Class[0]);
                                        }
                                    } catch (IllegalStateException e2) {
                                    }
                                    bhm.a("HTVfuTZB/oxuZhdJUN7AuWr9en73MM+d9FEd1etLbXmZzANRMfXYbOTacA0uH2zu", "2s8nOMXCn5X7K8/JhSyR9TgWJLPza6EcW44ESpzwNPg=", Context.class);
                                    bhm.a("GImTE8RQoKElWffJzPyzhZOO1nlsvi3a8XYeGKp5cHK3YdB/kUrIFPvi5By3sRH0", "cR8GSWax89kdMseZeSzcvyrdFN4dMhef3G2wwiBQ1Gg=", Context.class);
                                    bhm.a("Bqj8AaUs+XXUQ/fJg9TSbSr7wHuoQ2Mr1YRrNmoUU9Kop+NuUfMNvq+DiLZWJunC", "6roE7m8yyl4WIFFmY2P1k50TsUKjgeEBduKEiMaglzg=", Context.class);
                                    bhm.a("zIhc3VOaS0iJjkras7etdFBYTTD0+RjMk/bIk9zW4gx5elfZ1CzfO3Sx220W3HSm", "4/ojDNrJd1IIw1U2Cw8OvBMxBGPeYz2mCYRWxBjjhgk=", Context.class);
                                    bhm.a("H1pNyi2v7oMk7ZTKWkUa1zsUe9NqOjSLl3hL4XBuZplSwxNut0kQX/lL5WgpQUUE", "8yXQPDS3Zhea+0P4TRWXj+RTGIuNnZbOSL6XS+NRSos=", Context.class);
                                    bhm.a("JgpzYyEkNRxbQ1XDaYXFbbYaqOmeXn0Eu+lWKldqFNVaVEymR62LxEYnz5dsY7Zt", "kETkDoDd3cGRZNowxs3HvLutbetsIO/NDzR3ktumT/E=", Context.class, Boolean.TYPE);
                                    bhm.a("KARH7PNAKJnhQhkb3hh7A2Hsr/Ffg+iY817ZbP4DQGvv91cYsdgmk8oyPMaNmNmH", "kT4zt3wtUzbzDbDvrwaF7aUvElNpTUsIiw2wEHl6BYk=", Context.class);
                                    bhm.a("fM1hHcsN+wpe9qkm+cKIAnV0vT2yNEfP9qlagtSAsHcx2fL19R9YqI6+7czpiaSu", "HpHXItY+bFA7nOKKcsqcE9lzKi53PeBBHwGBoL4HhB0=", Context.class);
                                    bhm.a("UYsSdMof6S+J6Bzf/cTdPqksr+BmiWr13BkzOK3Bu9Iney6J4NVS8eXVjGKqClDc", "PmNW2ELyXCmhbc9wG3Jqpz2+f7mchTqEFHhHaZ/tC2E=", MotionEvent.class, DisplayMetrics.class);
                                    bhm.a("NID/EOgFyVVzkLE9YBStGo/hBSgPvAE2wA6ITMHkx4j2CDioL3utuQxcD0b3p/68", "nowzAKraGY9odYDBPfZs/IQZoSBRfdsuOKkPVZoCnas=", MotionEvent.class, DisplayMetrics.class);
                                    bhm.a("OiqFnYACF+e8mXBdTPpn7mXxebRXY7n0h13dQ2BfpLnMU9gMSpoyb0AUskL+MdWd", "hKpT2oGIsms3RuhYSlv39WgS4F2I+5QxGkb1S7faZEg=", new Class[0]);
                                    bhm.a("bbSz6G7VSZbKUTVPColqMAJJ3U77KfwHkQfG2pb7dRN4MrR15D0uvbtkqx6B7o0I", "syXS0rsAmjjVtaBgg7YySByLVdQ/CSyURLxOOOp00hI=", new Class[0]);
                                    bhm.a("5qZjM5cdXA211ZsZl//6SITqHcTkOUj/0TjwkmAsT7QB9WIz9EVC7rmjaEZuSUdo", "/0Xi6V0lHBquQn7poTeaF6Cz28dbEBisQy4CYgTRCiw=", new Class[0]);
                                    bhm.a("4NlNDXh0vhplX1pxtRJNuDaRFyRXRIYAfUAgt3LhWX+qlMUWPVY6qPUWNzICmUf9", "GKZbJy8L8mTtgil8lqcm6pQKxf7+uOsP11sBPj3/KRM=", new Class[0]);
                                    bhm.a("Q95BMiTavmgEZeQ9UAsCrCvPUQ6S15gCGiZva0sLzpUyxZwO5Zgc8w+umxl6P9Uz", "GXtEzm7BCApWdSNDqdi3oVIgtnPxwG/Jp8ThLUrxkZk=", new Class[0]);
                                    bhm.a("f2bUv3pdDVFYurKwkHQ3ebVtCP2MqFaVjILpowX0YwY4p5M3Pu4Cwy79d60SOxQT", "ari3DifUgqsBHSkmhZw7diugUGM0XTWCTqRLKMOp1aY=", new Class[0]);
                                    bhm.a("7WdUv5r1xtnlzOnbnvzYE0OJ2W+G3lTC5xO3YVjQSvitT1dV/7IttlZEOUgLqnIA", "3CzXZuXbsqJcOB6ad3TYrHaBfIcfUrYufubM9/PCPds=", Context.class, Boolean.TYPE, Boolean.TYPE);
                                    bhm.a("uHHQbnZ/cKVyCEkkj2qgt4PDPDHj06KJpQIwjlv6EG1d2r3RN/VN3CAEZR1lrnNg", "38RH0g4D3I7xf5tLo8Q74wYLHpqj3K0f03Fxiv4JNMw=", StackTraceElement[].class);
                                    bhm.a("X4BphaxvlNRGUUI3fkGxAYMrJm8qjR1wnpXonWh43jhcZ67fKFqESXeJwlXp1DNP", "DSwpdXPApjSfkaruGDI9tFd2Cz4JQqHNa58qFqYaSN8=", View.class, DisplayMetrics.class, Boolean.TYPE);
                                    bhm.a("RWGql8WLEWXb63/89qRHlaw8dpZ0+zjUqlCxg+la48OoGQbM7USaDz72z5IYSUq7", "VZArCAfGcgAbMNsn5rZNpmIGkU1TobspLvxs6iQ/zTI=", Context.class, Boolean.TYPE);
                                    bhm.a("0W0UcJSppVWn08KzIUJbfZC3ZcUHYJSp3cSyZTE9xUSMJQndmv5rE6ZaEJL5dZ3N", "5buoe/gQM9ZT65noEpXo51oAurPLQwJx4rpPgPHhT0c=", View.class, Activity.class, Boolean.TYPE);
                                    bhm.a("Ir8iMr+S0BDtrpGJZX4wHGKfZpYHIwtrSQRN9lp/a+RRiHL/d2+jU/0uXsAwYL+f", "NEXXD1FDj0kJlgVnF6p3+XOtJr68TMkLlOkKP4kVLpY=", Long.TYPE);
                                    try {
                                        if (((Boolean) n.l.a()).booleanValue()) {
                                            bhm.a("8hoh1KuN1xuWylF1MZUvq7mIp57IBFdZtXUTzHSvyuovsAzAI+9GRaXIDyiuVt93", "Kw8X8M2dFHr9U8GN/nNpnb7xMLMdlscTGfZwWaFJclw=", Context.class);
                                        }
                                    } catch (IllegalStateException e3) {
                                    }
                                    try {
                                        if (((Boolean) n.m.a()).booleanValue()) {
                                            bhm.a("hcI7RIhuk+G3tv/7IL7BwjORzsYzl01y9hruqdkO1qs6uSjs+fbUcQVdE0TtvRmp", "oU/j/zbD28J631lK+1kuFj4WwAs9WUa031OYG6AXs0I=", Context.class);
                                        }
                                    } catch (IllegalStateException e4) {
                                    }
                                    try {
                                        if (((Boolean) n.n.a()).booleanValue()) {
                                            bhm.a("a8ABq7oQr/Ne7SuM3ioNlTJalMOA62VByojZJ6p9u9jYpJ4689hPu00mr/JBTI+A", "Ewtd0Pw/q7UKUD+agXI32J/BPRYCt41tfMibgnRNMGs=", Context.class);
                                        }
                                    } catch (IllegalStateException e5) {
                                    }
                                }
                                bgn.a = bhm;
                            } catch (FileNotFoundException e6) {
                                throw new bhe(e6);
                            } catch (IOException e7) {
                                throw new bhe(e7);
                            } catch (bgs e8) {
                                throw new bhe(e8);
                            } catch (NullPointerException e9) {
                                throw new bhe(e9);
                            } catch (Throwable th2) {
                                bhm.a(file);
                                bhm.a(cacheDir, "1583436603343");
                                bhm.a(String.format("%s/%s.dex", new Object[]{cacheDir, "1583436603343"}));
                                throw th2;
                            }
                        } else {
                            throw new bgs();
                        }
                    } catch (IllegalArgumentException e10) {
                        throw new bgs(e10);
                    } catch (bgs e11) {
                        throw new bhe(e11);
                    } catch (bhe e12) {
                    }
                }
            }
        }
        return bgn.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r12, android.content.Context r13) {
        /*
            java.lang.Class<bgq> r0 = defpackage.bgq.class
            monitor-enter(r0)
            bgk r1 = b     // Catch:{ all -> 0x01a3 }
            if (r1 != 0) goto L_0x01a1
            boolean r1 = a()     // Catch:{ all -> 0x01a3 }
            if (r1 == 0) goto L_0x01a1
            nnu r1 = new nnu     // Catch:{ all -> 0x01a3 }
            r1.<init>()     // Catch:{ all -> 0x01a3 }
            r2 = 0
            r1.a(r2)     // Catch:{ all -> 0x01a3 }
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01a3 }
            r1.c = r4     // Catch:{ all -> 0x01a3 }
            r1.a = r12     // Catch:{ all -> 0x01a3 }
            r1.a(r3)     // Catch:{ all -> 0x01a3 }
            java.lang.String r12 = ""
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x01a3 }
            if (r4 != 0) goto L_0x002a
            java.lang.String r12 = " clientVersion"
        L_0x002a:
            java.lang.Boolean r4 = r1.b     // Catch:{ all -> 0x01a3 }
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = " shouldGetAdvertisingId"
            java.lang.String r12 = r12.concat(r4)     // Catch:{ all -> 0x01a3 }
        L_0x0034:
            java.lang.Boolean r4 = r1.c     // Catch:{ all -> 0x01a3 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01a3 }
            java.lang.String r4 = " isGooglePlayServicesAvailable"
            java.lang.String r12 = r12.concat(r4)     // Catch:{ all -> 0x01a3 }
        L_0x0042:
            boolean r4 = r12.isEmpty()     // Catch:{ all -> 0x01a3 }
            if (r4 != 0) goto L_0x0064
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a3 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x01a3 }
            java.lang.String r1 = "Missing required properties:"
            int r2 = r12.length()     // Catch:{ all -> 0x01a3 }
            if (r2 != 0) goto L_0x005c
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x01a3 }
            r12.<init>(r1)     // Catch:{ all -> 0x01a3 }
            goto L_0x0060
        L_0x005c:
            java.lang.String r12 = r1.concat(r12)     // Catch:{ all -> 0x01a3 }
        L_0x0060:
            r13.<init>(r12)     // Catch:{ all -> 0x01a3 }
            throw r13     // Catch:{ all -> 0x01a3 }
        L_0x0064:
            nny r12 = new nny     // Catch:{ all -> 0x01a3 }
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x01a3 }
            java.lang.Boolean r5 = r1.b     // Catch:{ all -> 0x01a3 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x01a3 }
            java.lang.Boolean r1 = r1.c     // Catch:{ all -> 0x01a3 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01a3 }
            r12.<init>(r4, r5, r1)     // Catch:{ all -> 0x01a3 }
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r3)     // Catch:{ all -> 0x01a3 }
            nnr r4 = new nnr     // Catch:{ all -> 0x01a3 }
            r4.<init>(r13)     // Catch:{ all -> 0x01a3 }
            acwa r4 = defpackage.acws.a((java.util.concurrent.Executor) r1, (java.util.concurrent.Callable) r4)     // Catch:{ all -> 0x01a3 }
            nnt r7 = new nnt     // Catch:{ all -> 0x01a3 }
            r7.<init>(r13, r1, r4)     // Catch:{ all -> 0x01a3 }
            d = r7     // Catch:{ all -> 0x01a3 }
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x01a3 }
            nou r1 = new nou     // Catch:{ all -> 0x01a3 }
            com.google.ads.afma.proto2api.c r4 = defpackage.nos.a     // Catch:{ all -> 0x01a3 }
            com.google.ads.afma.proto2api.c r4 = defpackage.not.a     // Catch:{ all -> 0x01a3 }
            r1.<init>(r13, r10, r7, r12)     // Catch:{ all -> 0x01a3 }
            nnv r4 = r1.c     // Catch:{ all -> 0x01a3 }
            nny r4 = (defpackage.nny) r4     // Catch:{ all -> 0x01a3 }
            boolean r4 = r4.b     // Catch:{ all -> 0x01a3 }
            if (r4 == 0) goto L_0x00ac
            nop r4 = new nop     // Catch:{ all -> 0x01a3 }
            r4.<init>(r1)     // Catch:{ all -> 0x01a3 }
            acwa r4 = r1.a(r4)     // Catch:{ all -> 0x01a3 }
            r1.d = r4     // Catch:{ all -> 0x01a3 }
            goto L_0x00b4
        L_0x00ac:
            com.google.ads.afma.proto2api.c r4 = defpackage.nos.a     // Catch:{ all -> 0x01a3 }
            acwa r4 = defpackage.acws.a((java.lang.Object) r4)     // Catch:{ all -> 0x01a3 }
            r1.d = r4     // Catch:{ all -> 0x01a3 }
        L_0x00b4:
            noq r4 = new noq     // Catch:{ all -> 0x01a3 }
            r4.<init>(r1)     // Catch:{ all -> 0x01a3 }
            acwa r4 = r1.a(r4)     // Catch:{ all -> 0x01a3 }
            r1.e = r4     // Catch:{ all -> 0x01a3 }
            bhf r4 = new bhf     // Catch:{ all -> 0x01a3 }
            r4.<init>(r13)     // Catch:{ all -> 0x01a3 }
            bhr r5 = new bhr     // Catch:{ all -> 0x01a3 }
            r5.<init>(r13, r4)     // Catch:{ all -> 0x01a3 }
            bhg r5 = new bhg     // Catch:{ all -> 0x01a3 }
            r5.<init>(r12, r1, r4)     // Catch:{ all -> 0x01a3 }
            npi r12 = new npi     // Catch:{ all -> 0x01a3 }
            r12.<init>(r13, r7)     // Catch:{ all -> 0x01a3 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x01a3 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x01a3 }
            android.content.Context r6 = r12.a     // Catch:{ all -> 0x01a3 }
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()     // Catch:{ all -> 0x01a3 }
            java.lang.String r6 = r6.dataDir     // Catch:{ all -> 0x01a3 }
            r4.<init>(r6)     // Catch:{ all -> 0x01a3 }
            java.lang.String r6 = "lib"
            r1.<init>(r4, r6)     // Catch:{ all -> 0x01a3 }
            boolean r4 = r1.exists()     // Catch:{ all -> 0x01a3 }
            if (r4 != 0) goto L_0x00f1
            bhs r1 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x01a3 }
            goto L_0x0173
        L_0x00f1:
            annj r4 = new annj     // Catch:{ all -> 0x01a3 }
            java.lang.String r6 = ".*\\.so$"
            r8 = 2
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r8)     // Catch:{ all -> 0x01a3 }
            r4.<init>(r6)     // Catch:{ all -> 0x01a3 }
            java.io.File[] r1 = r1.listFiles(r4)     // Catch:{ all -> 0x01a3 }
            if (r1 != 0) goto L_0x0105
            goto L_0x0171
        L_0x0105:
            int r4 = r1.length     // Catch:{ all -> 0x01a3 }
            if (r4 == 0) goto L_0x0171
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x016d }
            r1 = r1[r2]     // Catch:{ IOException -> 0x016d }
            r4.<init>(r1)     // Catch:{ IOException -> 0x016d }
            r1 = 20
            byte[] r6 = new byte[r1]     // Catch:{ all -> 0x0163 }
            int r9 = r4.read(r6)     // Catch:{ all -> 0x0163 }
            if (r9 != r1) goto L_0x015f
            byte[] r1 = new byte[r8]     // Catch:{ all -> 0x0163 }
            r1[r2] = r2     // Catch:{ all -> 0x0163 }
            r1[r3] = r2     // Catch:{ all -> 0x0163 }
            r9 = 5
            byte r9 = r6[r9]     // Catch:{ all -> 0x0163 }
            if (r9 == r8) goto L_0x0159
            r8 = 19
            byte r8 = r6[r8]     // Catch:{ all -> 0x0163 }
            r1[r2] = r8     // Catch:{ all -> 0x0163 }
            r2 = 18
            byte r2 = r6[r2]     // Catch:{ all -> 0x0163 }
            r1[r3] = r2     // Catch:{ all -> 0x0163 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ all -> 0x0163 }
            short r1 = r1.getShort()     // Catch:{ all -> 0x0163 }
            r2 = 3
            if (r1 == r2) goto L_0x0156
            r2 = 40
            if (r1 == r2) goto L_0x0153
            r2 = 62
            if (r1 == r2) goto L_0x0150
            r2 = 183(0xb7, float:2.56E-43)
            if (r1 == r2) goto L_0x014a
            bhs r1 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x0163 }
            goto L_0x014c
        L_0x014a:
            bhs r1 = defpackage.bhs.ARM64     // Catch:{ all -> 0x0163 }
        L_0x014c:
            r4.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x0173
        L_0x0150:
            bhs r1 = defpackage.bhs.X86_64     // Catch:{ all -> 0x0163 }
            goto L_0x014c
        L_0x0153:
            bhs r1 = defpackage.bhs.ARM7     // Catch:{ all -> 0x0163 }
            goto L_0x014c
        L_0x0156:
            bhs r1 = defpackage.bhs.X86     // Catch:{ all -> 0x0163 }
            goto L_0x014c
        L_0x0159:
            r12.a(r6)     // Catch:{ all -> 0x0163 }
            bhs r1 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x0163 }
            goto L_0x014c
        L_0x015f:
            r4.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x016e
        L_0x0163:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0168 }
            goto L_0x016c
        L_0x0168:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r2)     // Catch:{ IOException -> 0x016d }
        L_0x016c:
            throw r1     // Catch:{ IOException -> 0x016d }
        L_0x016d:
            r1 = move-exception
        L_0x016e:
            bhs r1 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x01a3 }
            goto L_0x0173
        L_0x0171:
            bhs r1 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x01a3 }
        L_0x0173:
            bhs r2 = defpackage.bhs.UNSUPPORTED     // Catch:{ all -> 0x01a3 }
            if (r1 == r2) goto L_0x0179
            r11 = r1
            goto L_0x017e
        L_0x0179:
            bhs r12 = r12.a()     // Catch:{ all -> 0x01a3 }
            r11 = r12
        L_0x017e:
            bgk r12 = new bgk     // Catch:{ all -> 0x01a3 }
            nps r8 = new nps     // Catch:{ all -> 0x01a3 }
            r8.<init>(r13, r11)     // Catch:{ all -> 0x01a3 }
            npx r9 = new npx     // Catch:{ all -> 0x01a3 }
            r9.<init>(r13, r5, r7)     // Catch:{ all -> 0x01a3 }
            r5 = r12
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01a3 }
            b = r12     // Catch:{ all -> 0x01a3 }
            java.util.concurrent.ExecutorService r12 = java.util.concurrent.Executors.newFixedThreadPool(r3)     // Catch:{ all -> 0x01a3 }
            c = r12     // Catch:{ all -> 0x01a3 }
            bgo r13 = new bgo     // Catch:{ all -> 0x01a3 }
            r13.<init>()     // Catch:{ all -> 0x01a3 }
            r12.execute(r13)     // Catch:{ all -> 0x01a3 }
            monitor-exit(r0)
            return
        L_0x01a1:
            monitor-exit(r0)
            return
        L_0x01a3:
            r12 = move-exception
            monitor-exit(r0)
            goto L_0x01a7
        L_0x01a6:
            throw r12
        L_0x01a7:
            goto L_0x01a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgq.a(java.lang.String, android.content.Context):void");
    }

    public static boolean a() {
        try {
            return ((Boolean) n.a.a()).booleanValue();
        } catch (IllegalStateException e2) {
            return false;
        }
    }

    public List a(bhm bhm, Context context, aucd aucd) {
        int b2 = bhm.b();
        ArrayList arrayList = new ArrayList();
        if (!bhm.o) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.a |= 524288;
            cVar.l = 16384;
            return arrayList;
        }
        bhm bhm2 = bhm;
        aucd aucd2 = aucd;
        arrayList.add(new com.google.android.ads.tasks.c(bhm2, "7WdUv5r1xtnlzOnbnvzYE0OJ2W+G3lTC5xO3YVjQSvitT1dV/7IttlZEOUgLqnIA", "3CzXZuXbsqJcOB6ad3TYrHaBfIcfUrYufubM9/PCPds=", aucd2, b2, context));
        arrayList.add(new f(bhm2, "OiqFnYACF+e8mXBdTPpn7mXxebRXY7n0h13dQ2BfpLnMU9gMSpoyb0AUskL+MdWd", "hKpT2oGIsms3RuhYSlv39WgS4F2I+5QxGkb1S7faZEg=", aucd2, h, b2));
        int i = b2;
        arrayList.add(new l(bhm2, "5qZjM5cdXA211ZsZl//6SITqHcTkOUj/0TjwkmAsT7QB9WIz9EVC7rmjaEZuSUdo", "/0Xi6V0lHBquQn7poTeaF6Cz28dbEBisQy4CYgTRCiw=", aucd2, i));
        arrayList.add(new o(bhm2, "Bqj8AaUs+XXUQ/fJg9TSbSr7wHuoQ2Mr1YRrNmoUU9Kop+NuUfMNvq+DiLZWJunC", "6roE7m8yyl4WIFFmY2P1k50TsUKjgeEBduKEiMaglzg=", aucd2, i));
        arrayList.add(new r(bhm2, "bbSz6G7VSZbKUTVPColqMAJJ3U77KfwHkQfG2pb7dRN4MrR15D0uvbtkqx6B7o0I", "syXS0rsAmjjVtaBgg7YySByLVdQ/CSyURLxOOOp00hI=", aucd2, i));
        arrayList.add(new b(bhm2, "GImTE8RQoKElWffJzPyzhZOO1nlsvi3a8XYeGKp5cHK3YdB/kUrIFPvi5By3sRH0", "cR8GSWax89kdMseZeSzcvyrdFN4dMhef3G2wwiBQ1Gg=", aucd2, i, context));
        arrayList.add(new d(bhm2, "zIhc3VOaS0iJjkras7etdFBYTTD0+RjMk/bIk9zW4gx5elfZ1CzfO3Sx220W3HSm", "4/ojDNrJd1IIw1U2Cw8OvBMxBGPeYz2mCYRWxBjjhgk=", aucd2, i));
        arrayList.add(new k(bhm2, "H1pNyi2v7oMk7ZTKWkUa1zsUe9NqOjSLl3hL4XBuZplSwxNut0kQX/lL5WgpQUUE", "8yXQPDS3Zhea+0P4TRWXj+RTGIuNnZbOSL6XS+NRSos=", aucd2, i));
        arrayList.add(new m(bhm2, "JgpzYyEkNRxbQ1XDaYXFbbYaqOmeXn0Eu+lWKldqFNVaVEymR62LxEYnz5dsY7Zt", "kETkDoDd3cGRZNowxs3HvLutbetsIO/NDzR3ktumT/E=", aucd2, i));
        arrayList.add(new e(bhm2, "4NlNDXh0vhplX1pxtRJNuDaRFyRXRIYAfUAgt3LhWX+qlMUWPVY6qPUWNzICmUf9", "GKZbJy8L8mTtgil8lqcm6pQKxf7+uOsP11sBPj3/KRM=", aucd2, i));
        arrayList.add(new h(bhm2, "Q95BMiTavmgEZeQ9UAsCrCvPUQ6S15gCGiZva0sLzpUyxZwO5Zgc8w+umxl6P9Uz", "GXtEzm7BCApWdSNDqdi3oVIgtnPxwG/Jp8ThLUrxkZk=", aucd2, i));
        arrayList.add(new s(bhm2, "KARH7PNAKJnhQhkb3hh7A2Hsr/Ffg+iY817ZbP4DQGvv91cYsdgmk8oyPMaNmNmH", "kT4zt3wtUzbzDbDvrwaF7aUvElNpTUsIiw2wEHl6BYk=", aucd2, i));
        arrayList.add(new a(bhm2, "fM1hHcsN+wpe9qkm+cKIAnV0vT2yNEfP9qlagtSAsHcx2fL19R9YqI6+7czpiaSu", "HpHXItY+bFA7nOKKcsqcE9lzKi53PeBBHwGBoL4HhB0=", aucd2, i));
        arrayList.add(new q(bhm2, "f2bUv3pdDVFYurKwkHQ3ebVtCP2MqFaVjILpowX0YwY4p5M3Pu4Cwy79d60SOxQT", "ari3DifUgqsBHSkmhZw7diugUGM0XTWCTqRLKMOp1aY=", aucd2, i));
        arrayList.add(new p(bhm2, "RWGql8WLEWXb63/89qRHlaw8dpZ0+zjUqlCxg+la48OoGQbM7USaDz72z5IYSUq7", "VZArCAfGcgAbMNsn5rZNpmIGkU1TobspLvxs6iQ/zTI=", aucd2, i));
        if (((Boolean) n.n.a()).booleanValue()) {
            arrayList.add(new j(bhm, "a8ABq7oQr/Ne7SuM3ioNlTJalMOA62VByojZJ6p9u9jYpJ4689hPu00mr/JBTI+A", "Ewtd0Pw/q7UKUD+agXI32J/BPRYCt41tfMibgnRNMGs=", aucd, b2));
        }
        if (((Boolean) n.l.a()).booleanValue()) {
            arrayList.add(new com.google.android.ads.tasks.n(bhm, "8hoh1KuN1xuWylF1MZUvq7mIp57IBFdZtXUTzHSvyuovsAzAI+9GRaXIDyiuVt93", "Kw8X8M2dFHr9U8GN/nNpnb7xMLMdlscTGfZwWaFJclw=", aucd, b2));
        }
        if (((Boolean) n.m.a()).booleanValue()) {
            arrayList.add(new i(bhm, "hcI7RIhuk+G3tv/7IL7BwjORzsYzl01y9hruqdkO1qs6uSjs+fbUcQVdE0TtvRmp", "oU/j/zbD28J631lK+1kuFj4WwAs9WUa031OYG6AXs0I=", aucd, b2));
        }
        return arrayList;
    }
}
