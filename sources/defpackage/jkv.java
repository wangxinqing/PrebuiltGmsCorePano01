package defpackage;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: jkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkv extends amvu {
    private final DataInputStream a;
    private final long b;
    private final Class c;
    private final auef d;
    private long e = 0;
    private byte[] f = new byte[1024];

    public jkv(FileInputStream fileInputStream, long j, Class cls, auef auef) {
        this.a = new DataInputStream(new BufferedInputStream(fileInputStream));
        this.b = j;
        this.c = cls;
        this.d = auef;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        audx audx;
        try {
            long j = this.e;
            long j2 = this.b;
            if (j < j2) {
                if (j2 >= 4) {
                    int readInt = this.a.readInt();
                    this.e += 4;
                    if (readInt >= 0) {
                        if (readInt <= ((Integer) iks.e.c()).intValue()) {
                            long j3 = (long) readInt;
                            if (this.e + j3 + 8 <= this.b) {
                                iva.b(true);
                                int length = this.f.length;
                                if (length < readInt) {
                                    while (length < readInt) {
                                        length += length;
                                    }
                                    this.f = new byte[length];
                                }
                                this.a.read(this.f, 0, readInt);
                                this.e += j3;
                                long readLong = this.a.readLong();
                                this.e += 8;
                                audx = jkw.a(this.f, 0, readInt, readLong) ? jkw.a(this.f, 0, readInt, this.c, this.d) : null;
                            }
                        }
                    }
                    Log.e("ProtoLiteUtils", String.format("Read bad message size: %d. (pos=%d, len=%d)", new Object[]{Integer.valueOf(readInt), Long.valueOf(this.e), Long.valueOf(this.b)}));
                    audx = null;
                } else {
                    Log.e("ProtoLiteUtils", "File too short to contain valid data");
                    audx = null;
                }
                if (audx != null) {
                    return audx;
                }
                Log.e("ProtoLiteUtils", "Failed to read a valid message from the file.");
            }
        } catch (IOException e2) {
            Log.e("ProtoLiteUtils", "Exception while reading from file.", e2);
        }
        d();
        return null;
    }
}
