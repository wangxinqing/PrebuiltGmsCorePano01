package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: aatw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatw {
    public static final aatw a = new aatw();
    public final Object b = new Object();
    public final Queue c = new ConcurrentLinkedQueue();

    private aatw() {
    }

    public final aarw a(aarw aarw) {
        aucd a2 = aarw.b.a((aucj) aarw);
        aaru aaru = (aaru) this.c.poll();
        while (aaru != null) {
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            aarw aarw2 = (aarw) a2.b;
            aaru.getClass();
            if (!aarw2.a.a()) {
                aarw2.a = aucj.a(aarw2.a);
            }
            aarw2.a.add(aaru);
            aaru = (aaru) this.c.poll();
        }
        return (aarw) a2.i();
    }

    public final aarw a(byte[] bArr) {
        try {
            return (aarw) aucj.a((aucj) aarw.b, bArr);
        } catch (auda e) {
            return aarw.b;
        }
    }

    public final byte[] a(Context context) {
        File file = new File(String.valueOf(context.getApplicationInfo().dataDir).concat("/snet"), "cachedlogs");
        if (file.exists()) {
            try {
                return jjt.a(file);
            } finally {
                file.delete();
            }
        } else {
            throw new IOException();
        }
    }
}
