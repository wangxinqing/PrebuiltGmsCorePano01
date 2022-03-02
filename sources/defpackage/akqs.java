package defpackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: akqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqs implements Runnable {
    final /* synthetic */ akra a;

    public akqs(akra akra) {
        this.a = akra;
    }

    public final void run() {
        akra akra = this.a;
        int i = akra.a;
        if (i == 0) {
            if (akra.g == null) {
                akpz akpz = new akpz();
                long c = azbk.c();
                akra.g = new akkm(6, (int) c, new File(akra.d, "l1"), akpz, akra.f);
                int a2 = akra.g.a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("l1Storage start with ");
                sb.append(a2);
                sb.append(" keys");
                sb.toString();
            }
            if (akra.h == null) {
                akqa akqa = new akqa();
                long d = azbk.d();
                akra.h = new akkm(6, (int) d, new File(akra.d, "l2"), akqa, akra.f);
                int a3 = akra.h.a();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("l2Storage start with ");
                sb2.append(a3);
                sb2.append(" keys");
                sb2.toString();
            }
            akra.a = 1;
            long b = azbk.b();
            long j = -1;
            try {
                long j2 = akra.b;
                if (j2 == -1) {
                    FileInputStream fileInputStream = new FileInputStream(akra.c);
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    byte readByte = dataInputStream.readByte();
                    akra.b = dataInputStream.readLong();
                    dataInputStream.close();
                    fileInputStream.close();
                    if (readByte == 2) {
                        j2 = akra.b;
                    } else {
                        akra.b = -1;
                        throw new IOException("TTL file has wrong version");
                    }
                }
                j = System.currentTimeMillis() - j2;
            } catch (IOException e) {
            }
            if (j < 0) {
                akra.c();
            } else if (j > b) {
                StringBuilder sb3 = new StringBuilder(158);
                sb3.append("millisecondsSinceClear is ");
                sb3.append(j);
                sb3.append("; ttlMillis is ");
                sb3.append(b);
                sb3.append(". Cache data outdated, clearing nearbyAlertCache index, creating new ttl file");
                sb3.toString();
                akra.c();
            }
        } else {
            akra.a = i + 1;
        }
    }
}
