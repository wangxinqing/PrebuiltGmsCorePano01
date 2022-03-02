package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: akmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmn implements akmf {
    public static final Long a = Long.valueOf(((j.longValue() + k.longValue()) + l.longValue()) + k.longValue());
    private static final Long j = 1L;
    private static final Long k = 8L;
    private static final Long l = 4L;
    public int b;
    public long c = -1;
    public akmd d;
    public final akma e;
    public final Executor f;
    public final File g;
    public final akuo h;
    public final akmo i;
    private final akim m;

    public akmn(akuo akuo, akim akim, akmo akmo, akma akma, Executor executor, File file) {
        this.h = akuo;
        this.m = akim;
        this.i = akmo;
        this.e = akma;
        this.f = executor;
        this.g = new File(file, "simple_tensorflow_model_weights");
        this.b = -1;
        this.d = null;
    }

    public static Long a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e2) {
            aklz.a().b("Will never happen.");
            return 0L;
        }
    }

    public final void a(akmd akmd) {
        if (akmd != null) {
            this.d = akmd;
        }
    }

    public final void b() {
        this.b = -1;
        this.d = null;
    }

    public final void c() {
        if (this.b != 0) {
            aklz.a();
        } else if (System.currentTimeMillis() > this.c) {
            aklz.a();
            e();
        }
    }

    public final akmd d() {
        return this.d;
    }

    public final void e() {
        int i2;
        this.b = 2;
        akim akim = this.m;
        akmd akmd = this.d;
        if (akmd != null) {
            i2 = akmd.e;
        } else {
            i2 = 0;
        }
        aucd o = assn.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        assn assn = (assn) o.b;
        int i3 = assn.a | 1;
        assn.a = i3;
        assn.b = i2;
        int i4 = i3 | 8;
        assn.a = i4;
        assn.d = 6;
        assn.c = 2;
        assn.a = 2 | i4;
        assn[] assnArr = {(assn) o.i()};
        akmm akmm = new akmm(this, SystemClock.elapsedRealtime());
        if (azcf.a.a().u()) {
            if (!azda.e()) {
                akim.c.a(new aksl(akim.a, assnArr), new akik(akmm));
            } else {
                akim.c.a(new akto(akim.b, assnArr), new akil(akmm));
            }
        } else if (Log.isLoggable("Places", 5)) {
            alfy.c("Places", "Disabled getInferenceModelWeights - no RPC");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(akml akml) {
        ByteBuffer a2 = a(this.g.getPath(), this.g.length(), true);
        if (a2 == null || ((long) a2.remaining()) < a.longValue() || a2.get() != 4) {
            akml.a(1);
            return;
        }
        long j2 = a2.getLong();
        int i2 = a2.getInt();
        Long valueOf = Long.valueOf(a2.getLong());
        ByteBuffer slice = a2.slice();
        byte[] bArr = new byte[i2];
        slice.asReadOnlyBuffer().get(bArr, 0, i2);
        if (valueOf.equals(a(bArr))) {
            try {
                akmd akmd = new akmd(slice, akmo.a(akuo.d(), (Boolean) true));
                apxg apxg = akmd.g;
                if (apxg != null) {
                    if (apxg.P() != null && !akmd.a.isEmpty()) {
                        akml.a(akmd);
                        a(j2);
                    }
                }
                aklz.a().c("Invalid model weights, returning null model weights container");
                akmd = null;
                akml.a(akmd);
                a(j2);
            } catch (IndexOutOfBoundsException e2) {
                aklz.a().b("Flatbuffer Was corrupted while parsing.");
                akml.a(2);
            }
        } else {
            aklz.a().b("Flatbuffer Data is corrupted.");
            akml.a(1);
        }
    }

    private final void a(long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c = j2;
        long millis = TimeUnit.SECONDS.toMillis(azcf.b()) + currentTimeMillis;
        if (currentTimeMillis > j2 || millis < j2) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(akml akml) {
        FileInputStream fileInputStream;
        DataInputStream dataInputStream = null;
        try {
            fileInputStream = new FileInputStream(this.g);
            try {
                DataInputStream dataInputStream2 = new DataInputStream(fileInputStream);
                try {
                    if (dataInputStream2.readByte() == 3) {
                        long readLong = dataInputStream2.readLong();
                        int readInt = dataInputStream2.readInt();
                        ArrayList arrayList = new ArrayList(readInt);
                        int i2 = 0;
                        loop0:
                        while (true) {
                            if (i2 < readInt) {
                                int readInt2 = dataInputStream2.readInt();
                                byte[] bArr = new byte[readInt2];
                                int i3 = 0;
                                while (i3 < readInt2) {
                                    int read = dataInputStream2.read(bArr, i3, readInt2 - i3);
                                    if (read == -1) {
                                        akml.a(1);
                                        break loop0;
                                    }
                                    i3 += read;
                                }
                                arrayList.add(bArr);
                                i2++;
                            } else if (arrayList.size() == 1) {
                                aucd o = asve.g.o();
                                o.b((byte[]) arrayList.get(0));
                                asve asve = (asve) o.i();
                                if (asve.e == 6) {
                                    akml.a(akmo.a((auac[]) new asve[]{asve}, akuo.d()));
                                    a(readLong);
                                } else {
                                    throw new IOException("Wrong graphVersion");
                                }
                            } else {
                                throw new IOException("Unexpected proto");
                            }
                        }
                    } else {
                        akml.a(1);
                    }
                    a((Closeable) dataInputStream2);
                } catch (IOException | StringIndexOutOfBoundsException e2) {
                    dataInputStream = dataInputStream2;
                    try {
                        akml.a(1);
                        a((Closeable) dataInputStream);
                        a((Closeable) fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        a((Closeable) dataInputStream);
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    a((Closeable) dataInputStream);
                    a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException | StringIndexOutOfBoundsException e3) {
                akml.a(1);
                a((Closeable) dataInputStream);
                a((Closeable) fileInputStream);
            } catch (Throwable th3) {
                th = th3;
                a((Closeable) dataInputStream);
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (IOException | StringIndexOutOfBoundsException e4) {
            fileInputStream = null;
            akml.a(1);
            a((Closeable) dataInputStream);
            a((Closeable) fileInputStream);
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            a((Closeable) dataInputStream);
            a((Closeable) fileInputStream);
            throw th;
        }
        a((Closeable) fileInputStream);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x003b=Splitter:B:27:0x003b, B:33:0x004f=Splitter:B:33:0x004f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer a(java.lang.String r10, long r11, boolean r13) {
        /*
            r9 = this;
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0038, all -> 0x0034 }
            if (r13 != 0) goto L_0x0008
            java.lang.String r2 = "rw"
            goto L_0x000a
        L_0x0008:
            java.lang.String r2 = "r"
        L_0x000a:
            r1.<init>(r10, r2)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0038, all -> 0x0034 }
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0031, IOException -> 0x002e, all -> 0x002c }
            if (r13 != 0) goto L_0x0016
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ FileNotFoundException -> 0x002a, IOException -> 0x0028 }
            goto L_0x0018
        L_0x0016:
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ FileNotFoundException -> 0x002a, IOException -> 0x0028 }
        L_0x0018:
            r4 = r2
            r5 = 0
            r3 = r10
            r7 = r11
            java.nio.MappedByteBuffer r11 = r3.map(r4, r5, r7)     // Catch:{ FileNotFoundException -> 0x002a, IOException -> 0x0028 }
            a((java.io.Closeable) r10)
            a((java.io.Closeable) r1)
            return r11
        L_0x0028:
            r11 = move-exception
            goto L_0x003b
        L_0x002a:
            r11 = move-exception
            goto L_0x004f
        L_0x002c:
            r11 = move-exception
            goto L_0x005c
        L_0x002e:
            r10 = move-exception
            r10 = r0
            goto L_0x003b
        L_0x0031:
            r10 = move-exception
            r10 = r0
            goto L_0x004f
        L_0x0034:
            r10 = move-exception
            r11 = r10
            r1 = r0
            goto L_0x005c
        L_0x0038:
            r10 = move-exception
            r10 = r0
            r1 = r10
        L_0x003b:
            akma r11 = r9.e     // Catch:{ all -> 0x005a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005a }
            r12 = 2
            r11.a((int) r12, (boolean) r13, (long) r2)     // Catch:{ all -> 0x005a }
        L_0x0045:
            a((java.io.Closeable) r10)
            a((java.io.Closeable) r1)
            return r0
        L_0x004c:
            r10 = move-exception
            r10 = r0
            r1 = r10
        L_0x004f:
            akma r11 = r9.e     // Catch:{ all -> 0x005a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005a }
            r12 = 3
            r11.a((int) r12, (boolean) r13, (long) r2)     // Catch:{ all -> 0x005a }
            goto L_0x0045
        L_0x005a:
            r11 = move-exception
            r0 = r10
        L_0x005c:
            a((java.io.Closeable) r0)
            a((java.io.Closeable) r1)
            goto L_0x0064
        L_0x0063:
            throw r11
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akmn.a(java.lang.String, long, boolean):java.nio.ByteBuffer");
    }

    public final void a() {
        this.b = 0;
        if (!azbh.b()) {
            akml akml = new akml(this, -1);
            this.b = 1;
            this.f.execute(new akmi(this, akml));
            return;
        }
        a(new akml(this, -1));
    }

    public final void a(akml akml) {
        this.b = 1;
        this.f.execute(new akmk(this, akml));
    }

    public final void a(auac[] auacArr) {
        this.f.execute(new akmj(this, auacArr));
    }
}
