package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.SecretKey;

/* renamed from: aibh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibh {
    public static final aibg c = new aibf();
    public final File a;
    public volatile int b = -1;
    private final SecretKey d;
    private final aiab e;
    private final int f;
    private final int g;
    private final aqem h;
    private final aibg i;

    public aibh(int i2, SecretKey secretKey, int i3, byte[] bArr, aqem aqem, File file, aibg aibg) {
        this.h = aqem;
        this.a = file;
        this.f = i2;
        this.g = i3;
        this.d = secretKey;
        this.e = bArr != null ? aiab.a(bArr, (ajrh) null) : null;
        this.i = aibg;
    }

    public final aqek a() {
        DataInputStream dataInputStream;
        File file = this.a;
        if (file != null) {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStream inputStream = null;
            try {
                dataInputStream = new DataInputStream(fileInputStream);
                try {
                    this.b = dataInputStream.readUnsignedShort();
                    if (this.b != this.f) {
                        if (this.b != this.g) {
                            throw new IOException(String.format("Invalid version, desired = %d or %d, actual = %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.b)}));
                        }
                    }
                    if (this.b == this.f) {
                        inputStream = aian.a(new BufferedInputStream(dataInputStream), this.d);
                    } else {
                        aiab aiab = this.e;
                        if (aiab != null) {
                            byte[] bArr = aiab.a(dataInputStream).b;
                            if (bArr != null) {
                                inputStream = new ByteArrayInputStream(bArr);
                            } else {
                                throw new IOException("Could not decrypt");
                            }
                        } else {
                            throw new IOException("No cipher key specified.");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    ajre.a((Closeable) inputStream);
                    ajre.a((Closeable) dataInputStream);
                    throw th;
                }
                try {
                    aqek a2 = ajqx.a(inputStream, this.h);
                    if (this.i.a(a2)) {
                        ajre.a((Closeable) inputStream);
                        ajre.a((Closeable) dataInputStream);
                        return a2;
                    }
                    throw new IOException("Invalid file format.");
                } catch (Throwable th2) {
                    th = th2;
                    ajre.a((Closeable) inputStream);
                    ajre.a((Closeable) dataInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
                ajre.a((Closeable) inputStream);
                ajre.a((Closeable) dataInputStream);
                throw th;
            }
        } else {
            throw new IOException("file does not exist");
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("SimpleProtoBufStore loading ");
        sb.append(valueOf);
        sb.append(" from file ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final void a(aqek aqek) {
        File file = this.a;
        if (file != null) {
            if (!file.exists()) {
                this.a.createNewFile();
            }
            a(aqek, new FileOutputStream(this.a));
        }
    }

    public final void a(aqek aqek, OutputStream outputStream) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(outputStream);
            try {
                dataOutputStream.writeShort(this.g);
                if (this.e != null) {
                    this.e.a(dataOutputStream, aqek.b());
                    dataOutputStream.flush();
                    ajre.a((Closeable) dataOutputStream);
                    return;
                }
                throw new IOException("No cipher specified.");
            } catch (Exception e2) {
                File file = this.a;
                if (file != null) {
                    file.delete();
                }
                throw new IOException("Runtime while writing protobuf to bytes.");
            } catch (Throwable th) {
                th = th;
                ajre.a((Closeable) dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            ajre.a((Closeable) dataOutputStream);
            throw th;
        }
    }
}
