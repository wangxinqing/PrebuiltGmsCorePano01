package defpackage;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: akra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akra implements akql {
    public int a = 0;
    public long b = -1;
    public final File c;
    public final File d;
    public final Executor e;
    public final akof f = new akof("Places", new akoz());
    public akkm g;
    public akkm h;
    private final Executor i;

    public akra(File file, Executor executor, Executor executor2) {
        this.d = file;
        this.i = executor;
        this.e = executor2;
        this.c = new File(file, "ttl2");
    }

    public final void a() {
        this.i.execute(new akqs(this));
    }

    public final void b() {
        this.i.execute(new akqt(this));
    }

    public final void c() {
        for (File file : this.d.listFiles()) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        akkm akkm = this.g;
        if (akkm != null && this.h != null) {
            akkm.c();
            this.h.c();
            this.b = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.c);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.write(2);
                dataOutputStream.writeLong(this.b);
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e2) {
                this.f.a("Failed to write TTL", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.g != null && this.h != null) {
            akof akof = this.f;
            StringBuilder sb = new StringBuilder(50);
            sb.append("internalFreeSpace invoked with reason: ");
            sb.append(i2);
            akof.a(sb.toString());
            akkp a2 = this.g.a((float) azbk.a.a().b());
            HashSet hashSet = new HashSet();
            for (List addAll : a2.b) {
                hashSet.addAll(addAll);
            }
            for (List removeAll : a2.a) {
                hashSet.removeAll(removeAll);
            }
            this.h.b(hashSet);
        }
    }

    public final void b(Map map) {
        this.i.execute(new akqv(this, map));
    }

    public final void a(Collection collection, akpw akpw) {
        this.i.execute(new akqw(this, collection, akpw));
    }

    public final void a(Collection collection, akqk akqk) {
        this.i.execute(new akqy(this, collection, akqk));
    }

    public final void a(Map map) {
        this.i.execute(new akqu(this, map));
    }
}
