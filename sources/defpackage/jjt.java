package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

@Deprecated
/* renamed from: jjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjt {
    @Deprecated
    public static long a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return a(inputStream, outputStream, z, 1024);
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static long a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    a((Closeable) inputStream);
                    a((Closeable) outputStream);
                }
                throw th;
            }
        }
        if (z) {
            a((Closeable) inputStream);
            a((Closeable) outputStream);
        }
        return j;
    }

    private static void b(InputStream inputStream, OutputStream outputStream) {
        iva.a((Object) inputStream);
        iva.a((Object) outputStream);
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    @Deprecated
    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static void a(InputStream inputStream, OutputStream outputStream) {
        a(inputStream, outputStream, false);
    }

    public static boolean a(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(new jjs(file).a);
            try {
                long size = fileInputStream.getChannel().size();
                if (size <= 2147483647L) {
                    if (size != 0) {
                        int i = (int) size;
                        bArr = new byte[i];
                        int i2 = i;
                        while (true) {
                            if (i2 > 0) {
                                int i3 = i - i2;
                                int read = fileInputStream.read(bArr, i3, i2);
                                if (read == -1) {
                                    bArr = Arrays.copyOf(bArr, i3);
                                    break;
                                }
                                i2 -= read;
                            } else {
                                int read2 = fileInputStream.read();
                                if (read2 != -1) {
                                    jjr jjr = new jjr();
                                    jjr.write(read2);
                                    b(fileInputStream, jjr);
                                    bArr = Arrays.copyOf(bArr, jjr.size() + i);
                                    jjr.a(bArr, i);
                                }
                            }
                        }
                    } else {
                        bArr = a((InputStream) fileInputStream);
                    }
                    a((Closeable) fileInputStream);
                    return bArr;
                }
                StringBuilder sb = new StringBuilder(68);
                sb.append("file is too large to fit in a byte array: ");
                sb.append(size);
                sb.append(" bytes");
                throw new OutOfMemoryError(sb.toString());
            } catch (Throwable th2) {
                th = th2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Deprecated
    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
