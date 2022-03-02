package defpackage;

import com.google.android.gms.leveldb.LevelDb;
import java.io.Closeable;
import java.util.NoSuchElementException;

/* renamed from: qgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgw implements Closeable {
    private final LevelDb.Iterator a;
    private boolean b = false;
    private boolean c = false;
    private byte[] d;
    private boolean e = false;
    private byte[] f;

    public qgw(LevelDb.Iterator iterator) {
        this.a = iterator;
    }

    public final synchronized byte[] a() {
        if (this.c) {
        } else {
            throw new NoSuchElementException("isValid must be called first");
        }
        return this.d;
    }

    public final synchronized byte[] b() {
        if (this.e) {
        } else {
            throw new NoSuchElementException("isValid must be called first");
        }
        return this.f;
    }

    public final synchronized void c() {
        this.c = false;
        this.e = false;
        if (!this.b) {
            this.a.seekToFirst();
        }
    }

    public final synchronized void close() {
        if (!this.b) {
            this.a.close();
            this.b = true;
        }
    }

    public final synchronized void d() {
        this.c = false;
        this.e = false;
        if (!this.b) {
            this.a.next();
        }
    }

    public final synchronized boolean e() {
        boolean z;
        if (!this.b) {
            z = this.a.isValid();
            if (z) {
                this.c = true;
                this.d = this.a.key();
                this.e = true;
                this.f = this.a.value();
            }
        } else {
            z = false;
        }
        return z;
    }
}
