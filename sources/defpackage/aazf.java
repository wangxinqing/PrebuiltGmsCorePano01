package defpackage;

import com.android.volley.RequestQueue;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: aazf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazf {
    public final InternalApkUploadChimeraService a;
    public final File b;
    public final byte[] c;
    public final byte[] d;
    public final BlockingQueue e = new ArrayBlockingQueue(1);
    public volatile boolean f;
    public RequestQueue g;
    public String h;
    public int i;
    public InputStream j;
    public int k;
    public final int l;
    private byte[] m;

    public final void a() {
        InputStream inputStream = this.j;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.j = null;
            } catch (IOException e2) {
            }
        }
    }

    public final void b() {
        int i2;
        boolean z;
        new Object[1][0] = Integer.valueOf(this.k);
        int i3 = this.i - this.k;
        if (i3 <= 262144) {
            i2 = i3;
        } else {
            i2 = 262144;
        }
        if (i3 <= 262144) {
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = this.m;
        if (bArr == null || bArr.length != i2) {
            this.m = new byte[i2];
        }
        if (this.f) {
            this.e.add(0);
            return;
        }
        int i4 = this.k;
        try {
            aazz.a(this.m, this.j);
            this.k += this.m.length;
            if (this.f) {
                this.e.add(0);
            } else if (!this.a.b()) {
                abaa.b("Aborting upload: network state changed or service was disabled", new Object[0]);
                this.e.add(0);
            } else {
                this.g.add(new aazg(this.h, new aazd(this), new aaze(this, z), i4, this.m, z));
            }
        } catch (IOException | NullPointerException e2) {
            abaa.a(e2, "Error occurred while reading apk", new Object[0]);
            this.e.add(1);
        }
    }

    public aazf(InternalApkUploadChimeraService internalApkUploadChimeraService, File file, byte[] bArr, byte[] bArr2, int i2) {
        this.a = internalApkUploadChimeraService;
        this.b = file;
        this.c = (byte[]) iva.a((Object) bArr);
        this.d = (byte[]) iva.a((Object) bArr2);
        this.l = i2;
    }
}
