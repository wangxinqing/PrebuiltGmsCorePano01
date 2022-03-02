package defpackage;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: ajcs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcs implements ahry {
    public long a = -1;
    public boolean b = false;
    public boolean c = false;
    public long d = 0;
    public final ajbd e;
    int f = 0;
    public int g = 0;
    public int h = 0;
    private boolean i = false;
    private ajcr j = ajcr.IDLE;
    private long k = -1;
    private List l = new ArrayList();
    private long m = 0;
    private ahtm n;
    private final ahxb o;
    private final ahxu p;
    private final File q;
    private final FileFilter r = new ajcq();

    public ajcs(ajbd ajbd, ahxb ahxb, File file, ahxu ahxu) {
        this.e = ajbd;
        this.o = ahxb;
        this.p = ahxu;
        this.q = file;
    }

    private final void a(long j2) {
        File[] listFiles;
        File[] listFiles2;
        if (j2 - this.m >= 3600000) {
            this.m = j2;
            File file = this.q;
            if (file != null && file.exists() && (listFiles = this.q.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.isDirectory()) {
                        long b2 = this.e.f().b();
                        if (!a(file2, b2)) {
                            if (file2 != null && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null) {
                                int length = listFiles2.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        if (a(listFiles2[i2], b2)) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        new Object[1][0] = file2.getPath();
                        ajre.a(file2);
                    }
                }
            }
        }
    }

    private final void b(long j2) {
        if (j2 != this.a) {
            String valueOf = String.valueOf(new Date(this.e.f().d() + j2));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Resetting alarm to: ");
            sb.append(valueOf);
            sb.toString();
            this.a = j2;
            this.e.k().a(ajbe.SENSOR_UPLOADER, this.a, (aizx) null);
        }
    }

    private final void c(long j2) {
        this.k = j2;
        long j3 = 7200000 + j2;
        this.o.a(this.e.f().d() + j2);
        String valueOf = String.valueOf(new Date(this.e.f().d() + j3));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("Next session upload attempt will be at: ");
        sb.append(j3);
        sb.append(" ");
        sb.append(valueOf);
        sb.toString();
    }

    private final void d() {
        ahtm ahtm = this.n;
        if (ahtm != null) {
            ahtm.b();
            this.n = null;
        }
        this.l.clear();
        if (this.i) {
            this.e.k().c(ajbe.SENSOR_UPLOADER);
            this.i = false;
        }
        this.j = ajcr.IDLE;
        b(0);
    }

    private final boolean e() {
        return this.q != null && this.b && this.p.i == 1;
    }

    private final boolean f() {
        return this.b && this.c;
    }

    public final void b() {
        if (e() && f() && this.j == ajcr.UPLOADING) {
            while (this.l.size() > 0) {
                List list = this.l;
                File file = (File) list.remove(list.size() - 1);
                if (ahuk.a.b(file)) {
                    String.valueOf(file.getAbsolutePath()).concat(" locked.");
                } else {
                    String valueOf = String.valueOf(file.getName());
                    if (valueOf.length() == 0) {
                        new String("Handling session: ");
                    } else {
                        "Handling session: ".concat(valueOf);
                    }
                    ahtm a2 = this.e.p().a(file.getAbsolutePath(), this, "SensorUploader");
                    this.n = a2;
                    if (a2 != null) {
                        a2.a();
                        return;
                    }
                }
            }
        }
        d();
    }

    public final void c() {
        boolean e2 = e();
        boolean f2 = f();
        if (!e2 || !f2) {
            String c2 = this.p.c();
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 38);
            sb.append("Aborting upload. wifiConnected: ");
            sb.append(f2);
            sb.append(" ");
            sb.append(c2);
            sb.toString();
            d();
        }
    }

    private static final boolean a(File file, long j2) {
        long lastModified = file.lastModified();
        long j3 = j2 - lastModified;
        if (j3 > 604800000 || lastModified > j2 + 3600000) {
            return true;
        }
        if (!file.getName().equals(".lck") || j3 <= 3600000) {
            return false;
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Found old lock file in directory. Age = ");
        sb.append(j3);
        sb.toString();
        return true;
    }

    public final void a() {
        File[] listFiles;
        File[] listFiles2;
        boolean z;
        if (this.p.h) {
            boolean z2 = false;
            do {
                ajcr ajcr = this.j;
                ajcr ajcr2 = ajcr.IDLE;
                int ordinal = ajcr.ordinal();
                if (ordinal == 0) {
                    long c2 = this.e.f().c();
                    long j2 = this.k + 7200000;
                    if (e() && c2 >= j2) {
                        File file = this.q;
                        if (file != null && file.exists() && (listFiles = this.q.listFiles()) != null) {
                            int length = listFiles.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                File file2 = listFiles[i2];
                                if (file2 == null || !file2.isDirectory()) {
                                    i2++;
                                } else if (c2 - this.d < 5000) {
                                    b(5000 + c2);
                                } else {
                                    if (!this.i) {
                                        this.e.k().b(ajbe.SENSOR_UPLOADER, 60000, (aizx) null);
                                        if (!this.c) {
                                            boolean c3 = this.e.n().c();
                                            StringBuilder sb = new StringBuilder(20);
                                            sb.append("Wifi reconnect ");
                                            sb.append(c3);
                                            sb.toString();
                                        }
                                        this.i = true;
                                    }
                                    this.j = ajcr.WIFI_WAIT;
                                    c(this.e.f().c());
                                    z2 = true;
                                }
                            }
                        }
                        c(c2);
                        z2 = true;
                    } else if (j2 <= c2) {
                        long j3 = this.a;
                        if (j3 == -1 || j3 < c2) {
                            b(7200000 + c2);
                        }
                    } else {
                        b(j2);
                    }
                    a(c2);
                    z2 = false;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        long j4 = this.k + 1200000;
                        if (this.e.f().c() >= j4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean e2 = e();
                        boolean f2 = f();
                        if (!z && e2 && f2) {
                            b(j4);
                            z2 = false;
                        } else {
                            StringBuilder sb2 = new StringBuilder(75);
                            sb2.append("Canceling upload. timeout: ");
                            sb2.append(z);
                            sb2.append(" goodConditions: ");
                            sb2.append(e2);
                            sb2.append(" wifiConnected: ");
                            sb2.append(f2);
                            sb2.toString();
                            d();
                            z2 = true;
                        }
                    }
                } else if (!e()) {
                    String valueOf = String.valueOf(this.p.c());
                    if (valueOf.length() == 0) {
                        new String("Conditions not good for collection. ");
                    } else {
                        "Conditions not good for collection. ".concat(valueOf);
                    }
                    d();
                    z2 = true;
                } else {
                    long c4 = this.e.f().c();
                    long j5 = this.k + 15000;
                    if (c4 < j5) {
                        b(j5);
                        z2 = false;
                    } else if (f()) {
                        this.j = ajcr.UPLOADING;
                        this.l = new ArrayList();
                        File file3 = this.q;
                        if (file3 != null) {
                            File[] listFiles3 = file3.listFiles();
                            if (listFiles3 != null) {
                                for (File file4 : listFiles3) {
                                    if (file4 != null && file4.isDirectory()) {
                                        if (file4 != null && file4.isDirectory() && (listFiles2 = file4.listFiles(this.r)) != null && listFiles2.length > 20) {
                                            new Object[1][0] = file4.getPath();
                                            ajre.a(file4);
                                        } else {
                                            this.l.add(file4);
                                        }
                                    }
                                }
                            }
                            b();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        d();
                        z2 = true;
                    }
                }
                ajcr ajcr3 = this.j;
                if (ajcr != ajcr3) {
                    Object[] objArr = {ajcr, ajcr3};
                    continue;
                }
            } while (z2);
        } else if (this.j != ajcr.IDLE) {
            String valueOf2 = String.valueOf(this.p.c());
            if (valueOf2.length() == 0) {
                new String("Can't schedule due to sensorCollectionPolicy. Returning to idle ");
            } else {
                "Can't schedule due to sensorCollectionPolicy. Returning to idle ".concat(valueOf2);
            }
            d();
        } else {
            a(this.e.f().c());
        }
    }

    public final void a(String str) {
        File file;
        FileWriter fileWriter;
        if (aydu.a.a().enableTestLogSensorIds() && (file = this.q) != null) {
            try {
                File file2 = new File(file, "session_ids.txt");
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                String absolutePath = file2.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(absolutePath).length());
                sb.append("Writing session id ");
                sb.append(str);
                sb.append(" to ");
                sb.append(absolutePath);
                sb.toString();
                fileWriter = new FileWriter(file2, true);
                fileWriter.append(str).append(10);
                fileWriter.close();
            } catch (IOException e2) {
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        this.f++;
        b();
        return;
        throw th;
    }
}
